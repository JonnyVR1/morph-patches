package p006l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l.qhg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final /* synthetic */ class nxd0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m20256a(Map.Entry[] entryArr) {
        HashMap map = new HashMap(entryArr.length);
        for (Map.Entry entry : entryArr) {
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                qhg0.a("duplicate key: ", key);
                return null;
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
