package p149l;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.web.WebViewX;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes13.dex */
public class edv {
    /* JADX INFO: renamed from: a */
    public static void m115834a(@Nullable WebViewX webViewX, @Nullable aoq aoqVar) {
        if (aoqVar != null) {
            aoqVar.m97931k();
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

    /* JADX INFO: renamed from: b */
    public static void m115835b(@Nullable MKWebView mKWebView, izb izbVar) {
        if (izbVar != null) {
            izbVar.m139039y();
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
}
