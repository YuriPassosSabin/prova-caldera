public class Usuario {
    String nome;
    int idade;
    public Usuario(String n, int i){
        nome = n;
        idade = i;
    }

    public static void main(String[] args) {
        //geito certo de instanciar uma classe com construtor
        Usuario u = new Usuario("João", 25);

        //Usuario u = Usuario("João", 25); <-- sem a palavra reservada new ele não cria um usuario
        //Usuario u = new Usuario.nome("João").idade(25); <-- o construtor da classe não foi usado logo esta incorreto
        //Usuario u = Usuario(); <-- o contrutor está sem os parametros estabelecidos que a classe precisa para ser instanciada

    }
}
