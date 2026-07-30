package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzg;
import com.google.android.gms.location.zzu;

/* JADX INFO: loaded from: classes6.dex */
public final class kft0 extends zox0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sei0 f122971a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzu f122972b;

    public kft0(sei0 sei0Var, zzu zzuVar) {
        this.f122971a = sei0Var;
        this.f122972b = zzuVar;
    }

    @Override // p149l.bux0
    /* JADX INFO: renamed from: Z7 */
    public final void mo104005Z7(zzg zzgVar) {
        TaskUtil.setResultOrApiException(zzgVar.getStatus(), this.f122971a);
    }

    @Override // p149l.bux0
    public final void zze() throws RemoteException {
        this.f122972b.zze();
    }
}
