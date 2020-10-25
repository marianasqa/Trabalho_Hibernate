package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Autor")

public class Autor {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column (name = "cod_aut", length = 10, nullable = false, unique = false)
    private Integer id;
    
    @Column (length = 150, nullable = false, unique = false)
    private String Nome;
    
    @OneToMany(
    cascade = CascadeType.ALL,
    orphanRemoval = true
    )
   
    @JoinColumn(name = "IDFK_AUTOR")
    public List<Email> email =  new ArrayList();
   
    @ManyToMany (mappedBy = "autores")
    private List<Livros> livros;
    
  
    }
    
