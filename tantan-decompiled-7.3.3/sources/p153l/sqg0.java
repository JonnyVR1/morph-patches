package p153l;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sqg0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f170167a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f170168b;

    /* JADX INFO: renamed from: c */
    public final int f170169c;

    /* JADX INFO: renamed from: d */
    public final int f170170d;

    /* JADX INFO: renamed from: e */
    public final int f170171e;

    /* JADX INFO: renamed from: f */
    public final int f170172f;

    /* JADX INFO: renamed from: g */
    public final String f170173g;

    public sqg0(LinkedHashMap linkedHashMap) {
        this.f170168b = Collections.unmodifiableMap(linkedHashMap);
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
                if (!this.f170167a.containsKey(str)) {
                    this.f170167a.put(str, (String) entry.getKey());
                }
                i4 = length2 > i4 ? length2 : i4;
                if (length2 < i3) {
                    i3 = length2;
                }
            }
        }
        this.f170169c = i;
        this.f170171e = i4;
        this.f170170d = i2;
        this.f170172f = i3;
        this.f170173g = ".gz";
    }
}
