class Main{
    public static void main(String args[]){
        // Cria uma instancia de uma nova pessoa.
        Pessoa p1 = new Pessoa();

        // Define variaveis de dados de uma nova pessoa.
        p1.rg = "40028922-0";
        p1.idade = "22 Anos";
        p1.endereço = "Rua Estevâo benicio, 02";
        p1.nome = "José Alvares Cabaral";

        // Exibe as variaveis de dados de uma pessoa.
        System.out.println(p1.endereço);
        System.out.println(p1.rg);
        System.out.println(p1.nome);
        System.out.println(p1.idade);

    }




}