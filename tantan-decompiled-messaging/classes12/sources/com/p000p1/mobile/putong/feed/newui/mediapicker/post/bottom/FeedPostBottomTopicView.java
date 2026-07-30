package com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.data.TopicCategorie;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2089a;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.f30;
import l.j760;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import p007l.l80;
import p007l.lyg;
import p007l.me5;
import p007l.nkg;
import p007l.zi60;
import v.VFrame;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostBottomTopicView extends VFrame {

    /* JADX INFO: renamed from: a */
    public Act f2220a;

    /* JADX INFO: renamed from: b */
    public C2089a f2221b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f2222c;

    /* JADX INFO: renamed from: d */
    public me5 f2223d;

    /* JADX INFO: renamed from: e */
    public j760<List<TopicCategorie>, List<TopicMoment>> f2224e;

    /* JADX INFO: renamed from: f */
    public d30 f2225f;

    /* JADX INFO: renamed from: g */
    public String f2226g;

    /* JADX INFO: renamed from: h */
    public e30<ArrayList<TopicMoment>> f2227h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTopicView$a */
    public class C2095a extends RecyclerView.n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2228a;

        public C2095a(int i) {
            this.f2228a = i;
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            rect.left = 0;
            rect.right = this.f2228a;
            rect.top = 0;
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTopicView$b */
    public class C2096b extends l80<TopicMoment> {
        public C2096b() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(TopicMoment topicMoment, int i) {
            if (i != 0) {
                if (nkg.m12258p0()) {
                    zi60.m17436w().m17447d(topicMoment, "p_moment_post", j760.a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(FeedPostBottomTopicView.this.f2226g) ? 1 : 2)));
                } else {
                    zi60.m17436w().m17446c(topicMoment, "p_moment_post");
                }
                if (topicMoment.isActivityTopic()) {
                    zvf0.A("e_active_info", "p_moment_post", new j760[]{vwb.Y("topic_id", topicMoment.f708id)});
                }
            }
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(TopicMoment topicMoment, int i, long j) {
        }
    }

    public FeedPostBottomTopicView(Context context) {
        super(context);
        this.f2227h = new e30() { // from class: l.bsh
            public final void call(Object obj) {
                this.f6422a.m3988B((ArrayList) obj);
            }
        };
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m3988B(ArrayList arrayList) {
        this.f2221b.m3766S1(arrayList);
    }

    /* JADX INFO: renamed from: C */
    public void m3989C(String str, List<TopicMoment> list) {
        this.f2226g = str;
        this.f2223d.m11927Q(str, list);
    }

    /* JADX INFO: renamed from: E */
    public void m3990E() {
        this.f2223d.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m3991F(j760<List<TopicCategorie>, List<TopicMoment>> j760Var) {
        this.f2224e = j760Var;
    }

    /* JADX INFO: renamed from: G */
    public void m3992G() {
        this.f2221b.m3767T1(this.f2224e);
        this.f2220a.hideInput();
        j760<List<TopicCategorie>, List<TopicMoment>> j760Var = this.f2224e;
        if (j760Var == null) {
            return;
        }
        List list = (List) j760Var.b;
        if (!vwb.J(this.f2221b.f2123e)) {
            for (final TopicMoment topicMoment : this.f2221b.f2123e) {
                if (!vwb.m(list, new w9j() { // from class: l.csh
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TopicMoment) obj).f708id.equals(topicMoment.f708id));
                    }
                })) {
                    topicMoment.selected = true;
                    list.add(topicMoment);
                }
            }
        }
        new lyg.C2422a(this.f2220a).m11720d((xdl0.x0(this.f2220a) - xdl0.F0()) - xdl0.I(this.f2220a)).m11721e(this.f2224e).m11722f("TWO_LINKAGE_TYPE").m11719c(this.f2227h).m11718b();
    }

    /* JADX INFO: renamed from: K */
    public void m3993K() {
        if (NullChecker.a(this.f2225f)) {
            this.f2225f.call();
        } else {
            zvf0.r("e_pick_topic", "p_moment_post");
            m3992G();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m3994L(String str, TopicMoment topicMoment) {
        if (this.f2223d.m11922L(topicMoment) != 0) {
            if (nkg.m12258p0()) {
                zi60.m17436w().m17445b(topicMoment, "p_moment_post", j760.a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(str) ? 1 : 2)));
            } else {
                zi60.m17436w().m17444a(topicMoment, "p_moment_post");
            }
            this.f2221b.m3765S0(topicMoment);
            return;
        }
        if (NullChecker.a(this.f2225f)) {
            this.f2225f.call();
        } else {
            zvf0.r("e_pick_topic", "p_moment_post");
            m3992G();
        }
    }

    public List<TopicMoment> getTopicList() {
        return this.f2223d.f10439d;
    }

    public void setAddTopicClickHooker(d30 d30Var) {
        this.f2225f = d30Var;
    }

    /* JADX INFO: renamed from: w */
    public final void m3995w() {
        this.f2222c.addItemDecoration(new C2095a(t100.d(4.0f)));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f2220a);
        linearLayoutManager.setOrientation(0);
        this.f2222c.setLayoutManager(linearLayoutManager);
        me5 me5Var = new me5(this.f2220a);
        this.f2223d = me5Var;
        me5Var.m9685E(new C2096b());
        this.f2222c.setAdapter(this.f2223d);
        this.f2223d.m11928R(new f30() { // from class: l.dsh
            public final void call(Object obj, Object obj2) {
                this.f7046a.m3994L((String) obj, (TopicMoment) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public void m3996z(Act act, C2089a c2089a) {
        this.f2220a = act;
        this.f2221b = c2089a;
        this.f2222c = new VRecyclerView(act);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.f2222c.setLayoutParams(layoutParams);
        this.f2222c.setPadding(t100.d(18.0f), 0, t100.m, 0);
        this.f2222c.setClipToPadding(false);
        addView(this.f2222c);
        m3995w();
    }

    public FeedPostBottomTopicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2227h = new e30() { // from class: l.bsh
            public final void call(Object obj) {
                this.f6422a.m3988B((ArrayList) obj);
            }
        };
    }

    public FeedPostBottomTopicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2227h = new e30() { // from class: l.bsh
            public final void call(Object obj) {
                this.f6422a.m3988B((ArrayList) obj);
            }
        };
    }
}
