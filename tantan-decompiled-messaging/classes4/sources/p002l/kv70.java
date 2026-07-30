package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.jv70;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kv70 {
    /* JADX INFO: renamed from: a */
    public static void m16830a(jv70 jv70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jv70Var.i = viewGroup.getChildAt(0);
        jv70Var.j = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        jv70Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        jv70Var.l = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        jv70Var.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        jv70Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        jv70Var.o = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        jv70Var.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        jv70Var.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        jv70Var.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        jv70Var.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        jv70Var.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        jv70Var.u = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        jv70Var.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        jv70Var.w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        jv70Var.x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        jv70Var.y = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        jv70Var.z = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        jv70Var.A = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m16831b(jv70 jv70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19786b5, viewGroup, false);
        m16830a(jv70Var, viewInflate);
        return viewInflate;
    }
}
