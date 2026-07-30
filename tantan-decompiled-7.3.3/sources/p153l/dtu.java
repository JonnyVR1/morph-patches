package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.LiveVChatCampaignView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.tray.LiveVChatGiftTrays;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCalledView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatInfoView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatMessageView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatOptView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPreviewView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatWaitingOrderView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVideoChatPushView;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class dtu {
    /* JADX INFO: renamed from: a */
    public static void m117900a(LiveVChatView liveVChatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatView.f46277a = (LiveVChatPreviewView) viewGroup.getChildAt(0);
        liveVChatView.f46278b = (LiveVideoChatPushView) viewGroup.getChildAt(1);
        liveVChatView.f46279c = (LiveVChatInfoView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveVChatView.f46280d = (LiveVChatCampaignView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveVChatView.f46281e = (LiveVChatMessageView) viewGroup.getChildAt(3);
        liveVChatView.f46282f = (LiveVChatOptView) viewGroup.getChildAt(4);
        liveVChatView.f46283g = (LiveVChatGiftTrays) viewGroup.getChildAt(5);
        liveVChatView.f46284h = viewGroup.getChildAt(6);
        liveVChatView.f46285i = (LiveVChatWaitingOrderView) viewGroup.getChildAt(7);
        liveVChatView.f46286j = (LiveVChatCallingView) viewGroup.getChildAt(8);
        liveVChatView.f46287k = (VImage) viewGroup.getChildAt(9);
        liveVChatView.f46288l = (LiveVChatCalledView) viewGroup.getChildAt(10);
        liveVChatView.f46289m = (LiveVChatGiftLayer) viewGroup.getChildAt(11);
    }
}
