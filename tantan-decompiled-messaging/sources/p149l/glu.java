package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatTrayBackground;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class glu {
    /* JADX INFO: renamed from: a */
    public static void m126916a(LiveVChatGiftTrayView liveVChatGiftTrayView, View view) {
        liveVChatGiftTrayView.f45233d = (LiveVChatGiftTrayView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftTrayView.f45234e = (LiveVChatTrayBackground) viewGroup.getChildAt(0);
        liveVChatGiftTrayView.f45235f = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        liveVChatGiftTrayView.f45236g = (VDraweeView) viewGroup.getChildAt(2);
        liveVChatGiftTrayView.f45237h = (VText) viewGroup.getChildAt(3);
        liveVChatGiftTrayView.f45238i = (VText) viewGroup.getChildAt(4);
        liveVChatGiftTrayView.f45239j = (VDraweeView) viewGroup.getChildAt(5);
        liveVChatGiftTrayView.f45240k = (VImage) viewGroup.getChildAt(6);
        liveVChatGiftTrayView.f45241l = (VText) viewGroup.getChildAt(7);
        liveVChatGiftTrayView.f45242m = (LinearLayout) viewGroup.getChildAt(8);
        liveVChatGiftTrayView.f45243n = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        liveVChatGiftTrayView.f45244o = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        liveVChatGiftTrayView.f45245p = (AnimEffectPlayer) viewGroup.getChildAt(9);
    }
}
