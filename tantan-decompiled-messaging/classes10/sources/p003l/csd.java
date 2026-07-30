package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.bsd;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class csd {
    /* JADX INFO: renamed from: a */
    public static void m5997a(bsd bsdVar, View view) {
        bsdVar.a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bsdVar.b = (FrameLayout) viewGroup.getChildAt(0);
        bsdVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bsdVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bsdVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bsdVar.f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        bsdVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        bsdVar.h = (LinearLayout) viewGroup.getChildAt(1);
        bsdVar.i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bsdVar.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        bsdVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        bsdVar.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        bsdVar.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        bsdVar.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bsdVar.o = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        bsdVar.p = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        bsdVar.q = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        bsdVar.r = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        bsdVar.s = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        bsdVar.t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        bsdVar.u = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        bsdVar.v = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        bsdVar.w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        bsdVar.x = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        bsdVar.y = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        bsdVar.z = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        bsdVar.A = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5998b(bsd bsdVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.O7, viewGroup, false);
        m5997a(bsdVar, viewInflate);
        return viewInflate;
    }
}
