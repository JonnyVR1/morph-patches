package p009l;

import android.annotation.SuppressLint;
import android.webkit.ValueCallback;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import l.e30;
import l.e51;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w300 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m23783a(MKWebView mKWebView, String str) {
        if (NullChecker.b(mKWebView)) {
            mKWebView.loadUrl(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m23784b(e30 e30Var, String str) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m23786d(String str, String... strArr) {
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

    /* JADX INFO: renamed from: e */
    public static String m23787e(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (NullChecker.a(strArr[i])) {
                sb.append(strArr[i]);
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return String.format("javascript:%s(%s)", str, sb.toString());
    }

    /* JADX INFO: renamed from: f */
    public void m23788f(MKWebView mKWebView, String str) {
        m23789g(mKWebView, m23786d(str, new String[0]));
    }

    /* JADX INFO: renamed from: g */
    public void m23789g(MKWebView mKWebView, String str) {
        m23796n(mKWebView, str);
    }

    /* JADX INFO: renamed from: h */
    public final void m23790h(MKWebView mKWebView, String str, e30<String> e30Var) {
        m23795m(mKWebView, str, e30Var);
    }

    /* JADX INFO: renamed from: i */
    public void m23791i(MKWebView mKWebView, String str, String... strArr) {
        m23789g(mKWebView, m23786d(str, strArr));
    }

    /* JADX INFO: renamed from: j */
    public void m23792j(MKWebView mKWebView, String str, e30<String> e30Var, String... strArr) {
        m23790h(mKWebView, m23786d(str, strArr), e30Var);
    }

    /* JADX INFO: renamed from: k */
    public void m23793k(MKWebView mKWebView, String str, String... strArr) {
        m23790h(mKWebView, m23786d(str, strArr), null);
    }

    /* JADX INFO: renamed from: l */
    public void m23794l(MKWebView mKWebView, String str, String... strArr) {
        m23790h(mKWebView, m23787e(str, strArr), null);
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: m */
    public final void m23795m(final MKWebView mKWebView, final String str, final e30<String> e30Var) {
        e51.G(new Runnable() { // from class: l.u300
            @Override // java.lang.Runnable
            public final void run() {
                mKWebView.evaluateJavascript(str, new ValueCallback() { // from class: l.v300
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        w300.m23784b(e30Var, (String) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m23796n(final MKWebView mKWebView, final String str) {
        e51.G(new Runnable() { // from class: l.t300
            @Override // java.lang.Runnable
            public final void run() {
                w300.m23783a(mKWebView, str);
            }
        });
    }
}
