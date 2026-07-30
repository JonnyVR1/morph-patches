package p003l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import l.i0g0;
import l.i6c0;
import l.j760;
import l.qib0;
import l.t100;
import l.ua60;
import l.ura;
import l.vwb;
import l.w4c0;
import l.zvf0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zh40 implements ool0 {

    /* JADX INFO: renamed from: a */
    public VDraweeView f9248a;

    /* JADX INFO: renamed from: b */
    public VText f9249b;

    /* JADX INFO: renamed from: c */
    public View f9250c;

    /* JADX INFO: renamed from: d */
    public Animator f9251d;

    /* JADX INFO: renamed from: e */
    public boolean f9252e = false;

    /* JADX INFO: renamed from: f */
    public boolean f9253f = false;

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m11421h(View view, int i, float f, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue > 1.2f) {
            float f2 = fFloatValue - 1.0f;
            view.setTranslationX(i * f2);
            view.setRotation(f2 * f);
        }
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: a */
    public void mo8547a() {
        super.mo8547a();
        this.f9252e = true;
        Animator animator = this.f9251d;
        if (animator != null && animator.isRunning()) {
            this.f9251d.end();
            this.f9251d.cancel();
            if (this.f9250c.getParent() instanceof View) {
                View view = (View) this.f9250c.getParent();
                view.setTranslationX(0.0f);
                view.setRotation(0.0f);
            }
        }
        if (this.f9253f) {
            return;
        }
        zvf0.u("e_profile_update_guidance", "p_suggest_users_home_view", new j760[]{vwb.Y("profile_update_guidance_type", "swipe_right")});
        this.f9253f = true;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: d */
    public View mo5288d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewInflate = layoutInflater.inflate(i6c0.e, viewGroup, false);
        this.f9250c = viewInflate;
        this.f9248a = viewInflate.findViewById(w4c0.P);
        VText vTextFindViewById = this.f9250c.findViewById(w4c0.N);
        this.f9249b = vTextFindViewById;
        vTextFindViewById.setText(i0g0.b0("右滑表示喜欢", vwb.f0(new String[]{"喜欢"}), -98787, Typeface.DEFAULT_BOLD));
        zvf0.A("e_profile_update_guidance", "p_suggest_users_home_view", new j760[]{vwb.Y("profile_update_guidance_type", "swipe_right")});
        return this.f9250c;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: e */
    public void mo5289e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        CoreModule.P().a().Pl(true, view2);
        qib0.G.L0(this.f9248a, "https://auto.tancdn.com/v1/raw/af204a43-7d1a-4339-abaf-743f0f956e1714.jpg");
        Animator animator = this.f9251d;
        if (i != 0) {
            if (animator == null || !animator.isRunning()) {
                return;
            }
            this.f9251d.end();
            this.f9251d.cancel();
            view2.setTranslationX(0.0f);
            view2.setRotation(0.0f);
            return;
        }
        if (animator == null) {
            this.f9251d = m11423j(view2);
        }
        Animator animator2 = this.f9251d;
        if (animator2 == null || animator2.isRunning() || this.f9252e) {
            return;
        }
        this.f9251d.start();
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo5290f() {
        return false;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo5291g(SwipeDirection swipeDirection, t7m t7mVar) {
        m11422i();
        ura.e().d().xe();
        zvf0.w("e_profile_update_guidance", "p_suggest_users_home_view", new j760[]{vwb.Y("profile_update_guidance_type", "swipe_right")});
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final void m11422i() {
        Animator animator = this.f9251d;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.f9251d.end();
        this.f9251d.cancel();
    }

    /* JADX INFO: renamed from: j */
    public final Animator m11423j(final View view) {
        final int i = t100.y;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 2.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setInterpolator(ua60.a(0.0f, 0.0f, 0.58f, 1.0f));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        final float f = 3.0f;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.yh40
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                zh40.m11421h(view, i, f, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: b */
    public void mo5286b(VSwipeCard vSwipeCard) {
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: c */
    public void mo5287c(View view) {
    }
}
