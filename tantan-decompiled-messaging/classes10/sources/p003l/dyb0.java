package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.cyb0;
import l.f6c0;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dyb0 {
    /* JADX INFO: renamed from: a */
    public static void m6220a(cyb0 cyb0Var, View view) {
        cyb0Var.b = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cyb0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cyb0Var.d = viewGroup.getChildAt(1);
        cyb0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cyb0Var.f = viewGroup.getChildAt(2);
        cyb0Var.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        cyb0Var.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        cyb0Var.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        cyb0Var.j = viewGroup.getChildAt(3);
        cyb0Var.k = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m6221b(cyb0 cyb0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ce, viewGroup, true);
        m6220a(cyb0Var, viewInflate);
        return viewInflate;
    }
}
