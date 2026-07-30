package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInternalItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zzm0 {
    /* JADX INFO: renamed from: a */
    public static void m27683a(VoiceChatInternalItemView voiceChatInternalItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatInternalItemView.d = viewGroup.getChildAt(0);
        voiceChatInternalItemView.e = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        voiceChatInternalItemView.f = viewGroup.getChildAt(2);
        voiceChatInternalItemView.g = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceChatInternalItemView.h = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
