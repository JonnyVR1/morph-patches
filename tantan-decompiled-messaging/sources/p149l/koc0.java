package p149l;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001ay\u0010\u000b\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00042\u0006\u0010\u0007\u001a\u00020\u00062.\u0010\n\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"", "K", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "map", "", "isRelationCollection", "Lkotlin/Function1;", "", "fetchBlock", "a", "(Ljava/util/HashMap;ZLkotlin/jvm/functions/Function1;)V", "room-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@JvmName
public final class koc0 {
    /* JADX INFO: renamed from: a */
    public static final <K, V> void m146693a(@NotNull HashMap<K, V> map, boolean z, @NotNull Function1<? super HashMap<K, V>, Unit> function1) {
        int i;
        map.getClass();
        function1.getClass();
        HashMap map2 = new HashMap(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        Iterator<K> it = map.keySet().iterator();
        loop0: while (true) {
            i = 0;
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                K next = it.next();
                if (z) {
                    next.getClass();
                    map2.put(next, map.get(next));
                } else {
                    next.getClass();
                    map2.put(next, null);
                }
                i++;
            } while (i != 999);
            function1.invoke(map2);
            if (!z) {
                map.putAll(map2);
            }
            map2.clear();
        }
        if (i > 0) {
            function1.invoke(map2);
            if (z) {
                return;
            }
            map.putAll(map2);
        }
    }
}
