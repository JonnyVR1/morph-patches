package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class w3v0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f184447e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f184448f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3v0(tpu0 tpu0Var, long j) {
        super(tpu0Var);
        this.f184447e = j;
        this.f184448f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f184448f.f171518i)).setSessionTimeoutDuration(this.f184447e);
    }
}
