package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty.PkBountyIndicatorView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty.PkHorizontalMarqueeView;

/* JADX INFO: loaded from: classes4.dex */
public class gt70 {
    /* JADX INFO: renamed from: a */
    public static void m132209a(PkBountyIndicatorView pkBountyIndicatorView, View view) {
        pkBountyIndicatorView.f52609a = (PkBountyIndicatorView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pkBountyIndicatorView.f52610b = (LinearLayout) viewGroup.getChildAt(0);
        pkBountyIndicatorView.f52611c = (PkHorizontalMarqueeView) viewGroup.getChildAt(1);
    }
}
