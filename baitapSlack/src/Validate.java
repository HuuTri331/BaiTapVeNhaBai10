import java.util.List;
import java.util.Scanner;

public class Validate implements Vali {


    @Override
    public void add(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id: ");
        String id = sc.nextLine();
        System.out.println("nhập name: ");
        String name = sc.nextLine();
        System.out.println("nhập email: ");
        String email = sc.nextLine();
        System.out.println("nhập gpa: ");
        Double gpa = sc.nextDouble();

        Student s = new Student(id, name, email,gpa);
        list.add(s);
    }

    @Override
    public void display(List<Student> list) {
        for(Student o : list) {
            System.out.println(o);
        }
    }


    @Override
    public void remove(List<Student> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j == i) {
                list.remove(j);
                break;
            }
        }
    }
    @Override
    public void edit(List<Student> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j == i) {
                Scanner sc = new Scanner(System.in);
                System.out.println("input id: ");
                String id = sc.nextLine();
                System.out.println("input name: ");
                String name = sc.nextLine();
                System.out.println("input email: ");
                String email = sc.nextLine();
                System.out.println("input email: ");
                Double gpa = sc.nextDouble();

                list.get(j).setId(id);
                list.get(j).setName(name);
                list.get(j).setEmail(email);
                list.get(j).setGpa(gpa);
                break;
            }
        }
    }

    @Override
    public void gpamax(List<Student> list){
        for(Student o : list) {
            if (o.getGpa() >= 8) {
                System.out.println(o);
            }
        }
    }
}

