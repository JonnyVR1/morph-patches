package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesInfiltrationItemPicView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class frr {
    /* JADX INFO: renamed from: a */
    public static void m122895a(LiveActivitiesInfiltrationItemPicView liveActivitiesInfiltrationItemPicView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesInfiltrationItemPicView._img = (VDraweeView) viewGroup.getChildAt(0);
        liveActivitiesInfiltrationItemPicView._cover = (VFrame) viewGroup.getChildAt(1);
        liveActivitiesInfiltrationItemPicView._follow = (VImage) viewGroup.getChildAt(2);
        liveActivitiesInfiltrationItemPicView._name = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveActivitiesInfiltrationItemPicView._desc = (TextView) viewGroup.getChildAt(4);
    }
}
