package p153l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public final class jev0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Future f120527a;

    /* JADX INFO: renamed from: b */
    public final edv0 f120528b;

    public jev0(Future future, edv0 edv0Var) {
        this.f120527a = future;
        this.f120528b = edv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thM166818a;
        Object obj2 = this.f120527a;
        if ((obj2 instanceof j8w0) && (thM166818a = o9w0.m166818a((j8w0) obj2)) != null) {
            this.f120528b.zza(thM166818a);
            return;
        }
        try {
            Future future = this.f120527a;
            if (!future.isDone()) {
                throw new IllegalStateException(nfs0.m162939a("Future was expected to be done: %s", future));
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
            this.f120528b.zzb(obj);
        } catch (ExecutionException e) {
            this.f120528b.zza(e.getCause());
        } catch (Throwable th2) {
            this.f120528b.zza(th2);
        }
    }

    public final String toString() {
        has0 has0VarM200832a = vcs0.m200832a(this);
        has0VarM200832a.m134193a(this.f120528b);
        return has0VarM200832a.toString();
    }
}
