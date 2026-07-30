package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.m6c0;
import l.rnl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class snl0 {
    /* JADX INFO: renamed from: a */
    public static void m9370a(rnl0 rnl0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rnl0Var.a = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        rnl0Var.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        rnl0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rnl0Var.d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9371b(rnl0 rnl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.F2, viewGroup, false);
        m9370a(rnl0Var, viewInflate);
        return viewInflate;
    }
}
