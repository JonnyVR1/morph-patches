package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import java.util.HashSet;
import java.util.Random;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class w6e implements bql {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f184833a;

    /* JADX INFO: renamed from: b */
    public final VDraweeView f184834b;

    /* JADX INFO: renamed from: c */
    public final VDraweeView f184835c;

    /* JADX INFO: renamed from: d */
    public final ConstraintLayout f184836d;

    /* JADX INFO: renamed from: e */
    public final LongLinkLiveDownBox.LiveAccessChannel f184837e;

    /* JADX INFO: renamed from: f */
    public vqd0 f184838f = new vqd0("down_box_guild", new HashSet());

    /* JADX INFO: renamed from: g */
    public final ValueAnimator f184839g;

    public w6e(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, VDraweeView vDraweeView, VDraweeView vDraweeView2, VDraweeView vDraweeView3, ConstraintLayout constraintLayout) {
        this.f184837e = liveAccessChannel;
        this.f184833a = vDraweeView;
        this.f184834b = vDraweeView2;
        this.f184835c = vDraweeView3;
        this.f184836d = constraintLayout;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1);
        this.f184839g = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1L);
    }

    @Override // p149l.bql
    /* JADX INFO: renamed from: a */
    public Animator mo103383a() {
        Object parent = this.f184836d.getParent();
        if (!(parent instanceof View)) {
            return this.f184839g;
        }
        View view = (View) parent;
        this.f184836d.setTranslationX(new Random().nextInt(view.getWidth() - this.f184836d.getWidth()));
        int height = view.getHeight();
        final int i = height / 2;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.f184836d.getHeight(), i);
        valueAnimatorOfInt.setDuration(3800L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.n6e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f137393a.m201800l(valueAnimator);
            }
        });
        bt0.m103749v(valueAnimatorOfInt, new Runnable() { // from class: l.o6e
            @Override // java.lang.Runnable
            public final void run() {
                this.f142339a.m201801m();
            }
        });
        int i2 = t100.f167262k;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, i2, 0, i2, 0, i2);
        valueAnimatorOfInt2.setDuration(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p6e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f147398a.m201802n(i, valueAnimator);
            }
        });
        bt0.m103749v(valueAnimatorOfInt2, new Runnable() { // from class: l.q6e
            @Override // java.lang.Runnable
            public final void run() {
                this.f152904a.m201808t();
            }
        });
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(i - i2, (height - this.f184836d.getHeight()) + t100.m186890d(16.0f));
        valueAnimatorOfInt3.setDuration(3000L);
        valueAnimatorOfInt3.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.r6e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f157913a.m201803o(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.s6e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f162818a.m201804p(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setStartDelay(this.f184837e.getBottomRemainDuration() * 1000);
        return bt0.m103746s(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfInt3, valueAnimatorOfFloat);
    }

    @Override // p149l.bql
    /* JADX INFO: renamed from: b */
    public Animator mo103384b() {
        hxs.m133406s("context_livingAct", this.f184833a, this.f184837e.getOuterVanishDynamic());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.8f, 1.2f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.v6e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f180187a.m201805q(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(400L);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m201800l(ValueAnimator valueAnimator) {
        this.f184836d.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m201801m() {
        ConstraintLayout constraintLayout = this.f184836d;
        constraintLayout.setTranslationY(-constraintLayout.getHeight());
        xdl0.m208344M(this.f184835c, false);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m201802n(int i, ValueAnimator valueAnimator) {
        this.f184836d.setTranslationY(i - ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m201803o(ValueAnimator valueAnimator) {
        this.f184836d.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m201804p(ValueAnimator valueAnimator) {
        this.f184836d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m201805q(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f184834b.setScaleX(fFloatValue);
        this.f184834b.setScaleY(fFloatValue);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m201806r() {
        HashSet hashSet = new HashSet();
        hashSet.add(ypv.f199493a.m199309D0());
        this.f184838f.put(hashSet);
        xdl0.m208344M(this.f184835c, true);
    }

    @Override // p149l.bql
    public void reset() {
        this.f184834b.setScaleY(1.0f);
        this.f184834b.setScaleX(1.0f);
        this.f184836d.setAlpha(1.0f);
        xdl0.m208344M(this.f184835c, false);
        this.f184834b.setController(null);
        this.f184833a.setController(null);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m201807s() {
        xdl0.m208344M(this.f184835c, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m201808t() {
        if (this.f184838f.get().contains(ypv.f199493a.m199309D0())) {
            return;
        }
        xdl0.m208344M(this.f184835c, true);
        hxs.m133397j("context_livingAct", this.f184835c, ydt.f197628r, 1, true, new d30() { // from class: l.t6e
            @Override // p149l.d30
            public final void call() {
                this.f168609a.m201806r();
            }
        }, new d30() { // from class: l.u6e
            @Override // p149l.d30
            public final void call() {
                this.f174828a.m201807s();
            }
        });
    }
}
