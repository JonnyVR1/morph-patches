package p153l;

import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.hellogroup.common.thread.C3486c;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import java.net.URI;

/* JADX INFO: loaded from: classes7.dex */
public class zrp0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m221177a(ivl ivlVar, String str, String str2, SslErrorHandler sslErrorHandler, String str3, String str4, String str5, URI uri, WebView webView) {
        try {
            jvl jvlVarMo115350f = ivlVar.mo115350f(str, null, null, str2);
            jzv.m147728a("WebRefereeHandler", "SSL自签名认证成功 responseCode:" + jvlVarMo115350f.getSimpleCode());
            if (!jvlVarMo115350f.isRedirect() && !jvlVarMo115350f.isSuccessful()) {
                if (sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                    MKCoreLogManager.m18427e().m18457t(str3, str4, str5);
                    return;
                }
                return;
            }
            if (sslErrorHandler != null) {
                sslErrorHandler.proceed();
            }
        } catch (Exception e) {
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
            jzv.m147729b("WebRefereeHandler", "认证失败 ------> " + str3 + " msg：" + e.getMessage());
            if (str3.contains("api-log.immomo.com")) {
                return;
            }
            try {
                MKCoreLogManager.m18427e().m18456s(e, str3, uri, str4, str5);
                m221180d(webView, str4);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static ivl m221178b(boolean z) {
        ivl ivlVarM130602a = gkw.m130601b().m130602a();
        if (ivlVarM130602a != null) {
            return ivlVarM130602a;
        }
        wtq0.m207906a("请初始化IHttpRequester");
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m221179c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return wi20.m206543g(sjw.m186317f(str));
        } catch (Exception e) {
            jzv.m147730c("WebRefereeHandler", "", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m221181e(final WebView webView, final String str, final SslErrorHandler sslErrorHandler, final String str2) throws Exception {
        final String str3;
        final URI uriCreate = URI.create(str);
        final ivl ivlVarM221178b = m221178b(m221179c(str));
        final String str4 = uriCreate.getScheme() + "://" + uriCreate.getHost();
        final String host = uriCreate.getHost();
        jzv.m147728a("WebRefereeHandler", "发起SSL自签名认证 " + str);
        if (MKConfigSetter.m17757e() != null) {
            String strMo167945d = MKConfigSetter.m17757e().mo167945d(str4, str2);
            if (strMo167945d == null) {
                strMo167945d = str4;
            }
            str3 = strMo167945d;
        } else {
            str3 = str4;
        }
        C3486c.m17566d(2, new Runnable() { // from class: l.yrp0
            @Override // java.lang.Runnable
            public final void run() {
                zrp0.m221177a(ivlVarM221178b, str3, host, sslErrorHandler, str, str4, str2, uriCreate, webView);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m221180d(WebView webView, String str) {
    }
}
