package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VScroll;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.ay */
/* JADX INFO: loaded from: classes10.dex */
public class C15756ay {
    /* JADX INFO: renamed from: a */
    public static void m99532a(C21800zx c21800zx, View view) {
        c21800zx.f205340a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c21800zx.f205341b = (VNavigationBar) viewGroup.getChildAt(0);
        c21800zx.f205342c = (VText) viewGroup.getChildAt(1);
        c21800zx.f205343d = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        c21800zx.f205344e = (VScroll) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        c21800zx.f205345f = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        c21800zx.f205346g = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c21800zx.f205347h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c21800zx.f205348i = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        c21800zx.f205349j = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        c21800zx.f205350k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        c21800zx.f205351l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        c21800zx.f205352m = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        c21800zx.f205353n = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        c21800zx.f205354o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        c21800zx.f205355p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        c21800zx.f205356q = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        c21800zx.f205357r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        c21800zx.f205358s = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        c21800zx.f205359t = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        c21800zx.f205360u = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        c21800zx.f205361v = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        c21800zx.f205362w = (VLinear) viewGroup.getChildAt(3);
        c21800zx.f205363x = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        c21800zx.f205364y = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m99533b(C21800zx c21800zx, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137316P0, viewGroup, false);
        m99532a(c21800zx, viewInflate);
        return viewInflate;
    }
}
