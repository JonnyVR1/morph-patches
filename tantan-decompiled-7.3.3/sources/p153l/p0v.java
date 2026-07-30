package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleOne;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes9.dex */
public class p0v {
    /* JADX INFO: renamed from: a */
    public static void m170183a(LiveVoiceActivitiesEntryOriginStyleOne liveVoiceActivitiesEntryOriginStyleOne, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceActivitiesEntryOriginStyleOne.f47311c = (AnimEffectPlayer) viewGroup.getChildAt(0);
        liveVoiceActivitiesEntryOriginStyleOne.f47312d = (VMarqueeText) viewGroup.getChildAt(1);
    }
}
