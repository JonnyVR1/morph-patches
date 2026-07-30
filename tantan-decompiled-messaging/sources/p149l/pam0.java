package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p147v.VButton;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class pam0 {
    /* JADX INFO: renamed from: a */
    public static void m168097a(oam0 oam0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oam0Var._bar = (VNavigationBar) viewGroup.getChildAt(0);
        oam0Var._content = (VLinear) viewGroup.getChildAt(1);
        oam0Var._tab_layout = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oam0Var._viewpager = (ViewPager2) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oam0Var._no_permission = (VRelative) viewGroup.getChildAt(2);
        oam0Var._permission_img = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        oam0Var._permission_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        oam0Var._permission_tv = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        oam0Var._permission_btn = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m168098b(oam0 oam0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121364b2, viewGroup, false);
        m168097a(oam0Var, viewInflate);
        return viewInflate;
    }
}
