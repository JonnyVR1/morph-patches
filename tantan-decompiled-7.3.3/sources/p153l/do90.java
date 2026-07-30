package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p151v.VImage;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class do90 {
    /* JADX INFO: renamed from: a */
    public static void m117191a(co90 co90Var, View view) {
        co90Var.f82823a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        co90Var.f82824b = (VText) viewGroup.getChildAt(0);
        co90Var.f82825c = (RelativeLayout) viewGroup.getChildAt(1);
        co90Var.f82826d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        co90Var.f82827e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        co90Var.f82828f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        co90Var.f82829g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        co90Var.f82830h = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        co90Var.f82831i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        co90Var.f82832j = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        co90Var.f82833k = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        co90Var.f82834l = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        co90Var.f82835m = (LinearLayout) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m117192b(co90 co90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125394Ea, viewGroup, false);
        m117191a(co90Var, viewInflate);
        return viewInflate;
    }
}
