package com.p051p1.mobile.putong.newui.mediaoperation.preview.item;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import p151v.C22700a;
import p151v.VFrame;
import p151v.fresco.photodraweeview.PhotoDraweeView;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;
import p153l.bnl0;
import p153l.fn2;
import p153l.fp50;
import p153l.fsb0;
import p153l.l51;
import p153l.oki;
import p153l.qa00;
import p153l.qim;
import p153l.qkm;
import p153l.rj70;
import p153l.sim;
import p153l.uqb0;

/* JADX INFO: loaded from: classes10.dex */
public class PhotoPreviewView extends VFrame implements C22700a.b {

    /* JADX INFO: renamed from: d */
    public static int f54943d;

    /* JADX INFO: renamed from: e */
    public static int f54944e;

    /* JADX INFO: renamed from: a */
    public PhotoDraweeView f54945a;

    /* JADX INFO: renamed from: b */
    public SubsamplingScaleImageView f54946b;

    /* JADX INFO: renamed from: c */
    public InterfaceC13236d f54947c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$a */
    public class C13233a extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f54948a;

        public C13233a(Picture.ImageUri imageUri) {
            this.f54948a = imageUri;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            PhotoPreviewView photoPreviewView = PhotoPreviewView.this;
            PhotoPreviewView.m80276L(photoPreviewView.f54945a, photoPreviewView.f54946b, str, qimVar, animatable, this.f54948a, photoPreviewView.getImageContainerWidth(), PhotoPreviewView.this.getImageContainerHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$b */
    public class C13234b extends SubsamplingScaleImageView.C22715f {

        /* JADX INFO: renamed from: a */
        public boolean f54950a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54951b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PhotoDraweeView f54952c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SubsamplingScaleImageView f54953d;

        public C13234b(int i, PhotoDraweeView photoDraweeView, SubsamplingScaleImageView subsamplingScaleImageView) {
            this.f54951b = i;
            this.f54952c = photoDraweeView;
            this.f54953d = subsamplingScaleImageView;
        }

        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.C22715f, p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: b */
        public void mo80287b() {
            if (this.f54950a) {
                float originalWidth = this.f54951b / (this.f54952c.getOriginalWidth() <= 960.0f ? this.f54952c.getOriginalWidth() : 960.0f);
                if (originalWidth > this.f54953d.getMaxScale()) {
                    this.f54953d.setMaxScale(originalWidth);
                }
                this.f54953d.setDoubleTapZoomScale(originalWidth);
                this.f54953d.m224692D0(originalWidth, new PointF(0.0f, 0.0f));
                this.f54953d.setAlpha(1.0f);
                this.f54950a = false;
            }
        }

        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.C22715f, p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: f */
        public void mo80288f(Exception exc) {
            this.f54953d.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$c */
    public interface InterfaceC13235c {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$d */
    public interface InterfaceC13236d {
        /* JADX INFO: renamed from: a */
        void mo80289a();
    }

    public PhotoPreviewView(@NonNull Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m80272E(View view, float f, float f2) {
        m80278N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ boolean m80273F(View view) {
        return m80277M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m80274G(View view) {
        m80278N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ boolean m80275K(View view) {
        return m80277M();
    }

    /* JADX INFO: renamed from: L */
    public static void m80276L(final PhotoDraweeView photoDraweeView, final SubsamplingScaleImageView subsamplingScaleImageView, String str, qim qimVar, Animatable animatable, Picture.ImageUri imageUri, final int i, int i2) {
        photoDraweeView.m224647w(qimVar.getWidth(), qimVar.getHeight());
        if (photoDraweeView.getOriginalHeight() > photoDraweeView.getOriginalWidth()) {
            float f = i2;
            float f2 = i;
            if (photoDraweeView.getOriginalHeight() / photoDraweeView.getOriginalWidth() > f / f2) {
                float originalWidth = f2 / ((photoDraweeView.getOriginalWidth() * f) / photoDraweeView.getOriginalHeight());
                if (originalWidth > photoDraweeView.getMaximumScale()) {
                    photoDraweeView.setMaximumScale(originalWidth);
                }
                if (originalWidth > 1.1f) {
                    photoDraweeView.setDoubleTapScale(originalWidth);
                }
                if (originalWidth > photoDraweeView.getMaximumScale()) {
                    originalWidth = photoDraweeView.getMaximumScale();
                }
                photoDraweeView.m224646v(originalWidth, 0.0f, 0.0f, true);
            }
        }
        String str2 = uqb0.f180413s;
        if (fsb0.m127083d0(photoDraweeView)) {
            final File fileM127139Z = uqb0.f180374G.m127139Z(imageUri);
            if (NullChecker.m82486a(fileM127139Z)) {
                l51.m152887G(new Runnable() { // from class: l.qj70
                    @Override // java.lang.Runnable
                    public final void run() {
                        PhotoPreviewView.m80281u(subsamplingScaleImageView, i, photoDraweeView, fileM127139Z);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private boolean m80277M() {
        if (NullChecker.m82486a(null)) {
            throw null;
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    private void m80278N() {
        if (NullChecker.m82486a(this.f54947c)) {
            this.f54947c.mo80289a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerHeight() {
        int i = f54944e;
        return i > 0 ? i : bnl0.m105588w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerWidth() {
        int i = f54943d;
        return i > 0 ? i : bnl0.m105592y0();
    }

    private void init() {
        m80285C(LayoutInflater.from(getContext()), this);
        this.f54945a.setOnViewTapListener(new fp50() { // from class: l.ij70
            @Override // p153l.fp50
            /* JADX INFO: renamed from: a */
            public final void mo99079a(View view, float f, float f2) {
                this.f115196a.m80272E(view, f, f2);
            }
        });
        this.f54945a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.kj70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f127078a.m80273F(view);
            }
        });
        this.f54946b.setOnClickListener(new View.OnClickListener() { // from class: l.mj70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137059a.m80274G(view);
            }
        });
        this.f54946b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.oj70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f147639a.m80275K(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m80281u(SubsamplingScaleImageView subsamplingScaleImageView, int i, PhotoDraweeView photoDraweeView, File file) {
        subsamplingScaleImageView.setOnImageEventListener(new C13234b(i, photoDraweeView, subsamplingScaleImageView));
        String absolutePath = file.getAbsolutePath();
        if (i < 720) {
            try {
                if (file.length() > 204800) {
                    sim simVar = new sim(oki.m168038z(file.getAbsolutePath()), sim.f168838n, 0, Bitmap.CompressFormat.JPEG, true);
                    absolutePath = oki.m168011B(simVar.m186025d());
                    photoDraweeView.setOriginalWidth(simVar.f168843d[0]);
                    photoDraweeView.setOriginalHeight(simVar.f168843d[1]);
                }
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
        }
        subsamplingScaleImageView.setImage(qkm.m176955m(absolutePath));
        subsamplingScaleImageView.setVisibility(0);
        subsamplingScaleImageView.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: C */
    public View m80285C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rj70.m181690b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public void m80286O(Picture picture, boolean z) {
        this.f54945a.setOriginalWidth(picture.size.width);
        this.f54945a.setOriginalHeight(picture.size.height);
        this.f54945a.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        this.f54946b.setVisibility(8);
        Picture.ImageUri imageUriWebpMaxWidth1080 = (z && qa00.m175860e()) ? picture.webpMaxWidth1080() : picture.aspectRatioBiggest();
        uqb0.f180374G.m127099D0(this.f54945a, imageUriWebpMaxWidth1080, new C13233a(imageUriWebpMaxWidth1080), this.f54946b, "");
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: k */
    public String mo45129k() {
        return this.f54945a.mo45129k();
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo45130l(ViewGroup viewGroup) {
        return this.f54945a.mo45130l(viewGroup);
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo45131n(ViewGroup viewGroup) {
        return this.f54945a.getZoomAnimationAttacher().m224576H(viewGroup);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f54943d = getMeasuredWidth();
        f54944e = getMeasuredHeight();
    }

    public void setOnLongPressListener(InterfaceC13235c interfaceC13235c) {
    }

    public void setOnTapListener(InterfaceC13236d interfaceC13236d) {
        this.f54947c = interfaceC13236d;
    }

    public void setOriginalHeight(float f) {
        this.f54945a.setOriginalHeight(f);
    }

    public void setOriginalWidth(float f) {
        this.f54945a.setOriginalWidth(f);
    }

    public void setPicture(Picture picture) {
        m80286O(picture, false);
    }

    public void setZoomAnimationKey(String str) {
        this.f54945a.setZoomAnimationKey(str);
    }

    public PhotoPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public PhotoPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
