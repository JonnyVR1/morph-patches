package p007l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.aggregation.header.FeedGroupAggregationHeaderView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.qib0;
import l.t100;
import l.xdl0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z8h extends c3h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public Act f15649f;

    /* JADX INFO: renamed from: g */
    public int f15650g;

    /* JADX INFO: renamed from: h */
    public List<TopicMoment> f15651h;

    /* JADX INFO: renamed from: i */
    public boolean f15652i;

    /* JADX INFO: renamed from: j */
    public e30<View> f15653j;

    /* JADX INFO: renamed from: k */
    public int f15654k;

    /* JADX INFO: renamed from: l */
    public boolean f15655l;

    /* JADX INFO: renamed from: m */
    public String f15656m;

    public z8h(@NonNull List<TopicMoment> list, Act act, int i, boolean z, String str) {
        super(list);
        new ArrayList();
        this.f15649f = act;
        this.f15651h = list;
        this.f15654k = i;
        this.f15655l = z;
        this.f15656m = str;
        this.f15650g = list.size();
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void m17272j(View view, TopicMoment topicMoment, int i, int i2) {
        FeedGroupAggregationHeaderView feedGroupAggregationHeaderView = (FeedGroupAggregationHeaderView) ((ViewGroup) view).getChildAt(0);
        if (this.f15655l) {
            feedGroupAggregationHeaderView.f1432c.setTextColor(this.f15649f.getResources().getColor(e1c0.f7158p));
            feedGroupAggregationHeaderView.f1432c.setTextSize(12.0f);
            feedGroupAggregationHeaderView.f1432c.setMaxLines(1);
            feedGroupAggregationHeaderView.f1432c.setEllipsize(TextUtils.TruncateAt.END);
            feedGroupAggregationHeaderView.f1432c.setTypeface(Typeface.defaultFromStyle(1));
            feedGroupAggregationHeaderView.f1431b.setActualImageResource(f3c0.f7714U0);
            feedGroupAggregationHeaderView.f1430a.setBackgroundResource(e1c0.f7155n0);
        } else {
            feedGroupAggregationHeaderView.f1432c.setTextColor(this.f15649f.getResources().getColor(e1c0.f7152m));
            feedGroupAggregationHeaderView.f1432c.setTextSize(12.0f);
            feedGroupAggregationHeaderView.f1432c.setMaxLines(1);
            feedGroupAggregationHeaderView.f1432c.setEllipsize(TextUtils.TruncateAt.END);
            feedGroupAggregationHeaderView.f1430a.setBackgroundResource(f3c0.f7896r4);
            feedGroupAggregationHeaderView.f1432c.setTypeface(Typeface.defaultFromStyle(0));
        }
        if (topicMoment.isEnterGroup()) {
            feedGroupAggregationHeaderView.f1431b.setActualImageResource(f3c0.f7773c1);
        }
        if (!TextUtils.isEmpty(topicMoment.icon) && "live_square".equals(topicMoment.topicType)) {
            qib0.G.L0(feedGroupAggregationHeaderView.f1431b, topicMoment.icon);
        }
        feedGroupAggregationHeaderView.m2872u(topicMoment, this.f15656m);
        if (NullChecker.a(this.f15653j)) {
            this.f15653j.call(feedGroupAggregationHeaderView);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m17269C(List<TopicMoment> list) {
        this.f15651h = list;
    }

    /* JADX INFO: renamed from: D */
    public void m17270D(e30<View> e30Var) {
        this.f15653j = e30Var;
    }

    /* JADX INFO: renamed from: E */
    public void m17271E(boolean z) {
        this.f15652i = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.group.aggregation.header.FeedGroupAggregationHeaderView] */
    /* JADX INFO: renamed from: m */
    public View m17273m(ViewGroup viewGroup, int i) {
        ?? feedGroupAggregationHeaderView = new FeedGroupAggregationHeaderView(this.f15649f);
        VFrame vFrame = new VFrame(this.f15649f);
        vFrame.addView(feedGroupAggregationHeaderView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.f15655l ? 0 : t100.d(2.0f), 0, this.f15654k);
        if (this.f15655l) {
            xdl0.h0(feedGroupAggregationHeaderView.f1430a, 0);
        }
        feedGroupAggregationHeaderView.setLayoutParams(layoutParams);
        return vFrame;
    }
}
