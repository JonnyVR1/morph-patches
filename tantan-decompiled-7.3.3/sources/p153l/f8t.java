package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView;

/* JADX INFO: loaded from: classes4.dex */
public class f8t {
    /* JADX INFO: renamed from: a */
    public static void m124562a(LiveMultipleGiftView liveMultipleGiftView, View view) {
        liveMultipleGiftView.f50713d = (LiveMultipleGiftView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveMultipleGiftView.f50714e = (MultipleGiftItemView) viewGroup.getChildAt(0);
        liveMultipleGiftView.f50715f = (MultipleGiftItemView) viewGroup.getChildAt(1);
        liveMultipleGiftView.f50716g = (MultipleGiftItemView) viewGroup.getChildAt(2);
    }
}
