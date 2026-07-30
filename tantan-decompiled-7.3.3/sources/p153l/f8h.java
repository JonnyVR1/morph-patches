package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.recommend.FeedGroupRecommendMomentFrag;

/* JADX INFO: loaded from: classes13.dex */
public class f8h {
    /* JADX INFO: renamed from: a */
    public static void m124536a(FeedGroupRecommendMomentFrag feedGroupRecommendMomentFrag, View view) {
        feedGroupRecommendMomentFrag.f40967z = (LinearLayout) view;
        feedGroupRecommendMomentFrag.f40957A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m124537b(FeedGroupRecommendMomentFrag feedGroupRecommendMomentFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173514I0, viewGroup, false);
        m124536a(feedGroupRecommendMomentFrag, viewInflate);
        return viewInflate;
    }
}
