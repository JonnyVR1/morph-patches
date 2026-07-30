package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatTrayBackground;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class hnu {
    /* JADX INFO: renamed from: a */
    public static void m136275a(LiveVChatGiftTrayView liveVChatGiftTrayView, View view) {
        liveVChatGiftTrayView.f46081d = (LiveVChatGiftTrayView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftTrayView.f46082e = (LiveVChatTrayBackground) viewGroup.getChildAt(0);
        liveVChatGiftTrayView.f46083f = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        liveVChatGiftTrayView.f46084g = (VDraweeView) viewGroup.getChildAt(2);
        liveVChatGiftTrayView.f46085h = (VText) viewGroup.getChildAt(3);
        liveVChatGiftTrayView.f46086i = (VText) viewGroup.getChildAt(4);
        liveVChatGiftTrayView.f46087j = (VDraweeView) viewGroup.getChildAt(5);
        liveVChatGiftTrayView.f46088k = (VImage) viewGroup.getChildAt(6);
        liveVChatGiftTrayView.f46089l = (VText) viewGroup.getChildAt(7);
        liveVChatGiftTrayView.f46090m = (LinearLayout) viewGroup.getChildAt(8);
        liveVChatGiftTrayView.f46091n = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        liveVChatGiftTrayView.f46092o = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        liveVChatGiftTrayView.f46093p = (AnimEffectPlayer) viewGroup.getChildAt(9);
    }
}
