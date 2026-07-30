package org.spongycastle.asn1.eac;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Flags {
    int value;

    public class StringJoiner {
        boolean First = true;

        /* JADX INFO: renamed from: b */
        StringBuffer f9882b = new StringBuffer();
        String mSeparator;

        public StringJoiner(String str) {
            this.mSeparator = str;
        }

        public void add(String str) {
            if (this.First) {
                this.First = false;
            } else {
                this.f9882b.append(this.mSeparator);
            }
            this.f9882b.append(str);
        }

        public String toString() {
            return this.f9882b.toString();
        }
    }

    public Flags() {
        this.value = 0;
    }

    public String decode(Hashtable hashtable) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Integer num = (Integer) enumerationKeys.nextElement();
            if (isSet(num.intValue())) {
                stringJoiner.add((String) hashtable.get(num));
            }
        }
        return stringJoiner.toString();
    }

    public int getFlags() {
        return this.value;
    }

    public boolean isSet(int i) {
        return (this.value & i) != 0;
    }

    public void set(int i) {
        this.value = i | this.value;
    }

    public Flags(int i) {
        this.value = i;
    }
}
