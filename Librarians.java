
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */
public class Librarians {
    private int id;
    private String name;
    private String password;
    private String email;
    private String address;
    private String city;
    private String contactNo;
    static Librarians u[] = new Librarians[100];
    static int count = 0;

    public Librarians(int id, String name, String password, String email, String address, String city, String contactNo) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.city = city;
        this.contactNo = contactNo;
    }

    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

 
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }   
 
    
    public static void readFile(){
        File f = new File("Librarian.txt");
        Scanner s = null;
        try {
            s = new Scanner(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminLoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }        
         while(s.hasNext()){
            int id=Integer.parseInt(s.next());
            String name=s.next();
            String password = s.next();
            String email = s.next();
            String address = s.next();
            String city = s.next();
            String contactNo = s.next();
            u[count] = new Librarians(id,name,password,email,address,city,contactNo);
            count++;
        }
    }
    public static void saveFile() throws FileNotFoundException{
        File f = new File("Librarian.txt");
        PrintWriter pw = new PrintWriter(f);
        for (int i = 0; i < count; i++) {
            pw.print(u[i].getName() + " ");
            pw.print(u[i].getPassword() + " ");
            pw.print(u[i].getEmail() + " ");
            pw.print(u[i].getAddress() + " ");
            pw.print(u[i].getCity() + " ");
            pw.print(u[i].getContactNo() + " ");
        }
        pw.close();
    
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
