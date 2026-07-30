package p149l;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class h6y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f106150a = true;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzo f106151b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f106152c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzae f106153d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzae f106154e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ b3y0 f106155f;

    public h6y0(b3y0 b3y0Var, boolean z, zzo zzoVar, boolean z2, zzae zzaeVar, zzae zzaeVar2) {
        this.f106151b = zzoVar;
        this.f106152c = z2;
        this.f106153d = zzaeVar;
        this.f106154e = zzaeVar2;
        this.f106155f = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cjw0 cjw0Var = this.f106155f.f73268d;
        if (cjw0Var == null) {
            this.f106155f.zzj().m211412A().m123936a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f106150a) {
            Preconditions.checkNotNull(this.f106151b);
            this.f106155f.m100142K(cjw0Var, this.f106152c ? null : this.f106153d, this.f106151b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f106154e.zza)) {
                    Preconditions.checkNotNull(this.f106151b);
                    cjw0Var.mo107272g3(this.f106153d, this.f106151b);
                } else {
                    cjw0Var.mo107276n7(this.f106153d);
                }
            } catch (RemoteException e) {
                this.f106155f.zzj().m211412A().m123937b("Failed to send conditional user property to the service", e);
            }
        }
        this.f106155f.m100127g0();
    }
}
