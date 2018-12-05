package by.epam.javaweb;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task {
    public static void main(String[] args) {
        Task task=new Task();
        task.getMyInfo();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter 2 cathetus");
            int a=Integer.parseInt(reader.readLine());
            int b=Integer.parseInt(reader.readLine());
            task.findHip(a,b);
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            System.out.println("Enter the number");
            int k=Integer.parseInt(reader.readLine());
            task.findSumOfK(k);
        }catch(Exception e){
            e.printStackTrace();
        }
        task.methodsOfString();
        try{
            System.out.println("Enter the dimension of array ");
            int n=Integer.parseInt(reader.readLine());
            int arr[]=new int[n];
            for(int i=0; i<n; i++){
                System.out.print("Enter elemen: ");
                arr[i]=Integer.parseInt(reader.readLine());
            }
            task.isSequence(arr);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void getMyInfo(){
        System.out.println("Грицук Дмитрий Викторович");
        System.out.println("просп. Газеты Звезда, д.23");
        System.out.println("+375297208423");
    }
    public void findHip(int a, int b){
        System.out.print("3rd side is ");
        double c=Math.sqrt(a*a+b*b);
        System.out.println(c);
        System.out.println("Square of triangle is "+(a*b/2));
    }
    public void findSumOfK(int k){
        int arr[]=new int[]{1,2,3,4,5,0,23,15,65,43,11};
        int sum=0;
        for(int i:arr)
            if(i%k==0)
                sum+=i;
        System.out.println("Sum is "+sum);
    }
    public void methodsOfString(){
        String str="Dima Gritsuk";
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('G'));
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(1,5));
        System.out.println(str.replaceAll("Dima","Vasya"));
    }
    public void isSequence(int[]arr) {
        for (int i = 1; i < arr.length ; i++)
            if (arr[i - 1] > arr[i]) {
                System.out.println("Is not increasing");
                return;
            }
        System.out.println("Is increasing");
    }
}