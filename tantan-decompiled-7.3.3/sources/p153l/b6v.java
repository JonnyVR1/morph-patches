package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleOne;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleTwo;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryRead;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class b6v {
    /* JADX INFO: renamed from: a */
    public static void m102797a(LiveVoiceEntryView liveVoiceEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceEntryView.f47359a = (VFrame) viewGroup.getChildAt(0);
        liveVoiceEntryView.f47360b = (LiveVoiceActivitiesEntryOriginStyleOne) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveVoiceEntryView.f47361c = (LiveVoiceActivitiesEntryOriginStyleTwo) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveVoiceEntryView.f47362d = (LiveVoiceActivitiesEntryRead) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveVoiceEntryView.f47363e = (LiveVoiceActivitiesEntryUnRead) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        liveVoiceEntryView.f47364f = (VFrame) viewGroup.getChildAt(1);
        liveVoiceEntryView.f47365g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveVoiceEntryView.f47366h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
