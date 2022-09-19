import java.util.Scanner;

class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = (a + b + c) / 3;
        System.out.println(data);
        System.out.println(ans);

    }
}