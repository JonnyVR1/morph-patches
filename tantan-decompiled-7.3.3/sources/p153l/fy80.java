package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.FilterSwitchCell;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VProgressBar;
import p151v.VScroll;
import p151v.VSlider;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class fy80 {
    /* JADX INFO: renamed from: a */
    public static void m128075a(dy80 dy80Var, View view) {
        dy80Var.f91141a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dy80Var.f91142b = (VNavigationBar) viewGroup.getChildAt(0);
        dy80Var.f91143c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dy80Var.f91144d = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        dy80Var.f91145e = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        dy80Var.f91146f = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        dy80Var.f91147g = (FilterSwitchCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        dy80Var.f91148h = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        dy80Var.f91149i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        dy80Var.f91150j = (VSlider) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        dy80Var.f91151k = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        dy80Var.f91152l = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m128076b(dy80 dy80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125813e8, viewGroup, false);
        m128075a(dy80Var, viewInflate);
        return viewInflate;
    }
}
