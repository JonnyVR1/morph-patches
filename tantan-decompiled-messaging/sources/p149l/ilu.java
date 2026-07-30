package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.tray.LiveVChatGiftTrays;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView;

/* JADX INFO: loaded from: classes13.dex */
public class ilu {
    /* JADX INFO: renamed from: a */
    public static void m137054a(LiveVChatGiftTrays liveVChatGiftTrays, View view) {
        liveVChatGiftTrays.f45144a = (LiveVChatGiftTrays) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftTrays.f45145b = (LiveVChatGiftTrayView) viewGroup.getChildAt(0);
        liveVChatGiftTrays.f45146c = (LiveVChatGiftTrayView) viewGroup.getChildAt(1);
    }
}
