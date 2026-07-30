package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTeamInfoView;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelOneOrThreePairView;

/* JADX INFO: loaded from: classes4.dex */
public class o6p0 {
    /* JADX INFO: renamed from: a */
    public static void m162939a(VoiceVirtualLoveTravelOneOrThreePairView voiceVirtualLoveTravelOneOrThreePairView, View view) {
        voiceVirtualLoveTravelOneOrThreePairView.f52555d = (VoiceVirtualLoveTravelOneOrThreePairView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveTravelOneOrThreePairView.f52556e = (VoiceVirtualLoveTeamInfoView) viewGroup.getChildAt(0);
        voiceVirtualLoveTravelOneOrThreePairView.f52557f = (VoiceVirtualLoveTeamInfoView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceVirtualLoveTravelOneOrThreePairView.f52558g = (VoiceVirtualLoveTeamInfoView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceVirtualLoveTravelOneOrThreePairView.f52559h = (LinearLayout) viewGroup.getChildAt(2);
        voiceVirtualLoveTravelOneOrThreePairView.f52560i = (LinearLayout) viewGroup.getChildAt(3);
    }
}
