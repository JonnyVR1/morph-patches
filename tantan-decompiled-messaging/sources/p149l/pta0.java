package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pta0 {
    /* JADX INFO: renamed from: a */
    public static void m171304a(ota0 ota0Var, View view) {
        ota0Var.f145555v = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ota0Var.f145556w = (VImage) viewGroup.getChildAt(0);
        ota0Var.f145557x = (VImage) viewGroup.getChildAt(1);
        ota0Var.f145558y = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m171305b(ota0 ota0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95913na, viewGroup, false);
        m171304a(ota0Var, viewInflate);
        return viewInflate;
    }
}
