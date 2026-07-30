package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class is5 {
    /* JADX INFO: renamed from: a */
    public static void m141869a(hs5 hs5Var, View view) {
        hs5Var.f111411f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hs5Var.f111412g = (FrameLayout) viewGroup.getChildAt(0);
        hs5Var.f111413h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        hs5Var.f111414i = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        hs5Var.f111415j = (LinearLayout) viewGroup.getChildAt(1);
        hs5Var.f111416k = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hs5Var.f111417l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        hs5Var.f111418m = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
