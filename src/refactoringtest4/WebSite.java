/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringtest4;

/**
 *
 * @author zzaier
 */
public class WebSite {
    
    String idWebApplication;
    Integer sizeWebApllication;
    Integer nbWebSiteUsers;

 	public String getIdWebApplication() {
		return idWebApplication;
	}

	public void setIdWebApplication(String idWebApplication) {
		this.idWebApplication = idWebApplication;
	}

	public Integer getSizeWebApllication() {
		return sizeWebApllication;
	}

	public void setSizeWebApllication(Integer sizeWebApllication) {
		this.sizeWebApllication = sizeWebApllication;
	}

	public Integer getNbWebSiteUsers() {
		return nbWebSiteUsers;
	}

	public void setNbWebSiteUsers(Integer nbWebSiteUsers) {
		this.nbWebSiteUsers = nbWebSiteUsers;
	}
    
}
