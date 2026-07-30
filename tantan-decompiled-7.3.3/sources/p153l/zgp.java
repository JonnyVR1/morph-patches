package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragTabBar;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class zgp {
    /* JADX INFO: renamed from: a */
    public static void m219652a(ygp ygpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ygpVar._bg = (VImage) viewGroup.getChildAt(0);
        ygpVar._tab_bar = (IntlTribeMeetFragTabBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ygpVar._viewpager = (ViewPager2) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m219653b(ygp ygpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151953W, viewGroup, false);
        m219652a(ygpVar, viewInflate);
        return viewInflate;
    }
}
