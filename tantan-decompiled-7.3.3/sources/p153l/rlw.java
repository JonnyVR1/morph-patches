package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.core.p058ui.MKWebViewFrag;

/* JADX INFO: loaded from: classes10.dex */
public class rlw {
    /* JADX INFO: renamed from: a */
    public static void m182032a(MKWebViewFrag mKWebViewFrag, View view) {
        mKWebViewFrag.f28851z = (FrameLayout) view.findViewById(adc0.f70037Nb);
        ViewGroup viewGroup = (ViewGroup) view;
        mKWebViewFrag.f28838A = (MKWebView) viewGroup.getChildAt(0);
        mKWebViewFrag.f28839B = (ProgressBar) viewGroup.getChildAt(1);
        mKWebViewFrag.f28840C = (FrameLayout) viewGroup.getChildAt(2);
        mKWebViewFrag.f28841D = (FrameLayout) viewGroup.getChildAt(3);
        mKWebViewFrag.f28842E = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m182033b(MKWebViewFrag mKWebViewFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125408F7, viewGroup, false);
        m182032a(mKWebViewFrag, viewInflate);
        return viewInflate;
    }
}
