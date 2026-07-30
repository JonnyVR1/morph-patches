package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class h6v0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f106121e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f106122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6v0(tpu0 tpu0Var, String str) {
        super(tpu0Var);
        this.f106121e = str;
        this.f106122f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f106122f.f171518i)).endAdUnitExposure(this.f106121e, this.f171520b);
    }
}
