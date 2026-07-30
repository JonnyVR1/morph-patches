package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.jpa0;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kpa0 {
    /* JADX INFO: renamed from: a */
    public static void m7629a(jpa0 jpa0Var, View view) {
        jpa0Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jpa0Var.v = viewGroup.getChildAt(0);
        jpa0Var.w = viewGroup.getChildAt(1);
        jpa0Var.x = viewGroup.getChildAt(2);
        jpa0Var.y = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m7630b(jpa0 jpa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ga, viewGroup, false);
        m7629a(jpa0Var, viewInflate);
        return viewInflate;
    }
}
