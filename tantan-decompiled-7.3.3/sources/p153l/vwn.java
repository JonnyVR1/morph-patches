package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class vwn {
    /* JADX INFO: renamed from: a */
    public static void m203170a(IntlLiveFollowView intlLiveFollowView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveFollowView._top_divide = viewGroup.getChildAt(0);
        intlLiveFollowView._infiltration_top = (VLinear) viewGroup.getChildAt(1);
        intlLiveFollowView._infiltration_top_refresh = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        intlLiveFollowView._infiltration_top_change_one = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        intlLiveFollowView._content = (VLinear) viewGroup.getChildAt(2);
        intlLiveFollowView._bottom_empty = viewGroup.getChildAt(3);
        intlLiveFollowView._bottom_divide = viewGroup.getChildAt(4);
    }
}
