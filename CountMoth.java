import java.util.Scanner;

public class CountMoth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tháng nào bạn muốn đếm ngày:");
        int month = input.nextInt();
        String dayInMonth;

        switch (month) {
            case 2:
                dayInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30";
                break;
            default:
                dayInMonth = "";
                break;
        }
        if (dayInMonth != "")
            System.out.println("Tháng " + month + " có " + dayInMonth + " ngày");
        else
            System.out.println("Nhập sai tháng");

    }
}
