package com.p051p1.mobile.putong.feed.newui.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.at0;
import p153l.bnl0;
import p153l.er60;
import p153l.gt0;
import p153l.i4g0;
import p153l.i4h;
import p153l.jka;
import p153l.kcg0;
import p153l.lbc0;
import p153l.lpg;
import p153l.npg;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.t5h;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGlobalPlayerView extends FrameLayout implements npg {

    /* JADX INFO: renamed from: B */
    public static String f44222B;

    /* JADX INFO: renamed from: C */
    public static String f44223C;

    /* JADX INFO: renamed from: D */
    public static boolean f44224D;

    /* JADX INFO: renamed from: A */
    public kcg0 f44225A;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f44226a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f44227b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f44228c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f44229d;

    /* JADX INFO: renamed from: e */
    public FeedProgressBar f44230e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f44231f;

    /* JADX INFO: renamed from: g */
    public VImage f44232g;

    /* JADX INFO: renamed from: h */
    public VImage f44233h;

    /* JADX INFO: renamed from: i */
    public VImage f44234i;

    /* JADX INFO: renamed from: j */
    public Moment f44235j;

    /* JADX INFO: renamed from: k */
    public User f44236k;

    /* JADX INFO: renamed from: l */
    public float f44237l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f44238m;

    /* JADX INFO: renamed from: n */
    public boolean f44239n;

    /* JADX INFO: renamed from: o */
    public boolean f44240o;

    /* JADX INFO: renamed from: p */
    public boolean f44241p;

    /* JADX INFO: renamed from: q */
    public boolean f44242q;

    /* JADX INFO: renamed from: r */
    public float f44243r;

    /* JADX INFO: renamed from: s */
    public final int f44244s;

    /* JADX INFO: renamed from: t */
    public final int f44245t;

    /* JADX INFO: renamed from: u */
    public final int f44246u;

    /* JADX INFO: renamed from: v */
    public final int f44247v;

    /* JADX INFO: renamed from: w */
    public final int f44248w;

    /* JADX INFO: renamed from: x */
    public final int f44249x;

    /* JADX INFO: renamed from: y */
    public Activity f44250y;

    /* JADX INFO: renamed from: z */
    public kcg0 f44251z;

    public FeedGlobalPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44237l = 1.0f;
        this.f44239n = true;
        this.f44240o = false;
        this.f44244s = qa00.m175859d(203.0f);
        this.f44245t = qa00.m175859d(70.0f);
        this.f44246u = 0;
        this.f44247v = 1;
        this.f44248w = 300;
        this.f44249x = 200;
        m67528r(context, null);
    }

    private ValueAnimator getProgressTimerAnim() {
        if (this.f44238m == null) {
            this.f44238m = this.f44230e.m67641b((int) (this.f44237l * 1000.0f));
        }
        this.f44238m.setDuration((int) (this.f44237l * 1000.0f));
        return this.f44238m;
    }

    private void setParentX(float f) {
        ((View) getParent()).setX(this.f44243r + f);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m67501A(Map map) {
        Moment moment = (Moment) map.get(this.f44235j.f56859id);
        if (NullChecker.m82486a(moment)) {
            Moment moment2 = this.f44235j;
            moment2.likes = moment.likes;
            moment2.messages = moment.messages;
            moment2.haveLiked = moment.haveLiked;
            m67516P(moment.haveLiked);
            m67514N();
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m67502B(boolean z, Envelope envelope) {
        m67516P(this.f44235j.haveLiked);
        er60.m122104w().m122117f(this.f44235j, f44223C, f44224D, 201, z);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m67503C(boolean z, Throwable th) {
        i4h.m138538g(th);
        er60.m122104w().m122119h(this.f44235j, f44223C, f44224D, th, z);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m67504D(int i, ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f44226a.getLayoutParams();
        marginLayoutParams.width = Float.valueOf(valueAnimator.getAnimatedValue() + "").intValue();
        this.f44226a.setLayoutParams(marginLayoutParams);
        if (this.f44240o) {
            setParentX(i - Float.valueOf(valueAnimator.getAnimatedValue() + "").intValue());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m67505E() {
        lpg.m155193v().m155229j0();
        setVisibility(8);
    }

    /* JADX INFO: renamed from: F */
    public final void m67506F() {
        if (this.f44242q) {
            return;
        }
        if (!(this.f44250y instanceof MomentDetailAct) || "from_moment_detail_album".equals(f44223C)) {
            this.f44242q = true;
            m67525o(f44222B);
            Intent intentM66018b = MomentDetailAct.C11469a.m66017a(getContext()).m66022f("").m66029m(this.f44235j.f56859id).m66030n(this.f44235j.owner).m66036t(true).m66031o(this.f44235j.momentValue).m66037u(true).m66018b();
            if (intentM66018b == null) {
                return;
            }
            getContext().startActivity(intentM66018b);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m67507G() {
        if (this.f44239n) {
            m67510J();
            this.f44239n = false;
        } else {
            m67527q();
            this.f44239n = true;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m67508H() {
        final boolean z = this.f44235j.haveLiked;
        Act actM67524n = m67524n();
        jka jkaVar = FeedModule.f39703d;
        Moment moment = this.f44235j;
        actM67524n.duringCreated(jkaVar.m145517Fb(moment.owner, moment.f56859id, !moment.haveLiked, moment.getMomentShowFrom())).subscribe(psd0.m173597H(new y20() { // from class: l.r5h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161356a.m67502B(z, (Envelope) obj);
            }
        }, new y20() { // from class: l.s5h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166368a.m67503C(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public final void m67509I() {
        if (NullChecker.m82486a(this.f44251z)) {
            this.f44251z.unsubscribe();
        }
        if (NullChecker.m82486a(this.f44225A)) {
            this.f44225A.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: J */
    public void m67510J() {
        if (this.f44239n) {
            m67531u();
            m67521U(this.f44244s, this.f44245t);
            m67520T(1, 0);
            this.f44239n = false;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m67511K() {
        if (this.f44239n) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f44226a.getLayoutParams();
            int i = this.f44245t;
            marginLayoutParams.width = i;
            marginLayoutParams.height = i;
            this.f44226a.setLayoutParams(marginLayoutParams);
            this.f44239n = false;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m67512L(Moment moment) {
        if (NullChecker.m82486a(this.f44235j)) {
            m67519S();
        }
        this.f44235j = moment;
        this.f44236k = FeedModule.f39703d.m145688e8(moment.owner);
        m67518R();
        setCurrentShowAct(m67524n());
    }

    /* JADX INFO: renamed from: M */
    public final void m67513M() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(qa00.m175859d(10.0f));
        gradientDrawable.setColor(-1);
        this.f44226a.setBackground(gradientDrawable);
        this.f44226a.setElevation(6.0f);
    }

    /* JADX INFO: renamed from: N */
    public final void m67514N() {
        this.f44233h.setImageResource(lbc0.f130977Y0);
    }

    /* JADX INFO: renamed from: O */
    public final void m67515O() {
        if (this.f44235j.media.size() > 0) {
            Media media = this.f44235j.media.get(0);
            if (media instanceof Audio) {
                this.f44237l = ((Audio) media).duration;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m67516P(boolean z) {
        VImage vImage = this.f44232g;
        if (z) {
            vImage.setImageResource(lbc0.f130992a1);
        } else {
            vImage.setImageResource(lbc0.f130984Z0);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m67517Q(float f) {
    }

    /* JADX INFO: renamed from: R */
    public final void m67518R() {
        at0.m100011e(this.f44235j, this.f44228c, this.f44236k);
        m67515O();
        m67516P(this.f44235j.haveLiked);
        m67514N();
        m67513M();
    }

    /* JADX INFO: renamed from: S */
    public final void m67519S() {
        m67517Q(0.0f);
        this.f44230e.setProgress(0.0f);
        getProgressTimerAnim().cancel();
    }

    /* JADX INFO: renamed from: T */
    public final void m67520T(int i, int i2) {
        Animator duration = gt0.m132171q(this.f44231f, "alpha", i, i2).setDuration(200L);
        if (i == 0) {
            this.f44231f.setAlpha(0.0f);
            duration.setStartDelay(100L);
        }
        duration.start();
    }

    /* JADX INFO: renamed from: U */
    public final void m67521U(int i, int i2) {
        final int width = this.f44226a.getWidth();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.q5h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f155713a.m67504D(width, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: a */
    public void mo67474a(Exception exc) {
        m67526p();
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: h */
    public void mo67522h() {
        this.f44229d.setVisibility(0);
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: i */
    public void mo67475i(boolean z) {
        m67526p();
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: j */
    public void mo67476j(float f) {
        m67517Q(f);
    }

    /* JADX INFO: renamed from: m */
    public View m67523m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t5h.m189401b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public final Act m67524n() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: o */
    public final void m67525o(String str) {
        Owner owner;
        if (NullChecker.m82486a(this.f44235j)) {
            ArrayList arrayList = new ArrayList();
            Live live = this.f44235j.live;
            arrayList.add(pf60.m172085a("anchorId", (live == null || (owner = live.anchor) == null) ? "" : owner.f39651id));
            Live live2 = this.f44235j.live;
            arrayList.add(pf60.m172085a("liveId", live2 != null ? live2.f39615id : ""));
            arrayList.add(pf60.m172085a("moment_id", this.f44235j.f56859id));
            arrayList.add(pf60.m172085a("owner_id", this.f44235j.owner));
            arrayList.add(pf60.m172085a("moment_showfrom", er60.m122103D(f44223C)));
            arrayList.add(pf60.m172085a("moment_type", er60.m122104w().m122135y(this.f44235j)));
            arrayList.add(pf60.m172085a("comment_detail", "comment"));
            i4g0.m138523u("e_comment", str, (pf60[]) arrayList.toArray(new pf60[0]));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m67530t();
    }

    @Override // p153l.npg
    public void onComplete() {
        m67526p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m67509I();
    }

    @Override // p153l.npg
    public void onPause() {
        this.f44241p = true;
        getProgressTimerAnim().pause();
    }

    @Override // p153l.npg
    public void onResume() {
        this.f44229d.setVisibility(8);
    }

    @Override // p153l.npg
    public void onStart() {
        if (this.f44241p) {
            getProgressTimerAnim().resume();
        } else {
            getProgressTimerAnim().start();
        }
        this.f44229d.setVisibility(8);
        this.f44241p = false;
    }

    /* JADX INFO: renamed from: p */
    public final void m67526p() {
        getProgressTimerAnim().cancel();
        this.f44229d.setVisibility(8);
    }

    /* JADX INFO: renamed from: q */
    public void m67527q() {
        if (this.f44239n) {
            return;
        }
        m67531u();
        m67521U(this.f44245t, this.f44244s);
        m67520T(0, 1);
        this.f44239n = true;
    }

    /* JADX INFO: renamed from: r */
    public final void m67528r(Context context, Moment moment) {
        addView(m67523m(LayoutInflater.from(context), this));
        m67529s();
        m67530t();
        m67511K();
        m67512L(moment);
    }

    /* JADX INFO: renamed from: s */
    public final void m67529s() {
        this.f44232g.setOnClickListener(new View.OnClickListener() { // from class: l.m5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134897a.m67533w(view);
            }
        });
        this.f44233h.setOnClickListener(new View.OnClickListener() { // from class: l.n5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140364a.m67534x(view);
            }
        });
        this.f44234i.setOnClickListener(new View.OnClickListener() { // from class: l.o5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145085a.m67535y(view);
            }
        });
        this.f44228c.setOnClickListener(new View.OnClickListener() { // from class: l.p5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150654a.m67536z(view);
            }
        });
    }

    public void setCurrentShowAct(Activity activity) {
        this.f44242q = false;
        this.f44250y = activity;
    }

    public void setFrom(String str) {
        f44223C = str;
    }

    public void setMoment(Moment moment) {
        this.f44235j = moment;
    }

    /* JADX INFO: renamed from: t */
    public final void m67530t() {
        m67509I();
        this.f44251z = FeedModule.f39703d.f121363l0.subscribe(psd0.m173596G(new y20() { // from class: l.l5h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130120a.m67501A((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public final void m67531u() {
        this.f44240o = m67532v();
        this.f44243r = getX();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m67532v() {
        int[] iArr = new int[2];
        this.f44226a.getLocationOnScreen(iArr);
        int i = iArr[0];
        return i > Math.abs((getWidth() + i) - bnl0.m105592y0());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m67533w(View view) {
        m67508H();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m67534x(View view) {
        m67506F();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m67535y(View view) {
        m67505E();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m67536z(View view) {
        m67507G();
    }

    public FeedGlobalPlayerView(Context context, Moment moment) {
        super(context);
        this.f44237l = 1.0f;
        this.f44239n = true;
        this.f44240o = false;
        this.f44244s = qa00.m175859d(203.0f);
        this.f44245t = qa00.m175859d(70.0f);
        this.f44246u = 0;
        this.f44247v = 1;
        this.f44248w = 300;
        this.f44249x = 200;
        m67528r(context, moment);
    }

    public FeedGlobalPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44237l = 1.0f;
        this.f44239n = true;
        this.f44240o = false;
        this.f44244s = qa00.m175859d(203.0f);
        this.f44245t = qa00.m175859d(70.0f);
        this.f44246u = 0;
        this.f44247v = 1;
        this.f44248w = 300;
        this.f44249x = 200;
        m67528r(context, null);
    }
}
