package p007l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.p000p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.kbe;
import v.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class o2h extends Act.w<PutongAct, FeedCommentPhotoPreviewAct> {
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator m12427c(PutongAct putongAct, FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct) {
        a.b bVarFindViewById;
        View viewM14325e = feedCommentPhotoPreviewAct.f2939c.m14325e();
        if (viewM14325e == null || (bVarFindViewById = viewM14325e.findViewById(b5c0.f6077o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = feedCommentPhotoPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorL = bVarFindViewById.l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (NullChecker.a(valueAnimatorL)) {
            return bt0.z(new Animator[]{valueAnimatorL, bt0.o(viewDecorOrSwipingDecorView, bt0.k, new int[]{0, 255}).setDuration(144L)});
        }
        return null;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator m12428d(PutongAct putongAct, FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct) {
        a.b bVarFindViewById;
        View view = feedCommentPhotoPreviewAct.f2939c.f13100e;
        if (view == null || (bVarFindViewById = view.findViewById(b5c0.f6077o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = feedCommentPhotoPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorN = bVarFindViewById.n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        Drawable background = viewDecorOrSwipingDecorView.getBackground();
        if (NullChecker.a(valueAnimatorN) && NullChecker.a(background)) {
            return bt0.z(new Animator[]{valueAnimatorN, bt0.m(viewDecorOrSwipingDecorView, bt0.k, 36L, 144L, (Interpolator) null, new int[]{kbe.d(background), 0})});
        }
        return null;
    }
}
