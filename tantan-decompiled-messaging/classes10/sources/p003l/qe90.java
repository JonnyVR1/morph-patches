package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.pe90;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qe90 {
    /* JADX INFO: renamed from: a */
    public static void m8979a(pe90 pe90Var, View view) {
        pe90Var.a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pe90Var.b = viewGroup.getChildAt(0);
        pe90Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pe90Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pe90Var.e = viewGroup.getChildAt(2);
        pe90Var.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pe90Var.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8980b(pe90 pe90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.m9, viewGroup, false);
        m8979a(pe90Var, viewInflate);
        return viewInflate;
    }
}
