package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationItemView;
import p147v.VImage;
import p147v.VList;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class mjl0 {
    /* JADX INFO: renamed from: a */
    public static void m154897a(ljl0 ljl0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ljl0Var.f128342a = (VNavigationBar) viewGroup.getChildAt(0);
        ljl0Var.f128343b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ljl0Var.f128344c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        ljl0Var.f128345d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        ljl0Var.f128346e = (VipLocationItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ljl0Var.f128347f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ljl0Var.f128348g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ljl0Var.f128349h = (VList) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        ljl0Var.f128350i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        ljl0Var.f128351j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m154898b(ljl0 ljl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96054vf, viewGroup, false);
        m154897a(ljl0Var, viewInflate);
        return viewInflate;
    }
}
