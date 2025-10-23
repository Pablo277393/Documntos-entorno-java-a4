public class practica1 {
    int inicio;
    int fin;
    //Constructor
    public practica1 (int inicio, int fin){
        this.inicio = inicio;
        this.fin = fin;
}
public void contar(){
    //Metodo que escriba por pantalla los numeros desde inicio a fin
    for (int i = inicio; i <= fin; i++){
        System.out.println(i);
    }
//Otra forma de hacerlo con while
int i=inicio;
    while (i < fin){
        System.out.println(i);
        i++;
    }
}
public int sumar(){
    //Metodo que sume los numero desde inicio a fin
    int suma = 0;
for (int i = inicio ; i <= fin; i++){
    suma += i;
}

    return suma;
}
}
