package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedTopicFlowView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class dqg {

    /* JADX INFO: renamed from: l.dqg$a */
    public static final class C16433a {

        /* JADX INFO: renamed from: a */
        public Act f87412a;

        /* JADX INFO: renamed from: b */
        public List<TopicMoment> f87413b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f87414c;

        /* JADX INFO: renamed from: d */
        public String f87415d;

        /* JADX INFO: renamed from: e */
        public e30<View> f87416e;

        /* JADX INFO: renamed from: f */
        public boolean f87417f;

        /* JADX INFO: renamed from: g */
        public String f87418g;

        public C16433a(Act act, List<TopicMoment> list, ViewGroup viewGroup) {
            this.f87413b = list;
            this.f87414c = viewGroup;
            this.f87412a = act;
        }

        /* JADX INFO: renamed from: h */
        public View m113062h() {
            return dqg.m113054b(this);
        }

        /* JADX INFO: renamed from: i */
        public C16433a m113063i(String str) {
            this.f87418g = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C16433a m113064j(String str) {
            this.f87415d = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static FeedTopicFlowView m113053a(Act act, List<TopicMoment> list, String str, e30<View> e30Var, boolean z, String str2) {
        FeedTopicFlowView feedTopicFlowView = new FeedTopicFlowView(act);
        feedTopicFlowView.setOnViewRender(e30Var);
        feedTopicFlowView.m64590B(act, list, str, t100.m186890d(2.0f), z, str2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(t100.m186890d(12.0f), z ? 0 : t100.m186890d(8.0f), t100.m186890d(16.0f), 0);
        feedTopicFlowView.setLayoutParams(layoutParams);
        return feedTopicFlowView;
    }

    /* JADX INFO: renamed from: b */
    public static View m113054b(C16433a c16433a) {
        if (vwb.m200296J(c16433a.f87413b) || (c16433a.f87412a instanceof QATopicAggregationActivity)) {
            return null;
        }
        FeedTopicFlowView feedTopicFlowViewM113053a = m113053a(c16433a.f87412a, c16433a.f87413b, c16433a.f87415d, c16433a.f87416e, c16433a.f87417f, c16433a.f87418g);
        c16433a.f87414c.addView(feedTopicFlowViewM113053a);
        return feedTopicFlowViewM113053a;
    }
}
