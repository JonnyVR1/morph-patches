package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class vyv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xhu0 f186425e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f186426f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zyu0 f186427g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyv0(zyu0 zyu0Var, xhu0 xhu0Var, int i) {
        super(zyu0Var);
        this.f186425e = xhu0Var;
        this.f186426f = i;
        this.f186427g = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f186427g.f206644i)).getTestFlag(this.f186425e, this.f186426f);
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: b */
    public final void mo106547b() {
        this.f186425e.zza(null);
    }
}
