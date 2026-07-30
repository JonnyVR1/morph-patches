package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class oht {
    /* JADX INFO: renamed from: a */
    public static void m164461a(LiveRtcPlayErrorView liveRtcPlayErrorView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveRtcPlayErrorView.f47860a = (VLinear) viewGroup.getChildAt(0);
        liveRtcPlayErrorView.f47861b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveRtcPlayErrorView.f47862c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveRtcPlayErrorView.f47863d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
