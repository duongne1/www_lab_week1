package vn.edu.iuh.fit.entities;

public class GrantAccess {
    private String role_id;
    private String account_id;
    private boolean is_grant;

    public GrantAccess(String role_id, String account_id, boolean is_grant) {
        this.role_id = role_id;
        this.account_id = account_id;
        this.is_grant = is_grant;
    }

    public GrantAccess() {
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public boolean isIs_grant() {
        return is_grant;
    }

    public void setIs_grant(boolean is_grant) {
        this.is_grant = is_grant;
    }

    @Override
    public String toString() {
        return "GrantAccess{" +
                "role_id='" + role_id + '\'' +
                ", account_id='" + account_id + '\'' +
                ", is_grant=" + is_grant +
                '}';
    }
}
