class main{
    public static void main(String args[]){
        // Cria uma instancia de uma nova pessoa.
        Pessoa p1 = new Pessoa();

        // Define variaveis de dados de uma nova pessoa.
        p1.rg = "5300772-5";
        p1.idade = "19 Anos";
        p1.endereço = "Rua Fava, 02";
        p1.nome = "Maria Rita Rezende";

        // Exibe as variaveis de dados de uma pessoa.
        System.out.println(p1.endereço);
        System.out.println(p1.rg);
        System.out.println(p1.nome);
        System.out.println(p1.idade);

    }




}