
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
public class issuedBooks {
    private int id;
    private String callNo;    
    private int studentId;
    private String studentName;
    private String studentContact;
    private Date added_date;
    static issuedBooks ib[] = new issuedBooks[100];
    static int count = 0;
    
    
    public issuedBooks(int id, String callNo, int studentId, String studentName, String studentContact) {
        this.id = id;
        this.callNo = callNo;
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentContact = studentContact;
        this.added_date=new Date(System.currentTimeMillis());
    }

    /**
     * @return the id
     */

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
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the studentId
     */
   

    /**
     * @return the studentContact
     */
    public String getStudentContact() {
        return studentContact;
    }

    /**
     * @param studentContact the studentContact to set
     */
    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
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
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    
}
