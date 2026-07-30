package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesItemView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class srr {
    /* JADX INFO: renamed from: a */
    public static void m185704a(LiveActivitiesItemView liveActivitiesItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesItemView.f46310d = (VFrame) viewGroup.getChildAt(0);
        liveActivitiesItemView.f46311e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveActivitiesItemView.f46312f = (LiveMainlandTagView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveActivitiesItemView.f46313g = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveActivitiesItemView.f46314h = (VText) viewGroup.getChildAt(1);
        liveActivitiesItemView.f46315i = (VText) viewGroup.getChildAt(2);
        liveActivitiesItemView.f46316j = (VText) viewGroup.getChildAt(3);
        liveActivitiesItemView.f46317k = (VText) viewGroup.getChildAt(4);
    }
}
