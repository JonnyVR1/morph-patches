package com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.LinkIntent;
import com.p046p1.mobile.putong.data.TopicMomentIdBox;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.VoteOptions;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedCanVoteContentView;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p046p1.mobile.putong.newui.view.HighlightData;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p133rx.subjects.C22393b;
import p147v.VText;
import p149l.cwf0;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.f3c0;
import p149l.i0e;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.nkg;
import p149l.oe40;
import p149l.qtg;
import p149l.qwh;
import p149l.roj0;
import p149l.sti;
import p149l.t100;
import p149l.v1h;
import p149l.vqg;
import p149l.vwb;
import p149l.w1h;
import p149l.xdl0;
import p149l.xh0;
import p149l.xia;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCenterVoteView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterVoteView f41912B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f41913C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f41914D;

    /* JADX INFO: renamed from: E */
    public VText f41915E;

    /* JADX INFO: renamed from: E0 */
    public boolean f41916E0;

    /* JADX INFO: renamed from: F */
    public VText f41917F;

    /* JADX INFO: renamed from: F0 */
    public int f41918F0;

    /* JADX INFO: renamed from: G */
    public VText f41919G;

    /* JADX INFO: renamed from: G0 */
    public int f41920G0;

    /* JADX INFO: renamed from: H */
    public RelativeLayout f41921H;

    /* JADX INFO: renamed from: H0 */
    public String f41922H0;

    /* JADX INFO: renamed from: I */
    public VText f41923I;

    /* JADX INFO: renamed from: I0 */
    public qtg f41924I0;

    /* JADX INFO: renamed from: J */
    public VText f41925J;

    /* JADX INFO: renamed from: J0 */
    public boolean f41926J0;

    /* JADX INFO: renamed from: K */
    public VText f41927K;

    /* JADX INFO: renamed from: K0 */
    public Act f41928K0;

    /* JADX INFO: renamed from: L */
    public RelativeLayout f41929L;

    /* JADX INFO: renamed from: L0 */
    public final C22393b<j760<String, TopicMoment>> f41930L0;

    /* JADX INFO: renamed from: M */
    public VText f41931M;

    /* JADX INFO: renamed from: N */
    public VText f41932N;

    /* JADX INFO: renamed from: O */
    public VText f41933O;

    /* JADX INFO: renamed from: P */
    public RelativeLayout f41934P;

    /* JADX INFO: renamed from: Q */
    public VText f41935Q;

    /* JADX INFO: renamed from: R */
    public VText f41936R;

    /* JADX INFO: renamed from: S */
    public VText f41937S;

    /* JADX INFO: renamed from: T */
    public VText f41938T;

    /* JADX INFO: renamed from: U */
    public FeedCanVoteContentView f41939U;

    /* JADX INFO: renamed from: V */
    public List<VoteOptions> f41940V;

    /* JADX INFO: renamed from: W */
    public int f41941W;

    /* JADX INFO: renamed from: k0 */
    public int f41942k0;

    /* JADX INFO: renamed from: p0 */
    public TopicMoment f41943p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView$a */
    public class C11300a implements Animator.AnimatorListener {
        public C11300a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedCenterVoteView.this.m64699h1(true, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public FeedCenterVoteView(Context context) {
        super(context);
        this.f41942k0 = -1;
        this.f41916E0 = false;
        this.f41918F0 = t100.m186890d(260.0f);
        this.f41920G0 = t100.m186890d(35.0f);
        this.f41922H0 = "";
        this.f41926J0 = true;
        this.f41930L0 = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: I0 */
    private boolean m64659I0() {
        TopicMoment topicMoment = this.f41943p0;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m64660R0(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56011id, Boolean.valueOf(z));
        m64641O(z);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m64662m0() {
    }

    /* JADX INFO: renamed from: A0 */
    public final void m64674A0(boolean z) {
        WindowManager windowManager = (WindowManager) getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (NullChecker.m81304b(windowManager)) {
            if (z) {
                this.f41918F0 = windowManager.getDefaultDisplay().getWidth() - t100.m186890d(48.0f);
            } else {
                this.f41918F0 = windowManager.getDefaultDisplay().getWidth() - t100.m186890d(95.0f);
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m64675B0(String str) {
        Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.media = new ArrayList();
        ArrayList arrayList = new ArrayList();
        TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
        TopicMoment topicMoment = this.f41943p0;
        topicMomentIdBox.f38824id = topicMoment.f39247id;
        topicMomentIdBox.name = topicMoment.name;
        arrayList.add(topicMomentIdBox);
        momentNew_.topics = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f41943p0);
        momentNew_.mTopicList = arrayList2;
        oe40.m163819U(momentNew_, true);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo64597C() {
        qtg qtgVar = new qtg();
        this.f41924I0 = qtgVar;
        qtgVar.m176421G(this);
    }

    /* JADX INFO: renamed from: D0 */
    public final String m64676D0(int i, int i2) {
        double dM64677E0 = m64677E0(i, i2);
        return dM64677E0 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "0%" : new DecimalFormat("##%").format(dM64677E0);
    }

    /* JADX INFO: renamed from: E0 */
    public final double m64677E0(int i, int i2) {
        return (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    /* JADX INFO: renamed from: G0 */
    public final int m64678G0(int i, int i2) {
        return (int) Math.round(((double) this.f41918F0) * m64679H0(i, i2));
    }

    /* JADX INFO: renamed from: H0 */
    public final double m64679H0(int i, int i2) {
        double d = (((double) i) * 1.0d) / (((double) i2) * 1.0d);
        if (d <= 0.98d || d >= 1.0d) {
            return d;
        }
        return 0.98d;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m64680J0(TopicMoment topicMoment) {
        List<VoteOptions> list;
        if (topicMoment != null && (list = topicMoment.options) != null && list.size() != 0) {
            for (int i = 0; i < topicMoment.options.size(); i++) {
                if (topicMoment.options.get(i).haveliked) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m64681K0(View view, TextView textView, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = (this.f41918F0 * iIntValue) / 100;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        textView.setText(m64676D0(iIntValue, 100));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m64682L0(roj0 roj0Var) {
        String strM199515K;
        this.f41916E0 = true;
        m64699h1(true, true);
        if (nkg.m159895n0()) {
            if (TextUtils.isEmpty(this.f41896k)) {
                strM199515K = "p_user_moment_interactions_details_view";
            } else {
                String str = this.f41896k;
                strM199515K = vqg.m199515K(str, TextUtils.equals(str, "from_album"));
            }
            zvf0.m220399u("e_qa_optional", strM199515K, vwb.m200311Y("topic_id", this.f41943p0.f39247id), vwb.m200311Y(FirebaseAnalytics.Event.SELECT_ITEM, this.f41940V.get(this.f41942k0).values));
            m64695Z0(this.f41940V.get(this.f41942k0).values);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m64683M0(RelativeLayout relativeLayout) {
        if (NullChecker.m81303a(relativeLayout)) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: l.jtg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f119599a.m64687Q0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m64684N0(View view) {
        m64696a1(act(), this.f41943p0, this.f41926J0);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m64685O0(View view) {
        if (NullChecker.m81303a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.ntg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f140471a.m64684N0(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m64686P0() {
        this.f41942k0 = -1;
        lsi0.m151593w(R$string.f38983U1);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m64687Q0(View view) {
        if (this.f41942k0 == -1 && !this.f41916E0) {
            if (view.equals(this.f41914D)) {
                this.f41942k0 = 0;
            } else if (view.equals(this.f41921H)) {
                this.f41942k0 = 1;
            } else if (view.equals(this.f41929L)) {
                this.f41942k0 = 2;
            } else if (view.equals(this.f41934P)) {
                this.f41942k0 = 3;
            }
            if (nkg.m159895n0() || !this.f41926J0) {
                if (m64659I0()) {
                    this.f41942k0 = -1;
                    lsi0.m151593w(R$string.f38888E2);
                } else {
                    if (sti.m185955a()) {
                        v1h.m196580P0(act(), new d30() { // from class: l.otg
                            @Override // p149l.d30
                            public final void call() {
                                this.f145589a.m64686P0();
                            }
                        }, false, new d30() { // from class: l.ptg
                            @Override // p149l.d30
                            public final void call() {
                                this.f151160a.m64690U0();
                            }
                        }, w1h.f184004b);
                        return;
                    }
                    m64690U0();
                }
            }
            if (nkg.m159895n0()) {
                return;
            }
        }
        m64697d1(act(), this.f41943p0, this.f41926J0, this.f41942k0);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m64688S0(String str, View view) {
        zvf0.m220399u("e_moment_posted", "p_vote_send_pop", vwb.m200311Y("posted_source", LinkIntent.vote), vwb.m200311Y("topic_id", this.f41943p0.f39247id), vwb.m200311Y("moment_id", NullChecker.m81303a(this.f41894i) ? this.f41894i.f56011id : ""));
        m64675B0("我在" + this.f41943p0.name + "投票中选择了" + str + "你也来表态吧~");
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m64689T0(View view) {
        m64697d1(act(), this.f41943p0, this.f41926J0, this.f41942k0);
        zvf0.m220396r("e_cancel", "p_vote_send_pop");
    }

    /* JADX INFO: renamed from: U0 */
    public final void m64690U0() {
        if (act() == null || this.f41942k0 == -1) {
            return;
        }
        Act act = act();
        xia xiaVar = FeedModule.f38855d;
        TopicMoment topicMoment = this.f41943p0;
        act.duringCreated(xiaVar.m209262Dc(topicMoment.owner.f38759id, topicMoment.f39247id, this.f41940V.get(this.f41942k0).f39253id, this.f41942k0)).subscribe(mkd0.m154956H(new e30() { // from class: l.itg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114881a.m64682L0((roj0) obj);
            }
        }, new qwh()));
    }

    /* JADX INFO: renamed from: V0 */
    public final void m64691V0(int i) {
        if (this.f41943p0 == null) {
            return;
        }
        vwb.m200354z(vwb.m200324f0(this.f41913C, this.f41891f.getTextView(), this.f41892g, this.f41886a), new e30() { // from class: l.dtg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87840a.m64685O0((View) obj);
            }
        });
        TopicMoment topicMoment = this.f41943p0;
        List<VoteOptions> list = topicMoment.options;
        this.f41940V = list;
        this.f41941W = topicMoment.voteCounter;
        if (list == null || list.size() == 0 || this.f41941W < 0) {
            return;
        }
        for (int i2 = 0; i2 < this.f41940V.size(); i2++) {
            if (this.f41940V.get(i2).haveliked) {
                this.f41916E0 = true;
                this.f41942k0 = i2;
            }
        }
        if (i != -1 && !this.f41916E0) {
            if (m64659I0()) {
                this.f41942k0 = -1;
                lsi0.m151593w(R$string.f38888E2);
            } else {
                this.f41942k0 = i;
                m64690U0();
            }
        }
        m64699h1(false, false);
        vwb.m200354z(vwb.m200324f0(this.f41914D, this.f41921H, this.f41929L, this.f41934P), new e30() { // from class: l.htg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109390a.m64683M0((RelativeLayout) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public void m64692W0(TopicMoment topicMoment, int i, Act act, String str) {
        this.f41928K0 = act;
        this.f41922H0 = str;
        xdl0.m208344M(this.f41892g, false);
        xdl0.m208344M(this.f41891f, false);
        this.f41943p0 = topicMoment;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f41913C.getLayoutParams();
        layoutParams.leftMargin = t100.m186890d(12.0f);
        layoutParams.rightMargin = t100.m186890d(12.0f);
        this.f41913C.setLayoutParams(layoutParams);
        this.f41918F0 = t100.m186890d(316.0f);
        m64674A0(true);
        m64691V0(i);
    }

    /* JADX INFO: renamed from: X0 */
    public void m64693X0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f41894i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41890e.getLayoutParams();
        marginLayoutParams.leftMargin = t100.m186890d(i2);
        this.f41890e.setLayoutParams(marginLayoutParams);
        mo64598Z(i, moment, map);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m64694Y0(View view, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = Math.max(m64678G0(i, i2), this.f41920G0);
        view.setLayoutParams(layoutParams);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo64598Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        super.mo64598Z(i, moment, map);
        this.f41916E0 = false;
        this.f41942k0 = -1;
        xdl0.m208344M(this.f41892g, false);
        CharSequence charSequenceM64636E = m64636E(moment.momentValue);
        xdl0.m208344M(this.f41891f, !TextUtils.isEmpty(charSequenceM64636E));
        this.f41891f.m79200L(map.get(moment.f56011id) == null ? false : map.get(moment.f56011id).booleanValue()).m79205Q(new VExpandableTextContainer.InterfaceC13090e() { // from class: l.ktg
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13090e
            /* JADX INFO: renamed from: a */
            public final void mo79216a(boolean z) {
                this.f124585a.m64660R0(map, moment, z);
            }
        });
        List<TopicMoment> topicList = moment.getTopicList();
        if (topicList == null || topicList.size() == 0) {
            this.f41891f.m79201M(charSequenceM64636E);
            return;
        }
        this.f41943p0 = topicList.get(0);
        this.f41891f.m79203O(charSequenceM64636E, new HighlightData("#" + this.f41943p0.name, new d30() { // from class: l.ltg
            @Override // p149l.d30
            public final void call() {
                FeedCenterVoteView.m64662m0();
            }
        }));
        m64674A0(false);
        if (nkg.m159895n0()) {
            xdl0.m208344M(this.f41939U, moment.shareMyVote);
            xdl0.m208344M(this.f41913C, !moment.shareMyVote);
            if (moment.shareMyVote) {
                this.f41939U.setFrom(this.f41896k);
                HashMap<String, Boolean> map2 = new HashMap<>();
                TopicMoment topicMoment = this.f41943p0;
                map2.put(topicMoment.f39247id, Boolean.valueOf(m64680J0(topicMoment)));
                FeedCanVoteContentView feedCanVoteContentView = this.f41939U;
                feedCanVoteContentView.f42355h = map2;
                feedCanVoteContentView.m65089s(this.f41943p0);
                return;
            }
        }
        m64691V0(this.f41942k0);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m64695Z0(final String str) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_vote_send_pop", Dialog.class.getName());
        new xh0.C21150a(act()).m208740s("已投票").m208728g(false).m208731j("分享观点到动态，收获更多互动").m208739r("发布").m208736o(new View.OnClickListener() { // from class: l.etg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93114a.m64688S0(str, view);
            }
        }).m208727f("取消").m208734m(new DialogInterface.OnDismissListener() { // from class: l.ftg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m208724c(new View.OnClickListener() { // from class: l.gtg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104295a.m64689T0(view);
            }
        }).m208722a().m208721g();
        cwf0VarM133794c.m109040p(vwb.m200311Y("source_page", LinkIntent.vote));
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m64696a1(Act act, TopicMoment topicMoment, boolean z) {
        m64697d1(act, topicMoment, z, -1);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m64697d1(Act act, TopicMoment topicMoment, boolean z, int i) {
        if (z) {
            act.startActivity(TopicVoteAggregationAct.m66172X1(act, topicMoment.f39247id, topicMoment.owner.f38759id, this.f41894i.f56011id, i));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m64698f1(VText vText, View view, TextView textView, boolean z, int i, int i2) {
        if (!this.f41916E0) {
            xdl0.m208344M(textView, false);
            xdl0.m208344M(view, false);
            vText.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88757L));
            return;
        }
        xdl0.m208344M(textView, true);
        xdl0.m208344M(view, true);
        if (this.f41942k0 == i2) {
            ((RelativeLayout) view.getParent()).setSelected(true);
            view.setBackground(FeedModule.f38852a.getResources().getDrawable(f3c0.f94429T5));
            vText.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88798n));
            Drawable drawable = getResources().getDrawable(f3c0.f94493c4);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            vText.setCompoundDrawables(drawable, null, null, null);
            vText.setCompoundDrawablePadding(t100.m186890d(8.0f));
            textView.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88798n));
        } else {
            view.setBackground(FeedModule.f38852a.getResources().getDrawable(f3c0.f94422S5));
            vText.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88761P));
            vText.setCompoundDrawables(null, null, null, null);
            textView.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88794l));
        }
        if (z) {
            m64700z0(view, textView, i);
        } else {
            textView.setText(m64676D0(i, this.f41941W));
            m64694Y0(view, i, this.f41941W);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m64699h1(boolean z, boolean z2) {
        int size = this.f41940V.size();
        if (z && z2) {
            this.f41941W++;
        }
        RelativeLayout relativeLayout = this.f41914D;
        if (size > 0) {
            xdl0.m208344M(relativeLayout, true);
            this.f41917F.setText(this.f41940V.get(0).values);
            m64698f1(this.f41917F, this.f41915E, this.f41919G, z2, (this.f41942k0 == 0 && z) ? this.f41940V.get(0).counter + 1 : this.f41940V.get(0).counter, 0);
        } else {
            xdl0.m208344M(relativeLayout, false);
        }
        RelativeLayout relativeLayout2 = this.f41921H;
        if (size > 1) {
            xdl0.m208344M(relativeLayout2, true);
            this.f41925J.setText(this.f41940V.get(1).values);
            m64698f1(this.f41925J, this.f41923I, this.f41927K, z2, (this.f41942k0 == 1 && z) ? this.f41940V.get(1).counter + 1 : this.f41940V.get(1).counter, 1);
        } else {
            xdl0.m208344M(relativeLayout2, false);
        }
        RelativeLayout relativeLayout3 = this.f41929L;
        if (size > 2) {
            xdl0.m208344M(relativeLayout3, true);
            this.f41932N.setText(this.f41940V.get(2).values);
            m64698f1(this.f41932N, this.f41931M, this.f41933O, z2, (this.f41942k0 == 2 && z) ? this.f41940V.get(2).counter + 1 : this.f41940V.get(2).counter, 2);
        } else {
            xdl0.m208344M(relativeLayout3, false);
        }
        RelativeLayout relativeLayout4 = this.f41934P;
        if (size > 3) {
            xdl0.m208344M(relativeLayout4, true);
            this.f41936R.setText(this.f41940V.get(3).values);
            m64698f1(this.f41936R, this.f41935Q, this.f41937S, z2, (this.f41942k0 == 3 && z) ? this.f41940V.get(3).counter + 1 : this.f41940V.get(3).counter, 3);
        } else {
            xdl0.m208344M(relativeLayout4, false);
        }
        xdl0.m208344M(this.f41938T, true);
        this.f41938T.setText(this.f41941W == 1 ? String.format(act().getString(R$string.f38906H2), Integer.valueOf(this.f41941W)) : String.format(act().getString(R$string.f38912I2), Integer.valueOf(this.f41941W)));
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo64602r() {
        this.f41912B = this.f41924I0.m176426h();
        this.f41886a = this.f41924I0.m176424f();
        this.f41887b = this.f41924I0.m176427i();
        this.f41888c = this.f41924I0.m176419E();
        this.f41889d = this.f41924I0.m176420F();
        this.f41890e = this.f41924I0.m176423e();
        this.f41891f = this.f41924I0.m176428j();
        this.f41892g = this.f41924I0.m176429k();
        this.f41913C = this.f41924I0.m176417C();
        this.f41914D = this.f41924I0.m176435q();
        this.f41915E = this.f41924I0.m176438t();
        this.f41917F = this.f41924I0.m176437s();
        this.f41919G = this.f41924I0.m176436r();
        this.f41921H = this.f41924I0.m176443y();
        this.f41923I = this.f41924I0.m176416B();
        this.f41925J = this.f41924I0.m176415A();
        this.f41927K = this.f41924I0.m176444z();
        this.f41929L = this.f41924I0.m176439u();
        this.f41931M = this.f41924I0.m176442x();
        this.f41932N = this.f41924I0.m176441w();
        this.f41933O = this.f41924I0.m176440v();
        this.f41934P = this.f41924I0.m176431m();
        this.f41935Q = this.f41924I0.m176434p();
        this.f41936R = this.f41924I0.m176433o();
        this.f41937S = this.f41924I0.m176432n();
        this.f41938T = this.f41924I0.m176418D();
        this.f41893h = this.f41924I0.m176425g();
        this.f41939U = this.f41924I0.m176430l();
    }

    public void setVoteAggregationActClickable(boolean z) {
        this.f41926J0 = z;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m64700z0(final View view, final TextView textView, int i) {
        double dM64679H0 = m64679H0(i, this.f41941W);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) (100.0d * dM64679H0));
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration((int) (dM64679H0 * 1000.0d));
        valueAnimatorOfInt.addListener(new C11300a());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mtg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f135594a.m64681K0(view, textView, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    public FeedCenterVoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41942k0 = -1;
        this.f41916E0 = false;
        this.f41918F0 = t100.m186890d(260.0f);
        this.f41920G0 = t100.m186890d(35.0f);
        this.f41922H0 = "";
        this.f41926J0 = true;
        this.f41930L0 = C22393b.m221521b();
    }

    public FeedCenterVoteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41942k0 = -1;
        this.f41916E0 = false;
        this.f41918F0 = t100.m186890d(260.0f);
        this.f41920G0 = t100.m186890d(35.0f);
        this.f41922H0 = "";
        this.f41926J0 = true;
        this.f41930L0 = C22393b.m221521b();
    }
}
