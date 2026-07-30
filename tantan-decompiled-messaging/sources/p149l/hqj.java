package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsProgressView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import p147v.VDraweeView;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public class hqj {
    /* JADX INFO: renamed from: a */
    public static void m132455a(GiftGearsProgressView giftGearsProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftGearsProgressView.f49849a = (ConstraintLayout) viewGroup.getChildAt(0);
        giftGearsProgressView.f49850b = (LiveMarqueeTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        giftGearsProgressView.f49851c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        giftGearsProgressView.f49852d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        giftGearsProgressView.f49853e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        giftGearsProgressView.f49854f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        giftGearsProgressView.f49855g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
