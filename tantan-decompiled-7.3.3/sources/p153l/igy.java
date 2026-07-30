package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class igy {
    /* JADX INFO: renamed from: a */
    public static void m139964a(hgy hgyVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hgyVar._bar = (VNavigationBar) viewGroup.getChildAt(0);
        hgyVar._tablayout = (TabLayout) viewGroup.getChildAt(1);
        hgyVar._viewpager = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m139965b(hgy hgyVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151990g0, viewGroup, false);
        m139964a(hgyVar, viewInflate);
        return viewInflate;
    }
}
