package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;

/* JADX INFO: loaded from: classes9.dex */
public class upu {
    /* JADX INFO: renamed from: a */
    public static void m197189a(LiveVChatMultipleGiftItemView liveVChatMultipleGiftItemView, View view) {
        liveVChatMultipleGiftItemView.f46159d = (LiveVChatMultipleGiftItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatMultipleGiftItemView.f46160e = (TextView) viewGroup.getChildAt(0);
        liveVChatMultipleGiftItemView.f46161f = (TextView) viewGroup.getChildAt(1);
        liveVChatMultipleGiftItemView.f46162g = (LiveMarqueeTextView) viewGroup.getChildAt(2);
        liveVChatMultipleGiftItemView.f46163h = (LiveMarqueeTextView) viewGroup.getChildAt(3);
    }
}
