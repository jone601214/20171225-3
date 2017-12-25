import java.util.Scanner;

public class ｈｗ３ {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][]data=new int[2][n];
        for (int i=0;i<n;i++){
            data[0][i]=scn.nextInt();
            data[1][i]=fun(data[0][i]);
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (data[1][i]>data[i][j]){
                    int a=data[1][j];
                    data[1][i]=data[1][j];
                    data[1][j]=a;
                    a=data[0][i];
                    data[0][i]=data[0][j];
                    data[0][j]=a;
                }else if (data[1][i]==data[1][j]){
                    if (data[0][i]>data[0][j]){
                    }
                }
            }
        }
    }
    public static int fun(int x){
        int sum=0;
        while (x>0){
            sum=sum+x%10;
            x=x%10;
        }
        return sum;
    }
}
//各位數和排序修改中