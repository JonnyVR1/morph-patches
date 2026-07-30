package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedTopicFlowView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class srg {

    /* JADX INFO: renamed from: l.srg$a */
    public static final class C20137a {

        /* JADX INFO: renamed from: a */
        public Act f170330a;

        /* JADX INFO: renamed from: b */
        public List<TopicMoment> f170331b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f170332c;

        /* JADX INFO: renamed from: d */
        public String f170333d;

        /* JADX INFO: renamed from: e */
        public y20<View> f170334e;

        /* JADX INFO: renamed from: f */
        public boolean f170335f;

        /* JADX INFO: renamed from: g */
        public String f170336g;

        public C20137a(Act act, List<TopicMoment> list, ViewGroup viewGroup) {
            this.f170331b = list;
            this.f170332c = viewGroup;
            this.f170330a = act;
        }

        /* JADX INFO: renamed from: h */
        public View m187611h() {
            return srg.m187603b(this);
        }

        /* JADX INFO: renamed from: i */
        public C20137a m187612i(String str) {
            this.f170336g = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C20137a m187613j(String str) {
            this.f170333d = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static FeedTopicFlowView m187602a(Act act, List<TopicMoment> list, String str, y20<View> y20Var, boolean z, String str2) {
        FeedTopicFlowView feedTopicFlowView = new FeedTopicFlowView(act);
        feedTopicFlowView.setOnViewRender(y20Var);
        feedTopicFlowView.m65773B(act, list, str, qa00.m175859d(2.0f), z, str2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(qa00.m175859d(12.0f), z ? 0 : qa00.m175859d(8.0f), qa00.m175859d(16.0f), 0);
        feedTopicFlowView.setLayoutParams(layoutParams);
        return feedTopicFlowView;
    }

    /* JADX INFO: renamed from: b */
    public static View m187603b(C20137a c20137a) {
        if (jyb.m147479J(c20137a.f170331b) || (c20137a.f170330a instanceof QATopicAggregationActivity)) {
            return null;
        }
        FeedTopicFlowView feedTopicFlowViewM187602a = m187602a(c20137a.f170330a, c20137a.f170331b, c20137a.f170333d, c20137a.f170334e, c20137a.f170335f, c20137a.f170336g);
        c20137a.f170332c.addView(feedTopicFlowViewM187602a);
        return feedTopicFlowViewM187602a;
    }
}
