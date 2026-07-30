package p149l;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ywj {

    /* JADX INFO: renamed from: a */
    public VText f200509a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f200510b;

    public ywj(VText vText) {
        this.f200509a = vText;
    }

    /* JADX INFO: renamed from: e */
    public void m216401e() {
        AnimatorSet animatorSet = this.f200510b;
        if (animatorSet == null || !animatorSet.isStarted()) {
            return;
        }
        this.f200510b.removeAllListeners();
        this.f200510b.end();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m216402f(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (iIntValue == 0) {
            xdl0.m208344M(this.f200509a, false);
        } else {
            m216407k(iIntValue);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m216403g(ValueAnimator valueAnimator) {
        VText vText = this.f200509a;
        vText.setTextColor(vText.getTextColors().withAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue()));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m216404h(ValueAnimator valueAnimator) {
        VText vText = this.f200509a;
        vText.setTextColor(vText.getTextColors().withAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue()));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m216405i(BLiveGiftItem bLiveGiftItem) {
        this.f200509a.setText(bLiveGiftItem.localTag.getLocalName());
    }

    /* JADX INFO: renamed from: j */
    public void m216406j(final BLiveGiftItem bLiveGiftItem) {
        if (!TextUtils.isEmpty(bLiveGiftItem.longPressText) && bLiveGiftItem.needToPlayAnim) {
            LangModel langModel = bLiveGiftItem.localTag;
            int iMeasureText = (langModel == null || TextUtils.isEmpty(langModel.getLocalName())) ? 0 : ((int) this.f200509a.getPaint().measureText(bLiveGiftItem.localTag.getLocalName())) + t100.m186890d(8.0f);
            int iMeasureText2 = ((int) this.f200509a.getPaint().measureText(bLiveGiftItem.longPressText)) + t100.m186890d(8.0f);
            this.f200509a.setText(bLiveGiftItem.longPressText);
            m216407k(iMeasureText2);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iMeasureText2, iMeasureText);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.uwj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f178650a.m216402f(valueAnimator);
                }
            });
            valueAnimatorOfInt.setDuration(400L);
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vwj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f183349a.m216403g(valueAnimator);
                }
            });
            valueAnimatorOfInt2.setDuration(200L);
            if (iMeasureText == 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f200510b = animatorSet;
                animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
            } else {
                ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(0, 255);
                valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wwj
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f188381a.m216404h(valueAnimator);
                    }
                });
                bt0.m103749v(valueAnimatorOfInt3, new Runnable() { // from class: l.xwj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f194737a.m216405i(bLiveGiftItem);
                    }
                });
                valueAnimatorOfInt3.setDuration(200L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f200510b = animatorSet2;
                animatorSet2.play(valueAnimatorOfInt).with(valueAnimatorOfInt2);
                this.f200510b.play(valueAnimatorOfInt3).after(valueAnimatorOfInt2);
            }
            this.f200510b.setInterpolator(new LinearInterpolator());
            this.f200510b.setStartDelay(1600L);
            bLiveGiftItem.needToPlayAnim = false;
            this.f200510b.start();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m216407k(int i) {
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f200509a.getLayoutParams();
        if (c0220a != null) {
            ((ViewGroup.MarginLayoutParams) c0220a).width = i;
            this.f200509a.setLayoutParams(c0220a);
        }
        this.f200509a.setPadding(t100.m186890d(4.0f), t100.m186890d(0.0f), t100.m186890d(4.0f), t100.m186890d(0.0f));
    }
}
