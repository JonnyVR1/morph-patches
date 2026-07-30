package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VPager;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m030 {
    /* JADX INFO: renamed from: a */
    public static void m156507a(l030 l030Var, View view) {
        l030Var.f129488a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        l030Var.f129489b = (CoreGiftLayer) viewGroup.getChildAt(0);
        l030Var.f129490c = (FrameLayout) viewGroup.getChildAt(1);
        l030Var.f129491d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        l030Var.f129492e = (FrameLayout) viewGroup.getChildAt(2);
        l030Var.f129493f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        l030Var.f129494g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        l030Var.f129495h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        l030Var.f129496i = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        l030Var.f129497j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        l030Var.f129498k = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
        l030Var.f129499l = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m156508b(l030 l030Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156888L, viewGroup, false);
        m156507a(l030Var, viewInflate);
        return viewInflate;
    }
}
