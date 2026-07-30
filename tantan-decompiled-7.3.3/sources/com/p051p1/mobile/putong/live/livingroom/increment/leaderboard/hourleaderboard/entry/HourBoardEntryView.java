package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry;

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
import com.google.android.gms.common.ConnectionResult;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.iam;
import p153l.kil;
import p153l.oil;
import p153l.qa00;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class HourBoardEntryView extends FrameLayout implements iam<kil> {

    /* JADX INFO: renamed from: n */
    public static final int f51362n = qa00.m175859d(36.0f);

    /* JADX INFO: renamed from: o */
    public static final String f51363o = zrv.f205803e.getString(R$string.f48231m6);

    /* JADX INFO: renamed from: p */
    public static final String f51364p = zrv.f205803e.getString(R$string.f48275o6);

    /* JADX INFO: renamed from: q */
    public static final String f51365q = zrv.f205803e.getString(R$string.f48297p6);

    /* JADX INFO: renamed from: a */
    public HourBoardEntryView f51366a;

    /* JADX INFO: renamed from: b */
    public VImage f51367b;

    /* JADX INFO: renamed from: c */
    public VText f51368c;

    /* JADX INFO: renamed from: d */
    public VText f51369d;

    /* JADX INFO: renamed from: e */
    public kil f51370e;

    /* JADX INFO: renamed from: f */
    public VText f51371f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f51372g;

    /* JADX INFO: renamed from: h */
    public long f51373h;

    /* JADX INFO: renamed from: i */
    public int f51374i;

    /* JADX INFO: renamed from: j */
    public int f51375j;

    /* JADX INFO: renamed from: k */
    public int f51376k;

    /* JADX INFO: renamed from: l */
    public int f51377l;

    /* JADX INFO: renamed from: m */
    public int f51378m;

    public HourBoardEntryView(Context context) {
        super(context);
        this.f51373h = -1L;
        this.f51374i = 400;
        this.f51375j = 200;
        this.f51376k = 200;
        this.f51377l = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.f51378m = qa00.m175859d(20.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m75886l(View view) {
        this.f51370e.m149916P3();
    }

    private void setEntryWidth(int i) {
        ViewGroup.LayoutParams layoutParams = this.f51366a.getLayoutParams();
        layoutParams.width = i;
        this.f51366a.setLayoutParams(layoutParams);
    }

    private void setRankText(long j) {
        String strM75890i = m75890i(j);
        this.f51371f.setText(strM75890i);
        int iMeasureText = (int) (this.f51371f.getPaint().measureText(strM75890i) + f51362n);
        if (j >= 11 || j <= 0) {
            this.f51367b.setAlpha(0.5f);
        } else {
            this.f51367b.setAlpha(1.0f);
        }
        setEntryWidth(iMeasureText);
        this.f51373h = j;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f51370e.act();
    }

    /* JADX INFO: renamed from: d */
    public final void m75887d(View view) {
        oil.m167793a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
        m75896q(false);
        AnimatorSet animatorSet = this.f51372g;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.f51372g.removeAllListeners();
            this.f51372g.cancel();
        }
        m75894n();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(kil kilVar) {
        this.f51370e = kilVar;
    }

    /* JADX INFO: renamed from: f */
    public final ObjectAnimator m75889f(int i, float f) {
        VImage vImage = this.f51367b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vImage, "alpha", vImage.getAlpha(), f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(i);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: i */
    public final String m75890i(long j) {
        return j > 100 ? f51363o : String.format(zrv.f205803e.getString(R$string.f48363s6), Long.valueOf(j));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        m75894n();
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.mil
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136986a.m75886l(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final ValueAnimator m75891j(int i, long j) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f51366a.getWidth(), i);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nil
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f142137a.m75892k(valueAnimator);
            }
        });
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(j);
        return valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m75892k(ValueAnimator valueAnimator) {
        setEntryWidth(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m75893m(VText vText, int i, boolean z, long j) {
        this.f51371f = vText;
        if (i == 0 || !z) {
            this.f51373h = j;
        } else {
            m75895p(j, false);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m75894n() {
        this.f51367b.setAlpha(0.5f);
        this.f51373h = -1L;
        VText vText = this.f51368c;
        this.f51371f = vText;
        TextPaint paint = vText.getPaint();
        String str = f51363o;
        setEntryWidth((int) (paint.measureText(str) + f51362n));
        this.f51371f.setText(str);
        this.f51371f.setTranslationY(0.0f);
        this.f51369d.setText(str);
        this.f51369d.setTranslationY(this.f51378m);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75887d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m75895p(final long j, final boolean z) {
        final int i;
        String strM75890i;
        AnimatorSet animatorSet;
        if (bnl0.m105529O0(this) || (animatorSet = this.f51372g) == null || !animatorSet.isRunning() || !z) {
            boolean z2 = j < this.f51373h;
            VText vText = this.f51368c;
            if (vText == this.f51371f) {
                vText = this.f51369d;
            }
            final VText vText2 = vText;
            if (z2) {
                if (vText2.getTranslationY() > 0.0f) {
                    vText2.setTranslationY(-this.f51378m);
                }
            } else if (vText2.getTranslationY() > 0.0f) {
                vText2.setTranslationY(this.f51378m);
            }
            if (j <= 10 || this.f51373h > 10 || !z) {
                i = (j > 10 || this.f51373h <= 10 || !z) ? 0 : 1;
            } else {
                i = 2;
            }
            int i2 = this.f51378m;
            if (!z2) {
                i2 = -i2;
            }
            if (i == 1) {
                strM75890i = f51364p;
            } else {
                strM75890i = i == 2 ? f51365q : m75890i(j);
            }
            vText2.setText(strM75890i);
            int iMeasureText = (int) (vText2.getPaint().measureText(strM75890i) + f51362n);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f51371f, "translationY", 0.0f, i2).setDuration(this.f51374i);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(vText2, "translationY", -i2, 0.0f).setDuration(this.f51374i);
            duration.setInterpolator(new LinearInterpolator());
            duration2.setInterpolator(new LinearInterpolator());
            ValueAnimator valueAnimatorM75891j = m75891j(iMeasureText, this.f51375j);
            ObjectAnimator objectAnimatorM75889f = (j >= 11 || j <= 0) ? m75889f(this.f51376k, 0.5f) : m75889f(this.f51376k, 1.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f51372g = animatorSet2;
            animatorSet2.setInterpolator(new LinearInterpolator());
            if (!z) {
                this.f51372g.setStartDelay(this.f51377l);
            }
            this.f51372g.play(duration).with(duration2).with(valueAnimatorM75891j).with(objectAnimatorM75889f);
            gt0.m132160f(this.f51372g, new Runnable() { // from class: l.lil
                @Override // java.lang.Runnable
                public final void run() {
                    this.f132233a.m75893m(vText2, i, z, j);
                }
            });
            this.f51372g.start();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m75896q(boolean z) {
        bnl0.m105524M(this, z);
    }

    public void setNewRank(long j) {
        AnimatorSet animatorSet = this.f51372g;
        if (animatorSet == null || !animatorSet.isStarted()) {
            if (j <= 0) {
                m75894n();
                return;
            }
            long j2 = this.f51373h;
            if (j2 <= 100 || j <= 100) {
                if (j2 == -1) {
                    setRankText(j);
                } else if (j != j2) {
                    m75895p(j, true);
                }
            }
        }
    }

    public HourBoardEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51373h = -1L;
        this.f51374i = 400;
        this.f51375j = 200;
        this.f51376k = 200;
        this.f51377l = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.f51378m = qa00.m175859d(20.0f);
    }

    public HourBoardEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51373h = -1L;
        this.f51374i = 400;
        this.f51375j = 200;
        this.f51376k = 200;
        this.f51377l = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.f51378m = qa00.m175859d(20.0f);
    }
}
