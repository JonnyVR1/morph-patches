package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z0i0 {
    /* JADX INFO: renamed from: a */
    public static void m218132a(y0i0 y0i0Var, View view) {
        y0i0Var.f196988a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        y0i0Var.f196989b = (VDraweeView) viewGroup.getChildAt(0);
        y0i0Var.f196990c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        y0i0Var.f196991d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        y0i0Var.f196992e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        y0i0Var.f196993f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        y0i0Var.f196994g = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        y0i0Var.f196995h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        y0i0Var.f196996i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        y0i0Var.f196997j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        y0i0Var.f196998k = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        y0i0Var.f196999l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        y0i0Var.f197000m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        y0i0Var.f197001n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        y0i0Var.f197002o = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2);
        y0i0Var.f197003p = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        y0i0Var.f197004q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        y0i0Var.f197005r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(2);
        y0i0Var.f197006s = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2);
        y0i0Var.f197007t = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0);
        y0i0Var.f197008u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(1);
        y0i0Var.f197009v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(2);
        y0i0Var.f197010w = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3);
        y0i0Var.f197011x = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3)).getChildAt(0);
        y0i0Var.f197012y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3)).getChildAt(1);
        y0i0Var.f197013z = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3)).getChildAt(2);
        y0i0Var.f196978A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        y0i0Var.f196979B = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m218133b(y0i0 y0i0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(nec0.f141617b, viewGroup, false);
        m218132a(y0i0Var, viewInflate);
        return viewInflate;
    }
}
