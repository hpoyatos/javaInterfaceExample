public class App {
    public static void main(String[] args) throws Exception {
        // Usando a estrutura Vetor..
        Vetor meuVetor = new Vetor(10);
        System.out.println(meuVetor.tamanho());

        meuVetor.inserir(20);
        meuVetor.inserir(56);

        System.out.println(meuVetor.buscar(56));
        System.out.println(meuVetor.buscar(22));

        System.out.println(meuVetor.numero(0));

        //System.out.println(meuVetor.numero(11));

        System.out.println("");
        System.out.println("");
        // Usando a estrutura ArrayLista...

        ArrayLista minhaLista = new ArrayLista();
        System.out.println(minhaLista.tamanho());
        
        minhaLista.inserir(20);
        minhaLista.inserir(56);

        System.out.println(minhaLista.buscar(56));
        System.out.println(minhaLista.buscar(22));

        System.out.println(minhaLista.numero(0));
    }
}
