package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.tray.LiveVChatGiftTrays;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView;

/* JADX INFO: loaded from: classes9.dex */
public class jnu {
    /* JADX INFO: renamed from: a */
    public static void m146287a(LiveVChatGiftTrays liveVChatGiftTrays, View view) {
        liveVChatGiftTrays.f45992a = (LiveVChatGiftTrays) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftTrays.f45993b = (LiveVChatGiftTrayView) viewGroup.getChildAt(0);
        liveVChatGiftTrays.f45994c = (LiveVChatGiftTrayView) viewGroup.getChildAt(1);
    }
}
