package org.spongycastle.asn1.eac;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class Flags {
    int value;

    public class StringJoiner {
        boolean First = true;

        /* JADX INFO: renamed from: b */
        StringBuffer f206257b = new StringBuffer();
        String mSeparator;

        public StringJoiner(String str) {
            this.mSeparator = str;
        }

        public void add(String str) {
            if (this.First) {
                this.First = false;
            } else {
                this.f206257b.append(this.mSeparator);
            }
            this.f206257b.append(str);
        }

        public String toString() {
            return this.f206257b.toString();
        }
    }

    public Flags() {
        this.value = 0;
    }

    public String decode(Hashtable hashtable) {
        StringJoiner stringJoiner = new StringJoiner(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
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
