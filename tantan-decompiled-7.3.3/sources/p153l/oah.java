package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.aggregation.header.FeedGroupAggregationHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class oah extends r4h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public Act f145723f;

    /* JADX INFO: renamed from: g */
    public int f145724g;

    /* JADX INFO: renamed from: h */
    public List<TopicMoment> f145725h;

    /* JADX INFO: renamed from: i */
    public boolean f145726i;

    /* JADX INFO: renamed from: j */
    public y20<View> f145727j;

    /* JADX INFO: renamed from: k */
    public int f145728k;

    /* JADX INFO: renamed from: l */
    public boolean f145729l;

    /* JADX INFO: renamed from: m */
    public String f145730m;

    public oah(@NonNull List<TopicMoment> list, Act act, int i, boolean z, String str) {
        super(list);
        new ArrayList();
        this.f145723f = act;
        this.f145725h = list;
        this.f145728k = i;
        this.f145729l = z;
        this.f145730m = str;
        this.f145724g = list.size();
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, TopicMoment topicMoment, int i, int i2) {
        FeedGroupAggregationHeaderView feedGroupAggregationHeaderView = (FeedGroupAggregationHeaderView) ((ViewGroup) view).getChildAt(0);
        if (this.f145729l) {
            feedGroupAggregationHeaderView.f40819c.setTextColor(this.f145723f.getResources().getColor(k9c0.f124525p));
            feedGroupAggregationHeaderView.f40819c.setTextSize(12.0f);
            feedGroupAggregationHeaderView.f40819c.setMaxLines(1);
            feedGroupAggregationHeaderView.f40819c.setEllipsize(TextUtils.TruncateAt.END);
            feedGroupAggregationHeaderView.f40819c.setTypeface(Typeface.defaultFromStyle(1));
            feedGroupAggregationHeaderView.f40818b.setActualImageResource(lbc0.f130949U0);
            feedGroupAggregationHeaderView.f40817a.setBackgroundResource(k9c0.f124522n0);
        } else {
            feedGroupAggregationHeaderView.f40819c.setTextColor(this.f145723f.getResources().getColor(k9c0.f124519m));
            feedGroupAggregationHeaderView.f40819c.setTextSize(12.0f);
            feedGroupAggregationHeaderView.f40819c.setMaxLines(1);
            feedGroupAggregationHeaderView.f40819c.setEllipsize(TextUtils.TruncateAt.END);
            feedGroupAggregationHeaderView.f40817a.setBackgroundResource(lbc0.f131131r4);
            feedGroupAggregationHeaderView.f40819c.setTypeface(Typeface.defaultFromStyle(0));
        }
        if (topicMoment.isEnterGroup()) {
            feedGroupAggregationHeaderView.f40818b.setActualImageResource(lbc0.f131008c1);
        }
        if (!TextUtils.isEmpty(topicMoment.icon) && "live_square".equals(topicMoment.topicType)) {
            uqb0.f180374G.m127115L0(feedGroupAggregationHeaderView.f40818b, topicMoment.icon);
        }
        feedGroupAggregationHeaderView.m63085u(topicMoment, this.f145730m);
        if (NullChecker.m82486a(this.f145727j)) {
            this.f145727j.call(feedGroupAggregationHeaderView);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m166843C(List<TopicMoment> list) {
        this.f145725h = list;
    }

    /* JADX INFO: renamed from: D */
    public void m166844D(y20<View> y20Var) {
        this.f145727j = y20Var;
    }

    /* JADX INFO: renamed from: E */
    public void m166845E(boolean z) {
        this.f145726i = z;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        FeedGroupAggregationHeaderView feedGroupAggregationHeaderView = new FeedGroupAggregationHeaderView(this.f145723f);
        VFrame vFrame = new VFrame(this.f145723f);
        vFrame.addView(feedGroupAggregationHeaderView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.f145729l ? 0 : qa00.m175859d(2.0f), 0, this.f145728k);
        if (this.f145729l) {
            bnl0.m105558h0(feedGroupAggregationHeaderView.f40817a, 0);
        }
        feedGroupAggregationHeaderView.setLayoutParams(layoutParams);
        return vFrame;
    }
}
