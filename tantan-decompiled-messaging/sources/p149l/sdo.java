package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.putong.core.newui.intlmeet.frag.IntlMeetFragTabBar;

/* JADX INFO: loaded from: classes10.dex */
public class sdo {
    /* JADX INFO: renamed from: a */
    public static void m183520a(rdo rdoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rdoVar._tab_bar = (IntlMeetFragTabBar) viewGroup.getChildAt(0);
        rdoVar._viewpager = (ViewPager2) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m183521b(rdo rdoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121438v, viewGroup, false);
        m183520a(rdoVar, viewInflate);
        return viewInflate;
    }
}
