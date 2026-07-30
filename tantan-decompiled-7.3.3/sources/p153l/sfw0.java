package p153l;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class sfw0 extends vfw0 {

    /* JADX INFO: renamed from: d */
    @SuppressLint({"StaticFieldLeak"})
    public static final sfw0 f167776d = new sfw0();

    /* JADX INFO: renamed from: i */
    public static sfw0 m185674i() {
        return f167776d;
    }

    @Override // p153l.vfw0
    /* JADX INFO: renamed from: b */
    public final void mo185675b(boolean z) {
        Iterator it = tfw0.m190995a().m190997c().iterator();
        while (it.hasNext()) {
            kgw0 kgw0VarM149627g = ((kfw0) it.next()).m149627g();
            if (kgw0VarM149627g.m149775l()) {
                dgw0.m115758a().m115760b(kgw0VarM149627g.m149764a(), "setState", true != z ? "backgrounded" : "foregrounded");
            }
        }
    }

    @Override // p153l.vfw0
    /* JADX INFO: renamed from: c */
    public final boolean mo185676c() {
        Iterator it = tfw0.m190995a().m190996b().iterator();
        while (it.hasNext()) {
            View viewM149626f = ((kfw0) it.next()).m149626f();
            if (viewM149626f != null && viewM149626f.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
