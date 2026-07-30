package p149l;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.VoteOptions;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class vmb0 {

    /* JADX INFO: renamed from: a */
    public FeedQaTopicVoteListGroupView<View> f182088a;

    /* JADX INFO: renamed from: b */
    public List<VoteOptions> f182089b;

    /* JADX INFO: renamed from: d */
    public TopicMoment f182091d;

    /* JADX INFO: renamed from: e */
    public Act f182092e;

    /* JADX INFO: renamed from: f */
    public d30 f182093f;

    /* JADX INFO: renamed from: g */
    public d30 f182094g;

    /* JADX INFO: renamed from: h */
    public boolean f182095h;

    /* JADX INFO: renamed from: i */
    public String f182096i;

    /* JADX INFO: renamed from: c */
    public int f182090c = -1;

    /* JADX INFO: renamed from: j */
    public xh0 f182097j = null;

    public vmb0(FeedQaTopicVoteListGroupView<View> feedQaTopicVoteListGroupView, Act act, boolean z, String str) {
        this.f182088a = feedQaTopicVoteListGroupView;
        this.f182092e = act;
        this.f182095h = z;
        this.f182096i = str;
    }

    /* JADX INFO: renamed from: A */
    public final void m198916A(boolean z, boolean z2) {
        int size = this.f182089b.size();
        List<T> qaTopicVoteViewList = this.f182088a.getQaTopicVoteViewList();
        Iterator it = qaTopicVoteViewList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
        for (int i = 0; i < size && qaTopicVoteViewList.size() != i; i++) {
            xdl0.m208344M((View) qaTopicVoteViewList.get(i), true);
            this.f182088a.mo65970z(new wzh(z, this.f182089b.get(i).counter, this.f182091d.voteCounter, i, this.f182090c, this.f182089b.get(i).values, z2));
        }
    }

    /* JADX INFO: renamed from: j */
    public final Act m198917j() {
        return this.f182092e;
    }

    /* JADX INFO: renamed from: k */
    public final void m198918k() {
        if (m198917j() == null || !nkg.m159893m0() || nkg.m159895n0()) {
            return;
        }
        xh0.C21150a c21150a = new xh0.C21150a(this.f182092e);
        c21150a.m208731j("确认取消投票吗？").m208739r("确定").m208727f("取消").m208736o(new View.OnClickListener() { // from class: l.pmb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150204a.m198920m(view);
            }
        }).m208724c(new View.OnClickListener() { // from class: l.qmb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155294a.m198921n(view);
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        this.f182097j = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: l */
    public final void m198919l() {
        final List<View> voteViewContainerList = this.f182088a.getVoteViewContainerList();
        vwb.m200354z(voteViewContainerList, new e30() { // from class: l.mmb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134597a.m198923p(voteViewContainerList, (View) obj);
            }
        });
        xdl0.m208329E0(this.f182088a.getVoteListContainer(), new View.OnClickListener() { // from class: l.nmb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139620a.m198924q(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m198920m(View view) {
        this.f182097j.m208717c();
        m198931x();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m198921n(View view) {
        this.f182097j.m208717c();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m198922o(List list, View view) {
        if (this.f182090c != -1) {
            if (this.f182095h) {
                m198918k();
                return;
            } else {
                vqg.m199572t0(this.f182091d, m198917j());
                return;
            }
        }
        String strM199515K = vqg.m199515K(this.f182096i, false);
        if (m198917j() instanceof QATopicAggregationActivity) {
            strM199515K = FeedTopicContentWithPluginView.f43234u == 0 ? "p_topic_recommend" : "p_topic_latest";
        }
        zvf0.m220399u("e_qa_optional", strM199515K, vwb.m200311Y("topic_id", this.f182091d.f39247id), vwb.m200311Y(FirebaseAnalytics.Event.SELECT_ITEM, this.f182089b.get(list.indexOf(view)).values));
        m198928u(list.indexOf(view));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m198923p(final List list, View view) {
        if (NullChecker.m81303a(view)) {
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.omb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f144606a.m198922o(list, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m198924q(View view) {
        if (this.f182090c != -1) {
            if (this.f182095h) {
                m198918k();
            } else {
                vqg.m199572t0(this.f182091d, m198917j());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m198925r(int i, int i2, roj0 roj0Var) {
        this.f182090c = i;
        if (i2 == this.f182091d.voteCounter) {
            this.f182089b.get(i).haveliked = true;
            this.f182089b.get(this.f182090c).counter++;
            TopicMoment topicMoment = this.f182091d;
            topicMoment.voteCounter++;
            FeedModule.f38859h.m180643C0(topicMoment.f39247id, this.f182089b.get(i).f39253id);
        }
        m198916A(true, false);
        d30 d30Var = this.f182093f;
        if (d30Var != null) {
            d30Var.call();
        }
        m198927t(true);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m198926s(roj0 roj0Var) {
        int i = this.f182090c;
        this.f182089b.get(i).counter--;
        this.f182089b.get(this.f182090c).haveliked = false;
        this.f182091d.voteCounter--;
        this.f182090c = -1;
        m198916A(true, true);
        m198927t(false);
        String strM199515K = vqg.m199515K(this.f182096i, false);
        if (m198917j() instanceof QATopicAggregationActivity) {
            strM199515K = FeedTopicContentWithPluginView.f43234u == 0 ? "p_topic_recommend" : "p_topic_latest";
        }
        zvf0.m220399u("e_qa_optional_cancel", strM199515K, vwb.m200311Y("topic_id", this.f182091d.f39247id), vwb.m200311Y(FirebaseAnalytics.Event.SELECT_ITEM, this.f182089b.get(i).values));
        d30 d30Var = this.f182094g;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m198927t(boolean z) {
        HashMap map = new HashMap();
        TopicMoment topicMoment = this.f182091d;
        map.put(topicMoment.f39247id, topicMoment);
        if (z) {
            map.put("666666", this.f182091d);
        }
        FeedModule.f38855d.m209342P7().m132487l(map);
    }

    /* JADX INFO: renamed from: u */
    public final void m198928u(final int i) {
        if (m198917j() == null || i == -1) {
            return;
        }
        final int i2 = this.f182091d.voteCounter;
        Act actM198917j = m198917j();
        xia xiaVar = FeedModule.f38855d;
        TopicMoment topicMoment = this.f182091d;
        actM198917j.duringCreated(xiaVar.m209262Dc(topicMoment.owner.f38759id, topicMoment.f39247id, this.f182089b.get(i).f39253id, i)).subscribe(mkd0.m154956H(new e30() { // from class: l.tmb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171144a.m198925r(i, i2, (roj0) obj);
            }
        }, new e30() { // from class: l.umb0
            @Override // p149l.e30
            public final void call(Object obj) {
                t2h.m186976g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public final void m198929v() {
        TopicMoment topicMoment = this.f182091d;
        if (topicMoment == null) {
            return;
        }
        List<VoteOptions> list = topicMoment.options;
        this.f182089b = list;
        if (list == null || list.size() == 0 || this.f182091d.voteCounter < 0) {
            return;
        }
        this.f182090c = -1;
        for (int i = 0; i < this.f182089b.size(); i++) {
            if (this.f182089b.get(i).haveliked) {
                this.f182090c = i;
            }
        }
        m198916A(false, false);
        m198919l();
    }

    /* JADX INFO: renamed from: w */
    public void m198930w(TopicMoment topicMoment) {
        this.f182090c = -1;
        this.f182091d = topicMoment;
        m198929v();
    }

    /* JADX INFO: renamed from: x */
    public final void m198931x() {
        if (this.f182090c == -1) {
            return;
        }
        Act actM198917j = m198917j();
        xia xiaVar = FeedModule.f38855d;
        TopicMoment topicMoment = this.f182091d;
        actM198917j.duringCreated(xiaVar.m209292I6(topicMoment.owner.f38759id, topicMoment.f39247id, this.f182089b.get(this.f182090c).f39253id)).subscribe(mkd0.m154956H(new e30() { // from class: l.rmb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160079a.m198926s((roj0) obj);
            }
        }, new e30() { // from class: l.smb0
            @Override // p149l.e30
            public final void call(Object obj) {
                t2h.m186976g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public void m198932y(d30 d30Var) {
        this.f182094g = d30Var;
    }

    /* JADX INFO: renamed from: z */
    public void m198933z(d30 d30Var) {
        this.f182093f = d30Var;
    }
}
