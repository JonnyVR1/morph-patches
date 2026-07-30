package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.n6c0;
import l.qha0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rha0 {
    /* JADX INFO: renamed from: a */
    public static void m9141a(qha0 qha0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qha0Var.b = (TextView) viewGroup.getChildAt(0);
        qha0Var.c = viewGroup.getChildAt(1);
        qha0Var.d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9142b(qha0 qha0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.y, viewGroup, false);
        m9141a(qha0Var, viewInflate);
        return viewInflate;
    }
}
