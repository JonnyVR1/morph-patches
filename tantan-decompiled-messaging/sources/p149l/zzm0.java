package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInternalItemView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zzm0 {
    /* JADX INFO: renamed from: a */
    public static void m221021a(VoiceChatInternalItemView voiceChatInternalItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatInternalItemView.f53044d = (VText) viewGroup.getChildAt(0);
        voiceChatInternalItemView.f53045e = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        voiceChatInternalItemView.f53046f = (VLinear) viewGroup.getChildAt(2);
        voiceChatInternalItemView.f53047g = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceChatInternalItemView.f53048h = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
