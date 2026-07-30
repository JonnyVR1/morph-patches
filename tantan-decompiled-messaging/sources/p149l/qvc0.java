package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.AbstractResolvableFuture;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class qvc0<V> extends AbstractResolvableFuture<V> {
    /* JADX INFO: renamed from: a */
    public static <V> qvc0<V> m176696a() {
        return new qvc0<>();
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean set(@Nullable V v2) {
        return super.set(v2);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setFuture(gnr<? extends V> gnrVar) {
        return super.setFuture(gnrVar);
    }
}
