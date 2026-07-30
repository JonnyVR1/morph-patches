package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;

/* JADX INFO: loaded from: classes13.dex */
public class tnu {
    /* JADX INFO: renamed from: a */
    public static void m189824a(LiveVChatMultipleGiftItemView liveVChatMultipleGiftItemView, View view) {
        liveVChatMultipleGiftItemView.f45311d = (LiveVChatMultipleGiftItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatMultipleGiftItemView.f45312e = (TextView) viewGroup.getChildAt(0);
        liveVChatMultipleGiftItemView.f45313f = (TextView) viewGroup.getChildAt(1);
        liveVChatMultipleGiftItemView.f45314g = (LiveMarqueeTextView) viewGroup.getChildAt(2);
        liveVChatMultipleGiftItemView.f45315h = (LiveMarqueeTextView) viewGroup.getChildAt(3);
    }
}
