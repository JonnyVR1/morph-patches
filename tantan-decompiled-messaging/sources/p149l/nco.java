package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class nco {
    /* JADX INFO: renamed from: a */
    public static void m158960a(IntlMeetFakeLikersItem intlMeetFakeLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetFakeLikersItem.f24215h = (VDraweeView) viewGroup.getChildAt(0);
        intlMeetFakeLikersItem.f24216i = (VLinear) viewGroup.getChildAt(1);
        intlMeetFakeLikersItem.f24217j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlMeetFakeLikersItem.f24218k = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlMeetFakeLikersItem.f24219l = (FrameLayout) viewGroup.getChildAt(3);
        intlMeetFakeLikersItem.f24220m = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        intlMeetFakeLikersItem.f24221n = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlMeetFakeLikersItem.f24222o = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlMeetFakeLikersItem.f24223p = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        intlMeetFakeLikersItem.f24224q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlMeetFakeLikersItem.f24225r = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        intlMeetFakeLikersItem.f24226s = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlMeetFakeLikersItem.f24227t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlMeetFakeLikersItem.f24228u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
    }
}
