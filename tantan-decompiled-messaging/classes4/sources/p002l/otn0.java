package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.ntn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class otn0 {
    /* JADX INFO: renamed from: a */
    public static void m19745a(ntn0 ntn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ntn0Var.a = viewGroup.getChildAt(0);
        ntn0Var.b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ntn0Var.c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ntn0Var.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m19746b(ntn0 ntn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20089y9, viewGroup, false);
        m19745a(ntn0Var, viewInflate);
        return viewInflate;
    }
}
