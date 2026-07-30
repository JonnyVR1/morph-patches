package com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicCategorie;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11408a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p151v.VRecyclerView;
import p153l.a0h;
import p153l.bnl0;
import p153l.cmg;
import p153l.er60;
import p153l.h80;
import p153l.i4g0;
import p153l.jyb;
import p153l.mf5;
import p153l.pf60;
import p153l.qa00;
import p153l.qcj;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostBottomTopicView extends VFrame {

    /* JADX INFO: renamed from: a */
    public Act f41607a;

    /* JADX INFO: renamed from: b */
    public C11408a f41608b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f41609c;

    /* JADX INFO: renamed from: d */
    public mf5 f41610d;

    /* JADX INFO: renamed from: e */
    public pf60<List<TopicCategorie>, List<TopicMoment>> f41611e;

    /* JADX INFO: renamed from: f */
    public x20 f41612f;

    /* JADX INFO: renamed from: g */
    public String f41613g;

    /* JADX INFO: renamed from: h */
    public y20<ArrayList<TopicMoment>> f41614h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTopicView$a */
    public class C11414a extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f41615a;

        public C11414a(int i) {
            this.f41615a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            rect.left = 0;
            rect.right = this.f41615a;
            rect.top = 0;
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTopicView$b */
    public class C11415b extends h80<TopicMoment> {
        public C11415b() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(TopicMoment topicMoment, int i) {
            if (i != 0) {
                if (cmg.m111228p0()) {
                    er60.m122104w().m122115d(topicMoment, "p_moment_post", pf60.m172085a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(FeedPostBottomTopicView.this.f41613g) ? 1 : 2)));
                } else {
                    er60.m122104w().m122114c(topicMoment, "p_moment_post");
                }
                if (topicMoment.isActivityTopic()) {
                    i4g0.m138492A("e_active_info", "p_moment_post", jyb.m147494Y("topic_id", topicMoment.f40095id));
                }
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(TopicMoment topicMoment, int i, long j) {
        }
    }

    public FeedPostBottomTopicView(Context context) {
        super(context);
        this.f41614h = new y20() { // from class: l.qth
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159443a.m64155B((ArrayList) obj);
            }
        };
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m64155B(ArrayList arrayList) {
        this.f41608b.m63943S1(arrayList);
    }

    /* JADX INFO: renamed from: C */
    public void m64156C(String str, List<TopicMoment> list) {
        this.f41613g = str;
        this.f41610d.m158145Q(str, list);
    }

    /* JADX INFO: renamed from: E */
    public void m64157E() {
        this.f41610d.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m64158F(pf60<List<TopicCategorie>, List<TopicMoment>> pf60Var) {
        this.f41611e = pf60Var;
    }

    /* JADX INFO: renamed from: G */
    public void m64159G() {
        this.f41608b.m63944T1(this.f41611e);
        this.f41607a.hideInput();
        pf60<List<TopicCategorie>, List<TopicMoment>> pf60Var = this.f41611e;
        if (pf60Var == null) {
            return;
        }
        List<TopicMoment> list = pf60Var.f152157b;
        if (!jyb.m147479J(this.f41608b.f41510e)) {
            for (final TopicMoment topicMoment : this.f41608b.f41510e) {
                if (!jyb.m147520m(list, new qcj() { // from class: l.rth
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(topicMoment.f40095id));
                    }
                })) {
                    topicMoment.selected = true;
                    list.add(topicMoment);
                }
            }
        }
        new a0h.C15613a(this.f41607a).m95400d((bnl0.m105590x0(this.f41607a) - bnl0.m105511F0()) - bnl0.m105516I(this.f41607a)).m95401e(this.f41611e).m95402f("TWO_LINKAGE_TYPE").m95399c(this.f41614h).m95398b();
    }

    /* JADX INFO: renamed from: K */
    public void m64160K() {
        if (NullChecker.m82486a(this.f41612f)) {
            this.f41612f.call();
        } else {
            i4g0.m138520r("e_pick_topic", "p_moment_post");
            m64159G();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m64161L(String str, TopicMoment topicMoment) {
        if (this.f41610d.m158140L(topicMoment) != 0) {
            if (cmg.m111228p0()) {
                er60.m122104w().m122113b(topicMoment, "p_moment_post", pf60.m172085a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(str) ? 1 : 2)));
            } else {
                er60.m122104w().m122112a(topicMoment, "p_moment_post");
            }
            this.f41608b.m63942S0(topicMoment);
            return;
        }
        if (NullChecker.m82486a(this.f41612f)) {
            this.f41612f.call();
        } else {
            i4g0.m138520r("e_pick_topic", "p_moment_post");
            m64159G();
        }
    }

    public List<TopicMoment> getTopicList() {
        return this.f41610d.f136606d;
    }

    public void setAddTopicClickHooker(x20 x20Var) {
        this.f41612f = x20Var;
    }

    /* JADX INFO: renamed from: w */
    public final void m64162w() {
        this.f41609c.addItemDecoration(new C11414a(qa00.m175859d(4.0f)));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f41607a);
        linearLayoutManager.setOrientation(0);
        this.f41609c.setLayoutManager(linearLayoutManager);
        mf5 mf5Var = new mf5(this.f41607a);
        this.f41610d = mf5Var;
        mf5Var.m149868E(new C11415b());
        this.f41609c.setAdapter(this.f41610d);
        this.f41610d.m158146R(new z20() { // from class: l.sth
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f170570a.m64161L((String) obj, (TopicMoment) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m64163z(Act act, C11408a c11408a) {
        this.f41607a = act;
        this.f41608b = c11408a;
        this.f41609c = new VRecyclerView(act);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.f41609c.setLayoutParams(layoutParams);
        this.f41609c.setPadding(qa00.m175859d(18.0f), 0, qa00.f156326m, 0);
        this.f41609c.setClipToPadding(false);
        addView(this.f41609c);
        m64162w();
    }

    public FeedPostBottomTopicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41614h = new y20() { // from class: l.qth
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159443a.m64155B((ArrayList) obj);
            }
        };
    }

    public FeedPostBottomTopicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41614h = new y20() { // from class: l.qth
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159443a.m64155B((ArrayList) obj);
            }
        };
    }
}
