package p153l;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.VoteOptions;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class zub0 {

    /* JADX INFO: renamed from: a */
    public FeedQaTopicVoteListGroupView<View> f206100a;

    /* JADX INFO: renamed from: b */
    public List<VoteOptions> f206101b;

    /* JADX INFO: renamed from: d */
    public TopicMoment f206103d;

    /* JADX INFO: renamed from: e */
    public Act f206104e;

    /* JADX INFO: renamed from: f */
    public x20 f206105f;

    /* JADX INFO: renamed from: g */
    public x20 f206106g;

    /* JADX INFO: renamed from: h */
    public boolean f206107h;

    /* JADX INFO: renamed from: i */
    public String f206108i;

    /* JADX INFO: renamed from: c */
    public int f206102c = -1;

    /* JADX INFO: renamed from: j */
    public th0 f206109j = null;

    public zub0(FeedQaTopicVoteListGroupView<View> feedQaTopicVoteListGroupView, Act act, boolean z, String str) {
        this.f206100a = feedQaTopicVoteListGroupView;
        this.f206104e = act;
        this.f206107h = z;
        this.f206108i = str;
    }

    /* JADX INFO: renamed from: A */
    public final void m221616A(boolean z, boolean z2) {
        int size = this.f206101b.size();
        List<T> qaTopicVoteViewList = this.f206100a.getQaTopicVoteViewList();
        Iterator it = qaTopicVoteViewList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
        for (int i = 0; i < size && qaTopicVoteViewList.size() != i; i++) {
            bnl0.m105524M((View) qaTopicVoteViewList.get(i), true);
            this.f206100a.mo67153z(new l1i(z, this.f206101b.get(i).counter, this.f206103d.voteCounter, i, this.f206102c, this.f206101b.get(i).values, z2));
        }
    }

    /* JADX INFO: renamed from: j */
    public final Act m221617j() {
        return this.f206104e;
    }

    /* JADX INFO: renamed from: k */
    public final void m221618k() {
        if (m221617j() == null || !cmg.m111222m0() || cmg.m111224n0()) {
            return;
        }
        th0.C20312a c20312a = new th0.C20312a(this.f206104e);
        c20312a.m191151j("确认取消投票吗？").m191159r("确定").m191147f("取消").m191156o(new View.OnClickListener() { // from class: l.tub0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176180a.m221620m(view);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.uub0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181052a.m221621n(view);
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        this.f206109j = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: l */
    public final void m221619l() {
        final List<View> voteViewContainerList = this.f206100a.getVoteViewContainerList();
        jyb.m147537z(voteViewContainerList, new y20() { // from class: l.qub0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159554a.m221623p(voteViewContainerList, (View) obj);
            }
        });
        bnl0.m105509E0(this.f206100a.getVoteListContainer(), new View.OnClickListener() { // from class: l.rub0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164911a.m221624q(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m221620m(View view) {
        this.f206109j.m191137c();
        m221631x();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m221621n(View view) {
        this.f206109j.m191137c();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m221622o(List list, View view) {
        if (this.f206102c != -1) {
            if (this.f206107h) {
                m221618k();
                return;
            } else {
                ksg.m151231t0(this.f206103d, m221617j());
                return;
            }
        }
        String strM151174K = ksg.m151174K(this.f206108i, false);
        if (m221617j() instanceof QATopicAggregationActivity) {
            strM151174K = FeedTopicContentWithPluginView.f44082u == 0 ? "p_topic_recommend" : "p_topic_latest";
        }
        i4g0.m138523u("e_qa_optional", strM151174K, jyb.m147494Y("topic_id", this.f206103d.f40095id), jyb.m147494Y(FirebaseAnalytics.Event.SELECT_ITEM, this.f206101b.get(list.indexOf(view)).values));
        m221628u(list.indexOf(view));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m221623p(final List list, View view) {
        if (NullChecker.m82486a(view)) {
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.sub0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f170674a.m221622o(list, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m221624q(View view) {
        if (this.f206102c != -1) {
            if (this.f206107h) {
                m221618k();
            } else {
                ksg.m151231t0(this.f206103d, m221617j());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m221625r(int i, int i2, uxj0 uxj0Var) {
        this.f206102c = i;
        if (i2 == this.f206103d.voteCounter) {
            this.f206101b.get(i).haveliked = true;
            this.f206101b.get(this.f206102c).counter++;
            TopicMoment topicMoment = this.f206103d;
            topicMoment.voteCounter++;
            FeedModule.f39707h.m112656C0(topicMoment.f40095id, this.f206101b.get(i).f40101id);
        }
        m221616A(true, false);
        x20 x20Var = this.f206105f;
        if (x20Var != null) {
            x20Var.call();
        }
        m221627t(true);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m221626s(uxj0 uxj0Var) {
        int i = this.f206102c;
        this.f206101b.get(i).counter--;
        this.f206101b.get(this.f206102c).haveliked = false;
        this.f206103d.voteCounter--;
        this.f206102c = -1;
        m221616A(true, true);
        m221627t(false);
        String strM151174K = ksg.m151174K(this.f206108i, false);
        if (m221617j() instanceof QATopicAggregationActivity) {
            strM151174K = FeedTopicContentWithPluginView.f44082u == 0 ? "p_topic_recommend" : "p_topic_latest";
        }
        i4g0.m138523u("e_qa_optional_cancel", strM151174K, jyb.m147494Y("topic_id", this.f206103d.f40095id), jyb.m147494Y(FirebaseAnalytics.Event.SELECT_ITEM, this.f206101b.get(i).values));
        x20 x20Var = this.f206106g;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m221627t(boolean z) {
        HashMap map = new HashMap();
        TopicMoment topicMoment = this.f206103d;
        map.put(topicMoment.f40095id, topicMoment);
        if (z) {
            map.put("666666", this.f206103d);
        }
        FeedModule.f39703d.m145583P7().m137019l(map);
    }

    /* JADX INFO: renamed from: u */
    public final void m221628u(final int i) {
        if (m221617j() == null || i == -1) {
            return;
        }
        final int i2 = this.f206103d.voteCounter;
        Act actM221617j = m221617j();
        jka jkaVar = FeedModule.f39703d;
        TopicMoment topicMoment = this.f206103d;
        actM221617j.duringCreated(jkaVar.m145503Dc(topicMoment.owner.f39607id, topicMoment.f40095id, this.f206101b.get(i).f40101id, i)).subscribe(psd0.m173597H(new y20() { // from class: l.xub0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196271a.m221625r(i, i2, (uxj0) obj);
            }
        }, new y20() { // from class: l.yub0
            @Override // p153l.y20
            public final void call(Object obj) {
                i4h.m138538g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public final void m221629v() {
        TopicMoment topicMoment = this.f206103d;
        if (topicMoment == null) {
            return;
        }
        List<VoteOptions> list = topicMoment.options;
        this.f206101b = list;
        if (list == null || list.size() == 0 || this.f206103d.voteCounter < 0) {
            return;
        }
        this.f206102c = -1;
        for (int i = 0; i < this.f206101b.size(); i++) {
            if (this.f206101b.get(i).haveliked) {
                this.f206102c = i;
            }
        }
        m221616A(false, false);
        m221619l();
    }

    /* JADX INFO: renamed from: w */
    public void m221630w(TopicMoment topicMoment) {
        this.f206102c = -1;
        this.f206103d = topicMoment;
        m221629v();
    }

    /* JADX INFO: renamed from: x */
    public final void m221631x() {
        if (this.f206102c == -1) {
            return;
        }
        Act actM221617j = m221617j();
        jka jkaVar = FeedModule.f39703d;
        TopicMoment topicMoment = this.f206103d;
        actM221617j.duringCreated(jkaVar.m145533I6(topicMoment.owner.f39607id, topicMoment.f40095id, this.f206101b.get(this.f206102c).f40101id)).subscribe(psd0.m173597H(new y20() { // from class: l.vub0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185774a.m221626s((uxj0) obj);
            }
        }, new y20() { // from class: l.wub0
            @Override // p153l.y20
            public final void call(Object obj) {
                i4h.m138538g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public void m221632y(x20 x20Var) {
        this.f206106g = x20Var;
    }

    /* JADX INFO: renamed from: z */
    public void m221633z(x20 x20Var) {
        this.f206105f = x20Var;
    }
}
