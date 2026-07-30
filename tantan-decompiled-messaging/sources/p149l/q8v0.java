package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class q8v0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ r8u0 f153339e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f153340f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8v0(tpu0 tpu0Var, r8u0 r8u0Var) {
        super(tpu0Var);
        this.f153339e = r8u0Var;
        this.f153340f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f153340f.f171518i)).getCachedAppInstanceId(this.f153339e);
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: b */
    public final void mo102712b() {
        this.f153339e.zza(null);
    }
}
