package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import l.lla0;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mla0 {
    /* JADX INFO: renamed from: a */
    public static void m8169a(lla0 lla0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        lla0Var.a = (TextView) viewGroup.getChildAt(0);
        lla0Var.b = (TextView) viewGroup.getChildAt(1);
        lla0Var.c = viewGroup.getChildAt(2);
        lla0Var.d = viewGroup.getChildAt(3);
        lla0Var.e = viewGroup.getChildAt(4);
        lla0Var.f = viewGroup.getChildAt(5);
        lla0Var.g = (FrameLayout) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m8170b(lla0 lla0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.G0, viewGroup, false);
        m8169a(lla0Var, viewInflate);
        return viewInflate;
    }
}
