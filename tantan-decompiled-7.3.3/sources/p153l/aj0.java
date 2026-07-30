package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class aj0 {
    /* JADX INFO: renamed from: a */
    public static void m98214a(zi0 zi0Var, View view) {
        zi0Var.f204475a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zi0Var.f204476b = (VNavigationBar) viewGroup.getChildAt(0);
        zi0Var.f204477c = (TabLayout) viewGroup.getChildAt(1);
        zi0Var.f204478d = (DiscoveryPager) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m98215b(zi0 zi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173477C, viewGroup, false);
        m98214a(zi0Var, viewInflate);
        return viewInflate;
    }
}
