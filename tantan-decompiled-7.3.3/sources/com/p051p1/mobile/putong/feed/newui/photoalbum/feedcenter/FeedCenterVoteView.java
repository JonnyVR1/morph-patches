package com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.LinkIntent;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.VoteOptions;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedCanVoteContentView;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p051p1.mobile.putong.newui.view.HighlightData;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p137rx.subjects.C22508b;
import p151v.VText;
import p153l.bnl0;
import p153l.cmg;
import p153l.cn40;
import p153l.fvg;
import p153l.fyh;
import p153l.i4g0;
import p153l.jka;
import p153l.jyb;
import p153l.k3h;
import p153l.k9c0;
import p153l.ksg;
import p153l.l3h;
import p153l.l4g0;
import p153l.lbc0;
import p153l.o1j0;
import p153l.owi;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.th0;
import p153l.uxj0;
import p153l.w1e;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCenterVoteView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterVoteView f42760B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f42761C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f42762D;

    /* JADX INFO: renamed from: E */
    public VText f42763E;

    /* JADX INFO: renamed from: E0 */
    public boolean f42764E0;

    /* JADX INFO: renamed from: F */
    public VText f42765F;

    /* JADX INFO: renamed from: F0 */
    public int f42766F0;

    /* JADX INFO: renamed from: G */
    public VText f42767G;

    /* JADX INFO: renamed from: G0 */
    public int f42768G0;

    /* JADX INFO: renamed from: H */
    public RelativeLayout f42769H;

    /* JADX INFO: renamed from: H0 */
    public String f42770H0;

    /* JADX INFO: renamed from: I */
    public VText f42771I;

    /* JADX INFO: renamed from: I0 */
    public fvg f42772I0;

    /* JADX INFO: renamed from: J */
    public VText f42773J;

    /* JADX INFO: renamed from: J0 */
    public boolean f42774J0;

    /* JADX INFO: renamed from: K */
    public VText f42775K;

    /* JADX INFO: renamed from: K0 */
    public Act f42776K0;

    /* JADX INFO: renamed from: L */
    public RelativeLayout f42777L;

    /* JADX INFO: renamed from: L0 */
    public final C22508b<pf60<String, TopicMoment>> f42778L0;

    /* JADX INFO: renamed from: M */
    public VText f42779M;

    /* JADX INFO: renamed from: N */
    public VText f42780N;

    /* JADX INFO: renamed from: O */
    public VText f42781O;

    /* JADX INFO: renamed from: P */
    public RelativeLayout f42782P;

    /* JADX INFO: renamed from: Q */
    public VText f42783Q;

    /* JADX INFO: renamed from: R */
    public VText f42784R;

    /* JADX INFO: renamed from: S */
    public VText f42785S;

    /* JADX INFO: renamed from: T */
    public VText f42786T;

    /* JADX INFO: renamed from: U */
    public FeedCanVoteContentView f42787U;

    /* JADX INFO: renamed from: V */
    public List<VoteOptions> f42788V;

    /* JADX INFO: renamed from: W */
    public int f42789W;

    /* JADX INFO: renamed from: k0 */
    public int f42790k0;

    /* JADX INFO: renamed from: p0 */
    public TopicMoment f42791p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView$a */
    public class C11463a implements Animator.AnimatorListener {
        public C11463a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedCenterVoteView.this.m65882h1(true, false);
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
        this.f42790k0 = -1;
        this.f42764E0 = false;
        this.f42766F0 = qa00.m175859d(260.0f);
        this.f42768G0 = qa00.m175859d(35.0f);
        this.f42770H0 = "";
        this.f42774J0 = true;
        this.f42778L0 = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: I0 */
    private boolean m65842I0() {
        TopicMoment topicMoment = this.f42791p0;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m65843R0(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56859id, Boolean.valueOf(z));
        m65824O(z);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m65845m0() {
    }

    /* JADX INFO: renamed from: A0 */
    public final void m65857A0(boolean z) {
        WindowManager windowManager = (WindowManager) getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (NullChecker.m82487b(windowManager)) {
            if (z) {
                this.f42766F0 = windowManager.getDefaultDisplay().getWidth() - qa00.m175859d(48.0f);
            } else {
                this.f42766F0 = windowManager.getDefaultDisplay().getWidth() - qa00.m175859d(95.0f);
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m65858B0(String str) {
        Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.media = new ArrayList();
        ArrayList arrayList = new ArrayList();
        TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
        TopicMoment topicMoment = this.f42791p0;
        topicMomentIdBox.f39672id = topicMoment.f40095id;
        topicMomentIdBox.name = topicMoment.name;
        arrayList.add(topicMomentIdBox);
        momentNew_.topics = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f42791p0);
        momentNew_.mTopicList = arrayList2;
        cn40.m111369U(momentNew_, true);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo65780C() {
        fvg fvgVar = new fvg();
        this.f42772I0 = fvgVar;
        fvgVar.m127626G(this);
    }

    /* JADX INFO: renamed from: D0 */
    public final String m65859D0(int i, int i2) {
        double dM65860E0 = m65860E0(i, i2);
        return dM65860E0 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "0%" : new DecimalFormat("##%").format(dM65860E0);
    }

    /* JADX INFO: renamed from: E0 */
    public final double m65860E0(int i, int i2) {
        return (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    /* JADX INFO: renamed from: G0 */
    public final int m65861G0(int i, int i2) {
        return (int) Math.round(((double) this.f42766F0) * m65862H0(i, i2));
    }

    /* JADX INFO: renamed from: H0 */
    public final double m65862H0(int i, int i2) {
        double d = (((double) i) * 1.0d) / (((double) i2) * 1.0d);
        if (d <= 0.98d || d >= 1.0d) {
            return d;
        }
        return 0.98d;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m65863J0(TopicMoment topicMoment) {
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
    public final /* synthetic */ void m65864K0(View view, TextView textView, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = (this.f42766F0 * iIntValue) / 100;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        textView.setText(m65859D0(iIntValue, 100));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m65865L0(uxj0 uxj0Var) {
        String strM151174K;
        this.f42764E0 = true;
        m65882h1(true, true);
        if (cmg.m111224n0()) {
            if (TextUtils.isEmpty(this.f42744k)) {
                strM151174K = "p_user_moment_interactions_details_view";
            } else {
                String str = this.f42744k;
                strM151174K = ksg.m151174K(str, TextUtils.equals(str, "from_album"));
            }
            i4g0.m138523u("e_qa_optional", strM151174K, jyb.m147494Y("topic_id", this.f42791p0.f40095id), jyb.m147494Y(FirebaseAnalytics.Event.SELECT_ITEM, this.f42788V.get(this.f42790k0).values));
            m65878Z0(this.f42788V.get(this.f42790k0).values);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m65866M0(RelativeLayout relativeLayout) {
        if (NullChecker.m82486a(relativeLayout)) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: l.yug
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f201618a.m65870Q0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m65867N0(View view) {
        m65879a1(act(), this.f42791p0, this.f42774J0);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m65868O0(View view) {
        if (NullChecker.m82486a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.cvg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f84004a.m65867N0(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m65869P0() {
        this.f42790k0 = -1;
        o1j0.m165649w(R$string.f39831U1);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m65870Q0(View view) {
        if (this.f42790k0 == -1 && !this.f42764E0) {
            if (view.equals(this.f42762D)) {
                this.f42790k0 = 0;
            } else if (view.equals(this.f42769H)) {
                this.f42790k0 = 1;
            } else if (view.equals(this.f42777L)) {
                this.f42790k0 = 2;
            } else if (view.equals(this.f42782P)) {
                this.f42790k0 = 3;
            }
            if (cmg.m111224n0() || !this.f42774J0) {
                if (m65842I0()) {
                    this.f42790k0 = -1;
                    o1j0.m165649w(R$string.f39736E2);
                } else {
                    if (owi.m169565a()) {
                        k3h.m148057P0(act(), new x20() { // from class: l.dvg
                            @Override // p153l.x20
                            public final void call() {
                                this.f90927a.m65869P0();
                            }
                        }, false, new x20() { // from class: l.evg
                            @Override // p153l.x20
                            public final void call() {
                                this.f96002a.m65873U0();
                            }
                        }, l3h.f129876b);
                        return;
                    }
                    m65873U0();
                }
            }
            if (cmg.m111224n0()) {
                return;
            }
        }
        m65880d1(act(), this.f42791p0, this.f42774J0, this.f42790k0);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m65871S0(String str, View view) {
        i4g0.m138523u("e_moment_posted", "p_vote_send_pop", jyb.m147494Y("posted_source", LinkIntent.vote), jyb.m147494Y("topic_id", this.f42791p0.f40095id), jyb.m147494Y("moment_id", NullChecker.m82486a(this.f42742i) ? this.f42742i.f56859id : ""));
        m65858B0("我在" + this.f42791p0.name + "投票中选择了" + str + "你也来表态吧~");
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m65872T0(View view) {
        m65880d1(act(), this.f42791p0, this.f42774J0, this.f42790k0);
        i4g0.m138520r("e_cancel", "p_vote_send_pop");
    }

    /* JADX INFO: renamed from: U0 */
    public final void m65873U0() {
        if (act() == null || this.f42790k0 == -1) {
            return;
        }
        Act act = act();
        jka jkaVar = FeedModule.f39703d;
        TopicMoment topicMoment = this.f42791p0;
        act.duringCreated(jkaVar.m145503Dc(topicMoment.owner.f39607id, topicMoment.f40095id, this.f42788V.get(this.f42790k0).f40101id, this.f42790k0)).subscribe(psd0.m173597H(new y20() { // from class: l.xug
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196277a.m65865L0((uxj0) obj);
            }
        }, new fyh()));
    }

    /* JADX INFO: renamed from: V0 */
    public final void m65874V0(int i) {
        if (this.f42791p0 == null) {
            return;
        }
        jyb.m147537z(jyb.m147507f0(this.f42761C, this.f42739f.getTextView(), this.f42740g, this.f42734a), new y20() { // from class: l.sug
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170684a.m65868O0((View) obj);
            }
        });
        TopicMoment topicMoment = this.f42791p0;
        List<VoteOptions> list = topicMoment.options;
        this.f42788V = list;
        this.f42789W = topicMoment.voteCounter;
        if (list == null || list.size() == 0 || this.f42789W < 0) {
            return;
        }
        for (int i2 = 0; i2 < this.f42788V.size(); i2++) {
            if (this.f42788V.get(i2).haveliked) {
                this.f42764E0 = true;
                this.f42790k0 = i2;
            }
        }
        if (i != -1 && !this.f42764E0) {
            if (m65842I0()) {
                this.f42790k0 = -1;
                o1j0.m165649w(R$string.f39736E2);
            } else {
                this.f42790k0 = i;
                m65873U0();
            }
        }
        m65882h1(false, false);
        jyb.m147537z(jyb.m147507f0(this.f42762D, this.f42769H, this.f42777L, this.f42782P), new y20() { // from class: l.wug
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190863a.m65866M0((RelativeLayout) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public void m65875W0(TopicMoment topicMoment, int i, Act act, String str) {
        this.f42776K0 = act;
        this.f42770H0 = str;
        bnl0.m105524M(this.f42740g, false);
        bnl0.m105524M(this.f42739f, false);
        this.f42791p0 = topicMoment;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f42761C.getLayoutParams();
        layoutParams.leftMargin = qa00.m175859d(12.0f);
        layoutParams.rightMargin = qa00.m175859d(12.0f);
        this.f42761C.setLayoutParams(layoutParams);
        this.f42766F0 = qa00.m175859d(316.0f);
        m65857A0(true);
        m65874V0(i);
    }

    /* JADX INFO: renamed from: X0 */
    public void m65876X0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f42742i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f42738e.getLayoutParams();
        marginLayoutParams.leftMargin = qa00.m175859d(i2);
        this.f42738e.setLayoutParams(marginLayoutParams);
        mo65781Z(i, moment, map);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m65877Y0(View view, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = Math.max(m65861G0(i, i2), this.f42768G0);
        view.setLayoutParams(layoutParams);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo65781Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        super.mo65781Z(i, moment, map);
        this.f42764E0 = false;
        this.f42790k0 = -1;
        bnl0.m105524M(this.f42740g, false);
        CharSequence charSequenceM65819E = m65819E(moment.momentValue);
        bnl0.m105524M(this.f42739f, !TextUtils.isEmpty(charSequenceM65819E));
        this.f42739f.m80383L(map.get(moment.f56859id) == null ? false : map.get(moment.f56859id).booleanValue()).m80388Q(new VExpandableTextContainer.InterfaceC13253e() { // from class: l.zug
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13253e
            /* JADX INFO: renamed from: a */
            public final void mo80399a(boolean z) {
                this.f206120a.m65843R0(map, moment, z);
            }
        });
        List<TopicMoment> topicList = moment.getTopicList();
        if (topicList == null || topicList.size() == 0) {
            this.f42739f.m80384M(charSequenceM65819E);
            return;
        }
        this.f42791p0 = topicList.get(0);
        this.f42739f.m80386O(charSequenceM65819E, new HighlightData("#" + this.f42791p0.name, new x20() { // from class: l.avg
            @Override // p153l.x20
            public final void call() {
                FeedCenterVoteView.m65845m0();
            }
        }));
        m65857A0(false);
        if (cmg.m111224n0()) {
            bnl0.m105524M(this.f42787U, moment.shareMyVote);
            bnl0.m105524M(this.f42761C, !moment.shareMyVote);
            if (moment.shareMyVote) {
                this.f42787U.setFrom(this.f42744k);
                HashMap<String, Boolean> map2 = new HashMap<>();
                TopicMoment topicMoment = this.f42791p0;
                map2.put(topicMoment.f40095id, Boolean.valueOf(m65863J0(topicMoment)));
                FeedCanVoteContentView feedCanVoteContentView = this.f42787U;
                feedCanVoteContentView.f43203h = map2;
                feedCanVoteContentView.m66272s(this.f42791p0);
                return;
            }
        }
        m65874V0(this.f42790k0);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m65878Z0(final String str) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_vote_send_pop", Dialog.class.getName());
        new th0.C20312a(act()).m191160s("已投票").m191148g(false).m191151j("分享观点到动态，收获更多互动").m191159r("发布").m191156o(new View.OnClickListener() { // from class: l.tug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176190a.m65871S0(str, view);
            }
        }).m191147f("取消").m191154m(new DialogInterface.OnDismissListener() { // from class: l.uug
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.vug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185815a.m65872T0(view);
            }
        }).m191142a().m191141g();
        l4g0VarM204399c.m152781p(jyb.m147494Y("source_page", LinkIntent.vote));
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m65879a1(Act act, TopicMoment topicMoment, boolean z) {
        m65880d1(act, topicMoment, z, -1);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m65880d1(Act act, TopicMoment topicMoment, boolean z, int i) {
        if (z) {
            act.startActivity(TopicVoteAggregationAct.m67355Y1(act, topicMoment.f40095id, topicMoment.owner.f39607id, this.f42742i.f56859id, i));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m65881f1(VText vText, View view, TextView textView, boolean z, int i, int i2) {
        if (!this.f42764E0) {
            bnl0.m105524M(textView, false);
            bnl0.m105524M(view, false);
            vText.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124480L));
            return;
        }
        bnl0.m105524M(textView, true);
        bnl0.m105524M(view, true);
        if (this.f42790k0 == i2) {
            ((RelativeLayout) view.getParent()).setSelected(true);
            view.setBackground(FeedModule.f39700a.getResources().getDrawable(lbc0.f130947T5));
            vText.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124521n));
            Drawable drawable = getResources().getDrawable(lbc0.f131011c4);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            vText.setCompoundDrawables(drawable, null, null, null);
            vText.setCompoundDrawablePadding(qa00.m175859d(8.0f));
            textView.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124521n));
        } else {
            view.setBackground(FeedModule.f39700a.getResources().getDrawable(lbc0.f130940S5));
            vText.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124484P));
            vText.setCompoundDrawables(null, null, null, null);
            textView.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124517l));
        }
        if (z) {
            m65883z0(view, textView, i);
        } else {
            textView.setText(m65859D0(i, this.f42789W));
            m65877Y0(view, i, this.f42789W);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m65882h1(boolean z, boolean z2) {
        int size = this.f42788V.size();
        if (z && z2) {
            this.f42789W++;
        }
        RelativeLayout relativeLayout = this.f42762D;
        if (size > 0) {
            bnl0.m105524M(relativeLayout, true);
            this.f42765F.setText(this.f42788V.get(0).values);
            m65881f1(this.f42765F, this.f42763E, this.f42767G, z2, (this.f42790k0 == 0 && z) ? this.f42788V.get(0).counter + 1 : this.f42788V.get(0).counter, 0);
        } else {
            bnl0.m105524M(relativeLayout, false);
        }
        RelativeLayout relativeLayout2 = this.f42769H;
        if (size > 1) {
            bnl0.m105524M(relativeLayout2, true);
            this.f42773J.setText(this.f42788V.get(1).values);
            m65881f1(this.f42773J, this.f42771I, this.f42775K, z2, (this.f42790k0 == 1 && z) ? this.f42788V.get(1).counter + 1 : this.f42788V.get(1).counter, 1);
        } else {
            bnl0.m105524M(relativeLayout2, false);
        }
        RelativeLayout relativeLayout3 = this.f42777L;
        if (size > 2) {
            bnl0.m105524M(relativeLayout3, true);
            this.f42780N.setText(this.f42788V.get(2).values);
            m65881f1(this.f42780N, this.f42779M, this.f42781O, z2, (this.f42790k0 == 2 && z) ? this.f42788V.get(2).counter + 1 : this.f42788V.get(2).counter, 2);
        } else {
            bnl0.m105524M(relativeLayout3, false);
        }
        RelativeLayout relativeLayout4 = this.f42782P;
        if (size > 3) {
            bnl0.m105524M(relativeLayout4, true);
            this.f42784R.setText(this.f42788V.get(3).values);
            m65881f1(this.f42784R, this.f42783Q, this.f42785S, z2, (this.f42790k0 == 3 && z) ? this.f42788V.get(3).counter + 1 : this.f42788V.get(3).counter, 3);
        } else {
            bnl0.m105524M(relativeLayout4, false);
        }
        bnl0.m105524M(this.f42786T, true);
        this.f42786T.setText(this.f42789W == 1 ? String.format(act().getString(R$string.f39754H2), Integer.valueOf(this.f42789W)) : String.format(act().getString(R$string.f39760I2), Integer.valueOf(this.f42789W)));
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo65785r() {
        this.f42760B = this.f42772I0.m127631h();
        this.f42734a = this.f42772I0.m127629f();
        this.f42735b = this.f42772I0.m127632i();
        this.f42736c = this.f42772I0.m127624E();
        this.f42737d = this.f42772I0.m127625F();
        this.f42738e = this.f42772I0.m127628e();
        this.f42739f = this.f42772I0.m127633j();
        this.f42740g = this.f42772I0.m127634k();
        this.f42761C = this.f42772I0.m127622C();
        this.f42762D = this.f42772I0.m127640q();
        this.f42763E = this.f42772I0.m127643t();
        this.f42765F = this.f42772I0.m127642s();
        this.f42767G = this.f42772I0.m127641r();
        this.f42769H = this.f42772I0.m127648y();
        this.f42771I = this.f42772I0.m127621B();
        this.f42773J = this.f42772I0.m127620A();
        this.f42775K = this.f42772I0.m127649z();
        this.f42777L = this.f42772I0.m127644u();
        this.f42779M = this.f42772I0.m127647x();
        this.f42780N = this.f42772I0.m127646w();
        this.f42781O = this.f42772I0.m127645v();
        this.f42782P = this.f42772I0.m127636m();
        this.f42783Q = this.f42772I0.m127639p();
        this.f42784R = this.f42772I0.m127638o();
        this.f42785S = this.f42772I0.m127637n();
        this.f42786T = this.f42772I0.m127623D();
        this.f42741h = this.f42772I0.m127630g();
        this.f42787U = this.f42772I0.m127635l();
    }

    public void setVoteAggregationActClickable(boolean z) {
        this.f42774J0 = z;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m65883z0(final View view, final TextView textView, int i) {
        double dM65862H0 = m65862H0(i, this.f42789W);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) (100.0d * dM65862H0));
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration((int) (dM65862H0 * 1000.0d));
        valueAnimatorOfInt.addListener(new C11463a());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bvg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f78589a.m65864K0(view, textView, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    public FeedCenterVoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42790k0 = -1;
        this.f42764E0 = false;
        this.f42766F0 = qa00.m175859d(260.0f);
        this.f42768G0 = qa00.m175859d(35.0f);
        this.f42770H0 = "";
        this.f42774J0 = true;
        this.f42778L0 = C22508b.m222767b();
    }

    public FeedCenterVoteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42790k0 = -1;
        this.f42764E0 = false;
        this.f42766F0 = qa00.m175859d(260.0f);
        this.f42768G0 = qa00.m175859d(35.0f);
        this.f42770H0 = "";
        this.f42774J0 = true;
        this.f42778L0 = C22508b.m222767b();
    }
}
