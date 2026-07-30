package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.m5h0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n5h0 {
    /* JADX INFO: renamed from: a */
    public static void m8316a(m5h0 m5h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        m5h0Var.a = (FrameLayout) viewGroup.getChildAt(0);
        m5h0Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m8317b(m5h0 m5h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5468I1, viewGroup, true);
        m8316a(m5h0Var, viewInflate);
        return viewInflate;
    }
}
