package co.dominick;



public class User {
    private String name;
    private String agencia;
    private int idade;
    private double totalValor = 0;

    public void setName(String name){
        this.name = name;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }


    public void setIdade(int idade){
        this.idade = idade;
    }

    public void getInfo(){
        System.out.println(name + "\n" + agencia + "\n" + idade + "\n" + "Total: $" + totalValor);
    }

    public void setTotalValor(double totalValor){
        this.totalValor = totalValor;
    }

    public double getTotalValor(){
        return totalValor;
    }




}
