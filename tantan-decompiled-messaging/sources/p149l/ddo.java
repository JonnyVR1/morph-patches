package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes10.dex */
public class ddo {
    /* JADX INFO: renamed from: a */
    public static void m111042a(cdo cdoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cdoVar._tablayout = (TabLayout) viewGroup.getChildAt(0);
        cdoVar._viewpager = (ViewPager2) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m111043b(cdo cdoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121441w, viewGroup, false);
        m111042a(cdoVar, viewInflate);
        return viewInflate;
    }
}
