package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class r4y0 extends wut0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d8y0 f157740a;

    public r4y0(d8y0 d8y0Var) {
        this.f157740a = d8y0Var;
    }

    @Override // p149l.wut0, p149l.pny0
    /* JADX INFO: renamed from: S2 */
    public final void mo170474S2(Status status) throws RemoteException {
        this.f157740a.setResult(status);
    }
}
