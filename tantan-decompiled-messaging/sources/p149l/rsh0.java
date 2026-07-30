package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rsh0 {
    /* JADX INFO: renamed from: a */
    public static void m180668a(qsh0 qsh0Var, View view) {
        qsh0Var.f156205a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qsh0Var.f156206b = (VDraweeView) viewGroup.getChildAt(0);
        qsh0Var.f156207c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qsh0Var.f156208d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        qsh0Var.f156209e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        qsh0Var.f156210f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        qsh0Var.f156211g = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        qsh0Var.f156212h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        qsh0Var.f156213i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        qsh0Var.f156214j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        qsh0Var.f156215k = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        qsh0Var.f156216l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        qsh0Var.f156217m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        qsh0Var.f156218n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        qsh0Var.f156219o = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2);
        qsh0Var.f156220p = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        qsh0Var.f156221q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        qsh0Var.f156222r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(2);
        qsh0Var.f156223s = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2);
        qsh0Var.f156224t = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0);
        qsh0Var.f156225u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(1);
        qsh0Var.f156226v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(2);
        qsh0Var.f156227w = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3);
        qsh0Var.f156228x = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3)).getChildAt(0);
        qsh0Var.f156229y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3)).getChildAt(1);
        qsh0Var.f156230z = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3)).getChildAt(2);
        qsh0Var.f156195A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        qsh0Var.f156196B = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m180669b(qsh0 qsh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(i6c0.f111707b, viewGroup, false);
        m180668a(qsh0Var, viewInflate);
        return viewInflate;
    }
}
