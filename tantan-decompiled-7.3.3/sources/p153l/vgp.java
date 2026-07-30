package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragTabBar;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class vgp {
    /* JADX INFO: renamed from: a */
    public static void m201236a(IntlTribeMeetFragTabBar intlTribeMeetFragTabBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeMeetFragTabBar.f25033d = (FrameLayout) viewGroup.getChildAt(0);
        intlTribeMeetFragTabBar.f25034e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlTribeMeetFragTabBar.f25035f = (VLinear) viewGroup.getChildAt(1);
        intlTribeMeetFragTabBar.f25036g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlTribeMeetFragTabBar.f25037h = (VLinear) viewGroup.getChildAt(2);
        intlTribeMeetFragTabBar.f25038i = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlTribeMeetFragTabBar.f25039j = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m201237b(IntlTribeMeetFragTabBar intlTribeMeetFragTabBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151956X, viewGroup, false);
        m201236a(intlTribeMeetFragTabBar, viewInflate);
        return viewInflate;
    }
}
