package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s01 {
    /* JADX INFO: renamed from: a */
    public static void m22182a(r01 r01Var, View view) {
        r01Var.f18298a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r01Var.f18299b = viewGroup.getChildAt(0);
        r01Var.f18300c = viewGroup.getChildAt(1);
        r01Var.f18301d = (TextView) viewGroup.getChildAt(2);
        r01Var.f18302e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m22183b(r01 r01Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19858h, viewGroup, false);
        m22182a(r01Var, viewInflate);
        return viewInflate;
    }
}
