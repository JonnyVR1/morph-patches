package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.FastGiftView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vjg {
    /* JADX INFO: renamed from: a */
    public static void m201504a(FastGiftView fastGiftView, View view) {
        fastGiftView.f49354d = (FastGiftView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fastGiftView.f49355e = (VText) viewGroup.getChildAt(0);
        fastGiftView.f49356f = (FrameLayout) viewGroup.getChildAt(1);
        fastGiftView.f49357g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fastGiftView.f49358h = (NewFastGiftCountDownView) viewGroup.getChildAt(2);
        fastGiftView.f49359i = (VText) viewGroup.getChildAt(3);
        fastGiftView.f49360j = viewGroup.getChildAt(4);
    }
}
