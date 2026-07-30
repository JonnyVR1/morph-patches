package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.AbstractResolvableFuture;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class t3d0<V> extends AbstractResolvableFuture<V> {
    /* JADX INFO: renamed from: a */
    public static <V> t3d0<V> m189082a() {
        return new t3d0<>();
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
    public boolean setFuture(hpr<? extends V> hprVar) {
        return super.setFuture(hprVar);
    }
}
