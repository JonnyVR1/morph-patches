package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.LiveVChatCampaignView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.tray.LiveVChatGiftTrays;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCalledView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatInfoView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatMessageView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatOptView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPreviewView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatWaitingOrderView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVideoChatPushView;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class cru {
    /* JADX INFO: renamed from: a */
    public static void m108455a(LiveVChatView liveVChatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatView.f45429a = (LiveVChatPreviewView) viewGroup.getChildAt(0);
        liveVChatView.f45430b = (LiveVideoChatPushView) viewGroup.getChildAt(1);
        liveVChatView.f45431c = (LiveVChatInfoView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveVChatView.f45432d = (LiveVChatCampaignView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveVChatView.f45433e = (LiveVChatMessageView) viewGroup.getChildAt(3);
        liveVChatView.f45434f = (LiveVChatOptView) viewGroup.getChildAt(4);
        liveVChatView.f45435g = (LiveVChatGiftTrays) viewGroup.getChildAt(5);
        liveVChatView.f45436h = viewGroup.getChildAt(6);
        liveVChatView.f45437i = (LiveVChatWaitingOrderView) viewGroup.getChildAt(7);
        liveVChatView.f45438j = (LiveVChatCallingView) viewGroup.getChildAt(8);
        liveVChatView.f45439k = (VImage) viewGroup.getChildAt(9);
        liveVChatView.f45440l = (LiveVChatCalledView) viewGroup.getChildAt(10);
        liveVChatView.f45441m = (LiveVChatGiftLayer) viewGroup.getChildAt(11);
    }
}
