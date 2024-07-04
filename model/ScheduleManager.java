package org.example.model;

import java.util.HashMap;
import java.util.Map;

public class ScheduleManager {
    private Map<String, Class> classSchedule; // Using HashMap to store classes

    public ScheduleManager() {
        this.classSchedule = new HashMap<>();
    }

    // Add a class to the schedule
    public void addClass(Class newClass) {
        String classId = newClass.getId();

        // Check for conflicts
        if (hasConflict(newClass)) {
            System.out.println("Conflict detected for class: " + classId);
            return;
        }

        // Add class to schedule if no conflict
        classSchedule.put(classId, newClass);
        System.out.println("Class added to schedule: " + classId);
    }

    // Check for conflicts with existing classes
    private boolean hasConflict(Class newClass) {
        for (Class existingClass : classSchedule.values()) {
            if (newClass.getStartTime() < existingClass.getEndTime() &&
                    newClass.getEndTime() > existingClass.getStartTime()) {
                return true; // Conflict found
            }
        }
        return false; // No conflict

        /*
         public static void main(String[] args) {
        ScheduleManager scheduleManager = new ScheduleManager();

        // Adding some classes to the schedule
        scheduleManager.addClass(new Class("C1", 9, 11));
        scheduleManager.addClass(new Class("C2", 10, 12)); // Conflict with C1
        scheduleManager.addClass(new Class("C3", 13, 15));

        // Print the final schedule
        System.out.println("Final Schedule:");
        for (Class scheduledClass : scheduleManager.classSchedule.values()) {
            System.out.println("Class: " + scheduledClass.getId() +
                    ", Start Time: " + scheduledClass.getStartTime() +
                    ", End Time: " + scheduledClass.getEndTime());
        }
    }
}
         */
    }
}
