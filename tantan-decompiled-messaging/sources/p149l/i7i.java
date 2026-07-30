package p149l;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.GroupIdBox;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p046p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLine;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.y6i;

/* JADX INFO: loaded from: classes12.dex */
public class i7i<P extends y6i> implements s7m<P>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public FeedTopicMomentFragment f111885A;

    /* JADX INFO: renamed from: B */
    public FeedTopicMomentFragment f111886B;

    /* JADX INFO: renamed from: C */
    public y6i f111887C;

    /* JADX INFO: renamed from: D */
    public int f111888D;

    /* JADX INFO: renamed from: E */
    public int f111889E;

    /* JADX INFO: renamed from: F */
    public ViewTreeObserver.OnGlobalLayoutListener f111890F = new ViewTreeObserverOnGlobalLayoutListenerC17504a();

    /* JADX INFO: renamed from: G */
    public AppBarLayout.OnOffsetChangedListener f111891G = new AppBarLayout.OnOffsetChangedListener() { // from class: l.z6i
        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f201925a.m134879M(appBarLayout, i);
        }
    };

    /* JADX INFO: renamed from: H */
    public TopicMoment f111892H;

    /* JADX INFO: renamed from: a */
    public CoordinatorLayout f111893a;

    /* JADX INFO: renamed from: b */
    public AppBarLayout f111894b;

    /* JADX INFO: renamed from: c */
    public CollapsingToolbarLayout f111895c;

    /* JADX INFO: renamed from: d */
    public Toolbar f111896d;

    /* JADX INFO: renamed from: e */
    public VImage f111897e;

    /* JADX INFO: renamed from: f */
    public TextView f111898f;

    /* JADX INFO: renamed from: g */
    public VLinear f111899g;

    /* JADX INFO: renamed from: h */
    public VRelative f111900h;

    /* JADX INFO: renamed from: i */
    public VLine f111901i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f111902j;

    /* JADX INFO: renamed from: k */
    public TextView f111903k;

    /* JADX INFO: renamed from: l */
    public TextView f111904l;

    /* JADX INFO: renamed from: m */
    public VExpandableTextContainer f111905m;

    /* JADX INFO: renamed from: n */
    public FeedTopicContentWithPluginView f111906n;

    /* JADX INFO: renamed from: o */
    public VFrame f111907o;

    /* JADX INFO: renamed from: p */
    public RelativeLayout f111908p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f111909q;

    /* JADX INFO: renamed from: r */
    public VImage f111910r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f111911s;

    /* JADX INFO: renamed from: t */
    public VText f111912t;

    /* JADX INFO: renamed from: u */
    public ConstraintLayout f111913u;

    /* JADX INFO: renamed from: v */
    public VText f111914v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f111915w;

    /* JADX INFO: renamed from: x */
    public FeedUserHeaderView f111916x;

    /* JADX INFO: renamed from: y */
    public VText f111917y;

    /* JADX INFO: renamed from: z */
    public FeedTopicAggregationBaseFrag f111918z;

    /* JADX INFO: renamed from: l.i7i$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC17504a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC17504a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (i7i.this.getAct() == null || i7i.this.f111900h.getMeasuredHeight() <= 0 || i7i.this.f111889E == i7i.this.f111900h.getMeasuredHeight()) {
                return;
            }
            i7i i7iVar = i7i.this;
            i7iVar.f111888D = xdl0.m208324C(i7iVar.getAct()) + i7i.this.f111900h.getMeasuredHeight();
            i7i i7iVar2 = i7i.this;
            i7iVar2.f111889E = i7iVar2.f111900h.getMeasuredHeight();
            i7i.this.m134892Z();
        }
    }

    public i7i(FeedTopicAggregationBaseFrag feedTopicAggregationBaseFrag) {
        this.f111918z = feedTopicAggregationBaseFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m134858G(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m134859H(View view) {
        m134876F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m134860I(View view) {
        m134884R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m134861J(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final void m134874C() {
        FeedTopicContentWithPluginView feedTopicContentWithPluginView = this.f111906n;
        y6i y6iVar = this.f111887C;
        feedTopicContentWithPluginView.m66148c0(y6iVar.f196562a, y6iVar.f196567f, y6iVar.f196565d, this.f111918z, y6iVar.f196568g);
        if (!NullChecker.m81303a(this.f111885A)) {
            this.f111885A = this.f111906n.getFeedRecommendTopicMomentFragment();
        }
        if (NullChecker.m81303a(this.f111886B)) {
            return;
        }
        this.f111886B = this.f111906n.getFeedNewTopicMomentFragment();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void mo134875E(Bundle bundle) {
        this.f111897e.setOnClickListener(new View.OnClickListener() { // from class: l.a7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67930a.m134858G(view);
            }
        });
        this.f111896d.setTitle("");
        getAct().setSupportActionBar(this.f111896d);
        this.f111888D = t100.m186890d(155.0f) + xdl0.m208324C(getAct());
        m134892Z();
        xdl0.m208360X(this.f111900h, xdl0.m208324C(getAct()));
        this.f111894b.addOnOffsetChangedListener(this.f111891G);
        xdl0.m208360X(this.f111911s, xdl0.m208324C(getAct()) / 2);
        this.f111900h.getViewTreeObserver().addOnGlobalLayoutListener(this.f111890F);
        m134903z();
        xdl0.m208329E0(this.f111899g, new View.OnClickListener() { // from class: l.b7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73973a.m134859H(view);
            }
        });
        xdl0.m208325C0(this.f111909q, xdl0.m208324C(getAct()));
        this.f111912t.setOnClickListener(new View.OnClickListener() { // from class: l.c7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79619a.m134860I(view);
            }
        });
        this.f111910r.setOnClickListener(new View.OnClickListener() { // from class: l.d7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84742a.m134861J(view);
            }
        });
        this.f111905m.setOnSizeChangeEndListener(new VExpandableTextContainer.InterfaceC13091f() { // from class: l.e7i
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13091f
            /* JADX INFO: renamed from: a */
            public final void mo79217a(j760 j760Var) {
                this.f89710a.m134877K(j760Var);
            }
        });
        m134874C();
        m134894n();
        if (nkg.m159895n0()) {
            Act act = getAct();
            Objects.requireNonNull(act);
            act.duringCreated(FeedModule.f38855d.m209342P7()).subscribe(mkd0.m154955G(new e30() { // from class: l.f7i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f96262a.m134878L((Map) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m134876F() {
        vqg.m199514J0(getAct());
        m134891Y(false);
        FeedModule.f38855d.m209571vd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m134877K(j760 j760Var) {
        if (NullChecker.m81303a(this.f111890F)) {
            this.f111900h.getViewTreeObserver().removeOnGlobalLayoutListener(this.f111890F);
            this.f111890F = null;
        }
        int iIntValue = ((Integer) j760Var.f116564a).intValue();
        int iIntValue2 = ((Integer) j760Var.f116565b).intValue();
        int i = this.f111888D;
        if (iIntValue > iIntValue2) {
            this.f111888D = i + (((Integer) j760Var.f116564a).intValue() - ((Integer) j760Var.f116565b).intValue());
        } else {
            this.f111888D = i - (((Integer) j760Var.f116565b).intValue() - ((Integer) j760Var.f116564a).intValue());
        }
        m134892Z();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m134878L(Map map) {
        m134874C();
        m134894n();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m134879M(AppBarLayout appBarLayout, int i) {
        float fAbs = 1.0f;
        if (i < 0) {
            fAbs = Math.abs(i) >= this.f111889E ? 0.0f : 1.0f - ((Math.abs(i) * 1.0f) / this.f111889E);
        }
        if (NullChecker.m81303a(this.f111900h)) {
            this.f111900h.setAlpha(fAbs);
            xdl0.m208344M(this.f111898f, this.f111888D + i == xdl0.m208324C(getAct()));
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m134880N(TopicMoment topicMoment, View view) {
        m134896q(topicMoment.group);
        Act act = getAct();
        Objects.requireNonNull(act);
        act.startActivity(new FeedGroupDetailAct.C11200a(getAct(), topicMoment.group.f39223id).m61987a());
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m134881O(TopicMoment topicMoment, View view) {
        zvf0.m220396r("e_vote_user_entrance", "p_topic_detail");
        if (NullChecker.m81303a(getAct())) {
            cxh.m109099a(getAct(), "", mu5.m156376a("m") + "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/topic-conversation/index.html?speed=true&_bid=1003366&hideNavigationBar=1&hideNotch=1&topicId=" + topicMoment.f39247id + "&description=" + m134900w(topicMoment));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m134882P() {
        this.f111906n.m66152j0();
    }

    /* JADX INFO: renamed from: Q */
    public void m134883Q() {
        FeedTopicContentWithPluginView feedTopicContentWithPluginView = this.f111906n;
        if (feedTopicContentWithPluginView == null) {
            return;
        }
        feedTopicContentWithPluginView.m66153k0();
    }

    /* JADX INFO: renamed from: R */
    public void m134884R() {
        this.f111906n.m66157o0();
    }

    /* JADX INFO: renamed from: S */
    public cwf0 m134885S() {
        return this.f111906n.m66154l0();
    }

    /* JADX INFO: renamed from: U */
    public void mo134887U(TopicMoment topicMoment) {
        this.f111904l.setText(String.format(getAct().getResources().getString(R$string.f39090k2), i0g0.m133881u(topicMoment.momentCounter)) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + String.format(getAct().getResources().getString(R$string.f39104m2), i0g0.m133881u(topicMoment.viewCounter)));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: V */
    public void mo134888V(final TopicMoment topicMoment) {
        this.f111892H = topicMoment;
        this.f111903k.setText(topicMoment.getTopicNameWithPrefix());
        this.f111898f.setText(topicMoment.getTopicNameWithPrefix());
        this.f111905m.m79201M(topicMoment.description);
        m134893a0(topicMoment.headIcon);
        mo134887U(topicMoment);
        if (nkg.m159858O() && !TextUtils.isEmpty(topicMoment.group.f39223id)) {
            xdl0.m208344M(this.f111913u, true);
            this.f111914v.setText("来自" + topicMoment.group.name + "圈子");
            if (NullChecker.m81303a(this.f111901i)) {
                xdl0.m208360X(this.f111901i, t100.m186890d(19.0f));
            }
        } else if (nkg.m159895n0() && m134902y(topicMoment) && topicMoment.consensusCounter > 0) {
            xdl0.m208344M(this.f111915w, true);
            xdl0.m208344M(this.f111916x, true);
            this.f111916x.m66371n0(topicMoment.consensusUserIds, false);
            VText vText = this.f111917y;
            StringBuilder sb = new StringBuilder();
            int i = topicMoment.consensusCounter;
            sb.append(i > 99 ? "99+" : Integer.valueOf(i));
            sb.append("人和你观点一致,看看他们都是谁");
            vText.setText(sb.toString());
            if (NullChecker.m81303a(this.f111901i)) {
                xdl0.m208360X(this.f111901i, t100.m186890d(19.0f));
            }
        } else {
            if (NullChecker.m81303a(this.f111901i)) {
                xdl0.m208360X(this.f111901i, t100.m186890d(25.0f));
            }
            xdl0.m208344M(this.f111913u, false);
            xdl0.m208344M(this.f111915w, false);
        }
        if (xdl0.m208349O0(this.f111913u)) {
            m134890X(topicMoment.group);
        }
        if (xdl0.m208349O0(this.f111915w)) {
            zvf0.m220402x("e_vote_user_entrance", "p_topic_detail");
        }
        xdl0.m208329E0(this.f111913u, new View.OnClickListener() { // from class: l.g7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101383a.m134880N(topicMoment, view);
            }
        });
        xdl0.m208329E0(this.f111915w, new View.OnClickListener() { // from class: l.h7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106278a.m134881O(topicMoment, view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public void m134889W(boolean z) {
        xdl0.m208344M(this.f111908p, z);
    }

    /* JADX INFO: renamed from: X */
    public void m134890X(GroupIdBox groupIdBox) {
        p6j0.m167671e("e_circle_tag", m134901x(), (j760[]) m134899v(groupIdBox).toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: Y */
    public void m134891Y(boolean z) {
        if (z) {
            zvf0.m220402x("e_tantan_topic", m134901x());
        } else {
            zvf0.m220396r("e_tantan_topic", m134901x());
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m134892Z() {
        xdl0.m208325C0(this.f111894b, this.f111888D);
        xdl0.m208325C0(this.f111895c, this.f111888D);
    }

    /* JADX INFO: renamed from: a0 */
    public void m134893a0(String str) {
        qib0.f154691G.m102331L0(this.f111902j, str);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f111918z.act();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewMo134898u = mo134898u(layoutInflater, viewGroup);
        mo134873A();
        viewMo134898u.setBackgroundColor(-1);
        return viewMo134898u;
    }

    /* JADX INFO: renamed from: n */
    public final void m134894n() {
        this.f111887C.m213138m0(this.f111885A.m66164R4().f142501j);
        this.f111887C.m213137l0(this.f111885A.m66164R4().m162995q0());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (b5c0.f73609t == view.getId()) {
            this.f111918z.mo65907o();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(y6i y6iVar) {
        this.f111887C = y6iVar;
    }

    /* JADX INFO: renamed from: q */
    public void m134896q(GroupIdBox groupIdBox) {
        p6j0.m167669c("e_circle_tag", m134901x(), (j760[]) m134899v(groupIdBox).toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: s */
    public void m134897s() {
        if (NullChecker.m81303a(this.f111890F)) {
            this.f111900h.getViewTreeObserver().removeOnGlobalLayoutListener(this.f111890F);
        }
    }

    /* JADX INFO: renamed from: u */
    public View mo134898u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final List<j760<String, String>> m134899v(GroupIdBox groupIdBox) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("circle_id", groupIdBox.f39223id));
        arrayList.add(j760.m140076a("moment_id", ""));
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public String m134900w(TopicMoment topicMoment) {
        if (!NullChecker.m81303a(topicMoment) || !NullChecker.m81303a(topicMoment.options)) {
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
    public String m134901x() {
        return this.f111906n.getCurrentPosition() == 0 ? "p_topic_recommend" : "p_topic_latest";
    }

    /* JADX INFO: renamed from: y */
    public boolean m134902y(TopicMoment topicMoment) {
        if (NullChecker.m81303a(topicMoment) && NullChecker.m81303a(topicMoment.options)) {
            for (int i = 0; i < topicMoment.options.size(); i++) {
                if (topicMoment.options.get(i).haveliked) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final void m134903z() {
        this.f111907o.setBackground(null);
        xdl0.m208344M(this.f111907o, false);
    }

    /* JADX INFO: renamed from: A */
    public void mo134873A() {
    }

    /* JADX INFO: renamed from: T */
    public void mo134886T() {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
