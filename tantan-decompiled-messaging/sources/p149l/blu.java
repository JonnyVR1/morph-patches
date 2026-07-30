package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOuterContentView;
import p147v.VImage;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class blu {
    /* JADX INFO: renamed from: a */
    public static void m102560a(LiveVChatGiftOuterContentView liveVChatGiftOuterContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftOuterContentView.f45221d = (VPager) viewGroup.getChildAt(0);
        liveVChatGiftOuterContentView.f45222e = (VImage) viewGroup.getChildAt(1);
        liveVChatGiftOuterContentView.f45223f = (VText) viewGroup.getChildAt(2);
        liveVChatGiftOuterContentView.f45224g = (Group) viewGroup.getChildAt(3);
    }
}
