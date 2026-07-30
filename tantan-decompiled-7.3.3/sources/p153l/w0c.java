package p153l;

import android.app.Activity;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class w0c extends MKWebViewHelper {

    /* JADX INFO: renamed from: n */
    public static final Map<String, scj<PutongAct, String, MKWebView, wc00>> f186556n;

    /* JADX INFO: renamed from: m */
    public final List<wc00> f186557m = new ArrayList();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f186556n = linkedHashMap;
        linkedHashMap.put("tantan", new scj() { // from class: l.k0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new mai0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_ui", new scj() { // from class: l.p0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new kii0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_device", new scj() { // from class: l.q0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new xci0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_media", new scj() { // from class: l.r0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new bgi0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_ab", new scj() { // from class: l.s0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new n9i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_webview", new scj() { // from class: l.t0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new bli0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_share", new scj() { // from class: l.u0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new ngi0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_storage", new scj() { // from class: l.v0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new qgi0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_third_party", new scj() { // from class: l.l0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new thi0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_action", new scj() { // from class: l.m0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new s9i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_http", new scj() { // from class: l.n0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new adi0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_sensor", new scj() { // from class: l.o0c
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new egi0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static void m204134O(String str, scj<PutongAct, String, MKWebView, wc00> scjVar) {
        f186556n.put(str, scjVar);
    }

    /* JADX INFO: renamed from: K */
    public void m204135K() {
        Iterator<wc00> it = this.f186557m.iterator();
        while (it.hasNext()) {
            it.next().mo185185E();
        }
        this.f186557m.clear();
        if (NullChecker.m82486a(this.f12126i)) {
            mo17963d();
        }
    }

    /* JADX INFO: renamed from: L */
    public List<wc00> m204136L() {
        return this.f186557m;
    }

    /* JADX INFO: renamed from: M */
    public void m204137M(PutongAct putongAct, String str, MKWebView mKWebView, String str2) {
        this.f186557m.clear();
        for (String str3 : f186556n.keySet()) {
            try {
                wc00 wc00VarMo95332a = f186556n.get(str3).mo95332a(putongAct, str, mKWebView);
                this.f186557m.add(wc00VarMo95332a);
                m17958H(str3, wc00VarMo95332a);
                wc00VarMo95332a.m205741I(str2);
            } catch (Throwable th) {
                CrashHelper.m82479c(th);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public boolean m204138N() {
        return !this.f186557m.isEmpty();
    }

    /* JADX INFO: renamed from: P */
    public void m204139P(String str) {
        this.f186557m.clear();
        Iterator<wc00> it = this.f186557m.iterator();
        while (it.hasNext()) {
            it.next().m205742J(str);
        }
    }

    @Override // p153l.ziw
    public void closePage() {
        Activity activityMo17967l = mo17967l();
        if (activityMo17967l != null) {
            activityMo17967l.finish();
        }
    }

    @Override // p153l.ziw
    /* JADX INFO: renamed from: f */
    public void mo18039f() {
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: p */
    public void mo18042p() {
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: e */
    public void mo18038e(boolean z) {
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: g */
    public void mo18040g(String str) {
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: k */
    public void mo18041k(ave0 ave0Var) {
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: r */
    public void mo18043r(zue0 zue0Var) {
    }
}
