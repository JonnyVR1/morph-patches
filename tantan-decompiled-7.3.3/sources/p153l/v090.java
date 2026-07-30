package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class v090 {
    /* JADX INFO: renamed from: a */
    public static void m198892a(u090 u090Var, View view) {
        u090Var._root_view = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        u090Var._custom_setting = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        u090Var._tabs = (TabLayout) viewGroup.getChildAt(1);
        u090Var._content_pager = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m198893b(u090 u090Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151999i1, viewGroup, false);
        m198892a(u090Var, viewInflate);
        return viewInflate;
    }
}
