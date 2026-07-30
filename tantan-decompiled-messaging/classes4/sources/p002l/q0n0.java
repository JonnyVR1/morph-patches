package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q0n0 {
    /* JADX INFO: renamed from: a */
    public static void m20790a(VoiceChatItemView voiceChatItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatItemView.a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        voiceChatItemView.b = viewGroup.getChildAt(1);
        voiceChatItemView.c = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceChatItemView.d = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
