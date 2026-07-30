package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class z01 {
    /* JADX INFO: renamed from: a */
    public static void m218099a(y01 y01Var, View view) {
        y01Var.f196937a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        y01Var.f196938b = viewGroup.getChildAt(0);
        y01Var.f196939c = viewGroup.getChildAt(1);
        y01Var.f196940d = (TextView) viewGroup.getChildAt(2);
        y01Var.f196941e = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m218100b(y01 y01Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199094h, viewGroup, false);
        m218099a(y01Var, viewInflate);
        return viewInflate;
    }
}
