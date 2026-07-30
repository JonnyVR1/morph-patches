package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p000p1.mobile.putong.live.livingroom.base.room.LiveBgView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p000p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p000p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p000p1.mobile.putong.live.livingroom.common.fans.FansView;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpToRoomView;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.OfficialShowView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q750 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m21033a(OfficialShowView officialShowView, View view) {
        officialShowView.f7117a = (OfficialShowView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowView.f7118b = (LiveBgView) viewGroup.getChildAt(0);
        officialShowView.f7119c = (LivePlayerView) viewGroup.getChildAt(1);
        officialShowView.f7120d = (OfficialShowPusherView) viewGroup.getChildAt(2);
        officialShowView.f7121e = viewGroup.getChildAt(3);
        officialShowView.f7122f = viewGroup.getChildAt(4);
        officialShowView.f7123g = (OfficialShowSwitchView) viewGroup.getChildAt(5);
        officialShowView.f7124h = viewGroup.getChildAt(6);
        officialShowView.f7125i = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        officialShowView.f7126j = (JumpToRoomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        officialShowView.f7127k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        officialShowView.f7128l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        officialShowView.f7129m = (OfficialShowAvatarView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        officialShowView.f7130n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        officialShowView.f7131o = (OperationEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        officialShowView.f7132p = (BulletView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        officialShowView.f7133q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(5);
        officialShowView.f7134r = (FansView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        officialShowView.f7135s = (LiveCampaignView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(6);
        officialShowView.f7136t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7);
        officialShowView.f7137u = (ChatView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7)).getChildAt(0);
        officialShowView.f7138v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(8);
        officialShowView.f7139w = (OfficialShowPlayBillView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(8)).getChildAt(0);
        officialShowView.f7140x = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        officialShowView.f7141y = (DanmakuViewPort) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        officialShowView.f7142z = (LiveGiftLayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        officialShowView.f7099A = (TopEffectLayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(2);
        officialShowView.f7100B = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        officialShowView.f7101C = (ChatInputEntryView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(0);
        officialShowView.f7102D = (BottomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(1);
        officialShowView.f7103E = (LiveBubbleView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(2);
        officialShowView.f7104F = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        officialShowView.f7105G = (LiveGiftTrays) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        officialShowView.f7106H = (LiveEnterRoomView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        officialShowView.f7107I = (LiveEnterRoomView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        officialShowView.f7108J = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(4);
        officialShowView.f7109K = (PreOperationAnimView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(5);
        officialShowView.f7110L = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(6);
        officialShowView.f7111M = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(6)).getChildAt(0);
        officialShowView.f7112N = (GameEffectView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        officialShowView.f7113O = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(4);
        officialShowView.f7114P = viewGroup.getChildAt(7);
    }
}
