package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class rj30 {
    /* JADX INFO: renamed from: a */
    public static void m179544a(oj30 oj30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oj30Var._bar = (VNavigationBar) viewGroup.getChildAt(0);
        oj30Var._tablayout = (TabLayout) viewGroup.getChildAt(1);
        oj30Var._viewpager = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m179545b(oj30 oj30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121340U0, viewGroup, false);
        m179544a(oj30Var, viewInflate);
        return viewInflate;
    }
}
