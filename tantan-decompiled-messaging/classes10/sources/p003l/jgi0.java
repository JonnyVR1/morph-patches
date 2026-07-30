package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.igi0;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jgi0 {
    /* JADX INFO: renamed from: a */
    public static void m7412a(igi0 igi0Var, View view) {
        igi0Var.a = ((ViewGroup) view).getChildAt(0);
        igi0Var.b = view.findViewById(u4c0.b7);
        ViewGroup viewGroup = (ViewGroup) view;
        igi0Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        igi0Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        igi0Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7413b(igi0 igi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Cc, viewGroup, false);
        m7412a(igi0Var, viewInflate);
        return viewInflate;
    }
}
