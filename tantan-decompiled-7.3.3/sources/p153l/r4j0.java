package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.HourTopBroadcastView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.IdolUserUpgradeView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.LiveIntlStarLeaderBoardEffectView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.RoomTopEffectView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopLeaderBoardEffectView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopSVGAEffectView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.UserUpgradeView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.VoiceLiveHourTopBroadcastView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.VoiceSpecialAuctionEffectView;

/* JADX INFO: loaded from: classes4.dex */
public class r4j0 {
    /* JADX INFO: renamed from: a */
    public static void m179769a(TopEffectLayer topEffectLayer, View view) {
        topEffectLayer.f50854d = (TopEffectLayer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topEffectLayer.f50855e = (UserUpgradeView) viewGroup.getChildAt(0);
        topEffectLayer.f50856f = (IdolUserUpgradeView) viewGroup.getChildAt(1);
        topEffectLayer.f50857g = (HourTopBroadcastView) viewGroup.getChildAt(2);
        topEffectLayer.f50858h = (VoiceLiveHourTopBroadcastView) viewGroup.getChildAt(3);
        topEffectLayer.f50859i = (TopSVGAEffectView) viewGroup.getChildAt(4);
        topEffectLayer.f50860j = (TopLeaderBoardEffectView) viewGroup.getChildAt(5);
        topEffectLayer.f50861k = (LiveIntlStarLeaderBoardEffectView) viewGroup.getChildAt(6);
        topEffectLayer.f50862l = (VoiceSpecialAuctionEffectView) viewGroup.getChildAt(7);
        topEffectLayer.f50863m = (RoomTopEffectView) viewGroup.getChildAt(8);
        topEffectLayer.f50864n = (AnimEffectPlayer) viewGroup.getChildAt(9);
    }
}
