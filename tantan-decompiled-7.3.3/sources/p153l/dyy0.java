package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.C2399b1;
import com.google.android.gms.internal.play_billing.C2407f0;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class dyy0 implements lqv0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f91310a;

    /* JADX INFO: renamed from: b */
    public final uqy0 f91311b = new nwy0(this);

    public dyy0(C2399b1 c2399b1) {
        this.f91310a = new WeakReference(c2399b1);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m118730a(Object obj) {
        return this.f91311b.mo147936c(obj);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m118731b(Throwable th) {
        C2407f0 c2407f0 = new C2407f0(th);
        dyv0 dyv0Var = uqy0.f180543f;
        uqy0 uqy0Var = this.f91311b;
        if (!dyv0Var.mo97944d(uqy0Var, null, c2407f0)) {
            return false;
        }
        uqy0.m197438b(uqy0Var);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C2399b1 c2399b1 = (C2399b1) this.f91310a.get();
        boolean zCancel = this.f91311b.cancel(z);
        if (!zCancel || c2399b1 == null) {
            return zCancel;
        }
        c2399b1.m14805a();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f91311b.get();
    }

    @Override // p153l.lqv0
    /* JADX INFO: renamed from: h */
    public final void mo14948h(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f91311b.mo14948h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f91311b.f180545a instanceof vqw0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f91311b.isDone();
    }

    public final String toString() {
        return this.f91311b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f91311b.get(j, timeUnit);
    }
}
