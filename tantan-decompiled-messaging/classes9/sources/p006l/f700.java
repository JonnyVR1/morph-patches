package p006l;

import com.p000p1.mobile.putong.core.api.inject.module.CoreBuzzHolder;
import com.p000p1.mobile.putong.core.api.inject.module.CoreCardHolder;
import com.p000p1.mobile.putong.core.api.inject.module.CoreGlobalHolder;
import com.p000p1.mobile.putong.core.api.inject.module.CoreInnovationHolder;
import com.p000p1.mobile.putong.core.api.inject.module.CoreMemberHolder;
import com.p000p1.mobile.putong.core.api.inject.module.CoreMessageHolder;
import com.p000p1.mobile.putong.core.api.inject.module.CorePayHolder;
import com.p000p1.mobile.putong.core.api.inject.module.CoreProfileHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l.e30;
import l.faj;
import l.mkd0;
import l.roj0;
import l.sp2;
import l.vwb;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class f700 {

    /* JADX INFO: renamed from: b */
    public static volatile f700 f12539b;

    /* JADX INFO: renamed from: a */
    public Map<String, sp2> f12540a = new LinkedHashMap();

    public f700() {
        this.f12540a.put("coreGlobal", new CoreGlobalHolder());
        this.f12540a.put("coreInnovation", new CoreInnovationHolder());
        this.f12540a.put("coreMember", new CoreMemberHolder());
        this.f12540a.put("corePay", new CorePayHolder());
        this.f12540a.put("coreMessage", new CoreMessageHolder());
        this.f12540a.put("coreCard", new CoreCardHolder());
        this.f12540a.put("coreProfile", new CoreProfileHolder());
        this.f12540a.put("coreBuzz", new CoreBuzzHolder());
        Iterator<sp2> it = this.f12540a.values().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    /* JADX INFO: renamed from: k */
    public static f700 m15089k() {
        if (f12539b == null) {
            synchronized (f700.class) {
                try {
                    if (f12539b == null) {
                        f12539b = new f700();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12539b;
    }

    /* JADX INFO: renamed from: e */
    public void m15090e() {
        Iterator<sp2> it = this.f12540a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m15091f() {
        Iterator<sp2> it = this.f12540a.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m15092g(boolean z) {
        Iterator<sp2> it = this.f12540a.values().iterator();
        while (it.hasNext()) {
            it.next().c(z);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m15093h() {
        Iterator<sp2> it = this.f12540a.values().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m15094i() {
        Iterator<sp2> it = this.f12540a.values().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m15095j() {
        Iterator<sp2> it = this.f12540a.values().iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m15096l() {
        Iterator<sp2> it = this.f12540a.values().iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m15097m() {
        Iterator<sp2> it = this.f12540a.values().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m15098n() {
        Iterator<sp2> it = this.f12540a.values().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m15099o(int i) {
        Iterator<sp2> it = this.f12540a.values().iterator();
        while (it.hasNext()) {
            it.next().l(i);
        }
    }

    /* JADX INFO: renamed from: p */
    public c<roj0> m15100p() {
        final ArrayList arrayList = new ArrayList();
        vwb.z(this.f12540a.values(), new e30() { // from class: l.b700
            public final void call(Object obj) {
                arrayList.add(((sp2) obj).m().take(1));
            }
        });
        return mkd0.p(arrayList, new faj() { // from class: l.c700
            public final Object call(Object[] objArr) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public c<roj0> m15101q() {
        final ArrayList arrayList = new ArrayList();
        vwb.z(this.f12540a.values(), new e30() { // from class: l.d700
            public final void call(Object obj) {
                arrayList.add(((sp2) obj).n().take(1));
            }
        });
        return mkd0.p(arrayList, new faj() { // from class: l.e700
            public final Object call(Object[] objArr) {
                return roj0.a;
            }
        });
    }
}
