package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown.LiveVChatCountdownView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class ahu {
    /* JADX INFO: renamed from: a */
    public static void m96734a(LiveVChatCountdownView liveVChatCountdownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatCountdownView.f45271a = (VDraweeView) viewGroup.getChildAt(0);
        liveVChatCountdownView.f45272b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveVChatCountdownView.f45273c = (LiveStrokeTextView) viewGroup.getChildAt(2);
        liveVChatCountdownView.f45274d = (CommonGiftCountDownView) viewGroup.getChildAt(3);
        liveVChatCountdownView.f45275e = (AnimEffectPlayer) viewGroup.getChildAt(4);
    }
}
