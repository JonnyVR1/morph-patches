package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.f6c0;
import l.gee;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hee {
    /* JADX INFO: renamed from: a */
    public static void m6955a(gee geeVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        geeVar.d = viewGroup.getChildAt(0);
        geeVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        geeVar.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        geeVar.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        geeVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        geeVar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        geeVar.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        geeVar.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        geeVar.l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        geeVar.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0);
        geeVar.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(1);
        geeVar.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(1);
        geeVar.p = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        geeVar.q = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        geeVar.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(0);
        geeVar.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(0)).getChildAt(1);
        geeVar.t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(0)).getChildAt(2);
        geeVar.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(1);
        geeVar.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(1)).getChildAt(1);
        geeVar.w = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(1)).getChildAt(2);
        geeVar.x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(2);
        geeVar.y = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(2)).getChildAt(1);
        geeVar.z = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(2)).getChildAt(2);
        geeVar.A = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        geeVar.B = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(1);
        geeVar.C = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
        geeVar.D = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        geeVar.E = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        geeVar.F = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        geeVar.G = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6956b(gee geeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.lb, viewGroup, false);
        m6955a(geeVar, viewInflate);
        return viewInflate;
    }
}
