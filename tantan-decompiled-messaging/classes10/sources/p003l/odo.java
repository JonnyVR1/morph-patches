package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.intlmeet.frag.IntlMeetFragTabBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class odo {
    /* JADX INFO: renamed from: a */
    public static void m8444a(IntlMeetFragTabBar intlMeetFragTabBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetFragTabBar.a = (FrameLayout) viewGroup.getChildAt(0);
        intlMeetFragTabBar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMeetFragTabBar.c = viewGroup.getChildAt(1);
        intlMeetFragTabBar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlMeetFragTabBar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8445b(IntlMeetFragTabBar intlMeetFragTabBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5610y, viewGroup, false);
        m8444a(intlMeetFragTabBar, viewInflate);
        return viewInflate;
    }
}
