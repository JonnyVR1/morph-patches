package p149l;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.cosmos.mdlog.MDLog;
import com.meituan.robust.Constants;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public class uip0 {

    /* JADX INFO: renamed from: a */
    private static k850 f176671a;

    /* JADX INFO: renamed from: b */
    private static SSLSocketFactory f176672b;

    /* JADX INFO: renamed from: l.uip0$a */
    public class C20441a implements x74 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ SslErrorHandler f176673a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f176674b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ WebView f176675c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f176676d;

        public C20441a(SslErrorHandler sslErrorHandler, String str, WebView webView, String str2) {
            this.f176673a = sslErrorHandler;
            this.f176674b = str;
            this.f176675c = webView;
            this.f176676d = str2;
        }

        @Override // p149l.x74
        public void onFailure(sx3 sx3Var, IOException iOException) {
            SslErrorHandler sslErrorHandler = this.f176673a;
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
            mxv.m156927b("WebRefereeHandler", "认证失败 ------> " + this.f176674b + " msg：" + iOException.getMessage());
            if (this.f176674b.contains("api-log.immomo.com")) {
                return;
            }
            try {
                if (shw.m184294n() != null) {
                    shw.m184294n().mo110230b(iOException, this.f176674b);
                }
                if (shw.m184294n().mo110237i()) {
                    uip0.m193954k(this.f176675c, this.f176676d);
                }
            } catch (Exception unused) {
            }
        }

        @Override // p149l.x74
        public void onResponse(sx3 sx3Var, exc0 exc0Var) {
            mxv.m156926a("WebRefereeHandler", "SSL自签名认证成功 responseCode:" + exc0Var.m118609q());
            if (exc0Var.m118596H() || exc0Var.m118597I()) {
                SslErrorHandler sslErrorHandler = this.f176673a;
                if (sslErrorHandler != null) {
                    sslErrorHandler.proceed();
                    return;
                }
                return;
            }
            SslErrorHandler sslErrorHandler2 = this.f176673a;
            if (sslErrorHandler2 != null) {
                sslErrorHandler2.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: l.uip0$b */
    public class RunnableC20442b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f176677a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f176678b;

        /* JADX INFO: renamed from: l.uip0$b$a */
        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Dialog f176679a;

            public a(Dialog dialog) {
                this.f176679a = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f176679a.dismiss();
            }
        }

        /* JADX INFO: renamed from: l.uip0$b$b */
        public class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Dialog f176681a;

            public b(Dialog dialog) {
                this.f176681a = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f176681a.cancel();
            }
        }

        public RunnableC20442b(WebView webView, String str) {
            this.f176677a = webView;
            this.f176678b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Context context = this.f176677a.getContext();
                WebView webView = this.f176677a;
                if (webView instanceof MKWebView) {
                    context = ((MKWebView) webView).getRealContext();
                }
                if (context == null) {
                    return;
                }
                Dialog dialog = new Dialog(context);
                dialog.setCancelable(true);
                View viewInflate = LayoutInflater.from(context).inflate(y6c0.f196544b, (ViewGroup) null);
                viewInflate.findViewById(l5c0.f126109b).setOnClickListener(new a(dialog));
                viewInflate.findViewById(l5c0.f126108a).setOnClickListener(new b(dialog));
                dialog.setContentView(viewInflate);
                dialog.show();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: a */
    private static exc0 m193944a(String str, WebResourceRequest webResourceRequest) throws IOException {
        k850 k850VarM193947d = m193947d(m193949f(str));
        stc0.C20027a c20027aM185898q = new stc0.C20027a().m185898q(str);
        if (webResourceRequest != null) {
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            for (String str2 : requestHeaders.keySet()) {
                c20027aM185898q.m185889h(str2, requestHeaders.get(str2));
            }
        }
        return k850VarM193947d.mo144849a(c20027aM185898q.m185883b()).execute();
    }

    @Nullable
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: b */
    private static WebResourceResponse m193945b(@Nullable exc0 exc0Var) {
        String[] strArrSplit;
        String str;
        gxc0 gxc0VarM118606k = exc0Var.m118606k();
        if (gxc0VarM118606k == null) {
            mxv.m156927b("WebRefereeHandler", "interceptRequestInner body NULL");
            return null;
        }
        hyx hyxVarContentType = gxc0VarM118606k.contentType();
        String string = hyxVarContentType != null ? hyxVarContentType.toString() : null;
        String strTrim = (TextUtils.isEmpty(string) || (strArrSplit = string.split(Constants.PACKNAME_END)) == null || strArrSplit.length <= 0 || (str = strArrSplit[0]) == null) ? "" : str.trim();
        mxv.m156927b("WebRefereeHandler", "interceptRequestInner contentType:" + string + "  mime:" + strTrim);
        WebResourceResponse webResourceResponse = new WebResourceResponse(strTrim, exc0Var.m118612v("encoding", "uft-8"), exc0Var.m118606k().byteStream());
        Set<String> setM166557g = exc0Var.m118595F().m166557g();
        HashMap map = new HashMap();
        for (String str2 : setM166557g) {
            map.put(str2, exc0Var.m118611u(str2));
        }
        webResourceResponse.setResponseHeaders(map);
        return webResourceResponse;
    }

    /* JADX INFO: renamed from: c */
    private static SSLSocketFactory m193946c() throws IOException {
        SSLSocketFactory sSLSocketFactory = f176672b;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        SSLSocketFactory sSLSocketFactoryM179813c = rll.m179813c(new InputStream[]{new BufferedInputStream(dmc0.m112455e().m112458d().getAssets().open("MomoRootCA.der"))}, null, null);
        f176672b = sSLSocketFactoryM179813c;
        return sSLSocketFactoryM179813c;
    }

    /* JADX INFO: renamed from: d */
    private static k850 m193947d(boolean z) {
        if (f176671a == null) {
            try {
                k850.C17954b c17954bM144867v = nll.m160066b().m160067c().m144867v();
                c17954bM144867v.m144892m(false);
                if (z) {
                    c17954bM144867v.m144901v(m193946c());
                }
                f176671a = c17954bM144867v.m144882c();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return f176671a;
    }

    /* JADX INFO: renamed from: e */
    public static String m193948e(String str) {
        if (!m193951h()) {
            Log.e("WebRefereeHandler", "isRefereeEnable false");
            return null;
        }
        Log.e("WebRefereeHandler", "getInterceptUrl " + str);
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            mxv.m156927b("WebRefereeHandler", "不执行Referee处理 not http");
            return null;
        }
        try {
            String strM112461h = dmc0.m112455e().m112461h(str);
            if (TextUtils.isEmpty(strM112461h)) {
                return null;
            }
            String strM184286f = shw.m184286f(str);
            if (TextUtils.equals(strM184286f, strM112461h)) {
                mxv.m156927b("WebRefereeHandler", "不执行Referee处理 域名相同");
                return null;
            }
            if (TextUtils.isEmpty(strM112461h)) {
                return null;
            }
            return str.replace(strM184286f, strM112461h);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m193949f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return izm.m139070a(shw.m184286f(str));
        } catch (Exception e) {
            MDLog.printErrStackTrace("WebRefereeHandler", e);
            return false;
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: g */
    public static WebResourceResponse m193950g(String str, String str2, String str3, @Nullable WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseM193945b;
        String strM193948e = m193948e(str2);
        if (TextUtils.isEmpty(strM193948e)) {
            return null;
        }
        m193953j(webResourceRequest);
        MDLog.m7389d("DNSTest", "mkweb use referee webUrl: " + str2 + " ---> finalUrl:" + strM193948e + " method:" + str3);
        try {
            exc0 exc0VarM193944a = m193944a(strM193948e, webResourceRequest);
            if (exc0VarM193944a.m118596H()) {
                lxv.m152102h(ywm.m216408j(str, "referee", str2, false));
                return null;
            }
            if (exc0VarM193944a.m118597I() && (webResourceResponseM193945b = m193945b(exc0VarM193944a)) != null) {
                lxv.m152102h(ywm.m216408j(str, "referee", str2, true));
                return webResourceResponseM193945b;
            }
            lxv.m152102h(ywm.m216408j(str, "referee", str2, false));
            dmc0.m112455e().m112465m(str2);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m193951h() {
        xwm xwmVarM184287g = shw.m184287g();
        return xwmVarM184287g != null && xwmVarM184287g.mo193553c();
    }

    /* JADX INFO: renamed from: i */
    public static void m193952i(String str) {
        if (m193951h()) {
            dmc0.m112455e().m112465m(str);
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: j */
    private static void m193953j(WebResourceRequest webResourceRequest) {
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders == null || requestHeaders.containsKey("Cookie")) {
            return;
        }
        String cookie = CookieManager.getInstance().getCookie(webResourceRequest.getUrl().getHost());
        if (TextUtils.isEmpty(cookie)) {
            return;
        }
        webResourceRequest.getRequestHeaders().put("Cookie", cookie);
    }

    /* JADX INFO: renamed from: k */
    public static void m193954k(WebView webView, String str) {
        if (webView == null) {
            return;
        }
        webView.post(new RunnableC20442b(webView, str));
    }

    /* JADX INFO: renamed from: l */
    public static void m193955l(WebView webView, String str, SslErrorHandler sslErrorHandler) throws Exception {
        URI uriCreate = URI.create(str);
        k850 k850VarM193947d = m193947d(m193949f(str));
        String str2 = uriCreate.getScheme() + "://" + uriCreate.getHost();
        stc0 stc0VarM185883b = new stc0.C20027a().m185898q(str2).m185883b();
        mxv.m156926a("WebRefereeHandler", "发起SSL自签名认证 " + str);
        k850VarM193947d.mo144849a(stc0VarM185883b).mo96077h(new C20441a(sslErrorHandler, str, webView, str2));
    }
}
