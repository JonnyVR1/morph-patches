package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VImage;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class f2y {
    /* JADX INFO: renamed from: a */
    public static void m119243a(e2y e2yVar, View view) {
        e2yVar.f88961a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e2yVar.f88962b = (VDraweeView) viewGroup.getChildAt(0);
        e2yVar.f88963c = (FrameLayout) viewGroup.getChildAt(1);
        e2yVar.f88964d = (VFrame_ColorFilter) viewGroup.getChildAt(2);
        e2yVar.f88965e = (VImage) view.findViewById(x4c0.f190966A);
        e2yVar.f88966f = (VProgressBar) view.findViewById(x4c0.f191006q);
        ViewGroup viewGroup2 = (ViewGroup) view;
        e2yVar.f88967g = (ProgressBar) viewGroup2.getChildAt(3);
        e2yVar.f88968h = (VImage) viewGroup2.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m119244b(e2y e2yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121436u0, viewGroup, false);
        m119243a(e2yVar, viewInflate);
        return viewInflate;
    }
}
