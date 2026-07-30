package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class n8i extends ar2<x8i> {

    /* JADX INFO: renamed from: a */
    public String f140683a;

    /* JADX INFO: renamed from: b */
    public int f140684b;

    /* JADX INFO: renamed from: c */
    public FeedTopicAggregationBaseFrag f140685c;

    /* JADX INFO: renamed from: d */
    public String f140686d;

    /* JADX INFO: renamed from: e */
    public TopicMoment f140687e;

    /* JADX INFO: renamed from: f */
    public String f140688f;

    /* JADX INFO: renamed from: g */
    public Moment f140689g;

    public n8i(ner nerVar) {
        super(nerVar);
        this.f140685c = (FeedTopicAggregationBaseFrag) nerVar;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m161927f0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m161931j0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m161932k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m161933r0() {
        ((x8i) this.viewModel).m209726s();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.g8i
            @Override // p153l.y20
            public final void call(Object obj) {
                n8i.m161931j0((Bundle) obj);
            }
        }, new x20() { // from class: l.h8i
            @Override // p153l.x20
            public final void call() {
                this.f108244a.m161933r0();
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m161934l0(C22421c<List<TopicMoment>> c22421c) {
        duringCreated(c22421c).subscribe(psd0.m173597H(new y20() { // from class: l.k8i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124385a.m161938p0((List) obj);
            }
        }, new y20() { // from class: l.l8i
            @Override // p153l.y20
            public final void call(Object obj) {
                n8i.m161927f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m161935m0(C22421c<Boolean> c22421c) {
        duringCreated(c22421c).subscribe(psd0.m173597H(new y20() { // from class: l.i8i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113347a.m161939q0((Boolean) obj);
            }
        }, new y20() { // from class: l.j8i
            @Override // p153l.y20
            public final void call(Object obj) {
                n8i.m161932k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m161936n0() {
        if (this.f140685c.getArguments() == null) {
            return;
        }
        this.f140686d = this.f140685c.getArguments().getString("topic_id");
        this.f140683a = this.f140685c.getArguments().getString("from");
        this.f140684b = this.f140685c.getArguments().getInt("page_type", -1);
        this.f140688f = this.f140685c.getArguments().getString("user_id");
        this.f140689g = FeedModule.f39703d.m145813w7(this.f140685c.getArguments().getString("single_topic_moment"));
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m161937o0() {
        TopicMoment topicMoment = this.f140687e;
        return (topicMoment == null || "deleted".equals(topicMoment.status)) ? false : true;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m161939q0(Boolean bool) {
        ((x8i) this.viewModel).m209719W(bool.booleanValue());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Boolean m161940s0(TopicMoment topicMoment) {
        return Boolean.valueOf(TextUtils.equals(topicMoment.f40095id, this.f140686d));
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void m161938p0(List<TopicMoment> list) {
        TopicMoment topicMoment = (TopicMoment) jyb.m147529r(list, new qcj() { // from class: l.m8i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f135231a.m161940s0((TopicMoment) obj);
            }
        });
        this.f140687e = topicMoment;
        if (topicMoment != null) {
            ((x8i) this.viewModel).mo127415V(topicMoment);
            ((x8i) this.viewModel).mo127414T();
        } else if (NullChecker.m82486a(this.f140685c.getActivity())) {
            this.f140685c.getActivity().finish();
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
