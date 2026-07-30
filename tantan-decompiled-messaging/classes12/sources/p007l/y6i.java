package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class y6i extends jq2<i7i> {

    /* JADX INFO: renamed from: a */
    public String f15273a;

    /* JADX INFO: renamed from: b */
    public int f15274b;

    /* JADX INFO: renamed from: c */
    public FeedTopicAggregationBaseFrag f15275c;

    /* JADX INFO: renamed from: d */
    public String f15276d;

    /* JADX INFO: renamed from: e */
    public TopicMoment f15277e;

    /* JADX INFO: renamed from: f */
    public String f15278f;

    /* JADX INFO: renamed from: g */
    public Moment f15279g;

    public y6i(mcr mcrVar) {
        super(mcrVar);
        this.f15275c = (FeedTopicAggregationBaseFrag) mcrVar;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m16949f0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m16953j0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m16954k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m16955r0() {
        ((i7i) ((jq2) this).viewModel).m10818s();
    }

    /* JADX INFO: renamed from: a0 */
    public void mo16956a0() {
        super.a0();
        creates(new e30() { // from class: l.r6i
            public final void call(Object obj) {
                y6i.m16953j0((Bundle) obj);
            }
        }, new d30() { // from class: l.s6i
            public final void call() {
                this.f12811a.m16955r0();
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m16957l0(c<List<TopicMoment>> cVar) {
        duringCreated(cVar).subscribe(mkd0.H(new e30() { // from class: l.v6i
            public final void call(Object obj) {
                this.f14079a.m16961p0((List) obj);
            }
        }, new e30() { // from class: l.w6i
            public final void call(Object obj) {
                y6i.m16949f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m16958m0(c<Boolean> cVar) {
        duringCreated(cVar).subscribe(mkd0.H(new e30() { // from class: l.t6i
            public final void call(Object obj) {
                this.f13202a.m16962q0((Boolean) obj);
            }
        }, new e30() { // from class: l.u6i
            public final void call(Object obj) {
                y6i.m16954k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m16959n0() {
        if (this.f15275c.getArguments() == null) {
            return;
        }
        this.f15276d = this.f15275c.getArguments().getString("topic_id");
        this.f15273a = this.f15275c.getArguments().getString("from");
        this.f15274b = this.f15275c.getArguments().getInt("page_type", -1);
        this.f15278f = this.f15275c.getArguments().getString("user_id");
        this.f15279g = FeedModule.f316d.m16753w7(this.f15275c.getArguments().getString("single_topic_moment"));
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m16960o0() {
        TopicMoment topicMoment = this.f15277e;
        return (topicMoment == null || "deleted".equals(topicMoment.status)) ? false : true;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m16962q0(Boolean bool) {
        ((i7i) ((jq2) this).viewModel).m10809W(bool.booleanValue());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Boolean m16963s0(TopicMoment topicMoment) {
        return Boolean.valueOf(TextUtils.equals(topicMoment.f708id, this.f15276d));
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void m16961p0(List<TopicMoment> list) {
        TopicMoment topicMoment = (TopicMoment) vwb.r(list, new w9j() { // from class: l.x6i
            public final Object call(Object obj) {
                return this.f14782a.m16963s0((TopicMoment) obj);
            }
        });
        this.f15277e = topicMoment;
        if (topicMoment != null) {
            ((i7i) ((jq2) this).viewModel).mo10808V(topicMoment);
            ((i7i) ((jq2) this).viewModel).mo10806T();
        } else if (NullChecker.a(this.f15275c.getActivity())) {
            this.f15275c.getActivity().finish();
        }
    }

    public void destroy() {
    }
}
