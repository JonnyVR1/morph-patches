package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzg;
import com.google.android.gms.location.zzr;

/* JADX INFO: loaded from: classes6.dex */
public final class wpt0 extends fyx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sni0 f190346a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f190347b;

    public wpt0(sni0 sni0Var, zzr zzrVar) {
        this.f190346a = sni0Var;
        this.f190347b = zzrVar;
    }

    @Override // p153l.h3y0
    /* JADX INFO: renamed from: Z7 */
    public final void mo133524Z7(zzg zzgVar) {
        TaskUtil.setResultOrApiException(zzgVar.getStatus(), this.f190346a);
    }

    @Override // p153l.h3y0
    public final void zze() throws RemoteException {
        this.f190347b.zzf();
    }
}
