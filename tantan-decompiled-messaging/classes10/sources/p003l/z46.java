package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import l.y46;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z46 {
    /* JADX INFO: renamed from: a */
    public static void m11339a(y46 y46Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        y46Var.a = viewGroup.getChildAt(0);
        y46Var.b = (LinearLayout) viewGroup.getChildAt(1);
        y46Var.c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11340b(y46 y46Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.r, viewGroup, false);
        m11339a(y46Var, viewInflate);
        return viewInflate;
    }
}
