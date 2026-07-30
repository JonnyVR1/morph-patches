package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p151v.VButton;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class tjm0 {
    /* JADX INFO: renamed from: a */
    public static void m191446a(sjm0 sjm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sjm0Var._bar = (VNavigationBar) viewGroup.getChildAt(0);
        sjm0Var._content = (VLinear) viewGroup.getChildAt(1);
        sjm0Var._tab_layout = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sjm0Var._viewpager = (ViewPager2) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sjm0Var._no_permission = (VRelative) viewGroup.getChildAt(2);
        sjm0Var._permission_img = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        sjm0Var._permission_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        sjm0Var._permission_tv = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        sjm0Var._permission_btn = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m191447b(sjm0 sjm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151972b2, viewGroup, false);
        m191446a(sjm0Var, viewInflate);
        return viewInflate;
    }
}
