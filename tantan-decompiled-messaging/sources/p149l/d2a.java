package p149l;

import com.p046p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class d2a {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m109719a(WebViewX webViewX, String str) {
        if (NullChecker.m81304b(webViewX)) {
            webViewX.loadUrl(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m109720b(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (NullChecker.m81303a(strArr[i])) {
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
    public void m109721c(WebViewX webViewX, String str) {
        m109722d(webViewX, m109720b(str, new String[0]));
    }

    /* JADX INFO: renamed from: d */
    public void m109722d(WebViewX webViewX, String str) {
        m109724f(webViewX, str);
    }

    /* JADX INFO: renamed from: e */
    public void m109723e(WebViewX webViewX, String str, String... strArr) {
        m109722d(webViewX, m109720b(str, strArr));
    }

    /* JADX INFO: renamed from: f */
    public final void m109724f(final WebViewX webViewX, final String str) {
        e51.m114742G(new Runnable() { // from class: l.c2a
            @Override // java.lang.Runnable
            public final void run() {
                d2a.m109719a(webViewX, str);
            }
        });
    }
}
