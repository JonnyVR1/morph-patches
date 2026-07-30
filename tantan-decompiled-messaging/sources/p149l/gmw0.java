package p149l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public final class gmw0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Future f103523a;

    /* JADX INFO: renamed from: b */
    public final fmw0 f103524b;

    public gmw0(Future future, fmw0 fmw0Var) {
        this.f103523a = future;
        this.f103524b = fmw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thM107835a;
        Object obj = this.f103523a;
        if ((obj instanceof bnw0) && (thM107835a = cnw0.m107835a((bnw0) obj)) != null) {
            this.f103524b.zza(thM107835a);
            return;
        }
        try {
            this.f103524b.zzb(jmw0.m142243p(this.f103523a));
        } catch (ExecutionException e) {
            this.f103524b.zza(e.getCause());
        } catch (Throwable th) {
            this.f103524b.zza(th);
        }
    }

    public final String toString() {
        cfw0 cfw0VarM111509a = dfw0.m111509a(this);
        cfw0VarM111509a.m106613a(this.f103524b);
        return cfw0VarM111509a.toString();
    }
}
