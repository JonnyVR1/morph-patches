package p149l;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class aoq {

    /* JADX INFO: renamed from: a */
    public String f70883a;

    /* JADX INFO: renamed from: b */
    public PutongAct f70884b;

    /* JADX INFO: renamed from: c */
    public WebViewX f70885c;

    /* JADX INFO: renamed from: d */
    public final goq f70886d;

    /* JADX INFO: renamed from: e */
    public String f70887e;

    public aoq(PutongAct putongAct, String str, WebViewX webViewX) {
        this.f70883a = str;
        this.f70884b = putongAct;
        this.f70885c = webViewX;
        webViewX.setCurrentUrlCallback(new WebViewX.InterfaceC4702a() { // from class: l.znq
            @Override // com.p046p1.mobile.putong.app.web.WebViewX.InterfaceC4702a
            /* JADX INFO: renamed from: a */
            public final void mo29699a(WebView webView, String str2) {
                this.f203989a.m97930j(webView, str2);
            }
        });
        this.f70886d = new goq(putongAct, webViewX);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object[] m97923c(Object[] objArr) {
        PutongAct putongAct = this.f70884b;
        WebViewX webViewX = this.f70885c;
        String str = this.f70883a;
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
        Iterator<Class> it = doq.m112810e().m112813c().iterator();
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
    public goq m97924d() {
        return this.f70886d;
    }

    @JavascriptInterface
    public String dispatch(final String str, String str2) {
        aoq aoqVar;
        String str3;
        boolean zM97928h = m97928h();
        String str4 = this.f70887e;
        if (zM97928h) {
            m97932l(str, "isActInvalid", str4);
            return "";
        }
        if (!jkp0.m141904d(str4)) {
            jkp0.m141906f("Dispatch JsBridge not in token whitelist, url: " + this.f70887e + ", key: " + str + ", methodParams: " + str2);
            return "";
        }
        final Object[] objArrM117499c = eoq.m117499c(str, str2);
        final n620 n620VarM112816g = doq.m112810e().m112816g(str, objArrM117499c);
        if (n620VarM112816g == null) {
            m97932l(str, "methodHolder", this.f70887e);
            return "";
        }
        try {
            final ef2 ef2VarM97925e = m97925e(n620VarM112816g);
            try {
                if (!n620VarM112816g.f137265c) {
                    return m97927g(n620VarM112816g, ef2VarM97925e, str, objArrM117499c, false);
                }
                try {
                    e51.m114748M(new Runnable() { // from class: l.ynq
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f199196a.m97929i(n620VarM112816g, ef2VarM97925e, str, objArrM117499c);
                        }
                    });
                    return "";
                } catch (Exception e) {
                    e = e;
                    aoqVar = this;
                    n620VarM112816g = n620VarM112816g;
                    str3 = str;
                    objArrM117499c = objArrM117499c;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            aoqVar = this;
            str3 = str;
        }
        aoqVar.m97926f(e, str3, objArrM117499c, n620VarM112816g);
        return "";
    }

    /* JADX INFO: renamed from: e */
    public final ef2 m97925e(n620 n620Var) throws Exception {
        ef2 ef2VarM112814d = doq.m112810e().m112814d(this.f70885c, n620Var.f137264b);
        if (ef2VarM112814d == null) {
            ef2 ef2VarNewInstance = n620Var.f137264b.newInstance();
            if (ef2VarNewInstance instanceof ef2) {
                ef2 ef2Var = ef2VarNewInstance;
                ef2Var.m116018b();
                doq.m112810e().m112811a(this.f70885c, n620Var.f137264b, ef2Var);
                return ef2Var;
            }
        }
        return ef2VarM112814d;
    }

    /* JADX INFO: renamed from: f */
    public final void m97926f(Exception exc, String str, Object[] objArr, n620 n620Var) {
        Class<? extends ef2> cls;
        StringBuilder sb = new StringBuilder("key = ");
        sb.append(str);
        sb.append(",params = ");
        sb.append(objArr);
        sb.append(",url = ");
        sb.append(this.f70887e);
        sb.append(",clazz = ");
        sb.append((n620Var == null || (cls = n620Var.f137264b) == null) ? null : cls.getName());
        sb.append(",msg = ");
        sb.append(exc.getMessage());
        CrashHelper.m81296c(new Exception(sb.toString(), exc));
    }

    /* JADX INFO: renamed from: g */
    public final String m97927g(n620 n620Var, ef2 ef2Var, String str, Object[] objArr, boolean z) throws IllegalAccessException, InvocationTargetException {
        Object[] objArrM97923c = m97923c(objArr);
        if (objArrM97923c == null) {
            if (!z) {
                m97932l(str, "paramsWithContext null", this.f70887e);
            }
            return "";
        }
        Object objInvoke = n620Var.f137263a.invoke(ef2Var, objArrM97923c);
        if (NullChecker.m81303a(objInvoke)) {
            return objInvoke.toString();
        }
        if (!z) {
            m97932l(str, "invokeJsBridgeMethod end null", this.f70887e);
        }
        return "";
    }

    /* JADX INFO: renamed from: h */
    public final boolean m97928h() {
        PutongAct putongAct = this.f70884b;
        return putongAct == null || putongAct.isFinishing() || this.f70885c == null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m97929i(n620 n620Var, ef2 ef2Var, String str, Object[] objArr) {
        try {
            m97927g(n620Var, ef2Var, str, objArr, true);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m97930j(WebView webView, String str) {
        this.f70887e = str;
    }

    /* JADX INFO: renamed from: k */
    public void m97931k() {
        if (NullChecker.m81303a(this.f70885c)) {
            this.f70885c.setCurrentUrlCallback(null);
            doq.m112810e().m112812b(this.f70885c);
        }
        this.f70884b = null;
        this.f70885c = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m97932l(String str, String str2, String str3) {
        if (TextUtils.equals(str, "getSystemInfo") || TextUtils.equals(str, "getAuthorizationHeader") || TextUtils.equals(str, "getAbHeader")) {
            CrashHelper.m81297d(new Exception(doq.class.getName() + " methodName =  " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + " url = " + str3), 100);
        }
    }

    @JavascriptInterface
    public String triggerAction(String str, String str2) {
        return dispatch(str, str2);
    }
}
