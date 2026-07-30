package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOperationView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.bubble.LiveVChatGiftBubbleWithFlyView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown.LiveVChatCountdownView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsLayerView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftView;

/* JADX INFO: loaded from: classes13.dex */
public class yku {
    /* JADX INFO: renamed from: a */
    public static void m215209a(LiveVChatGiftOperationView liveVChatGiftOperationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftOperationView.f45213a = (LiveVChatGiftBubbleWithFlyView) viewGroup.getChildAt(0);
        liveVChatGiftOperationView.f45214b = (LiveVChatCountdownView) viewGroup.getChildAt(1);
        liveVChatGiftOperationView.f45215c = (LiveVChatGiftGearsLayerView) viewGroup.getChildAt(2);
        liveVChatGiftOperationView.f45216d = (LiveVChatMultipleGiftView) viewGroup.getChildAt(3);
    }
}
