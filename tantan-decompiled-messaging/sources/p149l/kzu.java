package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes13.dex */
public class kzu {
    /* JADX INFO: renamed from: a */
    public static void m147954a(LiveVoiceActivitiesEntryUnRead liveVoiceActivitiesEntryUnRead, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceActivitiesEntryUnRead.f46494d = (VDraweeView) viewGroup.getChildAt(0);
        liveVoiceActivitiesEntryUnRead.f46495e = (VMarqueeText) viewGroup.getChildAt(1);
        liveVoiceActivitiesEntryUnRead.f46496f = (VMarqueeText) viewGroup.getChildAt(2);
        liveVoiceActivitiesEntryUnRead.f46497g = (VFrame) viewGroup.getChildAt(3);
        liveVoiceActivitiesEntryUnRead.f46498h = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
