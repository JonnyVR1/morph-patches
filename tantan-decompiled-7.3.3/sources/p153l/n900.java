package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.PlayerView;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.MediaPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.C22700a;

/* JADX INFO: loaded from: classes3.dex */
public class n900 extends Act.AbstractC4455w<Act, MediaPreviewAct> {
    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(Act act, MediaPreviewAct mediaPreviewAct) {
        View viewFindViewWithTag = mediaPreviewAct.f31507d.findViewWithTag(mediaPreviewAct.f31515l);
        if (viewFindViewWithTag == null) {
            return null;
        }
        C22700a.b bVar = (C22700a.b) viewFindViewWithTag.findViewById(adc0.f70676z9);
        View viewDecorOrSwipingDecorView = mediaPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo45130l = bVar.mo45130l((ViewGroup) act.getWindow().getDecorView().getRootView());
        if (NullChecker.m82486a(valueAnimatorMo45130l)) {
            return gt0.m132180z(valueAnimatorMo45130l, gt0.m132169o(viewDecorOrSwipingDecorView, gt0.f106356k, 0, 255).setDuration(144L));
        }
        return null;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(Act act, MediaPreviewAct mediaPreviewAct) {
        View viewFindViewWithTag = mediaPreviewAct.f31507d.findViewWithTag(mediaPreviewAct.f31515l);
        if (viewFindViewWithTag != null && !(viewFindViewWithTag instanceof PlayerView)) {
            C22700a.b bVar = (C22700a.b) viewFindViewWithTag.findViewById(adc0.f70676z9);
            View viewDecorOrSwipingDecorView = mediaPreviewAct.decorOrSwipingDecorView();
            ValueAnimator valueAnimatorMo45131n = bVar.mo45131n((ViewGroup) act.getWindow().getDecorView().getRootView());
            if (NullChecker.m82486a(valueAnimatorMo45131n)) {
                return viewDecorOrSwipingDecorView.getBackground() == null ? valueAnimatorMo45131n : gt0.m132180z(valueAnimatorMo45131n, gt0.m132167m(viewDecorOrSwipingDecorView, gt0.f106356k, 36L, 144L, null, oce.m167164d(viewDecorOrSwipingDecorView.getBackground()), 0));
            }
        }
        return null;
    }
}
