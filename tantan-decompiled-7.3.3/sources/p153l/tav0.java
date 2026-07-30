package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class tav0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zyu0 f172807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tav0(zyu0 zyu0Var) {
        super(zyu0Var);
        this.f172807e = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f172807e.f206644i)).resetAnalyticsData(this.f206645a);
    }
}
