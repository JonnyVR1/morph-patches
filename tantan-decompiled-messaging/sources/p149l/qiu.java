package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogBottomBar;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogContentView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogGiftsView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOperationView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class qiu {
    /* JADX INFO: renamed from: a */
    public static void m174919a(LiveVChatGiftDialogContentView liveVChatGiftDialogContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftDialogContentView.f45151d = viewGroup.getChildAt(0);
        liveVChatGiftDialogContentView.f45152e = (VDraweeView) viewGroup.getChildAt(1);
        liveVChatGiftDialogContentView.f45153f = (VDraweeView) viewGroup.getChildAt(2);
        liveVChatGiftDialogContentView.f45154g = (LiveVChatGiftDialogGiftsView) viewGroup.getChildAt(3);
        liveVChatGiftDialogContentView.f45155h = (LiveVChatGiftDialogBottomBar) viewGroup.getChildAt(4);
        liveVChatGiftDialogContentView.f45156i = (GiftDialogShadeLayer) viewGroup.getChildAt(5);
        liveVChatGiftDialogContentView.f45157j = (LiveVChatGiftOperationView) viewGroup.getChildAt(6);
    }
}
