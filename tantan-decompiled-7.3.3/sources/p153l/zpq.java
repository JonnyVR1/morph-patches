package p153l;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class zpq {

    /* JADX INFO: renamed from: a */
    public String f205517a;

    /* JADX INFO: renamed from: b */
    public PutongAct f205518b;

    /* JADX INFO: renamed from: c */
    public WebViewX f205519c;

    /* JADX INFO: renamed from: d */
    public final gqq f205520d;

    /* JADX INFO: renamed from: e */
    public String f205521e;

    public zpq(PutongAct putongAct, String str, WebViewX webViewX) {
        this.f205517a = str;
        this.f205518b = putongAct;
        this.f205519c = webViewX;
        webViewX.setCurrentUrlCallback(new WebViewX.InterfaceC4853a() { // from class: l.ypq
            @Override // com.p051p1.mobile.putong.app.web.WebViewX.InterfaceC4853a
            /* JADX INFO: renamed from: a */
            public final void mo30697a(WebView webView, String str2) {
                this.f201081a.m220925j(webView, str2);
            }
        });
        this.f205520d = new gqq(putongAct, webViewX);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object[] m220918c(Object[] objArr) {
        PutongAct putongAct = this.f205518b;
        WebViewX webViewX = this.f205519c;
        String str = this.f205517a;
        if (putongAct == null || putongAct.isFinishing() || webViewX == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        aqq aqqVar = new aqq(putongAct, webViewX, str);
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = aqqVar;
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return objArr2;
    }

    @JavascriptInterface
    public boolean canIUse(String str) {
        Iterator<Class> it = cqq.m111970e().m111973c().iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            for (Method method : it.next().getMethods()) {
                if (method.isAnnotationPresent(lkq.class) && ((lkq) method.getAnnotation(lkq.class)).key().equals(str)) {
                    return true;
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public gqq m220919d() {
        return this.f205520d;
    }

    @JavascriptInterface
    public String dispatch(final String str, String str2) {
        zpq zpqVar;
        String str3;
        boolean zM220923h = m220923h();
        String str4 = this.f205521e;
        if (zM220923h) {
            m220927l(str, "isActInvalid", str4);
            return "";
        }
        if (!ntp0.m164746d(str4)) {
            ntp0.m164748f("Dispatch JsBridge not in token whitelist, url: " + this.f205521e + ", key: " + str + ", methodParams: " + str2);
            return "";
        }
        final Object[] objArrM117558c = dqq.m117558c(str, str2);
        final ve20 ve20VarM111976g = cqq.m111970e().m111976g(str, objArrM117558c);
        if (ve20VarM111976g == null) {
            m220927l(str, "methodHolder", this.f205521e);
            return "";
        }
        try {
            final lf2 lf2VarM220920e = m220920e(ve20VarM111976g);
            try {
                if (!ve20VarM111976g.f183698c) {
                    return m220922g(ve20VarM111976g, lf2VarM220920e, str, objArrM117558c, false);
                }
                try {
                    l51.m152893M(new Runnable() { // from class: l.xpq
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f195726a.m220924i(ve20VarM111976g, lf2VarM220920e, str, objArrM117558c);
                        }
                    });
                    return "";
                } catch (Exception e) {
                    e = e;
                    zpqVar = this;
                    ve20VarM111976g = ve20VarM111976g;
                    str3 = str;
                    objArrM117558c = objArrM117558c;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            zpqVar = this;
            str3 = str;
        }
        zpqVar.m220921f(e, str3, objArrM117558c, ve20VarM111976g);
        return "";
    }

    /* JADX INFO: renamed from: e */
    public final lf2 m220920e(ve20 ve20Var) throws Exception {
        lf2 lf2VarM111974d = cqq.m111970e().m111974d(this.f205519c, ve20Var.f183697b);
        if (lf2VarM111974d == null) {
            lf2 lf2VarNewInstance = ve20Var.f183697b.newInstance();
            if (lf2VarNewInstance instanceof lf2) {
                lf2 lf2Var = lf2VarNewInstance;
                lf2Var.m153962b();
                cqq.m111970e().m111971a(this.f205519c, ve20Var.f183697b, lf2Var);
                return lf2Var;
            }
        }
        return lf2VarM111974d;
    }

    /* JADX INFO: renamed from: f */
    public final void m220921f(Exception exc, String str, Object[] objArr, ve20 ve20Var) {
        Class<? extends lf2> cls;
        StringBuilder sb = new StringBuilder("key = ");
        sb.append(str);
        sb.append(",params = ");
        sb.append(objArr);
        sb.append(",url = ");
        sb.append(this.f205521e);
        sb.append(",clazz = ");
        sb.append((ve20Var == null || (cls = ve20Var.f183697b) == null) ? null : cls.getName());
        sb.append(",msg = ");
        sb.append(exc.getMessage());
        CrashHelper.m82479c(new Exception(sb.toString(), exc));
    }

    /* JADX INFO: renamed from: g */
    public final String m220922g(ve20 ve20Var, lf2 lf2Var, String str, Object[] objArr, boolean z) throws IllegalAccessException, InvocationTargetException {
        Object[] objArrM220918c = m220918c(objArr);
        if (objArrM220918c == null) {
            if (!z) {
                m220927l(str, "paramsWithContext null", this.f205521e);
            }
            return "";
        }
        Object objInvoke = ve20Var.f183696a.invoke(lf2Var, objArrM220918c);
        if (NullChecker.m82486a(objInvoke)) {
            return objInvoke.toString();
        }
        if (!z) {
            m220927l(str, "invokeJsBridgeMethod end null", this.f205521e);
        }
        return "";
    }

    /* JADX INFO: renamed from: h */
    public final boolean m220923h() {
        PutongAct putongAct = this.f205518b;
        return putongAct == null || putongAct.isFinishing() || this.f205519c == null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m220924i(ve20 ve20Var, lf2 lf2Var, String str, Object[] objArr) {
        try {
            m220922g(ve20Var, lf2Var, str, objArr, true);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m220925j(WebView webView, String str) {
        this.f205521e = str;
    }

    /* JADX INFO: renamed from: k */
    public void m220926k() {
        if (NullChecker.m82486a(this.f205519c)) {
            this.f205519c.setCurrentUrlCallback(null);
            cqq.m111970e().m111972b(this.f205519c);
        }
        this.f205518b = null;
        this.f205519c = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m220927l(String str, String str2, String str3) {
        if (TextUtils.equals(str, "getSystemInfo") || TextUtils.equals(str, "getAuthorizationHeader") || TextUtils.equals(str, "getAbHeader")) {
            CrashHelper.m82480d(new Exception(cqq.class.getName() + " methodName =  " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + " url = " + str3), 100);
        }
    }

    @JavascriptInterface
    public String triggerAction(String str, String str2) {
        return dispatch(str, str2);
    }
}
