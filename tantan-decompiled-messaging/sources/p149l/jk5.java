package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class jk5 {
    /* JADX INFO: renamed from: a */
    public static void m141825a(ik5 ik5Var, View view) {
        ik5Var.f113631a = (FrameLayout) view;
        ik5Var.f113632b = (VPager) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m141826b(ik5 ik5Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96040v1, viewGroup, false);
        m141825a(ik5Var, viewInflate);
        return viewInflate;
    }
}
