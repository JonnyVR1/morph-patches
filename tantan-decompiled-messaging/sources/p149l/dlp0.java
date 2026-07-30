package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.p065ui.WebViewPreAct;

/* JADX INFO: loaded from: classes12.dex */
public class dlp0 {
    /* JADX INFO: renamed from: a */
    public static void m112408a(WebViewPreAct webViewPreAct, View view) {
        webViewPreAct.f54286c = (FrameLayout) view.findViewById(s4c0.f162352o0);
        ViewGroup viewGroup = (ViewGroup) view;
        webViewPreAct.f54287d = (WebViewX) viewGroup.getChildAt(0);
        webViewPreAct.f54288e = (ProgressBar) viewGroup.getChildAt(1);
        webViewPreAct.f54289f = (FrameLayout) viewGroup.getChildAt(2);
        webViewPreAct.f54290g = (FrameLayout) viewGroup.getChildAt(3);
        webViewPreAct.f54291h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m112409b(WebViewPreAct webViewPreAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.f89540V, viewGroup, false);
        m112408a(webViewPreAct, viewInflate);
        return viewInflate;
    }
}
