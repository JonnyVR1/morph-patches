package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.FastGiftView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hig {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m14388a(FastGiftView fastGiftView, View view) {
        fastGiftView.f4548d = (FastGiftView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fastGiftView.f4549e = viewGroup.getChildAt(0);
        fastGiftView.f4550f = (FrameLayout) viewGroup.getChildAt(1);
        fastGiftView.f4551g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fastGiftView.f4552h = (NewFastGiftCountDownView) viewGroup.getChildAt(2);
        fastGiftView.f4553i = viewGroup.getChildAt(3);
        fastGiftView.f4554j = viewGroup.getChildAt(4);
    }
}
