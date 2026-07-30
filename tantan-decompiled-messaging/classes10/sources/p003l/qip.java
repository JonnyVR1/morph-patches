package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import l.f6c0;
import l.pip;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qip {
    /* JADX INFO: renamed from: a */
    public static void m9004a(pip pipVar, View view) {
        pipVar.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pipVar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pipVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pipVar.d = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        pipVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        pipVar.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        pipVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        pipVar.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        pipVar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        pipVar.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        pipVar.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        pipVar.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        pipVar.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        pipVar.n = viewGroup.getChildAt(1);
        pipVar.o = viewGroup.getChildAt(2);
        pipVar.p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pipVar.q = viewGroup.getChildAt(3);
        pipVar.r = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pipVar.s = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        pipVar.t = (LinearLayout) viewGroup.getChildAt(4);
        pipVar.u = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        pipVar.v = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        pipVar.w = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        pipVar.x = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        pipVar.y = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        pipVar.z = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m9005b(pip pipVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.yd, viewGroup, false);
        m9004a(pipVar, viewInflate);
        return viewInflate;
    }
}
