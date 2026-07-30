package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class fs30 {
    /* JADX INFO: renamed from: a */
    public static void m127021a(cs30 cs30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cs30Var._bar = (VNavigationBar) viewGroup.getChildAt(0);
        cs30Var._tablayout = (TabLayout) viewGroup.getChildAt(1);
        cs30Var._viewpager = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m127022b(cs30 cs30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151948U0, viewGroup, false);
        m127021a(cs30Var, viewInflate);
        return viewInflate;
    }
}
