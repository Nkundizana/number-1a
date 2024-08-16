/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this lice * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class lectureRoom {
    private int numberOfStudents;
    private boolean[] lights;

    public lectureRoom() {
        this.numberOfStudents = 0;
        this.lights = new boolean[3]; // Three lights, all initially off (false)
    }

    public void addStudents(int count) {
        this.numberOfStudents += count;
        System.out.println(count + " students added. Total students: " + this.numberOfStudents);
    }

    public void removeStudents(int count) {
        if (this.numberOfStudents - count < 0) {
            this.numberOfStudents = 0;
        } else {
            this.numberOfStudents -= count;
        }
        System.out.println(count + " students removed. Total students: " + this.numberOfStudents);
    }

    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            this.lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " turned on.");
        } else {
            System.out.println("Invalid light number. Please choose 1, 2, or 3.");
        }
    }

    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            this.lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " turned off.");
        } else {
            System.out.println("Invalid light number. Please choose 1, 2, or 3.");
        }
    }

    public void displayStatus() {
        System.out.println("Lecture Room Status:");
        System.out.println("Total students: " + this.numberOfStudents);
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + " is " + (lights[i] ? "On" : "Off"));
        }
    }
}

    

