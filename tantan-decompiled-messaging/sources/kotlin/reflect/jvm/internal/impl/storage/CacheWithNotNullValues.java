package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface CacheWithNotNullValues<K, V> {
    @NotNull
    /* JADX INFO: renamed from: a */
    V mo92435a(K k, @NotNull Function0<? extends V> function0);
}
