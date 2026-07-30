package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ns30 {
    /* JADX INFO: renamed from: a */
    public static void m164553a(ms30 ms30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ms30Var._bar = (VNavigationBar) viewGroup.getChildAt(0);
        ms30Var._tablayout = (TabLayout) viewGroup.getChildAt(1);
        ms30Var._viewpager = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m164554b(ms30 ms30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151951V0, viewGroup, false);
        m164553a(ms30Var, viewInflate);
        return viewInflate;
    }
}
