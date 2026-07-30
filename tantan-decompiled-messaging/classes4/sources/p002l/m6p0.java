package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTeamInfoView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class m6p0 {
    /* JADX INFO: renamed from: a */
    public static void m17728a(VoiceVirtualLoveTeamInfoView voiceVirtualLoveTeamInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveTeamInfoView.a = viewGroup.getChildAt(0);
        voiceVirtualLoveTeamInfoView.b = (TextView) viewGroup.getChildAt(1);
        voiceVirtualLoveTeamInfoView.c = (TextView) viewGroup.getChildAt(2);
        voiceVirtualLoveTeamInfoView.d = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualLoveTeamInfoView.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
