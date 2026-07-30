package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class r0n0 {
    /* JADX INFO: renamed from: a */
    public static void m177406a(VoiceChatItem voiceChatItem, View view) {
        voiceChatItem.f48759a = (VoiceChatItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatItem.f48760b = (VLinear) viewGroup.getChildAt(0);
        voiceChatItem.f48761c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceChatItem.f48762d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceChatItem.f48763e = (VDraweeView) viewGroup.getChildAt(1);
    }
}
