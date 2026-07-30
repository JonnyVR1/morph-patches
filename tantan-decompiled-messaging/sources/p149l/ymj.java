package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ymj {
    /* JADX INFO: renamed from: a */
    public static void m215362a(GiftDialogBottomBar giftDialogBottomBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftDialogBottomBar.f50261d = (GiftDialogIndicator) viewGroup.getChildAt(0);
        giftDialogBottomBar.f50262e = (VText) viewGroup.getChildAt(1);
        giftDialogBottomBar.f50263f = viewGroup.getChildAt(2);
        giftDialogBottomBar.f50264g = (TextView) viewGroup.getChildAt(3);
        giftDialogBottomBar.f50265h = (AnimEffectPlayer) viewGroup.getChildAt(4);
        giftDialogBottomBar.f50266i = (VText) viewGroup.getChildAt(5);
        giftDialogBottomBar.f50267j = (Group) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m215363b(GiftDialogBottomBar giftDialogBottomBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168377i1, viewGroup, false);
        m215362a(giftDialogBottomBar, viewInflate);
        return viewInflate;
    }
}
