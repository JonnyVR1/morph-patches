package org.spongycastle.asn1.x509;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class X509NameTokenizer {
    private StringBuffer buf;
    private int index;
    private char separator;
    private String value;

    public X509NameTokenizer(String str, char c) {
        this.buf = new StringBuffer();
        this.value = str;
        this.index = -1;
        this.separator = c;
    }

    public boolean hasMoreTokens() {
        return this.index != this.value.length();
    }

    public String nextToken() {
        if (this.index == this.value.length()) {
            return null;
        }
        int i = this.index + 1;
        this.buf.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i != this.value.length()) {
            char cCharAt = this.value.charAt(i);
            if (cCharAt == '\"') {
                if (!z) {
                    z2 = !z2;
                }
                this.buf.append(cCharAt);
            } else {
                if (z || z2) {
                    this.buf.append(cCharAt);
                } else if (cCharAt == '\\') {
                    this.buf.append(cCharAt);
                    z = true;
                } else {
                    if (cCharAt == this.separator) {
                        break;
                    }
                    this.buf.append(cCharAt);
                }
                i++;
            }
            z = false;
            i++;
        }
        this.index = i;
        return this.buf.toString();
    }

    public X509NameTokenizer(String str) {
        this(str, ',');
    }
}
