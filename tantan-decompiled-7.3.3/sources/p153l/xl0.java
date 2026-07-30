package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class xl0 {
    /* JADX INFO: renamed from: a */
    public static void m211457a(wl0 wl0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wl0Var.f189614a = (VImage) viewGroup.getChildAt(0);
        wl0Var.f189615b = (VText) viewGroup.getChildAt(1);
        wl0Var.f189616c = (VText) viewGroup.getChildAt(2);
        wl0Var.f189617d = viewGroup.getChildAt(3);
        wl0Var.f189618e = (VText) viewGroup.getChildAt(4);
        wl0Var.f189619f = (VText) viewGroup.getChildAt(5);
        wl0Var.f189620g = viewGroup.getChildAt(6);
        wl0Var.f189621h = (VText) viewGroup.getChildAt(7);
        wl0Var.f189622i = (VText) viewGroup.getChildAt(8);
        wl0Var.f189623j = (VText) viewGroup.getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m211458b(wl0 wl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193795K1, viewGroup, false);
        m211457a(wl0Var, viewInflate);
        return viewInflate;
    }
}
