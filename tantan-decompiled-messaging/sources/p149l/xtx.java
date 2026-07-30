package p149l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPreviewAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes3.dex */
public class xtx extends eb2 {

    /* JADX INFO: renamed from: e */
    public List<Media> f194443e;

    /* JADX INFO: renamed from: f */
    public MediaPreviewAct f194444f;

    /* JADX INFO: renamed from: g */
    public boolean f194445g;

    /* JADX INFO: renamed from: l.xtx$a */
    public class C21216a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public int f194446a;

        public C21216a() {
            this.f194446a = xtx.this.f194444f.getResources().getColor(w0c0.f183831b);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            xtx xtxVar = xtx.this;
            int i = xtxVar.f194444f.f30644f.f93289i;
            int i2 = this.f194446a;
            if (xtxVar.f194445g) {
                animatedFraction = 1.0f - animatedFraction;
            }
            xtx.this.f194444f.setStatusBarColor(yd5.m214214a(i, i2, animatedFraction));
        }
    }

    public xtx(MediaPreviewAct mediaPreviewAct, ArrayList<Media> arrayList) {
        new ArrayList();
        this.f194445g = false;
        this.f194444f = mediaPreviewAct;
        this.f194443e = arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static PictureView m211030s(Act act, ViewGroup viewGroup) {
        PictureView pictureView = (PictureView) o7r.m163037a(act).inflate(f6c0.f96120ze, viewGroup, false);
        pictureView.setOnClickListener(pictureView);
        pictureView.m43981I(false);
        pictureView.m43985M();
        return pictureView;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f194443e.size();
    }

    @Override // p149l.w660
    public int getItemPosition(Object obj) {
        return this.f194443e.indexOf(obj);
    }

    @Override // p149l.w660
    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag().equals(obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (viewFindViewWithTag instanceof PictureView) {
            ((PictureView) viewFindViewWithTag).m44011x(true);
        }
        if (NullChecker.m81303a(viewFindViewWithTag)) {
            viewFindViewWithTag.setTag(null);
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        Media media = this.f194443e.get(i);
        boolean z = media instanceof Video;
        MediaPreviewAct mediaPreviewAct = this.f194444f;
        if (z) {
            PictureView pictureViewM211030s = m211030s(mediaPreviewAct, viewGroup);
            viewGroup.addView(pictureViewM211030s);
            pictureViewM211030s.setTag(media);
            pictureViewM211030s.m43993X(media);
            return media;
        }
        PhotoDraweeView photoDraweeView = (PhotoDraweeView) mediaPreviewAct.inflater().inflate(f6c0.f95991s3, viewGroup, false);
        viewGroup.addView(photoDraweeView);
        photoDraweeView.setTag(media);
        photoDraweeView.setOnViewTapListener(new zg50() { // from class: l.wtx
            @Override // p149l.zg50
            /* JADX INFO: renamed from: a */
            public final void mo105925a(View view, float f, float f2) {
                this.f188062a.m211031t(view, f, f2);
            }
        });
        qib0.f154691G.m102363i0(photoDraweeView, media.url);
        return media;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m211031t(View view, float f, float f2) {
        boolean z = this.f194445g;
        MediaPreviewAct mediaPreviewAct = this.f194444f;
        if (z) {
            mediaPreviewAct.getSupportActionBar().mo134117G();
            this.f194445g = false;
        } else {
            mediaPreviewAct.getSupportActionBar().mo134126m();
            this.f194445g = true;
        }
        int iM208331F0 = xdl0.m208331F0() + this.f194444f.getActionBarHeight();
        if (NullChecker.m81303a(this.f194444f.statusHeaderView)) {
            this.f194444f.statusHeaderView.animate().translationY(this.f194445g ? -iM208331F0 : 0.0f).start();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C21216a());
        valueAnimatorOfFloat.setDuration(this.f194445g ? 200L : 150L);
        valueAnimatorOfFloat.setStartDelay(this.f194445g ? 200L : 0L);
    }
}
