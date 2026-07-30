package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.yr9;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zr9 {
    /* JADX INFO: renamed from: a */
    public static void m11446a(yr9 yr9Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yr9Var.a = viewGroup.getChildAt(0);
        yr9Var.b = viewGroup.getChildAt(1);
        yr9Var.c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11447b(yr9 yr9Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5942a1, viewGroup, false);
        m11446a(yr9Var, viewInflate);
        return viewInflate;
    }
}
