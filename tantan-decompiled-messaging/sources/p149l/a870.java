package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.C22585a;

/* JADX INFO: loaded from: classes12.dex */
public class a870 extends Act.AbstractC4304w<PutongAct, PhotoAlbumFeedPreviewAct> {

    /* JADX INFO: renamed from: l.a870$a */
    public class C15542a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumFeedPreviewAct f68001a;

        public C15542a(PhotoAlbumFeedPreviewAct photoAlbumFeedPreviewAct) {
            this.f68001a = photoAlbumFeedPreviewAct;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f68001a.m65314h2();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(PutongAct putongAct, PhotoAlbumFeedPreviewAct photoAlbumFeedPreviewAct) {
        C22585a.b bVar;
        View viewFindViewWithTag = photoAlbumFeedPreviewAct.f42600d.f42610b.findViewWithTag(Integer.valueOf(photoAlbumFeedPreviewAct.f42599c.f191322c));
        if (viewFindViewWithTag == null || (bVar = (C22585a.b) viewFindViewWithTag.findViewById(b5c0.f73596o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = photoAlbumFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo43947l = bVar.mo43947l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (!NullChecker.m81303a(valueAnimatorMo43947l)) {
            return null;
        }
        Animator animatorM103753z = bt0.m103753z(valueAnimatorMo43947l, bt0.m103742o(viewDecorOrSwipingDecorView, bt0.f77164k, 0, 255).setDuration(144L));
        animatorM103753z.addListener(new C15542a(photoAlbumFeedPreviewAct));
        return animatorM103753z;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(PutongAct putongAct, PhotoAlbumFeedPreviewAct photoAlbumFeedPreviewAct) {
        C22585a.b bVar;
        View viewFindViewWithTag = photoAlbumFeedPreviewAct.f42600d.f42610b.findViewWithTag(Integer.valueOf(photoAlbumFeedPreviewAct.f42599c.f191322c));
        if (viewFindViewWithTag == null || (bVar = (C22585a.b) viewFindViewWithTag.findViewById(b5c0.f73596o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = photoAlbumFeedPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo43948n = bVar.mo43948n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        Drawable background = viewDecorOrSwipingDecorView.getBackground();
        if (NullChecker.m81303a(valueAnimatorMo43948n) && NullChecker.m81303a(background)) {
            return bt0.m103753z(valueAnimatorMo43948n, bt0.m103740m(viewDecorOrSwipingDecorView, bt0.f77164k, 36L, 144L, null, kbe.m145270d(background), 0));
        }
        return null;
    }
}
