package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationView;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p046p1.mobile.putong.live.livingroom.virtual.VoiceVirtualRoomView;
import com.p046p1.mobile.putong.live.livingroom.virtual.background.VirtualBgView;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.VirtualLeadBoardEntranceView;
import com.p046p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;
import com.p046p1.mobile.putong.live.livingroom.virtual.fans.VoiceVirtualFansView;
import com.p046p1.mobile.putong.live.livingroom.virtual.redpacket.VoiceRedPacketView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.LiveVirtualCallListBottomView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.close.VirtualVoiceCloseView;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar.VoiceVirtualRoomInfoTopBarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.BottomMenuView;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yap0 {
    /* JADX INFO: renamed from: a */
    public static void m213868a(VoiceVirtualRoomView voiceVirtualRoomView, View view) {
        voiceVirtualRoomView.f52148d = (VoiceVirtualRoomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomView.f52149e = (VirtualBgView) viewGroup.getChildAt(0);
        voiceVirtualRoomView.f52150f = (TouchSwallowView) viewGroup.getChildAt(1);
        voiceVirtualRoomView.f52151g = (VirtualVoiceCloseView) viewGroup.getChildAt(2);
        voiceVirtualRoomView.f52152h = (TouchSwallowView) viewGroup.getChildAt(3);
        voiceVirtualRoomView.f52153i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualRoomView.f52154j = (VoiceVirtualRoomInfoTopBarView) viewGroup.getChildAt(4);
        voiceVirtualRoomView.f52155k = (VirtualLeadBoardEntranceView) viewGroup.getChildAt(5);
        voiceVirtualRoomView.f52157l = (BulletView) viewGroup.getChildAt(6);
        voiceVirtualRoomView.f52158m = (FrameLayout) viewGroup.getChildAt(7);
        voiceVirtualRoomView.f52159n = (VoiceRedPacketView) viewGroup.getChildAt(8);
        voiceVirtualRoomView.f52160o = (VoiceRedPacketView) viewGroup.getChildAt(8);
        voiceVirtualRoomView.f52161p = (VFrame) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        voiceVirtualRoomView.f52163q = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0);
        voiceVirtualRoomView.f52164r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(1);
        voiceVirtualRoomView.f52165s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(2);
        voiceVirtualRoomView.f52166t = (VLinear) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        voiceVirtualRoomView.f52167u = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0);
        voiceVirtualRoomView.f52168v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(1);
        voiceVirtualRoomView.f52169w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        voiceVirtualRoomView.f52170x = (VoiceVirtualFansView) viewGroup.getChildAt(9);
        voiceVirtualRoomView.f52171y = (LiveCampaignView) viewGroup.getChildAt(10);
        voiceVirtualRoomView.f52172z = (LiveVirtualCallListBottomView) viewGroup.getChildAt(11);
        voiceVirtualRoomView.f52123A = viewGroup.getChildAt(12);
        voiceVirtualRoomView.f52124B = (TouchSwallowView) viewGroup.getChildAt(13);
        voiceVirtualRoomView.f52125C = (ChatListView) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(0);
        voiceVirtualRoomView.f52126D = (VoiceUserNotificationView) viewGroup.getChildAt(14);
        voiceVirtualRoomView.f52127E = viewGroup.getChildAt(15);
        voiceVirtualRoomView.f52129F = (TouchSwallowView) viewGroup.getChildAt(16);
        voiceVirtualRoomView.f52131G = (VirtualChatInputTipsView) ((ViewGroup) viewGroup.getChildAt(16)).getChildAt(0);
        voiceVirtualRoomView.f52132H = (TouchSwallowView) viewGroup.getChildAt(17);
        voiceVirtualRoomView.f52133I = (LiveGiftTrays) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(0);
        voiceVirtualRoomView.f52134J = (ViewStub) viewGroup.getChildAt(18);
        voiceVirtualRoomView.f52135K = (TouchSwallowView) viewGroup.getChildAt(19);
        voiceVirtualRoomView.f52136L = (VoiceBottomView) ((ViewGroup) viewGroup.getChildAt(19)).getChildAt(0);
        voiceVirtualRoomView.f52137M = (VoiceChatBottomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(19)).getChildAt(0)).getChildAt(0);
        voiceVirtualRoomView.f52138N = (BottomMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(19)).getChildAt(0)).getChildAt(1);
        voiceVirtualRoomView.f52139O = (ViewStub) viewGroup.getChildAt(20);
        voiceVirtualRoomView.f52140P = (LiveEnterRoomView) viewGroup.getChildAt(21);
        voiceVirtualRoomView.f52141Q = (LiveEnterRoomView) viewGroup.getChildAt(21);
        voiceVirtualRoomView.f52142R = (VoiceVirtualSettleSuccessView) viewGroup.getChildAt(22);
        voiceVirtualRoomView.f52143S = (FrameLayout) viewGroup.getChildAt(23);
    }
}
