package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.putong.core.newui.intlmeet.frag.IntlMeetFragTabBar;

/* JADX INFO: loaded from: classes10.dex */
public class sfo {
    /* JADX INFO: renamed from: a */
    public static void m185658a(rfo rfoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rfoVar._tab_bar = (IntlMeetFragTabBar) viewGroup.getChildAt(0);
        rfoVar._viewpager = (ViewPager2) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m185659b(rfo rfoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152046v, viewGroup, false);
        m185658a(rfoVar, viewInflate);
        return viewInflate;
    }
}
