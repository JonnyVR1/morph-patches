package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class t2v0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f167553e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f167554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2v0(tpu0 tpu0Var, Bundle bundle) {
        super(tpu0Var);
        this.f167553e = bundle;
        this.f167554f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f167554f.f171518i)).setConsentThirdParty(this.f167553e, this.f171519a);
    }
}
