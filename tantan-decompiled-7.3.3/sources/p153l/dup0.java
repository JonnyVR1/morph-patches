package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.core.p058ui.WebViewFrag;

/* JADX INFO: loaded from: classes10.dex */
public class dup0 {
    /* JADX INFO: renamed from: a */
    public static void m118164a(WebViewFrag webViewFrag, View view) {
        webViewFrag.f29033z = (FrameLayout) view.findViewById(odc0.f146879r);
        ViewGroup viewGroup = (ViewGroup) view;
        webViewFrag.f29024A = (WebViewX) viewGroup.getChildAt(0);
        webViewFrag.f29025B = (ProgressBar) viewGroup.getChildAt(1);
        webViewFrag.f29026C = (FrameLayout) viewGroup.getChildAt(2);
        webViewFrag.f29027D = (FrameLayout) viewGroup.getChildAt(3);
        webViewFrag.f29028E = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m118165b(WebViewFrag webViewFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(afc0.f70900g, viewGroup, false);
        m118164a(webViewFrag, viewInflate);
        return viewInflate;
    }
}
