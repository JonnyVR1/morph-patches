package org.fourthline.cling.model;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServerClientTokens {
    public static final String UNKNOWN_PLACEHOLDER = "UNKNOWN";
    private int majorVersion;
    private int minorVersion;
    private String osName;
    private String osVersion;
    private String productName;
    private String productVersion;

    public ServerClientTokens(int i, int i2) {
        this.majorVersion = 1;
        this.minorVersion = 0;
        this.osName = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.osVersion = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.productName = UserConstants.PRODUCT_TOKEN_NAME;
        this.productVersion = UserConstants.PRODUCT_TOKEN_VERSION;
        this.majorVersion = i;
        this.minorVersion = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerClientTokens serverClientTokens = (ServerClientTokens) obj;
        return this.majorVersion == serverClientTokens.majorVersion && this.minorVersion == serverClientTokens.minorVersion && this.osName.equals(serverClientTokens.osName) && this.osVersion.equals(serverClientTokens.osVersion) && this.productName.equals(serverClientTokens.productName) && this.productVersion.equals(serverClientTokens.productVersion);
    }

    public String getHttpToken() {
        StringBuilder sb = new StringBuilder(256);
        int iIndexOf = this.osName.indexOf(32);
        String strReplace = this.osName;
        if (iIndexOf != -1) {
            strReplace = strReplace.replace(' ', '_');
        }
        sb.append(strReplace);
        sb.append('/');
        int iIndexOf2 = this.osVersion.indexOf(32);
        String strReplace2 = this.osVersion;
        if (iIndexOf2 != -1) {
            strReplace2 = strReplace2.replace(' ', '_');
        }
        sb.append(strReplace2);
        sb.append(" UPnP/");
        sb.append(this.majorVersion);
        sb.append('.');
        sb.append(this.minorVersion);
        sb.append(' ');
        int iIndexOf3 = this.productName.indexOf(32);
        String strReplace3 = this.productName;
        if (iIndexOf3 != -1) {
            strReplace3 = strReplace3.replace(' ', '_');
        }
        sb.append(strReplace3);
        sb.append('/');
        int iIndexOf4 = this.productVersion.indexOf(32);
        String strReplace4 = this.productVersion;
        if (iIndexOf4 != -1) {
            strReplace4 = strReplace4.replace(' ', '_');
        }
        sb.append(strReplace4);
        return sb.toString();
    }

    public int getMajorVersion() {
        return this.majorVersion;
    }

    public int getMinorVersion() {
        return this.minorVersion;
    }

    public String getOsName() {
        return this.osName;
    }

    public String getOsToken() {
        return getOsName().replaceAll(" ", "_") + "/" + getOsVersion().replaceAll(" ", "_");
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getProductToken() {
        return getProductName().replaceAll(" ", "_") + "/" + getProductVersion().replaceAll(" ", "_");
    }

    public String getProductVersion() {
        return this.productVersion;
    }

    public int hashCode() {
        return (((((((((this.majorVersion * 31) + this.minorVersion) * 31) + this.osName.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.productVersion.hashCode();
    }

    public void setMajorVersion(int i) {
        this.majorVersion = i;
    }

    public void setMinorVersion(int i) {
        this.minorVersion = i;
    }

    public void setOsName(String str) {
        this.osName = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setProductName(String str) {
        this.productName = str;
    }

    public void setProductVersion(String str) {
        this.productVersion = str;
    }

    public String toString() {
        return getOsName() + "/" + getOsVersion() + " UPnP/" + getMajorVersion() + "." + getMinorVersion() + " " + getProductName() + "/" + getProductVersion();
    }

    public ServerClientTokens() {
        this.majorVersion = 1;
        this.minorVersion = 0;
        this.osName = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.osVersion = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.productName = UserConstants.PRODUCT_TOKEN_NAME;
        this.productVersion = UserConstants.PRODUCT_TOKEN_VERSION;
    }

    public ServerClientTokens(String str, String str2) {
        this.majorVersion = 1;
        this.minorVersion = 0;
        this.osName = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.osVersion = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.productName = str;
        this.productVersion = str2;
    }

    public ServerClientTokens(int i, int i2, String str, String str2, String str3, String str4) {
        this.majorVersion = 1;
        this.minorVersion = 0;
        this.osName = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.majorVersion = i;
        this.minorVersion = i2;
        this.osName = str;
        this.osVersion = str2;
        this.productName = str3;
        this.productVersion = str4;
    }
}
