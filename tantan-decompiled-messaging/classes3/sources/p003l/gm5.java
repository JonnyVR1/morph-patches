package p003l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.p000p1.mobile.putong.core.p001ui.mediapreview.CommonMediaPreviewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.kbe;
import l.u4c0;
import p028v.C1378a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gm5 extends Act.w<PutongAct, CommonMediaPreviewAct> {

    /* JADX INFO: renamed from: l.gm5$a */
    public class C0314a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CommonMediaPreviewAct f3951a;

        public C0314a(CommonMediaPreviewAct commonMediaPreviewAct) {
            this.f3951a = commonMediaPreviewAct;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f3951a.m874c2();
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator m4646c(PutongAct putongAct, CommonMediaPreviewAct commonMediaPreviewAct) {
        C1378a.b bVar;
        View viewFindViewWithTag = commonMediaPreviewAct.f539f.f4418b.findViewWithTag(Integer.valueOf(commonMediaPreviewAct.f540g.f4217c));
        if (viewFindViewWithTag == null || (bVar = (C1378a.b) viewFindViewWithTag.findViewById(u4c0.x9)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = commonMediaPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo880l = bVar.mo880l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (!NullChecker.a(valueAnimatorMo880l)) {
            return null;
        }
        Animator animatorZ = bt0.z(new Animator[]{valueAnimatorMo880l, bt0.o(viewDecorOrSwipingDecorView, bt0.k, new int[]{0, 255}).setDuration(144L)});
        animatorZ.addListener(new C0314a(commonMediaPreviewAct));
        return animatorZ;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator m4647d(PutongAct putongAct, CommonMediaPreviewAct commonMediaPreviewAct) {
        C1378a.b bVar;
        View viewFindViewWithTag = commonMediaPreviewAct.f539f.f4418b.findViewWithTag(Integer.valueOf(commonMediaPreviewAct.f540g.f4217c));
        if (viewFindViewWithTag == null || (bVar = (C1378a.b) viewFindViewWithTag.findViewById(u4c0.x9)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = commonMediaPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo881n = bVar.mo881n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        Drawable background = viewDecorOrSwipingDecorView.getBackground();
        if (NullChecker.a(valueAnimatorMo881n) && NullChecker.a(background)) {
            return bt0.z(new Animator[]{valueAnimatorMo881n, bt0.m(viewDecorOrSwipingDecorView, bt0.k, 36L, 144L, (Interpolator) null, new int[]{kbe.d(background), 0})});
        }
        return null;
    }
}
