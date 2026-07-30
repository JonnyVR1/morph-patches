package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatItemView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class q0n0 {
    /* JADX INFO: renamed from: a */
    public static void m172335a(VoiceChatItemView voiceChatItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatItemView.f53049a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        voiceChatItemView.f53050b = (VLinear) viewGroup.getChildAt(1);
        voiceChatItemView.f53051c = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceChatItemView.f53052d = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
