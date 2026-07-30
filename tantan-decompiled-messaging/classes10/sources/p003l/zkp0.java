package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p1.mobile.putong.core.ui.WebViewFrag;
import l.i5c0;
import l.v6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zkp0 {
    /* JADX INFO: renamed from: a */
    public static void m11431a(WebViewFrag webViewFrag, View view) {
        webViewFrag.z = (FrameLayout) view.findViewById(i5c0.r);
        ViewGroup viewGroup = (ViewGroup) view;
        webViewFrag.A = viewGroup.getChildAt(0);
        webViewFrag.B = (ProgressBar) viewGroup.getChildAt(1);
        webViewFrag.C = (FrameLayout) viewGroup.getChildAt(2);
        webViewFrag.D = (FrameLayout) viewGroup.getChildAt(3);
        webViewFrag.E = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m11432b(WebViewFrag webViewFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(v6c0.g, viewGroup, false);
        m11431a(webViewFrag, viewInflate);
        return viewInflate;
    }
}
