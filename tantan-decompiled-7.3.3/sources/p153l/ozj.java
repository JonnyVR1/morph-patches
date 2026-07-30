package p153l;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.LangModel;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ozj {

    /* JADX INFO: renamed from: a */
    public VText f149925a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f149926b;

    public ozj(VText vText) {
        this.f149925a = vText;
    }

    /* JADX INFO: renamed from: e */
    public void m169978e() {
        AnimatorSet animatorSet = this.f149926b;
        if (animatorSet == null || !animatorSet.isStarted()) {
            return;
        }
        this.f149926b.removeAllListeners();
        this.f149926b.end();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m169979f(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (iIntValue == 0) {
            bnl0.m105524M(this.f149925a, false);
        } else {
            m169984k(iIntValue);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m169980g(ValueAnimator valueAnimator) {
        VText vText = this.f149925a;
        vText.setTextColor(vText.getTextColors().withAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue()));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m169981h(ValueAnimator valueAnimator) {
        VText vText = this.f149925a;
        vText.setTextColor(vText.getTextColors().withAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue()));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m169982i(BLiveGiftItem bLiveGiftItem) {
        this.f149925a.setText(bLiveGiftItem.localTag.getLocalName());
    }

    /* JADX INFO: renamed from: j */
    public void m169983j(final BLiveGiftItem bLiveGiftItem) {
        if (!TextUtils.isEmpty(bLiveGiftItem.longPressText) && bLiveGiftItem.needToPlayAnim) {
            LangModel langModel = bLiveGiftItem.localTag;
            int iMeasureText = (langModel == null || TextUtils.isEmpty(langModel.getLocalName())) ? 0 : ((int) this.f149925a.getPaint().measureText(bLiveGiftItem.localTag.getLocalName())) + qa00.m175859d(8.0f);
            int iMeasureText2 = ((int) this.f149925a.getPaint().measureText(bLiveGiftItem.longPressText)) + qa00.m175859d(8.0f);
            this.f149925a.setText(bLiveGiftItem.longPressText);
            m169984k(iMeasureText2);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iMeasureText2, iMeasureText);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kzj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f129430a.m169979f(valueAnimator);
                }
            });
            valueAnimatorOfInt.setDuration(400L);
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lzj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f134229a.m169980g(valueAnimator);
                }
            });
            valueAnimatorOfInt2.setDuration(200L);
            if (iMeasureText == 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f149926b = animatorSet;
                animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
            } else {
                ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(0, 255);
                valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mzj
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f139529a.m169981h(valueAnimator);
                    }
                });
                gt0.m132176v(valueAnimatorOfInt3, new Runnable() { // from class: l.nzj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f144442a.m169982i(bLiveGiftItem);
                    }
                });
                valueAnimatorOfInt3.setDuration(200L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f149926b = animatorSet2;
                animatorSet2.play(valueAnimatorOfInt).with(valueAnimatorOfInt2);
                this.f149926b.play(valueAnimatorOfInt3).after(valueAnimatorOfInt2);
            }
            this.f149926b.setInterpolator(new LinearInterpolator());
            this.f149926b.setStartDelay(1600L);
            bLiveGiftItem.needToPlayAnim = false;
            this.f149926b.start();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m169984k(int i) {
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f149925a.getLayoutParams();
        if (c0221a != null) {
            ((ViewGroup.MarginLayoutParams) c0221a).width = i;
            this.f149925a.setLayoutParams(c0221a);
        }
        this.f149925a.setPadding(qa00.m175859d(4.0f), qa00.m175859d(0.0f), qa00.m175859d(4.0f), qa00.m175859d(0.0f));
    }
}
