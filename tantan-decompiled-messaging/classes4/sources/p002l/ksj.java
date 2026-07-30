package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.bubble.GiftBubbleWithFlyView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ksj {
    /* JADX INFO: renamed from: a */
    public static void m16773a(GiftOperationView giftOperationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftOperationView.f5804a = (GiftBubbleWithFlyView) viewGroup.getChildAt(0);
        giftOperationView.f5805b = (LiveCountdownView) viewGroup.getChildAt(1);
        giftOperationView.f5806c = (GiftGearsLayerView) viewGroup.getChildAt(2);
        giftOperationView.f5807d = (LiveMultipleGiftView) viewGroup.getChildAt(3);
    }
}
