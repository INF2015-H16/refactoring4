/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringtest4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zzaier
 */
public class Members extends Users {

    List<Guests> guests = new ArrayList<Guests>();
    String photoUrl;

    public Members(String lastName, String firstName) {
        String ownerID = lastName.toUpperCase().trim().substring(1, 3)
                + firstName.toUpperCase().trim().substring(1, 3);
        System.out.println("New Member: " + ownerID);
    }

    public void setPhotoUrl(String photoName) {
        this.photoUrl = "/photos/menbers/mad/" + photoName;
    }
}
