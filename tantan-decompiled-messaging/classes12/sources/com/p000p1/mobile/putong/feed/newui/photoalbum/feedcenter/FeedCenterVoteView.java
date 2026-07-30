package com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter;

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
import com.p000p1.mobile.putong.data.LinkIntent;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.VoteOptions;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedCanVoteContentView;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.HighlightData;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.cwf0;
import l.d30;
import l.e30;
import l.i0e;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.zvf0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.nkg;
import p007l.oe40;
import p007l.qtg;
import p007l.qwh;
import p007l.sti;
import p007l.v1h;
import p007l.vqg;
import p007l.w1h;
import p007l.xia;
import rx.subjects.b;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCenterVoteView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterVoteView f3373B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f3374C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f3375D;

    /* JADX INFO: renamed from: E */
    public VText f3376E;

    /* JADX INFO: renamed from: E0 */
    public boolean f3377E0;

    /* JADX INFO: renamed from: F */
    public VText f3378F;

    /* JADX INFO: renamed from: F0 */
    public int f3379F0;

    /* JADX INFO: renamed from: G */
    public VText f3380G;

    /* JADX INFO: renamed from: G0 */
    public int f3381G0;

    /* JADX INFO: renamed from: H */
    public RelativeLayout f3382H;

    /* JADX INFO: renamed from: H0 */
    public String f3383H0;

    /* JADX INFO: renamed from: I */
    public VText f3384I;

    /* JADX INFO: renamed from: I0 */
    public qtg f3385I0;

    /* JADX INFO: renamed from: J */
    public VText f3386J;

    /* JADX INFO: renamed from: J0 */
    public boolean f3387J0;

    /* JADX INFO: renamed from: K */
    public VText f3388K;

    /* JADX INFO: renamed from: K0 */
    public Act f3389K0;

    /* JADX INFO: renamed from: L */
    public RelativeLayout f3390L;

    /* JADX INFO: renamed from: L0 */
    public final b<j760<String, TopicMoment>> f3391L0;

    /* JADX INFO: renamed from: M */
    public VText f3392M;

    /* JADX INFO: renamed from: N */
    public VText f3393N;

    /* JADX INFO: renamed from: O */
    public VText f3394O;

    /* JADX INFO: renamed from: P */
    public RelativeLayout f3395P;

    /* JADX INFO: renamed from: Q */
    public VText f3396Q;

    /* JADX INFO: renamed from: R */
    public VText f3397R;

    /* JADX INFO: renamed from: S */
    public VText f3398S;

    /* JADX INFO: renamed from: T */
    public VText f3399T;

    /* JADX INFO: renamed from: U */
    public FeedCanVoteContentView f3400U;

    /* JADX INFO: renamed from: V */
    public List<VoteOptions> f3401V;

    /* JADX INFO: renamed from: W */
    public int f3402W;

    /* JADX INFO: renamed from: k0 */
    public int f3403k0;

    /* JADX INFO: renamed from: p0 */
    public TopicMoment f3404p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView$a */
    public class C2144a implements Animator.AnimatorListener {
        public C2144a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedCenterVoteView.this.m5793h1(true, false);
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
        this.f3403k0 = -1;
        this.f3377E0 = false;
        this.f3379F0 = t100.d(260.0f);
        this.f3381G0 = t100.d(35.0f);
        this.f3383H0 = "";
        this.f3387J0 = true;
        this.f3391L0 = b.b();
    }

    /* JADX INFO: renamed from: I0 */
    private boolean m5753I0() {
        TopicMoment topicMoment = this.f3404p0;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m5754R0(HashMap map, Moment moment, boolean z) {
        map.put(((DbObject) moment).id, Boolean.valueOf(z));
        m5735O(z);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m5756m0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A0 */
    public final void m5768A0(boolean z) {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (NullChecker.b(windowManager)) {
            if (z) {
                this.f3379F0 = windowManager.getDefaultDisplay().getWidth() - t100.d(48.0f);
            } else {
                this.f3379F0 = windowManager.getDefaultDisplay().getWidth() - t100.d(95.0f);
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m5769B0(String str) {
        Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.media = new ArrayList();
        ArrayList arrayList = new ArrayList();
        TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
        TopicMoment topicMoment = this.f3404p0;
        topicMomentIdBox.f285id = topicMoment.f708id;
        topicMomentIdBox.name = topicMoment.name;
        arrayList.add(topicMomentIdBox);
        momentNew_.topics = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f3404p0);
        momentNew_.mTopicList = arrayList2;
        oe40.m12556U(momentNew_, true);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo5691C() {
        qtg qtgVar = new qtg();
        this.f3385I0 = qtgVar;
        qtgVar.m13705G(this);
    }

    /* JADX INFO: renamed from: D0 */
    public final String m5770D0(int i, int i2) {
        double dM5771E0 = m5771E0(i, i2);
        return dM5771E0 == 0.0d ? "0%" : new DecimalFormat("##%").format(dM5771E0);
    }

    /* JADX INFO: renamed from: E0 */
    public final double m5771E0(int i, int i2) {
        return (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    /* JADX INFO: renamed from: G0 */
    public final int m5772G0(int i, int i2) {
        return (int) Math.round(((double) this.f3379F0) * m5773H0(i, i2));
    }

    /* JADX INFO: renamed from: H0 */
    public final double m5773H0(int i, int i2) {
        double d = (((double) i) * 1.0d) / (((double) i2) * 1.0d);
        if (d <= 0.98d || d >= 1.0d) {
            return d;
        }
        return 0.98d;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m5774J0(TopicMoment topicMoment) {
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
    public final /* synthetic */ void m5775K0(View view, TextView textView, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = (this.f3379F0 * iIntValue) / 100;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        textView.setText(m5770D0(iIntValue, 100));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m5776L0(roj0 roj0Var) {
        String strM15485K;
        this.f3377E0 = true;
        m5793h1(true, true);
        if (nkg.m12254n0()) {
            if (TextUtils.isEmpty(this.f3357k)) {
                strM15485K = "p_user_moment_interactions_details_view";
            } else {
                String str = this.f3357k;
                strM15485K = vqg.m15485K(str, TextUtils.equals(str, "from_album"));
            }
            zvf0.u("e_qa_optional", strM15485K, new j760[]{vwb.Y("topic_id", this.f3404p0.f708id), vwb.Y("select_item", this.f3401V.get(this.f3403k0).values)});
            m5789Z0(this.f3401V.get(this.f3403k0).values);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m5777M0(RelativeLayout relativeLayout) {
        if (NullChecker.a(relativeLayout)) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: l.jtg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9516a.m5781Q0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m5778N0(View view) {
        m5790a1(act(), this.f3404p0, this.f3387J0);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m5779O0(View view) {
        if (NullChecker.a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.ntg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10878a.m5778N0(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m5780P0() {
        this.f3403k0 = -1;
        lsi0.w(R$string.f444U1);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m5781Q0(View view) {
        if (this.f3403k0 == -1 && !this.f3377E0) {
            if (view.equals(this.f3375D)) {
                this.f3403k0 = 0;
            } else if (view.equals(this.f3382H)) {
                this.f3403k0 = 1;
            } else if (view.equals(this.f3390L)) {
                this.f3403k0 = 2;
            } else if (view.equals(this.f3395P)) {
                this.f3403k0 = 3;
            }
            if (nkg.m12254n0() || !this.f3387J0) {
                if (m5753I0()) {
                    this.f3403k0 = -1;
                    lsi0.w(R$string.f349E2);
                } else {
                    if (sti.m14315a()) {
                        v1h.m15219P0(act(), new d30() { // from class: l.otg
                            public final void call() {
                                this.f11616a.m5780P0();
                            }
                        }, false, new d30() { // from class: l.ptg
                            public final void call() {
                                this.f11973a.m5784U0();
                            }
                        }, w1h.f14362b);
                        return;
                    }
                    m5784U0();
                }
            }
            if (nkg.m12254n0()) {
                return;
            }
        }
        m5791d1(act(), this.f3404p0, this.f3387J0, this.f3403k0);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m5782S0(String str, View view) {
        zvf0.u("e_moment_posted", "p_vote_send_pop", new j760[]{vwb.Y("posted_source", LinkIntent.vote), vwb.Y("topic_id", this.f3404p0.f708id), vwb.Y("moment_id", NullChecker.a(this.f3355i) ? ((DbObject) this.f3355i).id : "")});
        m5769B0("我在" + this.f3404p0.name + "投票中选择了" + str + "你也来表态吧~");
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m5783T0(View view) {
        m5791d1(act(), this.f3404p0, this.f3387J0, this.f3403k0);
        zvf0.r("e_cancel", "p_vote_send_pop");
    }

    /* JADX INFO: renamed from: U0 */
    public final void m5784U0() {
        if (act() == null || this.f3403k0 == -1) {
            return;
        }
        Act act = act();
        xia xiaVar = FeedModule.f316d;
        TopicMoment topicMoment = this.f3404p0;
        act.duringCreated(xiaVar.m16443Dc(topicMoment.owner.f220id, topicMoment.f708id, this.f3401V.get(this.f3403k0).f714id, this.f3403k0)).subscribe(mkd0.H(new e30() { // from class: l.itg
            public final void call(Object obj) {
                this.f9132a.m5776L0((roj0) obj);
            }
        }, new qwh()));
    }

    /* JADX INFO: renamed from: V0 */
    public final void m5785V0(int i) {
        if (this.f3404p0 == null) {
            return;
        }
        vwb.z(vwb.f0(new View[]{this.f3374C, this.f3352f.getTextView(), this.f3353g, this.f3347a}), new e30() { // from class: l.dtg
            public final void call(Object obj) {
                this.f7061a.m5779O0((View) obj);
            }
        });
        TopicMoment topicMoment = this.f3404p0;
        List<VoteOptions> list = topicMoment.options;
        this.f3401V = list;
        this.f3402W = topicMoment.voteCounter;
        if (list == null || list.size() == 0 || this.f3402W < 0) {
            return;
        }
        for (int i2 = 0; i2 < this.f3401V.size(); i2++) {
            if (this.f3401V.get(i2).haveliked) {
                this.f3377E0 = true;
                this.f3403k0 = i2;
            }
        }
        if (i != -1 && !this.f3377E0) {
            if (m5753I0()) {
                this.f3403k0 = -1;
                lsi0.w(R$string.f349E2);
            } else {
                this.f3403k0 = i;
                m5784U0();
            }
        }
        m5793h1(false, false);
        vwb.z(vwb.f0(new RelativeLayout[]{this.f3375D, this.f3382H, this.f3390L, this.f3395P}), new e30() { // from class: l.htg
            public final void call(Object obj) {
                this.f8817a.m5777M0((RelativeLayout) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public void m5786W0(TopicMoment topicMoment, int i, Act act, String str) {
        this.f3389K0 = act;
        this.f3383H0 = str;
        xdl0.M(this.f3353g, false);
        xdl0.M(this.f3352f, false);
        this.f3404p0 = topicMoment;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3374C.getLayoutParams();
        layoutParams.leftMargin = t100.d(12.0f);
        layoutParams.rightMargin = t100.d(12.0f);
        this.f3374C.setLayoutParams(layoutParams);
        this.f3379F0 = t100.d(316.0f);
        m5768A0(true);
        m5785V0(i);
    }

    /* JADX INFO: renamed from: X0 */
    public void m5787X0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f3355i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3351e.getLayoutParams();
        marginLayoutParams.leftMargin = t100.d(i2);
        this.f3351e.setLayoutParams(marginLayoutParams);
        mo5692Z(i, moment, map);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m5788Y0(View view, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = Math.max(m5772G0(i, i2), this.f3381G0);
        view.setLayoutParams(layoutParams);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo5692Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        super.mo5692Z(i, moment, map);
        this.f3377E0 = false;
        this.f3403k0 = -1;
        xdl0.M(this.f3353g, false);
        CharSequence charSequenceM5730E = m5730E(moment.momentValue);
        xdl0.M(this.f3352f, !TextUtils.isEmpty(charSequenceM5730E));
        this.f3352f.L(map.get(((DbObject) moment).id) == null ? false : map.get(((DbObject) moment).id).booleanValue()).Q(new VExpandableTextContainer.e() { // from class: l.ktg
            /* JADX INFO: renamed from: a */
            public final void m11517a(boolean z) {
                this.f9790a.m5754R0(map, moment, z);
            }
        });
        List<TopicMoment> topicList = moment.getTopicList();
        if (topicList == null || topicList.size() == 0) {
            this.f3352f.M(charSequenceM5730E);
            return;
        }
        this.f3404p0 = topicList.get(0);
        this.f3352f.O(charSequenceM5730E, new HighlightData[]{new HighlightData("#" + this.f3404p0.name, new d30() { // from class: l.ltg
            public final void call() {
                FeedCenterVoteView.m5756m0();
            }
        })});
        m5768A0(false);
        if (nkg.m12254n0()) {
            xdl0.M(this.f3400U, moment.shareMyVote);
            xdl0.M(this.f3374C, !moment.shareMyVote);
            if (moment.shareMyVote) {
                this.f3400U.setFrom(this.f3357k);
                HashMap<String, Boolean> map2 = new HashMap<>();
                TopicMoment topicMoment = this.f3404p0;
                map2.put(topicMoment.f708id, Boolean.valueOf(m5774J0(topicMoment)));
                FeedCanVoteContentView feedCanVoteContentView = this.f3400U;
                feedCanVoteContentView.f3816h = map2;
                feedCanVoteContentView.m6190s(this.f3404p0);
                return;
            }
        }
        m5785V0(this.f3403k0);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m5789Z0(final String str) {
        final cwf0 cwf0VarC = i0e.c("p_vote_send_pop", Dialog.class.getName());
        new xh0.a(act()).s("已投票").g(false).j("分享观点到动态，收获更多互动").r("发布").o(new View.OnClickListener() { // from class: l.etg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7476a.m5782S0(str, view);
            }
        }).f("取消").m(new DialogInterface.OnDismissListener() { // from class: l.ftg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).c(new View.OnClickListener() { // from class: l.gtg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8513a.m5783T0(view);
            }
        }).a().g();
        cwf0VarC.p(new j760[]{vwb.Y("source_page", LinkIntent.vote)});
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m5790a1(Act act, TopicMoment topicMoment, boolean z) {
        m5791d1(act, topicMoment, z, -1);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m5791d1(Act act, TopicMoment topicMoment, boolean z, int i) {
        if (z) {
            act.startActivity(TopicVoteAggregationAct.m7328X1(act, topicMoment.f708id, topicMoment.owner.f220id, ((DbObject) this.f3355i).id, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f1 */
    public final void m5792f1(VText vText, View view, TextView textView, boolean z, int i, int i2) {
        if (!this.f3377E0) {
            xdl0.M(textView, false);
            xdl0.M(view, false);
            vText.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7113L));
            return;
        }
        xdl0.M(textView, true);
        xdl0.M(view, true);
        if (this.f3403k0 == i2) {
            ((RelativeLayout) view.getParent()).setSelected(true);
            view.setBackground(FeedModule.f313a.getResources().getDrawable(f3c0.f7712T5));
            vText.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7154n));
            Drawable drawable = getResources().getDrawable(f3c0.f7776c4);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            vText.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            vText.setCompoundDrawablePadding(t100.d(8.0f));
            textView.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7154n));
        } else {
            view.setBackground(FeedModule.f313a.getResources().getDrawable(f3c0.f7705S5));
            vText.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7117P));
            vText.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7150l));
        }
        if (z) {
            m5794z0(view, textView, i);
        } else {
            textView.setText(m5770D0(i, this.f3402W));
            m5788Y0(view, i, this.f3402W);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m5793h1(boolean z, boolean z2) {
        int size = this.f3401V.size();
        if (z && z2) {
            this.f3402W++;
        }
        RelativeLayout relativeLayout = this.f3375D;
        if (size > 0) {
            xdl0.M(relativeLayout, true);
            this.f3378F.setText(this.f3401V.get(0).values);
            m5792f1(this.f3378F, this.f3376E, this.f3380G, z2, (this.f3403k0 == 0 && z) ? this.f3401V.get(0).counter + 1 : this.f3401V.get(0).counter, 0);
        } else {
            xdl0.M(relativeLayout, false);
        }
        RelativeLayout relativeLayout2 = this.f3382H;
        if (size > 1) {
            xdl0.M(relativeLayout2, true);
            this.f3386J.setText(this.f3401V.get(1).values);
            m5792f1(this.f3386J, this.f3384I, this.f3388K, z2, (this.f3403k0 == 1 && z) ? this.f3401V.get(1).counter + 1 : this.f3401V.get(1).counter, 1);
        } else {
            xdl0.M(relativeLayout2, false);
        }
        RelativeLayout relativeLayout3 = this.f3390L;
        if (size > 2) {
            xdl0.M(relativeLayout3, true);
            this.f3393N.setText(this.f3401V.get(2).values);
            m5792f1(this.f3393N, this.f3392M, this.f3394O, z2, (this.f3403k0 == 2 && z) ? this.f3401V.get(2).counter + 1 : this.f3401V.get(2).counter, 2);
        } else {
            xdl0.M(relativeLayout3, false);
        }
        RelativeLayout relativeLayout4 = this.f3395P;
        if (size > 3) {
            xdl0.M(relativeLayout4, true);
            this.f3397R.setText(this.f3401V.get(3).values);
            m5792f1(this.f3397R, this.f3396Q, this.f3398S, z2, (this.f3403k0 == 3 && z) ? this.f3401V.get(3).counter + 1 : this.f3401V.get(3).counter, 3);
        } else {
            xdl0.M(relativeLayout4, false);
        }
        xdl0.M(this.f3399T, true);
        this.f3399T.setText(this.f3402W == 1 ? String.format(act().getString(R$string.f367H2), Integer.valueOf(this.f3402W)) : String.format(act().getString(R$string.f373I2), Integer.valueOf(this.f3402W)));
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo5696r() {
        this.f3373B = this.f3385I0.m13710h();
        this.f3347a = this.f3385I0.m13708f();
        this.f3348b = this.f3385I0.m13711i();
        this.f3349c = this.f3385I0.m13703E();
        this.f3350d = this.f3385I0.m13704F();
        this.f3351e = this.f3385I0.m13707e();
        this.f3352f = this.f3385I0.m13712j();
        this.f3353g = this.f3385I0.m13713k();
        this.f3374C = this.f3385I0.m13701C();
        this.f3375D = this.f3385I0.m13719q();
        this.f3376E = this.f3385I0.m13722t();
        this.f3378F = this.f3385I0.m13721s();
        this.f3380G = this.f3385I0.m13720r();
        this.f3382H = this.f3385I0.m13727y();
        this.f3384I = this.f3385I0.m13700B();
        this.f3386J = this.f3385I0.m13699A();
        this.f3388K = this.f3385I0.m13728z();
        this.f3390L = this.f3385I0.m13723u();
        this.f3392M = this.f3385I0.m13726x();
        this.f3393N = this.f3385I0.m13725w();
        this.f3394O = this.f3385I0.m13724v();
        this.f3395P = this.f3385I0.m13715m();
        this.f3396Q = this.f3385I0.m13718p();
        this.f3397R = this.f3385I0.m13717o();
        this.f3398S = this.f3385I0.m13716n();
        this.f3399T = this.f3385I0.m13702D();
        this.f3354h = this.f3385I0.m13709g();
        this.f3400U = this.f3385I0.m13714l();
    }

    public void setVoteAggregationActClickable(boolean z) {
        this.f3387J0 = z;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m5794z0(final View view, final TextView textView, int i) {
        double dM5773H0 = m5773H0(i, this.f3402W);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) (100.0d * dM5773H0));
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration((int) (dM5773H0 * 1000.0d));
        valueAnimatorOfInt.addListener(new C2144a());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mtg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f10566a.m5775K0(view, textView, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    public FeedCenterVoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3403k0 = -1;
        this.f3377E0 = false;
        this.f3379F0 = t100.d(260.0f);
        this.f3381G0 = t100.d(35.0f);
        this.f3383H0 = "";
        this.f3387J0 = true;
        this.f3391L0 = b.b();
    }

    public FeedCenterVoteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3403k0 = -1;
        this.f3377E0 = false;
        this.f3379F0 = t100.d(260.0f);
        this.f3381G0 = t100.d(35.0f);
        this.f3383H0 = "";
        this.f3387J0 = true;
        this.f3391L0 = b.b();
    }
}
