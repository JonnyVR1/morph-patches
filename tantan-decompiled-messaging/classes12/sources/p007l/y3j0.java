package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class y3j0 extends jq2<h4j0> {

    /* JADX INFO: renamed from: a */
    public q3j0 f15233a;

    /* JADX INFO: renamed from: b */
    public TopicVoteAggregationFeedFrag f15234b;

    /* JADX INFO: renamed from: c */
    public String f15235c;

    /* JADX INFO: renamed from: d */
    public String f15236d;

    /* JADX INFO: renamed from: e */
    public String f15237e;

    /* JADX INFO: renamed from: f */
    public int f15238f;

    /* JADX INFO: renamed from: g */
    public String f15239g;

    /* JADX INFO: renamed from: h */
    public String f15240h;

    /* JADX INFO: renamed from: i */
    public TopicMoment f15241i;

    /* JADX INFO: renamed from: j */
    public Links f15242j;

    /* JADX INFO: renamed from: k */
    public boolean f15243k;

    /* JADX INFO: renamed from: l */
    public List<MomentMessage> f15244l;

    /* JADX INFO: renamed from: m */
    public e30<MomentMessage> f15245m;

    public y3j0(mcr mcrVar) {
        super(mcrVar);
        this.f15238f = -1;
        this.f15244l = new LinkedList();
        this.f15245m = new e30() { // from class: l.r3j0
            public final void call(Object obj) {
                this.f12474a.m16914r0((MomentMessage) obj);
            }
        };
        this.f15234b = (TopicVoteAggregationFeedFrag) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m16904q0(Throwable th) {
        yij0.D(th);
        this.f15234b.s4();
    }

    /* JADX INFO: renamed from: A0 */
    public void m16905A0(final MomentMessage momentMessage) {
        int iG = vwb.G(this.f15244l, new w9j() { // from class: l.x3j0
            public final Object call(Object obj) {
                return Boolean.valueOf(((CopyObject) momentMessage).id.equals(((CopyObject) ((MomentMessage) obj)).id));
            }
        });
        if (iG != -1) {
            this.f15244l.remove(iG);
            ((h4j0) ((jq2) this).viewModel).m10532C(momentMessage);
        }
        ((h4j0) ((jq2) this).viewModel).m10534E(this.f15244l);
    }

    /* JADX INFO: renamed from: C0 */
    public void m16906C0(final MomentMessage momentMessage) {
        if (!TextUtils.isEmpty(this.f15239g)) {
            momentMessage.parentCommentId = this.f15240h;
            momentMessage.api_only_otherUser = this.f15239g;
        }
        ((h4j0) ((jq2) this).viewModel).m10540K();
        duringCreated(this.f15233a.m13382H(momentMessage)).subscribe(mkd0.H(new e30() { // from class: l.v3j0
            public final void call(Object obj) {
                this.f14053a.m16916t0(momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.w3j0
            public final void call(Object obj) {
                this.f14389a.m16917u0(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public String m16907D0(String str, String str2) {
        this.f15239g = str;
        this.f15240h = str2;
        return this.f15233a.mo10741m(FeedModule.m1139F().userId()).name + this.f15234b.getString(R$string.f482a3) + this.f15233a.mo10741m(str).name + ": ";
    }

    /* JADX INFO: renamed from: E0 */
    public void m16908E0(List<MomentMessage> list) {
        this.f15244l.clear();
        this.f15244l.addAll(list);
    }

    /* JADX INFO: renamed from: l0 */
    public String m16909l0() {
        String string = this.f15234b.getString(R$string.f361G2);
        if (this.f15243k) {
            return this.f15234b.getString(R$string.f504d4);
        }
        return m16912o0() ? this.f15234b.getString(R$string.f355F2) : string;
    }

    /* JADX INFO: renamed from: m0 */
    public void m16910m0() {
        q3j0 q3j0Var = new q3j0(this.f15234b, this);
        this.f15233a = q3j0Var;
        q3j0Var.mo5610o();
    }

    /* JADX INFO: renamed from: n0 */
    public void m16911n0() {
        this.f15235c = this.f15234b.getArguments().getString("topic_id");
        this.f15236d = this.f15234b.getArguments().getString("topic_owner");
        this.f15237e = this.f15234b.getArguments().getString("moment_id");
        this.f15238f = this.f15234b.getArguments().getInt("vote_index");
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m16912o0() {
        TopicMoment topicMoment = this.f15241i;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m16913p0(MomentMessage momentMessage, roj0 roj0Var) {
        this.f15234b.s4();
        m16905A0(momentMessage);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m16914r0(final MomentMessage momentMessage) {
        this.f15234b.p4(R$string.f445U2, true);
        duringCreated(this.f15233a.m13381G(momentMessage)).subscribe(mkd0.H(new e30() { // from class: l.s3j0
            public final void call(Object obj) {
                this.f12783a.m16913p0(momentMessage, (roj0) obj);
            }
        }, new e30() { // from class: l.t3j0
            public final void call(Object obj) {
                this.f13180a.m16904q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Boolean m16915s0(MomentMessage momentMessage) {
        return Boolean.valueOf(!this.f15244l.contains(momentMessage));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m16916t0(MomentMessage momentMessage, MomentMessage momentMessage2) {
        m16920z0(momentMessage2);
        if (momentMessage.isChildComment()) {
            return;
        }
        ((h4j0) ((jq2) this).viewModel).m10535F();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m16917u0(MomentMessage momentMessage, Throwable th) {
        if (this.f15244l.contains(momentMessage)) {
            this.f15244l.remove(momentMessage);
            ((h4j0) ((jq2) this).viewModel).m10534E(this.f15244l);
        }
        App.d.k(th);
        t2h.m14425e(th);
    }

    /* JADX INFO: renamed from: x0 */
    public void m16918x0(xaj0<Links, List<TopicMoment>, List<MomentMessage>> xaj0Var) {
        this.f15243k = false;
        this.f15242j = (Links) xaj0Var.a;
        if (((List) xaj0Var.b).size() > 0) {
            TopicMoment topicMoment = (TopicMoment) ((List) xaj0Var.b).get(0);
            this.f15241i = topicMoment;
            ((h4j0) ((jq2) this).viewModel).m10536G(this.f15233a, topicMoment, this.f15238f);
            if (NullChecker.b(this.f15241i)) {
                ((h4j0) ((jq2) this).viewModel).m10544p(this.f15241i.getTopicNameWithPrefix());
            }
            ((h4j0) ((jq2) this).viewModel).m10537H(!m16912o0());
        }
        this.f15244l.clear();
        if (!m16912o0()) {
            this.f15244l.addAll((Collection) xaj0Var.c);
        }
        ((h4j0) ((jq2) this).viewModel).m10534E(this.f15244l);
    }

    /* JADX INFO: renamed from: y0 */
    public void m16919y0(j760<Links, List<MomentMessage>> j760Var) {
        this.f15242j = (Links) j760Var.a;
        if (NullChecker.a(j760Var.b)) {
            this.f15244l.addAll(vwb.n((Collection) j760Var.b, new w9j() { // from class: l.u3j0
                public final Object call(Object obj) {
                    return this.f13523a.m16915s0((MomentMessage) obj);
                }
            }));
            ((h4j0) ((jq2) this).viewModel).m10534E(this.f15244l);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m16920z0(MomentMessage momentMessage) {
        momentMessage.isNewComment = true;
        this.f15244l.add(0, momentMessage);
        ((h4j0) ((jq2) this).viewModel).m10534E(this.f15244l);
    }

    public void destroy() {
    }
}
