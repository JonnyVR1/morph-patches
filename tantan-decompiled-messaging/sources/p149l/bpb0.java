package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bpb0 {
    /* JADX INFO: renamed from: a */
    public static void m103050a(apb0 apb0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        apb0Var.f71010f = (VLinear) viewGroup.getChildAt(0);
        apb0Var.f71011g = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        apb0Var.f71012h = (VText_Medium) viewGroup.getChildAt(1);
        apb0Var.f71013i = (VLinear) viewGroup.getChildAt(2);
        apb0Var.f71014j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        apb0Var.f71015k = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        apb0Var.f71016l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        apb0Var.f71017m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        apb0Var.f71018n = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        apb0Var.f71019o = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(3);
    }
}
