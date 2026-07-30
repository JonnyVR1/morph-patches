package p153l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class tfw0 {

    /* JADX INFO: renamed from: c */
    public static final tfw0 f174014c = new tfw0();

    /* JADX INFO: renamed from: a */
    public final ArrayList f174015a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f174016b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static tfw0 m190995a() {
        return f174014c;
    }

    /* JADX INFO: renamed from: b */
    public final Collection m190996b() {
        return Collections.unmodifiableCollection(this.f174016b);
    }

    /* JADX INFO: renamed from: c */
    public final Collection m190997c() {
        return Collections.unmodifiableCollection(this.f174015a);
    }

    /* JADX INFO: renamed from: d */
    public final void m190998d(kfw0 kfw0Var) {
        this.f174015a.add(kfw0Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m190999e(kfw0 kfw0Var) {
        ArrayList arrayList = this.f174015a;
        boolean zM191001g = m191001g();
        arrayList.remove(kfw0Var);
        this.f174016b.remove(kfw0Var);
        if (!zM191001g || m191001g()) {
            return;
        }
        egw0.m120810c().m120816g();
    }

    /* JADX INFO: renamed from: f */
    public final void m191000f(kfw0 kfw0Var) {
        ArrayList arrayList = this.f174016b;
        boolean zM191001g = m191001g();
        arrayList.add(kfw0Var);
        if (zM191001g) {
            return;
        }
        egw0.m120810c().m120815f();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m191001g() {
        return this.f174016b.size() > 0;
    }
}
