package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedTopicFlowView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.e30;
import l.t100;
import l.vwb;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dqg {

    /* JADX INFO: renamed from: l.dqg$a */
    public static final class C2364a {

        /* JADX INFO: renamed from: a */
        public Act f7030a;

        /* JADX INFO: renamed from: b */
        public List<TopicMoment> f7031b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f7032c;

        /* JADX INFO: renamed from: d */
        public String f7033d;

        /* JADX INFO: renamed from: e */
        public e30<View> f7034e;

        /* JADX INFO: renamed from: f */
        public boolean f7035f;

        /* JADX INFO: renamed from: g */
        public String f7036g;

        public C2364a(Act act, List<TopicMoment> list, ViewGroup viewGroup) {
            this.f7031b = list;
            this.f7032c = viewGroup;
            this.f7030a = act;
        }

        /* JADX INFO: renamed from: h */
        public View m9560h() {
            return dqg.m9552b(this);
        }

        /* JADX INFO: renamed from: i */
        public C2364a m9561i(String str) {
            this.f7036g = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2364a m9562j(String str) {
            this.f7033d = str;
            return this;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedTopicFlowView] */
    /* JADX INFO: renamed from: a */
    public static FeedTopicFlowView m9551a(Act act, List<TopicMoment> list, String str, e30<View> e30Var, boolean z, String str2) {
        ?? feedTopicFlowView = new FeedTopicFlowView(act);
        feedTopicFlowView.setOnViewRender(e30Var);
        feedTopicFlowView.m5684B(act, list, str, t100.d(2.0f), z, str2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(t100.d(12.0f), z ? 0 : t100.d(8.0f), t100.d(16.0f), 0);
        feedTopicFlowView.setLayoutParams(layoutParams);
        return feedTopicFlowView;
    }

    /* JADX INFO: renamed from: b */
    public static View m9552b(C2364a c2364a) {
        if (vwb.J(c2364a.f7031b) || (c2364a.f7030a instanceof QATopicAggregationActivity)) {
            return null;
        }
        VFrame vFrameM9551a = m9551a(c2364a.f7030a, c2364a.f7031b, c2364a.f7033d, c2364a.f7034e, c2364a.f7035f, c2364a.f7036g);
        c2364a.f7032c.addView(vFrameM9551a);
        return vFrameM9551a;
    }
}
