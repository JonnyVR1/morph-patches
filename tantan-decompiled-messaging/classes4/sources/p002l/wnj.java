package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftTabEntranceView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wnj {
    /* JADX INFO: renamed from: a */
    public static void m25254a(GiftDialogGiftsView giftDialogGiftsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftDialogGiftsView.f6333d = (ImageView) viewGroup.getChildAt(0);
        giftDialogGiftsView.f6334e = viewGroup.getChildAt(1);
        giftDialogGiftsView.f6335f = (FrameLayout) viewGroup.getChildAt(3);
        giftDialogGiftsView.f6336g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        giftDialogGiftsView.f6337h = (GiftTabEntranceView) viewGroup.getChildAt(4);
        giftDialogGiftsView.f6338i = viewGroup.getChildAt(5);
        giftDialogGiftsView.f6339j = (ViewStub) viewGroup.getChildAt(6);
    }
}
