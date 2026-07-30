package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsProgressView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import p151v.VDraweeView;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public class xsj {
    /* JADX INFO: renamed from: a */
    public static void m212986a(GiftGearsProgressView giftGearsProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftGearsProgressView.f50697a = (ConstraintLayout) viewGroup.getChildAt(0);
        giftGearsProgressView.f50698b = (LiveMarqueeTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        giftGearsProgressView.f50699c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        giftGearsProgressView.f50700d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        giftGearsProgressView.f50701e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        giftGearsProgressView.f50702f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        giftGearsProgressView.f50703g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
