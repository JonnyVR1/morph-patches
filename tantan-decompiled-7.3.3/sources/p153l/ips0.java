package p153l;

import com.google.android.gms.ads.internal.overlay.BinderC2096b;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ips0 implements bqs0 {
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        if (wit0Var.mo13735d() != null) {
            wit0Var.mo13735d().zza();
        }
        BinderC2096b binderC2096bZzL = wit0Var.zzL();
        if (binderC2096bZzL != null) {
            binderC2096bZzL.zzb();
            return;
        }
        BinderC2096b binderC2096bMo13774y = wit0Var.mo13774y();
        if (binderC2096bMo13774y != null) {
            binderC2096bMo13774y.zzb();
        } else {
            dct0.m115298g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
