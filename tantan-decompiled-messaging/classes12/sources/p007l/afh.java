package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedMomentDetailToolBarView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class afh {
    /* JADX INFO: renamed from: a */
    public static void m8537a(FeedMomentDetailToolBarView feedMomentDetailToolBarView, View view) {
        feedMomentDetailToolBarView.f2343a = (FeedMomentDetailToolBarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentDetailToolBarView.f2344b = viewGroup.getChildAt(0);
        feedMomentDetailToolBarView.f2345c = viewGroup.getChildAt(1);
        feedMomentDetailToolBarView.f2346d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedMomentDetailToolBarView.f2347e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedMomentDetailToolBarView.f2348f = (TextView) viewGroup.getChildAt(2);
        feedMomentDetailToolBarView.f2349g = viewGroup.getChildAt(3);
    }
}
