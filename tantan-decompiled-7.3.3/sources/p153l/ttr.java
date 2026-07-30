package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesItemView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ttr {
    /* JADX INFO: renamed from: a */
    public static void m192676a(LiveActivitiesItemView liveActivitiesItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesItemView.f47158d = (VFrame) viewGroup.getChildAt(0);
        liveActivitiesItemView.f47159e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveActivitiesItemView.f47160f = (LiveMainlandTagView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveActivitiesItemView.f47161g = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveActivitiesItemView.f47162h = (VText) viewGroup.getChildAt(1);
        liveActivitiesItemView.f47163i = (VText) viewGroup.getChildAt(2);
        liveActivitiesItemView.f47164j = (VText) viewGroup.getChildAt(3);
        liveActivitiesItemView.f47165k = (VText) viewGroup.getChildAt(4);
    }
}
