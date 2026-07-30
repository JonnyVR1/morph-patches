package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleTwo;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes13.dex */
public class uyu {
    /* JADX INFO: renamed from: a */
    public static void m196373a(LiveVoiceActivitiesEntryOriginStyleTwo liveVoiceActivitiesEntryOriginStyleTwo, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceActivitiesEntryOriginStyleTwo.f46471d = (AnimEffectPlayer) viewGroup.getChildAt(0);
        liveVoiceActivitiesEntryOriginStyleTwo.f46472e = (VMarqueeText) viewGroup.getChildAt(1);
        liveVoiceActivitiesEntryOriginStyleTwo.f46473f = (VMarqueeText) viewGroup.getChildAt(2);
    }
}
