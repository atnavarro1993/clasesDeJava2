public class Suma extends Operacion {

    public Suma(Termino izquierda, Termino derecha) {
        super(izquierda, derecha);
    }
    public int valuar(){
        int valorIzquierda = izquierda.valuar();
        int valorDerecha = derecha.valuar();
        //esto no escala, smelly code
        /*if(izquierda instanceof  Numero){
            valorIzquierda = ((Numero)izquierda).getValor();
        } else if(izquierda instanceof Suma){
            valorIzquierda =((Suma)izquierda).sumar();
        }
        if(derecha instanceof  Numero){
            valorDerecha = ((Numero)derecha).getValor();
        } else if(derecha instanceof Suma){
            valorDerecha =((Suma)derecha).sumar();
        }*/

        return  valorIzquierda+valorDerecha;
    }
}
