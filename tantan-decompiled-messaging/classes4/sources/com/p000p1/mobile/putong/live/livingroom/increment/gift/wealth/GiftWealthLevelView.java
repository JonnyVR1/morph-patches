package com.p000p1.mobile.putong.live.livingroom.increment.gift.wealth;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.noble.GiftDialogNobelEntranceView;
import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import com.p1.mobile.putong.live.base.data.BLiveHierarchyProgressStyle;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveWealthButton;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.d30;
import l.dt0;
import l.fld0;
import l.ggv;
import l.hxs;
import l.kvc0;
import l.mep0;
import l.ngm;
import l.t100;
import l.vwb;
import l.w8u;
import l.w9j;
import l.xdl0;
import l.yb2;
import l.ym2;
import l.ypv;
import p002l.a1k;
import p002l.ahs;
import p002l.jl40;
import p002l.umj;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftWealthLevelView extends ConstraintLayout {

    /* JADX INFO: renamed from: G */
    public static final int f6408G = t100.d(36.0f);

    /* JADX INFO: renamed from: A */
    public boolean f6409A;

    /* JADX INFO: renamed from: B */
    public Animator f6410B;

    /* JADX INFO: renamed from: C */
    public AnimatorSet f6411C;

    /* JADX INFO: renamed from: D */
    public AnimatorSet f6412D;

    /* JADX INFO: renamed from: E */
    public AnimatorSet f6413E;

    /* JADX INFO: renamed from: F */
    public int f6414F;

    /* JADX INFO: renamed from: d */
    public View f6415d;

    /* JADX INFO: renamed from: e */
    public View f6416e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f6417f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f6418g;

    /* JADX INFO: renamed from: h */
    public VImage f6419h;

    /* JADX INFO: renamed from: i */
    public GiftDialogNobelEntranceView f6420i;

    /* JADX INFO: renamed from: j */
    public TextView f6421j;

    /* JADX INFO: renamed from: k */
    public TextView f6422k;

    /* JADX INFO: renamed from: l */
    public TextView f6423l;

    /* JADX INFO: renamed from: m */
    public ahs<?> f6424m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f6425n;

    /* JADX INFO: renamed from: o */
    public AnimatorSet f6426o;

    /* JADX INFO: renamed from: p */
    public AnimatorSet f6427p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f6428q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f6429r;

    /* JADX INFO: renamed from: s */
    public Animator f6430s;

    /* JADX INFO: renamed from: t */
    public final C0437a f6431t;

    /* JADX INFO: renamed from: u */
    public long f6432u;

    /* JADX INFO: renamed from: v */
    public BLiveHierarchyProgress f6433v;

    /* JADX INFO: renamed from: w */
    public double f6434w;

    /* JADX INFO: renamed from: x */
    public boolean f6435x;

    /* JADX INFO: renamed from: y */
    public boolean f6436y;

    /* JADX INFO: renamed from: z */
    public List<String> f6437z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView$a */
    public class C0436a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f6438a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f6439b;

        public C0436a(VDraweeView vDraweeView, d30 d30Var) {
            this.f6438a = vDraweeView;
            this.f6439b = d30Var;
        }

        /* JADX INFO: renamed from: h */
        public void m8203h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            int height = (int) (this.f6438a.getHeight() * (ngmVar.getWidth() / ngmVar.getHeight()));
            xdl0.D0(height, new View[]{this.f6438a});
            GiftWealthLevelView.this.f6414F = height;
            d30 d30Var = this.f6439b;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    public GiftWealthLevelView(Context context) {
        super(context);
        this.f6431t = new C0437a();
        this.f6432u = 0L;
        this.f6434w = 0.0d;
        this.f6435x = false;
        this.f6436y = true;
        this.f6437z = new ArrayList();
        this.f6414F = t100.d(32.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    private AnimatorSet m8147G0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(f6408G, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.l0k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14636a.m8173L0(valueAnimator);
            }
        });
        Animator animatorN = bt0.n(this, View.ALPHA, new float[]{1.0f, 0.0f});
        animatorN.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorN);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    private AnimatorSet m8148H0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, f6408G);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.n0k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f15771a.m8174N0(valueAnimator);
            }
        });
        Animator animatorN = bt0.n(this, View.ALPHA, new float[]{0.0f, 1.0f});
        animatorN.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorN);
        bt0.v(animatorSet, new Runnable() { // from class: l.o0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f16327a.m8175O0();
            }
        });
        bt0.f(animatorSet, new Runnable() { // from class: l.p0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f16948a.m8176P0();
            }
        });
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m8149X0() {
        BLiveHierarchyProgress bLiveHierarchyProgress = this.f6433v;
        if (bLiveHierarchyProgress != null) {
            setProgress(bLiveHierarchyProgress.wealthRatio);
        }
    }

    private AnimatorSet getNoticeTextAnim() {
        this.f6413E = new AnimatorSet();
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        TextView textView = this.f6423l;
        float[] fArr = {t100.d(6.0f), 0.0f};
        Property property = View.TRANSLATION_Y;
        Animator animatorN = bt0.n(textView, property, fArr);
        animatorN.setDuration(300L);
        Property property2 = View.ALPHA;
        Animator animatorN2 = bt0.n(this.f6423l, property2, new float[]{0.0f, 1.0f});
        animatorN2.setDuration(300L);
        Animator animatorJ = bt0.j(1000);
        Animator animatorN3 = bt0.n(this.f6423l, property, new float[]{0.0f, -t100.d(10.0f)});
        animatorN3.setDuration(300L);
        Animator animatorN4 = bt0.n(this.f6423l, property2, new float[]{1.0f, 0.0f});
        animatorN4.setDuration(300L);
        animatorSet.playTogether(animatorN, animatorN2);
        animatorSet2.playTogether(animatorN3, animatorN4);
        this.f6413E.playSequentially(animatorSet, animatorJ, animatorSet2);
        bt0.w(this.f6413E, new Runnable() { // from class: l.r0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f18310a.m8180T0();
            }
        }, new Runnable() { // from class: l.s0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f18747a.m8181U0();
            }
        });
        return this.f6413E;
    }

    private void setProgress(double d) {
        xdl0.D0(0, new View[]{this.f6416e});
        xdl0.M(this.f6416e, true);
        this.f6434w = d;
        double width = this.f6415d.getWidth();
        double d2 = (d * width) + ((double) this.f6414F) + ((double) t100.d(7.0f));
        if (d2 < width) {
            width = d2;
        }
        xdl0.D0((int) width, new View[]{this.f6416e});
    }

    /* JADX INFO: renamed from: D0 */
    public final void m8168D0(View view) {
        a1k.m9266a(this, view);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m8169E0() {
        dt0.C(this.f6410B);
        dt0.C(this.f6412D);
        dt0.C(this.f6411C);
    }

    /* JADX INFO: renamed from: I0 */
    public final AnimatorSet m8170I0() {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        Animator animatorN = bt0.n(this.f6428q, property, new float[]{1.0f, 0.0f});
        animatorN.setDuration(300L);
        VDraweeView vDraweeView = this.f6428q;
        float[] fArr = {0.0f, -t100.d(7.0f)};
        Property property2 = View.TRANSLATION_Y;
        Animator animatorN2 = bt0.n(vDraweeView, property2, fArr);
        animatorN2.setDuration(300L);
        Animator animatorN3 = bt0.n(this.f6429r, property, new float[]{0.0f, 1.0f});
        animatorN3.setDuration(600L);
        Animator animatorN4 = bt0.n(this.f6429r, property2, new float[]{t100.d(7.0f), 0.0f});
        animatorN4.setDuration(600L);
        animatorSet.play(animatorN2).with(animatorN).with(animatorN3).with(animatorN4);
        bt0.w(animatorSet, new Runnable() { // from class: l.z0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f23163a.m8177Q0();
            }
        }, new Runnable() { // from class: l.j0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f13522a.m8178R0();
            }
        });
        return animatorSet;
    }

    /* JADX INFO: renamed from: J0 */
    public final Animator m8171J0(C0437a.a aVar) {
        boolean z = aVar.m8208b() > this.f6432u;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: l.t0k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f19351a.m8179S0(valueAnimator);
            }
        };
        double d = this.f6434w;
        if (!z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((float) d, aVar.m8209c());
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
            return valueAnimatorOfFloat;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat((float) d, 1.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(animatorUpdateListener);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, aVar.m8209c());
        valueAnimatorOfFloat3.setDuration(200L);
        valueAnimatorOfFloat3.addUpdateListener(animatorUpdateListener);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        return animatorSet;
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: K0 */
    public final String m8172K0(C0437a.a aVar, boolean z) {
        String strU = w8u.u(R$string.f3013T4, Long.valueOf(aVar.m8207a()));
        if (!z) {
            return strU;
        }
        long jM8210d = aVar.m8210d();
        return jM8210d >= 1 ? w8u.v(R$string.f3055V4, new Object[]{Long.valueOf(aVar.m8207a()), Long.valueOf(jM8210d)}) : w8u.v(R$string.f3034U4, new Object[]{Long.valueOf(aVar.m8207a()), Long.valueOf(aVar.m8208b())});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m8173L0(ValueAnimator valueAnimator) {
        xdl0.C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m8174N0(ValueAnimator valueAnimator) {
        xdl0.C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m8175O0() {
        xdl0.M(this, true);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m8176P0() {
        if (getNobleInfo() == null || !ypv.k().h7()) {
            return;
        }
        jl40.m15998b(this.f6424m.mo21430R2());
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m8177Q0() {
        this.f6428q.setAlpha(1.0f);
        this.f6429r.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m8178R0() {
        VDraweeView vDraweeView = this.f6428q;
        this.f6428q = this.f6429r;
        this.f6429r = vDraweeView;
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m8179S0(ValueAnimator valueAnimator) {
        setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m8180T0() {
        this.f6409A = true;
        m8169E0();
        m8196o1(true);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m8181U0() {
        this.f6409A = false;
        m8196o1(false);
        m8198q1();
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m8182V0(View view) {
        this.f6424m.mo14197p3(700, this.f6433v.jumpSchema);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m8183Y0() {
        if (this.f6409A) {
            return;
        }
        m8196o1(false);
        this.f6421j.setAlpha(0.0f);
        m8195n1(this.f6422k.getText().toString(), this.f6421j);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m8184Z0() {
        if (this.f6409A) {
            return;
        }
        xdl0.M(this.f6422k, false);
        this.f6421j.requestFocus();
        xdl0.M(this.f6421j, true);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m8185a1() {
        if (this.f6409A) {
            return;
        }
        this.f6410B.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public void m8186b() {
        this.f6431t.m8205b();
        m8169E0();
        dt0.C(this.f6425n);
        dt0.C(this.f6430s);
        dt0.C(this.f6427p);
        dt0.C(this.f6426o);
        dt0.C(this.f6413E);
        this.f6425n = null;
        this.f6430s = null;
        this.f6427p = null;
        this.f6426o = null;
        this.f6413E = null;
        this.f6433v = null;
        xdl0.C0(this, f6408G);
        setAlpha(1.0f);
        xdl0.M(this, false);
        this.f6436y = true;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m8187d1() {
        if (this.f6409A) {
            return;
        }
        m8196o1(false);
        this.f6422k.setAlpha(0.0f);
        m8195n1(this.f6421j.getText().toString(), this.f6422k);
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m8188e1() {
        if (this.f6409A) {
            return;
        }
        xdl0.M(this.f6421j, false);
        xdl0.M(this.f6422k, true);
        this.f6422k.requestFocus();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m8189f1() {
        if (TextUtils.isEmpty(this.f6433v.jumpSchema)) {
            return;
        }
        xdl0.E0(this.f6415d, new View.OnClickListener() { // from class: l.q0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17750a.m8182V0(view);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final void m8190g1(long j, VDraweeView vDraweeView, d30 d30Var) {
        this.f6432u = j;
        BLiveUserLevel bLiveUserLevelV = ((ggv) ypv.l(fld0.c)).v(j);
        if (bLiveUserLevelV == null) {
            xdl0.M(vDraweeView, false);
        } else {
            xdl0.M(vDraweeView, true);
            hxs.w("context_livingAct", vDraweeView, j != 0 ? bLiveUserLevelV.backendUrl : this.f6433v.zeroGradeBackendUrl, new C0436a(vDraweeView, d30Var));
        }
    }

    public BLiveWealthButton getNobleInfo() {
        BLiveHierarchyProgress bLiveHierarchyProgress = this.f6433v;
        if (bLiveHierarchyProgress != null) {
            return (BLiveWealthButton) vwb.r(bLiveHierarchyProgress.buttons, new w9j() { // from class: l.i0k
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveWealthButton) obj).type.equals("noble"));
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m8191h1() {
        if (vwb.J(this.f6433v.buttons) || !ypv.k().h7()) {
            xdl0.M(this.f6420i, false);
            xdl0.W(this.f6415d, t100.l);
            return;
        }
        if (this.f6424m.isShowing() && this.f6436y) {
            jl40.m15998b(this.f6424m.mo21430R2());
            this.f6436y = false;
        }
        xdl0.M(this.f6420i, true);
        xdl0.W(this.f6415d, t100.h);
        this.f6420i.m8583T(this.f6424m, this.f6433v.buttons);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m8192j1(String str, String str2, String str3, String str4) {
        this.f6415d.setBackground(yb2.j(kvc0.g(str3), kvc0.g(str4), 6));
        this.f6416e.setBackground(yb2.j(kvc0.g(str), kvc0.g(str2), 6));
    }

    /* JADX INFO: renamed from: k1 */
    public final void m8193k1() {
        m8169E0();
        boolean zJ = vwb.J(this.f6437z);
        TextView textView = this.f6421j;
        if (zJ) {
            xdl0.M(textView, false);
            xdl0.M(this.f6422k, false);
            return;
        }
        xdl0.M(textView, true);
        this.f6421j.setText(this.f6437z.get(0));
        this.f6421j.requestFocus();
        if (this.f6437z.size() > 1) {
            m8197p1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l1 */
    public void m8194l1(ahs<?> ahsVar, umj umjVar) {
        this.f6424m = ahsVar;
        BLiveHierarchyProgress bLiveHierarchyProgressM23562i = umjVar.m23562i();
        this.f6433v = bLiveHierarchyProgressM23562i;
        m8190g1(bLiveHierarchyProgressM23562i.grade, this.f6428q, new d30() { // from class: l.m0k
            public final void call() {
                this.f15191a.m8149X0();
            }
        });
        m8191h1();
        m8189f1();
        this.f6437z = new ArrayList(this.f6433v.progressTexts);
        m8193k1();
        BLiveHierarchyProgressStyle bLiveHierarchyProgressStyle = this.f6433v.style;
        m8192j1(bLiveHierarchyProgressStyle.startColor, bLiveHierarchyProgressStyle.endColor, bLiveHierarchyProgressStyle.bgStartColor, bLiveHierarchyProgressStyle.bgEndColor);
        if (this.f6435x) {
            xdl0.C0(this, 0);
        } else {
            xdl0.C0(this, f6408G);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m8195n1(final String str, TextView textView) {
        int iG = vwb.G(this.f6437z, new w9j() { // from class: l.k0k
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(str));
            }
        });
        List<String> list = this.f6437z;
        textView.setText(list.get((iG + 1) % list.size()));
    }

    /* JADX INFO: renamed from: o1 */
    public final void m8196o1(boolean z) {
        this.f6423l.setAlpha(z ? 1.0f : 0.0f);
        xdl0.M(this.f6423l, z);
        xdl0.M(this.f6421j, !z);
        xdl0.M(this.f6422k, !z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8168D0(this);
        VDraweeView vDraweeView = this.f6417f;
        this.f6428q = vDraweeView;
        this.f6429r = this.f6418g;
        vDraweeView.setAlpha(1.0f);
        this.f6429r.setAlpha(0.0f);
        mep0.d1(this.f6415d, t100.d(6.0f));
        mep0.d1(this.f6416e, t100.d(6.0f));
    }

    /* JADX INFO: renamed from: p1 */
    public final void m8197p1() {
        if (this.f6411C == null) {
            this.f6411C = new AnimatorSet();
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            TextView textView = this.f6422k;
            float[] fArr = {t100.d(10.0f), 0.0f};
            Property property = View.TRANSLATION_Y;
            Animator animatorN = bt0.n(textView, property, fArr);
            animatorN.setDuration(300L);
            Property property2 = View.ALPHA;
            Animator animatorN2 = bt0.n(this.f6422k, property2, new float[]{0.0f, 1.0f});
            animatorN2.setDuration(300L);
            Animator animatorN3 = bt0.n(this.f6421j, property, new float[]{0.0f, -t100.d(10.0f)});
            animatorN3.setDuration(300L);
            Animator animatorN4 = bt0.n(this.f6421j, property2, new float[]{1.0f, 0.0f});
            animatorN4.setDuration(300L);
            animatorSet.playTogether(animatorN, animatorN2);
            animatorSet2.playTogether(animatorN3, animatorN4);
            this.f6411C.playTogether(animatorSet, animatorSet2);
            this.f6412D = new AnimatorSet();
            AnimatorSet animatorSet3 = new AnimatorSet();
            AnimatorSet animatorSet4 = new AnimatorSet();
            Animator animatorN5 = bt0.n(this.f6421j, property, new float[]{t100.d(10.0f), 0.0f});
            animatorN5.setDuration(300L);
            Animator animatorN6 = bt0.n(this.f6421j, property2, new float[]{0.0f, 1.0f});
            animatorN6.setDuration(300L);
            Animator animatorN7 = bt0.n(this.f6422k, property, new float[]{0.0f, -t100.d(10.0f)});
            animatorN7.setDuration(300L);
            Animator animatorN8 = bt0.n(this.f6422k, property2, new float[]{1.0f, 0.0f});
            animatorN8.setDuration(300L);
            animatorSet3.playTogether(animatorN5, animatorN6);
            animatorSet4.playTogether(animatorN7, animatorN8);
            this.f6412D.playTogether(animatorSet3, animatorSet4);
            this.f6410B = bt0.s(new Animator[]{bt0.j(3000), this.f6411C, bt0.j(3000), this.f6412D});
        }
        bt0.w(this.f6411C, new Runnable() { // from class: l.u0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f20446a.m8187d1();
            }
        }, new Runnable() { // from class: l.v0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f20920a.m8188e1();
            }
        });
        bt0.w(this.f6412D, new Runnable() { // from class: l.w0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f21404a.m8183Y0();
            }
        }, new Runnable() { // from class: l.x0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f22067a.m8184Z0();
            }
        });
        bt0.f(this.f6410B, new Runnable() { // from class: l.y0k
            @Override // java.lang.Runnable
            public final void run() {
                this.f22565a.m8185a1();
            }
        });
        this.f6410B.start();
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: q1 */
    public final void m8198q1() {
        if (this.f6409A) {
            return;
        }
        C0437a.a aVarM8206c = this.f6431t.m8206c();
        if (aVarM8206c == null) {
            m8193k1();
            return;
        }
        this.f6430s = m8171J0(aVarM8206c);
        if (this.f6413E == null) {
            this.f6413E = getNoticeTextAnim();
        }
        boolean z = aVarM8206c.m8208b() > this.f6432u;
        this.f6423l.setText(m8172K0(aVarM8206c, z));
        this.f6430s.start();
        this.f6413E.start();
        if (z) {
            this.f6425n = m8170I0();
            m8190g1(aVarM8206c.m8208b(), this.f6429r, null);
            this.f6425n.start();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m8199r1() {
        if (this.f6433v == null) {
            return;
        }
        if (this.f6427p == null) {
            this.f6427p = m8147G0();
        }
        this.f6427p.start();
    }

    /* JADX INFO: renamed from: s1 */
    public void m8200s1() {
        if (this.f6433v == null) {
            return;
        }
        if (this.f6426o == null) {
            this.f6426o = m8148H0();
        }
        this.f6426o.start();
        this.f6435x = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPacketPanelShowingFlag(boolean z) {
        this.f6435x = z;
        if (z && this.f6433v != null && xdl0.O0(this)) {
            xdl0.C0(this, 0);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m8201t1(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        ahs<?> ahsVar = this.f6424m;
        if (ahsVar == null) {
            return;
        }
        if (ahsVar.isShowing()) {
            this.f6431t.m8204a(userLiveHierarchyProgressChange);
            this.f6437z = new ArrayList(userLiveHierarchyProgressChange.getProgressTextsList());
            m8198q1();
        } else {
            m8202u1(userLiveHierarchyProgressChange);
        }
        m8192j1(userLiveHierarchyProgressChange.getStyle().getStartColor(), userLiveHierarchyProgressChange.getStyle().getEndColor(), userLiveHierarchyProgressChange.getStyle().getBgStartColor(), userLiveHierarchyProgressChange.getStyle().getBgEndColor());
    }

    /* JADX INFO: renamed from: u1 */
    public final void m8202u1(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        m8190g1(userLiveHierarchyProgressChange.getGrade(), this.f6428q, null);
        setProgress(userLiveHierarchyProgressChange.getWealthRatio());
    }

    public GiftWealthLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6431t = new C0437a();
        this.f6432u = 0L;
        this.f6434w = 0.0d;
        this.f6435x = false;
        this.f6436y = true;
        this.f6437z = new ArrayList();
        this.f6414F = t100.d(32.0f);
    }

    public GiftWealthLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6431t = new C0437a();
        this.f6432u = 0L;
        this.f6434w = 0.0d;
        this.f6435x = false;
        this.f6436y = true;
        this.f6437z = new ArrayList();
        this.f6414F = t100.d(32.0f);
    }
}
