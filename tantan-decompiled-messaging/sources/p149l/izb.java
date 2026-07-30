package p149l;

import android.app.Activity;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class izb extends MKWebViewHelper {

    /* JADX INFO: renamed from: l */
    public static final Map<String, y9j<PutongAct, String, MKWebView, e400>> f115549l;

    /* JADX INFO: renamed from: k */
    public final List<e400> f115550k = new ArrayList();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f115549l = linkedHashMap;
        linkedHashMap.put("tantan", new y9j() { // from class: l.wyb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new d2i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_ui", new y9j() { // from class: l.bzb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new k9i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_device", new y9j() { // from class: l.czb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new o4i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_media", new y9j() { // from class: l.dzb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new b7i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_ab", new y9j() { // from class: l.ezb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new f1i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_webview", new y9j() { // from class: l.fzb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new bci0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_share", new y9j() { // from class: l.gzb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new n7i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_storage", new y9j() { // from class: l.hzb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new q7i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_third_party", new y9j() { // from class: l.xyb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new t8i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_action", new y9j() { // from class: l.yyb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new k1i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_http", new y9j() { // from class: l.zyb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new r4i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        linkedHashMap.put("tantan_sensor", new y9j() { // from class: l.azb
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new e7i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static void m139033C(String str, y9j<PutongAct, String, MKWebView, e400> y9jVar) {
        f115549l.put(str, y9jVar);
    }

    /* JADX INFO: renamed from: A */
    public void m139034A(PutongAct putongAct, String str, MKWebView mKWebView, String str2) {
        this.f115550k.clear();
        for (String str3 : f115549l.keySet()) {
            try {
                e400 e400VarMo94599a = f115549l.get(str3).mo94599a(putongAct, str, mKWebView);
                this.f115550k.add(e400VarMo94599a);
                m87119v(str3, e400VarMo94599a);
                e400VarMo94599a.m114645A(str2);
            } catch (Throwable th) {
                CrashHelper.m81296c(th);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m139035B() {
        return !this.f115550k.isEmpty();
    }

    /* JADX INFO: renamed from: D */
    public void m139036D(String str) {
        this.f115550k.clear();
        Iterator<e400> it = this.f115550k.iterator();
        while (it.hasNext()) {
            it.next().m114646B(str);
        }
    }

    @Override // p149l.ahw
    public void closePage() {
        Activity activityMo87112i = mo87112i();
        if (activityMo87112i != null) {
            activityMo87112i.finish();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m139039y() {
        Iterator<e400> it = this.f115550k.iterator();
        while (it.hasNext()) {
            it.next().mo114658w();
        }
        this.f115550k.clear();
        if (NullChecker.m81303a(this.f63291h)) {
            mo87110d();
        }
    }

    /* JADX INFO: renamed from: z */
    public List<e400> m139040z() {
        return this.f115550k;
    }

    @Override // p149l.jiw
    /* JADX INFO: renamed from: e */
    public void mo139037e(boolean z) {
    }

    @Override // p149l.ahw
    /* JADX INFO: renamed from: f */
    public void mo96738f() {
    }

    @Override // p149l.jiw
    /* JADX INFO: renamed from: g */
    public void mo139038g(String str) {
    }
}
