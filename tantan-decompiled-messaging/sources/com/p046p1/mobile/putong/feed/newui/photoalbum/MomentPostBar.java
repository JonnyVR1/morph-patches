package com.p046p1.mobile.putong.feed.newui.photoalbum;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.b5c0;
import p149l.bt0;
import p149l.di00;
import p149l.e30;
import p149l.f3c0;
import p149l.j760;
import p149l.nkg;
import p149l.oe40;
import p149l.qib0;
import p149l.t100;
import p149l.uqd0;
import p149l.xck0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentPostBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f41013a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f41014b;

    /* JADX INFO: renamed from: c */
    public TextView f41015c;

    /* JADX INFO: renamed from: d */
    public ImageView f41016d;

    /* JADX INFO: renamed from: e */
    public ImageView f41017e;

    /* JADX INFO: renamed from: f */
    public ProgressBar f41018f;

    /* JADX INFO: renamed from: g */
    public uqd0 f41019g;

    /* JADX INFO: renamed from: h */
    public float f41020h;

    /* JADX INFO: renamed from: i */
    public Moment f41021i;

    /* JADX INFO: renamed from: j */
    public int f41022j;

    /* JADX INFO: renamed from: k */
    public float f41023k;

    /* JADX INFO: renamed from: l */
    public float f41024l;

    /* JADX INFO: renamed from: m */
    public float f41025m;

    /* JADX INFO: renamed from: n */
    public Animator f41026n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f41027o;

    /* JADX INFO: renamed from: p */
    public e30<Moment> f41028p;

    /* JADX INFO: renamed from: q */
    public e30<Moment> f41029q;

    /* JADX INFO: renamed from: r */
    public boolean f41030r;

    /* JADX INFO: renamed from: s */
    public int f41031s;

    /* JADX INFO: renamed from: t */
    public e30<View> f41032t;

    public MomentPostBar(@NonNull Context context) {
        super(context);
        this.f41019g = new uqd0("current_post_moment_id", null);
        this.f41020h = 0.8f;
        this.f41032t = xck0.m208120a(300, new e30() { // from class: l.vh00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181463a.m63249v((View) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m63229s(View view) {
        this.f41032t.call(view);
    }

    /* JADX INFO: renamed from: A */
    public void m63230A() {
        mo63253z(false);
        getLayoutParams().height = t100.m186890d(48.0f);
        requestLayout();
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: renamed from: B */
    public final void m63231B() {
        this.f41013a.setVisibility(8);
        this.f41014b.setVisibility(0);
    }

    /* JADX INFO: renamed from: C */
    public final void m63232C() {
        qib0.f154691G.m102354Y0(this.f41014b, f3c0.f94507e2);
    }

    /* JADX INFO: renamed from: D */
    public void mo63233D() {
    }

    /* JADX INFO: renamed from: E */
    public void m63234E(e30<Moment> e30Var, e30<Moment> e30Var2) {
        this.f41028p = e30Var;
        this.f41029q = e30Var2;
    }

    /* JADX INFO: renamed from: g */
    public final void m63235g(View view) {
        di00.m111856a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public Act m63236h() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i */
    public final void m63237i(Animator animator) {
        if (NullChecker.m81303a(animator)) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo63238j(j760<Integer, Moment> j760Var) {
        long j;
        int iIntValue = j760Var.f116564a.intValue();
        if (iIntValue == 6) {
            return;
        }
        if (iIntValue != 4 && (!xdl0.m208349O0(this) || getHeight() == 0)) {
            m63230A();
        }
        Moment moment = j760Var.f116565b;
        int i = 0;
        if (iIntValue != 4 && !m63245q(this.f41031s)) {
            xdl0.m208344M(this, false);
            return;
        }
        this.f41022j = this.f41018f.getProgress();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                this.f41019g.put(moment.f56011id);
                if (this.f41021i.media.size() <= 0 || !(this.f41021i.media.get(0) instanceof Video) || !NullChecker.m81304b(((Video) this.f41021i.media.get(0)).cover) || TextUtils.isEmpty(((Video) this.f41021i.media.get(0)).cover.url)) {
                    return;
                }
                qib0.f154691G.m102341Q0(this.f41014b, ((Video) this.f41021i.media.get(0)).cover.profileSmall());
                return;
            }
            Runnable runnable = null;
            if (iIntValue == 2) {
                j = (long) this.f41024l;
                i = 475;
            } else if (iIntValue == 3) {
                j = (long) this.f41025m;
                i = 495;
            } else if (iIntValue != 4) {
                j = 0;
                if (iIntValue == 5) {
                    this.f41022j = 0;
                    mo63253z(true);
                }
            } else {
                oe40.m163799A0(new j760(6, null));
                this.f41021i = null;
                runnable = new Runnable() { // from class: l.ci00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81026a.m63242n();
                    }
                };
                this.f41019g.clear();
                j = 10;
                i = 500;
            }
            m63251x(j, this.f41022j, i, runnable);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo63239k() {
        m63242n();
        if (this.f41019g.get() == null) {
            return;
        }
        Moment momentM60709X3 = FeedModule.f38854c.m60709X3(this.f41019g.get());
        this.f41021i = momentM60709X3;
        if (momentM60709X3 == null) {
            return;
        }
        this.f41019g.clear();
        this.f41029q.call(this.f41021i);
        this.f41021i = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m63240l() {
        e30<Moment> e30Var;
        Moment moment = this.f41021i;
        if (moment == null || (e30Var = this.f41028p) == null) {
            return;
        }
        e30Var.call(moment);
    }

    /* JADX INFO: renamed from: m */
    public void mo63241m() {
        m63235g(this);
    }

    /* JADX INFO: renamed from: n */
    public void m63242n() {
        m63237i(this.f41027o);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getMeasuredHeight(), 0);
        this.f41027o = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(200L);
        this.f41027o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xh00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f192851a.m63246r(valueAnimator);
            }
        });
        this.f41027o.start();
    }

    /* JADX INFO: renamed from: o */
    public void mo63243o(int i) {
        final MomentPostBar momentPostBar;
        this.f41030r = true;
        this.f41031s = i;
        this.f41016d.setOnClickListener(new View.OnClickListener() { // from class: l.yh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198263a.m63229s(view);
            }
        });
        this.f41017e.setOnClickListener(new View.OnClickListener() { // from class: l.zh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203121a.m63247t(view);
            }
        });
        m63231B();
        if (NullChecker.m81303a(this.f41019g.get())) {
            Moment momentM60709X3 = FeedModule.f38854c.m60709X3(this.f41019g.get());
            if (NullChecker.m81303a(momentM60709X3)) {
                this.f41021i = momentM60709X3;
                getLayoutParams().height = t100.m186890d(48.0f);
                requestLayout();
                xdl0.m208344M(this, m63245q(i));
                if (oe40.m163809K()) {
                    mo63253z(true);
                    momentPostBar = this;
                } else {
                    mo63253z(false);
                    momentPostBar = this;
                    momentPostBar.m63251x(0L, 0, 350, null);
                }
                if (momentPostBar.f41021i.media.size() <= 0) {
                    qib0.f154691G.m102354Y0(momentPostBar.f41014b, f3c0.f94507e2);
                } else {
                    Media media = momentPostBar.f41021i.media.get(0);
                    if (media instanceof Video) {
                        qib0.f154691G.m102341Q0(momentPostBar.f41014b, ((Video) momentPostBar.f41021i.media.get(0)).cover.profileSmall());
                    } else if (media instanceof Audio) {
                        momentPostBar.m63244p((Audio) media);
                    } else if (media instanceof Picture) {
                        qib0.f154691G.m102341Q0(momentPostBar.f41014b, ((Picture) momentPostBar.f41021i.media.get(0)).profileSmall());
                    }
                }
            } else {
                momentPostBar = this;
            }
        } else {
            momentPostBar = this;
            j760<Integer, Moment> j760VarM221515e = oe40.m163824Z().m221515e();
            if (NullChecker.m81303a(j760VarM221515e) && j760VarM221515e.f116564a.intValue() != 6 && j760VarM221515e.f116564a.intValue() != 4 && NullChecker.m81303a(j760VarM221515e.f116565b)) {
                momentPostBar.f41021i = j760VarM221515e.f116565b;
                momentPostBar.mo63238j(j760VarM221515e);
                momentPostBar.post(new Runnable() { // from class: l.ai00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f69947a.m63248u();
                    }
                });
            }
        }
        momentPostBar.m63236h().duringCreated(oe40.m163824Z()).subscribe(new e30() { // from class: l.bi00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75688a.mo63238j((j760) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        mo63241m();
        mo63233D();
    }

    /* JADX INFO: renamed from: p */
    public final void m63244p(Audio audio) {
        this.f41014b.setVisibility(8);
        this.f41013a.setVisibility(0);
        this.f41013a.setText(String.format("%s''", Integer.valueOf((int) audio.duration)));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#ff6a31"));
        gradientDrawable.setCornerRadius(t100.m186890d(2.0f));
        this.f41013a.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m63245q(int i) {
        if (!NullChecker.m81303a(this.f41021i)) {
            return false;
        }
        if (nkg.m159904s()) {
            return i == 14 && !TEnum.equals(this.f41021i.momentType, "anonymous");
        }
        return i == 1 && !TEnum.equals(this.f41021i.momentType, "anonymous");
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m63246r(ValueAnimator valueAnimator) {
        getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        requestLayout();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m63247t(View view) {
        this.f41032t.call(view);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m63248u() {
        m63251x(0L, 0, 350, null);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m63249v(View view) {
        if (b5c0.f73539Z0 == view.getId()) {
            m63240l();
        } else if (b5c0.f73536Y0 == view.getId()) {
            mo63239k();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m63250w(ValueAnimator valueAnimator) {
        this.f41022j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }

    /* JADX INFO: renamed from: x */
    public void m63251x(long j, int i, int i2, Runnable runnable) {
        if (NullChecker.m81303a(this.f41026n)) {
            this.f41026n.cancel();
        }
        ProgressBar progressBar = this.f41018f;
        if (j == 0) {
            progressBar.setProgress(i2);
            return;
        }
        Animator animatorM103738k = bt0.m103738k(ObjectAnimator.ofInt(progressBar, "progress", i, i2), new LinearInterpolator(), 0L, j);
        this.f41026n = animatorM103738k;
        ((ValueAnimator) animatorM103738k).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wh00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f186352a.m63250w(valueAnimator);
            }
        });
        if (NullChecker.m81303a(runnable)) {
            bt0.m103733f(this.f41026n, runnable);
        }
        this.f41026n.start();
    }

    /* JADX INFO: renamed from: y */
    public void mo63252y(Moment moment) {
        if (this.f41030r) {
            m63231B();
            this.f41021i = moment;
            if (!m63245q(this.f41031s)) {
                xdl0.m208344M(this, false);
                return;
            }
            if (this.f41021i.media.size() <= 0 || !(this.f41021i.media.get(0) instanceof Video)) {
                this.f41023k = 200.0f;
                this.f41024l = 40.0f;
                this.f41025m = 10.0f;
                if (this.f41021i.media.size() > 0) {
                    Media media = this.f41021i.media.get(0);
                    if (media instanceof Picture) {
                        qib0.f154691G.m102341Q0(this.f41014b, ((Picture) this.f41021i.media.get(0)).profileSmall());
                    } else if (media instanceof Audio) {
                        m63244p((Audio) media);
                    } else {
                        m63232C();
                    }
                } else {
                    m63232C();
                }
            } else {
                Video video = (Video) this.f41021i.media.get(0);
                float f = video.duration;
                if (f == 0.0f) {
                    f = 10000.0f;
                }
                float f2 = this.f41020h;
                this.f41023k = f * f2;
                this.f41024l = 0.3f * f * f2;
                this.f41025m = f * 0.1f * f2;
                if (NullChecker.m81304b(video.cover) && !TextUtils.isEmpty(video.cover.url)) {
                    qib0.f154691G.m102341Q0(this.f41014b, video.cover.profileSmall());
                }
            }
            m63230A();
            m63251x((long) this.f41023k, 0, 350, null);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo63253z(boolean z) {
        this.f41015c.setText(z ? m63236h().getString(R$string.f38983U1) : m63236h().getString(R$string.f38977T1));
        xdl0.m208344M(this.f41016d, z);
        xdl0.m208344M(this.f41017e, z);
    }

    public MomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41019g = new uqd0("current_post_moment_id", null);
        this.f41020h = 0.8f;
        this.f41032t = xck0.m208120a(300, new e30() { // from class: l.vh00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181463a.m63249v((View) obj);
            }
        });
    }

    public MomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41019g = new uqd0("current_post_moment_id", null);
        this.f41020h = 0.8f;
        this.f41032t = xck0.m208120a(300, new e30() { // from class: l.vh00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181463a.m63249v((View) obj);
            }
        });
    }
}
