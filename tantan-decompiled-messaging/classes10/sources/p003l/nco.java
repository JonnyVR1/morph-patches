package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nco {
    /* JADX INFO: renamed from: a */
    public static void m8324a(IntlMeetFakeLikersItem intlMeetFakeLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetFakeLikersItem.h = viewGroup.getChildAt(0);
        intlMeetFakeLikersItem.i = viewGroup.getChildAt(1);
        intlMeetFakeLikersItem.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlMeetFakeLikersItem.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlMeetFakeLikersItem.l = (FrameLayout) viewGroup.getChildAt(3);
        intlMeetFakeLikersItem.m = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        intlMeetFakeLikersItem.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlMeetFakeLikersItem.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlMeetFakeLikersItem.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        intlMeetFakeLikersItem.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlMeetFakeLikersItem.r = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        intlMeetFakeLikersItem.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlMeetFakeLikersItem.t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlMeetFakeLikersItem.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
    }
}
