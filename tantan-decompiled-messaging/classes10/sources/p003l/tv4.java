package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.sv4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tv4 {
    /* JADX INFO: renamed from: a */
    public static void m9619a(sv4 sv4Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sv4Var.a = viewGroup.getChildAt(0);
        sv4Var.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        sv4Var.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9620b(sv4 sv4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f1, viewGroup, false);
        m9619a(sv4Var, viewInflate);
        return viewInflate;
    }
}
