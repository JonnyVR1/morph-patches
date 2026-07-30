package p149l;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: loaded from: classes6.dex */
public final class w5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbf f184796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f184797b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qdu0 f184798c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ b3y0 f184799d;

    public w5y0(b3y0 b3y0Var, zzbf zzbfVar, String str, qdu0 qdu0Var) {
        this.f184796a = zzbfVar;
        this.f184797b = str;
        this.f184798c = qdu0Var;
        this.f184799d = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                cjw0 cjw0Var = this.f184799d.f73268d;
                if (cjw0Var == null) {
                    this.f184799d.zzj().m211412A().m123936a("Discarding data. Failed to send event to service to bundle");
                    this.f184799d.mo15089e().m101476Q(this.f184798c, null);
                } else {
                    byte[] bArrMo107269V7 = cjw0Var.mo107269V7(this.f184796a, this.f184797b);
                    this.f184799d.m100127g0();
                    this.f184799d.mo15089e().m101476Q(this.f184798c, bArrMo107269V7);
                }
            } catch (RemoteException e) {
                this.f184799d.zzj().m211412A().m123937b("Failed to send event to the service to bundle", e);
                this.f184799d.mo15089e().m101476Q(this.f184798c, null);
            }
        } catch (Throwable th) {
            this.f184799d.mo15089e().m101476Q(this.f184798c, null);
            throw th;
        }
    }
}
