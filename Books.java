
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */
public class Books {
    private int id;
    private String callNo;
    private String Name;
    private String Author;
    private String publisher;
    private int quantity;
    private int issued;
    private Date added_date;
    static Books b[] = new Books[100];
    static int count = 0;

    public Books(int id, String callNo, String Name, String Author, String publisher, int quantity, int issued) {
        this.id = id;
        this.callNo = callNo;
        this.Name = Name;
        this.Author = Author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.issued = issued;
        this.added_date=new Date(System.currentTimeMillis());
    }

    /**
     * @return the callNo
     */
    public String getCallNo() {
        return callNo;
    }

    /**
     * @param callNo the callNo to set
     */
    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Author
     */
    public String getAuthor() {
        return Author;
    }

    /**
     * @param Author the Author to set
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the issued
     */
    public int getIssued() {
        return issued;
    }

    /**
     * @param issued the issued to set
     */
    public void setIssued(int issued) {
        this.issued = issued;
    }

    /**
     * @return the added_date
     */
    public Date getAdded_date() {
        return added_date;
    }

    /**
     * @param added_date the added_date to set
     */
    public void setAdded_date(Date added_date) {
        this.added_date = added_date;
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

    /**
     * @return the id
     */
   
}
