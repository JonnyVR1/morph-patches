package p149l;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kig0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f123330a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f123331b;

    /* JADX INFO: renamed from: c */
    public final int f123332c;

    /* JADX INFO: renamed from: d */
    public final int f123333d;

    /* JADX INFO: renamed from: e */
    public final int f123334e;

    /* JADX INFO: renamed from: f */
    public final int f123335f;

    /* JADX INFO: renamed from: g */
    public final String f123336g;

    public kig0(LinkedHashMap linkedHashMap) {
        this.f123331b = Collections.unmodifiableMap(linkedHashMap);
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int length = ((String) entry.getKey()).length();
            i = length > i ? length : i;
            i2 = length < i2 ? length : i2;
            String str = (String) entry.getValue();
            int length2 = str.length();
            if (length2 > 0) {
                if (!this.f123330a.containsKey(str)) {
                    this.f123330a.put(str, (String) entry.getKey());
                }
                i4 = length2 > i4 ? length2 : i4;
                if (length2 < i3) {
                    i3 = length2;
                }
            }
        }
        this.f123332c = i;
        this.f123334e = i4;
        this.f123333d = i2;
        this.f123335f = i3;
        this.f123336g = ".gz";
    }
}
