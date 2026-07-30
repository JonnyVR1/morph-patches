package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oht {
    /* JADX INFO: renamed from: a */
    public static void m19544a(LiveRtcPlayErrorView liveRtcPlayErrorView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveRtcPlayErrorView.f3902a = viewGroup.getChildAt(0);
        liveRtcPlayErrorView.f3903b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveRtcPlayErrorView.f3904c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveRtcPlayErrorView.f3905d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
