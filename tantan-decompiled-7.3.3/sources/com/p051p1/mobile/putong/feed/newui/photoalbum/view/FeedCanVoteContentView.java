package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.VoteOptions;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaInputAct;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedVoteContainer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.bnl0;
import p153l.cmg;
import p153l.cn40;
import p153l.ksg;
import p153l.pf60;
import p153l.psd0;
import p153l.q8g0;
import p153l.ssg;
import p153l.tfj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCanVoteContentView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f43196a;

    /* JADX INFO: renamed from: b */
    public TextView f43197b;

    /* JADX INFO: renamed from: c */
    public FeedVoteContainer f43198c;

    /* JADX INFO: renamed from: d */
    public TextView f43199d;

    /* JADX INFO: renamed from: e */
    public Context f43200e;

    /* JADX INFO: renamed from: f */
    public String f43201f;

    /* JADX INFO: renamed from: g */
    public TopicMoment f43202g;

    /* JADX INFO: renamed from: h */
    public HashMap<String, Boolean> f43203h;

    /* JADX INFO: renamed from: i */
    public boolean f43204i;

    public FeedCanVoteContentView(@NonNull Context context) {
        super(context);
        this.f43204i = false;
        m66264k(context);
    }

    /* JADX INFO: renamed from: h */
    public View m66261h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ssg.m187709b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public Act m66262i() {
        return (Act) this.f43200e;
    }

    /* JADX INFO: renamed from: j */
    public void m66263j(int i) {
        this.f43199d.setVisibility(i);
        this.f43203h.put(this.f43202g.f40095id, Boolean.valueOf(i == 0));
    }

    /* JADX INFO: renamed from: k */
    public final void m66264k(Context context) {
        this.f43200e = context;
        addView(m66261h(LayoutInflater.from(context), this));
        m66262i().duringCreated(FeedModule.f39703d.m145583P7()).subscribe(psd0.m173596G(new y20() { // from class: l.lsg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133421a.m66265l((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m66265l(Map map) {
        List<VoteOptions> list;
        boolean z;
        TopicMoment topicMoment = this.f43202g;
        if (topicMoment != null) {
            TopicMoment topicMoment2 = (TopicMoment) map.get(topicMoment.f40095id);
            if (topicMoment2 != null && (list = topicMoment2.options) != null) {
                TopicMoment topicMoment3 = this.f43202g;
                topicMoment3.options = list;
                topicMoment3.voteCounter = topicMoment2.voteCounter;
                this.f43198c.m67157b(topicMoment2, true, this.f43201f);
                this.f43197b.setText(String.format("%s人参与了投票 ", q8g0.m175816u(this.f43202g.voteCounter)));
                Iterator<VoteOptions> it = topicMoment2.options.iterator();
                loop0: while (true) {
                    z = false;
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        VoteOptions next = it.next();
                        if (z || next.haveliked) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    m66263j(8);
                }
            }
            if (map.containsKey("666666")) {
                m66263j(8);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m66266m(TopicMoment topicMoment, View view) {
        ksg.m151231t0(topicMoment, m66262i());
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m66267n(TopicMoment topicMoment, View view) {
        String str = this.f43201f;
        String strM151174K = ksg.m151174K(str, TextUtils.equals(str, "from_album"));
        if (TextUtils.isEmpty(this.f43201f)) {
            strM151174K = "p_user_moment_interactions_details_view";
        }
        tfj0.m190940c("e_moment_post", strM151174K, new pf60("posted_source", TextUtils.isEmpty(this.f43201f) ? "p_user_moment_interactions_details_view" : this.f43201f), new pf60("topic_id", topicMoment.f40095id));
        if (cmg.m111224n0()) {
            m66273t(false);
        } else {
            cn40.m111361M(m66262i(), new NewPostAct.C11407a(m66262i()).m63885m(topicMoment).m63882j(false).m63879g(true).m63874b("分享你的观点，可以获得更大曝光…"));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m66268o() {
        m66273t(true);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m66269p(TopicMoment topicMoment, FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView) {
        this.f43197b.setText(String.format("%s人参与了投票 ", q8g0.m175816u(topicMoment.voteCounter)));
        m66262i().postDelayed(new Runnable() { // from class: l.qsg
            @Override // java.lang.Runnable
            public final void run() {
                this.f159323a.m66268o();
            }
        }, feedQaTopicVoteListGroupView.getAnimTime());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m66270q() {
        this.f43199d.setVisibility(8);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ boolean m66271r(boolean z, int i, int i2, Intent intent) {
        if (!z) {
            return false;
        }
        if (intent != null) {
            m66263j(8);
        } else {
            m66263j(0);
            this.f43203h.put(this.f43202g.f40095id, Boolean.TRUE);
            String str = this.f43201f;
            String strM151174K = ksg.m151174K(str, TextUtils.equals(str, "from_album"));
            if (TextUtils.isEmpty(this.f43201f)) {
                strM151174K = "p_user_moment_interactions_details_view";
            }
            tfj0.m190942e("e_moment_post", strM151174K, new pf60("posted_source", TextUtils.isEmpty(this.f43201f) ? "p_user_moment_interactions_details_view" : this.f43201f), new pf60("topic_id", this.f43202g.f40095id));
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public void m66272s(final TopicMoment topicMoment) {
        if (cmg.m111224n0()) {
            setOnClickListener(new View.OnClickListener() { // from class: l.msg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f138476a.m66266m(topicMoment, view);
                }
            });
        }
        this.f43202g = topicMoment;
        this.f43196a.setText(topicMoment.name);
        this.f43197b.setText(String.format("%s人参与了投票 ", q8g0.m175816u(topicMoment.voteCounter)));
        this.f43198c.m67157b(topicMoment, true, this.f43201f);
        if (this.f43203h == null) {
            this.f43203h = new HashMap<>();
        }
        Boolean bool = this.f43203h.get(topicMoment.f40095id);
        if (bool == null || !bool.booleanValue()) {
            bnl0.m105524M(this.f43199d, false);
        } else {
            bnl0.m105524M(this.f43199d, true);
            if (cmg.m111224n0() && !this.f43204i && !TextUtils.isEmpty(this.f43201f)) {
                this.f43204i = true;
                String str = this.f43201f;
                String strM151174K = ksg.m151174K(str, TextUtils.equals(str, "from_album"));
                if (TextUtils.isEmpty(this.f43201f)) {
                    strM151174K = "p_user_moment_interactions_details_view";
                }
                tfj0.m190942e("e_moment_post", strM151174K, new pf60("posted_source", TextUtils.isEmpty(this.f43201f) ? "p_user_moment_interactions_details_view" : this.f43201f), new pf60("topic_id", topicMoment.f40095id));
            }
        }
        this.f43199d.setOnClickListener(new View.OnClickListener() { // from class: l.nsg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143499a.m66267n(topicMoment, view);
            }
        });
        final FeedQaTopicVoteListGroupView showVoteListView = this.f43198c.getShowVoteListView();
        if (showVoteListView != null) {
            showVoteListView.setVoteSuccess(new x20() { // from class: l.osg
                @Override // p153l.x20
                public final void call() {
                    this.f148826a.m66269p(topicMoment, showVoteListView);
                }
            });
            showVoteListView.setCancelSuccess(new x20() { // from class: l.psg
                @Override // p153l.x20
                public final void call() {
                    this.f153901a.m66270q();
                }
            });
        }
    }

    public void setFrom(String str) {
        this.f43201f = str;
    }

    /* JADX INFO: renamed from: t */
    public void m66273t(final boolean z) {
        Intent intent = new Intent(m66262i(), (Class<?>) FeedQaInputAct.class);
        intent.putExtra("topicMoment", this.f43202g);
        intent.putExtra("from", this.f43201f);
        m66262i().startActivityForResult(intent, new C4468a.a() { // from class: l.rsg
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent2) {
                return this.f164667a.m66271r(z, i, i2, intent2);
            }
        });
    }

    public FeedCanVoteContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43204i = false;
        m66264k(context);
    }

    public FeedCanVoteContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43204i = false;
        m66264k(context);
    }
}
