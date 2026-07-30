package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleOne;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleTwo;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryRead;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class a4v {
    /* JADX INFO: renamed from: a */
    public static void m94929a(LiveVoiceEntryView liveVoiceEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceEntryView.f46511a = (VFrame) viewGroup.getChildAt(0);
        liveVoiceEntryView.f46512b = (LiveVoiceActivitiesEntryOriginStyleOne) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveVoiceEntryView.f46513c = (LiveVoiceActivitiesEntryOriginStyleTwo) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveVoiceEntryView.f46514d = (LiveVoiceActivitiesEntryRead) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveVoiceEntryView.f46515e = (LiveVoiceActivitiesEntryUnRead) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        liveVoiceEntryView.f46516f = (VFrame) viewGroup.getChildAt(1);
        liveVoiceEntryView.f46517g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveVoiceEntryView.f46518h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
