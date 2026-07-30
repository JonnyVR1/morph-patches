package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ymj {
    /* JADX INFO: renamed from: a */
    public static void m26811a(GiftDialogBottomBar giftDialogBottomBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftDialogBottomBar.f6303d = (GiftDialogIndicator) viewGroup.getChildAt(0);
        giftDialogBottomBar.f6304e = viewGroup.getChildAt(1);
        giftDialogBottomBar.f6305f = viewGroup.getChildAt(2);
        giftDialogBottomBar.f6306g = (TextView) viewGroup.getChildAt(3);
        giftDialogBottomBar.f6307h = viewGroup.getChildAt(4);
        giftDialogBottomBar.f6308i = viewGroup.getChildAt(5);
        giftDialogBottomBar.f6309j = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m26812b(GiftDialogBottomBar giftDialogBottomBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19873i1, viewGroup, false);
        m26811a(giftDialogBottomBar, viewInflate);
        return viewInflate;
    }
}
