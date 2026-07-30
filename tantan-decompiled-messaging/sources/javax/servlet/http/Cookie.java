package javax.servlet.http;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import p149l.ig3;
import p149l.upk0;

/* JADX INFO: loaded from: classes2.dex */
public class Cookie implements Cloneable, Serializable {
    private static final String TSPECIALS;
    private static final long serialVersionUID = -6454587001725327448L;
    private String comment;
    private String domain;
    private String name;
    private String path;
    private boolean secure;
    private String value;
    private static final String LSTRING_FILE = "javax.servlet.http.LocalStrings";
    private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);
    private int maxAge = -1;
    private int version = 0;
    private boolean isHttpOnly = false;

    static {
        if (Boolean.valueOf(System.getProperty("org.glassfish.web.rfc2109_cookie_names_enforced", "true")).booleanValue()) {
            TSPECIALS = "/()<>@,;:\\\"[]?={} \t";
        } else {
            TSPECIALS = ",; ";
        }
    }

    public Cookie(String str, String str2) {
        if (str == null || str.length() == 0) {
            ig3.m135964a(lStrings.getString("err.cookie_name_blank"));
            throw null;
        }
        if (!isToken(str) || str.equalsIgnoreCase("Comment") || str.equalsIgnoreCase("Discard") || str.equalsIgnoreCase("Domain") || str.equalsIgnoreCase("Expires") || str.equalsIgnoreCase("Max-Age") || str.equalsIgnoreCase("Path") || str.equalsIgnoreCase("Secure") || str.equalsIgnoreCase(Constants.CLTAP_APP_VERSION) || str.startsWith("$")) {
            ig3.m135964a(MessageFormat.format(lStrings.getString("err.cookie_name_is_token"), str));
            throw null;
        }
        this.name = str;
        this.value = str2;
    }

    private boolean isToken(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt >= 127 || TSPECIALS.indexOf(cCharAt) != -1) {
                return false;
            }
        }
        return true;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            upk0.m194883a(e.getMessage());
            return null;
        }
    }

    public String getComment() {
        return this.comment;
    }

    public String getDomain() {
        return this.domain;
    }

    public int getMaxAge() {
        return this.maxAge;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public boolean getSecure() {
        return this.secure;
    }

    public String getValue() {
        return this.value;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isHttpOnly() {
        return this.isHttpOnly;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setDomain(String str) {
        this.domain = str.toLowerCase(Locale.ENGLISH);
    }

    public void setHttpOnly(boolean z) {
        this.isHttpOnly = z;
    }

    public void setMaxAge(int i) {
        this.maxAge = i;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSecure(boolean z) {
        this.secure = z;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
