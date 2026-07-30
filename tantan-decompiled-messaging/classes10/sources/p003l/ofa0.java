package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.n6c0;
import l.nfa0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ofa0 {
    /* JADX INFO: renamed from: a */
    public static void m8452a(nfa0 nfa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nfa0Var.a = viewGroup.getChildAt(0);
        nfa0Var.b = viewGroup.getChildAt(1);
        nfa0Var.c = viewGroup.getChildAt(2);
        nfa0Var.d = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        nfa0Var.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        nfa0Var.f = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m8453b(nfa0 nfa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.A0, viewGroup, false);
        m8452a(nfa0Var, viewInflate);
        return viewInflate;
    }
}
