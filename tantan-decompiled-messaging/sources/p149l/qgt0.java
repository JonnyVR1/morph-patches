package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzg;
import com.google.android.gms.location.zzr;

/* JADX INFO: loaded from: classes6.dex */
public final class qgt0 extends zox0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sei0 f154375a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f154376b;

    public qgt0(sei0 sei0Var, zzr zzrVar) {
        this.f154375a = sei0Var;
        this.f154376b = zzrVar;
    }

    @Override // p149l.bux0
    /* JADX INFO: renamed from: Z7 */
    public final void mo104005Z7(zzg zzgVar) {
        TaskUtil.setResultOrApiException(zzgVar.getStatus(), this.f154375a);
    }

    @Override // p149l.bux0
    public final void zze() throws RemoteException {
        this.f154376b.zzf();
    }
}
