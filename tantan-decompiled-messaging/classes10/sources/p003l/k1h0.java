package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.j1h0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k1h0 {
    /* JADX INFO: renamed from: a */
    public static void m7480a(j1h0 j1h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j1h0Var.b = viewGroup.getChildAt(0);
        j1h0Var.c = viewGroup.getChildAt(1);
        j1h0Var.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        j1h0Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        j1h0Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        j1h0Var.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7481b(j1h0 j1h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5444A1, viewGroup, false);
        m7480a(j1h0Var, viewInflate);
        return viewInflate;
    }
}
