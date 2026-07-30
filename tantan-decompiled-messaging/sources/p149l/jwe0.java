package p149l;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m87232d2 = {"Ll/jwe0;", "", "", "", "a", "()Ljava/util/Map;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "prefs", "", "b", "Ljava/util/Set;", "keySet", "datastore_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class jwe0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences prefs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Set<String> keySet;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m143656a() {
        Map<String, ?> all = this.prefs.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set == null ? true : set.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.toSet((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }
}
