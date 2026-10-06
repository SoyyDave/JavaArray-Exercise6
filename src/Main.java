import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array; //Declaración
        array=new int[10]; //Instanciación
        System.out.println("Introduce 10 valores Enteros");
        for(int i = 0; i < array.length; i++){
            array[i]=input.nextInt();

              //Invertir el array
            for(int i=0 ; i< array.length /2 ; i ++) {
                temp =array[i];
                array[i]=array[array.length -1 - i];
                array[array.length - 1 -i] =temp;

            }
            for(int i = 0 ; i< array.length; i++);{
                System.out.println("Elementos at index" + i + " = " + array[i]);
            }
        }
    }
}