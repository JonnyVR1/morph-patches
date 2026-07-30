package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import l.j760;
import l.vwb;
import l.w9j;
import l.xdl0;
import p007l.g1j0;
import p007l.l80;
import p007l.p6j0;
import p007l.xhc0;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicRecommendTopicView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f4022c;

    /* JADX INFO: renamed from: d */
    public TextView f4023d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f4024e;

    /* JADX INFO: renamed from: f */
    public xhc0 f4025f;

    /* JADX INFO: renamed from: g */
    public String f4026g;

    /* JADX INFO: renamed from: h */
    public C2124a f4027h;

    /* JADX INFO: renamed from: i */
    public HashSet<TopicMoment> f4028i;

    /* JADX INFO: renamed from: j */
    public l80 f4029j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView$a */
    public class C2156a extends l80<TopicMoment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView$a$a */
        public class a extends ViewPager.m {
            public a() {
            }

            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C2156a.this.m11597o();
                }
            }
        }

        public C2156a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: f */
        public void mo2865f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) TopicRecommendTopicView.this.f4027h.m4942P(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.d(new a());
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(TopicMoment topicMoment, int i) {
            if (TopicRecommendTopicView.this.f4028i.add(topicMoment)) {
                p6j0.m12915e("e_related_topic_suggest", TopicRecommendTopicView.this.getPageId(), new j760("topic_id", topicMoment.f708id));
            }
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(TopicMoment topicMoment, int i, long j) {
            TopicRecommendTopicView.this.f4028i.remove(topicMoment);
        }
    }

    public TopicRecommendTopicView(Context context) {
        super(context);
        this.f4028i = new HashSet<>();
        this.f4029j = new C2156a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        return ("qa_latest".equals(this.f4026g) || "topic_latest".equals(this.f4026g)) ? "p_topic_latest" : "p_topic_recommend";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m6366r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f4024e.setLayoutManager(linearLayoutManager);
        xhc0 xhc0Var = new xhc0(getContext(), this.f4026g, this.f4029j);
        this.f4025f = xhc0Var;
        this.f4024e.setAdapter(xhc0Var);
    }

    /* JADX INFO: renamed from: T */
    public final void m6367T(View view) {
        g1j0.m10362a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public void m6368V() {
        this.f4028i.clear();
    }

    /* JADX INFO: renamed from: W */
    public void m6369W(C2124a c2124a, j760<TopicOperations, List<TopicMoment>> j760Var, String str) {
        Object obj;
        if (j760Var == null || (obj = j760Var.a) == null || vwb.J(((TopicOperations) obj).recommendTopics) || vwb.J((Collection) j760Var.b)) {
            xdl0.M(this.f4022c, false);
            return;
        }
        this.f4026g = str;
        this.f4027h = c2124a;
        this.f4023d.setText(((TopicOperations) j760Var.a).name);
        m6366r();
        ArrayList arrayList = new ArrayList();
        for (final String str2 : ((TopicOperations) j760Var.a).recommendTopics) {
            TopicMoment topicMoment = (TopicMoment) vwb.r((Collection) j760Var.b, new w9j() { // from class: l.f1j0
                public final Object call(Object obj2) {
                    return Boolean.valueOf(((TopicMoment) obj2).f708id.equals(str2));
                }
            });
            if (NullChecker.a(topicMoment)) {
                arrayList.add(topicMoment);
            }
        }
        boolean zJ = vwb.J(arrayList);
        VLinear vLinear = this.f4022c;
        if (zJ) {
            xdl0.M(vLinear, false);
        } else {
            xdl0.M(vLinear, true);
            this.f4025f.m16096L(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6367T(this);
    }

    public TopicRecommendTopicView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4028i = new HashSet<>();
        this.f4029j = new C2156a();
    }

    public TopicRecommendTopicView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4028i = new HashSet<>();
        this.f4029j = new C2156a();
    }
}
