package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ntm0 {
    /* JADX INFO: renamed from: a */
    public static void m161394a(mtm0 mtm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mtm0Var.f135625a = (ImageView) viewGroup.getChildAt(0);
        mtm0Var.f135626b = (VDraweeView) viewGroup.getChildAt(1);
        mtm0Var.f135627c = (VText) viewGroup.getChildAt(2);
        mtm0Var.f135628d = (VText) viewGroup.getChildAt(3);
        mtm0Var.f135629e = (ConstraintLayout) viewGroup.getChildAt(4);
        mtm0Var.f135630f = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        mtm0Var.f135631g = (ConstraintLayout) viewGroup.getChildAt(5);
        mtm0Var.f135632h = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        mtm0Var.f135633i = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        mtm0Var.f135634j = (ConstraintLayout) viewGroup.getChildAt(6);
        mtm0Var.f135635k = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        mtm0Var.f135636l = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        mtm0Var.f135637m = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m161395b(mtm0 mtm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126260A4, viewGroup, false);
        m161394a(mtm0Var, viewInflate);
        return viewInflate;
    }
}
