package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class oux0 extends wut0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rzx0 f145751a;

    public oux0(rzx0 rzx0Var) {
        this.f145751a = rzx0Var;
    }

    @Override // p149l.wut0, p149l.pny0
    /* JADX INFO: renamed from: G2 */
    public final void mo166146G2(Status status) throws RemoteException {
        this.f145751a.setResult(status);
    }
}
