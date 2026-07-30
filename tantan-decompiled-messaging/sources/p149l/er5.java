package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class er5 {
    /* JADX INFO: renamed from: a */
    public static void m117822a(dr5 dr5Var, View view) {
        dr5Var.f87572f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dr5Var.f87573g = (FrameLayout) viewGroup.getChildAt(0);
        dr5Var.f87574h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        dr5Var.f87575i = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        dr5Var.f87576j = (LinearLayout) viewGroup.getChildAt(1);
        dr5Var.f87577k = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dr5Var.f87578l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        dr5Var.f87579m = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
