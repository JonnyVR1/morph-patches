package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.HourTopBroadcastView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.IdolUserUpgradeView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.LiveIntlStarLeaderBoardEffectView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.RoomTopEffectView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopLeaderBoardEffectView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopSVGAEffectView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.UserUpgradeView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.VoiceLiveHourTopBroadcastView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.VoiceSpecialAuctionEffectView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nvi0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m19104a(TopEffectLayer topEffectLayer, View view) {
        topEffectLayer.f6048d = (TopEffectLayer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topEffectLayer.f6049e = (UserUpgradeView) viewGroup.getChildAt(0);
        topEffectLayer.f6050f = (IdolUserUpgradeView) viewGroup.getChildAt(1);
        topEffectLayer.f6051g = (HourTopBroadcastView) viewGroup.getChildAt(2);
        topEffectLayer.f6052h = (VoiceLiveHourTopBroadcastView) viewGroup.getChildAt(3);
        topEffectLayer.f6053i = (TopSVGAEffectView) viewGroup.getChildAt(4);
        topEffectLayer.f6054j = (TopLeaderBoardEffectView) viewGroup.getChildAt(5);
        topEffectLayer.f6055k = (LiveIntlStarLeaderBoardEffectView) viewGroup.getChildAt(6);
        topEffectLayer.f6056l = (VoiceSpecialAuctionEffectView) viewGroup.getChildAt(7);
        topEffectLayer.f6057m = (RoomTopEffectView) viewGroup.getChildAt(8);
        topEffectLayer.f6058n = viewGroup.getChildAt(9);
    }
}
