package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zh40 implements ool0 {

    /* JADX INFO: renamed from: a */
    public VDraweeView f203128a;

    /* JADX INFO: renamed from: b */
    public VText f203129b;

    /* JADX INFO: renamed from: c */
    public View f203130c;

    /* JADX INFO: renamed from: d */
    public Animator f203131d;

    /* JADX INFO: renamed from: e */
    public boolean f203132e = false;

    /* JADX INFO: renamed from: f */
    public boolean f203133f = false;

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m218763h(View view, int i, float f, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue > 1.2f) {
            float f2 = fFloatValue - 1.0f;
            view.setTranslationX(i * f2);
            view.setRotation(f2 * f);
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: a */
    public void mo120980a() {
        super.mo120980a();
        this.f203132e = true;
        Animator animator = this.f203131d;
        if (animator != null && animator.isRunning()) {
            this.f203131d.end();
            this.f203131d.cancel();
            if (this.f203130c.getParent() instanceof View) {
                View view = (View) this.f203130c.getParent();
                view.setTranslationX(0.0f);
                view.setRotation(0.0f);
            }
        }
        if (this.f203133f) {
            return;
        }
        zvf0.m220399u("e_profile_update_guidance", "p_suggest_users_home_view", vwb.m200311Y("profile_update_guidance_type", "swipe_right"));
        this.f203133f = true;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewInflate = layoutInflater.inflate(i6c0.f111710e, viewGroup, false);
        this.f203130c = viewInflate;
        this.f203128a = (VDraweeView) viewInflate.findViewById(w4c0.f184509P);
        VText vText = (VText) this.f203130c.findViewById(w4c0.f184507N);
        this.f203129b = vText;
        vText.setText(i0g0.m133861b0("右滑表示喜欢", vwb.m200324f0("喜欢"), -98787, Typeface.DEFAULT_BOLD));
        zvf0.m220368A("e_profile_update_guidance", "p_suggest_users_home_view", vwb.m200311Y("profile_update_guidance_type", "swipe_right"));
        return this.f203130c;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        CoreModule.m29935P().m94651a().mo33391Pl(true, view2);
        qib0.f154691G.m102331L0(this.f203128a, "https://auto.tancdn.com/v1/raw/af204a43-7d1a-4339-abaf-743f0f956e1714.jpg");
        Animator animator = this.f203131d;
        if (i != 0) {
            if (animator == null || !animator.isRunning()) {
                return;
            }
            this.f203131d.end();
            this.f203131d.cancel();
            view2.setTranslationX(0.0f);
            view2.setRotation(0.0f);
            return;
        }
        if (animator == null) {
            this.f203131d = m218765j(view2);
        }
        Animator animator2 = this.f203131d;
        if (animator2 == null || animator2.isRunning() || this.f203132e) {
            return;
        }
        this.f203131d.start();
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        m218764i();
        ura.m195053e().m195057d().mo33946xe();
        zvf0.m220401w("e_profile_update_guidance", "p_suggest_users_home_view", vwb.m200311Y("profile_update_guidance_type", "swipe_right"));
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final void m218764i() {
        Animator animator = this.f203131d;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.f203131d.end();
        this.f203131d.cancel();
    }

    /* JADX INFO: renamed from: j */
    public final Animator m218765j(final View view) {
        final int i = t100.f167276y;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 2.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setInterpolator(ua60.m192732a(0.0f, 0.0f, 0.58f, 1.0f));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        final float f = 3.0f;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.yh40
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                zh40.m218763h(view, i, f, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}
