package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class i8v0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f113372e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f113373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8v0(zyu0 zyu0Var, Bundle bundle) {
        super(zyu0Var);
        this.f113372e = bundle;
        this.f113373f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f113373f.f206644i)).setConsent(this.f113372e, this.f206645a);
    }
}
