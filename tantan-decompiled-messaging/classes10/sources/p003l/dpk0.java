package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.cpk0;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dpk0 {
    /* JADX INFO: renamed from: a */
    public static void m6190a(cpk0 cpk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cpk0Var.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cpk0Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cpk0Var.p = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        cpk0Var.q = viewGroup.getChildAt(1);
        cpk0Var.r = (LinearLayout) viewGroup.getChildAt(2);
        cpk0Var.s = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        cpk0Var.t = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        cpk0Var.u = viewGroup.getChildAt(3);
        cpk0Var.v = viewGroup.getChildAt(4);
        cpk0Var.w = viewGroup.getChildAt(5);
        cpk0Var.x = viewGroup.getChildAt(6);
        cpk0Var.y = viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m6191b(cpk0 cpk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.E2, viewGroup, false);
        m6190a(cpk0Var, viewInflate);
        return viewInflate;
    }
}
