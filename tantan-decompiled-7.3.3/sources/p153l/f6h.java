package p153l;

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
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.actRender.FeedGroupDetailViewHolder;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class f6h {
    /* JADX INFO: renamed from: a */
    public static void m124274a(FeedGroupDetailViewHolder feedGroupDetailViewHolder, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupDetailViewHolder.f40908a = (VDraweeView) viewGroup.getChildAt(0);
        feedGroupDetailViewHolder.f40909b = viewGroup.getChildAt(1);
        feedGroupDetailViewHolder.f40910c = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedGroupDetailViewHolder.f40911d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        feedGroupDetailViewHolder.f40912e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        feedGroupDetailViewHolder.f40913f = (CoordinatorLayout) viewGroup.getChildAt(3);
        feedGroupDetailViewHolder.f40914g = (AppBarLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        feedGroupDetailViewHolder.f40915h = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f40916i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f40917j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        feedGroupDetailViewHolder.f40918k = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        feedGroupDetailViewHolder.f40919l = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f40920m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f40921n = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        feedGroupDetailViewHolder.f40922o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedGroupDetailViewHolder.f40923p = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        feedGroupDetailViewHolder.f40924q = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedGroupDetailViewHolder.f40925r = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        feedGroupDetailViewHolder.f40926s = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        feedGroupDetailViewHolder.f40927t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedGroupDetailViewHolder.f40928u = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        feedGroupDetailViewHolder.f40929v = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        feedGroupDetailViewHolder.f40930w = (ViewPager) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        feedGroupDetailViewHolder.f40931x = (LinearLayout) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m124275b(FeedGroupDetailViewHolder feedGroupDetailViewHolder, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173719o, viewGroup, false);
        m124274a(feedGroupDetailViewHolder, viewInflate);
        return viewInflate;
    }
}
