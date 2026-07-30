package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.ls9;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ms9 {
    /* JADX INFO: renamed from: a */
    public static void m8260a(ls9 ls9Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ls9Var.a = viewGroup.getChildAt(1);
        ls9Var.b = viewGroup.getChildAt(2);
        ls9Var.c = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m8261b(ls9 ls9Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5949b1, viewGroup, false);
        m8260a(ls9Var, viewInflate);
        return viewInflate;
    }
}
