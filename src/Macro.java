/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SISTEMAS
 */
public class Macro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Range("B3").FormulaLocal = "=BUSCARV($C$1,'1'!$A$7:$G$415,2,FALSO)"
        String[][] columnas ={{"","","","",""},{"","B","C","D","G"},{"","I","J","K","N"},{"","P","Q","R","U"}};
        String [] referencias={"C1","J1","U1","",""};
        
        int valores[]={0,2,3,4,7};
        int i=3;
        int j=1;
        int k=1;
        do{
        StringBuilder formula=new StringBuilder();
        formula.append("Range");
        formula.append('(');
        formula.append('"');
        formula.append(columnas[j][k]);
        formula.append(i);
        formula.append('"');
        formula.append(')');
        formula.append(".FormulaLocal = ");
        formula.append('"');
        formula.append("=BUSCARV($");
        formula.append(referencias[j-1].substring(0, referencias[j-1].length()-1));
        formula.append(referencias[j-1].substring(referencias[j-1].length()-1, referencias[j-1].length()));
        formula.append('$');
        formula.append(referencias[j-1].charAt(1));
        formula.append(",'");
        formula.append(i-2);
        formula.append("'!$A$7:$G$415,");
        formula.append(valores[k]);
        formula.append(",FALSO)");
        formula.append('"');
            System.out.println(formula);
            k++;
        if(k==5)
        {i++;
        k=1;}
        if(i==44)
        {i=3;
        j++;}
        }while(j<4);
//        System.out.println("1,0");
//        System.out.println(columnas[1][0]);
//        System.out.println(columnas[2][1]);
//        System.out.println(columnas[3][2]);
//        System.out.println(columnas[4][3]);
//        System.out.println(columnas[5][4]);
//        System.out.println(columnas[6][5]);
//        System.out.println(columnas[0][6]);
//        System.out.println("0,6");
//        StringBuilder  formula=new StringBuilder();
//        int i=0;
//        String[][] columnas2 =  {{"","B","C","D","G"},{"","I","J","K","N"}};
        
    }
    
}
