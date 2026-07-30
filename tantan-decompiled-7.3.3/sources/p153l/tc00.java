package p153l;

import android.annotation.SuppressLint;
import android.webkit.ValueCallback;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class tc00 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m190408a(MKWebView mKWebView, String str) {
        if (NullChecker.m82487b(mKWebView)) {
            mKWebView.loadUrl(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m190409b(y20 y20Var, String str) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m190411d(String str, String... strArr) {
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

    /* JADX INFO: renamed from: e */
    public static String m190412e(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (NullChecker.m82486a(strArr[i])) {
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
    public void m190413f(MKWebView mKWebView, String str) {
        m190414g(mKWebView, m190411d(str, new String[0]));
    }

    /* JADX INFO: renamed from: g */
    public void m190414g(MKWebView mKWebView, String str) {
        m190421n(mKWebView, str);
    }

    /* JADX INFO: renamed from: h */
    public final void m190415h(MKWebView mKWebView, String str, y20<String> y20Var) {
        m190420m(mKWebView, str, y20Var);
    }

    /* JADX INFO: renamed from: i */
    public void m190416i(MKWebView mKWebView, String str, String... strArr) {
        m190414g(mKWebView, m190411d(str, strArr));
    }

    /* JADX INFO: renamed from: j */
    public void m190417j(MKWebView mKWebView, String str, y20<String> y20Var, String... strArr) {
        m190415h(mKWebView, m190411d(str, strArr), y20Var);
    }

    /* JADX INFO: renamed from: k */
    public void m190418k(MKWebView mKWebView, String str, String... strArr) {
        m190415h(mKWebView, m190411d(str, strArr), null);
    }

    /* JADX INFO: renamed from: l */
    public void m190419l(MKWebView mKWebView, String str, String... strArr) {
        m190415h(mKWebView, m190412e(str, strArr), null);
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: m */
    public final void m190420m(final MKWebView mKWebView, final String str, final y20<String> y20Var) {
        l51.m152887G(new Runnable() { // from class: l.rc00
            @Override // java.lang.Runnable
            public final void run() {
                mKWebView.evaluateJavascript(str, new ValueCallback() { // from class: l.sc00
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        tc00.m190409b(y20Var, (String) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m190421n(final MKWebView mKWebView, final String str) {
        l51.m152887G(new Runnable() { // from class: l.qc00
            @Override // java.lang.Runnable
            public final void run() {
                tc00.m190408a(mKWebView, str);
            }
        });
    }
}
