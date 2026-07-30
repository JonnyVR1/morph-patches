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
public class r2n0 {
    /* JADX INFO: renamed from: a */
    public static void m179543a(q2n0 q2n0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        q2n0Var.f155359a = (ImageView) viewGroup.getChildAt(0);
        q2n0Var.f155360b = (VDraweeView) viewGroup.getChildAt(1);
        q2n0Var.f155361c = (VText) viewGroup.getChildAt(2);
        q2n0Var.f155362d = (VText) viewGroup.getChildAt(3);
        q2n0Var.f155363e = (ConstraintLayout) viewGroup.getChildAt(4);
        q2n0Var.f155364f = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        q2n0Var.f155365g = (ConstraintLayout) viewGroup.getChildAt(5);
        q2n0Var.f155366h = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        q2n0Var.f155367i = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        q2n0Var.f155368j = (ConstraintLayout) viewGroup.getChildAt(6);
        q2n0Var.f155369k = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        q2n0Var.f155370l = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        q2n0Var.f155371m = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m179544b(q2n0 q2n0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156816A4, viewGroup, false);
        m179543a(q2n0Var, viewInflate);
        return viewInflate;
    }
}
