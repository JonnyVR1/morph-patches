package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class y6i extends jq2<i7i> {

    /* JADX INFO: renamed from: a */
    public String f196562a;

    /* JADX INFO: renamed from: b */
    public int f196563b;

    /* JADX INFO: renamed from: c */
    public FeedTopicAggregationBaseFrag f196564c;

    /* JADX INFO: renamed from: d */
    public String f196565d;

    /* JADX INFO: renamed from: e */
    public TopicMoment f196566e;

    /* JADX INFO: renamed from: f */
    public String f196567f;

    /* JADX INFO: renamed from: g */
    public Moment f196568g;

    public y6i(mcr mcrVar) {
        super(mcrVar);
        this.f196564c = (FeedTopicAggregationBaseFrag) mcrVar;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m213130f0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m213134j0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m213135k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m213136r0() {
        ((i7i) this.viewModel).m134897s();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.r6i
            @Override // p149l.e30
            public final void call(Object obj) {
                y6i.m213134j0((Bundle) obj);
            }
        }, new d30() { // from class: l.s6i
            @Override // p149l.d30
            public final void call() {
                this.f162825a.m213136r0();
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m213137l0(C22306c<List<TopicMoment>> c22306c) {
        duringCreated(c22306c).subscribe(mkd0.m154956H(new e30() { // from class: l.v6i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180192a.m213141p0((List) obj);
            }
        }, new e30() { // from class: l.w6i
            @Override // p149l.e30
            public final void call(Object obj) {
                y6i.m213130f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m213138m0(C22306c<Boolean> c22306c) {
        duringCreated(c22306c).subscribe(mkd0.m154956H(new e30() { // from class: l.t6i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168616a.m213142q0((Boolean) obj);
            }
        }, new e30() { // from class: l.u6i
            @Override // p149l.e30
            public final void call(Object obj) {
                y6i.m213135k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m213139n0() {
        if (this.f196564c.getArguments() == null) {
            return;
        }
        this.f196565d = this.f196564c.getArguments().getString("topic_id");
        this.f196562a = this.f196564c.getArguments().getString("from");
        this.f196563b = this.f196564c.getArguments().getInt("page_type", -1);
        this.f196567f = this.f196564c.getArguments().getString("user_id");
        this.f196568g = FeedModule.f38855d.m209572w7(this.f196564c.getArguments().getString("single_topic_moment"));
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m213140o0() {
        TopicMoment topicMoment = this.f196566e;
        return (topicMoment == null || "deleted".equals(topicMoment.status)) ? false : true;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m213142q0(Boolean bool) {
        ((i7i) this.viewModel).m134889W(bool.booleanValue());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Boolean m213143s0(TopicMoment topicMoment) {
        return Boolean.valueOf(TextUtils.equals(topicMoment.f39247id, this.f196565d));
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void m213141p0(List<TopicMoment> list) {
        TopicMoment topicMoment = (TopicMoment) vwb.m200346r(list, new w9j() { // from class: l.x6i
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f191246a.m213143s0((TopicMoment) obj);
            }
        });
        this.f196566e = topicMoment;
        if (topicMoment != null) {
            ((i7i) this.viewModel).mo134888V(topicMoment);
            ((i7i) this.viewModel).mo134886T();
        } else if (NullChecker.m81303a(this.f196564c.getActivity())) {
            this.f196564c.getActivity().finish();
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
