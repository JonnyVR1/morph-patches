package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class cbv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ r8u0 f80183e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f80184f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbv0(tpu0 tpu0Var, r8u0 r8u0Var) {
        super(tpu0Var);
        this.f80183e = r8u0Var;
        this.f80184f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f80184f.f171518i)).getCurrentScreenName(this.f80183e);
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: b */
    public final void mo102712b() {
        this.f80183e.zza(null);
    }
}
