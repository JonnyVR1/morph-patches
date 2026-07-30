package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesInfiltrationView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class jrr {
    /* JADX INFO: renamed from: a */
    public static void m142971a(LiveActivitiesInfiltrationView liveActivitiesInfiltrationView, View view) {
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
