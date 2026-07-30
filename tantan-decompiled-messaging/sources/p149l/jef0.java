package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class jef0 {
    /* JADX INFO: renamed from: a */
    public static void m141125a(ief0 ief0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ief0Var.f112757a = (VScroll) viewGroup.getChildAt(0);
        ief0Var.f112758b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ief0Var.f112759c = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        ief0Var.f112760d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ief0Var.f112761e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        ief0Var.f112762f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        ief0Var.f112763g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        ief0Var.f112764h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(4);
        ief0Var.f112765i = (VLinear) viewGroup.getChildAt(1);
        ief0Var.f112766j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ief0Var.f112767k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ief0Var.f112768l = (ConstraintLayout) viewGroup.getChildAt(2);
        ief0Var.f112769m = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ief0Var.f112770n = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ief0Var.f112771o = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ief0Var.f112772p = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m141126b(ief0 ief0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79502h0, viewGroup, false);
        m141125a(ief0Var, viewInflate);
        return viewInflate;
    }
}
