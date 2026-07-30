package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatItemView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class u9n0 {
    /* JADX INFO: renamed from: a */
    public static void m195106a(VoiceChatItemView voiceChatItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatItemView.f53897a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        voiceChatItemView.f53898b = (VLinear) viewGroup.getChildAt(1);
        voiceChatItemView.f53899c = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceChatItemView.f53900d = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
