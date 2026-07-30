package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.GiftWallSendGiftDialogContentView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class h0k {
    /* JADX INFO: renamed from: a */
    public static void m128964a(GiftWallSendGiftDialogContentView giftWallSendGiftDialogContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftWallSendGiftDialogContentView._close_icon = (VImage) viewGroup.getChildAt(0);
        giftWallSendGiftDialogContentView._iconBg = viewGroup.getChildAt(1);
        giftWallSendGiftDialogContentView._icon = (VDraweeView) viewGroup.getChildAt(2);
        giftWallSendGiftDialogContentView._user_icon_shadow = viewGroup.getChildAt(3);
        giftWallSendGiftDialogContentView._user_icon = (VDraweeView) viewGroup.getChildAt(4);
        giftWallSendGiftDialogContentView._name = (VText) viewGroup.getChildAt(5);
        giftWallSendGiftDialogContentView._title = (VText) viewGroup.getChildAt(6);
        giftWallSendGiftDialogContentView._subscribe = (VText) viewGroup.getChildAt(7);
        giftWallSendGiftDialogContentView._confirm = (VText) viewGroup.getChildAt(8);
        giftWallSendGiftDialogContentView._cancel = (VText) viewGroup.getChildAt(9);
        giftWallSendGiftDialogContentView._holder = viewGroup.getChildAt(10);
    }
}
