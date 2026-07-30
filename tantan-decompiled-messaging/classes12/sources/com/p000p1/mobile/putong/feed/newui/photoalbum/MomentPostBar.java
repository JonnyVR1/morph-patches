package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.e30;
import l.j760;
import l.qib0;
import l.t100;
import l.uqd0;
import l.xck0;
import l.xdl0;
import p007l.b5c0;
import p007l.di00;
import p007l.f3c0;
import p007l.nkg;
import p007l.oe40;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentPostBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f2474a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f2475b;

    /* JADX INFO: renamed from: c */
    public TextView f2476c;

    /* JADX INFO: renamed from: d */
    public ImageView f2477d;

    /* JADX INFO: renamed from: e */
    public ImageView f2478e;

    /* JADX INFO: renamed from: f */
    public ProgressBar f2479f;

    /* JADX INFO: renamed from: g */
    public uqd0 f2480g;

    /* JADX INFO: renamed from: h */
    public float f2481h;

    /* JADX INFO: renamed from: i */
    public Moment f2482i;

    /* JADX INFO: renamed from: j */
    public int f2483j;

    /* JADX INFO: renamed from: k */
    public float f2484k;

    /* JADX INFO: renamed from: l */
    public float f2485l;

    /* JADX INFO: renamed from: m */
    public float f2486m;

    /* JADX INFO: renamed from: n */
    public Animator f2487n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f2488o;

    /* JADX INFO: renamed from: p */
    public e30<Moment> f2489p;

    /* JADX INFO: renamed from: q */
    public e30<Moment> f2490q;

    /* JADX INFO: renamed from: r */
    public boolean f2491r;

    /* JADX INFO: renamed from: s */
    public int f2492s;

    /* JADX INFO: renamed from: t */
    public e30<View> f2493t;

    public MomentPostBar(@NonNull Context context) {
        super(context);
        this.f2480g = new uqd0("current_post_moment_id", (String) null);
        this.f2481h = 0.8f;
        this.f2493t = xck0.a(GivenGiftBrief.LUXURY_GIFT_LEVEL, new e30() { // from class: l.vh00
            public final void call(Object obj) {
                this.f14170a.m4266v((View) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m4246s(View view) {
        this.f2493t.call(view);
    }

    /* JADX INFO: renamed from: A */
    public void m4247A() {
        mo4270z(false);
        getLayoutParams().height = t100.d(48.0f);
        requestLayout();
        xdl0.M(this, true);
    }

    /* JADX INFO: renamed from: B */
    public final void m4248B() {
        this.f2474a.setVisibility(8);
        this.f2475b.setVisibility(0);
    }

    /* JADX INFO: renamed from: C */
    public final void m4249C() {
        qib0.G.Y0(this.f2475b, f3c0.f7790e2);
    }

    /* JADX INFO: renamed from: D */
    public void mo4250D() {
    }

    /* JADX INFO: renamed from: E */
    public void m4251E(e30<Moment> e30Var, e30<Moment> e30Var2) {
        this.f2489p = e30Var;
        this.f2490q = e30Var2;
    }

    /* JADX INFO: renamed from: g */
    public final void m4252g(View view) {
        di00.m9406a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public Act m4253h() {
        return getContext();
    }

    /* JADX INFO: renamed from: i */
    public final void m4254i(Animator animator) {
        if (NullChecker.a(animator)) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo4255j(j760<Integer, Moment> j760Var) {
        long j;
        int iIntValue = ((Integer) j760Var.a).intValue();
        if (iIntValue == 6) {
            return;
        }
        if (iIntValue != 4 && (!xdl0.O0(this) || getHeight() == 0)) {
            m4247A();
        }
        Moment moment = (Moment) j760Var.b;
        int i = 0;
        if (iIntValue != 4 && !m4262q(this.f2492s)) {
            xdl0.M(this, false);
            return;
        }
        this.f2483j = this.f2479f.getProgress();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                this.f2480g.put(((DbObject) moment).id);
                if (this.f2482i.media.size() <= 0 || !(this.f2482i.media.get(0) instanceof Video) || !NullChecker.b(((Video) this.f2482i.media.get(0)).cover) || TextUtils.isEmpty(((Video) this.f2482i.media.get(0)).cover.url)) {
                    return;
                }
                qib0.G.Q0(this.f2475b, ((Video) this.f2482i.media.get(0)).cover.profileSmall());
                return;
            }
            Runnable runnable = null;
            if (iIntValue == 2) {
                j = (long) this.f2485l;
                i = 475;
            } else if (iIntValue == 3) {
                j = (long) this.f2486m;
                i = 495;
            } else if (iIntValue != 4) {
                j = 0;
                if (iIntValue == 5) {
                    this.f2483j = 0;
                    mo4270z(true);
                }
            } else {
                oe40.m12536A0(new j760(6, (Object) null));
                this.f2482i = null;
                runnable = new Runnable() { // from class: l.ci00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6653a.m4259n();
                    }
                };
                this.f2480g.clear();
                j = 10;
                i = 500;
            }
            m4268x(j, this.f2483j, i, runnable);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo4256k() {
        m4259n();
        if (this.f2480g.get() == null) {
            return;
        }
        Moment momentM1635X3 = FeedModule.f315c.m1635X3((String) this.f2480g.get());
        this.f2482i = momentM1635X3;
        if (momentM1635X3 == null) {
            return;
        }
        this.f2480g.clear();
        this.f2490q.call(this.f2482i);
        this.f2482i = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m4257l() {
        e30<Moment> e30Var;
        Moment moment = this.f2482i;
        if (moment == null || (e30Var = this.f2489p) == null) {
            return;
        }
        e30Var.call(moment);
    }

    /* JADX INFO: renamed from: m */
    public void mo4258m() {
        m4252g(this);
    }

    /* JADX INFO: renamed from: n */
    public void m4259n() {
        m4254i(this.f2488o);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getMeasuredHeight(), 0);
        this.f2488o = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(200L);
        this.f2488o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xh00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14895a.m4263r(valueAnimator);
            }
        });
        this.f2488o.start();
    }

    /* JADX INFO: renamed from: o */
    public void mo4260o(int i) {
        final MomentPostBar momentPostBar;
        this.f2491r = true;
        this.f2492s = i;
        this.f2477d.setOnClickListener(new View.OnClickListener() { // from class: l.yh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15428a.m4246s(view);
            }
        });
        this.f2478e.setOnClickListener(new View.OnClickListener() { // from class: l.zh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15736a.m4264t(view);
            }
        });
        m4248B();
        if (NullChecker.a(this.f2480g.get())) {
            Moment momentM1635X3 = FeedModule.f315c.m1635X3((String) this.f2480g.get());
            if (NullChecker.a(momentM1635X3)) {
                this.f2482i = momentM1635X3;
                getLayoutParams().height = t100.d(48.0f);
                requestLayout();
                xdl0.M(this, m4262q(i));
                if (oe40.m12546K()) {
                    mo4270z(true);
                    momentPostBar = this;
                } else {
                    mo4270z(false);
                    momentPostBar = this;
                    momentPostBar.m4268x(0L, 0, 350, null);
                }
                if (momentPostBar.f2482i.media.size() <= 0) {
                    qib0.G.Y0(momentPostBar.f2475b, f3c0.f7790e2);
                } else {
                    Media media = momentPostBar.f2482i.media.get(0);
                    if (media instanceof Video) {
                        qib0.G.Q0(momentPostBar.f2475b, ((Video) momentPostBar.f2482i.media.get(0)).cover.profileSmall());
                    } else if (media instanceof Audio) {
                        momentPostBar.m4261p((Audio) media);
                    } else if (media instanceof Picture) {
                        qib0.G.Q0(momentPostBar.f2475b, ((Picture) momentPostBar.f2482i.media.get(0)).profileSmall());
                    }
                }
            } else {
                momentPostBar = this;
            }
        } else {
            momentPostBar = this;
            j760<Integer, Moment> j760Var = (j760) oe40.m12561Z().e();
            if (NullChecker.a(j760Var) && ((Integer) j760Var.a).intValue() != 6 && ((Integer) j760Var.a).intValue() != 4 && NullChecker.a(j760Var.b)) {
                momentPostBar.f2482i = (Moment) j760Var.b;
                momentPostBar.mo4255j(j760Var);
                momentPostBar.post(new Runnable() { // from class: l.ai00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5749a.m4265u();
                    }
                });
            }
        }
        momentPostBar.m4253h().duringCreated(oe40.m12561Z()).subscribe(new e30() { // from class: l.bi00
            public final void call(Object obj) {
                this.f6332a.mo4255j((j760) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        mo4258m();
        mo4250D();
    }

    /* JADX INFO: renamed from: p */
    public final void m4261p(Audio audio) {
        this.f2475b.setVisibility(8);
        this.f2474a.setVisibility(0);
        this.f2474a.setText(String.format("%s''", Integer.valueOf((int) audio.duration)));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#ff6a31"));
        gradientDrawable.setCornerRadius(t100.d(2.0f));
        this.f2474a.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4262q(int i) {
        if (!NullChecker.a(this.f2482i)) {
            return false;
        }
        if (nkg.m12263s()) {
            return i == 14 && !TEnum.equals(this.f2482i.momentType, "anonymous");
        }
        return i == 1 && !TEnum.equals(this.f2482i.momentType, "anonymous");
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m4263r(ValueAnimator valueAnimator) {
        getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        requestLayout();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m4264t(View view) {
        this.f2493t.call(view);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m4265u() {
        m4268x(0L, 0, 350, null);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m4266v(View view) {
        if (b5c0.f6020Z0 == view.getId()) {
            m4257l();
        } else if (b5c0.f6017Y0 == view.getId()) {
            mo4256k();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m4267w(ValueAnimator valueAnimator) {
        this.f2483j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }

    /* JADX INFO: renamed from: x */
    public void m4268x(long j, int i, int i2, Runnable runnable) {
        if (NullChecker.a(this.f2487n)) {
            this.f2487n.cancel();
        }
        ProgressBar progressBar = this.f2479f;
        if (j == 0) {
            progressBar.setProgress(i2);
            return;
        }
        Animator animatorK = bt0.k(ObjectAnimator.ofInt(progressBar, "progress", i, i2), new LinearInterpolator(), 0L, j);
        this.f2487n = animatorK;
        ((ValueAnimator) animatorK).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wh00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14544a.m4267w(valueAnimator);
            }
        });
        if (NullChecker.a(runnable)) {
            bt0.f(this.f2487n, runnable);
        }
        this.f2487n.start();
    }

    /* JADX INFO: renamed from: y */
    public void mo4269y(Moment moment) {
        if (this.f2491r) {
            m4248B();
            this.f2482i = moment;
            if (!m4262q(this.f2492s)) {
                xdl0.M(this, false);
                return;
            }
            if (this.f2482i.media.size() <= 0 || !(this.f2482i.media.get(0) instanceof Video)) {
                this.f2484k = 200.0f;
                this.f2485l = 40.0f;
                this.f2486m = 10.0f;
                if (this.f2482i.media.size() > 0) {
                    Media media = this.f2482i.media.get(0);
                    if (media instanceof Picture) {
                        qib0.G.Q0(this.f2475b, ((Picture) this.f2482i.media.get(0)).profileSmall());
                    } else if (media instanceof Audio) {
                        m4261p((Audio) media);
                    } else {
                        m4249C();
                    }
                } else {
                    m4249C();
                }
            } else {
                Video video = (Video) this.f2482i.media.get(0);
                float f = video.duration;
                if (f == 0.0f) {
                    f = 10000.0f;
                }
                float f2 = this.f2481h;
                this.f2484k = f * f2;
                this.f2485l = 0.3f * f * f2;
                this.f2486m = f * 0.1f * f2;
                if (NullChecker.b(video.cover) && !TextUtils.isEmpty(video.cover.url)) {
                    qib0.G.Q0(this.f2475b, video.cover.profileSmall());
                }
            }
            m4247A();
            m4268x((long) this.f2484k, 0, 350, null);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo4270z(boolean z) {
        this.f2476c.setText(z ? m4253h().getString(R$string.f444U1) : m4253h().getString(R$string.f438T1));
        xdl0.M(this.f2477d, z);
        xdl0.M(this.f2478e, z);
    }

    public MomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2480g = new uqd0("current_post_moment_id", (String) null);
        this.f2481h = 0.8f;
        this.f2493t = xck0.a(GivenGiftBrief.LUXURY_GIFT_LEVEL, new e30() { // from class: l.vh00
            public final void call(Object obj) {
                this.f14170a.m4266v((View) obj);
            }
        });
    }

    public MomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2480g = new uqd0("current_post_moment_id", (String) null);
        this.f2481h = 0.8f;
        this.f2493t = xck0.a(GivenGiftBrief.LUXURY_GIFT_LEVEL, new e30() { // from class: l.vh00
            public final void call(Object obj) {
                this.f14170a.m4266v((View) obj);
            }
        });
    }
}
