package com.p000p1.mobile.putong.feed.newui.preview.pageritem;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.data.StickerSourceInfo;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.bkb0;
import l.hce;
import l.ngm;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.ym2;
import l.zg50;
import l.zvf0;
import p007l.exq;
import p007l.ia70;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.a;
import v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumPhotoPreviewView extends VFrame implements a.b {

    /* JADX INFO: renamed from: g */
    public static int f4115g;

    /* JADX INFO: renamed from: h */
    public static int f4116h;

    /* JADX INFO: renamed from: a */
    public FeedPhotoDraweeView f4117a;

    /* JADX INFO: renamed from: b */
    public SubsamplingScaleImageView f4118b;

    /* JADX INFO: renamed from: c */
    public VLinear f4119c;

    /* JADX INFO: renamed from: d */
    public VImage f4120d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2165b f4121e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2166c f4122f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView$a */
    public class C2164a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f4123a;

        public C2164a(Picture.ImageUri imageUri) {
            this.f4123a = imageUri;
        }

        /* JADX INFO: renamed from: h */
        public void m6514h(String str, ngm ngmVar, Animatable animatable) {
            PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView = PhotoAlbumPhotoPreviewView.this;
            bkb0.o0(photoAlbumPhotoPreviewView.f4117a, photoAlbumPhotoPreviewView.f4118b, str, ngmVar, animatable, this.f4123a, photoAlbumPhotoPreviewView.getImageContainerWidth(), PhotoAlbumPhotoPreviewView.this.getImageContainerHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView$b */
    public interface InterfaceC2165b {
        /* JADX INFO: renamed from: a */
        boolean mo6515a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView$c */
    public interface InterfaceC2166c {
        /* JADX INFO: renamed from: a */
        void mo3330a();
    }

    public PhotoAlbumPhotoPreviewView(@NonNull Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m6491K(View view, float f, float f2) {
        m6497S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ boolean m6492L(View view) {
        return m6496R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m6493M(View view) {
        m6497S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ boolean m6494N(View view) {
        return m6496R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m6495O(View view) {
        if (getContext() instanceof Act) {
            getContext().finish();
        }
    }

    /* JADX INFO: renamed from: R */
    private boolean m6496R() {
        if (NullChecker.a(this.f4121e)) {
            return this.f4121e.mo6515a();
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    private void m6497S() {
        if (NullChecker.a(this.f4122f)) {
            this.f4122f.mo3330a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerHeight() {
        int i = f4116h;
        return i > 0 ? i : xdl0.w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerWidth() {
        int i = f4115g;
        return i > 0 ? i : xdl0.y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        m6504F(LayoutInflater.from(getContext()), this);
        this.f4117a.setOnViewTapListener(new zg50() { // from class: l.ca70
            /* JADX INFO: renamed from: a */
            public final void m9112a(View view, float f, float f2) {
                this.f6582a.m6491K(view, f, f2);
            }
        });
        this.f4117a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.da70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f6876a.m6492L(view);
            }
        });
        this.f4118b.setOnClickListener(new View.OnClickListener() { // from class: l.ea70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7265a.m6493M(view);
            }
        });
        this.f4118b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.fa70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f8049a.m6494N(view);
            }
        });
        xdl0.E0(this.f4120d, new View.OnClickListener() { // from class: l.ga70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8403a.m6495O(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public View m6504F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ia70.m10847b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public void m6505G(Picture picture) {
        StickerInfo stickerInfoNew_ = StickerInfo.new_();
        ArrayList arrayList = new ArrayList();
        stickerInfoNew_.pictures = arrayList;
        arrayList.add(picture);
        picture.attachments = new ArrayList();
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = picture.url;
        pictureNew_.size = picture.size;
        pictureNew_.mediaType = picture.mediaType;
        picture.attachments.add(pictureNew_);
        stickerInfoNew_.source = StickerSourceInfo.get(StickerSourceInfo.selfCollect);
        stickerInfoNew_.hash = picture.url;
        FeedModule.m1140H().Ff(getContext(), stickerInfoNew_);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m6506P(Picture picture, View view) {
        m6505G(picture);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m6507Q(StickerInfo stickerInfo, View view) {
        zvf0.r("e_add_gif", "p_comment_picture_preview");
        FeedModule.m1140H().Ff(getContext(), stickerInfo);
    }

    /* JADX INFO: renamed from: T */
    public void m6508T() {
        hce controller = this.f4117a.getController();
        if (NullChecker.a(controller)) {
            controller.e();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m6509V(Picture picture, boolean z) {
        this.f4117a.setOriginalWidth(picture.size.width);
        this.f4117a.setOriginalHeight(picture.size.height);
        this.f4117a.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        this.f4118b.setVisibility(8);
        Picture.ImageUri imageUriAspectRatioBiggest = picture.aspectRatioBiggest();
        qib0.G.D0(this.f4117a, imageUriAspectRatioBiggest, new C2164a(imageUriAspectRatioBiggest), this.f4118b, "");
    }

    /* JADX INFO: renamed from: W */
    public void m6510W() {
        if (xdl0.O0(this.f4119c)) {
            zvf0.x("e_add_gif", "p_comment_picture_preview");
        }
    }

    /* JADX INFO: renamed from: k */
    public String m6511k() {
        return this.f4117a.k();
    }

    /* JADX INFO: renamed from: l */
    public ValueAnimator m6512l(ViewGroup viewGroup) {
        return this.f4117a.l(viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public ValueAnimator m6513n(ViewGroup viewGroup) {
        return this.f4117a.getZoomAnimationAttacher().H(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        f4115g = getMeasuredWidth();
        f4116h = getMeasuredHeight();
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f4117a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongPressListener(InterfaceC2165b interfaceC2165b) {
        this.f4121e = interfaceC2165b;
    }

    public void setOnTapListener(InterfaceC2166c interfaceC2166c) {
        this.f4122f = interfaceC2166c;
    }

    public void setOriginalHeight(float f) {
        this.f4117a.setOriginalHeight(f);
    }

    public void setOriginalWidth(float f) {
        this.f4117a.setOriginalWidth(f);
    }

    public void setPicture(final Picture picture) {
        xdl0.M(this.f4120d, true);
        xdl0.M(this.f4119c, false);
        xdl0.E0(this.f4119c, new View.OnClickListener() { // from class: l.ba70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6201a.m6506P(picture, view);
            }
        });
        m6509V(picture, false);
    }

    public void setStickerInfo(final StickerInfo stickerInfo) {
        exq.m9962b(this.f4117a, 10.0f);
        if (stickerInfo == null || vwb.J(stickerInfo.pictures)) {
            return;
        }
        m6509V(stickerInfo.pictures.get(0), false);
        xdl0.M(this.f4119c, true);
        xdl0.M(this.f4120d, true);
        xdl0.E0(this.f4119c, new View.OnClickListener() { // from class: l.ha70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8659a.m6507Q(stickerInfo, view);
            }
        });
    }

    public void setZoomAnimationKey(String str) {
        this.f4117a.setZoomAnimationKey(str);
    }

    public void setZoomEnable(boolean z) {
        this.f4118b.setZoomEnabled(z);
    }

    public PhotoAlbumPhotoPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public PhotoAlbumPhotoPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
