package com.p046p1.mobile.putong.feed.newui.preview.pageritem;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.StickerSourceInfo;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.C22585a;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;
import p149l.bkb0;
import p149l.exq;
import p149l.hce;
import p149l.ia70;
import p149l.ngm;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;
import p149l.ym2;
import p149l.zg50;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumPhotoPreviewView extends VFrame implements C22585a.b {

    /* JADX INFO: renamed from: g */
    public static int f42654g;

    /* JADX INFO: renamed from: h */
    public static int f42655h;

    /* JADX INFO: renamed from: a */
    public FeedPhotoDraweeView f42656a;

    /* JADX INFO: renamed from: b */
    public SubsamplingScaleImageView f42657b;

    /* JADX INFO: renamed from: c */
    public VLinear f42658c;

    /* JADX INFO: renamed from: d */
    public VImage f42659d;

    /* JADX INFO: renamed from: e */
    public InterfaceC11321b f42660e;

    /* JADX INFO: renamed from: f */
    public InterfaceC11322c f42661f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView$a */
    public class C11320a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f42662a;

        public C11320a(Picture.ImageUri imageUri) {
            this.f42662a = imageUri;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView = PhotoAlbumPhotoPreviewView.this;
            bkb0.m102300o0(photoAlbumPhotoPreviewView.f42656a, photoAlbumPhotoPreviewView.f42657b, str, ngmVar, animatable, this.f42662a, photoAlbumPhotoPreviewView.getImageContainerWidth(), PhotoAlbumPhotoPreviewView.this.getImageContainerHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView$b */
    public interface InterfaceC11321b {
        /* JADX INFO: renamed from: a */
        boolean mo65396a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView$c */
    public interface InterfaceC11322c {
        /* JADX INFO: renamed from: a */
        void mo62336a();
    }

    public PhotoAlbumPhotoPreviewView(@NonNull Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m65376K(View view, float f, float f2) {
        m65382S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ boolean m65377L(View view) {
        return m65381R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m65378M(View view) {
        m65382S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ boolean m65379N(View view) {
        return m65381R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m65380O(View view) {
        if (getContext() instanceof Act) {
            ((Act) getContext()).m50458m2();
        }
    }

    /* JADX INFO: renamed from: R */
    private boolean m65381R() {
        if (NullChecker.m81303a(this.f42660e)) {
            return this.f42660e.mo65396a();
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    private void m65382S() {
        if (NullChecker.m81303a(this.f42661f)) {
            this.f42661f.mo62336a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerHeight() {
        int i = f42655h;
        return i > 0 ? i : xdl0.m208408w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerWidth() {
        int i = f42654g;
        return i > 0 ? i : xdl0.m208412y0();
    }

    private void init() {
        m65389F(LayoutInflater.from(getContext()), this);
        this.f42656a.setOnViewTapListener(new zg50() { // from class: l.ca70
            @Override // p149l.zg50
            /* JADX INFO: renamed from: a */
            public final void mo105925a(View view, float f, float f2) {
                this.f80010a.m65376K(view, f, f2);
            }
        });
        this.f42656a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.da70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f85195a.m65377L(view);
            }
        });
        this.f42657b.setOnClickListener(new View.OnClickListener() { // from class: l.ea70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90176a.m65378M(view);
            }
        });
        this.f42657b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.fa70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f96573a.m65379N(view);
            }
        });
        xdl0.m208329E0(this.f42659d, new View.OnClickListener() { // from class: l.ga70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101637a.m65380O(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public View m65389F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ia70.m135136b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public void m65390G(Picture picture) {
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
        stickerInfoNew_.source = StickerSourceInfo.get("selfCollect");
        stickerInfoNew_.hash = picture.url;
        FeedModule.m60222H().mo30687Ff((Act) getContext(), stickerInfoNew_);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m65391P(Picture picture, View view) {
        m65390G(picture);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m65392Q(StickerInfo stickerInfo, View view) {
        zvf0.m220396r("e_add_gif", "p_comment_picture_preview");
        FeedModule.m60222H().mo30687Ff((Act) getContext(), stickerInfo);
    }

    /* JADX INFO: renamed from: T */
    public void m65393T() {
        hce controller = this.f42656a.getController();
        if (NullChecker.m81303a(controller)) {
            controller.mo129601e();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m65394V(Picture picture, boolean z) {
        this.f42656a.setOriginalWidth(picture.size.width);
        this.f42656a.setOriginalHeight(picture.size.height);
        this.f42656a.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        this.f42657b.setVisibility(8);
        Picture.ImageUri imageUriAspectRatioBiggest = picture.aspectRatioBiggest();
        qib0.f154691G.m102315D0(this.f42656a, imageUriAspectRatioBiggest, new C11320a(imageUriAspectRatioBiggest), this.f42657b, "");
    }

    /* JADX INFO: renamed from: W */
    public void m65395W() {
        if (xdl0.m208349O0(this.f42658c)) {
            zvf0.m220402x("e_add_gif", "p_comment_picture_preview");
        }
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: k */
    public String mo43946k() {
        return this.f42656a.mo43946k();
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo43947l(ViewGroup viewGroup) {
        return this.f42656a.mo43947l(viewGroup);
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo43948n(ViewGroup viewGroup) {
        return this.f42656a.getZoomAnimationAttacher().m223330H(viewGroup);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f42654g = getMeasuredWidth();
        f42655h = getMeasuredHeight();
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f42656a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongPressListener(InterfaceC11321b interfaceC11321b) {
        this.f42660e = interfaceC11321b;
    }

    public void setOnTapListener(InterfaceC11322c interfaceC11322c) {
        this.f42661f = interfaceC11322c;
    }

    public void setOriginalHeight(float f) {
        this.f42656a.setOriginalHeight(f);
    }

    public void setOriginalWidth(float f) {
        this.f42656a.setOriginalWidth(f);
    }

    public void setPicture(final Picture picture) {
        xdl0.m208344M(this.f42659d, true);
        xdl0.m208344M(this.f42658c, false);
        xdl0.m208329E0(this.f42658c, new View.OnClickListener() { // from class: l.ba70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74653a.m65391P(picture, view);
            }
        });
        m65394V(picture, false);
    }

    public void setStickerInfo(final StickerInfo stickerInfo) {
        exq.m118693b(this.f42656a, 10.0f);
        if (stickerInfo == null || vwb.m200296J(stickerInfo.pictures)) {
            return;
        }
        m65394V(stickerInfo.pictures.get(0), false);
        xdl0.m208344M(this.f42658c, true);
        xdl0.m208344M(this.f42659d, true);
        xdl0.m208329E0(this.f42658c, new View.OnClickListener() { // from class: l.ha70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106710a.m65392Q(stickerInfo, view);
            }
        });
    }

    public void setZoomAnimationKey(String str) {
        this.f42656a.setZoomAnimationKey(str);
    }

    public void setZoomEnable(boolean z) {
        this.f42657b.setZoomEnabled(z);
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
