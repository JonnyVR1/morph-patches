package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogBottomBar;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogContentView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogGiftsView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOperationView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class rku {
    /* JADX INFO: renamed from: a */
    public static void m181881a(LiveVChatGiftDialogContentView liveVChatGiftDialogContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftDialogContentView.f45999d = viewGroup.getChildAt(0);
        liveVChatGiftDialogContentView.f46000e = (VDraweeView) viewGroup.getChildAt(1);
        liveVChatGiftDialogContentView.f46001f = (VDraweeView) viewGroup.getChildAt(2);
        liveVChatGiftDialogContentView.f46002g = (LiveVChatGiftDialogGiftsView) viewGroup.getChildAt(3);
        liveVChatGiftDialogContentView.f46003h = (LiveVChatGiftDialogBottomBar) viewGroup.getChildAt(4);
        liveVChatGiftDialogContentView.f46004i = (GiftDialogShadeLayer) viewGroup.getChildAt(5);
        liveVChatGiftDialogContentView.f46005j = (LiveVChatGiftOperationView) viewGroup.getChildAt(6);
    }
}
