import java.util.Scanner;

class Student {
    private String name;
    private int academicScore;

    public Student(String name, int academicScore) {
        this.name = name;
        this.academicScore = academicScore;
    }

    public void displayAcademicScore() {
        System.out.println("Academic Score of " + name + ": " + academicScore);
    }
}

class Sports {
    private int sportsScore;

    public Sports(int sportsScore) {
        this.sportsScore = sportsScore;
    }

    public void displaySportsScore() {
        System.out.println("Sports Score: " + sportsScore);
    }
}

class Result extends Student {
    private Sports sports;

    public Result(String name, int academicScore, int sportsScore) {
        super(name, academicScore);
        this.sports = new Sports(sportsScore);
    }

    public void displayScores() {
        displayAcademicScore();
        sports.displaySportsScore();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter academic score: ");
        int academicScore = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter sports score: ");
        int sportsScore = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Result result = new Result(name, academicScore, sportsScore);
        System.out.println("\nStudent Result:");
        result.displayScores();
    }
}

