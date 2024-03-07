
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    // Métodos para empréstimo e devolução
    public void emprestarLivro() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro já emprestado!");
        }
    }

    public void devolverLivro() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro já está na biblioteca!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        livro.emprestarLivro();
        livro.devolverLivro();
    }
}

//    A classe Livro está sobrecarregada com várias responsabilidades,
//    como armazenar informações sobre o livro,
//    gerenciar o status de empréstimo e realizar operações de empréstimo e devolução.
//    Refatore aplicando o principio de responsabilidade unica e
//    adicione uma Biblioteca  responsável por gerenciar os livros
