package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogSkinView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoOfficialView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class bqj {
    /* JADX INFO: renamed from: a */
    public static void m105943a(GiftDialogContentView giftDialogContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftDialogContentView.f51116d = viewGroup.getChildAt(0);
        giftDialogContentView.f51117e = (GiftDialogSkinView) viewGroup.getChildAt(1);
        giftDialogContentView.f51118f = (VDraweeView) viewGroup.getChildAt(2);
        giftDialogContentView.f51119g = (VDraweeView) viewGroup.getChildAt(3);
        giftDialogContentView.f51120h = (Space) viewGroup.getChildAt(4);
        giftDialogContentView.f51121i = (LinearLayout) viewGroup.getChildAt(5);
        giftDialogContentView.f51122j = (ReceiveGiftUsersView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        giftDialogContentView.f51123k = (GiftUserInfoView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        giftDialogContentView.f51124l = (GiftUserInfoOfficialView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3);
        giftDialogContentView.f51125m = (GiftWealthLevelView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4);
        giftDialogContentView.f51126n = (PacketProgressView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(5);
        giftDialogContentView.f51127o = (GiftDialogGiftsView) viewGroup.getChildAt(6);
        giftDialogContentView.f51128p = (ViewStub) viewGroup.getChildAt(7);
        giftDialogContentView.f51129q = (GiftDialogBottomBar) viewGroup.getChildAt(8);
        giftDialogContentView.f51130r = (GiftDialogShadeLayer) viewGroup.getChildAt(9);
        giftDialogContentView.f51131s = (GiftOperationView) viewGroup.getChildAt(10);
    }
}
