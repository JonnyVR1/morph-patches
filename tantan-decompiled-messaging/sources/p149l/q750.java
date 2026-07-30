package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p046p1.mobile.putong.live.livingroom.base.room.LiveBgView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p046p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p046p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p046p1.mobile.putong.live.livingroom.common.fans.FansView;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpToRoomView;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.OfficialShowView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class q750 {
    /* JADX INFO: renamed from: a */
    public static void m173183a(OfficialShowView officialShowView, View view) {
        officialShowView.f51075a = (OfficialShowView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowView.f51076b = (LiveBgView) viewGroup.getChildAt(0);
        officialShowView.f51077c = (LivePlayerView) viewGroup.getChildAt(1);
        officialShowView.f51078d = (OfficialShowPusherView) viewGroup.getChildAt(2);
        officialShowView.f51079e = viewGroup.getChildAt(3);
        officialShowView.f51080f = viewGroup.getChildAt(4);
        officialShowView.f51081g = (OfficialShowSwitchView) viewGroup.getChildAt(5);
        officialShowView.f51082h = (VFrame) viewGroup.getChildAt(6);
        officialShowView.f51083i = (VRelative) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        officialShowView.f51084j = (JumpToRoomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        officialShowView.f51085k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        officialShowView.f51086l = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        officialShowView.f51087m = (OfficialShowAvatarView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        officialShowView.f51088n = (TouchSwallowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        officialShowView.f51089o = (OperationEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        officialShowView.f51090p = (BulletView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        officialShowView.f51091q = (TouchSwallowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(5);
        officialShowView.f51092r = (FansView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        officialShowView.f51093s = (LiveCampaignView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(6);
        officialShowView.f51094t = (TouchSwallowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7);
        officialShowView.f51095u = (ChatView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7)).getChildAt(0);
        officialShowView.f51096v = (TouchSwallowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(8);
        officialShowView.f51097w = (OfficialShowPlayBillView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(8)).getChildAt(0);
        officialShowView.f51098x = (VFrame) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        officialShowView.f51099y = (DanmakuViewPort) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        officialShowView.f51100z = (LiveGiftLayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        officialShowView.f51057A = (TopEffectLayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(2);
        officialShowView.f51058B = (VFrame) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        officialShowView.f51059C = (ChatInputEntryView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(0);
        officialShowView.f51060D = (BottomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(1);
        officialShowView.f51061E = (LiveBubbleView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(2);
        officialShowView.f51062F = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        officialShowView.f51063G = (LiveGiftTrays) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        officialShowView.f51064H = (LiveEnterRoomView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        officialShowView.f51065I = (LiveEnterRoomView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        officialShowView.f51066J = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(4);
        officialShowView.f51067K = (PreOperationAnimView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(5);
        officialShowView.f51068L = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(6);
        officialShowView.f51069M = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(6)).getChildAt(0);
        officialShowView.f51070N = (GameEffectView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        officialShowView.f51071O = (VFrame) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(4);
        officialShowView.f51072P = (VRelative) viewGroup.getChildAt(7);
    }
}
