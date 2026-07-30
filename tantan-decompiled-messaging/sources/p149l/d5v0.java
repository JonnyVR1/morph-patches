package p149l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public final class d5v0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Future f84560a;

    /* JADX INFO: renamed from: b */
    public final y3v0 f84561b;

    public d5v0(Future future, y3v0 y3v0Var) {
        this.f84560a = future;
        this.f84561b = y3v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thM133936a;
        Object obj2 = this.f84560a;
        if ((obj2 instanceof dzv0) && (thM133936a = i0w0.m133936a((dzv0) obj2)) != null) {
            this.f84561b.zza(thM133936a);
            return;
        }
        try {
            Future future = this.f84560a;
            if (!future.isDone()) {
                throw new IllegalStateException(h6s0.m129526a("Future was expected to be done: %s", future));
            }
            boolean z = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            this.f84561b.zzb(obj);
        } catch (ExecutionException e) {
            this.f84561b.zza(e.getCause());
        } catch (Throwable th2) {
            this.f84561b.zza(th2);
        }
    }

    public final String toString() {
        b1s0 b1s0VarM167277a = p3s0.m167277a(this);
        b1s0VarM167277a.m99868a(this.f84561b);
        return b1s0VarM167277a.toString();
    }
}
