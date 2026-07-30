package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p046p1.mobile.putong.core.p053ui.MKWebViewFrag;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes10.dex */
public class uiw {
    /* JADX INFO: renamed from: a */
    public static void m193962a(MKWebViewFrag mKWebViewFrag, View view) {
        mKWebViewFrag.f28003z = (FrameLayout) view.findViewById(u4c0.f173915Lb);
        ViewGroup viewGroup = (ViewGroup) view;
        mKWebViewFrag.f27990A = (MKWebView) viewGroup.getChildAt(0);
        mKWebViewFrag.f27991B = (ProgressBar) viewGroup.getChildAt(1);
        mKWebViewFrag.f27992C = (FrameLayout) viewGroup.getChildAt(2);
        mKWebViewFrag.f27993D = (FrameLayout) viewGroup.getChildAt(3);
        mKWebViewFrag.f27994E = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m193963b(MKWebViewFrag mKWebViewFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96097y7, viewGroup, false);
        m193962a(mKWebViewFrag, viewInflate);
        return viewInflate;
    }
}
