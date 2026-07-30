package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentCardPreviewAct;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentInfoAct;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.gesture.CorePhotoDraweeView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class s9g0 extends Act.AbstractC4455w<StudentInfoAct, StudentCardPreviewAct> {
    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(StudentInfoAct studentInfoAct, StudentCardPreviewAct studentCardPreviewAct) {
        CorePhotoDraweeView corePhotoDraweeView;
        PhotoPreviewView photoPreviewView = studentCardPreviewAct.f29507c;
        if (photoPreviewView == null || (corePhotoDraweeView = photoPreviewView.f28870a) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = studentCardPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo45130l = corePhotoDraweeView.mo45130l((ViewGroup) studentInfoAct.getWindow().getDecorView().getRootView());
        if (NullChecker.m82486a(valueAnimatorMo45130l)) {
            return gt0.m132180z(valueAnimatorMo45130l, gt0.m132169o(viewDecorOrSwipingDecorView, gt0.f106356k, 0, 255).setDuration(144L));
        }
        return null;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(StudentInfoAct studentInfoAct, StudentCardPreviewAct studentCardPreviewAct) {
        CorePhotoDraweeView corePhotoDraweeView;
        PhotoPreviewView photoPreviewView = studentCardPreviewAct.f29507c;
        if (photoPreviewView == null || (corePhotoDraweeView = photoPreviewView.f28870a) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = studentCardPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo45131n = corePhotoDraweeView.mo45131n((ViewGroup) studentInfoAct.getWindow().getDecorView().getRootView());
        if (NullChecker.m82486a(valueAnimatorMo45131n)) {
            return gt0.m132180z(valueAnimatorMo45131n, gt0.m132167m(viewDecorOrSwipingDecorView, gt0.f106356k, 36L, 144L, null, oce.m167164d(viewDecorOrSwipingDecorView.getBackground()), 0));
        }
        return null;
    }
}
