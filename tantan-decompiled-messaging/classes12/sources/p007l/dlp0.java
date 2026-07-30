package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p1.mobile.putong.ui.WebViewPreAct;
import l.e6c0;
import l.s4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dlp0 {
    /* JADX INFO: renamed from: a */
    public static void m9470a(WebViewPreAct webViewPreAct, View view) {
        webViewPreAct.c = (FrameLayout) view.findViewById(s4c0.o0);
        ViewGroup viewGroup = (ViewGroup) view;
        webViewPreAct.d = viewGroup.getChildAt(0);
        webViewPreAct.e = (ProgressBar) viewGroup.getChildAt(1);
        webViewPreAct.f = (FrameLayout) viewGroup.getChildAt(2);
        webViewPreAct.g = (FrameLayout) viewGroup.getChildAt(3);
        webViewPreAct.h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9471b(WebViewPreAct webViewPreAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.V, viewGroup, false);
        m9470a(webViewPreAct, viewInflate);
        return viewInflate;
    }
}
