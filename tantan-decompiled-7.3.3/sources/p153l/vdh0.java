package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes10.dex */
public class vdh0 {
    /* JADX INFO: renamed from: a */
    public static void m200966a(udh0 udh0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        udh0Var.f178527a = (FrameLayout) viewGroup.getChildAt(0);
        udh0Var.f178528b = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m200967b(udh0 udh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151913I1, viewGroup, true);
        m200966a(udh0Var, viewInflate);
        return viewInflate;
    }
}
