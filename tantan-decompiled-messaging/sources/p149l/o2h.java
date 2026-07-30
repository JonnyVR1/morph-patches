package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.C22585a;

/* JADX INFO: loaded from: classes12.dex */
public class o2h extends Act.AbstractC4304w<PutongAct, FeedCommentPhotoPreviewAct> {
    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(PutongAct putongAct, FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct) {
        C22585a.b bVar;
        View viewM186073e = feedCommentPhotoPreviewAct.f41478c.m186073e();
        if (viewM186073e == null || (bVar = (C22585a.b) viewM186073e.findViewById(b5c0.f73596o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = feedCommentPhotoPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo43947l = bVar.mo43947l((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        if (NullChecker.m81303a(valueAnimatorMo43947l)) {
            return bt0.m103753z(valueAnimatorMo43947l, bt0.m103742o(viewDecorOrSwipingDecorView, bt0.f77164k, 0, 255).setDuration(144L));
        }
        return null;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(PutongAct putongAct, FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct) {
        C22585a.b bVar;
        View view = feedCommentPhotoPreviewAct.f41478c.f166570e;
        if (view == null || (bVar = (C22585a.b) view.findViewById(b5c0.f73596o1)) == null) {
            return null;
        }
        View viewDecorOrSwipingDecorView = feedCommentPhotoPreviewAct.decorOrSwipingDecorView();
        ValueAnimator valueAnimatorMo43948n = bVar.mo43948n((ViewGroup) putongAct.getWindow().getDecorView().getRootView());
        Drawable background = viewDecorOrSwipingDecorView.getBackground();
        if (NullChecker.m81303a(valueAnimatorMo43948n) && NullChecker.m81303a(background)) {
            return bt0.m103753z(valueAnimatorMo43948n, bt0.m103740m(viewDecorOrSwipingDecorView, bt0.f77164k, 36L, 144L, null, kbe.m145270d(background), 0));
        }
        return null;
    }
}
