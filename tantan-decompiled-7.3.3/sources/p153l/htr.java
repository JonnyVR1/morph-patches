package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesInfiltrationItemPicView;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesInfiltrationItemView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class htr {
    /* JADX INFO: renamed from: a */
    public static void m137099a(LiveActivitiesInfiltrationItemView liveActivitiesInfiltrationItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesInfiltrationItemView._title = (VText) viewGroup.getChildAt(0);
        liveActivitiesInfiltrationItemView._hor = (VLinear) viewGroup.getChildAt(1);
        liveActivitiesInfiltrationItemView._hor_item_1 = (LiveActivitiesInfiltrationItemPicView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveActivitiesInfiltrationItemView._hor_item_2 = (LiveActivitiesInfiltrationItemPicView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveActivitiesInfiltrationItemView._hor_item_3 = (LiveActivitiesInfiltrationItemPicView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
