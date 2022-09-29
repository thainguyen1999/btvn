package btvn_b10;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5};
        News a = new News(1, "thuy", "2/1/2020", "Thuy", "asdf");
        a.AverageRate= a.Calculate(arr[0],
                arr[1],
                arr[2]);
        a.display();
    }
}
