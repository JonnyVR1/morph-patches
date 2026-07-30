package p002l;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.data.LangModel;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import l.bt0;
import l.t100;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ywj {

    /* JADX INFO: renamed from: a */
    public VText f23134a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f23135b;

    public ywj(VText vText) {
        this.f23134a = vText;
    }

    /* JADX INFO: renamed from: e */
    public void m26963e() {
        AnimatorSet animatorSet = this.f23135b;
        if (animatorSet == null || !animatorSet.isStarted()) {
            return;
        }
        this.f23135b.removeAllListeners();
        this.f23135b.end();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m26964f(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (iIntValue == 0) {
            xdl0.M(this.f23134a, false);
        } else {
            m26969k(iIntValue);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m26965g(ValueAnimator valueAnimator) {
        VText vText = this.f23134a;
        vText.setTextColor(vText.getTextColors().withAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue()));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m26966h(ValueAnimator valueAnimator) {
        VText vText = this.f23134a;
        vText.setTextColor(vText.getTextColors().withAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue()));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m26967i(BLiveGiftItem bLiveGiftItem) {
        this.f23134a.setText(bLiveGiftItem.localTag.getLocalName());
    }

    /* JADX INFO: renamed from: j */
    public void m26968j(final BLiveGiftItem bLiveGiftItem) {
        if (!TextUtils.isEmpty(bLiveGiftItem.longPressText) && bLiveGiftItem.needToPlayAnim) {
            LangModel langModel = bLiveGiftItem.localTag;
            int iMeasureText = (langModel == null || TextUtils.isEmpty(langModel.getLocalName())) ? 0 : ((int) this.f23134a.getPaint().measureText(bLiveGiftItem.localTag.getLocalName())) + t100.d(8.0f);
            int iMeasureText2 = ((int) this.f23134a.getPaint().measureText(bLiveGiftItem.longPressText)) + t100.d(8.0f);
            this.f23134a.setText(bLiveGiftItem.longPressText);
            m26969k(iMeasureText2);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iMeasureText2, iMeasureText);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.uwj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f20856a.m26964f(valueAnimator);
                }
            });
            valueAnimatorOfInt.setDuration(400L);
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vwj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f21359a.m26965g(valueAnimator);
                }
            });
            valueAnimatorOfInt2.setDuration(200L);
            if (iMeasureText == 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f23135b = animatorSet;
                animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
            } else {
                ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(0, 255);
                valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wwj
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f22024a.m26966h(valueAnimator);
                    }
                });
                bt0.v(valueAnimatorOfInt3, new Runnable() { // from class: l.xwj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22493a.m26967i(bLiveGiftItem);
                    }
                });
                valueAnimatorOfInt3.setDuration(200L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23135b = animatorSet2;
                animatorSet2.play(valueAnimatorOfInt).with(valueAnimatorOfInt2);
                this.f23135b.play(valueAnimatorOfInt3).after(valueAnimatorOfInt2);
            }
            this.f23135b.setInterpolator(new LinearInterpolator());
            this.f23135b.setStartDelay(1600L);
            bLiveGiftItem.needToPlayAnim = false;
            this.f23135b.start();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m26969k(int i) {
        ConstraintLayout.a layoutParams = this.f23134a.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).width = i;
            this.f23134a.setLayoutParams(layoutParams);
        }
        this.f23134a.setPadding(t100.d(4.0f), t100.d(0.0f), t100.d(4.0f), t100.d(0.0f));
    }
}
