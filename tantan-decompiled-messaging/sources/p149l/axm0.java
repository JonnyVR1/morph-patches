package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.model.VoiceChatGroupApplyItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class axm0 {
    /* JADX INFO: renamed from: a */
    public static void m99455a(VoiceChatGroupApplyItemView voiceChatGroupApplyItemView, View view) {
        voiceChatGroupApplyItemView._root = (VoiceChatGroupApplyItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatGroupApplyItemView._profile = (VDraweeView) viewGroup.getChildAt(0);
        voiceChatGroupApplyItemView._name = (VText) viewGroup.getChildAt(1);
        voiceChatGroupApplyItemView._agree_btn = (VText) viewGroup.getChildAt(2);
    }
}
