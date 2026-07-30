package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.n6c0;
import l.oga0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pga0 {
    /* JADX INFO: renamed from: a */
    public static void m8746a(oga0 oga0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oga0Var.a = (TextView) viewGroup.getChildAt(0);
        oga0Var.b = (TextView) viewGroup.getChildAt(1);
        oga0Var.c = viewGroup.getChildAt(2);
        oga0Var.d = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m8747b(oga0 oga0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.B0, viewGroup, false);
        m8746a(oga0Var, viewInflate);
        return viewInflate;
    }
}
