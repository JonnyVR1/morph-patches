package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogSkinView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoOfficialView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lnj {
    /* JADX INFO: renamed from: a */
    public static void m17326a(GiftDialogContentView giftDialogContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftDialogContentView.f6310d = viewGroup.getChildAt(0);
        giftDialogContentView.f6311e = (GiftDialogSkinView) viewGroup.getChildAt(1);
        giftDialogContentView.f6312f = viewGroup.getChildAt(2);
        giftDialogContentView.f6313g = viewGroup.getChildAt(3);
        giftDialogContentView.f6314h = (Space) viewGroup.getChildAt(4);
        giftDialogContentView.f6315i = (LinearLayout) viewGroup.getChildAt(5);
        giftDialogContentView.f6316j = (ReceiveGiftUsersView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        giftDialogContentView.f6317k = (GiftUserInfoView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        giftDialogContentView.f6318l = (GiftUserInfoOfficialView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3);
        giftDialogContentView.f6319m = (GiftWealthLevelView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4);
        giftDialogContentView.f6320n = (PacketProgressView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(5);
        giftDialogContentView.f6321o = (GiftDialogGiftsView) viewGroup.getChildAt(6);
        giftDialogContentView.f6322p = (ViewStub) viewGroup.getChildAt(7);
        giftDialogContentView.f6323q = (GiftDialogBottomBar) viewGroup.getChildAt(8);
        giftDialogContentView.f6324r = (GiftDialogShadeLayer) viewGroup.getChildAt(9);
        giftDialogContentView.f6325s = (GiftOperationView) viewGroup.getChildAt(10);
    }
}
