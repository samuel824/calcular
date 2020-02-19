package calcular;

import javax.swing.JOptionPane;


public class Calcular{

    public static void main(String[] args) {
        String firstnumber = 
              JOptionPane.showInputDialog("Digite um numero");
        System.out.println("Escolha a op. desejada: ");
        String mult="*";
        String divi="/";
        String som="+";
        String sub="-";
        int resp = 0;
        String secondtnumber = 
              JOptionPane.showInputDialog("Digite o segundo numero");
         int number1= Integer.parseInt(firstnumber);
         int number2= Integer.parseInt(secondtnumber);
        String op = 
              JOptionPane.showInputDialog("Escolha a operação");
      
        
        
         if(op.equals("+")){
              resp= number1+ number2;
             
         }else{
             if(op.equals("-")){
               resp = number1- number2;
             }else{
                if(op.equals("*")){
                   resp = number1*number2;
                }else{
                     if(op.equals("/")){
                        resp = number1/number2;
                     }else{
                         JOptionPane.showMessageDialog(null,"Operação invalida","",+ JOptionPane.PLAIN_MESSAGE);
                     }
                }
                
             }
             
         }
         JOptionPane.showMessageDialog(null,"o resultado é   ="+resp+"     ", "", JOptionPane.PLAIN_MESSAGE);
    }
    
}

