package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class r3y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f157619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f157620b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzo f157621c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f157622d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qdu0 f157623e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ b3y0 f157624f;

    public r3y0(b3y0 b3y0Var, String str, String str2, zzo zzoVar, boolean z, qdu0 qdu0Var) {
        this.f157619a = str;
        this.f157620b = str2;
        this.f157621c = zzoVar;
        this.f157622d = z;
        this.f157623e = qdu0Var;
        this.f157624f = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            try {
                cjw0 cjw0Var = this.f157624f.f73268d;
                if (cjw0Var == null) {
                    this.f157624f.zzj().m211412A().m123938c("Failed to get user properties; not connected to service", this.f157619a, this.f157620b);
                    this.f157624f.mo15089e().m101470M(this.f157623e, bundle);
                } else {
                    Preconditions.checkNotNull(this.f157621c);
                    Bundle bundleM101422A = bey0.m101422A(cjw0Var.mo107264M7(this.f157619a, this.f157620b, this.f157622d, this.f157621c));
                    this.f157624f.m100127g0();
                    this.f157624f.mo15089e().m101470M(this.f157623e, bundleM101422A);
                }
            } catch (RemoteException e) {
                this.f157624f.zzj().m211412A().m123938c("Failed to get user properties; remote exception", this.f157619a, e);
                this.f157624f.mo15089e().m101470M(this.f157623e, bundle);
            }
        } catch (Throwable th) {
            this.f157624f.mo15089e().m101470M(this.f157623e, bundle);
            throw th;
        }
    }
}
