package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveItemInfoView;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTeamInfoView;

/* JADX INFO: loaded from: classes4.dex */
public class m6p0 {
    /* JADX INFO: renamed from: a */
    public static void m153263a(VoiceVirtualLoveTeamInfoView voiceVirtualLoveTeamInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveTeamInfoView.f52547a = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceVirtualLoveTeamInfoView.f52548b = (TextView) viewGroup.getChildAt(1);
        voiceVirtualLoveTeamInfoView.f52549c = (TextView) viewGroup.getChildAt(2);
        voiceVirtualLoveTeamInfoView.f52550d = (VoiceVirtualLoveItemInfoView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualLoveTeamInfoView.f52551e = (VoiceVirtualLoveItemInfoView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
