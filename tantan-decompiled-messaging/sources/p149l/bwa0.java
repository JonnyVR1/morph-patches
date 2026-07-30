package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bwa0 {
    /* JADX INFO: renamed from: a */
    public static void m104132a(zva0 zva0Var, View view) {
        zva0Var.f204989z = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zva0Var.f204982A = (VImage) viewGroup.getChildAt(0);
        zva0Var.f204983B = (VText) viewGroup.getChildAt(1);
        zva0Var.f204984C = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m104133b(zva0 zva0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95964qa, viewGroup, false);
        m104132a(zva0Var, viewInflate);
        return viewInflate;
    }
}
