package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.VoteOptions;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaInputAct;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedVoteContainer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.d30;
import p149l.drg;
import p149l.e30;
import p149l.i0g0;
import p149l.j760;
import p149l.mkd0;
import p149l.nkg;
import p149l.oe40;
import p149l.p6j0;
import p149l.vqg;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCanVoteContentView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f42348a;

    /* JADX INFO: renamed from: b */
    public TextView f42349b;

    /* JADX INFO: renamed from: c */
    public FeedVoteContainer f42350c;

    /* JADX INFO: renamed from: d */
    public TextView f42351d;

    /* JADX INFO: renamed from: e */
    public Context f42352e;

    /* JADX INFO: renamed from: f */
    public String f42353f;

    /* JADX INFO: renamed from: g */
    public TopicMoment f42354g;

    /* JADX INFO: renamed from: h */
    public HashMap<String, Boolean> f42355h;

    /* JADX INFO: renamed from: i */
    public boolean f42356i;

    public FeedCanVoteContentView(@NonNull Context context) {
        super(context);
        this.f42356i = false;
        m65081k(context);
    }

    /* JADX INFO: renamed from: h */
    public View m65078h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return drg.m113296b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public Act m65079i() {
        return (Act) this.f42352e;
    }

    /* JADX INFO: renamed from: j */
    public void m65080j(int i) {
        this.f42351d.setVisibility(i);
        this.f42355h.put(this.f42354g.f39247id, Boolean.valueOf(i == 0));
    }

    /* JADX INFO: renamed from: k */
    public final void m65081k(Context context) {
        this.f42352e = context;
        addView(m65078h(LayoutInflater.from(context), this));
        m65079i().duringCreated(FeedModule.f38855d.m209342P7()).subscribe(mkd0.m154955G(new e30() { // from class: l.wqg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187691a.m65082l((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m65082l(Map map) {
        List<VoteOptions> list;
        boolean z;
        TopicMoment topicMoment = this.f42354g;
        if (topicMoment != null) {
            TopicMoment topicMoment2 = (TopicMoment) map.get(topicMoment.f39247id);
            if (topicMoment2 != null && (list = topicMoment2.options) != null) {
                TopicMoment topicMoment3 = this.f42354g;
                topicMoment3.options = list;
                topicMoment3.voteCounter = topicMoment2.voteCounter;
                this.f42350c.m65974b(topicMoment2, true, this.f42353f);
                this.f42349b.setText(String.format("%s人参与了投票 ", i0g0.m133881u(this.f42354g.voteCounter)));
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
                    m65080j(8);
                }
            }
            if (map.containsKey("666666")) {
                m65080j(8);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m65083m(TopicMoment topicMoment, View view) {
        vqg.m199572t0(topicMoment, m65079i());
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m65084n(TopicMoment topicMoment, View view) {
        String str = this.f42353f;
        String strM199515K = vqg.m199515K(str, TextUtils.equals(str, "from_album"));
        if (TextUtils.isEmpty(this.f42353f)) {
            strM199515K = "p_user_moment_interactions_details_view";
        }
        p6j0.m167669c("e_moment_post", strM199515K, new j760("posted_source", TextUtils.isEmpty(this.f42353f) ? "p_user_moment_interactions_details_view" : this.f42353f), new j760("topic_id", topicMoment.f39247id));
        if (nkg.m159895n0()) {
            m65090t(false);
        } else {
            oe40.m163811M(m65079i(), new NewPostAct.C11244a(m65079i()).m62702m(topicMoment).m62699j(false).m62696g(true).m62691b("分享你的观点，可以获得更大曝光…"));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m65085o() {
        m65090t(true);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m65086p(TopicMoment topicMoment, FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView) {
        this.f42349b.setText(String.format("%s人参与了投票 ", i0g0.m133881u(topicMoment.voteCounter)));
        m65079i().postDelayed(new Runnable() { // from class: l.brg
            @Override // java.lang.Runnable
            public final void run() {
                this.f76900a.m65085o();
            }
        }, feedQaTopicVoteListGroupView.getAnimTime());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m65087q() {
        this.f42351d.setVisibility(8);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ boolean m65088r(boolean z, int i, int i2, Intent intent) {
        if (!z) {
            return false;
        }
        if (intent != null) {
            m65080j(8);
        } else {
            m65080j(0);
            this.f42355h.put(this.f42354g.f39247id, Boolean.TRUE);
            String str = this.f42353f;
            String strM199515K = vqg.m199515K(str, TextUtils.equals(str, "from_album"));
            if (TextUtils.isEmpty(this.f42353f)) {
                strM199515K = "p_user_moment_interactions_details_view";
            }
            p6j0.m167671e("e_moment_post", strM199515K, new j760("posted_source", TextUtils.isEmpty(this.f42353f) ? "p_user_moment_interactions_details_view" : this.f42353f), new j760("topic_id", this.f42354g.f39247id));
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public void m65089s(final TopicMoment topicMoment) {
        if (nkg.m159895n0()) {
            setOnClickListener(new View.OnClickListener() { // from class: l.xqg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f194008a.m65083m(topicMoment, view);
                }
            });
        }
        this.f42354g = topicMoment;
        this.f42348a.setText(topicMoment.name);
        this.f42349b.setText(String.format("%s人参与了投票 ", i0g0.m133881u(topicMoment.voteCounter)));
        this.f42350c.m65974b(topicMoment, true, this.f42353f);
        if (this.f42355h == null) {
            this.f42355h = new HashMap<>();
        }
        Boolean bool = this.f42355h.get(topicMoment.f39247id);
        if (bool == null || !bool.booleanValue()) {
            xdl0.m208344M(this.f42351d, false);
        } else {
            xdl0.m208344M(this.f42351d, true);
            if (nkg.m159895n0() && !this.f42356i && !TextUtils.isEmpty(this.f42353f)) {
                this.f42356i = true;
                String str = this.f42353f;
                String strM199515K = vqg.m199515K(str, TextUtils.equals(str, "from_album"));
                if (TextUtils.isEmpty(this.f42353f)) {
                    strM199515K = "p_user_moment_interactions_details_view";
                }
                p6j0.m167671e("e_moment_post", strM199515K, new j760("posted_source", TextUtils.isEmpty(this.f42353f) ? "p_user_moment_interactions_details_view" : this.f42353f), new j760("topic_id", topicMoment.f39247id));
            }
        }
        this.f42351d.setOnClickListener(new View.OnClickListener() { // from class: l.yqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199550a.m65084n(topicMoment, view);
            }
        });
        final FeedQaTopicVoteListGroupView showVoteListView = this.f42350c.getShowVoteListView();
        if (showVoteListView != null) {
            showVoteListView.setVoteSuccess(new d30() { // from class: l.zqg
                @Override // p149l.d30
                public final void call() {
                    this.f204379a.m65086p(topicMoment, showVoteListView);
                }
            });
            showVoteListView.setCancelSuccess(new d30() { // from class: l.arg
                @Override // p149l.d30
                public final void call() {
                    this.f71264a.m65087q();
                }
            });
        }
    }

    public void setFrom(String str) {
        this.f42353f = str;
    }

    /* JADX INFO: renamed from: t */
    public void m65090t(final boolean z) {
        Intent intent = new Intent(m65079i(), (Class<?>) FeedQaInputAct.class);
        intent.putExtra("topicMoment", this.f42354g);
        intent.putExtra("from", this.f42353f);
        m65079i().startActivityForResult(intent, new C4317a.a() { // from class: l.crg
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent2) {
                return this.f82213a.m65088r(z, i, i2, intent2);
            }
        });
    }

    public FeedCanVoteContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42356i = false;
        m65081k(context);
    }

    public FeedCanVoteContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42356i = false;
        m65081k(context);
    }
}
