package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogGiftsView;
import p151v.VPager;

/* JADX INFO: loaded from: classes9.dex */
public class vku {
    /* JADX INFO: renamed from: a */
    public static void m201581a(LiveVChatGiftDialogGiftsView liveVChatGiftDialogGiftsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftDialogGiftsView.f46009d = (FrameLayout) viewGroup.getChildAt(1);
        liveVChatGiftDialogGiftsView.f46010e = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveVChatGiftDialogGiftsView.f46011f = (VPager) viewGroup.getChildAt(2);
        liveVChatGiftDialogGiftsView.f46012g = (ViewStub) viewGroup.getChildAt(3);
    }
}
