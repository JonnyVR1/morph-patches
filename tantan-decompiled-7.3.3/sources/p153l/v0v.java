package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleTwo;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes9.dex */
public class v0v {
    /* JADX INFO: renamed from: a */
    public static void m198943a(LiveVoiceActivitiesEntryOriginStyleTwo liveVoiceActivitiesEntryOriginStyleTwo, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceActivitiesEntryOriginStyleTwo.f47319d = (AnimEffectPlayer) viewGroup.getChildAt(0);
        liveVoiceActivitiesEntryOriginStyleTwo.f47320e = (VMarqueeText) viewGroup.getChildAt(1);
        liveVoiceActivitiesEntryOriginStyleTwo.f47321f = (VMarqueeText) viewGroup.getChildAt(2);
    }
}
