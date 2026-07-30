package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

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
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.VoteOptions;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaInputAct;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedVoteContainer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.i0g0;
import l.j760;
import l.mkd0;
import l.xdl0;
import p007l.drg;
import p007l.nkg;
import p007l.oe40;
import p007l.p6j0;
import p007l.vqg;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCanVoteContentView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f3809a;

    /* JADX INFO: renamed from: b */
    public TextView f3810b;

    /* JADX INFO: renamed from: c */
    public FeedVoteContainer f3811c;

    /* JADX INFO: renamed from: d */
    public TextView f3812d;

    /* JADX INFO: renamed from: e */
    public Context f3813e;

    /* JADX INFO: renamed from: f */
    public String f3814f;

    /* JADX INFO: renamed from: g */
    public TopicMoment f3815g;

    /* JADX INFO: renamed from: h */
    public HashMap<String, Boolean> f3816h;

    /* JADX INFO: renamed from: i */
    public boolean f3817i;

    public FeedCanVoteContentView(@NonNull Context context) {
        super(context);
        this.f3817i = false;
        m6182k(context);
    }

    /* JADX INFO: renamed from: h */
    public View m6179h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return drg.m9564b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public Act m6180i() {
        return this.f3813e;
    }

    /* JADX INFO: renamed from: j */
    public void m6181j(int i) {
        this.f3812d.setVisibility(i);
        this.f3816h.put(this.f3815g.f708id, Boolean.valueOf(i == 0));
    }

    /* JADX INFO: renamed from: k */
    public final void m6182k(Context context) {
        this.f3813e = context;
        addView(m6179h(LayoutInflater.from(context), this));
        m6180i().duringCreated(FeedModule.f316d.m16523P7()).subscribe(mkd0.G(new e30() { // from class: l.wqg
            public final void call(Object obj) {
                this.f14661a.m6183l((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m6183l(Map map) {
        List<VoteOptions> list;
        boolean z;
        TopicMoment topicMoment = this.f3815g;
        if (topicMoment != null) {
            TopicMoment topicMoment2 = (TopicMoment) map.get(topicMoment.f708id);
            if (topicMoment2 != null && (list = topicMoment2.options) != null) {
                TopicMoment topicMoment3 = this.f3815g;
                topicMoment3.options = list;
                topicMoment3.voteCounter = topicMoment2.voteCounter;
                this.f3811c.m7126b(topicMoment2, true, this.f3814f);
                this.f3810b.setText(String.format("%s人参与了投票 ", i0g0.u(this.f3815g.voteCounter)));
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
                    m6181j(8);
                }
            }
            if (map.containsKey("666666")) {
                m6181j(8);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m6184m(TopicMoment topicMoment, View view) {
        vqg.m15542t0(topicMoment, m6180i());
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m6185n(TopicMoment topicMoment, View view) {
        String str = this.f3814f;
        String strM15485K = vqg.m15485K(str, TextUtils.equals(str, "from_album"));
        if (TextUtils.isEmpty(this.f3814f)) {
            strM15485K = "p_user_moment_interactions_details_view";
        }
        p6j0.m12913c("e_moment_post", strM15485K, new j760("posted_source", TextUtils.isEmpty(this.f3814f) ? "p_user_moment_interactions_details_view" : this.f3814f), new j760("topic_id", topicMoment.f708id));
        if (nkg.m12254n0()) {
            m6191t(false);
        } else {
            oe40.m12548M(m6180i(), new NewPostAct.C2088a(m6180i()).m3707m(topicMoment).m3704j(false).m3701g(true).m3696b("分享你的观点，可以获得更大曝光…"));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m6186o() {
        m6191t(true);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m6187p(TopicMoment topicMoment, FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView) {
        this.f3810b.setText(String.format("%s人参与了投票 ", i0g0.u(topicMoment.voteCounter)));
        m6180i().postDelayed(new Runnable() { // from class: l.brg
            @Override // java.lang.Runnable
            public final void run() {
                this.f6418a.m6186o();
            }
        }, feedQaTopicVoteListGroupView.getAnimTime());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m6188q() {
        this.f3812d.setVisibility(8);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ boolean m6189r(boolean z, int i, int i2, Intent intent) {
        if (!z) {
            return false;
        }
        if (intent != null) {
            m6181j(8);
        } else {
            m6181j(0);
            this.f3816h.put(this.f3815g.f708id, Boolean.TRUE);
            String str = this.f3814f;
            String strM15485K = vqg.m15485K(str, TextUtils.equals(str, "from_album"));
            if (TextUtils.isEmpty(this.f3814f)) {
                strM15485K = "p_user_moment_interactions_details_view";
            }
            p6j0.m12915e("e_moment_post", strM15485K, new j760("posted_source", TextUtils.isEmpty(this.f3814f) ? "p_user_moment_interactions_details_view" : this.f3814f), new j760("topic_id", this.f3815g.f708id));
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public void m6190s(final TopicMoment topicMoment) {
        if (nkg.m12254n0()) {
            setOnClickListener(new View.OnClickListener() { // from class: l.xqg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15071a.m6184m(topicMoment, view);
                }
            });
        }
        this.f3815g = topicMoment;
        this.f3809a.setText(topicMoment.name);
        this.f3810b.setText(String.format("%s人参与了投票 ", i0g0.u(topicMoment.voteCounter)));
        this.f3811c.m7126b(topicMoment, true, this.f3814f);
        if (this.f3816h == null) {
            this.f3816h = new HashMap<>();
        }
        Boolean bool = this.f3816h.get(topicMoment.f708id);
        if (bool == null || !bool.booleanValue()) {
            xdl0.M(this.f3812d, false);
        } else {
            xdl0.M(this.f3812d, true);
            if (nkg.m12254n0() && !this.f3817i && !TextUtils.isEmpty(this.f3814f)) {
                this.f3817i = true;
                String str = this.f3814f;
                String strM15485K = vqg.m15485K(str, TextUtils.equals(str, "from_album"));
                if (TextUtils.isEmpty(this.f3814f)) {
                    strM15485K = "p_user_moment_interactions_details_view";
                }
                p6j0.m12915e("e_moment_post", strM15485K, new j760("posted_source", TextUtils.isEmpty(this.f3814f) ? "p_user_moment_interactions_details_view" : this.f3814f), new j760("topic_id", topicMoment.f708id));
            }
        }
        this.f3812d.setOnClickListener(new View.OnClickListener() { // from class: l.yqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15492a.m6185n(topicMoment, view);
            }
        });
        final FeedQaTopicVoteListGroupView showVoteListView = this.f3811c.getShowVoteListView();
        if (showVoteListView != null) {
            showVoteListView.setVoteSuccess(new d30() { // from class: l.zqg
                public final void call() {
                    this.f15837a.m6187p(topicMoment, showVoteListView);
                }
            });
            showVoteListView.setCancelSuccess(new d30() { // from class: l.arg
                public final void call() {
                    this.f5808a.m6188q();
                }
            });
        }
    }

    public void setFrom(String str) {
        this.f3814f = str;
    }

    /* JADX INFO: renamed from: t */
    public void m6191t(final boolean z) {
        Intent intent = new Intent((Context) m6180i(), (Class<?>) FeedQaInputAct.class);
        intent.putExtra("topicMoment", this.f3815g);
        intent.putExtra("from", this.f3814f);
        m6180i().startActivityForResult(intent, new a.a() { // from class: l.crg
            /* JADX INFO: renamed from: a */
            public final boolean m9225a(int i, int i2, Intent intent2) {
                return this.f6717a.m6189r(z, i, i2, intent2);
            }
        });
    }

    public FeedCanVoteContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3817i = false;
        m6182k(context);
    }

    public FeedCanVoteContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3817i = false;
        m6182k(context);
    }
}
