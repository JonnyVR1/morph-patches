package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.CommonMediaPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.C22700a;

/* JADX INFO: loaded from: classes3.dex */
public class kn5 extends Act.AbstractC4455w<PutongAct, CommonMediaPreviewAct> {

    /* JADX INFO: renamed from: l.kn5$a */
    public class C18213a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CommonMediaPreviewAct f127556a;

        public C18213a(CommonMediaPreviewAct commonMediaPreviewAct) {
            this.f127556a = commonMediaPreviewAct;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f127556a.m48991d2();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(PutongAct putongAct, CommonMediaPreviewAct commonMediaPreviewAct) {
        C22700a.b bVar;
        View viewFindViewWithTag = commonMediaPreviewAct.f31496f.f121468b.findViewWithTag(Integer.valueOf(commonMediaPreviewAct.f31497g.f115527c));
        if (viewFindViewWithTag == null || (bVar = (C22700a.b) viewFindViewWithTag.findViewById(adc0.f70676z9)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = commonMediaPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo45130l = bVar.mo45130l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (!NullChecker.m82486a(valueAnimatorMo45130l)) {
            return null;
        }
        Animator animatorM132180z = gt0.m132180z(valueAnimatorMo45130l, gt0.m132169o(viewDecorOrSwipingDecorView, gt0.f106356k, 0, 255).setDuration(144L));
        animatorM132180z.addListener(new C18213a(commonMediaPreviewAct));
        return animatorM132180z;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(PutongAct putongAct, CommonMediaPreviewAct commonMediaPreviewAct) {
        C22700a.b bVar;
        View viewFindViewWithTag = commonMediaPreviewAct.f31496f.f121468b.findViewWithTag(Integer.valueOf(commonMediaPreviewAct.f31497g.f115527c));
        if (viewFindViewWithTag == null || (bVar = (C22700a.b) viewFindViewWithTag.findViewById(adc0.f70676z9)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = commonMediaPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo45131n = bVar.mo45131n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        Drawable background = viewDecorOrSwipingDecorView.getBackground();
        if (NullChecker.m82486a(valueAnimatorMo45131n) && NullChecker.m82486a(background)) {
            return gt0.m132180z(valueAnimatorMo45131n, gt0.m132167m(viewDecorOrSwipingDecorView, gt0.f106356k, 36L, 144L, null, oce.m167164d(background), 0));
        }
        return null;
    }
}
