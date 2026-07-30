package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p000p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import com.p000p1.mobile.putong.live.livingroom.base.room.LiveBgView;
import com.p000p1.mobile.putong.live.livingroom.base.room.RoomView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.RoomStickerContainer;
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
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p000p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p000p1.mobile.putong.live.livingroom.other.side.entry.LiveSiderEntryView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ged0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m13767a(RoomView roomView, View view) {
        roomView.f3971a = (RoomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        roomView.f3972b = (LiveBgView) viewGroup.getChildAt(0);
        roomView.f3973c = (LivePlayerView) viewGroup.getChildAt(1);
        roomView.f3974d = viewGroup.getChildAt(2);
        roomView.f3975e = viewGroup.getChildAt(3);
        roomView.f3976f = (LiveRtcPlayErrorView) viewGroup.getChildAt(4);
        roomView.f3977g = viewGroup.getChildAt(5);
        roomView.f3978h = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        roomView.f3979i = (JumpToRoomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        roomView.f3980j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        roomView.f3981k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(2);
        roomView.f3983l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(3);
        roomView.f3984m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(4);
        roomView.f3985n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(5);
        roomView.f3986o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(6);
        roomView.f3987p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(7);
        roomView.f3989q = (AvatarView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(7)).getChildAt(0);
        roomView.f3990r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(8);
        roomView.f3991s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(8)).getChildAt(0);
        roomView.f3992t = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(8)).getChildAt(1);
        roomView.f3993u = (HourBoardEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(8)).getChildAt(1)).getChildAt(0);
        roomView.f3994v = (HourBoardNewEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(8)).getChildAt(1)).getChildAt(1);
        roomView.f3995w = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(8)).getChildAt(2);
        roomView.f3996x = (StarBoardEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(8)).getChildAt(2)).getChildAt(0);
        roomView.f3997y = (IntlLiveStarBoardEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(8)).getChildAt(2)).getChildAt(1);
        roomView.f3998z = (RoomStickerContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(9);
        roomView.f3940A = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(10);
        roomView.f3941B = (OperationEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(10)).getChildAt(0);
        roomView.f3942C = (BulletView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(11);
        roomView.f3943D = (LiveSiderEntryView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(12);
        roomView.f3944E = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(13);
        roomView.f3946F = (FansView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(13)).getChildAt(0);
        roomView.f3948G = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(14);
        roomView.f3950H = (LiveCampaignView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(15);
        roomView.f3952I = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(16);
        roomView.f3954J = (ChatView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(16)).getChildAt(0);
        roomView.f3956K = (DanmakuViewPort) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(17);
        roomView.f3958L = (IntlGiftComboView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0);
        roomView.f3960M = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        roomView.f3961N = (LiveGiftLayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2)).getChildAt(0);
        roomView.f3962O = (TopEffectLayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2)).getChildAt(1);
        roomView.f3963P = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3);
        roomView.f3964Q = (ChatInputEntryView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(0);
        roomView.f3965R = (BottomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(1);
        roomView.f3966S = (LiveBubbleView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(2);
        roomView.f3967T = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(3)).getChildAt(0);
        roomView.f3968U = (LiveGiftTrays) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        roomView.f3969V = (LiveEnterRoomView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(3)).getChildAt(1);
        roomView.f3970W = (LiveEnterRoomView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(3)).getChildAt(1);
        roomView.f3982k0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(4);
        roomView.f3988p0 = (PreOperationAnimView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(5)).getChildAt(0);
        roomView.f3945E0 = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(6);
        roomView.f3947F0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(7);
        roomView.f3949G0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(7)).getChildAt(0);
        roomView.f3951H0 = (GameEffectView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4);
        roomView.f3953I0 = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(5);
        roomView.f3955J0 = viewGroup.getChildAt(6);
    }
}
