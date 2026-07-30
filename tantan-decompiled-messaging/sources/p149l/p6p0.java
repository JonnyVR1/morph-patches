package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTeamInfoView;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelTwoPairView;

/* JADX INFO: loaded from: classes4.dex */
public class p6p0 {
    /* JADX INFO: renamed from: a */
    public static void m167687a(VoiceVirtualLoveTravelTwoPairView voiceVirtualLoveTravelTwoPairView, View view) {
        voiceVirtualLoveTravelTwoPairView.f52561d = (VoiceVirtualLoveTravelTwoPairView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveTravelTwoPairView.f52562e = (VoiceVirtualLoveTeamInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceVirtualLoveTravelTwoPairView.f52563f = (VoiceVirtualLoveTeamInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceVirtualLoveTravelTwoPairView.f52564g = (LinearLayout) viewGroup.getChildAt(1);
        voiceVirtualLoveTravelTwoPairView.f52565h = (LinearLayout) viewGroup.getChildAt(2);
    }
}
