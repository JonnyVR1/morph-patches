package p153l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p051p1.mobile.putong.api.serviceprovider.AccountServiceHolder;
import com.p051p1.mobile.putong.api.serviceprovider.CoreServiceHolder;
import com.p051p1.mobile.putong.api.serviceprovider.FeedServiceHolder;
import com.p051p1.mobile.putong.api.serviceprovider.LiveServiceHolder;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import com.tantanapp.putong.module.AccountModuleHolder;
import com.tantanapp.putong.module.CoreModuleHolder;
import com.tantanapp.putong.module.FeedModuleHolder;
import com.tantanapp.putong.module.LiveModuleHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class dg00 {

    /* JADX INFO: renamed from: g */
    public static final List<String> f88240g = jyb.m147507f0(SchemeKey.account, "core", "feed", "live");

    /* JADX INFO: renamed from: h */
    public static volatile dg00 f88241h = new dg00();

    /* JADX INFO: renamed from: i */
    public static boolean f88242i = false;

    /* JADX INFO: renamed from: a */
    public final Map<String, jq2> f88243a;

    /* JADX INFO: renamed from: b */
    public C22507a<uxj0> f88244b;

    /* JADX INFO: renamed from: c */
    public final Map<String, C22507a<uxj0>> f88245c;

    /* JADX INFO: renamed from: d */
    public final Map<String, pr2> f88246d;

    /* JADX INFO: renamed from: e */
    public final Map<String, C22507a<uxj0>> f88247e;

    /* JADX INFO: renamed from: f */
    public C22507a<uxj0> f88248f;

    /* JADX INFO: renamed from: l.dg00$a */
    public class C16518a implements k3d0.InterfaceC18082a {
        public C16518a() {
        }

        @Override // p153l.k3d0.InterfaceC18082a
        /* JADX INFO: renamed from: a */
        public String mo115603a(int i) {
            String strM115595s = dg00.this.m115595s(i);
            if (!TextUtils.isEmpty(strM115595s) && ((jq2) dg00.this.f88243a.get(strM115595s)).mo34282g() != null) {
                return ((jq2) dg00.this.f88243a.get(strM115595s)).mo34282g().getContext().getString(i);
            }
            throw new Resources.NotFoundException("string res " + Integer.toHexString(i) + " not found.");
        }

        @Override // p153l.k3d0.InterfaceC18082a
        /* JADX INFO: renamed from: b */
        public int mo115604b(int i) {
            String strM115595s = dg00.this.m115595s(i);
            if (!TextUtils.isEmpty(strM115595s) && ((jq2) dg00.this.f88243a.get(strM115595s)).mo34282g() != null) {
                return ((jq2) dg00.this.f88243a.get(strM115595s)).mo34282g().getContext().getResources().getColor(i);
            }
            throw new Resources.NotFoundException("color res " + Integer.toHexString(i) + " not found.");
        }

        @Override // p153l.k3d0.InterfaceC18082a
        /* JADX INFO: renamed from: c */
        public Drawable mo115605c(int i) {
            String strM115595s = dg00.this.m115595s(i);
            if (!TextUtils.isEmpty(strM115595s) && ((jq2) dg00.this.f88243a.get(strM115595s)).mo34282g() != null) {
                return ((jq2) dg00.this.f88243a.get(strM115595s)).mo34282g().getContext().getResources().getDrawable(i);
            }
            throw new Resources.NotFoundException("drawable res " + Integer.toHexString(i) + " not found.");
        }
    }

    public dg00() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f88243a = linkedHashMap;
        this.f88244b = C22507a.m222758b();
        this.f88245c = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.f88246d = linkedHashMap2;
        this.f88247e = new LinkedHashMap();
        this.f88248f = C22507a.m222758b();
        linkedHashMap.put(SchemeKey.account, new AccountModuleHolder());
        linkedHashMap.put("core", new CoreModuleHolder());
        linkedHashMap.put("feed", new FeedModuleHolder());
        linkedHashMap.put("live", new LiveModuleHolder());
        linkedHashMap2.put(SchemeKey.account, new AccountServiceHolder());
        linkedHashMap2.put("core", new CoreServiceHolder());
        linkedHashMap2.put("feed", new FeedServiceHolder());
        linkedHashMap2.put("live", new LiveServiceHolder());
        for (String str : f88240g) {
            this.f88245c.put(str, C22507a.m222758b());
            this.f88247e.put(str, C22507a.m222758b());
        }
        C22421c.combineLatest(this.f88245c.values(), new zcj() { // from class: l.xf00
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return uxj0.f181467a;
            }
        }).subscribe(new y20() { // from class: l.yf00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199438a.m115599w((uxj0) obj);
            }
        });
        C22421c.combineLatest(this.f88247e.values(), new zcj() { // from class: l.zf00
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return uxj0.f181467a;
            }
        }).subscribe(new y20() { // from class: l.ag00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71076a.m115600x((uxj0) obj);
            }
        });
        m115589G();
    }

    /* JADX INFO: renamed from: H */
    public static <T> C22421c.d<T, T> m115569H() {
        return new C22421c.d() { // from class: l.cg00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.combineLatest((C22421c) obj, uqb0.f180404j0.f88244b.take(1), new rcj() { // from class: l.tf00
                    @Override // p153l.rcj
                    public final Object call(Object obj2, Object obj3) {
                        return dg00.m115574e(obj2, (uxj0) obj3);
                    }
                });
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m115574e(Object obj, uxj0 uxj0Var) {
        return obj;
    }

    /* JADX INFO: renamed from: r */
    public static dg00 m115582r() {
        return f88241h;
    }

    /* JADX INFO: renamed from: A */
    public void m115583A() {
        Iterator<jq2> it = this.f88243a.values().iterator();
        while (it.hasNext()) {
            it.next().m146546j();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m115584B() {
        Iterator<jq2> it = this.f88243a.values().iterator();
        while (it.hasNext()) {
            it.next().m146547k();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m115585C(int i) {
        Iterator<jq2> it = this.f88243a.values().iterator();
        while (it.hasNext()) {
            it.next().m146548l(i);
        }
    }

    /* JADX INFO: renamed from: D */
    public C22421c<uxj0> m115586D() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f88243a.values(), new y20() { // from class: l.sf00
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(((jq2) obj).m146549m().take(1));
            }
        });
        return psd0.m173623p(arrayList, new zcj() { // from class: l.uf00
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public C22421c<uxj0> m115587E() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f88243a.values(), new y20() { // from class: l.vf00
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(((jq2) obj).m146550n().take(1));
            }
        });
        return psd0.m173623p(arrayList, new zcj() { // from class: l.wf00
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public void m115588F(String str) {
        if (this.f88245c.get(str).m222761e() == null) {
            this.f88245c.get(str).m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m115589G() {
        k3d0.m148008d(new C16518a());
    }

    /* JADX INFO: renamed from: m */
    public void m115590m() {
        Iterator<String> it = this.f88243a.keySet().iterator();
        while (it.hasNext()) {
            this.f88243a.get(it.next()).m146538a();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m115591n(String str) {
        this.f88243a.get(str).m146539b();
        if (SchemeKey.account.equals(str)) {
            m115588F(SchemeKey.account);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m115592o(boolean z) {
        for (String str : this.f88243a.keySet()) {
            this.f88243a.get(str).m146540c(z);
            m115588F(str);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m115593p() {
        Iterator<String> it = this.f88243a.keySet().iterator();
        while (it.hasNext()) {
            this.f88243a.get(it.next()).m146541d();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m115594q() {
        Iterator<jq2> it = this.f88243a.values().iterator();
        while (it.hasNext()) {
            it.next().m146543f();
        }
        l9c.m153394o().m153403i();
    }

    /* JADX INFO: renamed from: s */
    public final String m115595s(int i) {
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
    public void m115596t(String str) {
        f88242i = true;
        m115597u(str);
        f88242i = false;
    }

    /* JADX INFO: renamed from: u */
    public final void m115597u(String str) {
        final jq2 jq2Var = this.f88243a.get(str);
        jq2Var.m146544h();
        l51.m152919y(new Runnable() { // from class: l.bg00
            @Override // java.lang.Runnable
            public final void run() {
                jq2Var.m146545i();
            }
        });
        jq2Var.m146542e();
        m115598v(str);
        if (SchemeKey.account.equals(str)) {
            return;
        }
        jq2Var.m146539b();
    }

    /* JADX INFO: renamed from: v */
    public final void m115598v(String str) {
        pr2 pr2Var = this.f88246d.get(str);
        sre0 sre0Var = uqb0.f180396b0;
        dn5 dn5Var = (dn5) uqb0.f180397c0;
        pr2Var.m173428c();
        str.getClass();
        switch (str) {
            case "account":
                sre0Var.f170324a = (AccountService) pr2Var.mo30601b();
                dn5Var.f89756a = (AccountCommonService) pr2Var.mo30600a();
                break;
            case "core":
                sre0Var.f170325b = (CoreService) pr2Var.mo30601b();
                dn5Var.f89757b = (CoreCommonService) pr2Var.mo30600a();
                break;
            case "feed":
                sre0Var.f170327d = (FeedService) pr2Var.mo30601b();
                dn5Var.f89758c = (FeedCommonService) pr2Var.mo30600a();
                break;
            case "live":
                sre0Var.f170326c = (LiveService) pr2Var.mo30601b();
                dn5Var.f89759d = (LiveCommonService) pr2Var.mo30600a();
                break;
        }
        this.f88247e.get(str).m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m115599w(uxj0 uxj0Var) {
        this.f88244b.m137019l(uxj0Var);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m115600x(uxj0 uxj0Var) {
        this.f88248f.m137019l(uxj0Var);
    }

    /* JADX INFO: renamed from: y */
    public C22507a<uxj0> m115601y(String str) {
        return this.f88245c.get(str);
    }

    /* JADX INFO: renamed from: z */
    public boolean m115602z(String str) {
        return this.f88245c.get(str).m222761e() != null;
    }
}
