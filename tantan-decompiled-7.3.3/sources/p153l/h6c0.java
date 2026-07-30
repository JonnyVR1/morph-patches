package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h6c0 {
    /* JADX INFO: renamed from: a */
    public static void m133682a(g6c0 g6c0Var, View view) {
        g6c0Var._rootView = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        g6c0Var._svga_bg_loading = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        g6c0Var._center_svga_layout = (VFrame) viewGroup.getChildAt(1);
        g6c0Var._svga_ic = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        g6c0Var._desc_layout = (VLinear) viewGroup.getChildAt(2);
        g6c0Var._desc = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        g6c0Var._sub_desc = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        g6c0Var._close = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        g6c0Var._svga_pop_pre = (SVGAnimationView) viewGroup.getChildAt(3);
        g6c0Var._svga_pop_real = (SVGAnimationView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m133683b(g6c0 g6c0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125479Je, viewGroup, true);
        m133682a(g6c0Var, viewInflate);
        return viewInflate;
    }
}
