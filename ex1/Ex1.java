/**
 * @author Branium Academy
 * <a href="https://braniumacademy.net">Trang chủ</a>
 * @version 2023.05
 */
 
public class Ex1 {
    public static void main(String[] args) {
        Employee nam = new Employee(); // tạo đối tượng của lớp Employee
        nam.fullName = "Trần Hoàng Nam"; // gán tên
        nam.address = "Hà Nội"; // gán địa chỉ
        nam.age = 25; // gán tuổi
        nam.receiveSalary(30000); // nhận lương
        nam.relax(); // Nam đang nghỉ ngơi
        nam.travel("Nam cực"); // Nam đi nam cực ngắm cá voi chẳng hạn
        // bạn có thể tự thêm các hành động khác ở đây
    }
}
