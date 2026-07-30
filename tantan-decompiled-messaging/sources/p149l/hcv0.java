package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class hcv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ r8u0 f107108e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f107109f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcv0(tpu0 tpu0Var, r8u0 r8u0Var) {
        super(tpu0Var);
        this.f107108e = r8u0Var;
        this.f107109f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f107109f.f171518i)).generateEventId(this.f107108e);
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: b */
    public final void mo102712b() {
        this.f107108e.zza(null);
    }
}
