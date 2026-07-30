package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.intlmeet.frag.IntlMeetFragTabBar;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class odo {
    /* JADX INFO: renamed from: a */
    public static void m163697a(IntlMeetFragTabBar intlMeetFragTabBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetFragTabBar.f24201a = (FrameLayout) viewGroup.getChildAt(0);
        intlMeetFragTabBar.f24202b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMeetFragTabBar.f24203c = (VLinear) viewGroup.getChildAt(1);
        intlMeetFragTabBar.f24204d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlMeetFragTabBar.f24205e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m163698b(IntlMeetFragTabBar intlMeetFragTabBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121447y, viewGroup, false);
        m163697a(intlMeetFragTabBar, viewInflate);
        return viewInflate;
    }
}
