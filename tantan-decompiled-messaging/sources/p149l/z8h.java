package p149l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.aggregation.header.FeedGroupAggregationHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class z8h extends c3h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public Act f202157f;

    /* JADX INFO: renamed from: g */
    public int f202158g;

    /* JADX INFO: renamed from: h */
    public List<TopicMoment> f202159h;

    /* JADX INFO: renamed from: i */
    public boolean f202160i;

    /* JADX INFO: renamed from: j */
    public e30<View> f202161j;

    /* JADX INFO: renamed from: k */
    public int f202162k;

    /* JADX INFO: renamed from: l */
    public boolean f202163l;

    /* JADX INFO: renamed from: m */
    public String f202164m;

    public z8h(@NonNull List<TopicMoment> list, Act act, int i, boolean z, String str) {
        super(list);
        new ArrayList();
        this.f202157f = act;
        this.f202159h = list;
        this.f202162k = i;
        this.f202163l = z;
        this.f202164m = str;
        this.f202158g = list.size();
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, TopicMoment topicMoment, int i, int i2) {
        FeedGroupAggregationHeaderView feedGroupAggregationHeaderView = (FeedGroupAggregationHeaderView) ((ViewGroup) view).getChildAt(0);
        if (this.f202163l) {
            feedGroupAggregationHeaderView.f39971c.setTextColor(this.f202157f.getResources().getColor(e1c0.f88802p));
            feedGroupAggregationHeaderView.f39971c.setTextSize(12.0f);
            feedGroupAggregationHeaderView.f39971c.setMaxLines(1);
            feedGroupAggregationHeaderView.f39971c.setEllipsize(TextUtils.TruncateAt.END);
            feedGroupAggregationHeaderView.f39971c.setTypeface(Typeface.defaultFromStyle(1));
            feedGroupAggregationHeaderView.f39970b.setActualImageResource(f3c0.f94431U0);
            feedGroupAggregationHeaderView.f39969a.setBackgroundResource(e1c0.f88799n0);
        } else {
            feedGroupAggregationHeaderView.f39971c.setTextColor(this.f202157f.getResources().getColor(e1c0.f88796m));
            feedGroupAggregationHeaderView.f39971c.setTextSize(12.0f);
            feedGroupAggregationHeaderView.f39971c.setMaxLines(1);
            feedGroupAggregationHeaderView.f39971c.setEllipsize(TextUtils.TruncateAt.END);
            feedGroupAggregationHeaderView.f39969a.setBackgroundResource(f3c0.f94613r4);
            feedGroupAggregationHeaderView.f39971c.setTypeface(Typeface.defaultFromStyle(0));
        }
        if (topicMoment.isEnterGroup()) {
            feedGroupAggregationHeaderView.f39970b.setActualImageResource(f3c0.f94490c1);
        }
        if (!TextUtils.isEmpty(topicMoment.icon) && "live_square".equals(topicMoment.topicType)) {
            qib0.f154691G.m102331L0(feedGroupAggregationHeaderView.f39970b, topicMoment.icon);
        }
        feedGroupAggregationHeaderView.m61902u(topicMoment, this.f202164m);
        if (NullChecker.m81303a(this.f202161j)) {
            this.f202161j.call(feedGroupAggregationHeaderView);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m217597C(List<TopicMoment> list) {
        this.f202159h = list;
    }

    /* JADX INFO: renamed from: D */
    public void m217598D(e30<View> e30Var) {
        this.f202161j = e30Var;
    }

    /* JADX INFO: renamed from: E */
    public void m217599E(boolean z) {
        this.f202160i = z;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        FeedGroupAggregationHeaderView feedGroupAggregationHeaderView = new FeedGroupAggregationHeaderView(this.f202157f);
        VFrame vFrame = new VFrame(this.f202157f);
        vFrame.addView(feedGroupAggregationHeaderView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.f202163l ? 0 : t100.m186890d(2.0f), 0, this.f202162k);
        if (this.f202163l) {
            xdl0.m208378h0(feedGroupAggregationHeaderView.f39969a, 0);
        }
        feedGroupAggregationHeaderView.setLayoutParams(layoutParams);
        return vFrame;
    }
}
