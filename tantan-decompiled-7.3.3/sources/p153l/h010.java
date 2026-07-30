package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p151v.VFrame;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class h010 {
    /* JADX INFO: renamed from: a */
    public static void m133144a(g010 g010Var, View view) {
        g010Var.f101583a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        g010Var.f101584b = (VScroll) viewGroup.getChildAt(0);
        g010Var.f101585c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        g010Var.f101586d = (FrameLayout) viewGroup.getChildAt(1);
        g010Var.f101587e = (LinearLayout) viewGroup.getChildAt(2);
        g010Var.f101588f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        g010Var.f101589g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        g010Var.f101590h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        g010Var.f101591i = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        g010Var.f101592j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m133145b(g010 g010Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173482C4, viewGroup, false);
        m133144a(g010Var, viewInflate);
        return viewInflate;
    }
}
