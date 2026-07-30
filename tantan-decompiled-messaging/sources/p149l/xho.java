package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class xho {
    /* JADX INFO: renamed from: a */
    public static void m208801a(who whoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        whoVar._bar = (VNavigationBar) viewGroup.getChildAt(0);
        whoVar._tablayout = (TabLayout) viewGroup.getChildAt(1);
        whoVar._viewpager = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m208802b(who whoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121429s, viewGroup, false);
        m208801a(whoVar, viewInflate);
        return viewInflate;
    }
}
