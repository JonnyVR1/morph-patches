package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class v9n0 {
    /* JADX INFO: renamed from: a */
    public static void m200450a(VoiceChatItem voiceChatItem, View view) {
        voiceChatItem.f49607a = (VoiceChatItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatItem.f49608b = (VLinear) viewGroup.getChildAt(0);
        voiceChatItem.f49609c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceChatItem.f49610d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceChatItem.f49611e = (VDraweeView) viewGroup.getChildAt(1);
    }
}
