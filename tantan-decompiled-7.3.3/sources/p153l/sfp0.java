package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTeamInfoView;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelOneOrThreePairView;

/* JADX INFO: loaded from: classes4.dex */
public class sfp0 {
    /* JADX INFO: renamed from: a */
    public static void m185660a(VoiceVirtualLoveTravelOneOrThreePairView voiceVirtualLoveTravelOneOrThreePairView, View view) {
        voiceVirtualLoveTravelOneOrThreePairView.f53403d = (VoiceVirtualLoveTravelOneOrThreePairView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveTravelOneOrThreePairView.f53404e = (VoiceVirtualLoveTeamInfoView) viewGroup.getChildAt(0);
        voiceVirtualLoveTravelOneOrThreePairView.f53405f = (VoiceVirtualLoveTeamInfoView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceVirtualLoveTravelOneOrThreePairView.f53406g = (VoiceVirtualLoveTeamInfoView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceVirtualLoveTravelOneOrThreePairView.f53407h = (LinearLayout) viewGroup.getChildAt(2);
        voiceVirtualLoveTravelOneOrThreePairView.f53408i = (LinearLayout) viewGroup.getChildAt(3);
    }
}
