package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import l.f6c0;
import l.mq90;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nq90 {
    /* JADX INFO: renamed from: a */
    public static void m8369a(mq90 mq90Var, View view) {
        mq90Var.a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mq90Var.b = viewGroup.getChildAt(0);
        mq90Var.c = viewGroup.getChildAt(1);
        mq90Var.d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mq90Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mq90Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        mq90Var.g = viewGroup.getChildAt(2);
        mq90Var.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mq90Var.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        mq90Var.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        mq90Var.k = viewGroup.getChildAt(3);
        mq90Var.l = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        mq90Var.m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mq90Var.n = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        mq90Var.o = viewGroup.getChildAt(4);
        mq90Var.p = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        mq90Var.q = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        mq90Var.r = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        mq90Var.s = viewGroup.getChildAt(5);
        mq90Var.t = (ImageView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        mq90Var.u = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        mq90Var.v = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        mq90Var.w = viewGroup.getChildAt(6);
        mq90Var.x = (ImageView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        mq90Var.y = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        mq90Var.z = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8370b(mq90 mq90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Aa, viewGroup, false);
        m8369a(mq90Var, viewInflate);
        return viewInflate;
    }
}
