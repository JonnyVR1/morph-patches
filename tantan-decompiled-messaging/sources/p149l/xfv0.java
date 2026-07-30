package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class xfv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ tpu0.BinderC20239c f192721e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f192722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfv0(tpu0 tpu0Var, tpu0.BinderC20239c binderC20239c) {
        super(tpu0Var);
        this.f192721e = binderC20239c;
        this.f192722f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f192722f.f171518i)).setEventInterceptor(this.f192721e);
    }
}
