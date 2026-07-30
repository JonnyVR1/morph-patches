package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.C22700a;

/* JADX INFO: loaded from: classes13.dex */
public class gg70 extends Act.AbstractC4455w<PutongAct, PhotoAlbumFeedPreviewAct> {

    /* JADX INFO: renamed from: l.gg70$a */
    public class C17211a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumFeedPreviewAct f103996a;

        public C17211a(PhotoAlbumFeedPreviewAct photoAlbumFeedPreviewAct) {
            this.f103996a = photoAlbumFeedPreviewAct;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f103996a.m66497i2();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(PutongAct putongAct, PhotoAlbumFeedPreviewAct photoAlbumFeedPreviewAct) {
        C22700a.b bVar;
        View viewFindViewWithTag = photoAlbumFeedPreviewAct.f43448d.f43458b.findViewWithTag(Integer.valueOf(photoAlbumFeedPreviewAct.f43447c.f88268c));
        if (viewFindViewWithTag == null || (bVar = (C22700a.b) viewFindViewWithTag.findViewById(hdc0.f108949o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = photoAlbumFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo45130l = bVar.mo45130l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (!NullChecker.m82486a(valueAnimatorMo45130l)) {
            return null;
        }
        Animator animatorM132180z = gt0.m132180z(valueAnimatorMo45130l, gt0.m132169o(viewDecorOrSwipingDecorView, gt0.f106356k, 0, 255).setDuration(144L));
        animatorM132180z.addListener(new C17211a(photoAlbumFeedPreviewAct));
        return animatorM132180z;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(PutongAct putongAct, PhotoAlbumFeedPreviewAct photoAlbumFeedPreviewAct) {
        C22700a.b bVar;
        View viewFindViewWithTag = photoAlbumFeedPreviewAct.f43448d.f43458b.findViewWithTag(Integer.valueOf(photoAlbumFeedPreviewAct.f43447c.f88268c));
        if (viewFindViewWithTag == null || (bVar = (C22700a.b) viewFindViewWithTag.findViewById(hdc0.f108949o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = photoAlbumFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo45131n = bVar.mo45131n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        Drawable background = viewDecorOrSwipingDecorView.getBackground();
        if (NullChecker.m82486a(valueAnimatorMo45131n) && NullChecker.m82486a(background)) {
            return gt0.m132180z(valueAnimatorMo45131n, gt0.m132167m(viewDecorOrSwipingDecorView, gt0.f106356k, 36L, 144L, null, oce.m167164d(background), 0));
        }
        return null;
    }
}
