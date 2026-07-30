package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class n1v0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ tpu0 f136728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1v0(tpu0 tpu0Var) {
        super(tpu0Var);
        this.f136728e = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f136728e.f171518i)).resetAnalyticsData(this.f171519a);
    }
}
