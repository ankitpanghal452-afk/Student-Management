
package com.devops.student;

public class App {

    public String getWelcomeMessage() {
        return "Student Management CI Application is running!";
    }

    public int calculateTotalMarks(int java, int cloud, int devops) {
        if (java < 0 || cloud < 0 || devops < 0 ||
            java > 100 || cloud > 100 || devops > 100) {
            throw new IllegalArgumentException(
                "Marks must be between 0 and 100."
            );
        }

        return java + cloud + devops;
    }

    public double calculatePercentage(int totalMarks) {
        if (totalMarks < 0 || totalMarks > 300) {
            throw new IllegalArgumentException(
                "Total marks must be between 0 and 300."
            );
        }

        return totalMarks / 3.0;
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println(app.getWelcomeMessage());
        System.out.println("Total Marks: " +
            app.calculateTotalMarks(85, 90, 88));
        System.out.println("Percentage: " +
            app.calculatePercentage(263) + "%");
    }
}
