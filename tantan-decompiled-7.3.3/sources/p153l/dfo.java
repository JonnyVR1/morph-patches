package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes10.dex */
public class dfo {
    /* JADX INFO: renamed from: a */
    public static void m115528a(cfo cfoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cfoVar._tablayout = (TabLayout) viewGroup.getChildAt(0);
        cfoVar._viewpager = (ViewPager2) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m115529b(cfo cfoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152049w, viewGroup, false);
        m115528a(cfoVar, viewInflate);
        return viewInflate;
    }
}
