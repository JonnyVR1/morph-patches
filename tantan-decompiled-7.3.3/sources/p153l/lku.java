package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogBottomBar;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;

/* JADX INFO: loaded from: classes9.dex */
public class lku {
    /* JADX INFO: renamed from: a */
    public static void m154655a(LiveVChatGiftDialogBottomBar liveVChatGiftDialogBottomBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftDialogBottomBar.f45996d = (ImageView) viewGroup.getChildAt(0);
        liveVChatGiftDialogBottomBar.f45997e = (TextView) viewGroup.getChildAt(1);
        liveVChatGiftDialogBottomBar.f45998f = (GiftDialogIndicator) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m154656b(LiveVChatGiftDialogBottomBar liveVChatGiftDialogBottomBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193923x1, viewGroup, false);
        m154655a(liveVChatGiftDialogBottomBar, viewInflate);
        return viewInflate;
    }
}
