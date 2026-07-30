package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntrySignIn;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryView;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveEntranceStartLiveView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class brr {
    /* JADX INFO: renamed from: a */
    public static void m103598a(LiveActivitiesEntryView liveActivitiesEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesEntryView.f46273a = (VFrame) viewGroup.getChildAt(0);
        liveActivitiesEntryView.f46274b = (LiveActivitiesEntryAll) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveActivitiesEntryView.f46275c = (LiveActivitiesEntrySignIn) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveActivitiesEntryView.f46276d = (LiveEntranceStartLiveView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveActivitiesEntryView.f46277e = (VText) viewGroup.getChildAt(1);
        liveActivitiesEntryView.f46278f = (VImage) viewGroup.getChildAt(2);
    }
}
