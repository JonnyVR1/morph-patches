package p002l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import java.util.HashSet;
import java.util.Random;
import l.bt0;
import l.d30;
import l.hce;
import l.hxs;
import l.t100;
import l.vqd0;
import l.xdl0;
import l.ydt;
import l.ypv;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w6e implements bql {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f21484a;

    /* JADX INFO: renamed from: b */
    public final VDraweeView f21485b;

    /* JADX INFO: renamed from: c */
    public final VDraweeView f21486c;

    /* JADX INFO: renamed from: d */
    public final ConstraintLayout f21487d;

    /* JADX INFO: renamed from: e */
    public final LongLinkLiveDownBox.LiveAccessChannel f21488e;

    /* JADX INFO: renamed from: f */
    public vqd0 f21489f = new vqd0("down_box_guild", new HashSet());

    /* JADX INFO: renamed from: g */
    public final ValueAnimator f21490g;

    public w6e(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, VDraweeView vDraweeView, VDraweeView vDraweeView2, VDraweeView vDraweeView3, ConstraintLayout constraintLayout) {
        this.f21488e = liveAccessChannel;
        this.f21484a = vDraweeView;
        this.f21485b = vDraweeView2;
        this.f21486c = vDraweeView3;
        this.f21487d = constraintLayout;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1);
        this.f21490g = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1L);
    }

    @Override // p002l.bql
    /* JADX INFO: renamed from: a */
    public Animator mo10551a() {
        Object parent = this.f21487d.getParent();
        if (!(parent instanceof View)) {
            return this.f21490g;
        }
        View view = (View) parent;
        this.f21487d.setTranslationX(new Random().nextInt(view.getWidth() - this.f21487d.getWidth()));
        int height = view.getHeight();
        final int i = height / 2;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.f21487d.getHeight(), i);
        valueAnimatorOfInt.setDuration(3800L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.n6e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f15835a.m24344l(valueAnimator);
            }
        });
        bt0.v(valueAnimatorOfInt, new Runnable() { // from class: l.o6e
            @Override // java.lang.Runnable
            public final void run() {
                this.f16375a.m24345m();
            }
        });
        int i2 = t100.k;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, i2, 0, i2, 0, i2);
        valueAnimatorOfInt2.setDuration(5000L);
        valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p6e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f17022a.m24346n(i, valueAnimator);
            }
        });
        bt0.v(valueAnimatorOfInt2, new Runnable() { // from class: l.q6e
            @Override // java.lang.Runnable
            public final void run() {
                this.f17823a.m24352t();
            }
        });
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(i - i2, (height - this.f21487d.getHeight()) + t100.d(16.0f));
        valueAnimatorOfInt3.setDuration(3000L);
        valueAnimatorOfInt3.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.r6e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f18376a.m24347o(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.s6e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f18804a.m24348p(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setStartDelay(this.f21488e.getBottomRemainDuration() * 1000);
        return bt0.s(new Animator[]{valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfInt3, valueAnimatorOfFloat});
    }

    @Override // p002l.bql
    /* JADX INFO: renamed from: b */
    public Animator mo10552b() {
        hxs.s("context_livingAct", this.f21484a, this.f21488e.getOuterVanishDynamic());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.8f, 1.2f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.v6e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f21014a.m24349q(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(400L);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m24344l(ValueAnimator valueAnimator) {
        this.f21487d.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m24345m() {
        ConstraintLayout constraintLayout = this.f21487d;
        constraintLayout.setTranslationY(-constraintLayout.getHeight());
        xdl0.M(this.f21486c, false);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m24346n(int i, ValueAnimator valueAnimator) {
        this.f21487d.setTranslationY(i - ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m24347o(ValueAnimator valueAnimator) {
        this.f21487d.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m24348p(ValueAnimator valueAnimator) {
        this.f21487d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m24349q(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f21485b.setScaleX(fFloatValue);
        this.f21485b.setScaleY(fFloatValue);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m24350r() {
        HashSet hashSet = new HashSet();
        hashSet.add(ypv.a.D0());
        this.f21489f.put(hashSet);
        xdl0.M(this.f21486c, true);
    }

    @Override // p002l.bql
    public void reset() {
        this.f21485b.setScaleY(1.0f);
        this.f21485b.setScaleX(1.0f);
        this.f21487d.setAlpha(1.0f);
        xdl0.M(this.f21486c, false);
        this.f21485b.setController((hce) null);
        this.f21484a.setController((hce) null);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m24351s() {
        xdl0.M(this.f21486c, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m24352t() {
        if (((HashSet) this.f21489f.get()).contains(ypv.a.D0())) {
            return;
        }
        xdl0.M(this.f21486c, true);
        hxs.j("context_livingAct", this.f21486c, ydt.r, 1, true, new d30() { // from class: l.t6e
            public final void call() {
                this.f20104a.m24350r();
            }
        }, new d30() { // from class: l.u6e
            public final void call() {
                this.f20504a.m24351s();
            }
        });
    }
}
