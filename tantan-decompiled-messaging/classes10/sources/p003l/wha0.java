package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.n6c0;
import l.vha0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wha0 {
    /* JADX INFO: renamed from: a */
    public static void m10504a(vha0 vha0Var, View view) {
        vha0Var.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vha0Var.b = viewGroup.getChildAt(0);
        vha0Var.c = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10505b(vha0 vha0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.C0, viewGroup, false);
        m10504a(vha0Var, viewInflate);
        return viewInflate;
    }
}
