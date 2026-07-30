package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.zld0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class amd0 {
    /* JADX INFO: renamed from: a */
    public static void m5435a(zld0 zld0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zld0Var.a = viewGroup.getChildAt(0);
        zld0Var.b = viewGroup.getChildAt(1);
        zld0Var.c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        zld0Var.d = (TextView) viewGroup.getChildAt(4);
        zld0Var.e = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m5436b(zld0 zld0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5471J1, viewGroup, false);
        m5435a(zld0Var, viewInflate);
        return viewInflate;
    }
}
