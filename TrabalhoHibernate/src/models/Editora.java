package models;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name="Editora")

public class Editora  {

    public String getCod_edit() {
        return cod_edit;
    }

    public void setCod_edit(String cod_edit) {
        this.cod_edit = cod_edit;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    public int id;
    
    @Column(name="cod_edit", length=100, nullable=false)
    private String cod_edit;
    
    @Column(length=100, nullable=false)
    private String nome;
    
    @OneToMany (mappedBy = "editora")
    private List <Livros> livros;

}
  
   

