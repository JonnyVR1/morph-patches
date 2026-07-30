package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class buv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xhu0 f78552e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f78553f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buv0(zyu0 zyu0Var, xhu0 xhu0Var) {
        super(zyu0Var);
        this.f78552e = xhu0Var;
        this.f78553f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f78553f.f206644i)).getSessionId(this.f78552e);
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: b */
    public final void mo106547b() {
        this.f78552e.zza(null);
    }
}
