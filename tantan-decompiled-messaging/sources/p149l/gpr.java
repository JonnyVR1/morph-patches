package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAnimBackground;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class gpr {
    /* JADX INFO: renamed from: a */
    public static void m127480a(LiveActivitiesEntryAll liveActivitiesEntryAll, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesEntryAll.f46247a = (LiveActivitiesEntryAnimBackground) viewGroup.getChildAt(0);
        liveActivitiesEntryAll.f46248b = (FrameLayout) viewGroup.getChildAt(1);
        liveActivitiesEntryAll.f46249c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveActivitiesEntryAll.f46250d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveActivitiesEntryAll.f46251e = (FrameLayout) viewGroup.getChildAt(2);
        liveActivitiesEntryAll.f46252f = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveActivitiesEntryAll.f46253g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveActivitiesEntryAll.f46254h = (LinearLayout) viewGroup.getChildAt(3);
        liveActivitiesEntryAll.f46255i = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveActivitiesEntryAll.f46256j = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        liveActivitiesEntryAll.f46257k = (VFrame) viewGroup.getChildAt(4);
    }
}
