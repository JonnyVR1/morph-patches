package org.eclipse.jetty.security;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p149l.jfd0;

/* JADX INFO: loaded from: classes3.dex */
public class RoleInfo {
    private boolean _checked;
    private boolean _forbidden;
    private boolean _isAnyRole;
    private final Set<String> _roles = new CopyOnWriteArraySet();
    private UserDataConstraint _userDataConstraint;

    public void addRole(String str) {
        this._roles.add(str);
    }

    public void combine(RoleInfo roleInfo) {
        if (roleInfo._forbidden) {
            setForbidden(true);
        } else if (!roleInfo._checked) {
            setChecked(true);
        } else if (roleInfo._isAnyRole) {
            setAnyRole(true);
        } else if (!this._isAnyRole) {
            Iterator<String> it = roleInfo._roles.iterator();
            while (it.hasNext()) {
                this._roles.add(it.next());
            }
        }
        setUserDataConstraint(roleInfo._userDataConstraint);
    }

    public Set<String> getRoles() {
        return this._roles;
    }

    public UserDataConstraint getUserDataConstraint() {
        return this._userDataConstraint;
    }

    public boolean isAnyRole() {
        return this._isAnyRole;
    }

    public boolean isChecked() {
        return this._checked;
    }

    public boolean isForbidden() {
        return this._forbidden;
    }

    public void setAnyRole(boolean z) {
        this._isAnyRole = z;
        if (z) {
            this._checked = true;
            this._roles.clear();
        }
    }

    public void setChecked(boolean z) {
        this._checked = z;
        if (z) {
            return;
        }
        this._forbidden = false;
        this._roles.clear();
        this._isAnyRole = false;
    }

    public void setForbidden(boolean z) {
        this._forbidden = z;
        if (z) {
            this._checked = true;
            this._userDataConstraint = null;
            this._isAnyRole = false;
            this._roles.clear();
        }
    }

    public void setUserDataConstraint(UserDataConstraint userDataConstraint) {
        if (userDataConstraint == null) {
            jfd0.m141176a("Null UserDataConstraint");
            return;
        }
        UserDataConstraint userDataConstraint2 = this._userDataConstraint;
        if (userDataConstraint2 == null) {
            this._userDataConstraint = userDataConstraint;
        } else {
            this._userDataConstraint = userDataConstraint2.combine(userDataConstraint);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{RoleInfo");
        sb.append(this._forbidden ? ",F" : "");
        sb.append(this._checked ? ",C" : "");
        sb.append(this._isAnyRole ? ",*" : this._roles);
        sb.append("}");
        return sb.toString();
    }
}
