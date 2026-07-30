package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kof0 {
    /* JADX INFO: renamed from: a */
    public static void m146704a(jof0 jof0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jof0Var.f118956a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jof0Var.f118957b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jof0Var.f118958c = (VLinear) viewGroup.getChildAt(1);
        jof0Var.f118959d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        jof0Var.f118960e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        jof0Var.f118961f = (VRelative) viewGroup.getChildAt(2);
        jof0Var.f118962g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        jof0Var.f118963h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        jof0Var.f118964i = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        jof0Var.f118965j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        jof0Var.f118966k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        jof0Var.f118967l = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        jof0Var.f118968m = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m146705b(jof0 jof0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95278Ab, viewGroup, false);
        m146704a(jof0Var, viewInflate);
        return viewInflate;
    }
}
