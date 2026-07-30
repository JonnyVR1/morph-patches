package p009l;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import l.e51;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class aoq {

    /* JADX INFO: renamed from: a */
    public String f9592a;

    /* JADX INFO: renamed from: b */
    public PutongAct f9593b;

    /* JADX INFO: renamed from: c */
    public WebViewX f9594c;

    /* JADX INFO: renamed from: d */
    public final goq f9595d;

    /* JADX INFO: renamed from: e */
    public String f9596e;

    public aoq(PutongAct putongAct, String str, WebViewX webViewX) {
        this.f9592a = str;
        this.f9593b = putongAct;
        this.f9594c = webViewX;
        webViewX.setCurrentUrlCallback(new WebViewX.a() { // from class: l.znq
            /* JADX INFO: renamed from: a */
            public final void m25878a(WebView webView, String str2) {
                this.f23760a.m11545j(webView, str2);
            }
        });
        this.f9595d = new goq(putongAct, webViewX);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object[] m11538c(Object[] objArr) {
        PutongAct putongAct = this.f9593b;
        WebViewX webViewX = this.f9594c;
        String str = this.f9592a;
        if (putongAct == null || putongAct.isFinishing() || webViewX == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        boq boqVar = new boq(putongAct, webViewX, str);
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = boqVar;
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return objArr2;
    }

    @JavascriptInterface
    public boolean canIUse(String str) {
        Iterator<Class> it = doq.m13424e().m13427c().iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            for (Method method : it.next().getMethods()) {
                if (method.isAnnotationPresent(liq.class) && ((liq) method.getAnnotation(liq.class)).key().equals(str)) {
                    return true;
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public goq m11539d() {
        return this.f9595d;
    }

    @JavascriptInterface
    public String dispatch(final String str, String str2) {
        aoq aoqVar;
        String str3;
        boolean zM11543h = m11543h();
        String str4 = this.f9596e;
        if (zM11543h) {
            m11547l(str, "isActInvalid", str4);
            return "";
        }
        if (!jkp0.m17145d(str4)) {
            jkp0.m17147f("Dispatch JsBridge not in token whitelist, url: " + this.f9596e + ", key: " + str + ", methodParams: " + str2);
            return "";
        }
        final Object[] objArrM14056c = eoq.m14056c(str, str2);
        final n620 n620VarM13430g = doq.m13424e().m13430g(str, objArrM14056c);
        if (n620VarM13430g == null) {
            m11547l(str, "methodHolder", this.f9596e);
            return "";
        }
        try {
            final ef2 ef2VarM11540e = m11540e(n620VarM13430g);
            try {
                if (!n620VarM13430g.f17230c) {
                    return m11542g(n620VarM13430g, ef2VarM11540e, str, objArrM14056c, false);
                }
                try {
                    e51.M(new Runnable() { // from class: l.ynq
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f23179a.m11544i(n620VarM13430g, ef2VarM11540e, str, objArrM14056c);
                        }
                    });
                    return "";
                } catch (Exception e) {
                    e = e;
                    aoqVar = this;
                    n620VarM13430g = n620VarM13430g;
                    str3 = str;
                    objArrM14056c = objArrM14056c;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            aoqVar = this;
            str3 = str;
        }
        aoqVar.m11541f(e, str3, objArrM14056c, n620VarM13430g);
        return "";
    }

    /* JADX INFO: renamed from: e */
    public final ef2 m11540e(n620 n620Var) throws Exception {
        ef2 ef2VarM13428d = doq.m13424e().m13428d(this.f9594c, n620Var.f17229b);
        if (ef2VarM13428d == null) {
            ef2 ef2VarNewInstance = n620Var.f17229b.newInstance();
            if (ef2VarNewInstance instanceof ef2) {
                ef2 ef2Var = ef2VarNewInstance;
                ef2Var.m13832b();
                doq.m13424e().m13425a(this.f9594c, n620Var.f17229b, ef2Var);
                return ef2Var;
            }
        }
        return ef2VarM13428d;
    }

    /* JADX INFO: renamed from: f */
    public final void m11541f(Exception exc, String str, Object[] objArr, n620 n620Var) {
        Class<? extends ef2> cls;
        StringBuilder sb = new StringBuilder("key = ");
        sb.append(str);
        sb.append(",params = ");
        sb.append(objArr);
        sb.append(",url = ");
        sb.append(this.f9596e);
        sb.append(",clazz = ");
        sb.append((n620Var == null || (cls = n620Var.f17229b) == null) ? null : cls.getName());
        sb.append(",msg = ");
        sb.append(exc.getMessage());
        CrashHelper.c(new Exception(sb.toString(), exc));
    }

    /* JADX INFO: renamed from: g */
    public final String m11542g(n620 n620Var, ef2 ef2Var, String str, Object[] objArr, boolean z) throws IllegalAccessException, InvocationTargetException {
        Object[] objArrM11538c = m11538c(objArr);
        if (objArrM11538c == null) {
            if (!z) {
                m11547l(str, "paramsWithContext null", this.f9596e);
            }
            return "";
        }
        Object objInvoke = n620Var.f17228a.invoke(ef2Var, objArrM11538c);
        if (NullChecker.a(objInvoke)) {
            return objInvoke.toString();
        }
        if (!z) {
            m11547l(str, "invokeJsBridgeMethod end null", this.f9596e);
        }
        return "";
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11543h() {
        PutongAct putongAct = this.f9593b;
        return putongAct == null || putongAct.isFinishing() || this.f9594c == null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m11544i(n620 n620Var, ef2 ef2Var, String str, Object[] objArr) {
        try {
            m11542g(n620Var, ef2Var, str, objArr, true);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m11545j(WebView webView, String str) {
        this.f9596e = str;
    }

    /* JADX INFO: renamed from: k */
    public void m11546k() {
        if (NullChecker.a(this.f9594c)) {
            this.f9594c.setCurrentUrlCallback((WebViewX.a) null);
            doq.m13424e().m13426b(this.f9594c);
        }
        this.f9593b = null;
        this.f9594c = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m11547l(String str, String str2, String str3) {
        if (TextUtils.equals(str, "getSystemInfo") || TextUtils.equals(str, "getAuthorizationHeader") || TextUtils.equals(str, "getAbHeader")) {
            CrashHelper.d(new Exception(doq.class.getName() + " methodName =  " + str + " " + str2 + " url = " + str3), 100);
        }
    }

    @JavascriptInterface
    public String triggerAction(String str, String str2) {
        return dispatch(str, str2);
    }
}
