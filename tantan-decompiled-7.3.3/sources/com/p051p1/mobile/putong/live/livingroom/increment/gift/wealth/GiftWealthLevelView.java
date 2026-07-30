package com.p051p1.mobile.putong.live.livingroom.increment.gift.wealth;

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
import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import com.p051p1.mobile.putong.live.base.data.BLiveHierarchyProgressStyle;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.noble.GiftDialogNobelEntranceView;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bjs;
import p153l.bnl0;
import p153l.fc2;
import p153l.fn2;
import p153l.gt0;
import p153l.hiv;
import p153l.htd0;
import p153l.it0;
import p153l.izs;
import p153l.jyb;
import p153l.kpj;
import p153l.n3d0;
import p153l.q3k;
import p153l.qa00;
import p153l.qcj;
import p153l.qim;
import p153l.qnp0;
import p153l.x20;
import p153l.xau;
import p153l.xt40;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class GiftWealthLevelView extends ConstraintLayout {

    /* JADX INFO: renamed from: G */
    public static final int f51214G = qa00.m175859d(36.0f);

    /* JADX INFO: renamed from: A */
    public boolean f51215A;

    /* JADX INFO: renamed from: B */
    public Animator f51216B;

    /* JADX INFO: renamed from: C */
    public AnimatorSet f51217C;

    /* JADX INFO: renamed from: D */
    public AnimatorSet f51218D;

    /* JADX INFO: renamed from: E */
    public AnimatorSet f51219E;

    /* JADX INFO: renamed from: F */
    public int f51220F;

    /* JADX INFO: renamed from: d */
    public View f51221d;

    /* JADX INFO: renamed from: e */
    public View f51222e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f51223f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f51224g;

    /* JADX INFO: renamed from: h */
    public VImage f51225h;

    /* JADX INFO: renamed from: i */
    public GiftDialogNobelEntranceView f51226i;

    /* JADX INFO: renamed from: j */
    public TextView f51227j;

    /* JADX INFO: renamed from: k */
    public TextView f51228k;

    /* JADX INFO: renamed from: l */
    public TextView f51229l;

    /* JADX INFO: renamed from: m */
    public bjs<?> f51230m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f51231n;

    /* JADX INFO: renamed from: o */
    public AnimatorSet f51232o;

    /* JADX INFO: renamed from: p */
    public AnimatorSet f51233p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f51234q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f51235r;

    /* JADX INFO: renamed from: s */
    public Animator f51236s;

    /* JADX INFO: renamed from: t */
    public final C13011a f51237t;

    /* JADX INFO: renamed from: u */
    public long f51238u;

    /* JADX INFO: renamed from: v */
    public BLiveHierarchyProgress f51239v;

    /* JADX INFO: renamed from: w */
    public double f51240w;

    /* JADX INFO: renamed from: x */
    public boolean f51241x;

    /* JADX INFO: renamed from: y */
    public boolean f51242y;

    /* JADX INFO: renamed from: z */
    public List<String> f51243z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView$a */
    public class C13010a extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f51244a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f51245b;

        public C13010a(VDraweeView vDraweeView, x20 x20Var) {
            this.f51244a = vDraweeView;
            this.f51245b = x20Var;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (qimVar == null) {
                return;
            }
            int height = (int) (this.f51244a.getHeight() * (qimVar.getWidth() / qimVar.getHeight()));
            bnl0.m105507D0(height, this.f51244a);
            GiftWealthLevelView.this.f51220F = height;
            x20 x20Var = this.f51245b;
            if (x20Var != null) {
                x20Var.call();
            }
        }
    }

    public GiftWealthLevelView(Context context) {
        super(context);
        this.f51237t = new C13011a();
        this.f51238u = 0L;
        this.f51240w = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f51241x = false;
        this.f51242y = true;
        this.f51243z = new ArrayList();
        this.f51220F = qa00.m175859d(32.0f);
    }

    /* JADX INFO: renamed from: G0 */
    private AnimatorSet m75738G0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(f51214G, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.b3k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f74783a.m75764L0(valueAnimator);
            }
        });
        Animator animatorM132168n = gt0.m132168n(this, View.ALPHA, 1.0f, 0.0f);
        animatorM132168n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM132168n);
        return animatorSet;
    }

    /* JADX INFO: renamed from: H0 */
    private AnimatorSet m75739H0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, f51214G);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.d3k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f84913a.m75765N0(valueAnimator);
            }
        });
        Animator animatorM132168n = gt0.m132168n(this, View.ALPHA, 0.0f, 1.0f);
        animatorM132168n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM132168n);
        gt0.m132176v(animatorSet, new Runnable() { // from class: l.e3k
            @Override // java.lang.Runnable
            public final void run() {
                this.f91978a.m75766O0();
            }
        });
        gt0.m132160f(animatorSet, new Runnable() { // from class: l.f3k
            @Override // java.lang.Runnable
            public final void run() {
                this.f96996a.m75767P0();
            }
        });
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m75740X0() {
        BLiveHierarchyProgress bLiveHierarchyProgress = this.f51239v;
        if (bLiveHierarchyProgress != null) {
            setProgress(bLiveHierarchyProgress.wealthRatio);
        }
    }

    private AnimatorSet getNoticeTextAnim() {
        this.f51219E = new AnimatorSet();
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        TextView textView = this.f51229l;
        float[] fArr = {qa00.m175859d(6.0f), 0.0f};
        Property property = View.TRANSLATION_Y;
        Animator animatorM132168n = gt0.m132168n(textView, property, fArr);
        animatorM132168n.setDuration(300L);
        Property property2 = View.ALPHA;
        Animator animatorM132168n2 = gt0.m132168n(this.f51229l, property2, 0.0f, 1.0f);
        animatorM132168n2.setDuration(300L);
        Animator animatorM132164j = gt0.m132164j(1000);
        Animator animatorM132168n3 = gt0.m132168n(this.f51229l, property, 0.0f, -qa00.m175859d(10.0f));
        animatorM132168n3.setDuration(300L);
        Animator animatorM132168n4 = gt0.m132168n(this.f51229l, property2, 1.0f, 0.0f);
        animatorM132168n4.setDuration(300L);
        animatorSet.playTogether(animatorM132168n, animatorM132168n2);
        animatorSet2.playTogether(animatorM132168n3, animatorM132168n4);
        this.f51219E.playSequentially(animatorSet, animatorM132164j, animatorSet2);
        gt0.m132177w(this.f51219E, new Runnable() { // from class: l.h3k
            @Override // java.lang.Runnable
            public final void run() {
                this.f107667a.m75771T0();
            }
        }, new Runnable() { // from class: l.i3k
            @Override // java.lang.Runnable
            public final void run() {
                this.f112732a.m75772U0();
            }
        });
        return this.f51219E;
    }

    private void setProgress(double d) {
        bnl0.m105507D0(0, this.f51222e);
        bnl0.m105524M(this.f51222e, true);
        this.f51240w = d;
        double width = this.f51221d.getWidth();
        double dM175859d = (d * width) + ((double) this.f51220F) + ((double) qa00.m175859d(7.0f));
        if (dM175859d < width) {
            width = dM175859d;
        }
        bnl0.m105507D0((int) width, this.f51222e);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m75759D0(View view) {
        q3k.m175125a(this, view);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m75760E0() {
        it0.m142009C(this.f51216B);
        it0.m142009C(this.f51218D);
        it0.m142009C(this.f51217C);
    }

    /* JADX INFO: renamed from: I0 */
    public final AnimatorSet m75761I0() {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        Animator animatorM132168n = gt0.m132168n(this.f51234q, property, 1.0f, 0.0f);
        animatorM132168n.setDuration(300L);
        VDraweeView vDraweeView = this.f51234q;
        float[] fArr = {0.0f, -qa00.m175859d(7.0f)};
        Property property2 = View.TRANSLATION_Y;
        Animator animatorM132168n2 = gt0.m132168n(vDraweeView, property2, fArr);
        animatorM132168n2.setDuration(300L);
        Animator animatorM132168n3 = gt0.m132168n(this.f51235r, property, 0.0f, 1.0f);
        animatorM132168n3.setDuration(600L);
        Animator animatorM132168n4 = gt0.m132168n(this.f51235r, property2, qa00.m175859d(7.0f), 0.0f);
        animatorM132168n4.setDuration(600L);
        animatorSet.play(animatorM132168n2).with(animatorM132168n).with(animatorM132168n3).with(animatorM132168n4);
        gt0.m132177w(animatorSet, new Runnable() { // from class: l.p3k
            @Override // java.lang.Runnable
            public final void run() {
                this.f150412a.m75768Q0();
            }
        }, new Runnable() { // from class: l.z2k
            @Override // java.lang.Runnable
            public final void run() {
                this.f202710a.m75769R0();
            }
        });
        return animatorSet;
    }

    /* JADX INFO: renamed from: J0 */
    public final Animator m75762J0(C13011a.a aVar) {
        boolean z = aVar.m75798b() > this.f51238u;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: l.j3k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f118189a.m75770S0(valueAnimator);
            }
        };
        double d = this.f51240w;
        if (!z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((float) d, aVar.m75799c());
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
            return valueAnimatorOfFloat;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat((float) d, 1.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(animatorUpdateListener);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, aVar.m75799c());
        valueAnimatorOfFloat3.setDuration(200L);
        valueAnimatorOfFloat3.addUpdateListener(animatorUpdateListener);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        return animatorSet;
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: K0 */
    public final String m75763K0(C13011a.a aVar, boolean z) {
        String strM209911u = xau.m209911u(R$string.f47819T4, Long.valueOf(aVar.m75797a()));
        if (!z) {
            return strM209911u;
        }
        long jM75800d = aVar.m75800d();
        return jM75800d >= 1 ? xau.m209912v(R$string.f47861V4, Long.valueOf(aVar.m75797a()), Long.valueOf(jM75800d)) : xau.m209912v(R$string.f47840U4, Long.valueOf(aVar.m75797a()), Long.valueOf(aVar.m75798b()));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m75764L0(ValueAnimator valueAnimator) {
        bnl0.m105505C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m75765N0(ValueAnimator valueAnimator) {
        bnl0.m105505C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m75766O0() {
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m75767P0() {
        if (getNobleInfo() == null || !zrv.m221193k().m203637h7()) {
            return;
        }
        xt40.m213043b(this.f51230m.mo78457R2());
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m75768Q0() {
        this.f51234q.setAlpha(1.0f);
        this.f51235r.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m75769R0() {
        VDraweeView vDraweeView = this.f51234q;
        this.f51234q = this.f51235r;
        this.f51235r = vDraweeView;
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m75770S0(ValueAnimator valueAnimator) {
        setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m75771T0() {
        this.f51215A = true;
        m75760E0();
        m75787o1(true);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m75772U0() {
        this.f51215A = false;
        m75787o1(false);
        m75789q1();
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m75773V0(View view) {
        this.f51230m.mo138869p3(700, this.f51239v.jumpSchema);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m75774Y0() {
        if (this.f51215A) {
            return;
        }
        m75787o1(false);
        this.f51227j.setAlpha(0.0f);
        m75786n1(this.f51228k.getText().toString(), this.f51227j);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m75775Z0() {
        if (this.f51215A) {
            return;
        }
        bnl0.m105524M(this.f51228k, false);
        this.f51227j.requestFocus();
        bnl0.m105524M(this.f51227j, true);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m75776a1() {
        if (this.f51215A) {
            return;
        }
        this.f51216B.start();
    }

    /* JADX INFO: renamed from: b */
    public void m75777b() {
        this.f51237t.m75795b();
        m75760E0();
        it0.m142009C(this.f51231n);
        it0.m142009C(this.f51236s);
        it0.m142009C(this.f51233p);
        it0.m142009C(this.f51232o);
        it0.m142009C(this.f51219E);
        this.f51231n = null;
        this.f51236s = null;
        this.f51233p = null;
        this.f51232o = null;
        this.f51219E = null;
        this.f51239v = null;
        bnl0.m105505C0(this, f51214G);
        setAlpha(1.0f);
        bnl0.m105524M(this, false);
        this.f51242y = true;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m75778d1() {
        if (this.f51215A) {
            return;
        }
        m75787o1(false);
        this.f51228k.setAlpha(0.0f);
        m75786n1(this.f51227j.getText().toString(), this.f51228k);
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m75779e1() {
        if (this.f51215A) {
            return;
        }
        bnl0.m105524M(this.f51227j, false);
        bnl0.m105524M(this.f51228k, true);
        this.f51228k.requestFocus();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m75780f1() {
        if (TextUtils.isEmpty(this.f51239v.jumpSchema)) {
            return;
        }
        bnl0.m105509E0(this.f51221d, new View.OnClickListener() { // from class: l.g3k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101993a.m75773V0(view);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final void m75781g1(long j, VDraweeView vDraweeView, x20 x20Var) {
        this.f51238u = j;
        BLiveUserLevel bLiveUserLevelM135170v = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(j);
        if (bLiveUserLevelM135170v == null) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            izs.m142872w("context_livingAct", vDraweeView, j != 0 ? bLiveUserLevelM135170v.backendUrl : this.f51239v.zeroGradeBackendUrl, new C13010a(vDraweeView, x20Var));
        }
    }

    public BLiveWealthButton getNobleInfo() {
        BLiveHierarchyProgress bLiveHierarchyProgress = this.f51239v;
        if (bLiveHierarchyProgress != null) {
            return (BLiveWealthButton) jyb.m147529r(bLiveHierarchyProgress.buttons, new qcj() { // from class: l.y2k
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveWealthButton) obj).type.equals("noble"));
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m75782h1() {
        if (jyb.m147479J(this.f51239v.buttons) || !zrv.m221193k().m203637h7()) {
            bnl0.m105524M(this.f51226i, false);
            bnl0.m105539W(this.f51221d, qa00.f156325l);
            return;
        }
        if (this.f51230m.isShowing() && this.f51242y) {
            xt40.m213043b(this.f51230m.mo78457R2());
            this.f51242y = false;
        }
        bnl0.m105524M(this.f51226i, true);
        bnl0.m105539W(this.f51221d, qa00.f156321h);
        this.f51226i.m76160T(this.f51230m, this.f51239v.buttons);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m75783j1(String str, String str2, String str3, String str4) {
        this.f51221d.setBackground(fc2.m124980j(n3d0.m161283g(str3), n3d0.m161283g(str4), 6));
        this.f51222e.setBackground(fc2.m124980j(n3d0.m161283g(str), n3d0.m161283g(str2), 6));
    }

    /* JADX INFO: renamed from: k1 */
    public final void m75784k1() {
        m75760E0();
        boolean zM147479J = jyb.m147479J(this.f51243z);
        TextView textView = this.f51227j;
        if (zM147479J) {
            bnl0.m105524M(textView, false);
            bnl0.m105524M(this.f51228k, false);
            return;
        }
        bnl0.m105524M(textView, true);
        this.f51227j.setText(this.f51243z.get(0));
        this.f51227j.requestFocus();
        if (this.f51243z.size() > 1) {
            m75788p1();
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m75785l1(bjs<?> bjsVar, kpj kpjVar) {
        this.f51230m = bjsVar;
        BLiveHierarchyProgress bLiveHierarchyProgressM150737i = kpjVar.m150737i();
        this.f51239v = bLiveHierarchyProgressM150737i;
        m75781g1(bLiveHierarchyProgressM150737i.grade, this.f51234q, new x20() { // from class: l.c3k
            @Override // p153l.x20
            public final void call() {
                this.f79628a.m75740X0();
            }
        });
        m75782h1();
        m75780f1();
        this.f51243z = new ArrayList(this.f51239v.progressTexts);
        m75784k1();
        BLiveHierarchyProgressStyle bLiveHierarchyProgressStyle = this.f51239v.style;
        m75783j1(bLiveHierarchyProgressStyle.startColor, bLiveHierarchyProgressStyle.endColor, bLiveHierarchyProgressStyle.bgStartColor, bLiveHierarchyProgressStyle.bgEndColor);
        if (this.f51241x) {
            bnl0.m105505C0(this, 0);
        } else {
            bnl0.m105505C0(this, f51214G);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m75786n1(final String str, TextView textView) {
        int iM147476G = jyb.m147476G(this.f51243z, new qcj() { // from class: l.a3k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(str));
            }
        });
        List<String> list = this.f51243z;
        textView.setText(list.get((iM147476G + 1) % list.size()));
    }

    /* JADX INFO: renamed from: o1 */
    public final void m75787o1(boolean z) {
        this.f51229l.setAlpha(z ? 1.0f : 0.0f);
        bnl0.m105524M(this.f51229l, z);
        bnl0.m105524M(this.f51227j, !z);
        bnl0.m105524M(this.f51228k, !z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75759D0(this);
        VDraweeView vDraweeView = this.f51223f;
        this.f51234q = vDraweeView;
        this.f51235r = this.f51224g;
        vDraweeView.setAlpha(1.0f);
        this.f51235r.setAlpha(0.0f);
        qnp0.m177261d1(this.f51221d, qa00.m175859d(6.0f));
        qnp0.m177261d1(this.f51222e, qa00.m175859d(6.0f));
    }

    /* JADX INFO: renamed from: p1 */
    public final void m75788p1() {
        if (this.f51217C == null) {
            this.f51217C = new AnimatorSet();
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            TextView textView = this.f51228k;
            float[] fArr = {qa00.m175859d(10.0f), 0.0f};
            Property property = View.TRANSLATION_Y;
            Animator animatorM132168n = gt0.m132168n(textView, property, fArr);
            animatorM132168n.setDuration(300L);
            Property property2 = View.ALPHA;
            Animator animatorM132168n2 = gt0.m132168n(this.f51228k, property2, 0.0f, 1.0f);
            animatorM132168n2.setDuration(300L);
            Animator animatorM132168n3 = gt0.m132168n(this.f51227j, property, 0.0f, -qa00.m175859d(10.0f));
            animatorM132168n3.setDuration(300L);
            Animator animatorM132168n4 = gt0.m132168n(this.f51227j, property2, 1.0f, 0.0f);
            animatorM132168n4.setDuration(300L);
            animatorSet.playTogether(animatorM132168n, animatorM132168n2);
            animatorSet2.playTogether(animatorM132168n3, animatorM132168n4);
            this.f51217C.playTogether(animatorSet, animatorSet2);
            this.f51218D = new AnimatorSet();
            AnimatorSet animatorSet3 = new AnimatorSet();
            AnimatorSet animatorSet4 = new AnimatorSet();
            Animator animatorM132168n5 = gt0.m132168n(this.f51227j, property, qa00.m175859d(10.0f), 0.0f);
            animatorM132168n5.setDuration(300L);
            Animator animatorM132168n6 = gt0.m132168n(this.f51227j, property2, 0.0f, 1.0f);
            animatorM132168n6.setDuration(300L);
            Animator animatorM132168n7 = gt0.m132168n(this.f51228k, property, 0.0f, -qa00.m175859d(10.0f));
            animatorM132168n7.setDuration(300L);
            Animator animatorM132168n8 = gt0.m132168n(this.f51228k, property2, 1.0f, 0.0f);
            animatorM132168n8.setDuration(300L);
            animatorSet3.playTogether(animatorM132168n5, animatorM132168n6);
            animatorSet4.playTogether(animatorM132168n7, animatorM132168n8);
            this.f51218D.playTogether(animatorSet3, animatorSet4);
            this.f51216B = gt0.m132173s(gt0.m132164j(3000), this.f51217C, gt0.m132164j(3000), this.f51218D);
        }
        gt0.m132177w(this.f51217C, new Runnable() { // from class: l.k3k
            @Override // java.lang.Runnable
            public final void run() {
                this.f123721a.m75778d1();
            }
        }, new Runnable() { // from class: l.l3k
            @Override // java.lang.Runnable
            public final void run() {
                this.f129888a.m75779e1();
            }
        });
        gt0.m132177w(this.f51218D, new Runnable() { // from class: l.m3k
            @Override // java.lang.Runnable
            public final void run() {
                this.f134673a.m75774Y0();
            }
        }, new Runnable() { // from class: l.n3k
            @Override // java.lang.Runnable
            public final void run() {
                this.f140006a.m75775Z0();
            }
        });
        gt0.m132160f(this.f51216B, new Runnable() { // from class: l.o3k
            @Override // java.lang.Runnable
            public final void run() {
                this.f144842a.m75776a1();
            }
        });
        this.f51216B.start();
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: q1 */
    public final void m75789q1() {
        if (this.f51215A) {
            return;
        }
        C13011a.a aVarM75796c = this.f51237t.m75796c();
        if (aVarM75796c == null) {
            m75784k1();
            return;
        }
        this.f51236s = m75762J0(aVarM75796c);
        if (this.f51219E == null) {
            this.f51219E = getNoticeTextAnim();
        }
        boolean z = aVarM75796c.m75798b() > this.f51238u;
        this.f51229l.setText(m75763K0(aVarM75796c, z));
        this.f51236s.start();
        this.f51219E.start();
        if (z) {
            this.f51231n = m75761I0();
            m75781g1(aVarM75796c.m75798b(), this.f51235r, null);
            this.f51231n.start();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m75790r1() {
        if (this.f51239v == null) {
            return;
        }
        if (this.f51233p == null) {
            this.f51233p = m75738G0();
        }
        this.f51233p.start();
    }

    /* JADX INFO: renamed from: s1 */
    public void m75791s1() {
        if (this.f51239v == null) {
            return;
        }
        if (this.f51232o == null) {
            this.f51232o = m75739H0();
        }
        this.f51232o.start();
        this.f51241x = false;
    }

    public void setPacketPanelShowingFlag(boolean z) {
        this.f51241x = z;
        if (z && this.f51239v != null && bnl0.m105529O0(this)) {
            bnl0.m105505C0(this, 0);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m75792t1(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        bjs<?> bjsVar = this.f51230m;
        if (bjsVar == null) {
            return;
        }
        if (bjsVar.isShowing()) {
            this.f51237t.m75794a(userLiveHierarchyProgressChange);
            this.f51243z = new ArrayList(userLiveHierarchyProgressChange.getProgressTextsList());
            m75789q1();
        } else {
            m75793u1(userLiveHierarchyProgressChange);
        }
        m75783j1(userLiveHierarchyProgressChange.getStyle().getStartColor(), userLiveHierarchyProgressChange.getStyle().getEndColor(), userLiveHierarchyProgressChange.getStyle().getBgStartColor(), userLiveHierarchyProgressChange.getStyle().getBgEndColor());
    }

    /* JADX INFO: renamed from: u1 */
    public final void m75793u1(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        m75781g1(userLiveHierarchyProgressChange.getGrade(), this.f51234q, null);
        setProgress(userLiveHierarchyProgressChange.getWealthRatio());
    }

    public GiftWealthLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51237t = new C13011a();
        this.f51238u = 0L;
        this.f51240w = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f51241x = false;
        this.f51242y = true;
        this.f51243z = new ArrayList();
        this.f51220F = qa00.m175859d(32.0f);
    }

    public GiftWealthLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51237t = new C13011a();
        this.f51238u = 0L;
        this.f51240w = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f51241x = false;
        this.f51242y = true;
        this.f51243z = new ArrayList();
        this.f51220F = qa00.m175859d(32.0f);
    }
}
