package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationView;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p1.mobile.putong.live.livingroom.virtual.VoiceVirtualRoomView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yap0 {
    /* JADX INFO: renamed from: a */
    public static void m26493a(VoiceVirtualRoomView voiceVirtualRoomView, View view) {
        voiceVirtualRoomView.d = (VoiceVirtualRoomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomView.e = viewGroup.getChildAt(0);
        voiceVirtualRoomView.f = viewGroup.getChildAt(1);
        voiceVirtualRoomView.g = viewGroup.getChildAt(2);
        voiceVirtualRoomView.h = viewGroup.getChildAt(3);
        voiceVirtualRoomView.i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualRoomView.j = viewGroup.getChildAt(4);
        voiceVirtualRoomView.k = viewGroup.getChildAt(5);
        voiceVirtualRoomView.l = (BulletView) viewGroup.getChildAt(6);
        voiceVirtualRoomView.m = (FrameLayout) viewGroup.getChildAt(7);
        voiceVirtualRoomView.n = viewGroup.getChildAt(8);
        voiceVirtualRoomView.o = viewGroup.getChildAt(8);
        voiceVirtualRoomView.p = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        voiceVirtualRoomView.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0);
        voiceVirtualRoomView.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(1);
        voiceVirtualRoomView.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(2);
        voiceVirtualRoomView.t = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        voiceVirtualRoomView.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0);
        voiceVirtualRoomView.v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(1);
        voiceVirtualRoomView.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        voiceVirtualRoomView.x = viewGroup.getChildAt(9);
        voiceVirtualRoomView.y = (LiveCampaignView) viewGroup.getChildAt(10);
        voiceVirtualRoomView.z = viewGroup.getChildAt(11);
        voiceVirtualRoomView.A = viewGroup.getChildAt(12);
        voiceVirtualRoomView.B = viewGroup.getChildAt(13);
        voiceVirtualRoomView.C = (ChatListView) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(0);
        voiceVirtualRoomView.D = (VoiceUserNotificationView) viewGroup.getChildAt(14);
        voiceVirtualRoomView.E = viewGroup.getChildAt(15);
        voiceVirtualRoomView.F = viewGroup.getChildAt(16);
        voiceVirtualRoomView.G = ((ViewGroup) viewGroup.getChildAt(16)).getChildAt(0);
        voiceVirtualRoomView.H = viewGroup.getChildAt(17);
        voiceVirtualRoomView.I = (LiveGiftTrays) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(0);
        voiceVirtualRoomView.J = (ViewStub) viewGroup.getChildAt(18);
        voiceVirtualRoomView.K = viewGroup.getChildAt(19);
        voiceVirtualRoomView.L = ((ViewGroup) viewGroup.getChildAt(19)).getChildAt(0);
        voiceVirtualRoomView.M = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(19)).getChildAt(0)).getChildAt(0);
        voiceVirtualRoomView.N = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(19)).getChildAt(0)).getChildAt(1);
        voiceVirtualRoomView.O = (ViewStub) viewGroup.getChildAt(20);
        voiceVirtualRoomView.P = (LiveEnterRoomView) viewGroup.getChildAt(21);
        voiceVirtualRoomView.Q = (LiveEnterRoomView) viewGroup.getChildAt(21);
        voiceVirtualRoomView.R = viewGroup.getChildAt(22);
        voiceVirtualRoomView.S = (FrameLayout) viewGroup.getChildAt(23);
    }
}
