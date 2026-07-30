package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowInfiltrationItemPicView;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowInfiltrationItemView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class swn {
    /* JADX INFO: renamed from: a */
    public static void m188331a(IntlLiveFollowInfiltrationItemView intlLiveFollowInfiltrationItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveFollowInfiltrationItemView._title = (VText) viewGroup.getChildAt(0);
        intlLiveFollowInfiltrationItemView._hor = (VLinear) viewGroup.getChildAt(1);
        intlLiveFollowInfiltrationItemView._hor_item_1 = (IntlLiveFollowInfiltrationItemPicView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlLiveFollowInfiltrationItemView._hor_item_2 = (IntlLiveFollowInfiltrationItemPicView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlLiveFollowInfiltrationItemView._hor_item_3 = (IntlLiveFollowInfiltrationItemPicView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
