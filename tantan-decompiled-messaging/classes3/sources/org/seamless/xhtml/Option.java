package org.seamless.xhtml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Option {
    private String key;
    private String[] values;

    public Option(String str, String[] strArr) {
        this.key = str;
        this.values = strArr;
    }

    public static Option[] fromString(String str) {
        if (str == null || str.length() == 0) {
            return new Option[0];
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (String str2 : str.split(";")) {
                String strTrim = str2.trim();
                if (strTrim.contains(":")) {
                    String[] strArrSplit = strTrim.split(":");
                    if (strArrSplit.length == 2) {
                        String strTrim2 = strArrSplit[0].trim();
                        String[] strArrSplit2 = strArrSplit[1].split(",");
                        ArrayList arrayList2 = new ArrayList();
                        for (String str3 : strArrSplit2) {
                            String strTrim3 = str3.trim();
                            if (strTrim3.length() > 0) {
                                arrayList2.add(strTrim3);
                            }
                        }
                        arrayList.add(new Option(strTrim2, (String[]) arrayList2.toArray(new String[arrayList2.size()])));
                    }
                }
            }
            return (Option[]) arrayList.toArray(new Option[arrayList.size()]);
        } catch (Exception e) {
            throw new IllegalArgumentException("Can't parse options string: ".concat(str), e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Option option = (Option) obj;
        return this.key.equals(option.key) && Arrays.equals(this.values, option.values);
    }

    public String getFirstValue() {
        return getValues()[0];
    }

    public String getKey() {
        return this.key;
    }

    public String[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + Arrays.hashCode(this.values);
    }

    public boolean isFalse() {
        return getValues().length == 1 && getValues()[0].toLowerCase().equals("false");
    }

    public boolean isTrue() {
        return getValues().length == 1 && getValues()[0].toLowerCase().equals("true");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append(": ");
        Iterator it = Arrays.asList(getValues()).iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
