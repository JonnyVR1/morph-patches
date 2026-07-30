package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class y3j0 extends jq2<h4j0> {

    /* JADX INFO: renamed from: a */
    public q3j0 f195817a;

    /* JADX INFO: renamed from: b */
    public TopicVoteAggregationFeedFrag f195818b;

    /* JADX INFO: renamed from: c */
    public String f195819c;

    /* JADX INFO: renamed from: d */
    public String f195820d;

    /* JADX INFO: renamed from: e */
    public String f195821e;

    /* JADX INFO: renamed from: f */
    public int f195822f;

    /* JADX INFO: renamed from: g */
    public String f195823g;

    /* JADX INFO: renamed from: h */
    public String f195824h;

    /* JADX INFO: renamed from: i */
    public TopicMoment f195825i;

    /* JADX INFO: renamed from: j */
    public Links f195826j;

    /* JADX INFO: renamed from: k */
    public boolean f195827k;

    /* JADX INFO: renamed from: l */
    public List<MomentMessage> f195828l;

    /* JADX INFO: renamed from: m */
    public e30<MomentMessage> f195829m;

    public y3j0(mcr mcrVar) {
        super(mcrVar);
        this.f195822f = -1;
        this.f195828l = new LinkedList();
        this.f195829m = new e30() { // from class: l.r3j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157538a.m212838r0((MomentMessage) obj);
            }
        };
        this.f195818b = (TopicVoteAggregationFeedFrag) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m212828q0(Throwable th) {
        yij0.m214926D(th);
        this.f195818b.m20599s4();
    }

    /* JADX INFO: renamed from: A0 */
    public void m212829A0(final MomentMessage momentMessage) {
        int iM200293G = vwb.m200293G(this.f195828l, new w9j() { // from class: l.x3j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(momentMessage.f56008id.equals(((MomentMessage) obj).f56008id));
            }
        });
        if (iM200293G != -1) {
            this.f195828l.remove(iM200293G);
            ((h4j0) this.viewModel).m129258C(momentMessage);
        }
        ((h4j0) this.viewModel).m129259E(this.f195828l);
    }

    /* JADX INFO: renamed from: C0 */
    public void m212830C0(final MomentMessage momentMessage) {
        if (!TextUtils.isEmpty(this.f195823g)) {
            momentMessage.parentCommentId = this.f195824h;
            momentMessage.api_only_otherUser = this.f195823g;
        }
        ((h4j0) this.viewModel).m129265K();
        duringCreated(this.f195817a.m172879H(momentMessage)).subscribe(mkd0.m154956H(new e30() { // from class: l.v3j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179816a.m212840t0(momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.w3j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184398a.m212841u0(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public String m212831D0(String str, String str2) {
        this.f195823g = str;
        this.f195824h = str2;
        return this.f195817a.mo133306m(FeedModule.m60221F().userId()).name + this.f195818b.getString(R$string.f39021a3) + this.f195817a.mo133306m(str).name + ": ";
    }

    /* JADX INFO: renamed from: E0 */
    public void m212832E0(List<MomentMessage> list) {
        this.f195828l.clear();
        this.f195828l.addAll(list);
    }

    /* JADX INFO: renamed from: l0 */
    public String m212833l0() {
        String string = this.f195818b.getString(R$string.f38900G2);
        if (this.f195827k) {
            return this.f195818b.getString(R$string.f39043d4);
        }
        return m212836o0() ? this.f195818b.getString(R$string.f38894F2) : string;
    }

    /* JADX INFO: renamed from: m0 */
    public void m212834m0() {
        q3j0 q3j0Var = new q3j0(this.f195818b, this);
        this.f195817a = q3j0Var;
        q3j0Var.mo64519o();
    }

    /* JADX INFO: renamed from: n0 */
    public void m212835n0() {
        this.f195819c = this.f195818b.getArguments().getString("topic_id");
        this.f195820d = this.f195818b.getArguments().getString("topic_owner");
        this.f195821e = this.f195818b.getArguments().getString("moment_id");
        this.f195822f = this.f195818b.getArguments().getInt("vote_index");
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m212836o0() {
        TopicMoment topicMoment = this.f195825i;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m212837p0(MomentMessage momentMessage, roj0 roj0Var) {
        this.f195818b.m20599s4();
        m212829A0(momentMessage);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m212838r0(final MomentMessage momentMessage) {
        this.f195818b.m20596p4(R$string.f38984U2, true);
        duringCreated(this.f195817a.m172878G(momentMessage)).subscribe(mkd0.m154956H(new e30() { // from class: l.s3j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162142a.m212837p0(momentMessage, (roj0) obj);
            }
        }, new e30() { // from class: l.t3j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167640a.m212828q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Boolean m212839s0(MomentMessage momentMessage) {
        return Boolean.valueOf(!this.f195828l.contains(momentMessage));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m212840t0(MomentMessage momentMessage, MomentMessage momentMessage2) {
        m212844z0(momentMessage2);
        if (momentMessage.isChildComment()) {
            return;
        }
        ((h4j0) this.viewModel).m129260F();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m212841u0(MomentMessage momentMessage, Throwable th) {
        if (this.f195828l.contains(momentMessage)) {
            this.f195828l.remove(momentMessage);
            ((h4j0) this.viewModel).m129259E(this.f195828l);
        }
        App.f15368d.m20433k(th);
        t2h.m186974e(th);
    }

    /* JADX INFO: renamed from: x0 */
    public void m212842x0(xaj0<Links, List<TopicMoment>, List<MomentMessage>> xaj0Var) {
        this.f195827k = false;
        this.f195826j = xaj0Var.f191751a;
        if (xaj0Var.f191752b.size() > 0) {
            TopicMoment topicMoment = xaj0Var.f191752b.get(0);
            this.f195825i = topicMoment;
            ((h4j0) this.viewModel).m129261G(this.f195817a, topicMoment, this.f195822f);
            if (NullChecker.m81304b(this.f195825i)) {
                ((h4j0) this.viewModel).m129268p(this.f195825i.getTopicNameWithPrefix());
            }
            ((h4j0) this.viewModel).m129262H(!m212836o0());
        }
        this.f195828l.clear();
        if (!m212836o0()) {
            this.f195828l.addAll(xaj0Var.f191753c);
        }
        ((h4j0) this.viewModel).m129259E(this.f195828l);
    }

    /* JADX INFO: renamed from: y0 */
    public void m212843y0(j760<Links, List<MomentMessage>> j760Var) {
        this.f195826j = j760Var.f116564a;
        if (NullChecker.m81303a(j760Var.f116565b)) {
            this.f195828l.addAll(vwb.m200339n(j760Var.f116565b, new w9j() { // from class: l.u3j0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f173623a.m212839s0((MomentMessage) obj);
                }
            }));
            ((h4j0) this.viewModel).m129259E(this.f195828l);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m212844z0(MomentMessage momentMessage) {
        momentMessage.isNewComment = true;
        this.f195828l.add(0, momentMessage);
        ((h4j0) this.viewModel).m129259E(this.f195828l);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
