package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class xdy0 extends c4u0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jhy0 f193654a;

    public xdy0(jhy0 jhy0Var) {
        this.f193654a = jhy0Var;
    }

    @Override // p153l.c4u0, p153l.vwy0
    /* JADX INFO: renamed from: S2 */
    public final void mo107972S2(Status status) throws RemoteException {
        this.f193654a.setResult(status);
    }
}
