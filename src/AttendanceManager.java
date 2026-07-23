import java.util.ArrayList;

public class AttendanceManager implements Manage<Student> {
    private ArrayList<Student> students = new ArrayList<>();

    public void add(Student item){
        students.add(item);
        System.out.println("Sinh viên được thêm thành công.");
    }
    public void update(int index,Student item){
        if (index >=0 && index <students.size()){
            students.set(index,item);

            System.out.println("Cập nhật thành công.");
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }
    }
    public void delete(int index){

        if (index >= 0 && index < students.size()) {
            students.remove(index);
            System.out.println("Xóa thành công.");
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }
    }


    public void display() {

        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }

        System.out.println("===== DANH SÁCH SINH VIÊN =====");

        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    public int size() {
        return students.size();
    }
}
