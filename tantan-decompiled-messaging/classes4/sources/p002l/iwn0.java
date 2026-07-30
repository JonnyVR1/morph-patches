package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p000p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p1.mobile.putong.live.livingroom.voice.intl.root.VoiceLiveView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iwn0 {
    /* JADX INFO: renamed from: a */
    public static void m15471a(VoiceLiveView voiceLiveView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveView.d = viewGroup.getChildAt(0);
        voiceLiveView.e = viewGroup.getChildAt(1);
        voiceLiveView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceLiveView.g = viewGroup.getChildAt(2);
        voiceLiveView.h = viewGroup.getChildAt(3);
        voiceLiveView.i = viewGroup.getChildAt(4);
        voiceLiveView.j = (LiveCampaignView) viewGroup.getChildAt(5);
        voiceLiveView.k = viewGroup.getChildAt(6);
        voiceLiveView.l = viewGroup.getChildAt(7);
        voiceLiveView.m = viewGroup.getChildAt(8);
        voiceLiveView.n = viewGroup.getChildAt(9);
        voiceLiveView.o = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        voiceLiveView.p = (FrameLayout) viewGroup.getChildAt(10);
        voiceLiveView.q = viewGroup.getChildAt(11);
        voiceLiveView.r = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        voiceLiveView.s = (IntlLiveStarBoardEntryView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        voiceLiveView.t = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(2);
        voiceLiveView.u = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(3);
        voiceLiveView.v = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(4);
        voiceLiveView.w = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(5);
        voiceLiveView.x = viewGroup.getChildAt(12);
        voiceLiveView.y = (ChatListView) viewGroup.getChildAt(13);
        voiceLiveView.z = (FrameLayout) viewGroup.getChildAt(14);
        voiceLiveView.A = viewGroup.getChildAt(15);
        voiceLiveView.B = viewGroup.getChildAt(16);
        voiceLiveView.C = viewGroup.getChildAt(17);
        voiceLiveView.D = viewGroup.getChildAt(18);
        voiceLiveView.E = ((ViewGroup) viewGroup.getChildAt(18)).getChildAt(0);
        voiceLiveView.F = ((ViewGroup) viewGroup.getChildAt(18)).getChildAt(1);
        voiceLiveView.G = (LiveGiftTrays) viewGroup.getChildAt(19);
        voiceLiveView.H = (DanmakuViewPort) viewGroup.getChildAt(20);
        voiceLiveView.I = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(21)).getChildAt(0);
        voiceLiveView.J = (IntlGiftComboView) ((ViewGroup) viewGroup.getChildAt(22)).getChildAt(0);
        voiceLiveView.K = viewGroup.getChildAt(23);
        voiceLiveView.L = viewGroup.getChildAt(24);
        voiceLiveView.M = ((ViewGroup) viewGroup.getChildAt(24)).getChildAt(0);
        voiceLiveView.N = (LiveGiftLayer) ((ViewGroup) viewGroup.getChildAt(24)).getChildAt(1);
        voiceLiveView.O = (TopEffectLayer) ((ViewGroup) viewGroup.getChildAt(24)).getChildAt(2);
        voiceLiveView.P = (LiveEnterRoomView) viewGroup.getChildAt(25);
        voiceLiveView.Q = (LiveEnterRoomView) viewGroup.getChildAt(25);
        voiceLiveView.R = viewGroup.getChildAt(26);
        voiceLiveView.S = ((ViewGroup) viewGroup.getChildAt(26)).getChildAt(0);
        voiceLiveView.T = viewGroup.getChildAt(27);
        voiceLiveView.U = viewGroup.getChildAt(28);
        voiceLiveView.V = (FrameLayout) viewGroup.getChildAt(29);
    }
}
