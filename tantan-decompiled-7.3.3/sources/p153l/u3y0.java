package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class u3y0 extends c4u0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x8y0 f177411a;

    public u3y0(x8y0 x8y0Var) {
        this.f177411a = x8y0Var;
    }

    @Override // p153l.c4u0, p153l.vwy0
    /* JADX INFO: renamed from: G2 */
    public final void mo107971G2(Status status) throws RemoteException {
        this.f177411a.setResult(status);
    }
}
