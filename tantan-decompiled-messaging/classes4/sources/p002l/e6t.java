package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e6t {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m12250a(LiveMultipleGiftView liveMultipleGiftView, View view) {
        liveMultipleGiftView.f5907d = (LiveMultipleGiftView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveMultipleGiftView.f5908e = (MultipleGiftItemView) viewGroup.getChildAt(0);
        liveMultipleGiftView.f5909f = (MultipleGiftItemView) viewGroup.getChildAt(1);
        liveMultipleGiftView.f5910g = (MultipleGiftItemView) viewGroup.getChildAt(2);
    }
}
