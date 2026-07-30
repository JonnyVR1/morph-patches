package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzg;
import com.google.android.gms.location.zzu;

/* JADX INFO: loaded from: classes6.dex */
public final class qot0 extends fyx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sni0 f158757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzu f158758b;

    public qot0(sni0 sni0Var, zzu zzuVar) {
        this.f158757a = sni0Var;
        this.f158758b = zzuVar;
    }

    @Override // p153l.h3y0
    /* JADX INFO: renamed from: Z7 */
    public final void mo133524Z7(zzg zzgVar) {
        TaskUtil.setResultOrApiException(zzgVar.getStatus(), this.f158757a);
    }

    @Override // p153l.h3y0
    public final void zze() throws RemoteException {
        this.f158758b.zze();
    }
}
