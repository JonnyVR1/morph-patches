package com.p046p1.mobile.putong.feed.newui.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.bt0;
import p149l.c4g0;
import p149l.e30;
import p149l.e4h;
import p149l.f3c0;
import p149l.j760;
import p149l.mkd0;
import p149l.t100;
import p149l.t2h;
import p149l.vs0;
import p149l.wng;
import p149l.xdl0;
import p149l.xia;
import p149l.yng;
import p149l.zi60;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGlobalPlayerView extends FrameLayout implements yng {

    /* JADX INFO: renamed from: B */
    public static String f43374B;

    /* JADX INFO: renamed from: C */
    public static String f43375C;

    /* JADX INFO: renamed from: D */
    public static boolean f43376D;

    /* JADX INFO: renamed from: A */
    public c4g0 f43377A;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f43378a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f43379b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f43380c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f43381d;

    /* JADX INFO: renamed from: e */
    public FeedProgressBar f43382e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f43383f;

    /* JADX INFO: renamed from: g */
    public VImage f43384g;

    /* JADX INFO: renamed from: h */
    public VImage f43385h;

    /* JADX INFO: renamed from: i */
    public VImage f43386i;

    /* JADX INFO: renamed from: j */
    public Moment f43387j;

    /* JADX INFO: renamed from: k */
    public User f43388k;

    /* JADX INFO: renamed from: l */
    public float f43389l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f43390m;

    /* JADX INFO: renamed from: n */
    public boolean f43391n;

    /* JADX INFO: renamed from: o */
    public boolean f43392o;

    /* JADX INFO: renamed from: p */
    public boolean f43393p;

    /* JADX INFO: renamed from: q */
    public boolean f43394q;

    /* JADX INFO: renamed from: r */
    public float f43395r;

    /* JADX INFO: renamed from: s */
    public final int f43396s;

    /* JADX INFO: renamed from: t */
    public final int f43397t;

    /* JADX INFO: renamed from: u */
    public final int f43398u;

    /* JADX INFO: renamed from: v */
    public final int f43399v;

    /* JADX INFO: renamed from: w */
    public final int f43400w;

    /* JADX INFO: renamed from: x */
    public final int f43401x;

    /* JADX INFO: renamed from: y */
    public Activity f43402y;

    /* JADX INFO: renamed from: z */
    public c4g0 f43403z;

    public FeedGlobalPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43389l = 1.0f;
        this.f43391n = true;
        this.f43392o = false;
        this.f43396s = t100.m186890d(203.0f);
        this.f43397t = t100.m186890d(70.0f);
        this.f43398u = 0;
        this.f43399v = 1;
        this.f43400w = 300;
        this.f43401x = 200;
        m66345r(context, null);
    }

    private ValueAnimator getProgressTimerAnim() {
        if (this.f43390m == null) {
            this.f43390m = this.f43382e.m66458b((int) (this.f43389l * 1000.0f));
        }
        this.f43390m.setDuration((int) (this.f43389l * 1000.0f));
        return this.f43390m;
    }

    private void setParentX(float f) {
        ((View) getParent()).setX(this.f43395r + f);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m66318A(Map map) {
        Moment moment = (Moment) map.get(this.f43387j.f56011id);
        if (NullChecker.m81303a(moment)) {
            Moment moment2 = this.f43387j;
            moment2.likes = moment.likes;
            moment2.messages = moment.messages;
            moment2.haveLiked = moment.haveLiked;
            m66333P(moment.haveLiked);
            m66331N();
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m66319B(boolean z, Envelope envelope) {
        m66333P(this.f43387j.haveLiked);
        zi60.m218961w().m218974f(this.f43387j, f43375C, f43376D, 201, z);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m66320C(boolean z, Throwable th) {
        t2h.m186976g(th);
        zi60.m218961w().m218976h(this.f43387j, f43375C, f43376D, th, z);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m66321D(int i, ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f43378a.getLayoutParams();
        marginLayoutParams.width = Float.valueOf(valueAnimator.getAnimatedValue() + "").intValue();
        this.f43378a.setLayoutParams(marginLayoutParams);
        if (this.f43392o) {
            setParentX(i - Float.valueOf(valueAnimator.getAnimatedValue() + "").intValue());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m66322E() {
        wng.m204695v().m204731j0();
        setVisibility(8);
    }

    /* JADX INFO: renamed from: F */
    public final void m66323F() {
        if (this.f43394q) {
            return;
        }
        if (!(this.f43402y instanceof MomentDetailAct) || "from_moment_detail_album".equals(f43375C)) {
            this.f43394q = true;
            m66342o(f43374B);
            Intent intentM64835b = MomentDetailAct.C11306a.m64834a(getContext()).m64839f("").m64846m(this.f43387j.f56011id).m64847n(this.f43387j.owner).m64853t(true).m64848o(this.f43387j.momentValue).m64854u(true).m64835b();
            if (intentM64835b == null) {
                return;
            }
            getContext().startActivity(intentM64835b);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m66324G() {
        if (this.f43391n) {
            m66327J();
            this.f43391n = false;
        } else {
            m66344q();
            this.f43391n = true;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m66325H() {
        final boolean z = this.f43387j.haveLiked;
        Act actM66341n = m66341n();
        xia xiaVar = FeedModule.f38855d;
        Moment moment = this.f43387j;
        actM66341n.duringCreated(xiaVar.m209276Fb(moment.owner, moment.f56011id, !moment.haveLiked, moment.getMomentShowFrom())).subscribe(mkd0.m154956H(new e30() { // from class: l.c4h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79271a.m66319B(z, (Envelope) obj);
            }
        }, new e30() { // from class: l.d4h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84303a.m66320C(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public final void m66326I() {
        if (NullChecker.m81303a(this.f43403z)) {
            this.f43403z.unsubscribe();
        }
        if (NullChecker.m81303a(this.f43377A)) {
            this.f43377A.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: J */
    public void m66327J() {
        if (this.f43391n) {
            m66348u();
            m66338U(this.f43396s, this.f43397t);
            m66337T(1, 0);
            this.f43391n = false;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m66328K() {
        if (this.f43391n) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f43378a.getLayoutParams();
            int i = this.f43397t;
            marginLayoutParams.width = i;
            marginLayoutParams.height = i;
            this.f43378a.setLayoutParams(marginLayoutParams);
            this.f43391n = false;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m66329L(Moment moment) {
        if (NullChecker.m81303a(this.f43387j)) {
            m66336S();
        }
        this.f43387j = moment;
        this.f43388k = FeedModule.f38855d.m209447e8(moment.owner);
        m66335R();
        setCurrentShowAct(m66341n());
    }

    /* JADX INFO: renamed from: M */
    public final void m66330M() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.m186890d(10.0f));
        gradientDrawable.setColor(-1);
        this.f43378a.setBackground(gradientDrawable);
        this.f43378a.setElevation(6.0f);
    }

    /* JADX INFO: renamed from: N */
    public final void m66331N() {
        this.f43385h.setImageResource(f3c0.f94459Y0);
    }

    /* JADX INFO: renamed from: O */
    public final void m66332O() {
        if (this.f43387j.media.size() > 0) {
            Media media = this.f43387j.media.get(0);
            if (media instanceof Audio) {
                this.f43389l = ((Audio) media).duration;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m66333P(boolean z) {
        VImage vImage = this.f43384g;
        if (z) {
            vImage.setImageResource(f3c0.f94474a1);
        } else {
            vImage.setImageResource(f3c0.f94466Z0);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m66334Q(float f) {
    }

    /* JADX INFO: renamed from: R */
    public final void m66335R() {
        vs0.m199799e(this.f43387j, this.f43380c, this.f43388k);
        m66332O();
        m66333P(this.f43387j.haveLiked);
        m66331N();
        m66330M();
    }

    /* JADX INFO: renamed from: S */
    public final void m66336S() {
        m66334Q(0.0f);
        this.f43382e.setProgress(0.0f);
        getProgressTimerAnim().cancel();
    }

    /* JADX INFO: renamed from: T */
    public final void m66337T(int i, int i2) {
        Animator duration = bt0.m103744q(this.f43383f, "alpha", i, i2).setDuration(200L);
        if (i == 0) {
            this.f43383f.setAlpha(0.0f);
            duration.setStartDelay(100L);
        }
        duration.start();
    }

    /* JADX INFO: renamed from: U */
    public final void m66338U(int i, int i2) {
        final int width = this.f43378a.getWidth();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.b4h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f73358a.m66321D(width, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: a */
    public void mo66291a(Exception exc) {
        m66343p();
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: h */
    public void mo66339h() {
        this.f43381d.setVisibility(0);
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: i */
    public void mo66292i(boolean z) {
        m66343p();
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: j */
    public void mo66293j(float f) {
        m66334Q(f);
    }

    /* JADX INFO: renamed from: m */
    public View m66340m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e4h.m114684b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public final Act m66341n() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: o */
    public final void m66342o(String str) {
        Owner owner;
        if (NullChecker.m81303a(this.f43387j)) {
            ArrayList arrayList = new ArrayList();
            Live live = this.f43387j.live;
            arrayList.add(j760.m140076a("anchorId", (live == null || (owner = live.anchor) == null) ? "" : owner.f38803id));
            Live live2 = this.f43387j.live;
            arrayList.add(j760.m140076a("liveId", live2 != null ? live2.f38767id : ""));
            arrayList.add(j760.m140076a("moment_id", this.f43387j.f56011id));
            arrayList.add(j760.m140076a("owner_id", this.f43387j.owner));
            arrayList.add(j760.m140076a("moment_showfrom", zi60.m218960D(f43375C)));
            arrayList.add(j760.m140076a("moment_type", zi60.m218961w().m218992y(this.f43387j)));
            arrayList.add(j760.m140076a("comment_detail", "comment"));
            zvf0.m220399u("e_comment", str, (j760[]) arrayList.toArray(new j760[0]));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m66347t();
    }

    @Override // p149l.yng
    public void onComplete() {
        m66343p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m66326I();
    }

    @Override // p149l.yng
    public void onPause() {
        this.f43393p = true;
        getProgressTimerAnim().pause();
    }

    @Override // p149l.yng
    public void onResume() {
        this.f43381d.setVisibility(8);
    }

    @Override // p149l.yng
    public void onStart() {
        if (this.f43393p) {
            getProgressTimerAnim().resume();
        } else {
            getProgressTimerAnim().start();
        }
        this.f43381d.setVisibility(8);
        this.f43393p = false;
    }

    /* JADX INFO: renamed from: p */
    public final void m66343p() {
        getProgressTimerAnim().cancel();
        this.f43381d.setVisibility(8);
    }

    /* JADX INFO: renamed from: q */
    public void m66344q() {
        if (this.f43391n) {
            return;
        }
        m66348u();
        m66338U(this.f43397t, this.f43396s);
        m66337T(0, 1);
        this.f43391n = true;
    }

    /* JADX INFO: renamed from: r */
    public final void m66345r(Context context, Moment moment) {
        addView(m66340m(LayoutInflater.from(context), this));
        m66346s();
        m66347t();
        m66328K();
        m66329L(moment);
    }

    /* JADX INFO: renamed from: s */
    public final void m66346s() {
        this.f43384g.setOnClickListener(new View.OnClickListener() { // from class: l.x3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190902a.m66350w(view);
            }
        });
        this.f43385h.setOnClickListener(new View.OnClickListener() { // from class: l.y3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195800a.m66351x(view);
            }
        });
        this.f43386i.setOnClickListener(new View.OnClickListener() { // from class: l.z3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201374a.m66352y(view);
            }
        });
        this.f43380c.setOnClickListener(new View.OnClickListener() { // from class: l.a4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67532a.m66353z(view);
            }
        });
    }

    public void setCurrentShowAct(Activity activity) {
        this.f43394q = false;
        this.f43402y = activity;
    }

    public void setFrom(String str) {
        f43375C = str;
    }

    public void setMoment(Moment moment) {
        this.f43387j = moment;
    }

    /* JADX INFO: renamed from: t */
    public final void m66347t() {
        m66326I();
        this.f43403z = FeedModule.f38855d.f193053l0.subscribe(mkd0.m154955G(new e30() { // from class: l.w3h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184392a.m66318A((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public final void m66348u() {
        this.f43392o = m66349v();
        this.f43395r = getX();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m66349v() {
        int[] iArr = new int[2];
        this.f43378a.getLocationOnScreen(iArr);
        int i = iArr[0];
        return i > Math.abs((getWidth() + i) - xdl0.m208412y0());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m66350w(View view) {
        m66325H();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m66351x(View view) {
        m66323F();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m66352y(View view) {
        m66322E();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m66353z(View view) {
        m66324G();
    }

    public FeedGlobalPlayerView(Context context, Moment moment) {
        super(context);
        this.f43389l = 1.0f;
        this.f43391n = true;
        this.f43392o = false;
        this.f43396s = t100.m186890d(203.0f);
        this.f43397t = t100.m186890d(70.0f);
        this.f43398u = 0;
        this.f43399v = 1;
        this.f43400w = 300;
        this.f43401x = 200;
        m66345r(context, moment);
    }

    public FeedGlobalPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43389l = 1.0f;
        this.f43391n = true;
        this.f43392o = false;
        this.f43396s = t100.m186890d(203.0f);
        this.f43397t = t100.m186890d(70.0f);
        this.f43398u = 0;
        this.f43399v = 1;
        this.f43400w = 300;
        this.f43401x = 200;
        m66345r(context, null);
    }
}
