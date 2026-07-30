package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTeamInfoView;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelTwoPairView;

/* JADX INFO: loaded from: classes4.dex */
public class tfp0 {
    /* JADX INFO: renamed from: a */
    public static void m190957a(VoiceVirtualLoveTravelTwoPairView voiceVirtualLoveTravelTwoPairView, View view) {
        voiceVirtualLoveTravelTwoPairView.f53409d = (VoiceVirtualLoveTravelTwoPairView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveTravelTwoPairView.f53410e = (VoiceVirtualLoveTeamInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceVirtualLoveTravelTwoPairView.f53411f = (VoiceVirtualLoveTeamInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceVirtualLoveTravelTwoPairView.f53412g = (LinearLayout) viewGroup.getChildAt(1);
        voiceVirtualLoveTravelTwoPairView.f53413h = (LinearLayout) viewGroup.getChildAt(2);
    }
}
