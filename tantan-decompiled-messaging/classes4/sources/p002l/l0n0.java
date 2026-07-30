package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.g0n0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l0n0 {
    /* JADX INFO: renamed from: a */
    public static void m16927a(g0n0 g0n0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        g0n0Var.a = (ImageView) viewGroup.getChildAt(0);
        g0n0Var.b = (LinearLayout) viewGroup.getChildAt(1);
        g0n0Var.c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        g0n0Var.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        g0n0Var.e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m16928b(g0n0 g0n0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19971p8, viewGroup, false);
        m16927a(g0n0Var, viewInflate);
        return viewInflate;
    }
}
