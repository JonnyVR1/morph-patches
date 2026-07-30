package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class hnv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f108720e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f108721f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnv0(tpu0 tpu0Var, boolean z) {
        super(tpu0Var);
        this.f108720e = z;
        this.f108721f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f108721f.f171518i)).setDataCollectionEnabled(this.f108720e);
    }
}
