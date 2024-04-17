import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Vali v = (Vali) new Validate();
        Scanner sc = new Scanner(System.in);

        List<Student> list = new ArrayList<>();
        list.add(new Student("ms1", "Nguyen van a", "tri.gmail.com",9.7));
        list.add(new Student("ms1", "Nguyen van b", "tri.gmail.com",9.0));
        list.add(new Student("ms1", "Nguyen van c", "tri.gmail.com",9.2));
        list.add(new Student("ms1", "Nguyen van d", "tri.gmail.com",2.7));
        list.add(new Student("ms1", "Nguyen van e", "tri.gmail.com",3.7));

        while (true) {
            int index = 0;
            int choice = 0;
            System.out.println("input choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    v.add(list);
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên sau khi thêm: ");
                    v.display(list);
                    break;
                case 3:
                    System.out.println("Nhập phần tử cần xóa: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.remove(list,index);
                    break;
                case 4:
                    System.out.println("Nhập phần tử sữa trong mảng: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.edit(list,index);
                    break;
                case 5:
                    System.out.println("danh sach gpa > 8:");
                    v.gpamax(list);

            }
        }

    }
}
