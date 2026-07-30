package com.p046p1.mobile.putong.newui.mediaoperation.preview.item;

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
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import p147v.C22585a;
import p147v.VFrame;
import p147v.fresco.photodraweeview.PhotoDraweeView;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;
import p149l.bkb0;
import p149l.e51;
import p149l.lb70;
import p149l.ngm;
import p149l.nim;
import p149l.pgm;
import p149l.qib0;
import p149l.rhi;
import p149l.t100;
import p149l.xdl0;
import p149l.ym2;
import p149l.zg50;

/* JADX INFO: loaded from: classes11.dex */
public class PhotoPreviewView extends VFrame implements C22585a.b {

    /* JADX INFO: renamed from: d */
    public static int f54095d;

    /* JADX INFO: renamed from: e */
    public static int f54096e;

    /* JADX INFO: renamed from: a */
    public PhotoDraweeView f54097a;

    /* JADX INFO: renamed from: b */
    public SubsamplingScaleImageView f54098b;

    /* JADX INFO: renamed from: c */
    public InterfaceC13073d f54099c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$a */
    public class C13070a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f54100a;

        public C13070a(Picture.ImageUri imageUri) {
            this.f54100a = imageUri;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            PhotoPreviewView photoPreviewView = PhotoPreviewView.this;
            PhotoPreviewView.m79093L(photoPreviewView.f54097a, photoPreviewView.f54098b, str, ngmVar, animatable, this.f54100a, photoPreviewView.getImageContainerWidth(), PhotoPreviewView.this.getImageContainerHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$b */
    public class C13071b extends SubsamplingScaleImageView.C22600f {

        /* JADX INFO: renamed from: a */
        public boolean f54102a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54103b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PhotoDraweeView f54104c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SubsamplingScaleImageView f54105d;

        public C13071b(int i, PhotoDraweeView photoDraweeView, SubsamplingScaleImageView subsamplingScaleImageView) {
            this.f54103b = i;
            this.f54104c = photoDraweeView;
            this.f54105d = subsamplingScaleImageView;
        }

        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.C22600f, p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: b */
        public void mo79104b() {
            if (this.f54102a) {
                float originalWidth = this.f54103b / (this.f54104c.getOriginalWidth() <= 960.0f ? this.f54104c.getOriginalWidth() : 960.0f);
                if (originalWidth > this.f54105d.getMaxScale()) {
                    this.f54105d.setMaxScale(originalWidth);
                }
                this.f54105d.setDoubleTapZoomScale(originalWidth);
                this.f54105d.m223446D0(originalWidth, new PointF(0.0f, 0.0f));
                this.f54105d.setAlpha(1.0f);
                this.f54102a = false;
            }
        }

        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.C22600f, p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: f */
        public void mo79105f(Exception exc) {
            this.f54105d.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$c */
    public interface InterfaceC13072c {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$d */
    public interface InterfaceC13073d {
        /* JADX INFO: renamed from: a */
        void mo79106a();
    }

    public PhotoPreviewView(@NonNull Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m79089E(View view, float f, float f2) {
        m79095N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ boolean m79090F(View view) {
        return m79094M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m79091G(View view) {
        m79095N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ boolean m79092K(View view) {
        return m79094M();
    }

    /* JADX INFO: renamed from: L */
    public static void m79093L(final PhotoDraweeView photoDraweeView, final SubsamplingScaleImageView subsamplingScaleImageView, String str, ngm ngmVar, Animatable animatable, Picture.ImageUri imageUri, final int i, int i2) {
        photoDraweeView.m223401w(ngmVar.getWidth(), ngmVar.getHeight());
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
                photoDraweeView.m223400v(originalWidth, 0.0f, 0.0f, true);
            }
        }
        String str2 = qib0.f154730s;
        if (bkb0.m102299d0(photoDraweeView)) {
            final File fileM102355Z = qib0.f154691G.m102355Z(imageUri);
            if (NullChecker.m81303a(fileM102355Z)) {
                e51.m114742G(new Runnable() { // from class: l.kb70
                    @Override // java.lang.Runnable
                    public final void run() {
                        PhotoPreviewView.m79098u(subsamplingScaleImageView, i, photoDraweeView, fileM102355Z);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private boolean m79094M() {
        if (NullChecker.m81303a(null)) {
            throw null;
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    private void m79095N() {
        if (NullChecker.m81303a(this.f54099c)) {
            this.f54099c.mo79106a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerHeight() {
        int i = f54096e;
        return i > 0 ? i : xdl0.m208408w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerWidth() {
        int i = f54095d;
        return i > 0 ? i : xdl0.m208412y0();
    }

    private void init() {
        m79102C(LayoutInflater.from(getContext()), this);
        this.f54097a.setOnViewTapListener(new zg50() { // from class: l.cb70
            @Override // p149l.zg50
            /* JADX INFO: renamed from: a */
            public final void mo105925a(View view, float f, float f2) {
                this.f80107a.m79089E(view, f, f2);
            }
        });
        this.f54097a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.eb70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f90305a.m79090F(view);
            }
        });
        this.f54098b.setOnClickListener(new View.OnClickListener() { // from class: l.gb70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101817a.m79091G(view);
            }
        });
        this.f54098b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ib70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f112355a.m79092K(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m79098u(SubsamplingScaleImageView subsamplingScaleImageView, int i, PhotoDraweeView photoDraweeView, File file) {
        subsamplingScaleImageView.setOnImageEventListener(new C13071b(i, photoDraweeView, subsamplingScaleImageView));
        String absolutePath = file.getAbsolutePath();
        if (i < 720) {
            try {
                if (file.length() > 204800) {
                    pgm pgmVar = new pgm(rhi.m179382z(file.getAbsolutePath()), pgm.f148725n, 0, Bitmap.CompressFormat.JPEG, true);
                    absolutePath = rhi.m179355B(pgmVar.m168764d());
                    photoDraweeView.setOriginalWidth(pgmVar.f148730d[0]);
                    photoDraweeView.setOriginalHeight(pgmVar.f148730d[1]);
                }
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
        }
        subsamplingScaleImageView.setImage(nim.m159528m(absolutePath));
        subsamplingScaleImageView.setVisibility(0);
        subsamplingScaleImageView.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: C */
    public View m79102C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lb70.m149216b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public void m79103O(Picture picture, boolean z) {
        this.f54097a.setOriginalWidth(picture.size.width);
        this.f54097a.setOriginalHeight(picture.size.height);
        this.f54097a.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        this.f54098b.setVisibility(8);
        Picture.ImageUri imageUriWebpMaxWidth1080 = (z && t100.m186891e()) ? picture.webpMaxWidth1080() : picture.aspectRatioBiggest();
        qib0.f154691G.m102315D0(this.f54097a, imageUriWebpMaxWidth1080, new C13070a(imageUriWebpMaxWidth1080), this.f54098b, "");
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: k */
    public String mo43946k() {
        return this.f54097a.mo43946k();
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo43947l(ViewGroup viewGroup) {
        return this.f54097a.mo43947l(viewGroup);
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo43948n(ViewGroup viewGroup) {
        return this.f54097a.getZoomAnimationAttacher().m223330H(viewGroup);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f54095d = getMeasuredWidth();
        f54096e = getMeasuredHeight();
    }

    public void setOnLongPressListener(InterfaceC13072c interfaceC13072c) {
    }

    public void setOnTapListener(InterfaceC13073d interfaceC13073d) {
        this.f54099c = interfaceC13073d;
    }

    public void setOriginalHeight(float f) {
        this.f54097a.setOriginalHeight(f);
    }

    public void setOriginalWidth(float f) {
        this.f54097a.setOriginalWidth(f);
    }

    public void setPicture(Picture picture) {
        m79103O(picture, false);
    }

    public void setZoomAnimationKey(String str) {
        this.f54097a.setZoomAnimationKey(str);
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
