package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.p070ui.WebViewPreAct;

/* JADX INFO: loaded from: classes13.dex */
public class hup0 {
    /* JADX INFO: renamed from: a */
    public static void m137250a(WebViewPreAct webViewPreAct, View view) {
        webViewPreAct.f55134c = (FrameLayout) view.findViewById(ycc0.f198473o0);
        ViewGroup viewGroup = (ViewGroup) view;
        webViewPreAct.f55135d = (WebViewX) viewGroup.getChildAt(0);
        webViewPreAct.f55136e = (ProgressBar) viewGroup.getChildAt(1);
        webViewPreAct.f55137f = (FrameLayout) viewGroup.getChildAt(2);
        webViewPreAct.f55138g = (FrameLayout) viewGroup.getChildAt(3);
        webViewPreAct.f55139h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m137251b(WebViewPreAct webViewPreAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(jec0.f120453V, viewGroup, false);
        m137250a(webViewPreAct, viewInflate);
        return viewInflate;
    }
}
