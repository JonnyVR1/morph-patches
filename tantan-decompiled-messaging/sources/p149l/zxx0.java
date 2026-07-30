package p149l;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.C2458g;

/* JADX INFO: loaded from: classes6.dex */
public final class zxx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qdu0 f205568a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f205569b;

    public zxx0(C2458g c2458g, qdu0 qdu0Var) {
        this.f205568a = qdu0Var;
        this.f205569b = c2458g;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        n8y0 n8y0VarMo15099o = this.f205569b.mo15099o();
        if (n8y0VarMo15099o.mo15088d().m192695G().m15358z()) {
            if (!n8y0VarMo15099o.mo15088d().m192708t(n8y0VarMo15099o.zzb().currentTimeMillis()) && n8y0VarMo15099o.mo15088d().f175531s.m187782a() != 0) {
                lValueOf = Long.valueOf(n8y0VarMo15099o.mo15088d().f175531s.m187782a());
            }
            if (lValueOf != null) {
                this.f205569b.f165891a.m194106G().m101468L(this.f205568a, lValueOf.longValue());
            }
            try {
                this.f205568a.zza(null);
            } catch (RemoteException e) {
                this.f205569b.f165891a.zzj().m211412A().m123937b("getSessionId failed with exception", e);
                return;
            }
        }
        n8y0VarMo15099o.zzj().m211418G().m123936a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        if (lValueOf != null) {
            this.f205569b.f165891a.m194106G().m101468L(this.f205568a, lValueOf.longValue());
        } else {
            this.f205568a.zza(null);
        }
    }
}
