package p003l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.p000p1.mobile.putong.core.p001ui.campus.StudentCardPreviewAct;
import com.p000p1.mobile.putong.core.p001ui.campus.StudentInfoAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.PhotoPreviewView;
import com.p1.mobile.putong.core.ui.mediapreview.gesture.CorePhotoDraweeView;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.kbe;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l1g0 extends Act.w<StudentInfoAct, StudentCardPreviewAct> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator m7653c(StudentInfoAct studentInfoAct, StudentCardPreviewAct studentCardPreviewAct) {
        CorePhotoDraweeView corePhotoDraweeView;
        PhotoPreviewView photoPreviewView = studentCardPreviewAct.f1053c;
        if (photoPreviewView == null || (corePhotoDraweeView = photoPreviewView.a) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = studentCardPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorL = corePhotoDraweeView.l((ViewGroup) studentInfoAct.getWindow().getDecorView().getRootView());
        if (NullChecker.a(valueAnimatorL)) {
            return bt0.z(new Animator[]{valueAnimatorL, bt0.o(viewDecorOrSwipingDecorView, bt0.k, new int[]{0, 255}).setDuration(144L)});
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator m7654d(StudentInfoAct studentInfoAct, StudentCardPreviewAct studentCardPreviewAct) {
        CorePhotoDraweeView corePhotoDraweeView;
        PhotoPreviewView photoPreviewView = studentCardPreviewAct.f1053c;
        if (photoPreviewView == null || (corePhotoDraweeView = photoPreviewView.a) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = studentCardPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorN = corePhotoDraweeView.n((ViewGroup) studentInfoAct.getWindow().getDecorView().getRootView());
        if (NullChecker.a(valueAnimatorN)) {
            return bt0.z(new Animator[]{valueAnimatorN, bt0.m(viewDecorOrSwipingDecorView, bt0.k, 36L, 144L, (Interpolator) null, new int[]{kbe.d(viewDecorOrSwipingDecorView.getBackground()), 0})});
        }
        return null;
    }
}
