package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class g05 {
    /* JADX INFO: renamed from: a */
    public static void m123948a(e05 e05Var, View view) {
        e05Var.f88536a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e05Var.f88537b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        e05Var.f88538c = (VRecyclerView) viewGroup.getChildAt(1);
        e05Var.f88539d = (VLinear) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m123949b(e05 e05Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95836j1, viewGroup, false);
        m123948a(e05Var, viewInflate);
        return viewInflate;
    }
}
