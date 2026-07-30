package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class opj {
    /* JADX INFO: renamed from: a */
    public static void m168676a(GiftDialogBottomBar giftDialogBottomBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftDialogBottomBar.f51109d = (GiftDialogIndicator) viewGroup.getChildAt(0);
        giftDialogBottomBar.f51110e = (VText) viewGroup.getChildAt(1);
        giftDialogBottomBar.f51111f = viewGroup.getChildAt(2);
        giftDialogBottomBar.f51112g = (TextView) viewGroup.getChildAt(3);
        giftDialogBottomBar.f51113h = (AnimEffectPlayer) viewGroup.getChildAt(4);
        giftDialogBottomBar.f51114i = (VText) viewGroup.getChildAt(5);
        giftDialogBottomBar.f51115j = (Group) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m168677b(GiftDialogBottomBar giftDialogBottomBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199109i1, viewGroup, false);
        m168676a(giftDialogBottomBar, viewInflate);
        return viewInflate;
    }
}
