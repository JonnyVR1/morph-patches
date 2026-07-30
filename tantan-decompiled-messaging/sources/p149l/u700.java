package p149l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p046p1.mobile.putong.api.serviceprovider.AccountServiceHolder;
import com.p046p1.mobile.putong.api.serviceprovider.CoreServiceHolder;
import com.p046p1.mobile.putong.api.serviceprovider.FeedServiceHolder;
import com.p046p1.mobile.putong.api.serviceprovider.LiveServiceHolder;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import com.tantanapp.putong.module.AccountModuleHolder;
import com.tantanapp.putong.module.CoreModuleHolder;
import com.tantanapp.putong.module.FeedModuleHolder;
import com.tantanapp.putong.module.LiveModuleHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class u700 {

    /* JADX INFO: renamed from: g */
    public static final List<String> f174904g = vwb.m200324f0(SchemeKey.account, "core", "feed", "live");

    /* JADX INFO: renamed from: h */
    public static volatile u700 f174905h = new u700();

    /* JADX INFO: renamed from: i */
    public static boolean f174906i = false;

    /* JADX INFO: renamed from: a */
    public final Map<String, sp2> f174907a;

    /* JADX INFO: renamed from: b */
    public C22392a<roj0> f174908b;

    /* JADX INFO: renamed from: c */
    public final Map<String, C22392a<roj0>> f174909c;

    /* JADX INFO: renamed from: d */
    public final Map<String, zq2> f174910d;

    /* JADX INFO: renamed from: e */
    public final Map<String, C22392a<roj0>> f174911e;

    /* JADX INFO: renamed from: f */
    public C22392a<roj0> f174912f;

    /* JADX INFO: renamed from: l.u700$a */
    public class C20368a implements hvc0.InterfaceC17411a {
        public C20368a() {
        }

        @Override // p149l.hvc0.InterfaceC17411a
        /* JADX INFO: renamed from: a */
        public String mo133158a(int i) {
            String strM192065s = u700.this.m192065s(i);
            if (!TextUtils.isEmpty(strM192065s) && ((sp2) u700.this.f174907a.get(strM192065s)).mo33279g() != null) {
                return ((sp2) u700.this.f174907a.get(strM192065s)).mo33279g().getContext().getString(i);
            }
            throw new Resources.NotFoundException("string res " + Integer.toHexString(i) + " not found.");
        }

        @Override // p149l.hvc0.InterfaceC17411a
        /* JADX INFO: renamed from: b */
        public int mo133159b(int i) {
            String strM192065s = u700.this.m192065s(i);
            if (!TextUtils.isEmpty(strM192065s) && ((sp2) u700.this.f174907a.get(strM192065s)).mo33279g() != null) {
                return ((sp2) u700.this.f174907a.get(strM192065s)).mo33279g().getContext().getResources().getColor(i);
            }
            throw new Resources.NotFoundException("color res " + Integer.toHexString(i) + " not found.");
        }

        @Override // p149l.hvc0.InterfaceC17411a
        /* JADX INFO: renamed from: c */
        public Drawable mo133160c(int i) {
            String strM192065s = u700.this.m192065s(i);
            if (!TextUtils.isEmpty(strM192065s) && ((sp2) u700.this.f174907a.get(strM192065s)).mo33279g() != null) {
                return ((sp2) u700.this.f174907a.get(strM192065s)).mo33279g().getContext().getResources().getDrawable(i);
            }
            throw new Resources.NotFoundException("drawable res " + Integer.toHexString(i) + " not found.");
        }
    }

    public u700() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f174907a = linkedHashMap;
        this.f174908b = C22392a.m221512b();
        this.f174909c = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.f174910d = linkedHashMap2;
        this.f174911e = new LinkedHashMap();
        this.f174912f = C22392a.m221512b();
        linkedHashMap.put(SchemeKey.account, new AccountModuleHolder());
        linkedHashMap.put("core", new CoreModuleHolder());
        linkedHashMap.put("feed", new FeedModuleHolder());
        linkedHashMap.put("live", new LiveModuleHolder());
        linkedHashMap2.put(SchemeKey.account, new AccountServiceHolder());
        linkedHashMap2.put("core", new CoreServiceHolder());
        linkedHashMap2.put("feed", new FeedServiceHolder());
        linkedHashMap2.put("live", new LiveServiceHolder());
        for (String str : f174904g) {
            this.f174909c.put(str, C22392a.m221512b());
            this.f174911e.put(str, C22392a.m221512b());
        }
        C22306c.combineLatest(this.f174909c.values(), new faj() { // from class: l.o700
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return roj0.f160388a;
            }
        }).subscribe(new e30() { // from class: l.p700
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147468a.m192069w((roj0) obj);
            }
        });
        C22306c.combineLatest(this.f174911e.values(), new faj() { // from class: l.q700
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return roj0.f160388a;
            }
        }).subscribe(new e30() { // from class: l.r700
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158002a.m192070x((roj0) obj);
            }
        });
        m192059G();
    }

    /* JADX INFO: renamed from: H */
    public static <T> C22306c.d<T, T> m192039H() {
        return new C22306c.d() { // from class: l.t700
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.combineLatest((C22306c) obj, qib0.f154721j0.f174908b.take(1), new x9j() { // from class: l.k700
                    @Override // p149l.x9j
                    public final Object call(Object obj2, Object obj3) {
                        return u700.m192044e(obj2, (roj0) obj3);
                    }
                });
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m192044e(Object obj, roj0 roj0Var) {
        return obj;
    }

    /* JADX INFO: renamed from: r */
    public static u700 m192052r() {
        return f174905h;
    }

    /* JADX INFO: renamed from: A */
    public void m192053A() {
        Iterator<sp2> it = this.f174907a.values().iterator();
        while (it.hasNext()) {
            it.next().m185321j();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m192054B() {
        Iterator<sp2> it = this.f174907a.values().iterator();
        while (it.hasNext()) {
            it.next().m185322k();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m192055C(int i) {
        Iterator<sp2> it = this.f174907a.values().iterator();
        while (it.hasNext()) {
            it.next().m185323l(i);
        }
    }

    /* JADX INFO: renamed from: D */
    public C22306c<roj0> m192056D() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f174907a.values(), new e30() { // from class: l.j700
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(((sp2) obj).m185324m().take(1));
            }
        });
        return mkd0.m154982p(arrayList, new faj() { // from class: l.l700
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public C22306c<roj0> m192057E() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f174907a.values(), new e30() { // from class: l.m700
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(((sp2) obj).m185325n().take(1));
            }
        });
        return mkd0.m154982p(arrayList, new faj() { // from class: l.n700
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public void m192058F(String str) {
        if (this.f174909c.get(str).m221515e() == null) {
            this.f174909c.get(str).m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m192059G() {
        hvc0.m133157d(new C20368a());
    }

    /* JADX INFO: renamed from: m */
    public void m192060m() {
        Iterator<String> it = this.f174907a.keySet().iterator();
        while (it.hasNext()) {
            this.f174907a.get(it.next()).m185313a();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m192061n(String str) {
        this.f174907a.get(str).m185314b();
        if (SchemeKey.account.equals(str)) {
            m192058F(SchemeKey.account);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m192062o(boolean z) {
        for (String str : this.f174907a.keySet()) {
            this.f174907a.get(str).m185315c(z);
            m192058F(str);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m192063p() {
        Iterator<String> it = this.f174907a.keySet().iterator();
        while (it.hasNext()) {
            this.f174907a.get(it.next()).m185316d();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m192064q() {
        Iterator<sp2> it = this.f174907a.values().iterator();
        while (it.hasNext()) {
            it.next().m185318f();
        }
        f8c.m119878o().m119887i();
    }

    /* JADX INFO: renamed from: s */
    public final String m192065s(int i) {
        String hexString = Integer.toHexString(i);
        if (hexString.startsWith("0x60")) {
            return SchemeKey.account;
        }
        if (hexString.startsWith("0x61")) {
            return "core";
        }
        if (hexString.startsWith("0x62")) {
            return "feed";
        }
        if (hexString.startsWith("0x63")) {
            return "live";
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public void m192066t(String str) {
        f174906i = true;
        m192067u(str);
        f174906i = false;
    }

    /* JADX INFO: renamed from: u */
    public final void m192067u(String str) {
        final sp2 sp2Var = this.f174907a.get(str);
        sp2Var.m185319h();
        e51.m114774y(new Runnable() { // from class: l.s700
            @Override // java.lang.Runnable
            public final void run() {
                sp2Var.m185320i();
            }
        });
        sp2Var.m185317e();
        m192068v(str);
        if (SchemeKey.account.equals(str)) {
            return;
        }
        sp2Var.m185314b();
    }

    /* JADX INFO: renamed from: v */
    public final void m192068v(String str) {
        zq2 zq2Var = this.f174910d.get(str);
        nje0 nje0Var = qib0.f154713b0;
        am5 am5Var = (am5) qib0.f154714c0;
        zq2Var.m219835c();
        str.getClass();
        switch (str) {
            case "account":
                nje0Var.f139230a = (AccountService) zq2Var.mo29603b();
                am5Var.f70557a = (AccountCommonService) zq2Var.mo29602a();
                break;
            case "core":
                nje0Var.f139231b = (CoreService) zq2Var.mo29603b();
                am5Var.f70558b = (CoreCommonService) zq2Var.mo29602a();
                break;
            case "feed":
                nje0Var.f139233d = (FeedService) zq2Var.mo29603b();
                am5Var.f70559c = (FeedCommonService) zq2Var.mo29602a();
                break;
            case "live":
                nje0Var.f139232c = (LiveService) zq2Var.mo29603b();
                am5Var.f70560d = (LiveCommonService) zq2Var.mo29602a();
                break;
        }
        this.f174911e.get(str).m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m192069w(roj0 roj0Var) {
        this.f174908b.m132487l(roj0Var);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m192070x(roj0 roj0Var) {
        this.f174912f.m132487l(roj0Var);
    }

    /* JADX INFO: renamed from: y */
    public C22392a<roj0> m192071y(String str) {
        return this.f174909c.get(str);
    }

    /* JADX INFO: renamed from: z */
    public boolean m192072z(String str) {
        return this.f174909c.get(str).m221515e() != null;
    }
}
