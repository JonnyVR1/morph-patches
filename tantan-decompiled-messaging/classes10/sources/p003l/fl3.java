package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.el3;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fl3 {
    /* JADX INFO: renamed from: a */
    public static void m6479a(el3 el3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        el3Var.a = viewGroup.getChildAt(0);
        el3Var.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        el3Var.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        el3Var.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        el3Var.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m6480b(el3 el3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.e, viewGroup, false);
        m6479a(el3Var, viewInflate);
        return viewInflate;
    }
}
