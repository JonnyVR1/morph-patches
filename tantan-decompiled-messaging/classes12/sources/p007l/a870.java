package p007l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.p000p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.kbe;
import v.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class a870 extends Act.w<PutongAct, PhotoAlbumFeedPreviewAct> {

    /* JADX INFO: renamed from: l.a870$a */
    public class C2317a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumFeedPreviewAct f5628a;

        public C2317a(PhotoAlbumFeedPreviewAct photoAlbumFeedPreviewAct) {
            this.f5628a = photoAlbumFeedPreviewAct;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f5628a.m6415h2();
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator m8454c(PutongAct putongAct, PhotoAlbumFeedPreviewAct photoAlbumFeedPreviewAct) {
        a.b bVarFindViewById;
        View viewFindViewWithTag = photoAlbumFeedPreviewAct.f4061d.f4071b.findViewWithTag(Integer.valueOf(photoAlbumFeedPreviewAct.f4060c.f14786c));
        if (viewFindViewWithTag == null || (bVarFindViewById = viewFindViewWithTag.findViewById(b5c0.f6077o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = photoAlbumFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorL = bVarFindViewById.l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (!NullChecker.a(valueAnimatorL)) {
            return null;
        }
        Animator animatorZ = bt0.z(new Animator[]{valueAnimatorL, bt0.o(viewDecorOrSwipingDecorView, bt0.k, new int[]{0, 255}).setDuration(144L)});
        animatorZ.addListener(new C2317a(photoAlbumFeedPreviewAct));
        return animatorZ;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator m8455d(PutongAct putongAct, PhotoAlbumFeedPreviewAct photoAlbumFeedPreviewAct) {
        a.b bVarFindViewById;
        View viewFindViewWithTag = photoAlbumFeedPreviewAct.f4061d.f4071b.findViewWithTag(Integer.valueOf(photoAlbumFeedPreviewAct.f4060c.f14786c));
        if (viewFindViewWithTag == null || (bVarFindViewById = viewFindViewWithTag.findViewById(b5c0.f6077o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = photoAlbumFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorN = bVarFindViewById.n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        Drawable background = viewDecorOrSwipingDecorView.getBackground();
        if (NullChecker.a(valueAnimatorN) && NullChecker.a(background)) {
            return bt0.z(new Animator[]{valueAnimatorN, bt0.m(viewDecorOrSwipingDecorView, bt0.k, 36L, 144L, (Interpolator) null, new int[]{kbe.d(background), 0})});
        }
        return null;
    }
}
