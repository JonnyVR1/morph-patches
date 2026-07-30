package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import l.f6c0;
import l.idl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jdl {
    /* JADX INFO: renamed from: a */
    public static void m7396a(idl idlVar, View view) {
        idlVar.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        idlVar.b = viewGroup.getChildAt(0);
        idlVar.c = viewGroup.getChildAt(1);
        idlVar.d = viewGroup.getChildAt(2);
        idlVar.e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        idlVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        idlVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        idlVar.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        idlVar.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        idlVar.j = (Space) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        idlVar.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        idlVar.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        idlVar.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        idlVar.n = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        idlVar.o = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        idlVar.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        idlVar.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        idlVar.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        idlVar.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        idlVar.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        idlVar.u = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        idlVar.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        idlVar.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        idlVar.x = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        idlVar.y = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        idlVar.z = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        idlVar.A = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        idlVar.B = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        idlVar.C = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        idlVar.D = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        idlVar.E = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(8);
        idlVar.F = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9);
        idlVar.G = viewGroup.getChildAt(3);
        idlVar.H = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        idlVar.I = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        idlVar.J = viewGroup.getChildAt(4);
        idlVar.K = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        idlVar.L = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        idlVar.M = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        idlVar.N = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        idlVar.O = viewGroup.getChildAt(5);
        idlVar.P = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m7397b(idl idlVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.le, viewGroup, false);
        m7396a(idlVar, viewInflate);
        return viewInflate;
    }
}
