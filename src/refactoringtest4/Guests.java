/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringtest4;

import java.util.Date;

/**
 *
 * @author zzaier
 */
public class Guests extends Users{
    String guest_id;

    String lastName;
    String firstName;
    Date dateBirth;

    public Guests(String n, String p, Date d) {
        this.lastName = n;
        this.firstName = p;
        this.dateBirth = d;
        this.guest_id = createGuestId(n, p, d);
    }

    public String createGuestId(String lName, String fName, Date date) {
        String end = concatDate(date);
        return lName.substring(0, 3) + fName.charAt(0) + end;
    }

    private String concatDate(Date date) {
        return date.getYear() + "-" + date.getMonth();
    }

    public String getGuestId() {
        return guest_id;
    }

    public void setGuestId(String tenant_id) {
        this.guest_id = tenant_id;
    }

    public void isInvitedBy(Members owner) {
        owner.guests.add(this);
    }
    
}
