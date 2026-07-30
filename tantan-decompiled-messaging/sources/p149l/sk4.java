package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.view.CardLabelItemView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sk4 {
    /* JADX INFO: renamed from: a */
    public static void m184575a(CardLabelItemView cardLabelItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardLabelItemView.f38410a = (VDraweeView) viewGroup.getChildAt(0);
        cardLabelItemView.f38411b = (VLinear) viewGroup.getChildAt(1);
        cardLabelItemView.f38412c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardLabelItemView.f38413d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardLabelItemView.f38414e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardLabelItemView.f38415f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
