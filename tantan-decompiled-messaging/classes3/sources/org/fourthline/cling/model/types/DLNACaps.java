package org.fourthline.cling.model.types;

import java.util.Arrays;
import org.fourthline.cling.model.ModelUtil;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DLNACaps {
    final String[] caps;

    public DLNACaps(String[] strArr) {
        this.caps = strArr;
    }

    public static DLNACaps valueOf(String str) throws InvalidValueException {
        if (str == null || str.length() == 0) {
            return new DLNACaps(new String[0]);
        }
        String[] strArrSplit = str.split(",");
        String[] strArr = new String[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            strArr[i] = strArrSplit[i].trim();
        }
        return new DLNACaps(strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.caps, ((DLNACaps) obj).caps);
    }

    public String[] getCaps() {
        return this.caps;
    }

    public int hashCode() {
        return Arrays.hashCode(this.caps);
    }

    public String toString() {
        return ModelUtil.toCommaSeparatedList(getCaps());
    }
}
