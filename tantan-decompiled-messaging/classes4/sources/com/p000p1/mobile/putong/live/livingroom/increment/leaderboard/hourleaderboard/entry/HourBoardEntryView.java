package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import l.bt0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.ypv;
import p002l.tfl;
import p002l.xfl;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HourBoardEntryView extends FrameLayout implements s7m<tfl> {

    /* JADX INFO: renamed from: n */
    public static final int f6556n = t100.d(36.0f);

    /* JADX INFO: renamed from: o */
    public static final String f6557o = ypv.e.getString(R$string.f3425m6);

    /* JADX INFO: renamed from: p */
    public static final String f6558p = ypv.e.getString(R$string.f3469o6);

    /* JADX INFO: renamed from: q */
    public static final String f6559q = ypv.e.getString(R$string.f3491p6);

    /* JADX INFO: renamed from: a */
    public HourBoardEntryView f6560a;

    /* JADX INFO: renamed from: b */
    public VImage f6561b;

    /* JADX INFO: renamed from: c */
    public VText f6562c;

    /* JADX INFO: renamed from: d */
    public VText f6563d;

    /* JADX INFO: renamed from: e */
    public tfl f6564e;

    /* JADX INFO: renamed from: f */
    public VText f6565f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f6566g;

    /* JADX INFO: renamed from: h */
    public long f6567h;

    /* JADX INFO: renamed from: i */
    public int f6568i;

    /* JADX INFO: renamed from: j */
    public int f6569j;

    /* JADX INFO: renamed from: k */
    public int f6570k;

    /* JADX INFO: renamed from: l */
    public int f6571l;

    /* JADX INFO: renamed from: m */
    public int f6572m;

    public HourBoardEntryView(Context context) {
        super(context);
        this.f6567h = -1L;
        this.f6568i = 400;
        this.f6569j = 200;
        this.f6570k = 200;
        this.f6571l = 1500;
        this.f6572m = t100.d(20.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m8297l(View view) {
        this.f6564e.m22948P3();
    }

    private void setEntryWidth(int i) {
        ViewGroup.LayoutParams layoutParams = this.f6560a.getLayoutParams();
        layoutParams.width = i;
        this.f6560a.setLayoutParams(layoutParams);
    }

    private void setRankText(long j) {
        String strM8302i = m8302i(j);
        this.f6565f.setText(strM8302i);
        int iMeasureText = (int) (this.f6565f.getPaint().measureText(strM8302i) + f6556n);
        if (j >= 11 || j <= 0) {
            this.f6561b.setAlpha(0.5f);
        } else {
            this.f6561b.setAlpha(1.0f);
        }
        setEntryWidth(iMeasureText);
        this.f6567h = j;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8298C0() {
        return getContext();
    }

    @Nullable
    public Act act() {
        return this.f6564e.act();
    }

    /* JADX INFO: renamed from: d */
    public final void m8299d(View view) {
        xfl.m25914a(this, view);
    }

    public void destroy() {
        m8309q(false);
        AnimatorSet animatorSet = this.f6566g;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.f6566g.removeAllListeners();
            this.f6566g.cancel();
        }
        m8307n();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m8303i1(tfl tflVar) {
        this.f6564e = tflVar;
    }

    /* JADX INFO: renamed from: f */
    public final ObjectAnimator m8301f(int i, float f) {
        VImage vImage = this.f6561b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vImage, "alpha", vImage.getAlpha(), f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(i);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: i */
    public final String m8302i(long j) {
        return j > 100 ? f6557o : String.format(ypv.e.getString(R$string.f3557s6), Long.valueOf(j));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        m8307n();
        xdl0.E0(this, new View.OnClickListener() { // from class: l.vfl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21110a.m8297l(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final ValueAnimator m8304j(int i, long j) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f6560a.getWidth(), i);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wfl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f21720a.m8305k(valueAnimator);
            }
        });
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(j);
        return valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m8305k(ValueAnimator valueAnimator) {
        setEntryWidth(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m8306m(VText vText, int i, boolean z, long j) {
        this.f6565f = vText;
        if (i == 0 || !z) {
            this.f6567h = j;
        } else {
            m8308p(j, false);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8307n() {
        this.f6561b.setAlpha(0.5f);
        this.f6567h = -1L;
        VText vText = this.f6562c;
        this.f6565f = vText;
        TextPaint paint = vText.getPaint();
        String str = f6557o;
        setEntryWidth((int) (paint.measureText(str) + f6556n));
        this.f6565f.setText(str);
        this.f6565f.setTranslationY(0.0f);
        this.f6563d.setText(str);
        this.f6563d.setTranslationY(this.f6572m);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8299d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m8308p(final long j, final boolean z) {
        final int i;
        String strM8302i;
        AnimatorSet animatorSet;
        if (xdl0.O0(this) || (animatorSet = this.f6566g) == null || !animatorSet.isRunning() || !z) {
            boolean z2 = j < this.f6567h;
            VText vText = this.f6562c;
            if (vText == this.f6565f) {
                vText = this.f6563d;
            }
            final VText vText2 = vText;
            if (z2) {
                if (vText2.getTranslationY() > 0.0f) {
                    vText2.setTranslationY(-this.f6572m);
                }
            } else if (vText2.getTranslationY() > 0.0f) {
                vText2.setTranslationY(this.f6572m);
            }
            if (j <= 10 || this.f6567h > 10 || !z) {
                i = (j > 10 || this.f6567h <= 10 || !z) ? 0 : 1;
            } else {
                i = 2;
            }
            int i2 = this.f6572m;
            if (!z2) {
                i2 = -i2;
            }
            if (i == 1) {
                strM8302i = f6558p;
            } else {
                strM8302i = i == 2 ? f6559q : m8302i(j);
            }
            vText2.setText(strM8302i);
            int iMeasureText = (int) (vText2.getPaint().measureText(strM8302i) + f6556n);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6565f, "translationY", 0.0f, i2).setDuration(this.f6568i);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(vText2, "translationY", -i2, 0.0f).setDuration(this.f6568i);
            duration.setInterpolator(new LinearInterpolator());
            duration2.setInterpolator(new LinearInterpolator());
            ValueAnimator valueAnimatorM8304j = m8304j(iMeasureText, this.f6569j);
            ObjectAnimator objectAnimatorM8301f = (j >= 11 || j <= 0) ? m8301f(this.f6570k, 0.5f) : m8301f(this.f6570k, 1.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f6566g = animatorSet2;
            animatorSet2.setInterpolator(new LinearInterpolator());
            if (!z) {
                this.f6566g.setStartDelay(this.f6571l);
            }
            this.f6566g.play(duration).with(duration2).with(valueAnimatorM8304j).with(objectAnimatorM8301f);
            bt0.f(this.f6566g, new Runnable() { // from class: l.ufl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20617a.m8306m(vText2, i, z, j);
                }
            });
            this.f6566g.start();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m8309q(boolean z) {
        xdl0.M(this, z);
    }

    public void setNewRank(long j) {
        AnimatorSet animatorSet = this.f6566g;
        if (animatorSet == null || !animatorSet.isStarted()) {
            if (j <= 0) {
                m8307n();
                return;
            }
            long j2 = this.f6567h;
            if (j2 <= 100 || j <= 100) {
                if (j2 == -1) {
                    setRankText(j);
                } else if (j != j2) {
                    m8308p(j, true);
                }
            }
        }
    }

    public HourBoardEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6567h = -1L;
        this.f6568i = 400;
        this.f6569j = 200;
        this.f6570k = 200;
        this.f6571l = 1500;
        this.f6572m = t100.d(20.0f);
    }

    public HourBoardEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6567h = -1L;
        this.f6568i = 400;
        this.f6569j = 200;
        this.f6570k = 200;
        this.f6571l = 1500;
        this.f6572m = t100.d(20.0f);
    }
}
