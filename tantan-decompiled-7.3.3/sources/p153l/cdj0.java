package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class cdj0 extends ar2<ldj0> {

    /* JADX INFO: renamed from: a */
    public ucj0 f81224a;

    /* JADX INFO: renamed from: b */
    public TopicVoteAggregationFeedFrag f81225b;

    /* JADX INFO: renamed from: c */
    public String f81226c;

    /* JADX INFO: renamed from: d */
    public String f81227d;

    /* JADX INFO: renamed from: e */
    public String f81228e;

    /* JADX INFO: renamed from: f */
    public int f81229f;

    /* JADX INFO: renamed from: g */
    public String f81230g;

    /* JADX INFO: renamed from: h */
    public String f81231h;

    /* JADX INFO: renamed from: i */
    public TopicMoment f81232i;

    /* JADX INFO: renamed from: j */
    public Links f81233j;

    /* JADX INFO: renamed from: k */
    public boolean f81234k;

    /* JADX INFO: renamed from: l */
    public List<MomentMessage> f81235l;

    /* JADX INFO: renamed from: m */
    public y20<MomentMessage> f81236m;

    public cdj0(ner nerVar) {
        super(nerVar);
        this.f81229f = -1;
        this.f81235l = new LinkedList();
        this.f81236m = new y20() { // from class: l.vcj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183467a.m109218r0((MomentMessage) obj);
            }
        };
        this.f81225b = (TopicVoteAggregationFeedFrag) nerVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m109208q0(Throwable th) {
        bsj0.m106246D(th);
        this.f81225b.m21598s4();
    }

    /* JADX INFO: renamed from: A0 */
    public void m109209A0(final MomentMessage momentMessage) {
        int iM147476G = jyb.m147476G(this.f81235l, new qcj() { // from class: l.bdj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(momentMessage.f56856id.equals(((MomentMessage) obj).f56856id));
            }
        });
        if (iM147476G != -1) {
            this.f81235l.remove(iM147476G);
            ((ldj0) this.viewModel).m153764C(momentMessage);
        }
        ((ldj0) this.viewModel).m153765E(this.f81235l);
    }

    /* JADX INFO: renamed from: C0 */
    public void m109210C0(final MomentMessage momentMessage) {
        if (!TextUtils.isEmpty(this.f81230g)) {
            momentMessage.parentCommentId = this.f81231h;
            momentMessage.api_only_otherUser = this.f81230g;
        }
        ((ldj0) this.viewModel).m153771K();
        duringCreated(this.f81224a.m195406H(momentMessage)).subscribe(psd0.m173597H(new y20() { // from class: l.zcj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203796a.m109220t0(momentMessage, (MomentMessage) obj);
            }
        }, new y20() { // from class: l.adj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f70693a.m109221u0(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public String m109211D0(String str, String str2) {
        this.f81230g = str;
        this.f81231h = str2;
        return this.f81224a.mo137270m(FeedModule.m61405F().userId()).name + this.f81225b.getString(R$string.f39869a3) + this.f81224a.mo137270m(str).name + ": ";
    }

    /* JADX INFO: renamed from: E0 */
    public void m109212E0(List<MomentMessage> list) {
        this.f81235l.clear();
        this.f81235l.addAll(list);
    }

    /* JADX INFO: renamed from: l0 */
    public String m109213l0() {
        String string = this.f81225b.getString(R$string.f39748G2);
        if (this.f81234k) {
            return this.f81225b.getString(R$string.f39891d4);
        }
        return m109216o0() ? this.f81225b.getString(R$string.f39742F2) : string;
    }

    /* JADX INFO: renamed from: m0 */
    public void m109214m0() {
        ucj0 ucj0Var = new ucj0(this.f81225b, this);
        this.f81224a = ucj0Var;
        ucj0Var.mo65702o();
    }

    /* JADX INFO: renamed from: n0 */
    public void m109215n0() {
        this.f81226c = this.f81225b.getArguments().getString("topic_id");
        this.f81227d = this.f81225b.getArguments().getString("topic_owner");
        this.f81228e = this.f81225b.getArguments().getString("moment_id");
        this.f81229f = this.f81225b.getArguments().getInt("vote_index");
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m109216o0() {
        TopicMoment topicMoment = this.f81232i;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m109217p0(MomentMessage momentMessage, uxj0 uxj0Var) {
        this.f81225b.m21598s4();
        m109209A0(momentMessage);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m109218r0(final MomentMessage momentMessage) {
        this.f81225b.m21595p4(R$string.f39832U2, true);
        duringCreated(this.f81224a.m195405G(momentMessage)).subscribe(psd0.m173597H(new y20() { // from class: l.wcj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188479a.m109217p0(momentMessage, (uxj0) obj);
            }
        }, new y20() { // from class: l.xcj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193314a.m109208q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Boolean m109219s0(MomentMessage momentMessage) {
        return Boolean.valueOf(!this.f81235l.contains(momentMessage));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m109220t0(MomentMessage momentMessage, MomentMessage momentMessage2) {
        m109224z0(momentMessage2);
        if (momentMessage.isChildComment()) {
            return;
        }
        ((ldj0) this.viewModel).m153766F();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m109221u0(MomentMessage momentMessage, Throwable th) {
        if (this.f81235l.contains(momentMessage)) {
            this.f81235l.remove(momentMessage);
            ((ldj0) this.viewModel).m153765E(this.f81235l);
        }
        App.f16087d.m21432k(th);
        i4h.m138536e(th);
    }

    /* JADX INFO: renamed from: x0 */
    public void m109222x0(bkj0<Links, List<TopicMoment>, List<MomentMessage>> bkj0Var) {
        this.f81234k = false;
        this.f81233j = bkj0Var.f77081a;
        if (bkj0Var.f77082b.size() > 0) {
            TopicMoment topicMoment = bkj0Var.f77082b.get(0);
            this.f81232i = topicMoment;
            ((ldj0) this.viewModel).m153767G(this.f81224a, topicMoment, this.f81229f);
            if (NullChecker.m82487b(this.f81232i)) {
                ((ldj0) this.viewModel).m153774p(this.f81232i.getTopicNameWithPrefix());
            }
            ((ldj0) this.viewModel).m153768H(!m109216o0());
        }
        this.f81235l.clear();
        if (!m109216o0()) {
            this.f81235l.addAll(bkj0Var.f77083c);
        }
        ((ldj0) this.viewModel).m153765E(this.f81235l);
    }

    /* JADX INFO: renamed from: y0 */
    public void m109223y0(pf60<Links, List<MomentMessage>> pf60Var) {
        this.f81233j = pf60Var.f152156a;
        if (NullChecker.m82486a(pf60Var.f152157b)) {
            this.f81235l.addAll(jyb.m147522n(pf60Var.f152157b, new qcj() { // from class: l.ycj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f198520a.m109219s0((MomentMessage) obj);
                }
            }));
            ((ldj0) this.viewModel).m153765E(this.f81235l);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m109224z0(MomentMessage momentMessage) {
        momentMessage.isNewComment = true;
        this.f81235l.add(0, momentMessage);
        ((ldj0) this.viewModel).m153765E(this.f81235l);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
