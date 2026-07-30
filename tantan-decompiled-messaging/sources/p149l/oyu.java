package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleOne;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes13.dex */
public class oyu {
    /* JADX INFO: renamed from: a */
    public static void m166699a(LiveVoiceActivitiesEntryOriginStyleOne liveVoiceActivitiesEntryOriginStyleOne, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceActivitiesEntryOriginStyleOne.f46463c = (AnimEffectPlayer) viewGroup.getChildAt(0);
        liveVoiceActivitiesEntryOriginStyleOne.f46464d = (VMarqueeText) viewGroup.getChildAt(1);
    }
}
