package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.xv */
/* JADX INFO: loaded from: classes10.dex */
public class C21226xv {
    /* JADX INFO: renamed from: a */
    public static void m211236a(C20966wv c20966wv, View view) {
        c20966wv.f188176a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c20966wv.f188177b = (VNavigationBar) viewGroup.getChildAt(0);
        c20966wv.f188178c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        c20966wv.f188179d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        c20966wv.f188180e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        c20966wv.f188181f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        c20966wv.f188182g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        c20966wv.f188183h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        c20966wv.f188184i = (VRelative) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        c20966wv.f188185j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(0);
        c20966wv.f188186k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(2);
        c20966wv.f188187l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(3);
        c20966wv.f188188m = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(4);
        c20966wv.f188189n = (VRelative) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        c20966wv.f188190o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1)).getChildAt(0);
        c20966wv.f188191p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1)).getChildAt(2);
        c20966wv.f188192q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1)).getChildAt(3);
        c20966wv.f188193r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1)).getChildAt(4);
        c20966wv.f188194s = (VLinear) viewGroup.getChildAt(2);
        c20966wv.f188195t = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        c20966wv.f188196u = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m211237b(C20966wv c20966wv, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137364m, viewGroup, false);
        m211236a(c20966wv, viewInflate);
        return viewInflate;
    }
}
