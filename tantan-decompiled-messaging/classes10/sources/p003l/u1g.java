package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import l.t1g;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u1g {
    /* JADX INFO: renamed from: a */
    public static void m9639a(t1g t1gVar, View view) {
        t1gVar.a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        t1gVar.b = viewGroup.getChildAt(0);
        t1gVar.c = viewGroup.getChildAt(1);
        t1gVar.d = viewGroup.getChildAt(2);
        t1gVar.e = viewGroup.getChildAt(3);
        t1gVar.f = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        t1gVar.g = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        t1gVar.h = viewGroup.getChildAt(5);
        t1gVar.i = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        t1gVar.j = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        t1gVar.k = viewGroup.getChildAt(6);
        t1gVar.l = (LinearLayout) viewGroup.getChildAt(7);
        t1gVar.m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        t1gVar.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(0);
        t1gVar.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(1);
        t1gVar.p = (LinearLayout) viewGroup.getChildAt(8);
        t1gVar.q = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        t1gVar.r = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2);
        t1gVar.s = viewGroup.getChildAt(9);
        t1gVar.t = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        t1gVar.u = (FrameLayout) viewGroup.getChildAt(10);
        t1gVar.v = ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9640b(t1g t1gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5575n2, viewGroup, false);
        m9639a(t1gVar, viewInflate);
        return viewInflate;
    }
}
