package models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table (name="Livros")
public class Livros {

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

    public String getEdicao() {
        return edicao;
    }
    
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getCusto() {
        return custo;
    }
    
    public void setCusto(String custo) {
        this.custo = custo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    public int id;
    
    @Column(name="ISBN", length=100, nullable=false)
    private String Isbn;
    
    @Column(length=100, nullable=false)
    private String edicao;
    
    @Column(length=100, nullable=false)
    private String custo;
    
    @Column(length=100, nullable=false)
    private String titulo;
    
    @ManyToOne
    @JoinColumn (name = "editora_id")
    private Editora editora;

    @ManyToMany
    @JoinTable ( name ="livro_autor",
                joinColumns = @JoinColumn (name = "livro_id"),
                inverseJoinColumns = @JoinColumn (name = "autor_id"))
    private List<Autor> autores;
    
}
