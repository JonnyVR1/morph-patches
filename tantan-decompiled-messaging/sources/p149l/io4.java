package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class io4 {
    /* JADX INFO: renamed from: a */
    public static void m137285a(ho4 ho4Var, View view) {
        ho4Var.f108773g = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ho4Var.f108774h = (VText_NoTopPadding) viewGroup.getChildAt(0);
        ho4Var.f108775i = (VText_NoTopPadding) viewGroup.getChildAt(1);
        ho4Var.f108776j = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ho4Var.f108777k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        ho4Var.f108778l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        ho4Var.f108779m = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3);
        ho4Var.f108780n = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        ho4Var.f108781o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        ho4Var.f108782p = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
        ho4Var.f108783q = (VText_NoTopPadding) viewGroup.getChildAt(3);
        ho4Var.f108784r = (VText_NoTopPadding) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m137286b(ho4 ho4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137332X0, viewGroup, false);
        m137285a(ho4Var, viewInflate);
        return viewInflate;
    }
}
