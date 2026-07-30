package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationView;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p051p1.mobile.putong.live.livingroom.virtual.VoiceVirtualRoomView;
import com.p051p1.mobile.putong.live.livingroom.virtual.background.VirtualBgView;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.VirtualLeadBoardEntranceView;
import com.p051p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;
import com.p051p1.mobile.putong.live.livingroom.virtual.fans.VoiceVirtualFansView;
import com.p051p1.mobile.putong.live.livingroom.virtual.redpacket.VoiceRedPacketView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.LiveVirtualCallListBottomView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.close.VirtualVoiceCloseView;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar.VoiceVirtualRoomInfoTopBarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.BottomMenuView;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ckp0 {
    /* JADX INFO: renamed from: a */
    public static void m110380a(VoiceVirtualRoomView voiceVirtualRoomView, View view) {
        voiceVirtualRoomView.f52996d = (VoiceVirtualRoomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomView.f52997e = (VirtualBgView) viewGroup.getChildAt(0);
        voiceVirtualRoomView.f52998f = (TouchSwallowView) viewGroup.getChildAt(1);
        voiceVirtualRoomView.f52999g = (VirtualVoiceCloseView) viewGroup.getChildAt(2);
        voiceVirtualRoomView.f53000h = (TouchSwallowView) viewGroup.getChildAt(3);
        voiceVirtualRoomView.f53001i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualRoomView.f53002j = (VoiceVirtualRoomInfoTopBarView) viewGroup.getChildAt(4);
        voiceVirtualRoomView.f53003k = (VirtualLeadBoardEntranceView) viewGroup.getChildAt(5);
        voiceVirtualRoomView.f53005l = (BulletView) viewGroup.getChildAt(6);
        voiceVirtualRoomView.f53006m = (FrameLayout) viewGroup.getChildAt(7);
        voiceVirtualRoomView.f53007n = (VoiceRedPacketView) viewGroup.getChildAt(8);
        voiceVirtualRoomView.f53008o = (VoiceRedPacketView) viewGroup.getChildAt(8);
        voiceVirtualRoomView.f53009p = (VFrame) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        voiceVirtualRoomView.f53011q = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0);
        voiceVirtualRoomView.f53012r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(1);
        voiceVirtualRoomView.f53013s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(2);
        voiceVirtualRoomView.f53014t = (VLinear) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        voiceVirtualRoomView.f53015u = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0);
        voiceVirtualRoomView.f53016v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(1);
        voiceVirtualRoomView.f53017w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        voiceVirtualRoomView.f53018x = (VoiceVirtualFansView) viewGroup.getChildAt(9);
        voiceVirtualRoomView.f53019y = (LiveCampaignView) viewGroup.getChildAt(10);
        voiceVirtualRoomView.f53020z = (LiveVirtualCallListBottomView) viewGroup.getChildAt(11);
        voiceVirtualRoomView.f52971A = viewGroup.getChildAt(12);
        voiceVirtualRoomView.f52972B = (TouchSwallowView) viewGroup.getChildAt(13);
        voiceVirtualRoomView.f52973C = (ChatListView) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(0);
        voiceVirtualRoomView.f52974D = (VoiceUserNotificationView) viewGroup.getChildAt(14);
        voiceVirtualRoomView.f52975E = viewGroup.getChildAt(15);
        voiceVirtualRoomView.f52977F = (TouchSwallowView) viewGroup.getChildAt(16);
        voiceVirtualRoomView.f52979G = (VirtualChatInputTipsView) ((ViewGroup) viewGroup.getChildAt(16)).getChildAt(0);
        voiceVirtualRoomView.f52980H = (TouchSwallowView) viewGroup.getChildAt(17);
        voiceVirtualRoomView.f52981I = (LiveGiftTrays) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(0);
        voiceVirtualRoomView.f52982J = (ViewStub) viewGroup.getChildAt(18);
        voiceVirtualRoomView.f52983K = (TouchSwallowView) viewGroup.getChildAt(19);
        voiceVirtualRoomView.f52984L = (VoiceBottomView) ((ViewGroup) viewGroup.getChildAt(19)).getChildAt(0);
        voiceVirtualRoomView.f52985M = (VoiceChatBottomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(19)).getChildAt(0)).getChildAt(0);
        voiceVirtualRoomView.f52986N = (BottomMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(19)).getChildAt(0)).getChildAt(1);
        voiceVirtualRoomView.f52987O = (ViewStub) viewGroup.getChildAt(20);
        voiceVirtualRoomView.f52988P = (LiveEnterRoomView) viewGroup.getChildAt(21);
        voiceVirtualRoomView.f52989Q = (LiveEnterRoomView) viewGroup.getChildAt(21);
        voiceVirtualRoomView.f52990R = (VoiceVirtualSettleSuccessView) viewGroup.getChildAt(22);
        voiceVirtualRoomView.f52991S = (FrameLayout) viewGroup.getChildAt(23);
    }
}
