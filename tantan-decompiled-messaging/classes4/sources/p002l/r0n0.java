package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r0n0 {
    /* JADX INFO: renamed from: a */
    public static void m21710a(VoiceChatItem voiceChatItem, View view) {
        voiceChatItem.f4801a = (VoiceChatItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatItem.f4802b = viewGroup.getChildAt(0);
        voiceChatItem.f4803c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceChatItem.f4804d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceChatItem.f4805e = viewGroup.getChildAt(1);
    }
}
