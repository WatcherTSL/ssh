package action;

import bean.Admin;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String login(){
        if(admin.getPassword().equals("admin")&&admin.getUsername().equals("admin"))
            return SUCCESS;
        else
            return ERROR;
    }
}
