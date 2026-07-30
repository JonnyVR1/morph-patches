package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundConstraintLayout;
import l.f6c0;
import l.kff0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lff0 {
    /* JADX INFO: renamed from: a */
    public static void m7728a(kff0 kff0Var, View view) {
        kff0Var.b = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kff0Var.c = viewGroup.getChildAt(0);
        kff0Var.d = viewGroup.getChildAt(1);
        kff0Var.e = viewGroup.getChildAt(2);
        kff0Var.f = viewGroup.getChildAt(3);
        kff0Var.g = viewGroup.getChildAt(4);
        kff0Var.h = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m7729b(kff0 kff0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.L4, viewGroup, false);
        m7728a(kff0Var, viewInflate);
        return viewInflate;
    }
}
