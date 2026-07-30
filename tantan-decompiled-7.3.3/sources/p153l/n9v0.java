package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class n9v0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Boolean f140955e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f140956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9v0(zyu0 zyu0Var, Boolean bool) {
        super(zyu0Var);
        this.f140955e = bool;
        this.f140956f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        Boolean bool = this.f140955e;
        zyu0 zyu0Var = this.f140956f;
        if (bool != null) {
            ((pgu0) Preconditions.checkNotNull(zyu0Var.f206644i)).setMeasurementEnabled(this.f140955e.booleanValue(), this.f206645a);
        } else {
            ((pgu0) Preconditions.checkNotNull(zyu0Var.f206644i)).clearMeasurementEnabled(this.f206645a);
        }
    }
}
