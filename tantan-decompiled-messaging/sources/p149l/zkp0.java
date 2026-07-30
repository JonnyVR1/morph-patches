package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.core.p053ui.WebViewFrag;

/* JADX INFO: loaded from: classes10.dex */
public class zkp0 {
    /* JADX INFO: renamed from: a */
    public static void m219193a(WebViewFrag webViewFrag, View view) {
        webViewFrag.f28185z = (FrameLayout) view.findViewById(i5c0.f111557r);
        ViewGroup viewGroup = (ViewGroup) view;
        webViewFrag.f28176A = (WebViewX) viewGroup.getChildAt(0);
        webViewFrag.f28177B = (ProgressBar) viewGroup.getChildAt(1);
        webViewFrag.f28178C = (FrameLayout) viewGroup.getChildAt(2);
        webViewFrag.f28179D = (FrameLayout) viewGroup.getChildAt(3);
        webViewFrag.f28180E = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m219194b(WebViewFrag webViewFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(v6c0.f180184g, viewGroup, false);
        m219193a(webViewFrag, viewInflate);
        return viewInflate;
    }
}
