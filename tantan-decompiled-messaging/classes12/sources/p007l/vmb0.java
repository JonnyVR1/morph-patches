package p007l;

import android.view.View;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.VoteOptions;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vmb0 {

    /* JADX INFO: renamed from: a */
    public FeedQaTopicVoteListGroupView<View> f14237a;

    /* JADX INFO: renamed from: b */
    public List<VoteOptions> f14238b;

    /* JADX INFO: renamed from: d */
    public TopicMoment f14240d;

    /* JADX INFO: renamed from: e */
    public Act f14241e;

    /* JADX INFO: renamed from: f */
    public d30 f14242f;

    /* JADX INFO: renamed from: g */
    public d30 f14243g;

    /* JADX INFO: renamed from: h */
    public boolean f14244h;

    /* JADX INFO: renamed from: i */
    public String f14245i;

    /* JADX INFO: renamed from: c */
    public int f14239c = -1;

    /* JADX INFO: renamed from: j */
    public xh0 f14246j = null;

    public vmb0(FeedQaTopicVoteListGroupView<View> feedQaTopicVoteListGroupView, Act act, boolean z, String str) {
        this.f14237a = feedQaTopicVoteListGroupView;
        this.f14241e = act;
        this.f14244h = z;
        this.f14245i = str;
    }

    /* JADX INFO: renamed from: A */
    public final void m15445A(boolean z, boolean z2) {
        int size = this.f14238b.size();
        List<T> qaTopicVoteViewList = this.f14237a.getQaTopicVoteViewList();
        Iterator it = qaTopicVoteViewList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
        for (int i = 0; i < size && qaTopicVoteViewList.size() != i; i++) {
            xdl0.M((View) qaTopicVoteViewList.get(i), true);
            this.f14237a.mo7122z(new wzh(z, this.f14238b.get(i).counter, this.f14240d.voteCounter, i, this.f14239c, this.f14238b.get(i).values, z2));
        }
    }

    /* JADX INFO: renamed from: j */
    public final Act m15446j() {
        return this.f14241e;
    }

    /* JADX INFO: renamed from: k */
    public final void m15447k() {
        if (m15446j() == null || !nkg.m12252m0() || nkg.m12254n0()) {
            return;
        }
        xh0.a aVar = new xh0.a(this.f14241e);
        aVar.j("确认取消投票吗？").r("确定").f("取消").o(new View.OnClickListener() { // from class: l.pmb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11887a.m15449m(view);
            }
        }).c(new View.OnClickListener() { // from class: l.qmb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12274a.m15450n(view);
            }
        });
        xh0 xh0VarA = aVar.a();
        this.f14246j = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: l */
    public final void m15448l() {
        final List<View> voteViewContainerList = this.f14237a.getVoteViewContainerList();
        vwb.z(voteViewContainerList, new e30() { // from class: l.mmb0
            public final void call(Object obj) {
                this.f10514a.m15452p(voteViewContainerList, (View) obj);
            }
        });
        xdl0.E0(this.f14237a.getVoteListContainer(), new View.OnClickListener() { // from class: l.nmb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10834a.m15453q(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m15449m(View view) {
        this.f14246j.c();
        m15460x();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m15450n(View view) {
        this.f14246j.c();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m15451o(List list, View view) {
        if (this.f14239c != -1) {
            if (this.f14244h) {
                m15447k();
                return;
            } else {
                vqg.m15542t0(this.f14240d, m15446j());
                return;
            }
        }
        String strM15485K = vqg.m15485K(this.f14245i, false);
        if (m15446j() instanceof QATopicAggregationActivity) {
            strM15485K = FeedTopicContentWithPluginView.f4695u == 0 ? "p_topic_recommend" : "p_topic_latest";
        }
        zvf0.u("e_qa_optional", strM15485K, new j760[]{vwb.Y("topic_id", this.f14240d.f708id), vwb.Y("select_item", this.f14238b.get(list.indexOf(view)).values)});
        m15457u(list.indexOf(view));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m15452p(final List list, View view) {
        if (NullChecker.a(view)) {
            xdl0.E0(view, new View.OnClickListener() { // from class: l.omb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11501a.m15451o(list, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m15453q(View view) {
        if (this.f14239c != -1) {
            if (this.f14244h) {
                m15447k();
            } else {
                vqg.m15542t0(this.f14240d, m15446j());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m15454r(int i, int i2, roj0 roj0Var) {
        this.f14239c = i;
        if (i2 == this.f14240d.voteCounter) {
            this.f14238b.get(i).haveliked = true;
            this.f14238b.get(this.f14239c).counter++;
            TopicMoment topicMoment = this.f14240d;
            topicMoment.voteCounter++;
            FeedModule.f320h.m13957C0(topicMoment.f708id, this.f14238b.get(i).f714id);
        }
        m15445A(true, false);
        d30 d30Var = this.f14242f;
        if (d30Var != null) {
            d30Var.call();
        }
        m15456t(true);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m15455s(roj0 roj0Var) {
        int i = this.f14239c;
        this.f14238b.get(i).counter--;
        this.f14238b.get(this.f14239c).haveliked = false;
        this.f14240d.voteCounter--;
        this.f14239c = -1;
        m15445A(true, true);
        m15456t(false);
        String strM15485K = vqg.m15485K(this.f14245i, false);
        if (m15446j() instanceof QATopicAggregationActivity) {
            strM15485K = FeedTopicContentWithPluginView.f4695u == 0 ? "p_topic_recommend" : "p_topic_latest";
        }
        zvf0.u("e_qa_optional_cancel", strM15485K, new j760[]{vwb.Y("topic_id", this.f14240d.f708id), vwb.Y("select_item", this.f14238b.get(i).values)});
        d30 d30Var = this.f14243g;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m15456t(boolean z) {
        HashMap map = new HashMap();
        TopicMoment topicMoment = this.f14240d;
        map.put(topicMoment.f708id, topicMoment);
        if (z) {
            map.put("666666", this.f14240d);
        }
        FeedModule.f316d.m16523P7().onNext(map);
    }

    /* JADX INFO: renamed from: u */
    public final void m15457u(final int i) {
        if (m15446j() == null || i == -1) {
            return;
        }
        final int i2 = this.f14240d.voteCounter;
        Act actM15446j = m15446j();
        xia xiaVar = FeedModule.f316d;
        TopicMoment topicMoment = this.f14240d;
        actM15446j.duringCreated(xiaVar.m16443Dc(topicMoment.owner.f220id, topicMoment.f708id, this.f14238b.get(i).f714id, i)).subscribe(mkd0.H(new e30() { // from class: l.tmb0
            public final void call(Object obj) {
                this.f13337a.m15454r(i, i2, (roj0) obj);
            }
        }, new e30() { // from class: l.umb0
            public final void call(Object obj) {
                t2h.m14427g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public final void m15458v() {
        TopicMoment topicMoment = this.f14240d;
        if (topicMoment == null) {
            return;
        }
        List<VoteOptions> list = topicMoment.options;
        this.f14238b = list;
        if (list == null || list.size() == 0 || this.f14240d.voteCounter < 0) {
            return;
        }
        this.f14239c = -1;
        for (int i = 0; i < this.f14238b.size(); i++) {
            if (this.f14238b.get(i).haveliked) {
                this.f14239c = i;
            }
        }
        m15445A(false, false);
        m15448l();
    }

    /* JADX INFO: renamed from: w */
    public void m15459w(TopicMoment topicMoment) {
        this.f14239c = -1;
        this.f14240d = topicMoment;
        m15458v();
    }

    /* JADX INFO: renamed from: x */
    public final void m15460x() {
        if (this.f14239c == -1) {
            return;
        }
        Act actM15446j = m15446j();
        xia xiaVar = FeedModule.f316d;
        TopicMoment topicMoment = this.f14240d;
        actM15446j.duringCreated(xiaVar.m16473I6(topicMoment.owner.f220id, topicMoment.f708id, this.f14238b.get(this.f14239c).f714id)).subscribe(mkd0.H(new e30() { // from class: l.rmb0
            public final void call(Object obj) {
                this.f12679a.m15455s((roj0) obj);
            }
        }, new e30() { // from class: l.smb0
            public final void call(Object obj) {
                t2h.m14427g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public void m15461y(d30 d30Var) {
        this.f14243g = d30Var;
    }

    /* JADX INFO: renamed from: z */
    public void m15462z(d30 d30Var) {
        this.f14242f = d30Var;
    }
}
