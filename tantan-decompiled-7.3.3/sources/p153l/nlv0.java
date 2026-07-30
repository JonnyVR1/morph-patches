package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class nlv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xhu0 f142595e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f142596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlv0(zyu0 zyu0Var, xhu0 xhu0Var) {
        super(zyu0Var);
        this.f142595e = xhu0Var;
        this.f142596f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f142596f.f206644i)).generateEventId(this.f142595e);
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: b */
    public final void mo106547b() {
        this.f142595e.zza(null);
    }
}
