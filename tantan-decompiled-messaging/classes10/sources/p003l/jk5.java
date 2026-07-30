package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.f6c0;
import l.ik5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jk5 {
    /* JADX INFO: renamed from: a */
    public static void m7423a(ik5 ik5Var, View view) {
        ik5Var.a = (FrameLayout) view;
        ik5Var.b = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m7424b(ik5 ik5Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.v1, viewGroup, false);
        m7423a(ik5Var, viewInflate);
        return viewInflate;
    }
}
