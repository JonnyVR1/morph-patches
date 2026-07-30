package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown.LiveVChatCountdownView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class bju {
    /* JADX INFO: renamed from: a */
    public static void m104771a(LiveVChatCountdownView liveVChatCountdownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatCountdownView.f46119a = (VDraweeView) viewGroup.getChildAt(0);
        liveVChatCountdownView.f46120b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveVChatCountdownView.f46121c = (LiveStrokeTextView) viewGroup.getChildAt(2);
        liveVChatCountdownView.f46122d = (CommonGiftCountDownView) viewGroup.getChildAt(3);
        liveVChatCountdownView.f46123e = (AnimEffectPlayer) viewGroup.getChildAt(4);
    }
}
