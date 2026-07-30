package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOperationView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.bubble.LiveVChatGiftBubbleWithFlyView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown.LiveVChatCountdownView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsLayerView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftView;

/* JADX INFO: loaded from: classes9.dex */
public class zmu {
    /* JADX INFO: renamed from: a */
    public static void m220478a(LiveVChatGiftOperationView liveVChatGiftOperationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftOperationView.f46061a = (LiveVChatGiftBubbleWithFlyView) viewGroup.getChildAt(0);
        liveVChatGiftOperationView.f46062b = (LiveVChatCountdownView) viewGroup.getChildAt(1);
        liveVChatGiftOperationView.f46063c = (LiveVChatGiftGearsLayerView) viewGroup.getChildAt(2);
        liveVChatGiftOperationView.f46064d = (LiveVChatMultipleGiftView) viewGroup.getChildAt(3);
    }
}
