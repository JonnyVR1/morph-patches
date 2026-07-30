package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import java.util.HashSet;
import java.util.Random;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class l8e implements osl {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f130451a;

    /* JADX INFO: renamed from: b */
    public final VDraweeView f130452b;

    /* JADX INFO: renamed from: c */
    public final VDraweeView f130453c;

    /* JADX INFO: renamed from: d */
    public final ConstraintLayout f130454d;

    /* JADX INFO: renamed from: e */
    public final LongLinkLiveDownBox.LiveAccessChannel f130455e;

    /* JADX INFO: renamed from: f */
    public xyd0 f130456f = new xyd0("down_box_guild", new HashSet());

    /* JADX INFO: renamed from: g */
    public final ValueAnimator f130457g;

    public l8e(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, VDraweeView vDraweeView, VDraweeView vDraweeView2, VDraweeView vDraweeView3, ConstraintLayout constraintLayout) {
        this.f130455e = liveAccessChannel;
        this.f130451a = vDraweeView;
        this.f130452b = vDraweeView2;
        this.f130453c = vDraweeView3;
        this.f130454d = constraintLayout;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1);
        this.f130457g = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1L);
    }

    @Override // p153l.osl
    /* JADX INFO: renamed from: a */
    public Animator mo153211a() {
        Object parent = this.f130454d.getParent();
        if (!(parent instanceof View)) {
            return this.f130457g;
        }
        View view = (View) parent;
        this.f130454d.setTranslationX(new Random().nextInt(view.getWidth() - this.f130454d.getWidth()));
        int height = view.getHeight();
        final int i = height / 2;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.f130454d.getHeight(), i);
        valueAnimatorOfInt.setDuration(3800L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.c8e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f80204a.m153213l(valueAnimator);
            }
        });
        gt0.m132176v(valueAnimatorOfInt, new Runnable() { // from class: l.d8e
            @Override // java.lang.Runnable
            public final void run() {
                this.f85595a.m153214m();
            }
        });
        int i2 = qa00.f156324k;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, i2, 0, i2, 0, i2);
        valueAnimatorOfInt2.setDuration(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.e8e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f92538a.m153215n(i, valueAnimator);
            }
        });
        gt0.m132176v(valueAnimatorOfInt2, new Runnable() { // from class: l.f8e
            @Override // java.lang.Runnable
            public final void run() {
                this.f97718a.m153221t();
            }
        });
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(i - i2, (height - this.f130454d.getHeight()) + qa00.m175859d(16.0f));
        valueAnimatorOfInt3.setDuration(3000L);
        valueAnimatorOfInt3.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.g8e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f102679a.m153216o(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h8e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f108236a.m153217p(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setStartDelay(this.f130455e.getBottomRemainDuration() * 1000);
        return gt0.m132173s(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfInt3, valueAnimatorOfFloat);
    }

    @Override // p153l.osl
    /* JADX INFO: renamed from: b */
    public Animator mo153212b() {
        izs.m142868s("context_livingAct", this.f130451a, this.f130455e.getOuterVanishDynamic());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.8f, 1.2f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.k8e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f124375a.m153218q(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(400L);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m153213l(ValueAnimator valueAnimator) {
        this.f130454d.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m153214m() {
        ConstraintLayout constraintLayout = this.f130454d;
        constraintLayout.setTranslationY(-constraintLayout.getHeight());
        bnl0.m105524M(this.f130453c, false);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m153215n(int i, ValueAnimator valueAnimator) {
        this.f130454d.setTranslationY(i - ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m153216o(ValueAnimator valueAnimator) {
        this.f130454d.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m153217p(ValueAnimator valueAnimator) {
        this.f130454d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m153218q(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f130452b.setScaleX(fFloatValue);
        this.f130452b.setScaleY(fFloatValue);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m153219r() {
        HashSet hashSet = new HashSet();
        hashSet.add(zrv.f205799a.m207631D0());
        this.f130456f.put(hashSet);
        bnl0.m105524M(this.f130453c, true);
    }

    @Override // p153l.osl
    public void reset() {
        this.f130452b.setScaleY(1.0f);
        this.f130452b.setScaleX(1.0f);
        this.f130454d.setAlpha(1.0f);
        bnl0.m105524M(this.f130453c, false);
        this.f130452b.setController(null);
        this.f130451a.setController(null);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m153220s() {
        bnl0.m105524M(this.f130453c, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m153221t() {
        if (this.f130456f.get().contains(zrv.f205799a.m207631D0())) {
            return;
        }
        bnl0.m105524M(this.f130453c, true);
        izs.m142859j("context_livingAct", this.f130453c, zft.f204223r, 1, true, new x20() { // from class: l.i8e
            @Override // p153l.x20
            public final void call() {
                this.f113335a.m153219r();
            }
        }, new x20() { // from class: l.j8e
            @Override // p153l.x20
            public final void call() {
                this.f118773a.m153220s();
            }
        });
    }
}
