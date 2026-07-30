package p009l;

import android.app.Activity;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import immomo.com.mklibrary.core.base.ui.MKWebViewHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.y9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class izb extends MKWebViewHelper {

    /* JADX INFO: renamed from: l */
    public static final Map<String, y9j<PutongAct, String, MKWebView, e400>> f14871l;

    /* JADX INFO: renamed from: k */
    public final List<e400> f14872k = new ArrayList();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f14871l = linkedHashMap;
        linkedHashMap.put("tantan", new y9j() { // from class: l.wyb
            /* JADX INFO: renamed from: a */
            public final Object m24581a(Object obj, Object obj2, Object obj3) {
                return new d2i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_ui", new y9j() { // from class: l.bzb
            /* JADX INFO: renamed from: a */
            public final Object m12324a(Object obj, Object obj2, Object obj3) {
                return new k9i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_device", new y9j() { // from class: l.czb
            /* JADX INFO: renamed from: a */
            public final Object m12876a(Object obj, Object obj2, Object obj3) {
                return new o4i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_media", new y9j() { // from class: l.dzb
            /* JADX INFO: renamed from: a */
            public final Object m13527a(Object obj, Object obj2, Object obj3) {
                return new b7i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_ab", new y9j() { // from class: l.ezb
            /* JADX INFO: renamed from: a */
            public final Object m14197a(Object obj, Object obj2, Object obj3) {
                return new f1i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_webview", new y9j() { // from class: l.fzb
            /* JADX INFO: renamed from: a */
            public final Object m14677a(Object obj, Object obj2, Object obj3) {
                return new bci0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_share", new y9j() { // from class: l.gzb
            /* JADX INFO: renamed from: a */
            public final Object m15366a(Object obj, Object obj2, Object obj3) {
                return new n7i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_storage", new y9j() { // from class: l.hzb
            /* JADX INFO: renamed from: a */
            public final Object m16049a(Object obj, Object obj2, Object obj3) {
                return new q7i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_third_party", new y9j() { // from class: l.xyb
            /* JADX INFO: renamed from: a */
            public final Object m25073a(Object obj, Object obj2, Object obj3) {
                return new t8i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_action", new y9j() { // from class: l.yyb
            /* JADX INFO: renamed from: a */
            public final Object m25552a(Object obj, Object obj2, Object obj3) {
                return new k1i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_http", new y9j() { // from class: l.zyb
            /* JADX INFO: renamed from: a */
            public final Object m26144a(Object obj, Object obj2, Object obj3) {
                return new r4i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_sensor", new y9j() { // from class: l.azb
            /* JADX INFO: renamed from: a */
            public final Object m11781a(Object obj, Object obj2, Object obj3) {
                return new e7i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static void m16802C(String str, y9j<PutongAct, String, MKWebView, e400> y9jVar) {
        f14871l.put(str, y9jVar);
    }

    /* JADX INFO: renamed from: A */
    public void m16803A(PutongAct putongAct, String str, MKWebView mKWebView, String str2) {
        this.f14872k.clear();
        for (String str3 : f14871l.keySet()) {
            try {
                e400 e400Var = (e400) f14871l.get(str3).a(putongAct, str, mKWebView);
                this.f14872k.add(e400Var);
                v(str3, e400Var);
                e400Var.m13703A(str2);
            } catch (Throwable th) {
                CrashHelper.c(th);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m16804B() {
        return !this.f14872k.isEmpty();
    }

    /* JADX INFO: renamed from: D */
    public void m16805D(String str) {
        this.f14872k.clear();
        Iterator<e400> it = this.f14872k.iterator();
        while (it.hasNext()) {
            it.next().m13704B(str);
        }
    }

    public void closePage() {
        Activity activityI = i();
        if (activityI != null) {
            activityI.finish();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m16809y() {
        Iterator<e400> it = this.f14872k.iterator();
        while (it.hasNext()) {
            it.next().mo13717w();
        }
        this.f14872k.clear();
        if (NullChecker.a(((MKWebViewHelper) this).h)) {
            d();
        }
    }

    /* JADX INFO: renamed from: z */
    public List<e400> m16810z() {
        return this.f14872k;
    }

    /* JADX INFO: renamed from: e */
    public void m16806e(boolean z) {
    }

    /* JADX INFO: renamed from: f */
    public void m16807f() {
    }

    /* JADX INFO: renamed from: g */
    public void m16808g(String str) {
    }
}
