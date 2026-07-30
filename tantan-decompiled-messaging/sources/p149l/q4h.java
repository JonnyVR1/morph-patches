package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.actRender.FeedGroupDetailViewHolder;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class q4h {
    /* JADX INFO: renamed from: a */
    public static void m172934a(FeedGroupDetailViewHolder feedGroupDetailViewHolder, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupDetailViewHolder.f40060a = (VDraweeView) viewGroup.getChildAt(0);
        feedGroupDetailViewHolder.f40061b = viewGroup.getChildAt(1);
        feedGroupDetailViewHolder.f40062c = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedGroupDetailViewHolder.f40063d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        feedGroupDetailViewHolder.f40064e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        feedGroupDetailViewHolder.f40065f = (CoordinatorLayout) viewGroup.getChildAt(3);
        feedGroupDetailViewHolder.f40066g = (AppBarLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        feedGroupDetailViewHolder.f40067h = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f40068i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f40069j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        feedGroupDetailViewHolder.f40070k = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        feedGroupDetailViewHolder.f40071l = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f40072m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f40073n = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        feedGroupDetailViewHolder.f40074o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedGroupDetailViewHolder.f40075p = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        feedGroupDetailViewHolder.f40076q = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedGroupDetailViewHolder.f40077r = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        feedGroupDetailViewHolder.f40078s = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        feedGroupDetailViewHolder.f40079t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedGroupDetailViewHolder.f40080u = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        feedGroupDetailViewHolder.f40081v = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        feedGroupDetailViewHolder.f40082w = (ViewPager) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        feedGroupDetailViewHolder.f40083x = (LinearLayout) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m172935b(FeedGroupDetailViewHolder feedGroupDetailViewHolder, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142250o, viewGroup, false);
        m172934a(feedGroupDetailViewHolder, viewInflate);
        return viewInflate;
    }
}
