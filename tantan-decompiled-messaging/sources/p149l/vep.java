package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragTabBar;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class vep {
    /* JADX INFO: renamed from: a */
    public static void m198212a(IntlTribeMeetFragTabBar intlTribeMeetFragTabBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeMeetFragTabBar.f24291d = (FrameLayout) viewGroup.getChildAt(0);
        intlTribeMeetFragTabBar.f24292e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlTribeMeetFragTabBar.f24293f = (VLinear) viewGroup.getChildAt(1);
        intlTribeMeetFragTabBar.f24294g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlTribeMeetFragTabBar.f24295h = (VLinear) viewGroup.getChildAt(2);
        intlTribeMeetFragTabBar.f24296i = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlTribeMeetFragTabBar.f24297j = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m198213b(IntlTribeMeetFragTabBar intlTribeMeetFragTabBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121348X, viewGroup, false);
        m198212a(intlTribeMeetFragTabBar, viewInflate);
        return viewInflate;
    }
}
