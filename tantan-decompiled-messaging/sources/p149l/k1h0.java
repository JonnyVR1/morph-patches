package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p147v.VImage;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class k1h0 {
    /* JADX INFO: renamed from: a */
    public static void m144159a(j1h0 j1h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j1h0Var._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        j1h0Var._root_view = (VLinear) viewGroup.getChildAt(1);
        j1h0Var._custom_setting_layout = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        j1h0Var._custom_setting = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        j1h0Var._tabs = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        j1h0Var._content_pager = (ViewPager2) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m144160b(j1h0 j1h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121281A1, viewGroup, false);
        m144159a(j1h0Var, viewInflate);
        return viewInflate;
    }
}
