package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class neo {
    /* JADX INFO: renamed from: a */
    public static void m162907a(IntlMeetFakeLikersItem intlMeetFakeLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetFakeLikersItem.f24957h = (VDraweeView) viewGroup.getChildAt(0);
        intlMeetFakeLikersItem.f24958i = (VLinear) viewGroup.getChildAt(1);
        intlMeetFakeLikersItem.f24959j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlMeetFakeLikersItem.f24960k = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlMeetFakeLikersItem.f24961l = (FrameLayout) viewGroup.getChildAt(3);
        intlMeetFakeLikersItem.f24962m = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        intlMeetFakeLikersItem.f24963n = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlMeetFakeLikersItem.f24964o = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlMeetFakeLikersItem.f24965p = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        intlMeetFakeLikersItem.f24966q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlMeetFakeLikersItem.f24967r = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        intlMeetFakeLikersItem.f24968s = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlMeetFakeLikersItem.f24969t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlMeetFakeLikersItem.f24970u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
    }
}
