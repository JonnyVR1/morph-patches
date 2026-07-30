package p007l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p000p1.mobile.putong.feed.newui.videoflow.item.FeedVideoViewFlowItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.kbe;
import v.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class a9i extends Act.w<PutongAct, FeedVideoFlowAct> {

    /* JADX INFO: renamed from: l.a9i$a */
    public class C2318a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FeedVideoFlowAct f5670a;

        public C2318a(FeedVideoFlowAct feedVideoFlowAct) {
            this.f5670a = feedVideoFlowAct;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f5670a.m7350e2();
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator m8462c(PutongAct putongAct, FeedVideoFlowAct feedVideoFlowAct) {
        View viewFindViewWithTag;
        a.b bVarFindViewById;
        FeedVideoViewFlowItemView feedVideoViewFlowItemView = feedVideoFlowAct.m7346a2().m10580l().f12554k;
        if (feedVideoViewFlowItemView == null || (viewFindViewWithTag = feedVideoViewFlowItemView.getViewModel().f4071b.findViewWithTag(0)) == null || (bVarFindViewById = viewFindViewWithTag.findViewById(b5c0.f6077o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = feedVideoFlowAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorL = bVarFindViewById.l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (!NullChecker.a(valueAnimatorL)) {
            return null;
        }
        Animator animatorZ = bt0.z(new Animator[]{valueAnimatorL, bt0.o(viewDecorOrSwipingDecorView, bt0.k, new int[]{0, 255}).setDuration(144L)});
        animatorZ.addListener(new C2318a(feedVideoFlowAct));
        return animatorZ;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator m8463d(PutongAct putongAct, FeedVideoFlowAct feedVideoFlowAct) {
        View viewFindViewWithTag;
        a.b bVarFindViewById;
        FeedVideoViewFlowItemView feedVideoViewFlowItemView = feedVideoFlowAct.m7346a2().m10580l().f12554k;
        if (feedVideoViewFlowItemView == null || (viewFindViewWithTag = feedVideoViewFlowItemView.getViewModel().f4071b.findViewWithTag(0)) == null || (bVarFindViewById = viewFindViewWithTag.findViewById(b5c0.f6077o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = feedVideoFlowAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorN = bVarFindViewById.n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (NullChecker.a(valueAnimatorN)) {
            return bt0.z(new Animator[]{valueAnimatorN, bt0.m(viewDecorOrSwipingDecorView, bt0.k, 36L, 144L, (Interpolator) null, new int[]{kbe.d(viewDecorOrSwipingDecorView.getBackground()), 0})});
        }
        return null;
    }
}
