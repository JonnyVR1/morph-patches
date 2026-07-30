package com.p051p1.mobile.putong.feed.newui.photoalbum;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.cmg;
import p153l.cn40;
import p153l.dmk0;
import p153l.gt0;
import p153l.hdc0;
import p153l.lbc0;
import p153l.mq00;
import p153l.pf60;
import p153l.qa00;
import p153l.uqb0;
import p153l.wyd0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentPostBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f41861a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f41862b;

    /* JADX INFO: renamed from: c */
    public TextView f41863c;

    /* JADX INFO: renamed from: d */
    public ImageView f41864d;

    /* JADX INFO: renamed from: e */
    public ImageView f41865e;

    /* JADX INFO: renamed from: f */
    public ProgressBar f41866f;

    /* JADX INFO: renamed from: g */
    public wyd0 f41867g;

    /* JADX INFO: renamed from: h */
    public float f41868h;

    /* JADX INFO: renamed from: i */
    public Moment f41869i;

    /* JADX INFO: renamed from: j */
    public int f41870j;

    /* JADX INFO: renamed from: k */
    public float f41871k;

    /* JADX INFO: renamed from: l */
    public float f41872l;

    /* JADX INFO: renamed from: m */
    public float f41873m;

    /* JADX INFO: renamed from: n */
    public Animator f41874n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f41875o;

    /* JADX INFO: renamed from: p */
    public y20<Moment> f41876p;

    /* JADX INFO: renamed from: q */
    public y20<Moment> f41877q;

    /* JADX INFO: renamed from: r */
    public boolean f41878r;

    /* JADX INFO: renamed from: s */
    public int f41879s;

    /* JADX INFO: renamed from: t */
    public y20<View> f41880t;

    public MomentPostBar(@NonNull Context context) {
        super(context);
        this.f41867g = new wyd0("current_post_moment_id", null);
        this.f41868h = 0.8f;
        this.f41880t = dmk0.m116962a(300, new y20() { // from class: l.eq00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95291a.m64432v((View) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m64412s(View view) {
        this.f41880t.call(view);
    }

    /* JADX INFO: renamed from: A */
    public void m64413A() {
        mo64436z(false);
        getLayoutParams().height = qa00.m175859d(48.0f);
        requestLayout();
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: renamed from: B */
    public final void m64414B() {
        this.f41861a.setVisibility(8);
        this.f41862b.setVisibility(0);
    }

    /* JADX INFO: renamed from: C */
    public final void m64415C() {
        uqb0.f180374G.m127138Y0(this.f41862b, lbc0.f131025e2);
    }

    /* JADX INFO: renamed from: D */
    public void mo64416D() {
    }

    /* JADX INFO: renamed from: E */
    public void m64417E(y20<Moment> y20Var, y20<Moment> y20Var2) {
        this.f41876p = y20Var;
        this.f41877q = y20Var2;
    }

    /* JADX INFO: renamed from: g */
    public final void m64418g(View view) {
        mq00.m159450a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public Act m64419h() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i */
    public final void m64420i(Animator animator) {
        if (NullChecker.m82486a(animator)) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo64421j(pf60<Integer, Moment> pf60Var) {
        long j;
        int iIntValue = pf60Var.f152156a.intValue();
        if (iIntValue == 6) {
            return;
        }
        if (iIntValue != 4 && (!bnl0.m105529O0(this) || getHeight() == 0)) {
            m64413A();
        }
        Moment moment = pf60Var.f152157b;
        int i = 0;
        if (iIntValue != 4 && !m64428q(this.f41879s)) {
            bnl0.m105524M(this, false);
            return;
        }
        this.f41870j = this.f41866f.getProgress();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                this.f41867g.put(moment.f56859id);
                if (this.f41869i.media.size() <= 0 || !(this.f41869i.media.get(0) instanceof Video) || !NullChecker.m82487b(((Video) this.f41869i.media.get(0)).cover) || TextUtils.isEmpty(((Video) this.f41869i.media.get(0)).cover.url)) {
                    return;
                }
                uqb0.f180374G.m127125Q0(this.f41862b, ((Video) this.f41869i.media.get(0)).cover.profileSmall());
                return;
            }
            Runnable runnable = null;
            if (iIntValue == 2) {
                j = (long) this.f41872l;
                i = 475;
            } else if (iIntValue == 3) {
                j = (long) this.f41873m;
                i = 495;
            } else if (iIntValue != 4) {
                j = 0;
                if (iIntValue == 5) {
                    this.f41870j = 0;
                    mo64436z(true);
                }
            } else {
                cn40.m111349A0(new pf60(6, null));
                this.f41869i = null;
                runnable = new Runnable() { // from class: l.lq00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f133132a.m64425n();
                    }
                };
                this.f41867g.clear();
                j = 10;
                i = 500;
            }
            m64434x(j, this.f41870j, i, runnable);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo64422k() {
        m64425n();
        if (this.f41867g.get() == null) {
            return;
        }
        Moment momentM61893X3 = FeedModule.f39702c.m61893X3(this.f41867g.get());
        this.f41869i = momentM61893X3;
        if (momentM61893X3 == null) {
            return;
        }
        this.f41867g.clear();
        this.f41877q.call(this.f41869i);
        this.f41869i = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m64423l() {
        y20<Moment> y20Var;
        Moment moment = this.f41869i;
        if (moment == null || (y20Var = this.f41876p) == null) {
            return;
        }
        y20Var.call(moment);
    }

    /* JADX INFO: renamed from: m */
    public void mo64424m() {
        m64418g(this);
    }

    /* JADX INFO: renamed from: n */
    public void m64425n() {
        m64420i(this.f41875o);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getMeasuredHeight(), 0);
        this.f41875o = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(200L);
        this.f41875o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gq00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f105639a.m64429r(valueAnimator);
            }
        });
        this.f41875o.start();
    }

    /* JADX INFO: renamed from: o */
    public void mo64426o(int i) {
        final MomentPostBar momentPostBar;
        this.f41878r = true;
        this.f41879s = i;
        this.f41864d.setOnClickListener(new View.OnClickListener() { // from class: l.hq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111065a.m64412s(view);
            }
        });
        this.f41865e.setOnClickListener(new View.OnClickListener() { // from class: l.iq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116324a.m64430t(view);
            }
        });
        m64414B();
        if (NullChecker.m82486a(this.f41867g.get())) {
            Moment momentM61893X3 = FeedModule.f39702c.m61893X3(this.f41867g.get());
            if (NullChecker.m82486a(momentM61893X3)) {
                this.f41869i = momentM61893X3;
                getLayoutParams().height = qa00.m175859d(48.0f);
                requestLayout();
                bnl0.m105524M(this, m64428q(i));
                if (cn40.m111359K()) {
                    mo64436z(true);
                    momentPostBar = this;
                } else {
                    mo64436z(false);
                    momentPostBar = this;
                    momentPostBar.m64434x(0L, 0, 350, null);
                }
                if (momentPostBar.f41869i.media.size() <= 0) {
                    uqb0.f180374G.m127138Y0(momentPostBar.f41862b, lbc0.f131025e2);
                } else {
                    Media media = momentPostBar.f41869i.media.get(0);
                    if (media instanceof Video) {
                        uqb0.f180374G.m127125Q0(momentPostBar.f41862b, ((Video) momentPostBar.f41869i.media.get(0)).cover.profileSmall());
                    } else if (media instanceof Audio) {
                        momentPostBar.m64427p((Audio) media);
                    } else if (media instanceof Picture) {
                        uqb0.f180374G.m127125Q0(momentPostBar.f41862b, ((Picture) momentPostBar.f41869i.media.get(0)).profileSmall());
                    }
                }
            } else {
                momentPostBar = this;
            }
        } else {
            momentPostBar = this;
            pf60<Integer, Moment> pf60VarM222761e = cn40.m111374Z().m222761e();
            if (NullChecker.m82486a(pf60VarM222761e) && pf60VarM222761e.f152156a.intValue() != 6 && pf60VarM222761e.f152156a.intValue() != 4 && NullChecker.m82486a(pf60VarM222761e.f152157b)) {
                momentPostBar.f41869i = pf60VarM222761e.f152157b;
                momentPostBar.mo64421j(pf60VarM222761e);
                momentPostBar.post(new Runnable() { // from class: l.jq00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f122174a.m64431u();
                    }
                });
            }
        }
        momentPostBar.m64419h().duringCreated(cn40.m111374Z()).subscribe(new y20() { // from class: l.kq00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128148a.mo64421j((pf60) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        mo64424m();
        mo64416D();
    }

    /* JADX INFO: renamed from: p */
    public final void m64427p(Audio audio) {
        this.f41862b.setVisibility(8);
        this.f41861a.setVisibility(0);
        this.f41861a.setText(String.format("%s''", Integer.valueOf((int) audio.duration)));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#ff6a31"));
        gradientDrawable.setCornerRadius(qa00.m175859d(2.0f));
        this.f41861a.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m64428q(int i) {
        if (!NullChecker.m82486a(this.f41869i)) {
            return false;
        }
        if (cmg.m111233s()) {
            return i == 14 && !TEnum.equals(this.f41869i.momentType, "anonymous");
        }
        return i == 1 && !TEnum.equals(this.f41869i.momentType, "anonymous");
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m64429r(ValueAnimator valueAnimator) {
        getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        requestLayout();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m64430t(View view) {
        this.f41880t.call(view);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m64431u() {
        m64434x(0L, 0, 350, null);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m64432v(View view) {
        if (hdc0.f108892Z0 == view.getId()) {
            m64423l();
        } else if (hdc0.f108889Y0 == view.getId()) {
            mo64422k();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m64433w(ValueAnimator valueAnimator) {
        this.f41870j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }

    /* JADX INFO: renamed from: x */
    public void m64434x(long j, int i, int i2, Runnable runnable) {
        if (NullChecker.m82486a(this.f41874n)) {
            this.f41874n.cancel();
        }
        ProgressBar progressBar = this.f41866f;
        if (j == 0) {
            progressBar.setProgress(i2);
            return;
        }
        Animator animatorM132165k = gt0.m132165k(ObjectAnimator.ofInt(progressBar, "progress", i, i2), new LinearInterpolator(), 0L, j);
        this.f41874n = animatorM132165k;
        ((ValueAnimator) animatorM132165k).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fq00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f100237a.m64433w(valueAnimator);
            }
        });
        if (NullChecker.m82486a(runnable)) {
            gt0.m132160f(this.f41874n, runnable);
        }
        this.f41874n.start();
    }

    /* JADX INFO: renamed from: y */
    public void mo64435y(Moment moment) {
        if (this.f41878r) {
            m64414B();
            this.f41869i = moment;
            if (!m64428q(this.f41879s)) {
                bnl0.m105524M(this, false);
                return;
            }
            if (this.f41869i.media.size() <= 0 || !(this.f41869i.media.get(0) instanceof Video)) {
                this.f41871k = 200.0f;
                this.f41872l = 40.0f;
                this.f41873m = 10.0f;
                if (this.f41869i.media.size() > 0) {
                    Media media = this.f41869i.media.get(0);
                    if (media instanceof Picture) {
                        uqb0.f180374G.m127125Q0(this.f41862b, ((Picture) this.f41869i.media.get(0)).profileSmall());
                    } else if (media instanceof Audio) {
                        m64427p((Audio) media);
                    } else {
                        m64415C();
                    }
                } else {
                    m64415C();
                }
            } else {
                Video video = (Video) this.f41869i.media.get(0);
                float f = video.duration;
                if (f == 0.0f) {
                    f = 10000.0f;
                }
                float f2 = this.f41868h;
                this.f41871k = f * f2;
                this.f41872l = 0.3f * f * f2;
                this.f41873m = f * 0.1f * f2;
                if (NullChecker.m82487b(video.cover) && !TextUtils.isEmpty(video.cover.url)) {
                    uqb0.f180374G.m127125Q0(this.f41862b, video.cover.profileSmall());
                }
            }
            m64413A();
            m64434x((long) this.f41871k, 0, 350, null);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo64436z(boolean z) {
        this.f41863c.setText(z ? m64419h().getString(R$string.f39831U1) : m64419h().getString(R$string.f39825T1));
        bnl0.m105524M(this.f41864d, z);
        bnl0.m105524M(this.f41865e, z);
    }

    public MomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41867g = new wyd0("current_post_moment_id", null);
        this.f41868h = 0.8f;
        this.f41880t = dmk0.m116962a(300, new y20() { // from class: l.eq00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95291a.m64432v((View) obj);
            }
        });
    }

    public MomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41867g = new wyd0("current_post_moment_id", null);
        this.f41868h = 0.8f;
        this.f41880t = dmk0.m116962a(300, new y20() { // from class: l.eq00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95291a.m64432v((View) obj);
            }
        });
    }
}
