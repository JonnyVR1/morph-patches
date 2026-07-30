package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.CommonMediaPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.C22585a;

/* JADX INFO: loaded from: classes3.dex */
public class gm5 extends Act.AbstractC4304w<PutongAct, CommonMediaPreviewAct> {

    /* JADX INFO: renamed from: l.gm5$a */
    public class C17118a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CommonMediaPreviewAct f103423a;

        public C17118a(CommonMediaPreviewAct commonMediaPreviewAct) {
            this.f103423a = commonMediaPreviewAct;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f103423a.m47808c2();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(PutongAct putongAct, CommonMediaPreviewAct commonMediaPreviewAct) {
        C22585a.b bVar;
        View viewFindViewWithTag = commonMediaPreviewAct.f30648f.f113632b.findViewWithTag(Integer.valueOf(commonMediaPreviewAct.f30649g.f108155c));
        if (viewFindViewWithTag == null || (bVar = (C22585a.b) viewFindViewWithTag.findViewById(u4c0.f174551x9)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = commonMediaPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo43947l = bVar.mo43947l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (!NullChecker.m81303a(valueAnimatorMo43947l)) {
            return null;
        }
        Animator animatorM103753z = bt0.m103753z(valueAnimatorMo43947l, bt0.m103742o(viewDecorOrSwipingDecorView, bt0.f77164k, 0, 255).setDuration(144L));
        animatorM103753z.addListener(new C17118a(commonMediaPreviewAct));
        return animatorM103753z;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(PutongAct putongAct, CommonMediaPreviewAct commonMediaPreviewAct) {
        C22585a.b bVar;
        View viewFindViewWithTag = commonMediaPreviewAct.f30648f.f113632b.findViewWithTag(Integer.valueOf(commonMediaPreviewAct.f30649g.f108155c));
        if (viewFindViewWithTag == null || (bVar = (C22585a.b) viewFindViewWithTag.findViewById(u4c0.f174551x9)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = commonMediaPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo43948n = bVar.mo43948n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        Drawable background = viewDecorOrSwipingDecorView.getBackground();
        if (NullChecker.m81303a(valueAnimatorMo43948n) && NullChecker.m81303a(background)) {
            return bt0.m103753z(valueAnimatorMo43948n, bt0.m103740m(viewDecorOrSwipingDecorView, bt0.f77164k, 36L, 144L, null, kbe.m145270d(background), 0));
        }
        return null;
    }
}
