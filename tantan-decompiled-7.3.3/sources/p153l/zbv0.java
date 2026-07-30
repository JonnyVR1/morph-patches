package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class zbv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f203707e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f203708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbv0(zyu0 zyu0Var, Bundle bundle) {
        super(zyu0Var);
        this.f203707e = bundle;
        this.f203708f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f203708f.f206644i)).setConsentThirdParty(this.f203707e, this.f206645a);
    }
}
