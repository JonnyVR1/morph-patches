package org.fourthline.cling.model.types;

/* JADX INFO: loaded from: classes3.dex */
public class PragmaType {
    private boolean quote;
    private String token;
    private String value;

    public PragmaType(String str, String str2, boolean z) {
        this.token = str;
        this.value = str2;
        this.quote = z;
    }

    public static PragmaType valueOf(String str) throws InvalidValueException {
        String strSubstring;
        String str2;
        if (str.length() == 0) {
            throw new InvalidValueException("Can't parse Bytes Range: ".concat(str));
        }
        String[] strArrSplit = str.split("=");
        boolean z = false;
        if (strArrSplit.length > 1) {
            str2 = strArrSplit[0];
            strSubstring = strArrSplit[1];
            if (strSubstring.startsWith("\"") && strSubstring.endsWith("\"")) {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                z = true;
            }
        } else {
            strSubstring = str;
            str2 = null;
        }
        return new PragmaType(str2, strSubstring, z);
    }

    public String getString() {
        String str = "";
        if (this.token != null) {
            str = "" + this.token + "=";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        boolean z = this.quote;
        String str2 = this.value;
        if (z) {
            str2 = "\"" + str2 + "\"";
        }
        sb.append(str2);
        return sb.toString();
    }

    public String getToken() {
        return this.token;
    }

    public String getValue() {
        return this.value;
    }

    public PragmaType(String str, String str2) {
        this.token = str;
        this.value = str2;
    }

    public PragmaType(String str) {
        this.token = null;
        this.value = str;
    }
}
