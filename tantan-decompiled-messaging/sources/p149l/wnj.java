package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftTabEntranceView;
import p147v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class wnj {
    /* JADX INFO: renamed from: a */
    public static void m204746a(GiftDialogGiftsView giftDialogGiftsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftDialogGiftsView.f50291d = (ImageView) viewGroup.getChildAt(0);
        giftDialogGiftsView.f50292e = viewGroup.getChildAt(1);
        giftDialogGiftsView.f50293f = (FrameLayout) viewGroup.getChildAt(3);
        giftDialogGiftsView.f50294g = (TabLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        giftDialogGiftsView.f50295h = (GiftTabEntranceView) viewGroup.getChildAt(4);
        giftDialogGiftsView.f50296i = (VPager) viewGroup.getChildAt(5);
        giftDialogGiftsView.f50297j = (ViewStub) viewGroup.getChildAt(6);
    }
}
