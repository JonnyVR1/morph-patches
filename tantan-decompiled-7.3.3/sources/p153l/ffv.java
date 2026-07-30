package p153l;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: classes13.dex */
public class ffv {
    /* JADX INFO: renamed from: a */
    public static void m125425a(@Nullable MKWebView mKWebView, w0c w0cVar) {
        if (w0cVar != null) {
            w0cVar.m204135K();
        }
        if (mKWebView != null) {
            mKWebView.removeJavascriptInterface("app");
            mKWebView.removeAllViews();
            ViewParent parent = mKWebView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(mKWebView);
            }
            mKWebView.setTag(null);
            mKWebView.clearHistory();
            mKWebView.destroy();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m125426b(@Nullable WebViewX webViewX, @Nullable zpq zpqVar) {
        if (zpqVar != null) {
            zpqVar.m220926k();
        }
        if (webViewX != null) {
            webViewX.removeJavascriptInterface("app");
            webViewX.removeAllViews();
            ViewParent parent = webViewX.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webViewX);
            }
            webViewX.setTag(null);
            webViewX.clearHistory();
            webViewX.destroy();
        }
    }
}
