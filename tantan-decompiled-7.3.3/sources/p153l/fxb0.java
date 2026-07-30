package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fxb0 {
    /* JADX INFO: renamed from: a */
    public static void m127971a(exb0 exb0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        exb0Var.f96266f = (VLinear) viewGroup.getChildAt(0);
        exb0Var.f96267g = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        exb0Var.f96268h = (VText_Medium) viewGroup.getChildAt(1);
        exb0Var.f96269i = (VLinear) viewGroup.getChildAt(2);
        exb0Var.f96270j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        exb0Var.f96271k = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        exb0Var.f96272l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        exb0Var.f96273m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        exb0Var.f96274n = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        exb0Var.f96275o = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(3);
    }
}
