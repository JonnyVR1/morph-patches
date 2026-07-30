package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class qmf0 {
    /* JADX INFO: renamed from: a */
    public static void m177108a(pmf0 pmf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pmf0Var.f153163a = (VScroll) viewGroup.getChildAt(0);
        pmf0Var.f153164b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        pmf0Var.f153165c = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        pmf0Var.f153166d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        pmf0Var.f153167e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        pmf0Var.f153168f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        pmf0Var.f153169g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        pmf0Var.f153170h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(4);
        pmf0Var.f153171i = (VLinear) viewGroup.getChildAt(1);
        pmf0Var.f153172j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pmf0Var.f153173k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pmf0Var.f153174l = (ConstraintLayout) viewGroup.getChildAt(2);
        pmf0Var.f153175m = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pmf0Var.f153176n = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        pmf0Var.f153177o = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        pmf0Var.f153178p = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m177109b(pmf0 pmf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109114h0, viewGroup, false);
        m177108a(pmf0Var, viewInflate);
        return viewInflate;
    }
}
