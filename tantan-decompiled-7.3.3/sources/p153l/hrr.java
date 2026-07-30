package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAnimBackground;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class hrr {
    /* JADX INFO: renamed from: a */
    public static void m136921a(LiveActivitiesEntryAll liveActivitiesEntryAll, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesEntryAll.f47095a = (LiveActivitiesEntryAnimBackground) viewGroup.getChildAt(0);
        liveActivitiesEntryAll.f47096b = (FrameLayout) viewGroup.getChildAt(1);
        liveActivitiesEntryAll.f47097c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveActivitiesEntryAll.f47098d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveActivitiesEntryAll.f47099e = (FrameLayout) viewGroup.getChildAt(2);
        liveActivitiesEntryAll.f47100f = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveActivitiesEntryAll.f47101g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveActivitiesEntryAll.f47102h = (LinearLayout) viewGroup.getChildAt(3);
        liveActivitiesEntryAll.f47103i = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveActivitiesEntryAll.f47104j = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        liveActivitiesEntryAll.f47105k = (VFrame) viewGroup.getChildAt(4);
    }
}
