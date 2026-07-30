package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.FilterSwitchCell;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VProgressBar;
import p147v.VScroll;
import p147v.VSlider;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class bq80 {
    /* JADX INFO: renamed from: a */
    public static void m103358a(zp80 zp80Var, View view) {
        zp80Var.f204185a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zp80Var.f204186b = (VNavigationBar) viewGroup.getChildAt(0);
        zp80Var.f204187c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        zp80Var.f204188d = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        zp80Var.f204189e = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        zp80Var.f204190f = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        zp80Var.f204191g = (FilterSwitchCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        zp80Var.f204192h = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        zp80Var.f204193i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        zp80Var.f204194j = (VSlider) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        zp80Var.f204195k = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        zp80Var.f204196l = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m103359b(zp80 zp80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95642X7, viewGroup, false);
        m103358a(zp80Var, viewInflate);
        return viewInflate;
    }
}
