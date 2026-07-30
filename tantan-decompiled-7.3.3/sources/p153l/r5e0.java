package p153l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r5e0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m179863a(Map.Entry[] entryArr) {
        HashMap map = new HashMap(entryArr.length);
        for (Map.Entry entry : entryArr) {
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                ypg0.m217021a("duplicate key: ", key);
                return null;
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
