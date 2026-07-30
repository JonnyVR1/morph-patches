package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.s7m;
import p149l.t100;
import p149l.tfl;
import p149l.xdl0;
import p149l.xfl;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class HourBoardEntryView extends FrameLayout implements s7m<tfl> {

    /* JADX INFO: renamed from: n */
    public static final int f50514n = t100.m186890d(36.0f);

    /* JADX INFO: renamed from: o */
    public static final String f50515o = ypv.f199497e.getString(R$string.f47383m6);

    /* JADX INFO: renamed from: p */
    public static final String f50516p = ypv.f199497e.getString(R$string.f47427o6);

    /* JADX INFO: renamed from: q */
    public static final String f50517q = ypv.f199497e.getString(R$string.f47449p6);

    /* JADX INFO: renamed from: a */
    public HourBoardEntryView f50518a;

    /* JADX INFO: renamed from: b */
    public VImage f50519b;

    /* JADX INFO: renamed from: c */
    public VText f50520c;

    /* JADX INFO: renamed from: d */
    public VText f50521d;

    /* JADX INFO: renamed from: e */
    public tfl f50522e;

    /* JADX INFO: renamed from: f */
    public VText f50523f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f50524g;

    /* JADX INFO: renamed from: h */
    public long f50525h;

    /* JADX INFO: renamed from: i */
    public int f50526i;

    /* JADX INFO: renamed from: j */
    public int f50527j;

    /* JADX INFO: renamed from: k */
    public int f50528k;

    /* JADX INFO: renamed from: l */
    public int f50529l;

    /* JADX INFO: renamed from: m */
    public int f50530m;

    public HourBoardEntryView(Context context) {
        super(context);
        this.f50525h = -1L;
        this.f50526i = 400;
        this.f50527j = 200;
        this.f50528k = 200;
        this.f50529l = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.f50530m = t100.m186890d(20.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m74703l(View view) {
        this.f50522e.m188748P3();
    }

    private void setEntryWidth(int i) {
        ViewGroup.LayoutParams layoutParams = this.f50518a.getLayoutParams();
        layoutParams.width = i;
        this.f50518a.setLayoutParams(layoutParams);
    }

    private void setRankText(long j) {
        String strM74707i = m74707i(j);
        this.f50523f.setText(strM74707i);
        int iMeasureText = (int) (this.f50523f.getPaint().measureText(strM74707i) + f50514n);
        if (j >= 11 || j <= 0) {
            this.f50519b.setAlpha(0.5f);
        } else {
            this.f50519b.setAlpha(1.0f);
        }
        setEntryWidth(iMeasureText);
        this.f50525h = j;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f50522e.act();
    }

    /* JADX INFO: renamed from: d */
    public final void m74704d(View view) {
        xfl.m208609a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
        m74713q(false);
        AnimatorSet animatorSet = this.f50524g;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.f50524g.removeAllListeners();
            this.f50524g.cancel();
        }
        m74711n();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tfl tflVar) {
        this.f50522e = tflVar;
    }

    /* JADX INFO: renamed from: f */
    public final ObjectAnimator m74706f(int i, float f) {
        VImage vImage = this.f50519b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vImage, "alpha", vImage.getAlpha(), f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(i);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: i */
    public final String m74707i(long j) {
        return j > 100 ? f50515o : String.format(ypv.f199497e.getString(R$string.f47515s6), Long.valueOf(j));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        m74711n();
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.vfl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181283a.m74703l(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final ValueAnimator m74708j(int i, long j) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f50518a.getWidth(), i);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wfl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f186091a.m74709k(valueAnimator);
            }
        });
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(j);
        return valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m74709k(ValueAnimator valueAnimator) {
        setEntryWidth(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m74710m(VText vText, int i, boolean z, long j) {
        this.f50523f = vText;
        if (i == 0 || !z) {
            this.f50525h = j;
        } else {
            m74712p(j, false);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m74711n() {
        this.f50519b.setAlpha(0.5f);
        this.f50525h = -1L;
        VText vText = this.f50520c;
        this.f50523f = vText;
        TextPaint paint = vText.getPaint();
        String str = f50515o;
        setEntryWidth((int) (paint.measureText(str) + f50514n));
        this.f50523f.setText(str);
        this.f50523f.setTranslationY(0.0f);
        this.f50521d.setText(str);
        this.f50521d.setTranslationY(this.f50530m);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74704d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m74712p(final long j, final boolean z) {
        final int i;
        String strM74707i;
        AnimatorSet animatorSet;
        if (xdl0.m208349O0(this) || (animatorSet = this.f50524g) == null || !animatorSet.isRunning() || !z) {
            boolean z2 = j < this.f50525h;
            VText vText = this.f50520c;
            if (vText == this.f50523f) {
                vText = this.f50521d;
            }
            final VText vText2 = vText;
            if (z2) {
                if (vText2.getTranslationY() > 0.0f) {
                    vText2.setTranslationY(-this.f50530m);
                }
            } else if (vText2.getTranslationY() > 0.0f) {
                vText2.setTranslationY(this.f50530m);
            }
            if (j <= 10 || this.f50525h > 10 || !z) {
                i = (j > 10 || this.f50525h <= 10 || !z) ? 0 : 1;
            } else {
                i = 2;
            }
            int i2 = this.f50530m;
            if (!z2) {
                i2 = -i2;
            }
            if (i == 1) {
                strM74707i = f50516p;
            } else {
                strM74707i = i == 2 ? f50517q : m74707i(j);
            }
            vText2.setText(strM74707i);
            int iMeasureText = (int) (vText2.getPaint().measureText(strM74707i) + f50514n);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f50523f, "translationY", 0.0f, i2).setDuration(this.f50526i);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(vText2, "translationY", -i2, 0.0f).setDuration(this.f50526i);
            duration.setInterpolator(new LinearInterpolator());
            duration2.setInterpolator(new LinearInterpolator());
            ValueAnimator valueAnimatorM74708j = m74708j(iMeasureText, this.f50527j);
            ObjectAnimator objectAnimatorM74706f = (j >= 11 || j <= 0) ? m74706f(this.f50528k, 0.5f) : m74706f(this.f50528k, 1.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f50524g = animatorSet2;
            animatorSet2.setInterpolator(new LinearInterpolator());
            if (!z) {
                this.f50524g.setStartDelay(this.f50529l);
            }
            this.f50524g.play(duration).with(duration2).with(valueAnimatorM74708j).with(objectAnimatorM74706f);
            bt0.m103733f(this.f50524g, new Runnable() { // from class: l.ufl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176268a.m74710m(vText2, i, z, j);
                }
            });
            this.f50524g.start();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m74713q(boolean z) {
        xdl0.m208344M(this, z);
    }

    public void setNewRank(long j) {
        AnimatorSet animatorSet = this.f50524g;
        if (animatorSet == null || !animatorSet.isStarted()) {
            if (j <= 0) {
                m74711n();
                return;
            }
            long j2 = this.f50525h;
            if (j2 <= 100 || j <= 100) {
                if (j2 == -1) {
                    setRankText(j);
                } else if (j != j2) {
                    m74712p(j, true);
                }
            }
        }
    }

    public HourBoardEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50525h = -1L;
        this.f50526i = 400;
        this.f50527j = 200;
        this.f50528k = 200;
        this.f50529l = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.f50530m = t100.m186890d(20.0f);
    }

    public HourBoardEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50525h = -1L;
        this.f50526i = 400;
        this.f50527j = 200;
        this.f50528k = 200;
        this.f50529l = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.f50530m = t100.m186890d(20.0f);
    }
}
