package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundFrameLayout;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jp00 {
    /* JADX INFO: renamed from: a */
    public static void m142558a(ip00 ip00Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ip00Var.f114220f = (VLinear) viewGroup.getChildAt(0);
        ip00Var.f114221g = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ip00Var.f114222h = (VText_Medium) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ip00Var.f114223i = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ip00Var.f114224j = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        ip00Var.f114225k = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        ip00Var.f114226l = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        ip00Var.f114227m = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ip00Var.f114228n = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        ip00Var.f114229o = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        ip00Var.f114230p = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        ip00Var.f114231q = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0);
        ip00Var.f114232r = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
        ip00Var.f114233s = (RoundFrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        ip00Var.f114234t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        ip00Var.f114235u = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
