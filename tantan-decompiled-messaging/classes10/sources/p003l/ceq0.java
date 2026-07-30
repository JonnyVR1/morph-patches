package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.beq0;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ceq0 {
    /* JADX INFO: renamed from: a */
    public static void m5937a(beq0 beq0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        beq0Var.a = viewGroup.getChildAt(0);
        beq0Var.b = viewGroup.getChildAt(2);
        beq0Var.c = viewGroup.getChildAt(4);
        beq0Var.d = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m5938b(beq0 beq0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Wc, viewGroup, false);
        m5937a(beq0Var, viewInflate);
        return viewInflate;
    }
}
