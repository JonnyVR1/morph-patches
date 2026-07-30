package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.arn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class brn0 {
    /* JADX INFO: renamed from: a */
    public static void m10571a(arn0 arn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        arn0Var.b = (FrameLayout) viewGroup.getChildAt(0);
        arn0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        arn0Var.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        arn0Var.e = viewGroup.getChildAt(1);
        arn0Var.f = (TextView) viewGroup.getChildAt(2);
        arn0Var.g = viewGroup.getChildAt(3);
        arn0Var.h = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        arn0Var.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        arn0Var.j = (FrameLayout) viewGroup.getChildAt(4);
        arn0Var.k = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        arn0Var.l = (LinearLayout) viewGroup.getChildAt(5);
        arn0Var.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0);
        arn0Var.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1);
        arn0Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
        arn0Var.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2)).getChildAt(1);
        arn0Var.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2)).getChildAt(2);
        arn0Var.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(0);
        arn0Var.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(1);
        arn0Var.t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(2);
        arn0Var.u = (RelativeLayout) viewGroup.getChildAt(6);
        arn0Var.v = (TextView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        arn0Var.w = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        arn0Var.x = (LinearLayout) viewGroup.getChildAt(7);
        arn0Var.y = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        arn0Var.z = (LinearLayout) viewGroup.getChildAt(8);
        arn0Var.A = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0);
        arn0Var.B = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        arn0Var.C = (LinearLayout) viewGroup.getChildAt(9);
        arn0Var.D = (FrameLayout) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m10572b(arn0 arn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19868h9, viewGroup, false);
        m10571a(arn0Var, viewInflate);
        return viewInflate;
    }
}
