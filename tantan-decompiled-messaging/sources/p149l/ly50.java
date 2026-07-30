package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes9.dex */
public class ly50 {
    /* JADX INFO: renamed from: a */
    public static void m152117a(ky50 ky50Var, View view) {
        ky50Var.f125244a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ky50Var.f125245b = (VImage) viewGroup.getChildAt(0);
        ky50Var.f125246c = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        ky50Var.f125247d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        ky50Var.f125248e = (VText) viewGroup.getChildAt(2);
        ky50Var.f125249f = (VLinear) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m152118b(ky50 ky50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79470J, viewGroup, false);
        m152117a(ky50Var, viewInflate);
        return viewInflate;
    }
}
