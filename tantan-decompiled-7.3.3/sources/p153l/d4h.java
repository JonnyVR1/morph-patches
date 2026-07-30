package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.C22700a;

/* JADX INFO: loaded from: classes13.dex */
public class d4h extends Act.AbstractC4455w<PutongAct, FeedCommentPhotoPreviewAct> {
    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(PutongAct putongAct, FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct) {
        C22700a.b bVar;
        View viewM137601e = feedCommentPhotoPreviewAct.f42326c.m137601e();
        if (viewM137601e == null || (bVar = (C22700a.b) viewM137601e.findViewById(hdc0.f108949o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = feedCommentPhotoPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo45130l = bVar.mo45130l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (NullChecker.m82486a(valueAnimatorMo45130l)) {
            return gt0.m132180z(valueAnimatorMo45130l, gt0.m132169o(viewDecorOrSwipingDecorView, gt0.f106356k, 0, 255).setDuration(144L));
        }
        return null;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(PutongAct putongAct, FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct) {
        C22700a.b bVar;
        View view = feedCommentPhotoPreviewAct.f42326c.f112005e;
        if (view == null || (bVar = (C22700a.b) view.findViewById(hdc0.f108949o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = feedCommentPhotoPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo45131n = bVar.mo45131n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        Drawable background = viewDecorOrSwipingDecorView.getBackground();
        if (NullChecker.m82486a(valueAnimatorMo45131n) && NullChecker.m82486a(background)) {
            return gt0.m132180z(valueAnimatorMo45131n, gt0.m132167m(viewDecorOrSwipingDecorView, gt0.f106356k, 36L, 144L, null, oce.m167164d(background), 0));
        }
        return null;
    }
}
