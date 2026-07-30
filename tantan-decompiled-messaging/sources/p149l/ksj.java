package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.bubble.GiftBubbleWithFlyView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;

/* JADX INFO: loaded from: classes4.dex */
public class ksj {
    /* JADX INFO: renamed from: a */
    public static void m147073a(GiftOperationView giftOperationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftOperationView.f49762a = (GiftBubbleWithFlyView) viewGroup.getChildAt(0);
        giftOperationView.f49763b = (LiveCountdownView) viewGroup.getChildAt(1);
        giftOperationView.f49764c = (GiftGearsLayerView) viewGroup.getChildAt(2);
        giftOperationView.f49765d = (LiveMultipleGiftView) viewGroup.getChildAt(3);
    }
}
