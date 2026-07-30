package p007l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.GroupIdBox;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p000p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l.cwf0;
import l.e30;
import l.i0g0;
import l.j760;
import l.mkd0;
import l.mu5;
import l.qib0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.zvf0;
import p007l.y6i;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLine;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class i7i<P extends y6i> implements s7m<P>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public FeedTopicMomentFragment f8921A;

    /* JADX INFO: renamed from: B */
    public FeedTopicMomentFragment f8922B;

    /* JADX INFO: renamed from: C */
    public y6i f8923C;

    /* JADX INFO: renamed from: D */
    public int f8924D;

    /* JADX INFO: renamed from: E */
    public int f8925E;

    /* JADX INFO: renamed from: F */
    public ViewTreeObserver.OnGlobalLayoutListener f8926F = new ViewTreeObserverOnGlobalLayoutListenerC2395a();

    /* JADX INFO: renamed from: G */
    public AppBarLayout.OnOffsetChangedListener f8927G = new AppBarLayout.OnOffsetChangedListener() { // from class: l.z6i
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f15608a.m10799M(appBarLayout, i);
        }
    };

    /* JADX INFO: renamed from: H */
    public TopicMoment f8928H;

    /* JADX INFO: renamed from: a */
    public CoordinatorLayout f8929a;

    /* JADX INFO: renamed from: b */
    public AppBarLayout f8930b;

    /* JADX INFO: renamed from: c */
    public CollapsingToolbarLayout f8931c;

    /* JADX INFO: renamed from: d */
    public Toolbar f8932d;

    /* JADX INFO: renamed from: e */
    public VImage f8933e;

    /* JADX INFO: renamed from: f */
    public TextView f8934f;

    /* JADX INFO: renamed from: g */
    public VLinear f8935g;

    /* JADX INFO: renamed from: h */
    public VRelative f8936h;

    /* JADX INFO: renamed from: i */
    public VLine f8937i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f8938j;

    /* JADX INFO: renamed from: k */
    public TextView f8939k;

    /* JADX INFO: renamed from: l */
    public TextView f8940l;

    /* JADX INFO: renamed from: m */
    public VExpandableTextContainer f8941m;

    /* JADX INFO: renamed from: n */
    public FeedTopicContentWithPluginView f8942n;

    /* JADX INFO: renamed from: o */
    public VFrame f8943o;

    /* JADX INFO: renamed from: p */
    public RelativeLayout f8944p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f8945q;

    /* JADX INFO: renamed from: r */
    public VImage f8946r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f8947s;

    /* JADX INFO: renamed from: t */
    public VText f8948t;

    /* JADX INFO: renamed from: u */
    public ConstraintLayout f8949u;

    /* JADX INFO: renamed from: v */
    public VText f8950v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f8951w;

    /* JADX INFO: renamed from: x */
    public FeedUserHeaderView f8952x;

    /* JADX INFO: renamed from: y */
    public VText f8953y;

    /* JADX INFO: renamed from: z */
    public FeedTopicAggregationBaseFrag f8954z;

    /* JADX INFO: renamed from: l.i7i$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC2395a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC2395a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (i7i.this.act() == null || i7i.this.f8936h.getMeasuredHeight() <= 0 || i7i.this.f8925E == i7i.this.f8936h.getMeasuredHeight()) {
                return;
            }
            i7i i7iVar = i7i.this;
            i7iVar.f8924D = xdl0.C(i7iVar.act()) + i7i.this.f8936h.getMeasuredHeight();
            i7i i7iVar2 = i7i.this;
            i7iVar2.f8925E = i7iVar2.f8936h.getMeasuredHeight();
            i7i.this.m10812Z();
        }
    }

    public i7i(FeedTopicAggregationBaseFrag feedTopicAggregationBaseFrag) {
        this.f8954z = feedTopicAggregationBaseFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m10777G(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m10778H(View view) {
        m10796F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m10779I(View view) {
        m10804R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m10780J(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final void m10793C() {
        FeedTopicContentWithPluginView feedTopicContentWithPluginView = this.f8942n;
        y6i y6iVar = this.f8923C;
        feedTopicContentWithPluginView.m7300c0(y6iVar.f15273a, y6iVar.f15278f, y6iVar.f15276d, this.f8954z, y6iVar.f15279g);
        if (!NullChecker.a(this.f8921A)) {
            this.f8921A = this.f8942n.getFeedRecommendTopicMomentFragment();
        }
        if (NullChecker.a(this.f8922B)) {
            return;
        }
        this.f8922B = this.f8942n.getFeedNewTopicMomentFragment();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10794C0() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void mo10795E(Bundle bundle) {
        this.f8933e.setOnClickListener(new View.OnClickListener() { // from class: l.a7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5626a.m10777G(view);
            }
        });
        this.f8932d.setTitle("");
        act().setSupportActionBar(this.f8932d);
        this.f8924D = t100.d(155.0f) + xdl0.C(act());
        m10812Z();
        xdl0.X(this.f8936h, xdl0.C(act()));
        this.f8930b.addOnOffsetChangedListener(this.f8927G);
        xdl0.X(this.f8947s, xdl0.C(act()) / 2);
        this.f8936h.getViewTreeObserver().addOnGlobalLayoutListener(this.f8926F);
        m10824z();
        xdl0.E0(this.f8935g, new View.OnClickListener() { // from class: l.b7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6167a.m10778H(view);
            }
        });
        xdl0.C0(this.f8945q, xdl0.C(act()));
        this.f8948t.setOnClickListener(new View.OnClickListener() { // from class: l.c7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6554a.m10779I(view);
            }
        });
        this.f8946r.setOnClickListener(new View.OnClickListener() { // from class: l.d7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6862a.m10780J(view);
            }
        });
        this.f8941m.setOnSizeChangeEndListener(new VExpandableTextContainer.f() { // from class: l.e7i
            /* JADX INFO: renamed from: a */
            public final void m9682a(j760 j760Var) {
                this.f7245a.m10797K(j760Var);
            }
        });
        m10793C();
        m10815n();
        if (nkg.m12254n0()) {
            Act act = act();
            Objects.requireNonNull(act);
            act.duringCreated(FeedModule.f316d.m16523P7()).subscribe(mkd0.G(new e30() { // from class: l.f7i
                public final void call(Object obj) {
                    this.f8015a.m10798L((Map) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m10796F() {
        vqg.m15484J0(act());
        m10811Y(false);
        FeedModule.f316d.m16752vd();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m10797K(j760 j760Var) {
        if (NullChecker.a(this.f8926F)) {
            this.f8936h.getViewTreeObserver().removeOnGlobalLayoutListener(this.f8926F);
            this.f8926F = null;
        }
        int iIntValue = ((Integer) j760Var.a).intValue();
        int iIntValue2 = ((Integer) j760Var.b).intValue();
        int i = this.f8924D;
        if (iIntValue > iIntValue2) {
            this.f8924D = i + (((Integer) j760Var.a).intValue() - ((Integer) j760Var.b).intValue());
        } else {
            this.f8924D = i - (((Integer) j760Var.b).intValue() - ((Integer) j760Var.a).intValue());
        }
        m10812Z();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10798L(Map map) {
        m10793C();
        m10815n();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10799M(AppBarLayout appBarLayout, int i) {
        float fAbs = 1.0f;
        if (i < 0) {
            fAbs = Math.abs(i) >= this.f8925E ? 0.0f : 1.0f - ((Math.abs(i) * 1.0f) / this.f8925E);
        }
        if (NullChecker.a(this.f8936h)) {
            this.f8936h.setAlpha(fAbs);
            xdl0.M(this.f8934f, this.f8924D + i == xdl0.C(act()));
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10800N(TopicMoment topicMoment, View view) {
        m10817q(topicMoment.group);
        Act act = act();
        Objects.requireNonNull(act);
        act.startActivity(new FeedGroupDetailAct.C2044a(act(), topicMoment.group.f684id).m2961a());
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m10801O(TopicMoment topicMoment, View view) {
        zvf0.r("e_vote_user_entrance", "p_topic_detail");
        if (NullChecker.a(act())) {
            cxh.m9251a(act(), "", mu5.a("m") + "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/topic-conversation/index.html?speed=true&_bid=1003366&hideNavigationBar=1&hideNotch=1&topicId=" + topicMoment.f708id + "&description=" + m10821w(topicMoment));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m10802P() {
        this.f8942n.m7304j0();
    }

    /* JADX INFO: renamed from: Q */
    public void m10803Q() {
        FeedTopicContentWithPluginView feedTopicContentWithPluginView = this.f8942n;
        if (feedTopicContentWithPluginView == null) {
            return;
        }
        feedTopicContentWithPluginView.m7305k0();
    }

    /* JADX INFO: renamed from: R */
    public void m10804R() {
        this.f8942n.m7309o0();
    }

    /* JADX INFO: renamed from: S */
    public cwf0 m10805S() {
        return this.f8942n.m7306l0();
    }

    /* JADX INFO: renamed from: U */
    public void mo10807U(TopicMoment topicMoment) {
        this.f8940l.setText(String.format(act().getResources().getString(R$string.f551k2), i0g0.u(topicMoment.momentCounter)) + " " + String.format(act().getResources().getString(R$string.f565m2), i0g0.u(topicMoment.viewCounter)));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: V */
    public void mo10808V(final TopicMoment topicMoment) {
        this.f8928H = topicMoment;
        this.f8939k.setText(topicMoment.getTopicNameWithPrefix());
        this.f8934f.setText(topicMoment.getTopicNameWithPrefix());
        this.f8941m.M(topicMoment.description);
        m10813a0(topicMoment.headIcon);
        mo10807U(topicMoment);
        if (nkg.m12217O() && !TextUtils.isEmpty(topicMoment.group.f684id)) {
            xdl0.M(this.f8949u, true);
            this.f8950v.setText("来自" + topicMoment.group.name + "圈子");
            if (NullChecker.a(this.f8937i)) {
                xdl0.X(this.f8937i, t100.d(19.0f));
            }
        } else if (nkg.m12254n0() && m10823y(topicMoment) && topicMoment.consensusCounter > 0) {
            xdl0.M(this.f8951w, true);
            xdl0.M(this.f8952x, true);
            this.f8952x.m7536n0(topicMoment.consensusUserIds, false);
            VText vText = this.f8953y;
            StringBuilder sb = new StringBuilder();
            int i = topicMoment.consensusCounter;
            sb.append(i > 99 ? "99+" : Integer.valueOf(i));
            sb.append("人和你观点一致,看看他们都是谁");
            vText.setText(sb.toString());
            if (NullChecker.a(this.f8937i)) {
                xdl0.X(this.f8937i, t100.d(19.0f));
            }
        } else {
            if (NullChecker.a(this.f8937i)) {
                xdl0.X(this.f8937i, t100.d(25.0f));
            }
            xdl0.M(this.f8949u, false);
            xdl0.M(this.f8951w, false);
        }
        if (xdl0.O0(this.f8949u)) {
            m10810X(topicMoment.group);
        }
        if (xdl0.O0(this.f8951w)) {
            zvf0.x("e_vote_user_entrance", "p_topic_detail");
        }
        xdl0.E0(this.f8949u, new View.OnClickListener() { // from class: l.g7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8380a.m10800N(topicMoment, view);
            }
        });
        xdl0.E0(this.f8951w, new View.OnClickListener() { // from class: l.h7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8615a.m10801O(topicMoment, view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public void m10809W(boolean z) {
        xdl0.M(this.f8944p, z);
    }

    /* JADX INFO: renamed from: X */
    public void m10810X(GroupIdBox groupIdBox) {
        p6j0.m12915e("e_circle_tag", m10822x(), (j760[]) m10820v(groupIdBox).toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: Y */
    public void m10811Y(boolean z) {
        if (z) {
            zvf0.x("e_tantan_topic", m10822x());
        } else {
            zvf0.r("e_tantan_topic", m10822x());
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m10812Z() {
        xdl0.C0(this.f8930b, this.f8924D);
        xdl0.C0(this.f8931c, this.f8924D);
    }

    /* JADX INFO: renamed from: a0 */
    public void m10813a0(String str) {
        qib0.G.L0(this.f8938j, str);
    }

    public Act act() {
        return this.f8954z.act();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewMo10819u = mo10819u(layoutInflater, viewGroup);
        mo10792A();
        viewMo10819u.setBackgroundColor(-1);
        return viewMo10819u;
    }

    /* JADX INFO: renamed from: n */
    public final void m10815n() {
        this.f8923C.m16958m0(this.f8921A.m7316R4().f11373j);
        this.f8923C.m16957l0(this.f8921A.m7316R4().m12461q0());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (b5c0.f6090t == view.getId()) {
            this.f8954z.mo7058o();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo10814i1(y6i y6iVar) {
        this.f8923C = y6iVar;
    }

    /* JADX INFO: renamed from: q */
    public void m10817q(GroupIdBox groupIdBox) {
        p6j0.m12913c("e_circle_tag", m10822x(), (j760[]) m10820v(groupIdBox).toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: s */
    public void m10818s() {
        if (NullChecker.a(this.f8926F)) {
            this.f8936h.getViewTreeObserver().removeOnGlobalLayoutListener(this.f8926F);
        }
    }

    /* JADX INFO: renamed from: u */
    public View mo10819u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final List<j760<String, String>> m10820v(GroupIdBox groupIdBox) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("circle_id", groupIdBox.f684id));
        arrayList.add(j760.a("moment_id", ""));
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public String m10821w(TopicMoment topicMoment) {
        if (!NullChecker.a(topicMoment) || !NullChecker.a(topicMoment.options)) {
            return "";
        }
        for (int i = 0; i < topicMoment.options.size(); i++) {
            if (topicMoment.options.get(i).haveliked) {
                return topicMoment.options.get(i).values;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: x */
    public String m10822x() {
        return this.f8942n.getCurrentPosition() == 0 ? "p_topic_recommend" : "p_topic_latest";
    }

    /* JADX INFO: renamed from: y */
    public boolean m10823y(TopicMoment topicMoment) {
        if (NullChecker.a(topicMoment) && NullChecker.a(topicMoment.options)) {
            for (int i = 0; i < topicMoment.options.size(); i++) {
                if (topicMoment.options.get(i).haveliked) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final void m10824z() {
        this.f8943o.setBackground(null);
        xdl0.M(this.f8943o, false);
    }

    /* JADX INFO: renamed from: A */
    public void mo10792A() {
    }

    /* JADX INFO: renamed from: T */
    public void mo10806T() {
    }

    public void destroy() {
    }
}
