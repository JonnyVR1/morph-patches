package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogGiftsView;
import p147v.VPager;

/* JADX INFO: loaded from: classes13.dex */
public class uiu {
    /* JADX INFO: renamed from: a */
    public static void m193960a(LiveVChatGiftDialogGiftsView liveVChatGiftDialogGiftsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftDialogGiftsView.f45161d = (FrameLayout) viewGroup.getChildAt(1);
        liveVChatGiftDialogGiftsView.f45162e = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveVChatGiftDialogGiftsView.f45163f = (VPager) viewGroup.getChildAt(2);
        liveVChatGiftDialogGiftsView.f45164g = (ViewStub) viewGroup.getChildAt(3);
    }
}
