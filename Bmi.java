package example.bmi;

public class Bmi {
	
	
	private int id;
    private String name;
    private int yob;
    private int height;
    private int weight;
    private double bmi;
    private String category;

    public Bmi(int id, String name, int yob, int height, int weight) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.height = height;
        this.weight = weight;
        calculateBMI();
        determineCategory();
    }

    private void calculateBMI() {
        double heightInMeters = height / 100.0; // Convert height to meters
        this.bmi = weight / (heightInMeters * heightInMeters);
    }

    private void determineCategory() {
        if (bmi < 16) {
            category = "Severe undernourishment";
        } else if (bmi >= 16 && bmi < 16.9) {
            category = "Medium undernourishment";
        } else if (bmi >= 17 && bmi < 18.4) {
            category = "Slight undernourishment";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "Normal nutrition state";
        } else if (bmi >= 25 && bmi < 29.9) {
            category = "Overweight";
        } else if (bmi >= 30 && bmi < 30.9) {
            category = "Obesity";
        } else {
            category = "Pathological obesity";
        }
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", BMI: " + bmi + ", Category: " + category);
    }

    // Getters and setters for properties
    public int getId() {
        return id;
    }
}
