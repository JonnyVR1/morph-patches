package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p151v.VLinear;
import p151v.VRecyclerView;
import p153l.bnl0;
import p153l.eqc0;
import p153l.h80;
import p153l.jyb;
import p153l.kaj0;
import p153l.pf60;
import p153l.qcj;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class TopicRecommendTopicView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f43409c;

    /* JADX INFO: renamed from: d */
    public TextView f43410d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f43411e;

    /* JADX INFO: renamed from: f */
    public eqc0 f43412f;

    /* JADX INFO: renamed from: g */
    public String f43413g;

    /* JADX INFO: renamed from: h */
    public C11443a f43414h;

    /* JADX INFO: renamed from: i */
    public HashSet<TopicMoment> f43415i;

    /* JADX INFO: renamed from: j */
    public h80 f43416j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView$a */
    public class C11475a extends h80<TopicMoment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView$a$a */
        public class a extends ViewPager.C0721m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C11475a.this.m133884o();
                }
            }
        }

        public C11475a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: f */
        public void mo56877f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) TopicRecommendTopicView.this.f43414h.m65088P(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4187d(new a());
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(TopicMoment topicMoment, int i) {
            if (TopicRecommendTopicView.this.f43415i.add(topicMoment)) {
                tfj0.m190942e("e_related_topic_suggest", TopicRecommendTopicView.this.getPageId(), new pf60("topic_id", topicMoment.f40095id));
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(TopicMoment topicMoment, int i, long j) {
            TopicRecommendTopicView.this.f43415i.remove(topicMoment);
        }
    }

    public TopicRecommendTopicView(Context context) {
        super(context);
        this.f43415i = new HashSet<>();
        this.f43416j = new C11475a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        return ("qa_latest".equals(this.f43413g) || "topic_latest".equals(this.f43413g)) ? "p_topic_latest" : "p_topic_recommend";
    }

    /* JADX INFO: renamed from: r */
    private void m66448r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f43411e.setLayoutManager(linearLayoutManager);
        eqc0 eqc0Var = new eqc0((Act) getContext(), this.f43413g, this.f43416j);
        this.f43412f = eqc0Var;
        this.f43411e.setAdapter(eqc0Var);
    }

    /* JADX INFO: renamed from: T */
    public final void m66449T(View view) {
        kaj0.m148989a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public void m66450V() {
        this.f43415i.clear();
    }

    /* JADX INFO: renamed from: W */
    public void m66451W(C11443a c11443a, pf60<TopicOperations, List<TopicMoment>> pf60Var, String str) {
        TopicOperations topicOperations;
        if (pf60Var == null || (topicOperations = pf60Var.f152156a) == null || jyb.m147479J(topicOperations.recommendTopics) || jyb.m147479J(pf60Var.f152157b)) {
            bnl0.m105524M(this.f43409c, false);
            return;
        }
        this.f43413g = str;
        this.f43414h = c11443a;
        this.f43410d.setText(pf60Var.f152156a.name);
        m66448r();
        ArrayList arrayList = new ArrayList();
        for (final String str2 : pf60Var.f152156a.recommendTopics) {
            TopicMoment topicMoment = (TopicMoment) jyb.m147529r(pf60Var.f152157b, new qcj() { // from class: l.jaj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(str2));
                }
            });
            if (NullChecker.m82486a(topicMoment)) {
                arrayList.add(topicMoment);
            }
        }
        boolean zM147479J = jyb.m147479J(arrayList);
        VLinear vLinear = this.f43409c;
        if (zM147479J) {
            bnl0.m105524M(vLinear, false);
        } else {
            bnl0.m105524M(vLinear, true);
            this.f43412f.m121913L(arrayList);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66449T(this);
    }

    public TopicRecommendTopicView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43415i = new HashSet<>();
        this.f43416j = new C11475a();
    }

    public TopicRecommendTopicView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43415i = new HashSet<>();
        this.f43416j = new C11475a();
    }
}
