package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.fi2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gi2 {
    /* JADX INFO: renamed from: a */
    public static void m6646a(fi2 fi2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fi2Var.c = viewGroup.getChildAt(0);
        fi2Var.d = viewGroup.getChildAt(1);
        fi2Var.e = viewGroup.getChildAt(2);
        fi2Var.f = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m6647b(fi2 fi2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.p, viewGroup, false);
        m6646a(fi2Var, viewInflate);
        return viewInflate;
    }
}
