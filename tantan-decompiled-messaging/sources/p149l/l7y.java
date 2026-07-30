package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class l7y {
    /* JADX INFO: renamed from: a */
    public static void m148831a(k7y k7yVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        k7yVar._bar = (VNavigationBar) viewGroup.getChildAt(0);
        k7yVar._tablayout = (TabLayout) viewGroup.getChildAt(1);
        k7yVar._viewpager = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m148832b(k7y k7yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121382g0, viewGroup, false);
        m148831a(k7yVar, viewInflate);
        return viewInflate;
    }
}
