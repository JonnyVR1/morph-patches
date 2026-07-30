package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p151v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class kl5 {
    /* JADX INFO: renamed from: a */
    public static void m150352a(jl5 jl5Var, View view) {
        jl5Var.f121467a = (FrameLayout) view;
        jl5Var.f121468b = (VPager) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m150353b(jl5 jl5Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126094v1, viewGroup, false);
        m150352a(jl5Var, viewInflate);
        return viewInflate;
    }
}
