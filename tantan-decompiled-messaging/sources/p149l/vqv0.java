package p149l;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class vqv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Intent f182679e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f182680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqv0(tpu0 tpu0Var, Intent intent) {
        super(tpu0Var);
        this.f182679e = intent;
        this.f182680f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f182680f.f171518i)).setSgtmDebugInfo(this.f182679e);
    }
}
