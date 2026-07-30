package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentCardPreviewAct;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentInfoAct;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.gesture.CorePhotoDraweeView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class l1g0 extends Act.AbstractC4304w<StudentInfoAct, StudentCardPreviewAct> {
    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(StudentInfoAct studentInfoAct, StudentCardPreviewAct studentCardPreviewAct) {
        CorePhotoDraweeView corePhotoDraweeView;
        PhotoPreviewView photoPreviewView = studentCardPreviewAct.f28659c;
        if (photoPreviewView == null || (corePhotoDraweeView = photoPreviewView.f28022a) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = studentCardPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo43947l = corePhotoDraweeView.mo43947l((ViewGroup) studentInfoAct.getWindow().getDecorView().getRootView());
        if (NullChecker.m81303a(valueAnimatorMo43947l)) {
            return bt0.m103753z(valueAnimatorMo43947l, bt0.m103742o(viewDecorOrSwipingDecorView, bt0.f77164k, 0, 255).setDuration(144L));
        }
        return null;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(StudentInfoAct studentInfoAct, StudentCardPreviewAct studentCardPreviewAct) {
        CorePhotoDraweeView corePhotoDraweeView;
        PhotoPreviewView photoPreviewView = studentCardPreviewAct.f28659c;
        if (photoPreviewView == null || (corePhotoDraweeView = photoPreviewView.f28022a) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = studentCardPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo43948n = corePhotoDraweeView.mo43948n((ViewGroup) studentInfoAct.getWindow().getDecorView().getRootView());
        if (NullChecker.m81303a(valueAnimatorMo43948n)) {
            return bt0.m103753z(valueAnimatorMo43948n, bt0.m103740m(viewDecorOrSwipingDecorView, bt0.f77164k, 36L, 144L, null, kbe.m145270d(viewDecorOrSwipingDecorView.getBackground()), 0));
        }
        return null;
    }
}
