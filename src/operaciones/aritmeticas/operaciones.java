package operaciones.aritmeticas;


public class operaciones {
    int dato1=0, dato2=0, resultado=0;
    public operaciones (){
        
    }
    public void setSuma (int a, int b){
       this.dato1=a;
       this.dato2=b;
       this.resultado=dato1+dato2;
    }
    
    public void setResta (int a, int b){
       this.dato1=a;
       this.dato2=b;
       this.resultado=dato1-dato2;
       
    }
public void setMultiplicacion (int a, int b){
       this.dato1=a;
       this.dato2=b;
       this.resultado=dato1*dato2;

}

public void setDivision (int a, int b){
       this.dato1=a;
       this.dato2=b;
       this.resultado=dato1/dato2;
}
public void setModulo (int a, int b){
       this.dato1=a;
       this.dato2=b;
       this.resultado=dato1%dato2;
}
public void imprimirResultado(){
    System.out.println(" el resultado de la operacion es  "+ resultado );
}
}
