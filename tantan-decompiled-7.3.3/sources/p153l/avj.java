package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.bubble.GiftBubbleWithFlyView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;

/* JADX INFO: loaded from: classes4.dex */
public class avj {
    /* JADX INFO: renamed from: a */
    public static void m100464a(GiftOperationView giftOperationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftOperationView.f50610a = (GiftBubbleWithFlyView) viewGroup.getChildAt(0);
        giftOperationView.f50611b = (LiveCountdownView) viewGroup.getChildAt(1);
        giftOperationView.f50612c = (GiftGearsLayerView) viewGroup.getChildAt(2);
        giftOperationView.f50613d = (LiveMultipleGiftView) viewGroup.getChildAt(3);
    }
}
