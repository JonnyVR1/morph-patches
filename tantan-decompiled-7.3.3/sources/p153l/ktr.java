package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesInfiltrationView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ktr {
    /* JADX INFO: renamed from: a */
    public static void m151395a(LiveActivitiesInfiltrationView liveActivitiesInfiltrationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesInfiltrationView._top_divide = viewGroup.getChildAt(0);
        liveActivitiesInfiltrationView._infiltration_top = (VLinear) viewGroup.getChildAt(1);
        liveActivitiesInfiltrationView._infiltration_top_refresh = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveActivitiesInfiltrationView._infiltration_top_change_one = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveActivitiesInfiltrationView._content = (VLinear) viewGroup.getChildAt(2);
        liveActivitiesInfiltrationView._bottom_empty = viewGroup.getChildAt(3);
        liveActivitiesInfiltrationView._bottom_divide = viewGroup.getChildAt(4);
    }
}
