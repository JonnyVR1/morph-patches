package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.p14;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q14 {
    /* JADX INFO: renamed from: a */
    public static void m20791a(p14 p14Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        p14Var.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        p14Var.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        p14Var.c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m20792b(p14 p14Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19599M, viewGroup, false);
        m20791a(p14Var, viewInflate);
        return viewInflate;
    }
}
