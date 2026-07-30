package p153l;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class b0w0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Intent f74295e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f74296f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0w0(zyu0 zyu0Var, Intent intent) {
        super(zyu0Var);
        this.f74295e = intent;
        this.f74296f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f74296f.f206644i)).setSgtmDebugInfo(this.f74295e);
    }
}
