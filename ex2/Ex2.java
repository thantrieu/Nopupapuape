/**
 * @author Branium Academy
 * <a href="https://braniumacademy.net">Trang chủ</a>
 * @version 2023.05
 */

public class Ex2 {
    public static void main(String[] args) {
        Address myAddress = new Address();
        myAddress.city = "Hà Nội";
        myAddress.district = "Cầu Giấy";
        myAddress.number = "124B";
        myAddress.lane = "168";

        System.out.println("Địa chỉ của tôi là: " + myAddress.fullAddress());
    }
}
