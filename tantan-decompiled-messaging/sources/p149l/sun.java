package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowInfiltrationItemPicView;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowInfiltrationItemView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class sun {
    /* JADX INFO: renamed from: a */
    public static void m186016a(IntlLiveFollowInfiltrationItemView intlLiveFollowInfiltrationItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveFollowInfiltrationItemView._title = (VText) viewGroup.getChildAt(0);
        intlLiveFollowInfiltrationItemView._hor = (VLinear) viewGroup.getChildAt(1);
        intlLiveFollowInfiltrationItemView._hor_item_1 = (IntlLiveFollowInfiltrationItemPicView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlLiveFollowInfiltrationItemView._hor_item_2 = (IntlLiveFollowInfiltrationItemPicView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlLiveFollowInfiltrationItemView._hor_item_3 = (IntlLiveFollowInfiltrationItemPicView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
