package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class wha0 {
    /* JADX INFO: renamed from: a */
    public static void m203117a(vha0 vha0Var, View view) {
        vha0Var.f181478a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vha0Var.f181479b = (VImage) viewGroup.getChildAt(0);
        vha0Var.f181480c = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m203118b(vha0 vha0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137290C0, viewGroup, false);
        m203117a(vha0Var, viewInflate);
        return viewInflate;
    }
}
