package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundFrameLayout;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sx00 {
    /* JADX INFO: renamed from: a */
    public static void m188417a(rx00 rx00Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rx00Var.f165266f = (VLinear) viewGroup.getChildAt(0);
        rx00Var.f165267g = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rx00Var.f165268h = (VText_Medium) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        rx00Var.f165269i = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rx00Var.f165270j = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        rx00Var.f165271k = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        rx00Var.f165272l = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        rx00Var.f165273m = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rx00Var.f165274n = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        rx00Var.f165275o = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        rx00Var.f165276p = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        rx00Var.f165277q = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0);
        rx00Var.f165278r = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
        rx00Var.f165279s = (RoundFrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rx00Var.f165280t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        rx00Var.f165281u = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
