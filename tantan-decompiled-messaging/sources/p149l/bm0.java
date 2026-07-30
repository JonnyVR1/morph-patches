package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class bm0 {
    /* JADX INFO: renamed from: a */
    public static void m102567a(am0 am0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        am0Var.f70527a = (VImage) viewGroup.getChildAt(0);
        am0Var.f70528b = (VText) viewGroup.getChildAt(1);
        am0Var.f70529c = (VText) viewGroup.getChildAt(2);
        am0Var.f70530d = viewGroup.getChildAt(3);
        am0Var.f70531e = (VText) viewGroup.getChildAt(4);
        am0Var.f70532f = (VText) viewGroup.getChildAt(5);
        am0Var.f70533g = viewGroup.getChildAt(6);
        am0Var.f70534h = (VText) viewGroup.getChildAt(7);
        am0Var.f70535i = (VText) viewGroup.getChildAt(8);
        am0Var.f70536j = (VText) viewGroup.getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m102568b(am0 am0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162681K1, viewGroup, false);
        m102567a(am0Var, viewInflate);
        return viewInflate;
    }
}
