package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.c220;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d220 {
    /* JADX INFO: renamed from: a */
    public static void m6040a(c220 c220Var, View view) {
        c220Var.b = ((ViewGroup) view).getChildAt(0);
        c220Var.c = view.findViewById(x4c0.f8346p);
        ViewGroup viewGroup = (ViewGroup) view;
        c220Var.d = (FrameLayout) viewGroup.getChildAt(1);
        c220Var.e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m6041b(c220 c220Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5473K0, viewGroup, false);
        m6040a(c220Var, viewInflate);
        return viewInflate;
    }
}
