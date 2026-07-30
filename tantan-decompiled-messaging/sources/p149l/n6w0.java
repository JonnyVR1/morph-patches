package p149l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class n6w0 {

    /* JADX INFO: renamed from: c */
    public static final n6w0 f137454c = new n6w0();

    /* JADX INFO: renamed from: a */
    public final ArrayList f137455a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f137456b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static n6w0 m158096a() {
        return f137454c;
    }

    /* JADX INFO: renamed from: b */
    public final Collection m158097b() {
        return Collections.unmodifiableCollection(this.f137456b);
    }

    /* JADX INFO: renamed from: c */
    public final Collection m158098c() {
        return Collections.unmodifiableCollection(this.f137455a);
    }

    /* JADX INFO: renamed from: d */
    public final void m158099d(e6w0 e6w0Var) {
        this.f137455a.add(e6w0Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m158100e(e6w0 e6w0Var) {
        ArrayList arrayList = this.f137455a;
        boolean zM158102g = m158102g();
        arrayList.remove(e6w0Var);
        this.f137456b.remove(e6w0Var);
        if (!zM158102g || m158102g()) {
            return;
        }
        y6w0.m213252c().m213257g();
    }

    /* JADX INFO: renamed from: f */
    public final void m158101f(e6w0 e6w0Var) {
        ArrayList arrayList = this.f137456b;
        boolean zM158102g = m158102g();
        arrayList.add(e6w0Var);
        if (zM158102g) {
            return;
        }
        y6w0.m213252c().m213256f();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m158102g() {
        return this.f137456b.size() > 0;
    }
}
