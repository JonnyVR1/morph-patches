package p007l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedPreviewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.kbe;
import v.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ap00 extends Act.w<PutongAct, MomentsFeedPreviewAct> {

    /* JADX INFO: renamed from: l.ap00$a */
    public class C2327a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MomentsFeedPreviewAct f5797a;

        public C2327a(MomentsFeedPreviewAct momentsFeedPreviewAct) {
            this.f5797a = momentsFeedPreviewAct;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f5797a.m8070e2();
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator m8585c(PutongAct putongAct, MomentsFeedPreviewAct momentsFeedPreviewAct) {
        a.b bVarFindViewById;
        View viewFindViewWithTag = momentsFeedPreviewAct.f5354d.f13359b.findViewWithTag(Integer.valueOf(momentsFeedPreviewAct.f5353c.f12702b));
        if (viewFindViewWithTag == null || (bVarFindViewById = viewFindViewWithTag.findViewById(b5c0.f6077o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = momentsFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorL = bVarFindViewById.l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (!NullChecker.a(valueAnimatorL)) {
            return null;
        }
        Animator animatorZ = bt0.z(new Animator[]{valueAnimatorL, bt0.o(viewDecorOrSwipingDecorView, bt0.k, new int[]{0, 255}).setDuration(144L)});
        animatorZ.addListener(new C2327a(momentsFeedPreviewAct));
        return animatorZ;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator m8586d(PutongAct putongAct, MomentsFeedPreviewAct momentsFeedPreviewAct) {
        a.b bVarFindViewById;
        View viewFindViewWithTag = momentsFeedPreviewAct.f5354d.f13359b.findViewWithTag(Integer.valueOf(momentsFeedPreviewAct.f5353c.f12702b));
        if (viewFindViewWithTag == null || (bVarFindViewById = viewFindViewWithTag.findViewById(b5c0.f6077o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = momentsFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorN = bVarFindViewById.n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (NullChecker.a(valueAnimatorN)) {
            return bt0.z(new Animator[]{valueAnimatorN, bt0.m(viewDecorOrSwipingDecorView, bt0.k, 36L, 144L, (Interpolator) null, new int[]{kbe.d(viewDecorOrSwipingDecorView.getBackground()), 0})});
        }
        return null;
    }
}
