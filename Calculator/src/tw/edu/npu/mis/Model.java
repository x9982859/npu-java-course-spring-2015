/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 *
 * @author Ying Sheng
 */
public class Model extends java.util.Observable{
    private String Num1 = "", Num2 = "", cou = "",Mnum="0";
    
   
    
    public void appendDigit(int digit) {
        // TODO code application logic here
        Num1 += String.valueOf(digit);
        getDisplay();
        
    }
    
    public void appendDot() {
        // TODO code application logic here
        getDisplay();
        
    }
     public void count(String Str){
     switch(Str){
            case "+":
                 compute();
                if(!Num1.equals(""))Num2 = Num1;
                Num1 = "";
                cou = "+";
                break;
            case "-":
                   compute();
                if(!Num1.equals(""))Num2 = Num1;
                Num1 = "";
                cou = "-";
                break;
            case "*":
                   compute();
                if(!Num1.equals(""))Num2 = Num1;
                Num1 = "";
                cou = "*";
                break;
            case "/":
                   compute();
                if(!Num1.equals(""))Num2 = Num1;
                Num1 = "";
                cou = "/";
                break;
            case "=":
                 compute();
                Num2 = "";
                break;
            case "C":
                cou = "";
                Num1="";
                Num2="";
                break;
            case "1/x":
                 if(Double.valueOf(Num1)!=0);
                 Num1=String.valueOf(1/Double.valueOf(Num1));
                break;
            case "±":
                     if(Double.valueOf(Num1)!=0);
                    Num1=String.valueOf(0-(Double.valueOf(Num1)));
                     if(Num1.length() > 0)if(Num1.substring(Num1.length()-2, Num1.length()).equals(".0"))Num1 = Num1.substring(0, Num1.length()-2);
                break;
            case "√":
                 if(Double.valueOf(Num1)>0);
                    Num1=String.valueOf(Math.sqrt(Double.valueOf(Num1)));
                    if(Num1.length() > 0)if(Num1.substring(Num1.length()-2, Num1.length()).equals(".0"))Num1 = Num1.substring(0, Num1.length()-2);
                break;
            case "←":
                 if(Num1.length()>0)
                     Num1=Num1.substring(0, Num1.length()-1);
                break;
            case "%":
                      if(Double.valueOf(Num1)!=0);
                 Num1=String.valueOf(Double.valueOf(Num1)/100);
                break;
            case"CE":
                Num1="";
                break;
            case"M+":
                if(!Num1.equals(""))
                Mnum= String.valueOf(Double.valueOf(Num1) + Double.valueOf(Mnum));
                break;
            case"M-":
                 if(!Num1.equals(""))
                 Mnum= String.valueOf(Double.valueOf(Mnum) - Double.valueOf(Num1));
                break;
            case"MR":
                 Num1=String.valueOf(Double.valueOf(Mnum));
                 if(Num1.length() > 0)if(Num1.substring(Num1.length()-2, Num1.length()).equals(".0"))Num1 = Num1.substring(0, Num1.length()-2);
                break;
            case"MC":
                 Mnum="0";
                break;
            case"MS":
                 Mnum=String.valueOf(Double.valueOf(Num1));
                break;  
            default:
                   Num1 +=Str;
     }
     
            getDisplay();
     }
    
    
    public void  compute()
    {
        if(Num1.equals("") || Num2.equals(""))return;
        switch(cou)
        {
            case "":
                return;
            case "+":
                Num1 = String.valueOf(Double.valueOf(Num2) + Double.valueOf(Num1));
                break;
            case "-":
                Num1 = String.valueOf(Double.valueOf(Num2) - Double.valueOf(Num1));
                break;
            case "*":
                Num1 = String.valueOf(Double.valueOf(Num2) * Double.valueOf(Num1));
                break;
            case "/":
                Num1 = String.valueOf(Double.valueOf(Num2) / Double.valueOf(Num1));
                break;
        }
        if(Num1.substring(Num1.length()-2, Num1.length()).equals(".0")) Num1 = Num1.replace(".0", "");
        
    }

    public void getDisplay() {
        // TODO code application logic here
        setChanged();
        if(Num1.equals(""))notifyObservers(Num2);
        else notifyObservers(Num1);
    }
    
 
}
