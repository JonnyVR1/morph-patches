package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.voice.member.LiveVoiceVirtualSendGiftGuideDialog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nbv {
    /* JADX INFO: renamed from: a */
    public static void m18642a(LiveVoiceVirtualSendGiftGuideDialog liveVoiceVirtualSendGiftGuideDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceVirtualSendGiftGuideDialog.d = viewGroup.getChildAt(0);
        liveVoiceVirtualSendGiftGuideDialog.e = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        liveVoiceVirtualSendGiftGuideDialog.f = (CommonMaskAvatarView) viewGroup.getChildAt(2);
        liveVoiceVirtualSendGiftGuideDialog.g = viewGroup.getChildAt(3);
        liveVoiceVirtualSendGiftGuideDialog.h = viewGroup.getChildAt(4);
        liveVoiceVirtualSendGiftGuideDialog.i = (LinearLayout) viewGroup.getChildAt(5);
        liveVoiceVirtualSendGiftGuideDialog.j = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        liveVoiceVirtualSendGiftGuideDialog.k = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        liveVoiceVirtualSendGiftGuideDialog.l = viewGroup.getChildAt(6);
    }
}
