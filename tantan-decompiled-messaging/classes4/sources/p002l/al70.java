package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.recreation.pk.view.bounty.PkBountyIndicatorView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class al70 {
    /* JADX INFO: renamed from: a */
    public static void m9876a(PkBountyIndicatorView pkBountyIndicatorView, View view) {
        pkBountyIndicatorView.a = (PkBountyIndicatorView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pkBountyIndicatorView.b = (LinearLayout) viewGroup.getChildAt(0);
        pkBountyIndicatorView.c = viewGroup.getChildAt(1);
    }
}
