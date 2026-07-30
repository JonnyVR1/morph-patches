package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class h0v0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Boolean f105255e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f105256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0v0(tpu0 tpu0Var, Boolean bool) {
        super(tpu0Var);
        this.f105255e = bool;
        this.f105256f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        Boolean bool = this.f105255e;
        tpu0 tpu0Var = this.f105256f;
        if (bool != null) {
            ((j7u0) Preconditions.checkNotNull(tpu0Var.f171518i)).setMeasurementEnabled(this.f105255e.booleanValue(), this.f171519a);
        } else {
            ((j7u0) Preconditions.checkNotNull(tpu0Var.f171518i)).clearMeasurementEnabled(this.f171519a);
        }
    }
}
