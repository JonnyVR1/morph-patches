package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.recommend.FeedGroupRecommendMomentFrag;

/* JADX INFO: loaded from: classes12.dex */
public class q6h {
    /* JADX INFO: renamed from: a */
    public static void m173130a(FeedGroupRecommendMomentFrag feedGroupRecommendMomentFrag, View view) {
        feedGroupRecommendMomentFrag.f40119z = (LinearLayout) view;
        feedGroupRecommendMomentFrag.f40109A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m173131b(FeedGroupRecommendMomentFrag feedGroupRecommendMomentFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142045I0, viewGroup, false);
        m173130a(feedGroupRecommendMomentFrag, viewInflate);
        return viewInflate;
    }
}
