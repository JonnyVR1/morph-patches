package p153l;

import com.p051p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class o3a {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m165844a(WebViewX webViewX, String str) {
        if (NullChecker.m82487b(webViewX)) {
            webViewX.loadUrl(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m165845b(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (NullChecker.m82486a(strArr[i])) {
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
    public void m165846c(WebViewX webViewX, String str) {
        m165847d(webViewX, m165845b(str, new String[0]));
    }

    /* JADX INFO: renamed from: d */
    public void m165847d(WebViewX webViewX, String str) {
        m165849f(webViewX, str);
    }

    /* JADX INFO: renamed from: e */
    public void m165848e(WebViewX webViewX, String str, String... strArr) {
        m165847d(webViewX, m165845b(str, strArr));
    }

    /* JADX INFO: renamed from: f */
    public final void m165849f(final WebViewX webViewX, final String str) {
        l51.m152887G(new Runnable() { // from class: l.n3a
            @Override // java.lang.Runnable
            public final void run() {
                o3a.m165844a(webViewX, str);
            }
        });
    }
}
