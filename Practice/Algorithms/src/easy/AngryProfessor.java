package easy;

public class AngryProfessor {
    static String angryProfessor(int k, int[] a) {
        int studentsLate = 0;
        for (int arrivalTime : a) {
            if (arrivalTime > 0) {
                studentsLate++;
            }
        }

        return (a.length - studentsLate < k) ? "YES" : "NO";
    }
}
