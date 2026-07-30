package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class czu0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f83109e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f83110f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czu0(tpu0 tpu0Var, Bundle bundle) {
        super(tpu0Var);
        this.f83109e = bundle;
        this.f83110f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f83110f.f171518i)).setConsent(this.f83109e, this.f171519a);
    }
}
