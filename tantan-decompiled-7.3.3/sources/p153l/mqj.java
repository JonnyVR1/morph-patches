package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftTabEntranceView;
import p151v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class mqj {
    /* JADX INFO: renamed from: a */
    public static void m159514a(GiftDialogGiftsView giftDialogGiftsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftDialogGiftsView.f51139d = (ImageView) viewGroup.getChildAt(0);
        giftDialogGiftsView.f51140e = viewGroup.getChildAt(1);
        giftDialogGiftsView.f51141f = (FrameLayout) viewGroup.getChildAt(3);
        giftDialogGiftsView.f51142g = (TabLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        giftDialogGiftsView.f51143h = (GiftTabEntranceView) viewGroup.getChildAt(4);
        giftDialogGiftsView.f51144i = (VPager) viewGroup.getChildAt(5);
        giftDialogGiftsView.f51145j = (ViewStub) viewGroup.getChildAt(6);
    }
}
