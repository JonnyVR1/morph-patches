package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.intlmeet.frag.IntlMeetFragTabBar;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ofo {
    /* JADX INFO: renamed from: a */
    public static void m167468a(IntlMeetFragTabBar intlMeetFragTabBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetFragTabBar.f24943a = (FrameLayout) viewGroup.getChildAt(0);
        intlMeetFragTabBar.f24944b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMeetFragTabBar.f24945c = (VLinear) viewGroup.getChildAt(1);
        intlMeetFragTabBar.f24946d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlMeetFragTabBar.f24947e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m167469b(IntlMeetFragTabBar intlMeetFragTabBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152055y, viewGroup, false);
        m167468a(intlMeetFragTabBar, viewInflate);
        return viewInflate;
    }
}
