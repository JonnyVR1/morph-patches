package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.C22700a;

/* JADX INFO: loaded from: classes13.dex */
public class jx00 extends Act.AbstractC4455w<PutongAct, MomentsFeedPreviewAct> {

    /* JADX INFO: renamed from: l.jx00$a */
    public class C18047a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MomentsFeedPreviewAct f122980a;

        public C18047a(MomentsFeedPreviewAct momentsFeedPreviewAct) {
            this.f122980a = momentsFeedPreviewAct;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f122980a.m68059g2();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(PutongAct putongAct, MomentsFeedPreviewAct momentsFeedPreviewAct) {
        C22700a.b bVar;
        View viewFindViewWithTag = momentsFeedPreviewAct.f44741d.f84159b.findViewWithTag(Integer.valueOf(momentsFeedPreviewAct.f44740c.f73809b));
        if (viewFindViewWithTag == null || (bVar = (C22700a.b) viewFindViewWithTag.findViewById(hdc0.f108949o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = momentsFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo45130l = bVar.mo45130l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (!NullChecker.m82486a(valueAnimatorMo45130l)) {
            return null;
        }
        Animator animatorM132180z = gt0.m132180z(valueAnimatorMo45130l, gt0.m132169o(viewDecorOrSwipingDecorView, gt0.f106356k, 0, 255).setDuration(144L));
        animatorM132180z.addListener(new C18047a(momentsFeedPreviewAct));
        return animatorM132180z;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(PutongAct putongAct, MomentsFeedPreviewAct momentsFeedPreviewAct) {
        C22700a.b bVar;
        View viewFindViewWithTag = momentsFeedPreviewAct.f44741d.f84159b.findViewWithTag(Integer.valueOf(momentsFeedPreviewAct.f44740c.f73809b));
        if (viewFindViewWithTag == null || (bVar = (C22700a.b) viewFindViewWithTag.findViewById(hdc0.f108949o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = momentsFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo45131n = bVar.mo45131n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (NullChecker.m82486a(valueAnimatorMo45131n)) {
            return gt0.m132180z(valueAnimatorMo45131n, gt0.m132167m(viewDecorOrSwipingDecorView, gt0.f106356k, 36L, 144L, null, oce.m167164d(viewDecorOrSwipingDecorView.getBackground()), 0));
        }
        return null;
    }
}
