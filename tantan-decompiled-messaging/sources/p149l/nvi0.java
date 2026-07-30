package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.HourTopBroadcastView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.IdolUserUpgradeView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.LiveIntlStarLeaderBoardEffectView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.RoomTopEffectView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopLeaderBoardEffectView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopSVGAEffectView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.UserUpgradeView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.VoiceLiveHourTopBroadcastView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.VoiceSpecialAuctionEffectView;

/* JADX INFO: loaded from: classes4.dex */
public class nvi0 {
    /* JADX INFO: renamed from: a */
    public static void m161692a(TopEffectLayer topEffectLayer, View view) {
        topEffectLayer.f50006d = (TopEffectLayer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topEffectLayer.f50007e = (UserUpgradeView) viewGroup.getChildAt(0);
        topEffectLayer.f50008f = (IdolUserUpgradeView) viewGroup.getChildAt(1);
        topEffectLayer.f50009g = (HourTopBroadcastView) viewGroup.getChildAt(2);
        topEffectLayer.f50010h = (VoiceLiveHourTopBroadcastView) viewGroup.getChildAt(3);
        topEffectLayer.f50011i = (TopSVGAEffectView) viewGroup.getChildAt(4);
        topEffectLayer.f50012j = (TopLeaderBoardEffectView) viewGroup.getChildAt(5);
        topEffectLayer.f50013k = (LiveIntlStarLeaderBoardEffectView) viewGroup.getChildAt(6);
        topEffectLayer.f50014l = (VoiceSpecialAuctionEffectView) viewGroup.getChildAt(7);
        topEffectLayer.f50015m = (RoomTopEffectView) viewGroup.getChildAt(8);
        topEffectLayer.f50016n = (AnimEffectPlayer) viewGroup.getChildAt(9);
    }
}
