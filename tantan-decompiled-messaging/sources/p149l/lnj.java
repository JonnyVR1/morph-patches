package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogSkinView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoOfficialView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class lnj {
    /* JADX INFO: renamed from: a */
    public static void m150690a(GiftDialogContentView giftDialogContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftDialogContentView.f50268d = viewGroup.getChildAt(0);
        giftDialogContentView.f50269e = (GiftDialogSkinView) viewGroup.getChildAt(1);
        giftDialogContentView.f50270f = (VDraweeView) viewGroup.getChildAt(2);
        giftDialogContentView.f50271g = (VDraweeView) viewGroup.getChildAt(3);
        giftDialogContentView.f50272h = (Space) viewGroup.getChildAt(4);
        giftDialogContentView.f50273i = (LinearLayout) viewGroup.getChildAt(5);
        giftDialogContentView.f50274j = (ReceiveGiftUsersView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        giftDialogContentView.f50275k = (GiftUserInfoView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        giftDialogContentView.f50276l = (GiftUserInfoOfficialView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3);
        giftDialogContentView.f50277m = (GiftWealthLevelView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4);
        giftDialogContentView.f50278n = (PacketProgressView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(5);
        giftDialogContentView.f50279o = (GiftDialogGiftsView) viewGroup.getChildAt(6);
        giftDialogContentView.f50280p = (ViewStub) viewGroup.getChildAt(7);
        giftDialogContentView.f50281q = (GiftDialogBottomBar) viewGroup.getChildAt(8);
        giftDialogContentView.f50282r = (GiftDialogShadeLayer) viewGroup.getChildAt(9);
        giftDialogContentView.f50283s = (GiftOperationView) viewGroup.getChildAt(10);
    }
}
