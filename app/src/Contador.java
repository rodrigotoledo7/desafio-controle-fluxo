
public class Contador {
    private int numeroUm;
    private int numeroDois;

    public Contador (int numeroUm, int numeroDois){
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public void contar() throws ParametrosInvalidosException{
        if (numeroUm > numeroDois){
            throw new ParametrosInvalidosException("O primeiro número não pode ser maior que o segundo.");
        }

        for(int i = numeroUm; i <= numeroDois; i++){
            System.out.println("Número: " + i);
        }
    }

}