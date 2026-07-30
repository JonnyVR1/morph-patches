package p149l;

import com.p046p1.mobile.putong.core.api.inject.module.CoreBuzzHolder;
import com.p046p1.mobile.putong.core.api.inject.module.CoreCardHolder;
import com.p046p1.mobile.putong.core.api.inject.module.CoreGlobalHolder;
import com.p046p1.mobile.putong.core.api.inject.module.CoreInnovationHolder;
import com.p046p1.mobile.putong.core.api.inject.module.CoreMemberHolder;
import com.p046p1.mobile.putong.core.api.inject.module.CoreMessageHolder;
import com.p046p1.mobile.putong.core.api.inject.module.CorePayHolder;
import com.p046p1.mobile.putong.core.api.inject.module.CoreProfileHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class f700 {

    /* JADX INFO: renamed from: b */
    public static volatile f700 f96189b;

    /* JADX INFO: renamed from: a */
    public Map<String, sp2> f96190a = new LinkedHashMap();

    public f700() {
        this.f96190a.put("coreGlobal", new CoreGlobalHolder());
        this.f96190a.put("coreInnovation", new CoreInnovationHolder());
        this.f96190a.put("coreMember", new CoreMemberHolder());
        this.f96190a.put("corePay", new CorePayHolder());
        this.f96190a.put("coreMessage", new CoreMessageHolder());
        this.f96190a.put("coreCard", new CoreCardHolder());
        this.f96190a.put("coreProfile", new CoreProfileHolder());
        this.f96190a.put("coreBuzz", new CoreBuzzHolder());
        Iterator<sp2> it = this.f96190a.values().iterator();
        while (it.hasNext()) {
            it.next().m185319h();
        }
    }

    /* JADX INFO: renamed from: k */
    public static f700 m119712k() {
        if (f96189b == null) {
            synchronized (f700.class) {
                try {
                    if (f96189b == null) {
                        f96189b = new f700();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f96189b;
    }

    /* JADX INFO: renamed from: e */
    public void m119713e() {
        Iterator<sp2> it = this.f96190a.values().iterator();
        while (it.hasNext()) {
            it.next().m185313a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m119714f() {
        Iterator<sp2> it = this.f96190a.values().iterator();
        while (it.hasNext()) {
            it.next().m185314b();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m119715g(boolean z) {
        Iterator<sp2> it = this.f96190a.values().iterator();
        while (it.hasNext()) {
            it.next().m185315c(z);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m119716h() {
        Iterator<sp2> it = this.f96190a.values().iterator();
        while (it.hasNext()) {
            it.next().m185316d();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m119717i() {
        Iterator<sp2> it = this.f96190a.values().iterator();
        while (it.hasNext()) {
            it.next().m185317e();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m119718j() {
        Iterator<sp2> it = this.f96190a.values().iterator();
        while (it.hasNext()) {
            it.next().m185318f();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m119719l() {
        Iterator<sp2> it = this.f96190a.values().iterator();
        while (it.hasNext()) {
            it.next().m185320i();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m119720m() {
        Iterator<sp2> it = this.f96190a.values().iterator();
        while (it.hasNext()) {
            it.next().m185321j();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m119721n() {
        Iterator<sp2> it = this.f96190a.values().iterator();
        while (it.hasNext()) {
            it.next().m185322k();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m119722o(int i) {
        Iterator<sp2> it = this.f96190a.values().iterator();
        while (it.hasNext()) {
            it.next().m185323l(i);
        }
    }

    /* JADX INFO: renamed from: p */
    public C22306c<roj0> m119723p() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f96190a.values(), new e30() { // from class: l.b700
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(((sp2) obj).m185324m().take(1));
            }
        });
        return mkd0.m154982p(arrayList, new faj() { // from class: l.c700
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public C22306c<roj0> m119724q() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f96190a.values(), new e30() { // from class: l.d700
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(((sp2) obj).m185325n().take(1));
            }
        });
        return mkd0.m154982p(arrayList, new faj() { // from class: l.e700
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return roj0.f160388a;
            }
        });
    }
}
