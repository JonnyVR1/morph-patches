package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.zi30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class aj30 {
    /* JADX INFO: renamed from: a */
    public static void m5386a(zi30 zi30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zi30Var.a = viewGroup.getChildAt(0);
        zi30Var.b = viewGroup.getChildAt(1);
        zi30Var.c = view.findViewById(x4c0.f8346p);
        ViewGroup viewGroup2 = (ViewGroup) view;
        zi30Var.d = (LinearLayout) viewGroup2.getChildAt(2);
        zi30Var.e = viewGroup2.getChildAt(3);
        zi30Var.f = viewGroup2.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m5387b(zi30 zi30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5500T0, viewGroup, false);
        m5386a(zi30Var, viewInflate);
        return viewInflate;
    }
}
