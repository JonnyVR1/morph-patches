package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.C2376b1;
import com.google.android.gms.internal.play_billing.C2384f0;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class xoy0 implements fhv0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f193889a;

    /* JADX INFO: renamed from: b */
    public final ohy0 f193890b = new hny0(this);

    public xoy0(C2376b1 c2376b1) {
        this.f193889a = new WeakReference(c2376b1);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m210454a(Object obj) {
        return this.f193890b.mo117967c(obj);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m210455b(Throwable th) {
        C2384f0 c2384f0 = new C2384f0(th);
        xov0 xov0Var = ohy0.f144073f;
        ohy0 ohy0Var = this.f193890b;
        if (!xov0Var.mo147961d(ohy0Var, null, c2384f0)) {
            return false;
        }
        ohy0.m164487b(ohy0Var);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C2376b1 c2376b1 = (C2376b1) this.f193889a.get();
        boolean zCancel = this.f193890b.cancel(z);
        if (!zCancel || c2376b1 == null) {
            return zCancel;
        }
        c2376b1.m14751a();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f193890b.get();
    }

    @Override // p149l.fhv0
    /* JADX INFO: renamed from: h */
    public final void mo14894h(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f193890b.mo14894h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f193890b.f144075a instanceof phw0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f193890b.isDone();
    }

    public final String toString() {
        return this.f193890b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f193890b.get(j, timeUnit);
    }
}
