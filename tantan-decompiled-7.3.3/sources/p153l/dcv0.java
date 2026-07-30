package p153l;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dcv0 extends kss0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gdv0 f87830a;

    public /* synthetic */ dcv0(gdv0 gdv0Var, xav0 xav0Var) {
        this.f87830a = gdv0Var;
    }

    @Override // p153l.lss0
    /* JADX INFO: renamed from: m0 */
    public final void mo115302m0(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        synchronized (this.f87830a.f103738a) {
            this.f87830a.f103740c = false;
            this.f87830a.f103741d = true;
            arrayList = new ArrayList(this.f87830a.f103739b);
            this.f87830a.f103739b.clear();
        }
        ium iumVarM129947o = gdv0.m129947o(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((nm50) arrayList.get(i)).mo157271a(iumVarM129947o);
        }
    }
}
