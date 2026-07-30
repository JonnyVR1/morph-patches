package p003l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPreviewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;
import l.o7r;
import l.qib0;
import l.w0c0;
import l.xdl0;
import l.yd5;
import p028v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class xtx extends eb2 {

    /* JADX INFO: renamed from: e */
    public List<Media> f8856e;

    /* JADX INFO: renamed from: f */
    public MediaPreviewAct f8857f;

    /* JADX INFO: renamed from: g */
    public boolean f8858g;

    /* JADX INFO: renamed from: l.xtx$a */
    public class C0646a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public int f8859a;

        public C0646a() {
            this.f8859a = xtx.this.f8857f.getResources().getColor(w0c0.b);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            xtx xtxVar = xtx.this;
            int i = xtxVar.f8857f.f535f.f3390i;
            int i2 = this.f8859a;
            if (xtxVar.f8858g) {
                animatedFraction = 1.0f - animatedFraction;
            }
            xtx.this.f8857f.setStatusBarColor(yd5.a(i, i2, animatedFraction));
        }
    }

    public xtx(MediaPreviewAct mediaPreviewAct, ArrayList<Media> arrayList) {
        new ArrayList();
        this.f8858g = false;
        this.f8857f = mediaPreviewAct;
        this.f8856e = arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static PictureView m8867s(Act act, ViewGroup viewGroup) {
        PictureView pictureViewInflate = o7r.a(act).inflate(f6c0.ze, viewGroup, false);
        pictureViewInflate.setOnClickListener(pictureViewInflate);
        pictureViewInflate.I(false);
        pictureViewInflate.M();
        return pictureViewInflate;
    }

    public int getCount() {
        return this.f8856e.size();
    }

    public int getItemPosition(Object obj) {
        return this.f8856e.indexOf(obj);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag().equals(obj);
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: o */
    public void mo923o(ViewGroup viewGroup, int i, Object obj) {
        PictureView pictureViewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (pictureViewFindViewWithTag instanceof PictureView) {
            pictureViewFindViewWithTag.x(true);
        }
        if (NullChecker.a(pictureViewFindViewWithTag)) {
            pictureViewFindViewWithTag.setTag(null);
            viewGroup.removeView(pictureViewFindViewWithTag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.facebook.drawee.view.SimpleDraweeView, v.fresco.photodraweeview.PhotoDraweeView] */
    @Override // p003l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo924p(ViewGroup viewGroup, int i) {
        Media media = this.f8856e.get(i);
        boolean z = media instanceof Video;
        MediaPreviewAct mediaPreviewAct = this.f8857f;
        if (z) {
            PictureView pictureViewM8867s = m8867s(mediaPreviewAct, viewGroup);
            viewGroup.addView(pictureViewM8867s);
            pictureViewM8867s.setTag(media);
            pictureViewM8867s.X(media);
            return media;
        }
        ?? r0 = (PhotoDraweeView) mediaPreviewAct.inflater().inflate(f6c0.s3, viewGroup, false);
        viewGroup.addView(r0);
        r0.setTag(media);
        r0.setOnViewTapListener(new zg50() { // from class: l.wtx
            @Override // p003l.zg50
            /* JADX INFO: renamed from: a */
            public final void mo8583a(View view, float f, float f2) {
                this.f8619a.m8868t(view, f, f2);
            }
        });
        qib0.G.i0((SimpleDraweeView) r0, media.url);
        return media;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m8868t(View view, float f, float f2) {
        boolean z = this.f8858g;
        MediaPreviewAct mediaPreviewAct = this.f8857f;
        if (z) {
            mediaPreviewAct.getSupportActionBar().G();
            this.f8858g = false;
        } else {
            mediaPreviewAct.getSupportActionBar().m();
            this.f8858g = true;
        }
        int iF0 = xdl0.F0() + this.f8857f.getActionBarHeight();
        if (NullChecker.a(((PutongAct) this.f8857f).statusHeaderView)) {
            ((PutongAct) this.f8857f).statusHeaderView.animate().translationY(this.f8858g ? -iF0 : 0.0f).start();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C0646a());
        valueAnimatorOfFloat.setDuration(this.f8858g ? 200L : 150L);
        valueAnimatorOfFloat.setStartDelay(this.f8858g ? 200L : 0L);
    }
}
