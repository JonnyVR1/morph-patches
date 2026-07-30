package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class bmv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ r8u0 f76351e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f76352f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmv0(tpu0 tpu0Var, r8u0 r8u0Var) {
        super(tpu0Var);
        this.f76351e = r8u0Var;
        this.f76352f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f76352f.f171518i)).getAppInstanceId(this.f76351e);
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: b */
    public final void mo102712b() {
        this.f76351e.zza(null);
    }
}
