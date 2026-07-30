package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zc2 {
    /* JADX INFO: renamed from: a */
    public static void m218010a(yc2 yc2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yc2Var.f197400a = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        yc2Var.f197401b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        yc2Var.f197402c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        yc2Var.f197403d = viewGroup.getChildAt(1);
        yc2Var.f197404e = (VButton) viewGroup.getChildAt(2);
        yc2Var.f197405f = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m218011b(yc2 yc2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137337a, viewGroup, false);
        m218010a(yc2Var, viewInflate);
        return viewInflate;
    }
}
