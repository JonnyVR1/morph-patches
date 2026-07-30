package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.ec1;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fc1 {
    /* JADX INFO: renamed from: a */
    public static void m6466a(ec1 ec1Var, View view) {
        ec1Var.j = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ec1Var.k = viewGroup.getChildAt(0);
        ec1Var.l = viewGroup.getChildAt(1);
        ec1Var.m = (ImageView) viewGroup.getChildAt(2);
        ec1Var.n = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        ec1Var.o = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        ec1Var.p = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        ec1Var.q = viewGroup.getChildAt(4);
        ec1Var.r = viewGroup.getChildAt(5);
        ec1Var.s = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m6467b(ec1 ec1Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.M, viewGroup, false);
        m6466a(ec1Var, viewInflate);
        return viewInflate;
    }
}
