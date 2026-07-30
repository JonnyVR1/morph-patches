package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragTabBar;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class zep {
    /* JADX INFO: renamed from: a */
    public static void m218384a(yep yepVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yepVar._bg = (VImage) viewGroup.getChildAt(0);
        yepVar._tab_bar = (IntlTribeMeetFragTabBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        yepVar._viewpager = (ViewPager2) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m218385b(yep yepVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121345W, viewGroup, false);
        m218384a(yepVar, viewInflate);
        return viewInflate;
    }
}
