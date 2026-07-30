package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import l.e2y;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f2y {
    /* JADX INFO: renamed from: a */
    public static void m6376a(e2y e2yVar, View view) {
        e2yVar.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e2yVar.b = viewGroup.getChildAt(0);
        e2yVar.c = (FrameLayout) viewGroup.getChildAt(1);
        e2yVar.d = viewGroup.getChildAt(2);
        e2yVar.e = view.findViewById(x4c0.f8307A);
        e2yVar.f = view.findViewById(x4c0.f8347q);
        ViewGroup viewGroup2 = (ViewGroup) view;
        e2yVar.g = (ProgressBar) viewGroup2.getChildAt(3);
        e2yVar.h = viewGroup2.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m6377b(e2y e2yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5599u0, viewGroup, false);
        m6376a(e2yVar, viewInflate);
        return viewInflate;
    }
}
