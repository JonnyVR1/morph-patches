package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class x3y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f190926a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzo f190927b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f190928c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ b3y0 f190929d;

    public x3y0(b3y0 b3y0Var, AtomicReference atomicReference, zzo zzoVar, Bundle bundle) {
        this.f190926a = atomicReference;
        this.f190927b = zzoVar;
        this.f190928c = bundle;
        this.f190929d = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f190926a) {
            try {
                try {
                    cjw0 cjw0Var = this.f190929d.f73268d;
                    if (cjw0Var == null) {
                        this.f190929d.zzj().m211412A().m123936a("Failed to get trigger URIs; not connected to service");
                        this.f190926a.notify();
                    } else {
                        Preconditions.checkNotNull(this.f190927b);
                        this.f190926a.set(cjw0Var.mo107268V1(this.f190927b, this.f190928c));
                        this.f190929d.m100127g0();
                        this.f190926a.notify();
                    }
                } catch (RemoteException e) {
                    this.f190929d.zzj().m211412A().m123937b("Failed to get trigger URIs; remote exception", e);
                    this.f190926a.notify();
                }
            } catch (Throwable th) {
                this.f190926a.notify();
                throw th;
            }
        }
    }
}
