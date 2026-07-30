package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p1.mobile.putong.core.ui.MKWebViewFrag;
import l.f6c0;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uiw {
    /* JADX INFO: renamed from: a */
    public static void m9738a(MKWebViewFrag mKWebViewFrag, View view) {
        mKWebViewFrag.z = (FrameLayout) view.findViewById(u4c0.Lb);
        ViewGroup viewGroup = (ViewGroup) view;
        mKWebViewFrag.A = viewGroup.getChildAt(0);
        mKWebViewFrag.B = (ProgressBar) viewGroup.getChildAt(1);
        mKWebViewFrag.C = (FrameLayout) viewGroup.getChildAt(2);
        mKWebViewFrag.D = (FrameLayout) viewGroup.getChildAt(3);
        mKWebViewFrag.E = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9739b(MKWebViewFrag mKWebViewFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.y7, viewGroup, false);
        m9738a(mKWebViewFrag, viewInflate);
        return viewInflate;
    }
}
