package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.newui.greet.p057ui.ImDiscoveryPager;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class epo {
    /* JADX INFO: renamed from: a */
    public static void m121867a(cpo cpoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cpoVar.f83006d = (VNavigationBar) viewGroup.getChildAt(0);
        cpoVar.f83007e = (TabLayout) viewGroup.getChildAt(1);
        cpoVar.f83008f = (ImDiscoveryPager) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m121868b(cpo cpoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156964W0, viewGroup, false);
        m121867a(cpoVar, viewInflate);
        return viewInflate;
    }
}
