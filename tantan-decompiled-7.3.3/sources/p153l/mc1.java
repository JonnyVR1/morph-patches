package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mc1 {
    /* JADX INFO: renamed from: a */
    public static void m157909a(lc1 lc1Var, View view) {
        lc1Var.f131250j = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lc1Var.f131251k = (VDraweeView) viewGroup.getChildAt(0);
        lc1Var.f131252l = (VDraweeView) viewGroup.getChildAt(1);
        lc1Var.f131253m = (ImageView) viewGroup.getChildAt(2);
        lc1Var.f131254n = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        lc1Var.f131255o = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        lc1Var.f131256p = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        lc1Var.f131257q = (VDraweeView) viewGroup.getChildAt(4);
        lc1Var.f131258r = (VText) viewGroup.getChildAt(5);
        lc1Var.f131259s = (VText) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m157910b(lc1 lc1Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125512M, viewGroup, false);
        m157909a(lc1Var, viewInflate);
        return viewInflate;
    }
}
