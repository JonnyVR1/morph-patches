package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pjt {
    /* JADX INFO: renamed from: a */
    public static void m172522a(LiveRtcPlayErrorView liveRtcPlayErrorView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveRtcPlayErrorView.f48708a = (VLinear) viewGroup.getChildAt(0);
        liveRtcPlayErrorView.f48709b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveRtcPlayErrorView.f48710c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveRtcPlayErrorView.f48711d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
