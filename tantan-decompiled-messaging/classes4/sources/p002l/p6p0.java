package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelTwoPairView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p6p0 {
    /* JADX INFO: renamed from: a */
    public static void m20072a(VoiceVirtualLoveTravelTwoPairView voiceVirtualLoveTravelTwoPairView, View view) {
        voiceVirtualLoveTravelTwoPairView.d = (VoiceVirtualLoveTravelTwoPairView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveTravelTwoPairView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceVirtualLoveTravelTwoPairView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceVirtualLoveTravelTwoPairView.g = (LinearLayout) viewGroup.getChildAt(1);
        voiceVirtualLoveTravelTwoPairView.h = (LinearLayout) viewGroup.getChildAt(2);
    }
}
