package p153l;

import com.p051p1.mobile.putong.core.api.inject.module.CoreBuzzHolder;
import com.p051p1.mobile.putong.core.api.inject.module.CoreCardHolder;
import com.p051p1.mobile.putong.core.api.inject.module.CoreGlobalHolder;
import com.p051p1.mobile.putong.core.api.inject.module.CoreInnovationHolder;
import com.p051p1.mobile.putong.core.api.inject.module.CoreMemberHolder;
import com.p051p1.mobile.putong.core.api.inject.module.CoreMessageHolder;
import com.p051p1.mobile.putong.core.api.inject.module.CorePayHolder;
import com.p051p1.mobile.putong.core.api.inject.module.CoreProfileHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class of00 {

    /* JADX INFO: renamed from: b */
    public static volatile of00 f147030b;

    /* JADX INFO: renamed from: a */
    public Map<String, jq2> f147031a = new LinkedHashMap();

    public of00() {
        this.f147031a.put("coreGlobal", new CoreGlobalHolder());
        this.f147031a.put("coreInnovation", new CoreInnovationHolder());
        this.f147031a.put("coreMember", new CoreMemberHolder());
        this.f147031a.put("corePay", new CorePayHolder());
        this.f147031a.put("coreMessage", new CoreMessageHolder());
        this.f147031a.put("coreCard", new CoreCardHolder());
        this.f147031a.put("coreProfile", new CoreProfileHolder());
        this.f147031a.put("coreBuzz", new CoreBuzzHolder());
        Iterator<jq2> it = this.f147031a.values().iterator();
        while (it.hasNext()) {
            it.next().m146544h();
        }
    }

    /* JADX INFO: renamed from: k */
    public static of00 m167378k() {
        if (f147030b == null) {
            synchronized (of00.class) {
                try {
                    if (f147030b == null) {
                        f147030b = new of00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f147030b;
    }

    /* JADX INFO: renamed from: e */
    public void m167379e() {
        Iterator<jq2> it = this.f147031a.values().iterator();
        while (it.hasNext()) {
            it.next().m146538a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m167380f() {
        Iterator<jq2> it = this.f147031a.values().iterator();
        while (it.hasNext()) {
            it.next().m146539b();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m167381g(boolean z) {
        Iterator<jq2> it = this.f147031a.values().iterator();
        while (it.hasNext()) {
            it.next().m146540c(z);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m167382h() {
        Iterator<jq2> it = this.f147031a.values().iterator();
        while (it.hasNext()) {
            it.next().m146541d();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m167383i() {
        Iterator<jq2> it = this.f147031a.values().iterator();
        while (it.hasNext()) {
            it.next().m146542e();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m167384j() {
        Iterator<jq2> it = this.f147031a.values().iterator();
        while (it.hasNext()) {
            it.next().m146543f();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m167385l() {
        Iterator<jq2> it = this.f147031a.values().iterator();
        while (it.hasNext()) {
            it.next().m146545i();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m167386m() {
        Iterator<jq2> it = this.f147031a.values().iterator();
        while (it.hasNext()) {
            it.next().m146546j();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m167387n() {
        Iterator<jq2> it = this.f147031a.values().iterator();
        while (it.hasNext()) {
            it.next().m146547k();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m167388o(int i) {
        Iterator<jq2> it = this.f147031a.values().iterator();
        while (it.hasNext()) {
            it.next().m146548l(i);
        }
    }

    /* JADX INFO: renamed from: p */
    public C22421c<uxj0> m167389p() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f147031a.values(), new y20() { // from class: l.kf00
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(((jq2) obj).m146549m().take(1));
            }
        });
        return psd0.m173623p(arrayList, new zcj() { // from class: l.lf00
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public C22421c<uxj0> m167390q() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f147031a.values(), new y20() { // from class: l.mf00
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(((jq2) obj).m146550n().take(1));
            }
        });
        return psd0.m173623p(arrayList, new zcj() { // from class: l.nf00
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return uxj0.f181467a;
            }
        });
    }
}
