package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty.PkBountyIndicatorView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty.PkHorizontalMarqueeView;

/* JADX INFO: loaded from: classes4.dex */
public class al70 {
    /* JADX INFO: renamed from: a */
    public static void m97277a(PkBountyIndicatorView pkBountyIndicatorView, View view) {
        pkBountyIndicatorView.f51761a = (PkBountyIndicatorView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pkBountyIndicatorView.f51762b = (LinearLayout) viewGroup.getChildAt(0);
        pkBountyIndicatorView.f51763c = (PkHorizontalMarqueeView) viewGroup.getChildAt(1);
    }
}
