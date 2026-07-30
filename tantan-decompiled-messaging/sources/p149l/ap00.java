package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.C22585a;

/* JADX INFO: loaded from: classes12.dex */
public class ap00 extends Act.AbstractC4304w<PutongAct, MomentsFeedPreviewAct> {

    /* JADX INFO: renamed from: l.ap00$a */
    public class C15687a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MomentsFeedPreviewAct f70972a;

        public C15687a(MomentsFeedPreviewAct momentsFeedPreviewAct) {
            this.f70972a = momentsFeedPreviewAct;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f70972a.m66876e2();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(PutongAct putongAct, MomentsFeedPreviewAct momentsFeedPreviewAct) {
        C22585a.b bVar;
        View viewFindViewWithTag = momentsFeedPreviewAct.f43893d.f171305b.findViewWithTag(Integer.valueOf(momentsFeedPreviewAct.f43892c.f160343b));
        if (viewFindViewWithTag == null || (bVar = (C22585a.b) viewFindViewWithTag.findViewById(b5c0.f73596o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = momentsFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo43947l = bVar.mo43947l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (!NullChecker.m81303a(valueAnimatorMo43947l)) {
            return null;
        }
        Animator animatorM103753z = bt0.m103753z(valueAnimatorMo43947l, bt0.m103742o(viewDecorOrSwipingDecorView, bt0.f77164k, 0, 255).setDuration(144L));
        animatorM103753z.addListener(new C15687a(momentsFeedPreviewAct));
        return animatorM103753z;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(PutongAct putongAct, MomentsFeedPreviewAct momentsFeedPreviewAct) {
        C22585a.b bVar;
        View viewFindViewWithTag = momentsFeedPreviewAct.f43893d.f171305b.findViewWithTag(Integer.valueOf(momentsFeedPreviewAct.f43892c.f160343b));
        if (viewFindViewWithTag == null || (bVar = (C22585a.b) viewFindViewWithTag.findViewById(b5c0.f73596o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = momentsFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo43948n = bVar.mo43948n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (NullChecker.m81303a(valueAnimatorMo43948n)) {
            return bt0.m103753z(valueAnimatorMo43948n, bt0.m103740m(viewDecorOrSwipingDecorView, bt0.f77164k, 36L, 144L, null, kbe.m145270d(viewDecorOrSwipingDecorView.getBackground()), 0));
        }
        return null;
    }
}
