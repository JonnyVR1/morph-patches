package p149l;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class x2v0 extends ejs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a4v0 f190836a;

    public /* synthetic */ x2v0(a4v0 a4v0Var, r1v0 r1v0Var) {
        this.f190836a = a4v0Var;
    }

    @Override // p149l.fjs0
    /* JADX INFO: renamed from: m0 */
    public final void mo112111m0(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        synchronized (this.f190836a.f67561a) {
            this.f190836a.f67563c = false;
            this.f190836a.f67564d = true;
            arrayList = new ArrayList(this.f190836a.f67562b);
            this.f190836a.f67562b.clear();
        }
        gsm gsmVarM94936o = a4v0.m94936o(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((ge50) arrayList.get(i)).mo125679a(gsmVarM94936o);
        }
    }
}
