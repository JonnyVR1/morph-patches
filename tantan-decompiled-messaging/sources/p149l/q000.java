package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.PlayerView;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.MediaPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.C22585a;

/* JADX INFO: loaded from: classes3.dex */
public class q000 extends Act.AbstractC4304w<Act, MediaPreviewAct> {
    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(Act act, MediaPreviewAct mediaPreviewAct) {
        View viewFindViewWithTag = mediaPreviewAct.f30659d.findViewWithTag(mediaPreviewAct.f30667l);
        if (viewFindViewWithTag == null) {
            return null;
        }
        C22585a.b bVar = (C22585a.b) viewFindViewWithTag.findViewById(u4c0.f174551x9);
        View viewDecorOrSwipingDecorView = mediaPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo43947l = bVar.mo43947l((ViewGroup) act.getWindow().getDecorView().getRootView());
        if (NullChecker.m81303a(valueAnimatorMo43947l)) {
            return bt0.m103753z(valueAnimatorMo43947l, bt0.m103742o(viewDecorOrSwipingDecorView, bt0.f77164k, 0, 255).setDuration(144L));
        }
        return null;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(Act act, MediaPreviewAct mediaPreviewAct) {
        View viewFindViewWithTag = mediaPreviewAct.f30659d.findViewWithTag(mediaPreviewAct.f30667l);
        if (viewFindViewWithTag != null && !(viewFindViewWithTag instanceof PlayerView)) {
            C22585a.b bVar = (C22585a.b) viewFindViewWithTag.findViewById(u4c0.f174551x9);
            View viewDecorOrSwipingDecorView = mediaPreviewAct.decorOrSwipingDecorView();
            ValueAnimator valueAnimatorMo43948n = bVar.mo43948n((ViewGroup) act.getWindow().getDecorView().getRootView());
            if (NullChecker.m81303a(valueAnimatorMo43948n)) {
                return viewDecorOrSwipingDecorView.getBackground() == null ? valueAnimatorMo43948n : bt0.m103753z(valueAnimatorMo43948n, bt0.m103740m(viewDecorOrSwipingDecorView, bt0.f77164k, 36L, 144L, null, kbe.m145270d(viewDecorOrSwipingDecorView.getBackground()), 0));
            }
        }
        return null;
    }
}
