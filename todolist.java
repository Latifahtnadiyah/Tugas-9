import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TodoList {

    public static void main(String[] args) {
        Queue<String> todoList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan aktivitas ke dalam todoList
        todoList.offer("Bangun Tidur");
        todoList.offer("Sholat Subuh");
        todoList.offer("Membereskan Rumah");
        todoList.offer("Mandi");
        todoList.offer("Sarapan");
        todoList.offer("Kuliah");
        todoList.offer("Makan siang");
        todoList.offer("Sholat Zuhur");
        todoList.offer("Tidur Siang");
        todoList.offer("Sholat Ashar");
        todoList.offer("Quality Time bersama keluarga");
        todoList.offer("Sholat Magrib");
        todoList.offer("Mengaji");
        todoList.offer("Makan Malam");
        todoList.offer("Sholat Isya");
        todoList.offer("Belajar");
        todoList.offer("Tidur");

        // Menampilkan isi dari todoList
        System.out.println("Todo List rutinitas kegiatan sehari-hari:");
        for (String activity : todoList) {
            System.out.println(activity);
        }

        // Menghapus aktivitas dari todoList
        System.out.println("\nKetik 'selesai' untuk menghapus aktivitas yang sudah selesai dilakukan.");
        while (!todoList.isEmpty()) {
            System.out.println("\nAktivitas selanjutnya: " + todoList.peek());
            System.out.print("Apakah aktivitas ini sudah selesai dilakukan? (y/n): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                String doneActivity = todoList.poll();
                System.out.println(doneActivity + " sudah selesai dilakukan.");
            } else if (answer.equalsIgnoreCase("n")) {
                System.out.println(todoList.peek() + " akan dilakukan selanjutnya.");
            } else {
                System.out.println("Masukan tidak valid, ulangi lagi.");
            }
        }

        System.out.println("\nSemua aktivitas selesai dilakukan.");
    }
}