package p149l;

import android.annotation.SuppressLint;
import android.webkit.ValueCallback;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes11.dex */
public class w300 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m201234a(MKWebView mKWebView, String str) {
        if (NullChecker.m81304b(mKWebView)) {
            mKWebView.loadUrl(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m201235b(e30 e30Var, String str) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m201237d(String str, String... strArr) {
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

    /* JADX INFO: renamed from: e */
    public static String m201238e(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (NullChecker.m81303a(strArr[i])) {
                sb.append(strArr[i]);
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return String.format("javascript:%s(%s)", str, sb.toString());
    }

    /* JADX INFO: renamed from: f */
    public void m201239f(MKWebView mKWebView, String str) {
        m201240g(mKWebView, m201237d(str, new String[0]));
    }

    /* JADX INFO: renamed from: g */
    public void m201240g(MKWebView mKWebView, String str) {
        m201247n(mKWebView, str);
    }

    /* JADX INFO: renamed from: h */
    public final void m201241h(MKWebView mKWebView, String str, e30<String> e30Var) {
        m201246m(mKWebView, str, e30Var);
    }

    /* JADX INFO: renamed from: i */
    public void m201242i(MKWebView mKWebView, String str, String... strArr) {
        m201240g(mKWebView, m201237d(str, strArr));
    }

    /* JADX INFO: renamed from: j */
    public void m201243j(MKWebView mKWebView, String str, e30<String> e30Var, String... strArr) {
        m201241h(mKWebView, m201237d(str, strArr), e30Var);
    }

    /* JADX INFO: renamed from: k */
    public void m201244k(MKWebView mKWebView, String str, String... strArr) {
        m201241h(mKWebView, m201237d(str, strArr), null);
    }

    /* JADX INFO: renamed from: l */
    public void m201245l(MKWebView mKWebView, String str, String... strArr) {
        m201241h(mKWebView, m201238e(str, strArr), null);
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: m */
    public final void m201246m(final MKWebView mKWebView, final String str, final e30<String> e30Var) {
        e51.m114742G(new Runnable() { // from class: l.u300
            @Override // java.lang.Runnable
            public final void run() {
                mKWebView.evaluateJavascript(str, new ValueCallback() { // from class: l.v300
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        w300.m201235b(e30Var, (String) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m201247n(final MKWebView mKWebView, final String str) {
        e51.m114742G(new Runnable() { // from class: l.t300
            @Override // java.lang.Runnable
            public final void run() {
                w300.m201234a(mKWebView, str);
            }
        });
    }
}
