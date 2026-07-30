package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes10.dex */
public class n5h0 {
    /* JADX INFO: renamed from: a */
    public static void m157992a(m5h0 m5h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        m5h0Var.f131394a = (FrameLayout) viewGroup.getChildAt(0);
        m5h0Var.f131395b = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m157993b(m5h0 m5h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121305I1, viewGroup, true);
        m157992a(m5h0Var, viewInflate);
        return viewInflate;
    }
}
