package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class ikv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xhu0 f115451e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f115452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikv0(zyu0 zyu0Var, xhu0 xhu0Var) {
        super(zyu0Var);
        this.f115451e = xhu0Var;
        this.f115452f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f115452f.f206644i)).getCurrentScreenName(this.f115451e);
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: b */
    public final void mo106547b() {
        this.f115451e.zza(null);
    }
}
