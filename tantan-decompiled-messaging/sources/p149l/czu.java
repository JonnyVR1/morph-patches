package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryRead;
import p147v.VDraweeView;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes13.dex */
public class czu {
    /* JADX INFO: renamed from: a */
    public static void m109430a(LiveVoiceActivitiesEntryRead liveVoiceActivitiesEntryRead, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceActivitiesEntryRead.f46480d = (VDraweeView) viewGroup.getChildAt(0);
        liveVoiceActivitiesEntryRead.f46481e = (VMarqueeText) viewGroup.getChildAt(1);
        liveVoiceActivitiesEntryRead.f46482f = (VMarqueeText) viewGroup.getChildAt(2);
    }
}
