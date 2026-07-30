package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class c3i {
    /* JADX INFO: renamed from: a */
    public static void m9092a(FeedStatusPageAct feedStatusPageAct, View view) {
        feedStatusPageAct.f4211c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStatusPageAct.f4212d = viewGroup.getChildAt(0);
        feedStatusPageAct.f4213e = viewGroup.getChildAt(1);
        feedStatusPageAct.f4214f = (DiscoveryPager) viewGroup.getChildAt(2);
        feedStatusPageAct.f4215g = viewGroup.getChildAt(3);
        feedStatusPageAct.f4216h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        feedStatusPageAct.f4217i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        feedStatusPageAct.f4218j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        feedStatusPageAct.f4219k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        feedStatusPageAct.f4220l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        feedStatusPageAct.f4221m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9093b(FeedStatusPageAct feedStatusPageAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11322v3, viewGroup, false);
        m9092a(feedStatusPageAct, viewInflate);
        return viewInflate;
    }
}
