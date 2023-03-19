import java.util.Scanner;
public class HocSinh {

        public String hoTen;
    public String lop;
    public double toan;
    public double ly;
    public double hoa;

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public double getToan() {
        return toan;
    }
    public void setToan(double toan) {
        this.toan = toan;
    }
    public double getLy() {
        return ly;
    }
    public void setLy(double ly) {
        this.ly = ly;
    }
    public double getHoa() {
        return hoa;
    }
    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
     public double diemTB(){
        double diemTB = (toan+ ly+ hoa)/3;
        return diemTB;
     }
      public class HocSinhChuyenToan extends HocSinh{
        @Override
        public double diemTB(){
            double diemTB = (toan*2 + ly + hoa)/4;
            return diemTB;
        }
    }
}
public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên học sinh: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhập lớp: ");
        String lop = sc.nextLine();

        System.out.print("Nhập điểm toán: ");
        double toan = sc.nextDouble();

        System.out.print("Nhập điểm lý: ");
        double ly = sc.nextDouble();

        System.out.print("Nhập điểm hóa: ");
        double hoa = sc.nextDouble();
    }
    
}
