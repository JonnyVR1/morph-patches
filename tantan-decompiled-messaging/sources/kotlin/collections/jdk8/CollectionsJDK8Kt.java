package kotlin.collections.jdk8;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Action;
import java.util.Map;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.TypeIntrinsics;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010%\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u0002H\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0001H\u0087\b¢\u0006\u0002\u0010\u0007\u001aH\u0010\b\u001a\u00020\t\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003\"\t\b\u0001\u0010\u0001¢\u0006\u0002\b\u0003*\u0012\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0006\b\u0001\u0012\u0002H\u00010\n2\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u000b\u001a\u0002H\u0001H\u0087\b¢\u0006\u0002\u0010\f¨\u0006\r"}, m87232d2 = {"getOrDefault", j6f.GPS_MEASUREMENT_INTERRUPTED, "K", "Lkotlin/internal/OnlyInputTypes;", "", Constants.KEY_KEY, "defaultValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", Action.remove, "", "", "value", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlin-stdlib-jdk8"}, m87233k = 2, m87234mv = {2, 2, 0}, m87235pn = "kotlin.collections", m87236xi = 48)
@JvmName
public final class CollectionsJDK8Kt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    @InlineOnly
    private static final <K, V> V getOrDefault(Map<? extends K, ? extends V> map, K k, V v2) {
        map.getClass();
        return map.getOrDefault(k, v2);
    }

    @SinceKotlin
    @InlineOnly
    private static final <K, V> boolean remove(Map<? extends K, ? extends V> map, K k, V v2) {
        map.getClass();
        return TypeIntrinsics.m87537d(map).remove(k, v2);
    }
}
