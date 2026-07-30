package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.FastGiftView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hig {
    /* JADX INFO: renamed from: a */
    public static void m131253a(FastGiftView fastGiftView, View view) {
        fastGiftView.f48506d = (FastGiftView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fastGiftView.f48507e = (VText) viewGroup.getChildAt(0);
        fastGiftView.f48508f = (FrameLayout) viewGroup.getChildAt(1);
        fastGiftView.f48509g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fastGiftView.f48510h = (NewFastGiftCountDownView) viewGroup.getChildAt(2);
        fastGiftView.f48511i = (VText) viewGroup.getChildAt(3);
        fastGiftView.f48512j = viewGroup.getChildAt(4);
    }
}
