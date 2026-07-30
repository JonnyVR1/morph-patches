package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveItemInfoView;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTeamInfoView;

/* JADX INFO: loaded from: classes4.dex */
public class qfp0 {
    /* JADX INFO: renamed from: a */
    public static void m176391a(VoiceVirtualLoveTeamInfoView voiceVirtualLoveTeamInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveTeamInfoView.f53395a = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceVirtualLoveTeamInfoView.f53396b = (TextView) viewGroup.getChildAt(1);
        voiceVirtualLoveTeamInfoView.f53397c = (TextView) viewGroup.getChildAt(2);
        voiceVirtualLoveTeamInfoView.f53398d = (VoiceVirtualLoveItemInfoView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualLoveTeamInfoView.f53399e = (VoiceVirtualLoveItemInfoView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
