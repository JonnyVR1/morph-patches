package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class cdv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f81280e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f81281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdv0(zyu0 zyu0Var, long j) {
        super(zyu0Var);
        this.f81280e = j;
        this.f81281f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f81281f.f206644i)).setSessionTimeoutDuration(this.f81280e);
    }
}
