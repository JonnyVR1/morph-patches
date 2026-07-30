package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsProgressView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import p147v.VDraweeView;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes13.dex */
public class hku {
    /* JADX INFO: renamed from: a */
    public static void m131585a(LiveVChatGiftGearsProgressView liveVChatGiftGearsProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftGearsProgressView.f45295a = (ConstraintLayout) viewGroup.getChildAt(0);
        liveVChatGiftGearsProgressView.f45296b = (LiveMarqueeTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveVChatGiftGearsProgressView.f45297c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveVChatGiftGearsProgressView.f45298d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveVChatGiftGearsProgressView.f45299e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        liveVChatGiftGearsProgressView.f45300f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        liveVChatGiftGearsProgressView.f45301g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
