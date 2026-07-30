package org.spongycastle.asn1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class OIDTokenizer {
    private int index = 0;
    private String oid;

    public OIDTokenizer(String str) {
        this.oid = str;
    }

    public boolean hasMoreTokens() {
        return this.index != -1;
    }

    public String nextToken() {
        int i = this.index;
        if (i == -1) {
            return null;
        }
        int iIndexOf = this.oid.indexOf(46, i);
        String str = this.oid;
        if (iIndexOf == -1) {
            String strSubstring = str.substring(this.index);
            this.index = -1;
            return strSubstring;
        }
        String strSubstring2 = str.substring(this.index, iIndexOf);
        this.index = iIndexOf + 1;
        return strSubstring2;
    }
}
