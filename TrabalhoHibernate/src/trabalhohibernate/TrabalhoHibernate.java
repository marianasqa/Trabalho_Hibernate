package trabalhohibernate;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Autor;
import models.Editora;
import models.Email;
import models.Livros;

public class TrabalhoHibernate {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoHibernatePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        
        Autor autor = new Autor();
        autor.setNome("Mariana Siqueira");
        autor.email = new ArrayList<Email>();
        autor.email.add(new Email("marianasqa@gmail.com"));
        
        Autor autor1 = new Autor();
        autor1.setNome("Carina Rissi");
        autor1.email = new ArrayList<Email>();
        autor1.email.add(new Email("carinarissi@gmail.com"));
        autor1.email.add(new Email("carinarissy@outlook.com"));
        
        Autor autor2 = new Autor();
        autor2.setNome("Taylor Jenkins Reid");
        autor2.email = new ArrayList<Email>();
        autor2.email.add(new Email("taylorjreid@gmail.com"));
        
        Autor autor3 = new Autor();
        autor3.setNome("JK Rowling");
        autor3.email = new ArrayList<Email>();
        autor3.email.add(new Email("jkrowling@icloud.com"));
        autor3.email.add(new Email ("jkrowling1@gmail.com"));
        
        Autor autor4 = new Autor();
        autor4.setNome("Holly Back");
        autor4.email = new ArrayList<Email>();
        autor4.email.add(new Email("hollyback@outlook.com"));
        
        Autor autor5 = new Autor();
        autor5.setNome("Rick Riordan");
        autor5.email = new ArrayList<Email>();
        autor5.email.add(new Email("ellekennedy@hotmail.com"));
        
        Livros livro1 = new Livros();
        livro1.setIsbn("8576862441");
        livro1.setEdicao("1ª Edição - 27 junho 2013");
        livro1.setCusto("34,89");
        livro1.setTitulo("Perdida");
        
        Livros livro2 = new Livros();
        livro2.setIsbn("8584391509");
        livro2.setEdicao("1ª Edição - 21 outubro 2019");
        livro2.setCusto("34,00");
        livro2.setTitulo("Os Sete Maridos de Evelyn Hugo");
        
        Livros livro3 = new Livros();
        livro3.setIsbn("8532530788");
        livro3.setEdicao("5ª Edição 19 agosto 2017");
        livro3.setCusto("26,99");
        livro3.setTitulo("Harry Potter e a Pedra Filosofal");
        
        Livros livro4 = new Livros();
        livro4.setIsbn("850111555X");
        livro4.setEdicao("3ª Edição - 10 setembro 2018");
        livro4.setCusto("39,91");
        livro4.setTitulo("Principe Cruel");
        
        Livros livro5 = new Livros();
        livro5.setIsbn("8580575397");
        livro5.setEdicao("2ª Edição - 18 agosto 2014");
        livro5.setCusto("25,89");
        livro5.setTitulo("Percy Jackson e os Olimpianos");
        
        Editora editora1 = new Editora();
        editora1.setCod_edit("22");
        editora1.setNome("Verus");
        
        Editora editora2 = new Editora();
        editora2.setCod_edit("19");
        editora2.setNome("Paralela");
        
        Editora editora3 = new Editora();
        editora3.setCod_edit("78");
        editora3.setNome("Rocco");
        
        Editora editora4 = new Editora();
        editora4.setCod_edit("34");
        editora4.setNome("Galera");
        
        Editora editora5 = new Editora();
        editora5.setCod_edit("25");
        editora5.setNome("Intrínseca");
        
        try{
            em.persist(autor);
            em.persist(autor1);
            em.persist(autor2);
            em.persist(autor3);
            em.persist(autor4);
            em.persist(autor5);
            
            em.persist(livro1);
            em.persist(livro2);
            em.persist(livro3);
            em.persist(livro4);
            em.persist(livro5);
            
            em.persist(editora1);
            em.persist(editora2);
            em.persist(editora3);
            em.persist(editora4);
            em.persist(editora5);
            
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
        emf.close();
    }
  }
  