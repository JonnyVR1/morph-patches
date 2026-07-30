package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class q3w0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zyu0.BinderC21939b f155497e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f155498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3w0(zyu0 zyu0Var, zyu0.BinderC21939b binderC21939b) {
        super(zyu0Var);
        this.f155497e = binderC21939b;
        this.f155498f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f155498f.f206644i)).registerOnMeasurementEventListener(this.f155497e);
    }
}
