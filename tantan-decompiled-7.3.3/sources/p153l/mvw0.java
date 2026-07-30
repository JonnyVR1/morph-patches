package p153l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public final class mvw0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Future f138959a;

    /* JADX INFO: renamed from: b */
    public final lvw0 f138960b;

    public mvw0(Future future, lvw0 lvw0Var) {
        this.f138959a = future;
        this.f138960b = lvw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thM142394a;
        Object obj = this.f138959a;
        if ((obj instanceof hww0) && (thM142394a = iww0.m142394a((hww0) obj)) != null) {
            this.f138960b.zza(thM142394a);
            return;
        }
        try {
            this.f138960b.zzb(pvw0.m173989p(this.f138959a));
        } catch (ExecutionException e) {
            this.f138960b.zza(e.getCause());
        } catch (Throwable th) {
            this.f138960b.zza(th);
        }
    }

    public final String toString() {
        iow0 iow0VarM146482a = jow0.m146482a(this);
        iow0VarM146482a.m141357a(this.f138960b);
        return iow0VarM146482a.toString();
    }
}
