package p009l;

import com.p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.NullChecker;
import l.e51;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class d2a {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12897a(WebViewX webViewX, String str) {
        if (NullChecker.b(webViewX)) {
            webViewX.loadUrl(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m12898b(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (NullChecker.a(strArr[i])) {
                sb.append("\"");
                sb.append(strArr[i]);
                sb.append("\",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return String.format("javascript:%s(%s)", str, sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public void m12899c(WebViewX webViewX, String str) {
        m12900d(webViewX, m12898b(str, new String[0]));
    }

    /* JADX INFO: renamed from: d */
    public void m12900d(WebViewX webViewX, String str) {
        m12902f(webViewX, str);
    }

    /* JADX INFO: renamed from: e */
    public void m12901e(WebViewX webViewX, String str, String... strArr) {
        m12900d(webViewX, m12898b(str, strArr));
    }

    /* JADX INFO: renamed from: f */
    public final void m12902f(final WebViewX webViewX, final String str) {
        e51.G(new Runnable() { // from class: l.c2a
            @Override // java.lang.Runnable
            public final void run() {
                d2a.m12897a(webViewX, str);
            }
        });
    }
}
