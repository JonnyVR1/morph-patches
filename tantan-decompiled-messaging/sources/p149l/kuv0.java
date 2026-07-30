package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class kuv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ tpu0.BinderC20238b f124722e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f124723f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuv0(tpu0 tpu0Var, tpu0.BinderC20238b binderC20238b) {
        super(tpu0Var);
        this.f124722e = binderC20238b;
        this.f124723f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f124723f.f171518i)).registerOnMeasurementEventListener(this.f124722e);
    }
}
