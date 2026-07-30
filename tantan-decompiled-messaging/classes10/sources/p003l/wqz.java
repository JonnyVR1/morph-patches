package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.gift.layer.CoreGiftLayer;
import l.tqz;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wqz {
    /* JADX INFO: renamed from: a */
    public static void m10538a(tqz tqzVar, View view) {
        tqzVar.i = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tqzVar.j = viewGroup.getChildAt(0);
        tqzVar.k = viewGroup.getChildAt(1);
        tqzVar.l = viewGroup.getChildAt(2);
        tqzVar.m = viewGroup.getChildAt(3);
        tqzVar.n = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        tqzVar.o = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        tqzVar.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        tqzVar.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        tqzVar.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        tqzVar.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        tqzVar.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        tqzVar.u = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        tqzVar.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        tqzVar.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        tqzVar.x = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(3);
        tqzVar.y = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        tqzVar.z = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        tqzVar.A = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        tqzVar.B = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        tqzVar.C = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3);
        tqzVar.D = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        tqzVar.E = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        tqzVar.F = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        tqzVar.G = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(4);
        tqzVar.H = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5);
        tqzVar.I = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        tqzVar.J = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(1);
        tqzVar.K = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(1);
        tqzVar.L = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(2);
        tqzVar.M = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(6);
        tqzVar.N = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(6)).getChildAt(1);
        tqzVar.O = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7);
        tqzVar.P = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(0);
        tqzVar.Q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        tqzVar.R = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1);
        tqzVar.S = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2);
        tqzVar.T = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        tqzVar.U = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        tqzVar.V = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        tqzVar.W = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        tqzVar.X = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        tqzVar.Y = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        tqzVar.Z = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        tqzVar.k0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        tqzVar.p0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4);
        tqzVar.E0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        tqzVar.F0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        tqzVar.G0 = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(5);
        tqzVar.H0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(6);
        tqzVar.I0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        tqzVar.J0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        tqzVar.K0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0);
        tqzVar.L0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
        tqzVar.M0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(2);
        tqzVar.N0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        tqzVar.O0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        tqzVar.P0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        tqzVar.Q0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        tqzVar.R0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(2);
        tqzVar.S0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(1);
        tqzVar.T0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(2);
        tqzVar.U0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(2)).getChildAt(0);
        tqzVar.V0 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(3);
        tqzVar.W0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(3)).getChildAt(0);
        tqzVar.X0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(4);
        tqzVar.Y0 = (ViewStub) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        tqzVar.Z0 = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        tqzVar.a1 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(0);
        tqzVar.b1 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(1);
        tqzVar.c1 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        tqzVar.d1 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(0);
        tqzVar.e1 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(1);
        tqzVar.f1 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(2);
        tqzVar.g1 = viewGroup.getChildAt(4);
        tqzVar.h1 = (FrameLayout) viewGroup.getChildAt(5);
        tqzVar.i1 = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        tqzVar.j1 = (FrameLayout) viewGroup.getChildAt(6);
        tqzVar.k1 = (CoreGiftLayer) viewGroup.getChildAt(7);
        tqzVar.l1 = viewGroup.getChildAt(8);
        tqzVar.m1 = viewGroup.getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m10539b(tqz tqzVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5888R4, viewGroup, false);
        m10538a(tqzVar, viewInflate);
        return viewInflate;
    }
}
