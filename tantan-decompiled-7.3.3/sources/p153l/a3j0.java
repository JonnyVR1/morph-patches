package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class a3j0 {
    /* JADX INFO: renamed from: a */
    public static void m95803a(z2j0 z2j0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        z2j0Var.f202693k = viewGroup.getChildAt(0);
        z2j0Var.f202694l = (ConstraintLayout) viewGroup.getChildAt(1);
        z2j0Var.f202695m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        z2j0Var.f202696n = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        z2j0Var.f202697o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        z2j0Var.f202698p = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        z2j0Var.f202699q = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        z2j0Var.f202700r = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        z2j0Var.f202701s = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        z2j0Var.f202702t = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        z2j0Var.f202703u = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        z2j0Var.f202704v = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
        z2j0Var.f202705w = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        z2j0Var.f202706x = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        z2j0Var.f202707y = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
        z2j0Var.f202708z = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14);
        z2j0Var.f202689A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15);
    }

    /* JADX INFO: renamed from: b */
    public static View m95804b(z2j0 z2j0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199036c6, viewGroup, false);
        m95803a(z2j0Var, viewInflate);
        return viewInflate;
    }
}
