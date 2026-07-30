package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class m7v0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f132493e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f132494f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7v0(tpu0 tpu0Var, String str) {
        super(tpu0Var);
        this.f132493e = str;
        this.f132494f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f132494f.f171518i)).beginAdUnitExposure(this.f132493e, this.f171520b);
    }
}
