package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class nq40 implements sxl0 {

    /* JADX INFO: renamed from: a */
    public VDraweeView f143169a;

    /* JADX INFO: renamed from: b */
    public VText f143170b;

    /* JADX INFO: renamed from: c */
    public View f143171c;

    /* JADX INFO: renamed from: d */
    public Animator f143172d;

    /* JADX INFO: renamed from: e */
    public boolean f143173e = false;

    /* JADX INFO: renamed from: f */
    public boolean f143174f = false;

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m164282h(View view, int i, float f, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue > 1.2f) {
            float f2 = fFloatValue - 1.0f;
            view.setTranslationX(i * f2);
            view.setRotation(f2 * f);
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: a */
    public void mo164283a() {
        super.mo164283a();
        this.f143173e = true;
        Animator animator = this.f143172d;
        if (animator != null && animator.isRunning()) {
            this.f143172d.end();
            this.f143172d.cancel();
            if (this.f143171c.getParent() instanceof View) {
                View view = (View) this.f143171c.getParent();
                view.setTranslationX(0.0f);
                view.setRotation(0.0f);
            }
        }
        if (this.f143174f) {
            return;
        }
        i4g0.m138523u("e_profile_update_guidance", "p_suggest_users_home_view", jyb.m147494Y("profile_update_guidance_type", "swipe_right"));
        this.f143174f = true;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewInflate = layoutInflater.inflate(nec0.f141620e, viewGroup, false);
        this.f143171c = viewInflate;
        this.f143169a = (VDraweeView) viewInflate.findViewById(cdc0.f81138P);
        VText vText = (VText) this.f143171c.findViewById(cdc0.f81136N);
        this.f143170b = vText;
        vText.setText(q8g0.m175796b0("右滑表示喜欢", jyb.m147507f0("喜欢"), -98787, Typeface.DEFAULT_BOLD));
        i4g0.m138492A("e_profile_update_guidance", "p_suggest_users_home_view", jyb.m147494Y("profile_update_guidance_type", "swipe_right"));
        return this.f143171c;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        CoreModule.m30933P().m143405a().mo34394Pl(true, view2);
        uqb0.f180374G.m127115L0(this.f143169a, "https://auto.tancdn.com/v1/raw/af204a43-7d1a-4339-abaf-743f0f956e1714.jpg");
        Animator animator = this.f143172d;
        if (i != 0) {
            if (animator == null || !animator.isRunning()) {
                return;
            }
            this.f143172d.end();
            this.f143172d.cancel();
            view2.setTranslationX(0.0f);
            view2.setRotation(0.0f);
            return;
        }
        if (animator == null) {
            this.f143172d = m164285j(view2);
        }
        Animator animator2 = this.f143172d;
        if (animator2 == null || animator2.isRunning() || this.f143173e) {
            return;
        }
        this.f143172d.start();
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        m164284i();
        gta.m132210e().m132214d().mo34949xe();
        i4g0.m138525w("e_profile_update_guidance", "p_suggest_users_home_view", jyb.m147494Y("profile_update_guidance_type", "swipe_right"));
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final void m164284i() {
        Animator animator = this.f143172d;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.f143172d.end();
        this.f143172d.cancel();
    }

    /* JADX INFO: renamed from: j */
    public final Animator m164285j(final View view) {
        final int i = qa00.f156338y;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 2.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setInterpolator(zi60.m219724a(0.0f, 0.0f, 0.58f, 1.0f));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        final float f = 3.0f;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mq40
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nq40.m164282h(view, i, f, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}
