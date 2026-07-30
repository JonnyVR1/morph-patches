package com.p000p1.mobile.putong.newui.mediaoperation.preview.item;

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
import com.p000p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import l.bkb0;
import l.e51;
import l.lb70;
import l.ngm;
import l.nim;
import l.pgm;
import l.qib0;
import l.rhi;
import l.t100;
import l.xdl0;
import l.ym2;
import l.zg50;
import v.VFrame;
import v.a;
import v.fresco.photodraweeview.PhotoDraweeView;
import v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PhotoPreviewView extends VFrame implements a.b {

    /* JADX INFO: renamed from: d */
    public static int f7701d;

    /* JADX INFO: renamed from: e */
    public static int f7702e;

    /* JADX INFO: renamed from: a */
    public PhotoDraweeView f7703a;

    /* JADX INFO: renamed from: b */
    public SubsamplingScaleImageView f7704b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0475d f7705c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$a */
    public class C0472a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f7706a;

        public C0472a(Picture.ImageUri imageUri) {
            this.f7706a = imageUri;
        }

        /* JADX INFO: renamed from: h */
        public void m9415h(String str, ngm ngmVar, Animatable animatable) {
            PhotoPreviewView photoPreviewView = PhotoPreviewView.this;
            PhotoPreviewView.m9401L(photoPreviewView.f7703a, photoPreviewView.f7704b, str, ngmVar, animatable, this.f7706a, photoPreviewView.getImageContainerWidth(), PhotoPreviewView.this.getImageContainerHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$b */
    public class C0473b extends SubsamplingScaleImageView.f {

        /* JADX INFO: renamed from: a */
        public boolean f7708a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f7709b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PhotoDraweeView f7710c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SubsamplingScaleImageView f7711d;

        public C0473b(int i, PhotoDraweeView photoDraweeView, SubsamplingScaleImageView subsamplingScaleImageView) {
            this.f7709b = i;
            this.f7710c = photoDraweeView;
            this.f7711d = subsamplingScaleImageView;
        }

        /* JADX INFO: renamed from: b */
        public void m9416b() {
            if (this.f7708a) {
                float originalWidth = this.f7709b / (this.f7710c.getOriginalWidth() <= 960.0f ? this.f7710c.getOriginalWidth() : 960.0f);
                if (originalWidth > this.f7711d.getMaxScale()) {
                    this.f7711d.setMaxScale(originalWidth);
                }
                this.f7711d.setDoubleTapZoomScale(originalWidth);
                this.f7711d.D0(originalWidth, new PointF(0.0f, 0.0f));
                this.f7711d.setAlpha(1.0f);
                this.f7708a = false;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m9417f(Exception exc) {
            this.f7711d.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$c */
    public interface InterfaceC0474c {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView$d */
    public interface InterfaceC0475d {
        /* JADX INFO: renamed from: a */
        void mo9418a();
    }

    public PhotoPreviewView(@NonNull Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m9397E(View view, float f, float f2) {
        m9403N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ boolean m9398F(View view) {
        return m9402M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m9399G(View view) {
        m9403N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ boolean m9400K(View view) {
        return m9402M();
    }

    /* JADX INFO: renamed from: L */
    public static void m9401L(final PhotoDraweeView photoDraweeView, final SubsamplingScaleImageView subsamplingScaleImageView, String str, ngm ngmVar, Animatable animatable, Picture.ImageUri imageUri, final int i, int i2) {
        photoDraweeView.w(ngmVar.getWidth(), ngmVar.getHeight());
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
                photoDraweeView.v(originalWidth, 0.0f, 0.0f, true);
            }
        }
        String str2 = qib0.s;
        if (bkb0.d0(photoDraweeView)) {
            final File fileZ = qib0.G.Z(imageUri);
            if (NullChecker.a(fileZ)) {
                e51.G(new Runnable() { // from class: l.kb70
                    @Override // java.lang.Runnable
                    public final void run() {
                        PhotoPreviewView.m9406u(subsamplingScaleImageView, i, photoDraweeView, fileZ);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private boolean m9402M() {
        if (NullChecker.a((Object) null)) {
            throw null;
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    private void m9403N() {
        if (NullChecker.a(this.f7705c)) {
            this.f7705c.mo9418a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerHeight() {
        int i = f7702e;
        return i > 0 ? i : xdl0.w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerWidth() {
        int i = f7701d;
        return i > 0 ? i : xdl0.y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        m9410C(LayoutInflater.from(getContext()), this);
        this.f7703a.setOnViewTapListener(new zg50() { // from class: l.cb70
            /* JADX INFO: renamed from: a */
            public final void m12472a(View view, float f, float f2) {
                this.f10493a.m9397E(view, f, f2);
            }
        });
        this.f7703a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.eb70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f12482a.m9398F(view);
            }
        });
        this.f7704b.setOnClickListener(new View.OnClickListener() { // from class: l.gb70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13398a.m9399G(view);
            }
        });
        this.f7704b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ib70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f14468a.m9400K(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m9406u(SubsamplingScaleImageView subsamplingScaleImageView, int i, PhotoDraweeView photoDraweeView, File file) {
        subsamplingScaleImageView.setOnImageEventListener(new C0473b(i, photoDraweeView, subsamplingScaleImageView));
        String absolutePath = file.getAbsolutePath();
        if (i < 720) {
            try {
                if (file.length() > 204800) {
                    pgm pgmVar = new pgm(rhi.z(file.getAbsolutePath()), pgm.n, 0, Bitmap.CompressFormat.JPEG, true);
                    absolutePath = rhi.B(pgmVar.d());
                    photoDraweeView.setOriginalWidth(pgmVar.d[0]);
                    photoDraweeView.setOriginalHeight(pgmVar.d[1]);
                }
            } catch (IOException e) {
                CrashHelper.c(e);
            }
        }
        subsamplingScaleImageView.setImage(nim.m(absolutePath));
        subsamplingScaleImageView.setVisibility(0);
        subsamplingScaleImageView.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: C */
    public View m9410C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lb70.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public void m9411O(Picture picture, boolean z) {
        this.f7703a.setOriginalWidth(picture.size.width);
        this.f7703a.setOriginalHeight(picture.size.height);
        this.f7703a.setZoomAnimationKey(Media.URL_TO_CACHEKEY(((Media) picture).url));
        this.f7704b.setVisibility(8);
        Picture.ImageUri imageUriWebpMaxWidth1080 = (z && t100.e()) ? picture.webpMaxWidth1080() : picture.aspectRatioBiggest();
        qib0.G.D0(this.f7703a, imageUriWebpMaxWidth1080, new C0472a(imageUriWebpMaxWidth1080), this.f7704b, "");
    }

    /* JADX INFO: renamed from: k */
    public String m9412k() {
        return this.f7703a.k();
    }

    /* JADX INFO: renamed from: l */
    public ValueAnimator m9413l(ViewGroup viewGroup) {
        return this.f7703a.l(viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public ValueAnimator m9414n(ViewGroup viewGroup) {
        return this.f7703a.getZoomAnimationAttacher().H(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        f7701d = getMeasuredWidth();
        f7702e = getMeasuredHeight();
    }

    public void setOnLongPressListener(InterfaceC0474c interfaceC0474c) {
    }

    public void setOnTapListener(InterfaceC0475d interfaceC0475d) {
        this.f7705c = interfaceC0475d;
    }

    public void setOriginalHeight(float f) {
        this.f7703a.setOriginalHeight(f);
    }

    public void setOriginalWidth(float f) {
        this.f7703a.setOriginalWidth(f);
    }

    public void setPicture(Picture picture) {
        m9411O(picture, false);
    }

    public void setZoomAnimationKey(String str) {
        this.f7703a.setZoomAnimationKey(str);
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
