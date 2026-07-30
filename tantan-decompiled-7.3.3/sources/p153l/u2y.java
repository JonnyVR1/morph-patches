package p153l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPreviewAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes3.dex */
public class u2y extends lb2 {

    /* JADX INFO: renamed from: e */
    public List<Media> f177262e;

    /* JADX INFO: renamed from: f */
    public MediaPreviewAct f177263f;

    /* JADX INFO: renamed from: g */
    public boolean f177264g;

    /* JADX INFO: renamed from: l.u2y$a */
    public class C20474a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public int f177265a;

        public C20474a() {
            this.f177265a = u2y.this.f177263f.getResources().getColor(c9c0.f80400b);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            u2y u2yVar = u2y.this;
            int i = u2yVar.f177263f.f31492f.f74836i;
            int i2 = this.f177265a;
            if (u2yVar.f177264g) {
                animatedFraction = 1.0f - animatedFraction;
            }
            u2y.this.f177263f.setStatusBarColor(ye5.m215395a(i, i2, animatedFraction));
        }
    }

    public u2y(MediaPreviewAct mediaPreviewAct, ArrayList<Media> arrayList) {
        new ArrayList();
        this.f177264g = false;
        this.f177263f = mediaPreviewAct;
        this.f177262e = arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static PictureView m194317s(Act act, ViewGroup viewGroup) {
        PictureView pictureView = (PictureView) p9r.m171370a(act).inflate(kec0.f125431Ge, viewGroup, false);
        pictureView.setOnClickListener(pictureView);
        pictureView.m45164I(false);
        pictureView.m45168M();
        return pictureView;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f177262e.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(Object obj) {
        return this.f177262e.indexOf(obj);
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag().equals(obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (viewFindViewWithTag instanceof PictureView) {
            ((PictureView) viewFindViewWithTag).m45194x(true);
        }
        if (NullChecker.m82486a(viewFindViewWithTag)) {
            viewFindViewWithTag.setTag(null);
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        Media media = this.f177262e.get(i);
        boolean z = media instanceof Video;
        MediaPreviewAct mediaPreviewAct = this.f177263f;
        if (z) {
            PictureView pictureViewM194317s = m194317s(mediaPreviewAct, viewGroup);
            viewGroup.addView(pictureViewM194317s);
            pictureViewM194317s.setTag(media);
            pictureViewM194317s.m45176X(media);
            return media;
        }
        PhotoDraweeView photoDraweeView = (PhotoDraweeView) mediaPreviewAct.inflater().inflate(kec0.f126045s3, viewGroup, false);
        viewGroup.addView(photoDraweeView);
        photoDraweeView.setTag(media);
        photoDraweeView.setOnViewTapListener(new fp50() { // from class: l.t2y
            @Override // p153l.fp50
            /* JADX INFO: renamed from: a */
            public final void mo99079a(View view, float f, float f2) {
                this.f171836a.m194318t(view, f, f2);
            }
        });
        uqb0.f180374G.m127146i0(photoDraweeView, media.url);
        return media;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m194318t(View view, float f, float f2) {
        boolean z = this.f177264g;
        MediaPreviewAct mediaPreviewAct = this.f177263f;
        if (z) {
            mediaPreviewAct.getSupportActionBar().mo102174G();
            this.f177264g = false;
        } else {
            mediaPreviewAct.getSupportActionBar().mo102186m();
            this.f177264g = true;
        }
        int iM105511F0 = bnl0.m105511F0() + this.f177263f.getActionBarHeight();
        if (NullChecker.m82486a(this.f177263f.statusHeaderView)) {
            this.f177263f.statusHeaderView.animate().translationY(this.f177264g ? -iM105511F0 : 0.0f).start();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C20474a());
        valueAnimatorOfFloat.setDuration(this.f177264g ? 200L : 150L);
        valueAnimatorOfFloat.setStartDelay(this.f177264g ? 200L : 0L);
    }
}
