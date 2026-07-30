package p003l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.p000p1.mobile.putong.core.p001ui.mediapreview.MediaPreviewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.PlayerView;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.kbe;
import l.u4c0;
import p028v.C1378a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class q000 extends Act.w<Act, MediaPreviewAct> {
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator m6971c(Act act, MediaPreviewAct mediaPreviewAct) {
        View viewFindViewWithTag = mediaPreviewAct.f550d.findViewWithTag(mediaPreviewAct.f558l);
        if (viewFindViewWithTag == null) {
            return null;
        }
        C1378a.b bVar = (C1378a.b) viewFindViewWithTag.findViewById(u4c0.x9);
        View viewDecorOrSwipingDecorView = mediaPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo880l = bVar.mo880l((ViewGroup) act.getWindow().getDecorView().getRootView());
        if (NullChecker.a(valueAnimatorMo880l)) {
            return bt0.z(new Animator[]{valueAnimatorMo880l, bt0.o(viewDecorOrSwipingDecorView, bt0.k, new int[]{0, 255}).setDuration(144L)});
        }
        return null;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator m6972d(Act act, MediaPreviewAct mediaPreviewAct) {
        View viewFindViewWithTag = mediaPreviewAct.f550d.findViewWithTag(mediaPreviewAct.f558l);
        if (viewFindViewWithTag != null && !(viewFindViewWithTag instanceof PlayerView)) {
            C1378a.b bVar = (C1378a.b) viewFindViewWithTag.findViewById(u4c0.x9);
            View viewDecorOrSwipingDecorView = mediaPreviewAct.decorOrSwipingDecorView();
            ValueAnimator valueAnimatorMo881n = bVar.mo881n((ViewGroup) act.getWindow().getDecorView().getRootView());
            if (NullChecker.a(valueAnimatorMo881n)) {
                return viewDecorOrSwipingDecorView.getBackground() == null ? valueAnimatorMo881n : bt0.z(new Animator[]{valueAnimatorMo881n, bt0.m(viewDecorOrSwipingDecorView, bt0.k, 36L, 144L, (Interpolator) null, new int[]{kbe.d(viewDecorOrSwipingDecorView.getBackground()), 0})});
            }
        }
        return null;
    }
}
