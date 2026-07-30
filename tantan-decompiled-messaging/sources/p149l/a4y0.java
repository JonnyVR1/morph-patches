package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class a4y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f67578a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzo f67579b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3y0 f67580c;

    public a4y0(b3y0 b3y0Var, AtomicReference atomicReference, zzo zzoVar) {
        this.f67578a = atomicReference;
        this.f67579b = zzoVar;
        this.f67580c = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f67578a) {
            try {
                try {
                    boolean zM15358z = this.f67580c.mo15088d().m192695G().m15358z();
                    b3y0 b3y0Var = this.f67580c;
                    if (!zM15358z) {
                        b3y0Var.zzj().m211418G().m123936a("Analytics storage consent denied; will not get app instance id");
                        this.f67580c.mo15096l().m15195U0(null);
                        this.f67580c.mo15088d().f175521i.m197914b(null);
                        this.f67578a.set(null);
                        this.f67578a.notify();
                        return;
                    }
                    cjw0 cjw0Var = b3y0Var.f73268d;
                    if (cjw0Var == null) {
                        this.f67580c.zzj().m211412A().m123936a("Failed to get app instance id");
                        this.f67578a.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.f67579b);
                    this.f67578a.set(cjw0Var.mo107266U6(this.f67579b));
                    String str = (String) this.f67578a.get();
                    if (str != null) {
                        this.f67580c.mo15096l().m15195U0(str);
                        this.f67580c.mo15088d().f175521i.m197914b(str);
                    }
                    this.f67580c.m100127g0();
                    this.f67578a.notify();
                } catch (RemoteException e) {
                    this.f67580c.zzj().m211412A().m123937b("Failed to get app instance id", e);
                    this.f67578a.notify();
                }
            } catch (Throwable th) {
                this.f67578a.notify();
                throw th;
            }
        }
    }
}
