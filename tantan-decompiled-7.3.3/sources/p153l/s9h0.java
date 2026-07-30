package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class s9h0 {
    /* JADX INFO: renamed from: a */
    public static void m185178a(r9h0 r9h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        r9h0Var._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        r9h0Var._root_view = (VLinear) viewGroup.getChildAt(1);
        r9h0Var._custom_setting_layout = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        r9h0Var._custom_setting = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        r9h0Var._tabs = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        r9h0Var._content_pager = (ViewPager2) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m185179b(r9h0 r9h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151889A1, viewGroup, false);
        m185178a(r9h0Var, viewInflate);
        return viewInflate;
    }
}
