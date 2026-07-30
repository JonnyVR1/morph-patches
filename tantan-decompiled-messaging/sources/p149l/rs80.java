package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class rs80 {
    /* JADX INFO: renamed from: a */
    public static void m180639a(qs80 qs80Var, View view) {
        qs80Var._root_view = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qs80Var._custom_setting = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qs80Var._tabs = (TabLayout) viewGroup.getChildAt(1);
        qs80Var._content_pager = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m180640b(qs80 qs80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121391i1, viewGroup, false);
        m180639a(qs80Var, viewInflate);
        return viewInflate;
    }
}
