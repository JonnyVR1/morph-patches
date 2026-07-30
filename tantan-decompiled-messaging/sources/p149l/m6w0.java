package p149l;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class m6w0 extends p6w0 {

    /* JADX INFO: renamed from: d */
    @SuppressLint({"StaticFieldLeak"})
    public static final m6w0 f131772d = new m6w0();

    /* JADX INFO: renamed from: i */
    public static m6w0 m153308i() {
        return f131772d;
    }

    @Override // p149l.p6w0
    /* JADX INFO: renamed from: b */
    public final void mo153309b(boolean z) {
        Iterator it = n6w0.m158096a().m158098c().iterator();
        while (it.hasNext()) {
            e7w0 e7w0VarM115115g = ((e6w0) it.next()).m115115g();
            if (e7w0VarM115115g.m115227l()) {
                x6w0.m207211a().m207213b(e7w0VarM115115g.m115216a(), "setState", true != z ? "backgrounded" : "foregrounded");
            }
        }
    }

    @Override // p149l.p6w0
    /* JADX INFO: renamed from: c */
    public final boolean mo153310c() {
        Iterator it = n6w0.m158096a().m158097b().iterator();
        while (it.hasNext()) {
            View viewM115114f = ((e6w0) it.next()).m115114f();
            if (viewM115114f != null && viewM115114f.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
