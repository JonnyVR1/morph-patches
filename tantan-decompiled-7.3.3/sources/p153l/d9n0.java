package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInternalItemView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class d9n0 {
    /* JADX INFO: renamed from: a */
    public static void m115085a(VoiceChatInternalItemView voiceChatInternalItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatInternalItemView.f53892d = (VText) viewGroup.getChildAt(0);
        voiceChatInternalItemView.f53893e = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        voiceChatInternalItemView.f53894f = (VLinear) viewGroup.getChildAt(2);
        voiceChatInternalItemView.f53895g = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceChatInternalItemView.f53896h = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
