package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p147v.VLinear;
import p147v.VRecyclerView;
import p149l.g1j0;
import p149l.j760;
import p149l.l80;
import p149l.p6j0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xhc0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicRecommendTopicView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f42561c;

    /* JADX INFO: renamed from: d */
    public TextView f42562d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f42563e;

    /* JADX INFO: renamed from: f */
    public xhc0 f42564f;

    /* JADX INFO: renamed from: g */
    public String f42565g;

    /* JADX INFO: renamed from: h */
    public C11280a f42566h;

    /* JADX INFO: renamed from: i */
    public HashSet<TopicMoment> f42567i;

    /* JADX INFO: renamed from: j */
    public l80 f42568j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView$a */
    public class C11312a extends l80<TopicMoment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView$a$a */
        public class a extends ViewPager.C0719m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C11312a.this.m148842o();
                }
            }
        }

        public C11312a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: f */
        public void mo55694f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) TopicRecommendTopicView.this.f42566h.m63905P(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4185d(new a());
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(TopicMoment topicMoment, int i) {
            if (TopicRecommendTopicView.this.f42567i.add(topicMoment)) {
                p6j0.m167671e("e_related_topic_suggest", TopicRecommendTopicView.this.getPageId(), new j760("topic_id", topicMoment.f39247id));
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(TopicMoment topicMoment, int i, long j) {
            TopicRecommendTopicView.this.f42567i.remove(topicMoment);
        }
    }

    public TopicRecommendTopicView(Context context) {
        super(context);
        this.f42567i = new HashSet<>();
        this.f42568j = new C11312a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        return ("qa_latest".equals(this.f42565g) || "topic_latest".equals(this.f42565g)) ? "p_topic_latest" : "p_topic_recommend";
    }

    /* JADX INFO: renamed from: r */
    private void m65265r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f42563e.setLayoutManager(linearLayoutManager);
        xhc0 xhc0Var = new xhc0((Act) getContext(), this.f42565g, this.f42568j);
        this.f42564f = xhc0Var;
        this.f42563e.setAdapter(xhc0Var);
    }

    /* JADX INFO: renamed from: T */
    public final void m65266T(View view) {
        g1j0.m124082a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public void m65267V() {
        this.f42567i.clear();
    }

    /* JADX INFO: renamed from: W */
    public void m65268W(C11280a c11280a, j760<TopicOperations, List<TopicMoment>> j760Var, String str) {
        TopicOperations topicOperations;
        if (j760Var == null || (topicOperations = j760Var.f116564a) == null || vwb.m200296J(topicOperations.recommendTopics) || vwb.m200296J(j760Var.f116565b)) {
            xdl0.m208344M(this.f42561c, false);
            return;
        }
        this.f42565g = str;
        this.f42566h = c11280a;
        this.f42562d.setText(j760Var.f116564a.name);
        m65265r();
        ArrayList arrayList = new ArrayList();
        for (final String str2 : j760Var.f116564a.recommendTopics) {
            TopicMoment topicMoment = (TopicMoment) vwb.m200346r(j760Var.f116565b, new w9j() { // from class: l.f1j0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(str2));
                }
            });
            if (NullChecker.m81303a(topicMoment)) {
                arrayList.add(topicMoment);
            }
        }
        boolean zM200296J = vwb.m200296J(arrayList);
        VLinear vLinear = this.f42561c;
        if (zM200296J) {
            xdl0.m208344M(vLinear, false);
        } else {
            xdl0.m208344M(vLinear, true);
            this.f42564f.m208786L(arrayList);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65266T(this);
    }

    public TopicRecommendTopicView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42567i = new HashSet<>();
        this.f42568j = new C11312a();
    }

    public TopicRecommendTopicView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42567i = new HashSet<>();
        this.f42568j = new C11312a();
    }
}
