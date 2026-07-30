package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.xxn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yxn0 {
    /* JADX INFO: renamed from: a */
    public static void m26971a(xxn0 xxn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xxn0Var.a = viewGroup.getChildAt(0);
        xxn0Var.b = viewGroup.getChildAt(1);
        xxn0Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        xxn0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        xxn0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        xxn0Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        xxn0Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        xxn0Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        xxn0Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        xxn0Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m26972b(xxn0 xxn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19501D9, viewGroup, false);
        m26971a(xxn0Var, viewInflate);
        return viewInflate;
    }
}
