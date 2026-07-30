package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.GroupIdBox;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p051p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLine;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.n8i;

/* JADX INFO: loaded from: classes13.dex */
public class x8i<P extends n8i> implements iam<P>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public FeedTopicMomentFragment f192817A;

    /* JADX INFO: renamed from: B */
    public FeedTopicMomentFragment f192818B;

    /* JADX INFO: renamed from: C */
    public n8i f192819C;

    /* JADX INFO: renamed from: D */
    public int f192820D;

    /* JADX INFO: renamed from: E */
    public int f192821E;

    /* JADX INFO: renamed from: F */
    public ViewTreeObserver.OnGlobalLayoutListener f192822F = new ViewTreeObserverOnGlobalLayoutListenerC21265a();

    /* JADX INFO: renamed from: G */
    public AppBarLayout.OnOffsetChangedListener f192823G = new AppBarLayout.OnOffsetChangedListener() { // from class: l.o8i
        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f145414a.m209712M(appBarLayout, i);
        }
    };

    /* JADX INFO: renamed from: H */
    public TopicMoment f192824H;

    /* JADX INFO: renamed from: a */
    public CoordinatorLayout f192825a;

    /* JADX INFO: renamed from: b */
    public AppBarLayout f192826b;

    /* JADX INFO: renamed from: c */
    public CollapsingToolbarLayout f192827c;

    /* JADX INFO: renamed from: d */
    public Toolbar f192828d;

    /* JADX INFO: renamed from: e */
    public VImage f192829e;

    /* JADX INFO: renamed from: f */
    public TextView f192830f;

    /* JADX INFO: renamed from: g */
    public VLinear f192831g;

    /* JADX INFO: renamed from: h */
    public VRelative f192832h;

    /* JADX INFO: renamed from: i */
    public VLine f192833i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f192834j;

    /* JADX INFO: renamed from: k */
    public TextView f192835k;

    /* JADX INFO: renamed from: l */
    public TextView f192836l;

    /* JADX INFO: renamed from: m */
    public VExpandableTextContainer f192837m;

    /* JADX INFO: renamed from: n */
    public FeedTopicContentWithPluginView f192838n;

    /* JADX INFO: renamed from: o */
    public VFrame f192839o;

    /* JADX INFO: renamed from: p */
    public RelativeLayout f192840p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f192841q;

    /* JADX INFO: renamed from: r */
    public VImage f192842r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f192843s;

    /* JADX INFO: renamed from: t */
    public VText f192844t;

    /* JADX INFO: renamed from: u */
    public ConstraintLayout f192845u;

    /* JADX INFO: renamed from: v */
    public VText f192846v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f192847w;

    /* JADX INFO: renamed from: x */
    public FeedUserHeaderView f192848x;

    /* JADX INFO: renamed from: y */
    public VText f192849y;

    /* JADX INFO: renamed from: z */
    public FeedTopicAggregationBaseFrag f192850z;

    /* JADX INFO: renamed from: l.x8i$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC21265a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC21265a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (x8i.this.getAct() == null || x8i.this.f192832h.getMeasuredHeight() <= 0 || x8i.this.f192821E == x8i.this.f192832h.getMeasuredHeight()) {
                return;
            }
            x8i x8iVar = x8i.this;
            x8iVar.f192820D = bnl0.m105504C(x8iVar.getAct()) + x8i.this.f192832h.getMeasuredHeight();
            x8i x8iVar2 = x8i.this;
            x8iVar2.f192821E = x8iVar2.f192832h.getMeasuredHeight();
            x8i.this.m209722Z();
        }
    }

    public x8i(FeedTopicAggregationBaseFrag feedTopicAggregationBaseFrag) {
        this.f192850z = feedTopicAggregationBaseFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m209693G(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m209694H(View view) {
        m209709F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m209695I(View view) {
        m209717R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m209696J(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final void m209708C() {
        FeedTopicContentWithPluginView feedTopicContentWithPluginView = this.f192838n;
        n8i n8iVar = this.f192819C;
        feedTopicContentWithPluginView.m67331c0(n8iVar.f140683a, n8iVar.f140688f, n8iVar.f140686d, this.f192850z, n8iVar.f140689g);
        if (!NullChecker.m82486a(this.f192817A)) {
            this.f192817A = this.f192838n.getFeedRecommendTopicMomentFragment();
        }
        if (NullChecker.m82486a(this.f192818B)) {
            return;
        }
        this.f192818B = this.f192838n.getFeedNewTopicMomentFragment();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void mo127413E(Bundle bundle) {
        this.f192829e.setOnClickListener(new View.OnClickListener() { // from class: l.p8i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151033a.m209693G(view);
            }
        });
        this.f192828d.setTitle("");
        getAct().setSupportActionBar(this.f192828d);
        this.f192820D = qa00.m175859d(155.0f) + bnl0.m105504C(getAct());
        m209722Z();
        bnl0.m105540X(this.f192832h, bnl0.m105504C(getAct()));
        this.f192826b.addOnOffsetChangedListener(this.f192823G);
        bnl0.m105540X(this.f192843s, bnl0.m105504C(getAct()) / 2);
        this.f192832h.getViewTreeObserver().addOnGlobalLayoutListener(this.f192822F);
        m209731z();
        bnl0.m105509E0(this.f192831g, new View.OnClickListener() { // from class: l.q8i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156128a.m209694H(view);
            }
        });
        bnl0.m105505C0(this.f192841q, bnl0.m105504C(getAct()));
        this.f192844t.setOnClickListener(new View.OnClickListener() { // from class: l.r8i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161711a.m209695I(view);
            }
        });
        this.f192842r.setOnClickListener(new View.OnClickListener() { // from class: l.s8i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166824a.m209696J(view);
            }
        });
        this.f192837m.setOnSizeChangeEndListener(new VExpandableTextContainer.InterfaceC13254f() { // from class: l.t8i
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13254f
            /* JADX INFO: renamed from: a */
            public final void mo80400a(pf60 pf60Var) {
                this.f172535a.m209710K(pf60Var);
            }
        });
        m209708C();
        m209724n();
        if (cmg.m111224n0()) {
            Act act = getAct();
            Objects.requireNonNull(act);
            act.duringCreated(FeedModule.f39703d.m145583P7()).subscribe(psd0.m173596G(new y20() { // from class: l.u8i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178042a.m209711L((Map) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m209709F() {
        ksg.m151173J0(getAct());
        m209721Y(false);
        FeedModule.f39703d.m145812vd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m209710K(pf60 pf60Var) {
        if (NullChecker.m82486a(this.f192822F)) {
            this.f192832h.getViewTreeObserver().removeOnGlobalLayoutListener(this.f192822F);
            this.f192822F = null;
        }
        int iIntValue = ((Integer) pf60Var.f152156a).intValue();
        int iIntValue2 = ((Integer) pf60Var.f152157b).intValue();
        int i = this.f192820D;
        if (iIntValue > iIntValue2) {
            this.f192820D = i + (((Integer) pf60Var.f152156a).intValue() - ((Integer) pf60Var.f152157b).intValue());
        } else {
            this.f192820D = i - (((Integer) pf60Var.f152157b).intValue() - ((Integer) pf60Var.f152156a).intValue());
        }
        m209722Z();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m209711L(Map map) {
        m209708C();
        m209724n();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m209712M(AppBarLayout appBarLayout, int i) {
        float fAbs = 1.0f;
        if (i < 0) {
            fAbs = Math.abs(i) >= this.f192821E ? 0.0f : 1.0f - ((Math.abs(i) * 1.0f) / this.f192821E);
        }
        if (NullChecker.m82486a(this.f192832h)) {
            this.f192832h.setAlpha(fAbs);
            bnl0.m105524M(this.f192830f, this.f192820D + i == bnl0.m105504C(getAct()));
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m209713N(TopicMoment topicMoment, View view) {
        m209725q(topicMoment.group);
        Act act = getAct();
        Objects.requireNonNull(act);
        act.startActivity(new FeedGroupDetailAct.C11363a(getAct(), topicMoment.group.f40071id).m63170a());
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m209714O(TopicMoment topicMoment, View view) {
        i4g0.m138520r("e_vote_user_entrance", "p_topic_detail");
        if (NullChecker.m82486a(getAct())) {
            ryh.m183606a(getAct(), "", qv5.m178247a("m") + "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/topic-conversation/index.html?speed=true&_bid=1003366&hideNavigationBar=1&hideNotch=1&topicId=" + topicMoment.f40095id + "&description=" + m209728w(topicMoment));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m209715P() {
        this.f192838n.m67335j0();
    }

    /* JADX INFO: renamed from: Q */
    public void m209716Q() {
        FeedTopicContentWithPluginView feedTopicContentWithPluginView = this.f192838n;
        if (feedTopicContentWithPluginView == null) {
            return;
        }
        feedTopicContentWithPluginView.m67336k0();
    }

    /* JADX INFO: renamed from: R */
    public void m209717R() {
        this.f192838n.m67340o0();
    }

    /* JADX INFO: renamed from: S */
    public l4g0 m209718S() {
        return this.f192838n.m67337l0();
    }

    /* JADX INFO: renamed from: U */
    public void mo159968U(TopicMoment topicMoment) {
        this.f192836l.setText(String.format(getAct().getResources().getString(R$string.f39938k2), q8g0.m175816u(topicMoment.momentCounter)) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + String.format(getAct().getResources().getString(R$string.f39952m2), q8g0.m175816u(topicMoment.viewCounter)));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: V */
    public void mo127415V(final TopicMoment topicMoment) {
        this.f192824H = topicMoment;
        this.f192835k.setText(topicMoment.getTopicNameWithPrefix());
        this.f192830f.setText(topicMoment.getTopicNameWithPrefix());
        this.f192837m.m80384M(topicMoment.description);
        m209723a0(topicMoment.headIcon);
        mo159968U(topicMoment);
        if (cmg.m111187O() && !TextUtils.isEmpty(topicMoment.group.f40071id)) {
            bnl0.m105524M(this.f192845u, true);
            this.f192846v.setText("来自" + topicMoment.group.name + "圈子");
            if (NullChecker.m82486a(this.f192833i)) {
                bnl0.m105540X(this.f192833i, qa00.m175859d(19.0f));
            }
        } else if (cmg.m111224n0() && m209730y(topicMoment) && topicMoment.consensusCounter > 0) {
            bnl0.m105524M(this.f192847w, true);
            bnl0.m105524M(this.f192848x, true);
            this.f192848x.m67554n0(topicMoment.consensusUserIds, false);
            VText vText = this.f192849y;
            StringBuilder sb = new StringBuilder();
            int i = topicMoment.consensusCounter;
            sb.append(i > 99 ? "99+" : Integer.valueOf(i));
            sb.append("人和你观点一致,看看他们都是谁");
            vText.setText(sb.toString());
            if (NullChecker.m82486a(this.f192833i)) {
                bnl0.m105540X(this.f192833i, qa00.m175859d(19.0f));
            }
        } else {
            if (NullChecker.m82486a(this.f192833i)) {
                bnl0.m105540X(this.f192833i, qa00.m175859d(25.0f));
            }
            bnl0.m105524M(this.f192845u, false);
            bnl0.m105524M(this.f192847w, false);
        }
        if (bnl0.m105529O0(this.f192845u)) {
            m209720X(topicMoment.group);
        }
        if (bnl0.m105529O0(this.f192847w)) {
            i4g0.m138526x("e_vote_user_entrance", "p_topic_detail");
        }
        bnl0.m105509E0(this.f192845u, new View.OnClickListener() { // from class: l.v8i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182877a.m209713N(topicMoment, view);
            }
        });
        bnl0.m105509E0(this.f192847w, new View.OnClickListener() { // from class: l.w8i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187855a.m209714O(topicMoment, view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public void m209719W(boolean z) {
        bnl0.m105524M(this.f192840p, z);
    }

    /* JADX INFO: renamed from: X */
    public void m209720X(GroupIdBox groupIdBox) {
        tfj0.m190942e("e_circle_tag", m209729x(), (pf60[]) m209727v(groupIdBox).toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: Y */
    public void m209721Y(boolean z) {
        if (z) {
            i4g0.m138526x("e_tantan_topic", m209729x());
        } else {
            i4g0.m138520r("e_tantan_topic", m209729x());
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m209722Z() {
        bnl0.m105505C0(this.f192826b, this.f192820D);
        bnl0.m105505C0(this.f192827c, this.f192820D);
    }

    /* JADX INFO: renamed from: a0 */
    public void m209723a0(String str) {
        uqb0.f180374G.m127115L0(this.f192834j, str);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f192850z.act();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewMo127422u = mo127422u(layoutInflater, viewGroup);
        mo127412A();
        viewMo127422u.setBackgroundColor(-1);
        return viewMo127422u;
    }

    /* JADX INFO: renamed from: n */
    public final void m209724n() {
        this.f192819C.m161935m0(this.f192817A.m67347R4().f85786j);
        this.f192819C.m161934l0(this.f192817A.m67347R4().m115078q0());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (hdc0.f108962t == view.getId()) {
            this.f192850z.mo67090o();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(n8i n8iVar) {
        this.f192819C = n8iVar;
    }

    /* JADX INFO: renamed from: q */
    public void m209725q(GroupIdBox groupIdBox) {
        tfj0.m190940c("e_circle_tag", m209729x(), (pf60[]) m209727v(groupIdBox).toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: s */
    public void m209726s() {
        if (NullChecker.m82486a(this.f192822F)) {
            this.f192832h.getViewTreeObserver().removeOnGlobalLayoutListener(this.f192822F);
        }
    }

    /* JADX INFO: renamed from: u */
    public View mo127422u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final List<pf60<String, String>> m209727v(GroupIdBox groupIdBox) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("circle_id", groupIdBox.f40071id));
        arrayList.add(pf60.m172085a("moment_id", ""));
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public String m209728w(TopicMoment topicMoment) {
        if (!NullChecker.m82486a(topicMoment) || !NullChecker.m82486a(topicMoment.options)) {
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
    public String m209729x() {
        return this.f192838n.getCurrentPosition() == 0 ? "p_topic_recommend" : "p_topic_latest";
    }

    /* JADX INFO: renamed from: y */
    public boolean m209730y(TopicMoment topicMoment) {
        if (NullChecker.m82486a(topicMoment) && NullChecker.m82486a(topicMoment.options)) {
            for (int i = 0; i < topicMoment.options.size(); i++) {
                if (topicMoment.options.get(i).haveliked) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final void m209731z() {
        this.f192839o.setBackground(null);
        bnl0.m105524M(this.f192839o, false);
    }

    /* JADX INFO: renamed from: A */
    public void mo127412A() {
    }

    /* JADX INFO: renamed from: T */
    public void mo127414T() {
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
