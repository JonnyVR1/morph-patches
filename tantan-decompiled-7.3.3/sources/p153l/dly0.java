package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class dly0 extends j1v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sni0 f89591a;

    public dly0(qoy0 qoy0Var, sni0 sni0Var) {
        this.f89591a = sni0Var;
    }

    @Override // p153l.txv0
    /* JADX INFO: renamed from: v1 */
    public final void mo116910v1(Status status, @Nullable zzc zzcVar) {
        TaskUtil.setResultOrApiException(status, zzcVar != null ? new gx0(zzcVar.zzb(), zzcVar.zza()) : null, this.f89591a);
    }
}
