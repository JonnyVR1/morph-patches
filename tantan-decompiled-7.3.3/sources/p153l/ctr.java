package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntrySignIn;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryView;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveEntranceStartLiveView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ctr {
    /* JADX INFO: renamed from: a */
    public static void m112549a(LiveActivitiesEntryView liveActivitiesEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesEntryView.f47121a = (VFrame) viewGroup.getChildAt(0);
        liveActivitiesEntryView.f47122b = (LiveActivitiesEntryAll) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveActivitiesEntryView.f47123c = (LiveActivitiesEntrySignIn) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveActivitiesEntryView.f47124d = (LiveEntranceStartLiveView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveActivitiesEntryView.f47125e = (VText) viewGroup.getChildAt(1);
        liveActivitiesEntryView.f47126f = (VImage) viewGroup.getChildAt(2);
    }
}
