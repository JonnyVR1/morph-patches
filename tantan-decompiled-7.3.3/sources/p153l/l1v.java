package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes9.dex */
public class l1v {
    /* JADX INFO: renamed from: a */
    public static void m152513a(LiveVoiceActivitiesEntryUnRead liveVoiceActivitiesEntryUnRead, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceActivitiesEntryUnRead.f47342d = (VDraweeView) viewGroup.getChildAt(0);
        liveVoiceActivitiesEntryUnRead.f47343e = (VMarqueeText) viewGroup.getChildAt(1);
        liveVoiceActivitiesEntryUnRead.f47344f = (VMarqueeText) viewGroup.getChildAt(2);
        liveVoiceActivitiesEntryUnRead.f47345g = (VFrame) viewGroup.getChildAt(3);
        liveVoiceActivitiesEntryUnRead.f47346h = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
