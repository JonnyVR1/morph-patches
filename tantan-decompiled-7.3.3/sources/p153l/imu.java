package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsProgressView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import p151v.VDraweeView;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public class imu {
    /* JADX INFO: renamed from: a */
    public static void m140990a(LiveVChatGiftGearsProgressView liveVChatGiftGearsProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftGearsProgressView.f46143a = (ConstraintLayout) viewGroup.getChildAt(0);
        liveVChatGiftGearsProgressView.f46144b = (LiveMarqueeTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveVChatGiftGearsProgressView.f46145c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveVChatGiftGearsProgressView.f46146d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveVChatGiftGearsProgressView.f46147e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        liveVChatGiftGearsProgressView.f46148f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        liveVChatGiftGearsProgressView.f46149g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
