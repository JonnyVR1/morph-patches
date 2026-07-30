package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class l2w0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zyu0.BinderC21939b f129815e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f129816f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2w0(zyu0 zyu0Var, zyu0.BinderC21939b binderC21939b) {
        super(zyu0Var);
        this.f129815e = binderC21939b;
        this.f129816f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f129816f.f206644i)).unregisterOnMeasurementEventListener(this.f129815e);
    }
}
