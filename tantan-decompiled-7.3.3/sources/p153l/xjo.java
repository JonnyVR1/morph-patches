package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class xjo {
    /* JADX INFO: renamed from: a */
    public static void m211259a(wjo wjoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wjoVar._bar = (VNavigationBar) viewGroup.getChildAt(0);
        wjoVar._tablayout = (TabLayout) viewGroup.getChildAt(1);
        wjoVar._viewpager = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m211260b(wjo wjoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152037s, viewGroup, false);
        m211259a(wjoVar, viewInflate);
        return viewInflate;
    }
}
