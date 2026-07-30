package com.p000p1.mobile.putong.feed.newui.view;

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
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import l.bt0;
import l.c4g0;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import l.xdl0;
import l.zvf0;
import p007l.e4h;
import p007l.f3c0;
import p007l.t2h;
import p007l.vs0;
import p007l.wng;
import p007l.xia;
import p007l.yng;
import p007l.zi60;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGlobalPlayerView extends FrameLayout implements yng {

    /* JADX INFO: renamed from: B */
    public static String f4835B;

    /* JADX INFO: renamed from: C */
    public static String f4836C;

    /* JADX INFO: renamed from: D */
    public static boolean f4837D;

    /* JADX INFO: renamed from: A */
    public c4g0 f4838A;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f4839a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f4840b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4841c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f4842d;

    /* JADX INFO: renamed from: e */
    public FeedProgressBar f4843e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f4844f;

    /* JADX INFO: renamed from: g */
    public VImage f4845g;

    /* JADX INFO: renamed from: h */
    public VImage f4846h;

    /* JADX INFO: renamed from: i */
    public VImage f4847i;

    /* JADX INFO: renamed from: j */
    public Moment f4848j;

    /* JADX INFO: renamed from: k */
    public User f4849k;

    /* JADX INFO: renamed from: l */
    public float f4850l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f4851m;

    /* JADX INFO: renamed from: n */
    public boolean f4852n;

    /* JADX INFO: renamed from: o */
    public boolean f4853o;

    /* JADX INFO: renamed from: p */
    public boolean f4854p;

    /* JADX INFO: renamed from: q */
    public boolean f4855q;

    /* JADX INFO: renamed from: r */
    public float f4856r;

    /* JADX INFO: renamed from: s */
    public final int f4857s;

    /* JADX INFO: renamed from: t */
    public final int f4858t;

    /* JADX INFO: renamed from: u */
    public final int f4859u;

    /* JADX INFO: renamed from: v */
    public final int f4860v;

    /* JADX INFO: renamed from: w */
    public final int f4861w;

    /* JADX INFO: renamed from: x */
    public final int f4862x;

    /* JADX INFO: renamed from: y */
    public Activity f4863y;

    /* JADX INFO: renamed from: z */
    public c4g0 f4864z;

    public FeedGlobalPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4850l = 1.0f;
        this.f4852n = true;
        this.f4853o = false;
        this.f4857s = t100.d(203.0f);
        this.f4858t = t100.d(70.0f);
        this.f4859u = 0;
        this.f4860v = 1;
        this.f4861w = GivenGiftBrief.LUXURY_GIFT_LEVEL;
        this.f4862x = GivenGiftBrief.ADVANCED_GIFT_LEVEL;
        m7510r(context, null);
    }

    private ValueAnimator getProgressTimerAnim() {
        if (this.f4851m == null) {
            this.f4851m = this.f4843e.m7625b((int) (this.f4850l * 1000.0f));
        }
        this.f4851m.setDuration((int) (this.f4850l * 1000.0f));
        return this.f4851m;
    }

    private void setParentX(float f) {
        ((View) getParent()).setX(this.f4856r + f);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m7483A(Map map) {
        Moment moment = (Moment) map.get(((DbObject) this.f4848j).id);
        if (NullChecker.a(moment)) {
            Moment moment2 = this.f4848j;
            moment2.likes = moment.likes;
            moment2.messages = moment.messages;
            moment2.haveLiked = moment.haveLiked;
            m7498P(moment.haveLiked);
            m7496N();
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m7484B(boolean z, Envelope envelope) {
        m7498P(this.f4848j.haveLiked);
        zi60.m17436w().m17449f(this.f4848j, f4836C, f4837D, 201, z);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m7485C(boolean z, Throwable th) {
        t2h.m14427g(th);
        zi60.m17436w().m17451h(this.f4848j, f4836C, f4837D, th, z);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m7486D(int i, ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4839a.getLayoutParams();
        marginLayoutParams.width = Float.valueOf(valueAnimator.getAnimatedValue() + "").intValue();
        this.f4839a.setLayoutParams(marginLayoutParams);
        if (this.f4853o) {
            setParentX(i - Float.valueOf(valueAnimator.getAnimatedValue() + "").intValue());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m7487E() {
        wng.m15855v().m15891j0();
        setVisibility(8);
    }

    /* JADX INFO: renamed from: F */
    public final void m7488F() {
        if (this.f4855q) {
            return;
        }
        if (!(this.f4863y instanceof MomentDetailAct) || "from_moment_detail_album".equals(f4836C)) {
            this.f4855q = true;
            m7507o(f4835B);
            Intent intentM5932b = MomentDetailAct.C2150a.m5931a(getContext()).m5936f("").m5943m(((DbObject) this.f4848j).id).m5944n(this.f4848j.owner).m5950t(true).m5945o(this.f4848j.momentValue).m5951u(true).m5932b();
            if (intentM5932b == null) {
                return;
            }
            getContext().startActivity(intentM5932b);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m7489G() {
        if (this.f4852n) {
            m7492J();
            this.f4852n = false;
        } else {
            m7509q();
            this.f4852n = true;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m7490H() {
        final boolean z = this.f4848j.haveLiked;
        Act actM7506n = m7506n();
        xia xiaVar = FeedModule.f316d;
        Moment moment = this.f4848j;
        actM7506n.duringCreated(xiaVar.m16457Fb(moment.owner, ((DbObject) moment).id, !moment.haveLiked, moment.getMomentShowFrom())).subscribe(mkd0.H(new e30() { // from class: l.c4h
            public final void call(Object obj) {
                this.f6528a.m7484B(z, (Envelope) obj);
            }
        }, new e30() { // from class: l.d4h
            public final void call(Object obj) {
                this.f6808a.m7485C(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public final void m7491I() {
        if (NullChecker.a(this.f4864z)) {
            this.f4864z.unsubscribe();
        }
        if (NullChecker.a(this.f4838A)) {
            this.f4838A.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: J */
    public void m7492J() {
        if (this.f4852n) {
            m7513u();
            m7503U(this.f4857s, this.f4858t);
            m7502T(1, 0);
            this.f4852n = false;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m7493K() {
        if (this.f4852n) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4839a.getLayoutParams();
            int i = this.f4858t;
            marginLayoutParams.width = i;
            marginLayoutParams.height = i;
            this.f4839a.setLayoutParams(marginLayoutParams);
            this.f4852n = false;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m7494L(Moment moment) {
        if (NullChecker.a(this.f4848j)) {
            m7501S();
        }
        this.f4848j = moment;
        this.f4849k = FeedModule.f316d.m16628e8(moment.owner);
        m7500R();
        setCurrentShowAct(m7506n());
    }

    /* JADX INFO: renamed from: M */
    public final void m7495M() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.d(10.0f));
        gradientDrawable.setColor(-1);
        this.f4839a.setBackground(gradientDrawable);
        this.f4839a.setElevation(6.0f);
    }

    /* JADX INFO: renamed from: N */
    public final void m7496N() {
        this.f4846h.setImageResource(f3c0.f7742Y0);
    }

    /* JADX INFO: renamed from: O */
    public final void m7497O() {
        if (this.f4848j.media.size() > 0) {
            Media media = this.f4848j.media.get(0);
            if (media instanceof Audio) {
                this.f4850l = ((Audio) media).duration;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m7498P(boolean z) {
        VImage vImage = this.f4845g;
        if (z) {
            vImage.setImageResource(f3c0.f7757a1);
        } else {
            vImage.setImageResource(f3c0.f7749Z0);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m7499Q(float f) {
    }

    /* JADX INFO: renamed from: R */
    public final void m7500R() {
        vs0.m15567e(this.f4848j, this.f4841c, this.f4849k);
        m7497O();
        m7498P(this.f4848j.haveLiked);
        m7496N();
        m7495M();
    }

    /* JADX INFO: renamed from: S */
    public final void m7501S() {
        m7499Q(0.0f);
        this.f4843e.setProgress(0.0f);
        getProgressTimerAnim().cancel();
    }

    /* JADX INFO: renamed from: T */
    public final void m7502T(int i, int i2) {
        Animator duration = bt0.q(this.f4844f, "alpha", new float[]{i, i2}).setDuration(200L);
        if (i == 0) {
            this.f4844f.setAlpha(0.0f);
            duration.setStartDelay(100L);
        }
        duration.start();
    }

    /* JADX INFO: renamed from: U */
    public final void m7503U(int i, int i2) {
        final int width = this.f4839a.getWidth();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.b4h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f5916a.m7486D(width, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: a */
    public void mo7451a(Exception exc) {
        m7508p();
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: h */
    public void mo7504h() {
        this.f4842d.setVisibility(0);
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: i */
    public void mo7452i(boolean z) {
        m7508p();
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: j */
    public void mo7453j(float f) {
        m7499Q(f);
    }

    /* JADX INFO: renamed from: m */
    public View m7505m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e4h.m9611b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public final Act m7506n() {
        return getContext();
    }

    /* JADX INFO: renamed from: o */
    public final void m7507o(String str) {
        Owner owner;
        if (NullChecker.a(this.f4848j)) {
            ArrayList arrayList = new ArrayList();
            Live live = this.f4848j.live;
            arrayList.add(j760.a("anchorId", (live == null || (owner = live.anchor) == null) ? "" : owner.f264id));
            Live live2 = this.f4848j.live;
            arrayList.add(j760.a("liveId", live2 != null ? live2.f228id : ""));
            arrayList.add(j760.a("moment_id", ((DbObject) this.f4848j).id));
            arrayList.add(j760.a("owner_id", this.f4848j.owner));
            arrayList.add(j760.a("moment_showfrom", zi60.m17435D(f4836C)));
            arrayList.add(j760.a("moment_type", zi60.m17436w().m17467y(this.f4848j)));
            arrayList.add(j760.a("comment_detail", "comment"));
            zvf0.u("e_comment", str, (j760[]) arrayList.toArray(new j760[0]));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7512t();
    }

    @Override // p007l.yng
    public void onComplete() {
        m7508p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7491I();
    }

    @Override // p007l.yng
    public void onPause() {
        this.f4854p = true;
        getProgressTimerAnim().pause();
    }

    @Override // p007l.yng
    public void onResume() {
        this.f4842d.setVisibility(8);
    }

    @Override // p007l.yng
    public void onStart() {
        if (this.f4854p) {
            getProgressTimerAnim().resume();
        } else {
            getProgressTimerAnim().start();
        }
        this.f4842d.setVisibility(8);
        this.f4854p = false;
    }

    /* JADX INFO: renamed from: p */
    public final void m7508p() {
        getProgressTimerAnim().cancel();
        this.f4842d.setVisibility(8);
    }

    /* JADX INFO: renamed from: q */
    public void m7509q() {
        if (this.f4852n) {
            return;
        }
        m7513u();
        m7503U(this.f4858t, this.f4857s);
        m7502T(0, 1);
        this.f4852n = true;
    }

    /* JADX INFO: renamed from: r */
    public final void m7510r(Context context, Moment moment) {
        addView(m7505m(LayoutInflater.from(context), this));
        m7511s();
        m7512t();
        m7493K();
        m7494L(moment);
    }

    /* JADX INFO: renamed from: s */
    public final void m7511s() {
        this.f4845g.setOnClickListener(new View.OnClickListener() { // from class: l.x3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14755a.m7515w(view);
            }
        });
        this.f4846h.setOnClickListener(new View.OnClickListener() { // from class: l.y3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15229a.m7516x(view);
            }
        });
        this.f4847i.setOnClickListener(new View.OnClickListener() { // from class: l.z3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15574a.m7517y(view);
            }
        });
        this.f4841c.setOnClickListener(new View.OnClickListener() { // from class: l.a4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5576a.m7518z(view);
            }
        });
    }

    public void setCurrentShowAct(Activity activity) {
        this.f4855q = false;
        this.f4863y = activity;
    }

    public void setFrom(String str) {
        f4836C = str;
    }

    public void setMoment(Moment moment) {
        this.f4848j = moment;
    }

    /* JADX INFO: renamed from: t */
    public final void m7512t() {
        m7491I();
        this.f4864z = FeedModule.f316d.f14988l0.subscribe(mkd0.G(new e30() { // from class: l.w3h
            public final void call(Object obj) {
                this.f14385a.m7483A((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public final void m7513u() {
        this.f4853o = m7514v();
        this.f4856r = getX();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m7514v() {
        int[] iArr = new int[2];
        this.f4839a.getLocationOnScreen(iArr);
        int i = iArr[0];
        return i > Math.abs((getWidth() + i) - xdl0.y0());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m7515w(View view) {
        m7490H();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m7516x(View view) {
        m7488F();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m7517y(View view) {
        m7487E();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m7518z(View view) {
        m7489G();
    }

    public FeedGlobalPlayerView(Context context, Moment moment) {
        super(context);
        this.f4850l = 1.0f;
        this.f4852n = true;
        this.f4853o = false;
        this.f4857s = t100.d(203.0f);
        this.f4858t = t100.d(70.0f);
        this.f4859u = 0;
        this.f4860v = 1;
        this.f4861w = GivenGiftBrief.LUXURY_GIFT_LEVEL;
        this.f4862x = GivenGiftBrief.ADVANCED_GIFT_LEVEL;
        m7510r(context, moment);
    }

    public FeedGlobalPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4850l = 1.0f;
        this.f4852n = true;
        this.f4853o = false;
        this.f4857s = t100.d(203.0f);
        this.f4858t = t100.d(70.0f);
        this.f4859u = 0;
        this.f4860v = 1;
        this.f4861w = GivenGiftBrief.LUXURY_GIFT_LEVEL;
        this.f4862x = GivenGiftBrief.ADVANCED_GIFT_LEVEL;
        m7510r(context, null);
    }
}
