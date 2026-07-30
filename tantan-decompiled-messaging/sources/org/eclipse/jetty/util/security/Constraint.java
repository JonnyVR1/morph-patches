package org.eclipse.jetty.util.security;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.Arrays;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class Constraint implements Cloneable, Serializable {
    public static final String ANY_ROLE = "*";
    public static final int DC_CONFIDENTIAL = 2;
    public static final int DC_FORBIDDEN = 3;
    public static final int DC_INTEGRAL = 1;
    public static final int DC_NONE = 0;
    public static final int DC_UNSET = -1;
    public static final String NONE = "NONE";
    public static final String __BASIC_AUTH = "BASIC";
    public static final String __CERT_AUTH = "CLIENT_CERT";
    public static final String __CERT_AUTH2 = "CLIENT-CERT";
    public static final String __DIGEST_AUTH = "DIGEST";
    public static final String __FORM_AUTH = "FORM";
    public static final String __NEGOTIATE_AUTH = "NEGOTIATE";
    public static final String __SPNEGO_AUTH = "SPNEGO";
    private String _name;
    private String[] _roles;
    private int _dataConstraint = -1;
    private boolean _anyRole = false;
    private boolean _authenticate = false;

    public Constraint(String str, String str2) {
        setName(str);
        setRoles(new String[]{str2});
    }

    public static boolean validateMethod(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return strTrim.equals(__FORM_AUTH) || strTrim.equals(__BASIC_AUTH) || strTrim.equals(__DIGEST_AUTH) || strTrim.equals(__CERT_AUTH) || strTrim.equals(__CERT_AUTH2) || strTrim.equals(__SPNEGO_AUTH) || strTrim.equals(__NEGOTIATE_AUTH);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean getAuthenticate() {
        return this._authenticate;
    }

    public int getDataConstraint() {
        return this._dataConstraint;
    }

    public String[] getRoles() {
        return this._roles;
    }

    public boolean hasDataConstraint() {
        return this._dataConstraint >= 0;
    }

    public boolean hasRole(String str) {
        if (this._anyRole) {
            return true;
        }
        String[] strArr = this._roles;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return false;
            }
            if (str.equals(this._roles[i])) {
                return true;
            }
            length = i;
        }
    }

    public boolean isAnyRole() {
        return this._anyRole;
    }

    public boolean isForbidden() {
        if (!this._authenticate || this._anyRole) {
            return false;
        }
        String[] strArr = this._roles;
        return strArr == null || strArr.length == 0;
    }

    public void setAuthenticate(boolean z) {
        this._authenticate = z;
    }

    public void setDataConstraint(int i) {
        if (i < 0 || i > 2) {
            ig3.m135964a("Constraint out of range");
        } else {
            this._dataConstraint = i;
        }
    }

    public void setName(String str) {
        this._name = str;
    }

    public void setRoles(String[] strArr) {
        this._roles = strArr;
        this._anyRole = false;
        if (strArr == null) {
            return;
        }
        int length = strArr.length;
        while (true) {
            boolean z = this._anyRole;
            if (z) {
                return;
            }
            int i = length - 1;
            if (length <= 0) {
                return;
            }
            this._anyRole = "*".equals(strArr[i]) | z;
            length = i;
        }
    }

    public String toString() {
        String string;
        String str;
        StringBuilder sb = new StringBuilder("SC{");
        sb.append(this._name);
        sb.append(Constants.SEPARATOR_COMMA);
        if (this._anyRole) {
            string = "*";
        } else {
            String[] strArr = this._roles;
            string = strArr == null ? "-" : Arrays.asList(strArr).toString();
        }
        sb.append(string);
        sb.append(Constants.SEPARATOR_COMMA);
        int i = this._dataConstraint;
        if (i == -1) {
            str = "DC_UNSET}";
        } else if (i == 0) {
            str = "NONE}";
        } else {
            str = i == 1 ? "INTEGRAL}" : "CONFIDENTIAL}";
        }
        sb.append(str);
        return sb.toString();
    }

    public Constraint() {
    }
}
