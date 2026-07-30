package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.base.live.LiveView;
import com.p000p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.p000p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import com.p000p1.mobile.putong.live.livingroom.base.room.LiveBgView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerDragMask;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p000p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p000p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p000p1.mobile.putong.live.livingroom.common.fans.FansView;
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
import com.p000p1.mobile.putong.live.livingroom.other.obs.ObsPreviewView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jwu {
    /* JADX INFO: renamed from: a */
    public static void m16397a(LiveView liveView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveView.f3866a = (LiveBgView) viewGroup.getChildAt(0);
        liveView.f3867b = (LivePusherView) viewGroup.getChildAt(1);
        liveView.f3868c = (PreviewView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveView.f3869d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveView.f3870e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        liveView.f3871f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        liveView.f3872g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        liveView.f3873h = (ObsPreviewView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        liveView.f3874i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        liveView.f3875j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        liveView.f3876k = (AvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7)).getChildAt(0);
        liveView.f3877l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(8);
        liveView.f3878m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9);
        liveView.f3879n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9)).getChildAt(0);
        liveView.f3880o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9)).getChildAt(1);
        liveView.f3881p = (HourBoardEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9)).getChildAt(1)).getChildAt(0);
        liveView.f3882q = (HourBoardNewEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9)).getChildAt(1)).getChildAt(1);
        liveView.f3883r = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9)).getChildAt(2);
        liveView.f3884s = (StarBoardEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9)).getChildAt(2)).getChildAt(0);
        liveView.f3885t = (IntlLiveStarBoardEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9)).getChildAt(2)).getChildAt(1);
        liveView.f3886u = (FansView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(10);
        liveView.f3887v = (BulletView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(11);
        liveView.f3888w = (LiveStickerContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(12);
        liveView.f3889x = (OperationEntryView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(13);
        liveView.f3890y = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(14);
        liveView.f3891z = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15);
        liveView.f3843A = (DanmakuViewPort) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(16);
        liveView.f3844B = (ChatView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(17);
        liveView.f3845C = (LiveCampaignView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(18);
        liveView.f3846D = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(19);
        liveView.f3847E = viewGroup.getChildAt(3);
        liveView.f3848F = (LiveGiftLayer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveView.f3849G = (TopEffectLayer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        liveView.f3850H = viewGroup.getChildAt(4);
        liveView.f3851I = (ChatInputEntryView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        liveView.f3852J = (BottomView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        liveView.f3853K = (LiveBubbleView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        liveView.f3854L = (LiveGiftTrays) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3)).getChildAt(0);
        liveView.f3855M = (LiveEnterRoomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3)).getChildAt(1);
        liveView.f3856N = (LiveEnterRoomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3)).getChildAt(1);
        liveView.f3857O = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        liveView.f3858P = viewGroup.getChildAt(5);
        liveView.f3859Q = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        liveView.f3860R = (LiveStickerDragMask) viewGroup.getChildAt(6);
        liveView.f3861S = viewGroup.getChildAt(7);
        liveView.f3862T = (PreOperationAnimView) viewGroup.getChildAt(8);
        liveView.f3863U = (GameEffectView) viewGroup.getChildAt(9);
        liveView.f3864V = viewGroup.getChildAt(10);
    }
}
