package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.recommend.FeedGroupRecommendMomentFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class q6h {
    /* JADX INFO: renamed from: a */
    public static void m13413a(FeedGroupRecommendMomentFrag feedGroupRecommendMomentFrag, View view) {
        feedGroupRecommendMomentFrag.f1580z = (LinearLayout) view;
        feedGroupRecommendMomentFrag.f1570A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m13414b(FeedGroupRecommendMomentFrag feedGroupRecommendMomentFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11064I0, viewGroup, false);
        m13413a(feedGroupRecommendMomentFrag, viewInflate);
        return viewInflate;
    }
}
