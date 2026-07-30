package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dyb0 {
    /* JADX INFO: renamed from: a */
    public static void m114053a(cyb0 cyb0Var, View view) {
        cyb0Var._rootView = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cyb0Var._svga_bg_loading = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cyb0Var._center_svga_layout = (VFrame) viewGroup.getChildAt(1);
        cyb0Var._svga_ic = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cyb0Var._desc_layout = (VLinear) viewGroup.getChildAt(2);
        cyb0Var._desc = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        cyb0Var._sub_desc = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        cyb0Var._close = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        cyb0Var._svga_pop_pre = (SVGAnimationView) viewGroup.getChildAt(3);
        cyb0Var._svga_pop_real = (SVGAnimationView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m114054b(cyb0 cyb0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95313Ce, viewGroup, true);
        m114053a(cyb0Var, viewInflate);
        return viewInflate;
    }
}
