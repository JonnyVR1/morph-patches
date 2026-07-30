package p149l;

import com.google.android.gms.ads.internal.overlay.BinderC2073b;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cgs0 implements vgs0 {
    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        q9t0 q9t0Var = (q9t0) obj;
        if (q9t0Var.mo13681d() != null) {
            q9t0Var.mo13681d().zza();
        }
        BinderC2073b binderC2073bZzL = q9t0Var.zzL();
        if (binderC2073bZzL != null) {
            binderC2073bZzL.zzb();
            return;
        }
        BinderC2073b binderC2073bMo13720y = q9t0Var.mo13720y();
        if (binderC2073bMo13720y != null) {
            binderC2073bMo13720y.zzb();
        } else {
            x2t0.m206869g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
