package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class zj30 {
    /* JADX INFO: renamed from: a */
    public static void m219084a(yj30 yj30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yj30Var._bar = (VNavigationBar) viewGroup.getChildAt(0);
        yj30Var._tablayout = (TabLayout) viewGroup.getChildAt(1);
        yj30Var._viewpager = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m219085b(yj30 yj30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121343V0, viewGroup, false);
        m219084a(yj30Var, viewInflate);
        return viewInflate;
    }
}
