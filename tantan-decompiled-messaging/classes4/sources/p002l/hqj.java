package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsProgressView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hqj {
    /* JADX INFO: renamed from: a */
    public static void m14677a(GiftGearsProgressView giftGearsProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftGearsProgressView.f5891a = viewGroup.getChildAt(0);
        giftGearsProgressView.f5892b = (LiveMarqueeTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        giftGearsProgressView.f5893c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        giftGearsProgressView.f5894d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        giftGearsProgressView.f5895e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        giftGearsProgressView.f5896f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        giftGearsProgressView.f5897g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
