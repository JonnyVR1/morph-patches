package p153l;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzg;

/* JADX INFO: loaded from: classes6.dex */
public final class int0 extends fyx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f115999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sni0 f116000b;

    public int0(Object obj, sni0 sni0Var) {
        this.f115999a = obj;
        this.f116000b = sni0Var;
    }

    @Override // p153l.h3y0
    /* JADX INFO: renamed from: Z7 */
    public final void mo133524Z7(zzg zzgVar) {
        TaskUtil.setResultOrApiException(zzgVar.getStatus(), this.f115999a, this.f116000b);
    }

    @Override // p153l.h3y0
    public final void zze() {
    }
}
