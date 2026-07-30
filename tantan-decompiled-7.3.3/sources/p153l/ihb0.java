package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.result.VRectBottomArc;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ihb0 {
    /* JADX INFO: renamed from: a */
    public static void m139968a(hhb0 hhb0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hhb0Var.f109500a = (Space) viewGroup.getChildAt(0);
        hhb0Var.f109501b = (FrameLayout) viewGroup.getChildAt(1);
        hhb0Var.f109502c = (FrameLayout) viewGroup.getChildAt(2);
        hhb0Var.f109503d = (VRectBottomArc) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        hhb0Var.f109504e = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        hhb0Var.f109505f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        hhb0Var.f109506g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        hhb0Var.f109507h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        hhb0Var.f109508i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        hhb0Var.f109509j = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        hhb0Var.f109510k = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        hhb0Var.f109511l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1);
        hhb0Var.f109512m = (LinearLayout) viewGroup.getChildAt(3);
        hhb0Var.f109513n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        hhb0Var.f109514o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        hhb0Var.f109515p = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        hhb0Var.f109516q = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        hhb0Var.f109517r = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m139969b(hhb0 hhb0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162447H1, viewGroup, false);
        m139968a(hhb0Var, viewInflate);
        return viewInflate;
    }
}
