package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class s01 {
    /* JADX INFO: renamed from: a */
    public static void m181811a(r01 r01Var, View view) {
        r01Var.f157126a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r01Var.f157127b = viewGroup.getChildAt(0);
        r01Var.f157128c = viewGroup.getChildAt(1);
        r01Var.f157129d = (TextView) viewGroup.getChildAt(2);
        r01Var.f157130e = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m181812b(r01 r01Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168362h, viewGroup, false);
        m181811a(r01Var, viewInflate);
        return viewInflate;
    }
}
