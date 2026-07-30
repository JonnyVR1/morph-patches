package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class ftv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ tpu0.BinderC20238b f99272e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f99273f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftv0(tpu0 tpu0Var, tpu0.BinderC20238b binderC20238b) {
        super(tpu0Var);
        this.f99272e = binderC20238b;
        this.f99273f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f99273f.f171518i)).unregisterOnMeasurementEventListener(this.f99272e);
    }
}
