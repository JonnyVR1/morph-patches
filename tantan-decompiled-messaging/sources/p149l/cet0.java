package p149l;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzg;

/* JADX INFO: loaded from: classes6.dex */
public final class cet0 extends zox0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f80494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sei0 f80495b;

    public cet0(Object obj, sei0 sei0Var) {
        this.f80494a = obj;
        this.f80495b = sei0Var;
    }

    @Override // p149l.bux0
    /* JADX INFO: renamed from: Z7 */
    public final void mo104005Z7(zzg zzgVar) {
        TaskUtil.setResultOrApiException(zzgVar.getStatus(), this.f80494a, this.f80495b);
    }

    @Override // p149l.bux0
    public final void zze() {
    }
}
