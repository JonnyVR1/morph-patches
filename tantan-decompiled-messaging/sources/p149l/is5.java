package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.CacheByClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR$\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Ll/is5;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/CacheByClass;", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", Constants.KEY_KEY, "a", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/ConcurrentHashMap;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class is5<V> extends CacheByClass<V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<Class<?>, V> compute;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<Class<?>, V> cache;

    /* JADX WARN: Multi-variable type inference failed */
    public is5(@NotNull Function1<? super Class<?>, ? extends V> function1) {
        function1.getClass();
        this.compute = function1;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    /* JADX INFO: renamed from: a */
    public V mo87654a(@NotNull Class<?> key) {
        key.getClass();
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.cache;
        V v2 = (V) concurrentHashMap.get(key);
        if (v2 != null) {
            return v2;
        }
        V vInvoke = this.compute.invoke(key);
        V v3 = (V) concurrentHashMap.putIfAbsent(key, vInvoke);
        return v3 == null ? vInvoke : v3;
    }
}
