package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragTabBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vep {
    /* JADX INFO: renamed from: a */
    public static void m10217a(IntlTribeMeetFragTabBar intlTribeMeetFragTabBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeMeetFragTabBar.d = (FrameLayout) viewGroup.getChildAt(0);
        intlTribeMeetFragTabBar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlTribeMeetFragTabBar.f = viewGroup.getChildAt(1);
        intlTribeMeetFragTabBar.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlTribeMeetFragTabBar.h = viewGroup.getChildAt(2);
        intlTribeMeetFragTabBar.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlTribeMeetFragTabBar.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10218b(IntlTribeMeetFragTabBar intlTribeMeetFragTabBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5511X, viewGroup, false);
        m10217a(intlTribeMeetFragTabBar, viewInflate);
        return viewInflate;
    }
}
