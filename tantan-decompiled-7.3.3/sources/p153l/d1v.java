package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryRead;
import p151v.VDraweeView;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes9.dex */
public class d1v {
    /* JADX INFO: renamed from: a */
    public static void m113633a(LiveVoiceActivitiesEntryRead liveVoiceActivitiesEntryRead, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceActivitiesEntryRead.f47328d = (VDraweeView) viewGroup.getChildAt(0);
        liveVoiceActivitiesEntryRead.f47329e = (VMarqueeText) viewGroup.getChildAt(1);
        liveVoiceActivitiesEntryRead.f47330f = (VMarqueeText) viewGroup.getChildAt(2);
    }
}
