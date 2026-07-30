package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p051p1.mobile.putong.live.livingroom.base.room.LiveBgView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p051p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p051p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p051p1.mobile.putong.live.livingroom.common.fans.FansView;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpToRoomView;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.OfficialShowView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fg50 {
    /* JADX INFO: renamed from: a */
    public static void m125481a(OfficialShowView officialShowView, View view) {
        officialShowView.f51923a = (OfficialShowView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowView.f51924b = (LiveBgView) viewGroup.getChildAt(0);
        officialShowView.f51925c = (LivePlayerView) viewGroup.getChildAt(1);
        officialShowView.f51926d = (OfficialShowPusherView) viewGroup.getChildAt(2);
        officialShowView.f51927e = viewGroup.getChildAt(3);
        officialShowView.f51928f = viewGroup.getChildAt(4);
        officialShowView.f51929g = (OfficialShowSwitchView) viewGroup.getChildAt(5);
        officialShowView.f51930h = (VFrame) viewGroup.getChildAt(6);
        officialShowView.f51931i = (VRelative) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        officialShowView.f51932j = (JumpToRoomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        officialShowView.f51933k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        officialShowView.f51934l = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        officialShowView.f51935m = (OfficialShowAvatarView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        officialShowView.f51936n = (TouchSwallowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        officialShowView.f51937o = (OperationEntryView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        officialShowView.f51938p = (BulletView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        officialShowView.f51939q = (TouchSwallowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(5);
        officialShowView.f51940r = (FansView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        officialShowView.f51941s = (LiveCampaignView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(6);
        officialShowView.f51942t = (TouchSwallowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7);
        officialShowView.f51943u = (ChatView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7)).getChildAt(0);
        officialShowView.f51944v = (TouchSwallowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(8);
        officialShowView.f51945w = (OfficialShowPlayBillView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(8)).getChildAt(0);
        officialShowView.f51946x = (VFrame) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        officialShowView.f51947y = (DanmakuViewPort) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        officialShowView.f51948z = (LiveGiftLayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        officialShowView.f51905A = (TopEffectLayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(2);
        officialShowView.f51906B = (VFrame) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        officialShowView.f51907C = (ChatInputEntryView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(0);
        officialShowView.f51908D = (BottomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(1);
        officialShowView.f51909E = (LiveBubbleView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(2);
        officialShowView.f51910F = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        officialShowView.f51911G = (LiveGiftTrays) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        officialShowView.f51912H = (LiveEnterRoomView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        officialShowView.f51913I = (LiveEnterRoomView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        officialShowView.f51914J = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(4);
        officialShowView.f51915K = (PreOperationAnimView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(5);
        officialShowView.f51916L = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(6);
        officialShowView.f51917M = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2)).getChildAt(6)).getChildAt(0);
        officialShowView.f51918N = (GameEffectView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        officialShowView.f51919O = (VFrame) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(4);
        officialShowView.f51920P = (VRelative) viewGroup.getChildAt(7);
    }
}
