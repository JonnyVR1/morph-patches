package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogBottomBar;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;

/* JADX INFO: loaded from: classes13.dex */
public class kiu {
    /* JADX INFO: renamed from: a */
    public static void m146134a(LiveVChatGiftDialogBottomBar liveVChatGiftDialogBottomBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftDialogBottomBar.f45148d = (ImageView) viewGroup.getChildAt(0);
        liveVChatGiftDialogBottomBar.f45149e = (TextView) viewGroup.getChildAt(1);
        liveVChatGiftDialogBottomBar.f45150f = (GiftDialogIndicator) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m146135b(LiveVChatGiftDialogBottomBar liveVChatGiftDialogBottomBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162809x1, viewGroup, false);
        m146134a(liveVChatGiftDialogBottomBar, viewInflate);
        return viewInflate;
    }
}
