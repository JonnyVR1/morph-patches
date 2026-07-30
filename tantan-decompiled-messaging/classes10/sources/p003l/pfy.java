package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.h6c0;
import l.ofy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pfy {
    /* JADX INFO: renamed from: a */
    public static void m8743a(ofy ofyVar, View view) {
        ofyVar.f = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ofyVar.g = (FrameLayout) viewGroup.getChildAt(0);
        ofyVar.h = viewGroup.getChildAt(1);
        ofyVar.i = viewGroup.getChildAt(2);
        ofyVar.j = viewGroup.getChildAt(3);
        ofyVar.k = viewGroup.getChildAt(4);
        ofyVar.l = (FrameLayout) viewGroup.getChildAt(5);
        ofyVar.m = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        ofyVar.n = viewGroup.getChildAt(6);
        ofyVar.o = viewGroup.getChildAt(7);
        ofyVar.p = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        ofyVar.q = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        ofyVar.r = viewGroup.getChildAt(8);
        ofyVar.s = viewGroup.getChildAt(9);
        ofyVar.t = viewGroup.getChildAt(10);
        ofyVar.u = ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(0);
        ofyVar.v = ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(1);
        ofyVar.w = viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m8744b(ofy ofyVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.z, viewGroup, false);
        m8743a(ofyVar, viewInflate);
        return viewInflate;
    }
}
