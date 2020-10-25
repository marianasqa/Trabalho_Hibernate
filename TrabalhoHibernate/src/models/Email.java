
package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="email")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id;
    
   private String Email;
   
   public Email (String Email){
       this.Email = Email;
   }
 
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
