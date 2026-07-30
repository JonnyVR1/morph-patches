package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class awa0 {
    /* JADX INFO: renamed from: a */
    public static void m99260a(zva0 zva0Var, View view) {
        zva0Var.f204985v = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zva0Var.f204986w = (VImage) viewGroup.getChildAt(0);
        zva0Var.f204987x = (VText) viewGroup.getChildAt(1);
        zva0Var.f204988y = (VImage) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m99261b(zva0 zva0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95660Y9, viewGroup, false);
        m99260a(zva0Var, viewInflate);
        return viewInflate;
    }
}
