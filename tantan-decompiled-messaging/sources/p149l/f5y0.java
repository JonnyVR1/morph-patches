package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class f5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f95213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qdu0 f95214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3y0 f95215c;

    public f5y0(b3y0 b3y0Var, zzo zzoVar, qdu0 qdu0Var) {
        this.f95213a = zzoVar;
        this.f95214b = qdu0Var;
        this.f95215c = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                boolean zM15358z = this.f95215c.mo15088d().m192695G().m15358z();
                b3y0 b3y0Var = this.f95215c;
                if (!zM15358z) {
                    b3y0Var.zzj().m211418G().m123936a("Analytics storage consent denied; will not get app instance id");
                    this.f95215c.mo15096l().m15195U0(null);
                    this.f95215c.mo15088d().f175521i.m197914b(null);
                    this.f95215c.mo15089e().m101471N(this.f95214b, null);
                    return;
                }
                cjw0 cjw0Var = b3y0Var.f73268d;
                if (cjw0Var == null) {
                    this.f95215c.zzj().m211412A().m123936a("Failed to get app instance id");
                    this.f95215c.mo15089e().m101471N(this.f95214b, null);
                    return;
                }
                Preconditions.checkNotNull(this.f95213a);
                String strMo107266U6 = cjw0Var.mo107266U6(this.f95213a);
                if (strMo107266U6 != null) {
                    this.f95215c.mo15096l().m15195U0(strMo107266U6);
                    this.f95215c.mo15088d().f175521i.m197914b(strMo107266U6);
                }
                this.f95215c.m100127g0();
                this.f95215c.mo15089e().m101471N(this.f95214b, strMo107266U6);
            } catch (RemoteException e) {
                this.f95215c.zzj().m211412A().m123937b("Failed to get app instance id", e);
                this.f95215c.mo15089e().m101471N(this.f95214b, null);
            }
        } catch (Throwable th) {
            this.f95215c.mo15089e().m101471N(this.f95214b, null);
            throw th;
        }
    }
}
