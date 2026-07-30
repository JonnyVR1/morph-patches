package com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicCategorie;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11245a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p147v.VRecyclerView;
import p149l.d30;
import p149l.e30;
import p149l.f30;
import p149l.j760;
import p149l.l80;
import p149l.lyg;
import p149l.me5;
import p149l.nkg;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zi60;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostBottomTopicView extends VFrame {

    /* JADX INFO: renamed from: a */
    public Act f40759a;

    /* JADX INFO: renamed from: b */
    public C11245a f40760b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f40761c;

    /* JADX INFO: renamed from: d */
    public me5 f40762d;

    /* JADX INFO: renamed from: e */
    public j760<List<TopicCategorie>, List<TopicMoment>> f40763e;

    /* JADX INFO: renamed from: f */
    public d30 f40764f;

    /* JADX INFO: renamed from: g */
    public String f40765g;

    /* JADX INFO: renamed from: h */
    public e30<ArrayList<TopicMoment>> f40766h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTopicView$a */
    public class C11251a extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f40767a;

        public C11251a(int i) {
            this.f40767a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            rect.left = 0;
            rect.right = this.f40767a;
            rect.top = 0;
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTopicView$b */
    public class C11252b extends l80<TopicMoment> {
        public C11252b() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(TopicMoment topicMoment, int i) {
            if (i != 0) {
                if (nkg.m159899p0()) {
                    zi60.m218961w().m218972d(topicMoment, "p_moment_post", j760.m140076a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(FeedPostBottomTopicView.this.f40765g) ? 1 : 2)));
                } else {
                    zi60.m218961w().m218971c(topicMoment, "p_moment_post");
                }
                if (topicMoment.isActivityTopic()) {
                    zvf0.m220368A("e_active_info", "p_moment_post", vwb.m200311Y("topic_id", topicMoment.f39247id));
                }
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(TopicMoment topicMoment, int i, long j) {
        }
    }

    public FeedPostBottomTopicView(Context context) {
        super(context);
        this.f40766h = new e30() { // from class: l.bsh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77086a.m62972B((ArrayList) obj);
            }
        };
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m62972B(ArrayList arrayList) {
        this.f40760b.m62760S1(arrayList);
    }

    /* JADX INFO: renamed from: C */
    public void m62973C(String str, List<TopicMoment> list) {
        this.f40765g = str;
        this.f40762d.m154139Q(str, list);
    }

    /* JADX INFO: renamed from: E */
    public void m62974E() {
        this.f40762d.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m62975F(j760<List<TopicCategorie>, List<TopicMoment>> j760Var) {
        this.f40763e = j760Var;
    }

    /* JADX INFO: renamed from: G */
    public void m62976G() {
        this.f40760b.m62761T1(this.f40763e);
        this.f40759a.hideInput();
        j760<List<TopicCategorie>, List<TopicMoment>> j760Var = this.f40763e;
        if (j760Var == null) {
            return;
        }
        List<TopicMoment> list = j760Var.f116565b;
        if (!vwb.m200296J(this.f40760b.f40662e)) {
            for (final TopicMoment topicMoment : this.f40760b.f40662e) {
                if (!vwb.m200337m(list, new w9j() { // from class: l.csh
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(topicMoment.f39247id));
                    }
                })) {
                    topicMoment.selected = true;
                    list.add(topicMoment);
                }
            }
        }
        new lyg.C18354a(this.f40759a).m152253d((xdl0.m208410x0(this.f40759a) - xdl0.m208331F0()) - xdl0.m208336I(this.f40759a)).m152254e(this.f40763e).m152255f("TWO_LINKAGE_TYPE").m152252c(this.f40766h).m152251b();
    }

    /* JADX INFO: renamed from: K */
    public void m62977K() {
        if (NullChecker.m81303a(this.f40764f)) {
            this.f40764f.call();
        } else {
            zvf0.m220396r("e_pick_topic", "p_moment_post");
            m62976G();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m62978L(String str, TopicMoment topicMoment) {
        if (this.f40762d.m154134L(topicMoment) != 0) {
            if (nkg.m159899p0()) {
                zi60.m218961w().m218970b(topicMoment, "p_moment_post", j760.m140076a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(str) ? 1 : 2)));
            } else {
                zi60.m218961w().m218969a(topicMoment, "p_moment_post");
            }
            this.f40760b.m62759S0(topicMoment);
            return;
        }
        if (NullChecker.m81303a(this.f40764f)) {
            this.f40764f.call();
        } else {
            zvf0.m220396r("e_pick_topic", "p_moment_post");
            m62976G();
        }
    }

    public List<TopicMoment> getTopicList() {
        return this.f40762d.f133361d;
    }

    public void setAddTopicClickHooker(d30 d30Var) {
        this.f40764f = d30Var;
    }

    /* JADX INFO: renamed from: w */
    public final void m62979w() {
        this.f40761c.addItemDecoration(new C11251a(t100.m186890d(4.0f)));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f40759a);
        linearLayoutManager.setOrientation(0);
        this.f40761c.setLayoutManager(linearLayoutManager);
        me5 me5Var = new me5(this.f40759a);
        this.f40762d = me5Var;
        me5Var.m115416E(new C11252b());
        this.f40761c.setAdapter(this.f40762d);
        this.f40762d.m154140R(new f30() { // from class: l.dsh
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f87767a.m62978L((String) obj, (TopicMoment) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m62980z(Act act, C11245a c11245a) {
        this.f40759a = act;
        this.f40760b = c11245a;
        this.f40761c = new VRecyclerView(act);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.f40761c.setLayoutParams(layoutParams);
        this.f40761c.setPadding(t100.m186890d(18.0f), 0, t100.f167264m, 0);
        this.f40761c.setClipToPadding(false);
        addView(this.f40761c);
        m62979w();
    }

    public FeedPostBottomTopicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40766h = new e30() { // from class: l.bsh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77086a.m62972B((ArrayList) obj);
            }
        };
    }

    public FeedPostBottomTopicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40766h = new e30() { // from class: l.bsh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77086a.m62972B((ArrayList) obj);
            }
        };
    }
}
