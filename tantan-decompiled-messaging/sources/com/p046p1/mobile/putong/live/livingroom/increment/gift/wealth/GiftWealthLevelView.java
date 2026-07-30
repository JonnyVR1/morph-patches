package com.p046p1.mobile.putong.live.livingroom.increment.gift.wealth;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import com.p046p1.mobile.putong.live.base.data.BLiveHierarchyProgressStyle;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.noble.GiftDialogNobelEntranceView;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.a1k;
import p149l.ahs;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.fld0;
import p149l.ggv;
import p149l.hxs;
import p149l.jl40;
import p149l.kvc0;
import p149l.mep0;
import p149l.ngm;
import p149l.t100;
import p149l.umj;
import p149l.vwb;
import p149l.w8u;
import p149l.w9j;
import p149l.xdl0;
import p149l.yb2;
import p149l.ym2;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class GiftWealthLevelView extends ConstraintLayout {

    /* JADX INFO: renamed from: G */
    public static final int f50366G = t100.m186890d(36.0f);

    /* JADX INFO: renamed from: A */
    public boolean f50367A;

    /* JADX INFO: renamed from: B */
    public Animator f50368B;

    /* JADX INFO: renamed from: C */
    public AnimatorSet f50369C;

    /* JADX INFO: renamed from: D */
    public AnimatorSet f50370D;

    /* JADX INFO: renamed from: E */
    public AnimatorSet f50371E;

    /* JADX INFO: renamed from: F */
    public int f50372F;

    /* JADX INFO: renamed from: d */
    public View f50373d;

    /* JADX INFO: renamed from: e */
    public View f50374e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f50375f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50376g;

    /* JADX INFO: renamed from: h */
    public VImage f50377h;

    /* JADX INFO: renamed from: i */
    public GiftDialogNobelEntranceView f50378i;

    /* JADX INFO: renamed from: j */
    public TextView f50379j;

    /* JADX INFO: renamed from: k */
    public TextView f50380k;

    /* JADX INFO: renamed from: l */
    public TextView f50381l;

    /* JADX INFO: renamed from: m */
    public ahs<?> f50382m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f50383n;

    /* JADX INFO: renamed from: o */
    public AnimatorSet f50384o;

    /* JADX INFO: renamed from: p */
    public AnimatorSet f50385p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f50386q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f50387r;

    /* JADX INFO: renamed from: s */
    public Animator f50388s;

    /* JADX INFO: renamed from: t */
    public final C12848a f50389t;

    /* JADX INFO: renamed from: u */
    public long f50390u;

    /* JADX INFO: renamed from: v */
    public BLiveHierarchyProgress f50391v;

    /* JADX INFO: renamed from: w */
    public double f50392w;

    /* JADX INFO: renamed from: x */
    public boolean f50393x;

    /* JADX INFO: renamed from: y */
    public boolean f50394y;

    /* JADX INFO: renamed from: z */
    public List<String> f50395z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView$a */
    public class C12847a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f50396a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f50397b;

        public C12847a(VDraweeView vDraweeView, d30 d30Var) {
            this.f50396a = vDraweeView;
            this.f50397b = d30Var;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            int height = (int) (this.f50396a.getHeight() * (ngmVar.getWidth() / ngmVar.getHeight()));
            xdl0.m208327D0(height, this.f50396a);
            GiftWealthLevelView.this.f50372F = height;
            d30 d30Var = this.f50397b;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    public GiftWealthLevelView(Context context) {
        super(context);
        this.f50389t = new C12848a();
        this.f50390u = 0L;
        this.f50392w = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f50393x = false;
        this.f50394y = true;
        this.f50395z = new ArrayList();
        this.f50372F = t100.m186890d(32.0f);
    }

    /* JADX INFO: renamed from: G0 */
    private AnimatorSet m74555G0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(f50366G, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.l0k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f125548a.m74581L0(valueAnimator);
            }
        });
        Animator animatorM103741n = bt0.m103741n(this, View.ALPHA, 1.0f, 0.0f);
        animatorM103741n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM103741n);
        return animatorSet;
    }

    /* JADX INFO: renamed from: H0 */
    private AnimatorSet m74556H0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, f50366G);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.n0k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f136563a.m74582N0(valueAnimator);
            }
        });
        Animator animatorM103741n = bt0.m103741n(this, View.ALPHA, 0.0f, 1.0f);
        animatorM103741n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM103741n);
        bt0.m103749v(animatorSet, new Runnable() { // from class: l.o0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f141341a.m74583O0();
            }
        });
        bt0.m103733f(animatorSet, new Runnable() { // from class: l.p0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f146604a.m74584P0();
            }
        });
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m74557X0() {
        BLiveHierarchyProgress bLiveHierarchyProgress = this.f50391v;
        if (bLiveHierarchyProgress != null) {
            setProgress(bLiveHierarchyProgress.wealthRatio);
        }
    }

    private AnimatorSet getNoticeTextAnim() {
        this.f50371E = new AnimatorSet();
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        TextView textView = this.f50381l;
        float[] fArr = {t100.m186890d(6.0f), 0.0f};
        Property property = View.TRANSLATION_Y;
        Animator animatorM103741n = bt0.m103741n(textView, property, fArr);
        animatorM103741n.setDuration(300L);
        Property property2 = View.ALPHA;
        Animator animatorM103741n2 = bt0.m103741n(this.f50381l, property2, 0.0f, 1.0f);
        animatorM103741n2.setDuration(300L);
        Animator animatorM103737j = bt0.m103737j(1000);
        Animator animatorM103741n3 = bt0.m103741n(this.f50381l, property, 0.0f, -t100.m186890d(10.0f));
        animatorM103741n3.setDuration(300L);
        Animator animatorM103741n4 = bt0.m103741n(this.f50381l, property2, 1.0f, 0.0f);
        animatorM103741n4.setDuration(300L);
        animatorSet.playTogether(animatorM103741n, animatorM103741n2);
        animatorSet2.playTogether(animatorM103741n3, animatorM103741n4);
        this.f50371E.playSequentially(animatorSet, animatorM103737j, animatorSet2);
        bt0.m103750w(this.f50371E, new Runnable() { // from class: l.r0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f157178a.m74588T0();
            }
        }, new Runnable() { // from class: l.s0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f161775a.m74589U0();
            }
        });
        return this.f50371E;
    }

    private void setProgress(double d) {
        xdl0.m208327D0(0, this.f50374e);
        xdl0.m208344M(this.f50374e, true);
        this.f50392w = d;
        double width = this.f50373d.getWidth();
        double dM186890d = (d * width) + ((double) this.f50372F) + ((double) t100.m186890d(7.0f));
        if (dM186890d < width) {
            width = dM186890d;
        }
        xdl0.m208327D0((int) width, this.f50374e);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m74576D0(View view) {
        a1k.m94565a(this, view);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m74577E0() {
        dt0.m113503C(this.f50368B);
        dt0.m113503C(this.f50370D);
        dt0.m113503C(this.f50369C);
    }

    /* JADX INFO: renamed from: I0 */
    public final AnimatorSet m74578I0() {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        Animator animatorM103741n = bt0.m103741n(this.f50386q, property, 1.0f, 0.0f);
        animatorM103741n.setDuration(300L);
        VDraweeView vDraweeView = this.f50386q;
        float[] fArr = {0.0f, -t100.m186890d(7.0f)};
        Property property2 = View.TRANSLATION_Y;
        Animator animatorM103741n2 = bt0.m103741n(vDraweeView, property2, fArr);
        animatorM103741n2.setDuration(300L);
        Animator animatorM103741n3 = bt0.m103741n(this.f50387r, property, 0.0f, 1.0f);
        animatorM103741n3.setDuration(600L);
        Animator animatorM103741n4 = bt0.m103741n(this.f50387r, property2, t100.m186890d(7.0f), 0.0f);
        animatorM103741n4.setDuration(600L);
        animatorSet.play(animatorM103741n2).with(animatorM103741n).with(animatorM103741n3).with(animatorM103741n4);
        bt0.m103750w(animatorSet, new Runnable() { // from class: l.z0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f200999a.m74585Q0();
            }
        }, new Runnable() { // from class: l.j0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f115679a.m74586R0();
            }
        });
        return animatorSet;
    }

    /* JADX INFO: renamed from: J0 */
    public final Animator m74579J0(C12848a.a aVar) {
        boolean z = aVar.m74615b() > this.f50390u;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: l.t0k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f167194a.m74587S0(valueAnimator);
            }
        };
        double d = this.f50392w;
        if (!z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((float) d, aVar.m74616c());
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
            return valueAnimatorOfFloat;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat((float) d, 1.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(animatorUpdateListener);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, aVar.m74616c());
        valueAnimatorOfFloat3.setDuration(200L);
        valueAnimatorOfFloat3.addUpdateListener(animatorUpdateListener);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        return animatorSet;
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: K0 */
    public final String m74580K0(C12848a.a aVar, boolean z) {
        String strM202218u = w8u.m202218u(R$string.f46971T4, Long.valueOf(aVar.m74614a()));
        if (!z) {
            return strM202218u;
        }
        long jM74617d = aVar.m74617d();
        return jM74617d >= 1 ? w8u.m202219v(R$string.f47013V4, Long.valueOf(aVar.m74614a()), Long.valueOf(jM74617d)) : w8u.m202219v(R$string.f46992U4, Long.valueOf(aVar.m74614a()), Long.valueOf(aVar.m74615b()));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m74581L0(ValueAnimator valueAnimator) {
        xdl0.m208325C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m74582N0(ValueAnimator valueAnimator) {
        xdl0.m208325C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m74583O0() {
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m74584P0() {
        if (getNobleInfo() == null || !ypv.m215672k().m195850h7()) {
            return;
        }
        jl40.m141926b(this.f50382m.mo77274R2());
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m74585Q0() {
        this.f50386q.setAlpha(1.0f);
        this.f50387r.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m74586R0() {
        VDraweeView vDraweeView = this.f50386q;
        this.f50386q = this.f50387r;
        this.f50387r = vDraweeView;
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m74587S0(ValueAnimator valueAnimator) {
        setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m74588T0() {
        this.f50367A = true;
        m74577E0();
        m74604o1(true);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m74589U0() {
        this.f50367A = false;
        m74604o1(false);
        m74606q1();
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m74590V0(View view) {
        this.f50382m.mo129310p3(700, this.f50391v.jumpSchema);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m74591Y0() {
        if (this.f50367A) {
            return;
        }
        m74604o1(false);
        this.f50379j.setAlpha(0.0f);
        m74603n1(this.f50380k.getText().toString(), this.f50379j);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m74592Z0() {
        if (this.f50367A) {
            return;
        }
        xdl0.m208344M(this.f50380k, false);
        this.f50379j.requestFocus();
        xdl0.m208344M(this.f50379j, true);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m74593a1() {
        if (this.f50367A) {
            return;
        }
        this.f50368B.start();
    }

    /* JADX INFO: renamed from: b */
    public void m74594b() {
        this.f50389t.m74612b();
        m74577E0();
        dt0.m113503C(this.f50383n);
        dt0.m113503C(this.f50388s);
        dt0.m113503C(this.f50385p);
        dt0.m113503C(this.f50384o);
        dt0.m113503C(this.f50371E);
        this.f50383n = null;
        this.f50388s = null;
        this.f50385p = null;
        this.f50384o = null;
        this.f50371E = null;
        this.f50391v = null;
        xdl0.m208325C0(this, f50366G);
        setAlpha(1.0f);
        xdl0.m208344M(this, false);
        this.f50394y = true;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m74595d1() {
        if (this.f50367A) {
            return;
        }
        m74604o1(false);
        this.f50380k.setAlpha(0.0f);
        m74603n1(this.f50379j.getText().toString(), this.f50380k);
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m74596e1() {
        if (this.f50367A) {
            return;
        }
        xdl0.m208344M(this.f50379j, false);
        xdl0.m208344M(this.f50380k, true);
        this.f50380k.requestFocus();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m74597f1() {
        if (TextUtils.isEmpty(this.f50391v.jumpSchema)) {
            return;
        }
        xdl0.m208329E0(this.f50373d, new View.OnClickListener() { // from class: l.q0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152063a.m74590V0(view);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final void m74598g1(long j, VDraweeView vDraweeView, d30 d30Var) {
        this.f50390u = j;
        BLiveUserLevel bLiveUserLevelM126036v = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(j);
        if (bLiveUserLevelM126036v == null) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            hxs.m133410w("context_livingAct", vDraweeView, j != 0 ? bLiveUserLevelM126036v.backendUrl : this.f50391v.zeroGradeBackendUrl, new C12847a(vDraweeView, d30Var));
        }
    }

    public BLiveWealthButton getNobleInfo() {
        BLiveHierarchyProgress bLiveHierarchyProgress = this.f50391v;
        if (bLiveHierarchyProgress != null) {
            return (BLiveWealthButton) vwb.m200346r(bLiveHierarchyProgress.buttons, new w9j() { // from class: l.i0k
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveWealthButton) obj).type.equals("noble"));
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m74599h1() {
        if (vwb.m200296J(this.f50391v.buttons) || !ypv.m215672k().m195850h7()) {
            xdl0.m208344M(this.f50378i, false);
            xdl0.m208359W(this.f50373d, t100.f167263l);
            return;
        }
        if (this.f50382m.isShowing() && this.f50394y) {
            jl40.m141926b(this.f50382m.mo77274R2());
            this.f50394y = false;
        }
        xdl0.m208344M(this.f50378i, true);
        xdl0.m208359W(this.f50373d, t100.f167259h);
        this.f50378i.m74977T(this.f50382m, this.f50391v.buttons);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m74600j1(String str, String str2, String str3, String str4) {
        this.f50373d.setBackground(yb2.m213885j(kvc0.m147358g(str3), kvc0.m147358g(str4), 6));
        this.f50374e.setBackground(yb2.m213885j(kvc0.m147358g(str), kvc0.m147358g(str2), 6));
    }

    /* JADX INFO: renamed from: k1 */
    public final void m74601k1() {
        m74577E0();
        boolean zM200296J = vwb.m200296J(this.f50395z);
        TextView textView = this.f50379j;
        if (zM200296J) {
            xdl0.m208344M(textView, false);
            xdl0.m208344M(this.f50380k, false);
            return;
        }
        xdl0.m208344M(textView, true);
        this.f50379j.setText(this.f50395z.get(0));
        this.f50379j.requestFocus();
        if (this.f50395z.size() > 1) {
            m74605p1();
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m74602l1(ahs<?> ahsVar, umj umjVar) {
        this.f50382m = ahsVar;
        BLiveHierarchyProgress bLiveHierarchyProgressM194372i = umjVar.m194372i();
        this.f50391v = bLiveHierarchyProgressM194372i;
        m74598g1(bLiveHierarchyProgressM194372i.grade, this.f50386q, new d30() { // from class: l.m0k
            @Override // p149l.d30
            public final void call() {
                this.f130741a.m74557X0();
            }
        });
        m74599h1();
        m74597f1();
        this.f50395z = new ArrayList(this.f50391v.progressTexts);
        m74601k1();
        BLiveHierarchyProgressStyle bLiveHierarchyProgressStyle = this.f50391v.style;
        m74600j1(bLiveHierarchyProgressStyle.startColor, bLiveHierarchyProgressStyle.endColor, bLiveHierarchyProgressStyle.bgStartColor, bLiveHierarchyProgressStyle.bgEndColor);
        if (this.f50393x) {
            xdl0.m208325C0(this, 0);
        } else {
            xdl0.m208325C0(this, f50366G);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m74603n1(final String str, TextView textView) {
        int iM200293G = vwb.m200293G(this.f50395z, new w9j() { // from class: l.k0k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(str));
            }
        });
        List<String> list = this.f50395z;
        textView.setText(list.get((iM200293G + 1) % list.size()));
    }

    /* JADX INFO: renamed from: o1 */
    public final void m74604o1(boolean z) {
        this.f50381l.setAlpha(z ? 1.0f : 0.0f);
        xdl0.m208344M(this.f50381l, z);
        xdl0.m208344M(this.f50379j, !z);
        xdl0.m208344M(this.f50380k, !z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74576D0(this);
        VDraweeView vDraweeView = this.f50375f;
        this.f50386q = vDraweeView;
        this.f50387r = this.f50376g;
        vDraweeView.setAlpha(1.0f);
        this.f50387r.setAlpha(0.0f);
        mep0.m154302d1(this.f50373d, t100.m186890d(6.0f));
        mep0.m154302d1(this.f50374e, t100.m186890d(6.0f));
    }

    /* JADX INFO: renamed from: p1 */
    public final void m74605p1() {
        if (this.f50369C == null) {
            this.f50369C = new AnimatorSet();
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            TextView textView = this.f50380k;
            float[] fArr = {t100.m186890d(10.0f), 0.0f};
            Property property = View.TRANSLATION_Y;
            Animator animatorM103741n = bt0.m103741n(textView, property, fArr);
            animatorM103741n.setDuration(300L);
            Property property2 = View.ALPHA;
            Animator animatorM103741n2 = bt0.m103741n(this.f50380k, property2, 0.0f, 1.0f);
            animatorM103741n2.setDuration(300L);
            Animator animatorM103741n3 = bt0.m103741n(this.f50379j, property, 0.0f, -t100.m186890d(10.0f));
            animatorM103741n3.setDuration(300L);
            Animator animatorM103741n4 = bt0.m103741n(this.f50379j, property2, 1.0f, 0.0f);
            animatorM103741n4.setDuration(300L);
            animatorSet.playTogether(animatorM103741n, animatorM103741n2);
            animatorSet2.playTogether(animatorM103741n3, animatorM103741n4);
            this.f50369C.playTogether(animatorSet, animatorSet2);
            this.f50370D = new AnimatorSet();
            AnimatorSet animatorSet3 = new AnimatorSet();
            AnimatorSet animatorSet4 = new AnimatorSet();
            Animator animatorM103741n5 = bt0.m103741n(this.f50379j, property, t100.m186890d(10.0f), 0.0f);
            animatorM103741n5.setDuration(300L);
            Animator animatorM103741n6 = bt0.m103741n(this.f50379j, property2, 0.0f, 1.0f);
            animatorM103741n6.setDuration(300L);
            Animator animatorM103741n7 = bt0.m103741n(this.f50380k, property, 0.0f, -t100.m186890d(10.0f));
            animatorM103741n7.setDuration(300L);
            Animator animatorM103741n8 = bt0.m103741n(this.f50380k, property2, 1.0f, 0.0f);
            animatorM103741n8.setDuration(300L);
            animatorSet3.playTogether(animatorM103741n5, animatorM103741n6);
            animatorSet4.playTogether(animatorM103741n7, animatorM103741n8);
            this.f50370D.playTogether(animatorSet3, animatorSet4);
            this.f50368B = bt0.m103746s(bt0.m103737j(3000), this.f50369C, bt0.m103737j(3000), this.f50370D);
        }
        bt0.m103750w(this.f50369C, new Runnable() { // from class: l.u0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f172919a.m74595d1();
            }
        }, new Runnable() { // from class: l.v0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f179119a.m74596e1();
            }
        });
        bt0.m103750w(this.f50370D, new Runnable() { // from class: l.w0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f183924a.m74591Y0();
            }
        }, new Runnable() { // from class: l.x0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f188980a.m74592Z0();
            }
        });
        bt0.m103733f(this.f50368B, new Runnable() { // from class: l.y0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f195314a.m74593a1();
            }
        });
        this.f50368B.start();
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: q1 */
    public final void m74606q1() {
        if (this.f50367A) {
            return;
        }
        C12848a.a aVarM74613c = this.f50389t.m74613c();
        if (aVarM74613c == null) {
            m74601k1();
            return;
        }
        this.f50388s = m74579J0(aVarM74613c);
        if (this.f50371E == null) {
            this.f50371E = getNoticeTextAnim();
        }
        boolean z = aVarM74613c.m74615b() > this.f50390u;
        this.f50381l.setText(m74580K0(aVarM74613c, z));
        this.f50388s.start();
        this.f50371E.start();
        if (z) {
            this.f50383n = m74578I0();
            m74598g1(aVarM74613c.m74615b(), this.f50387r, null);
            this.f50383n.start();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m74607r1() {
        if (this.f50391v == null) {
            return;
        }
        if (this.f50385p == null) {
            this.f50385p = m74555G0();
        }
        this.f50385p.start();
    }

    /* JADX INFO: renamed from: s1 */
    public void m74608s1() {
        if (this.f50391v == null) {
            return;
        }
        if (this.f50384o == null) {
            this.f50384o = m74556H0();
        }
        this.f50384o.start();
        this.f50393x = false;
    }

    public void setPacketPanelShowingFlag(boolean z) {
        this.f50393x = z;
        if (z && this.f50391v != null && xdl0.m208349O0(this)) {
            xdl0.m208325C0(this, 0);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m74609t1(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        ahs<?> ahsVar = this.f50382m;
        if (ahsVar == null) {
            return;
        }
        if (ahsVar.isShowing()) {
            this.f50389t.m74611a(userLiveHierarchyProgressChange);
            this.f50395z = new ArrayList(userLiveHierarchyProgressChange.getProgressTextsList());
            m74606q1();
        } else {
            m74610u1(userLiveHierarchyProgressChange);
        }
        m74600j1(userLiveHierarchyProgressChange.getStyle().getStartColor(), userLiveHierarchyProgressChange.getStyle().getEndColor(), userLiveHierarchyProgressChange.getStyle().getBgStartColor(), userLiveHierarchyProgressChange.getStyle().getBgEndColor());
    }

    /* JADX INFO: renamed from: u1 */
    public final void m74610u1(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        m74598g1(userLiveHierarchyProgressChange.getGrade(), this.f50386q, null);
        setProgress(userLiveHierarchyProgressChange.getWealthRatio());
    }

    public GiftWealthLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50389t = new C12848a();
        this.f50390u = 0L;
        this.f50392w = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f50393x = false;
        this.f50394y = true;
        this.f50395z = new ArrayList();
        this.f50372F = t100.m186890d(32.0f);
    }

    public GiftWealthLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50389t = new C12848a();
        this.f50390u = 0L;
        this.f50392w = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f50393x = false;
        this.f50394y = true;
        this.f50395z = new ArrayList();
        this.f50372F = t100.m186890d(32.0f);
    }
}
