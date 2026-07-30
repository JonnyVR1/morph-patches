package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.df0;
import l.f6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ef0 {
    /* JADX INFO: renamed from: a */
    public static void m6291a(df0 df0Var, View view) {
        df0Var.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        df0Var.b = viewGroup.getChildAt(0);
        df0Var.c = viewGroup.getChildAt(1);
        df0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        df0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        df0Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        df0Var.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        df0Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        df0Var.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m6292b(df0 df0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.v, viewGroup, false);
        m6291a(df0Var, viewInflate);
        return viewInflate;
    }
}
