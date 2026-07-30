package com.p051p1.mobile.putong.feed.newui.preview.pageritem;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.StickerSourceInfo;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.C22700a;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;
import p153l.bnl0;
import p153l.ezq;
import p153l.fn2;
import p153l.fp50;
import p153l.fsb0;
import p153l.i4g0;
import p153l.jyb;
import p153l.lde;
import p153l.oi70;
import p153l.qim;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumPhotoPreviewView extends VFrame implements C22700a.b {

    /* JADX INFO: renamed from: g */
    public static int f43502g;

    /* JADX INFO: renamed from: h */
    public static int f43503h;

    /* JADX INFO: renamed from: a */
    public FeedPhotoDraweeView f43504a;

    /* JADX INFO: renamed from: b */
    public SubsamplingScaleImageView f43505b;

    /* JADX INFO: renamed from: c */
    public VLinear f43506c;

    /* JADX INFO: renamed from: d */
    public VImage f43507d;

    /* JADX INFO: renamed from: e */
    public InterfaceC11484b f43508e;

    /* JADX INFO: renamed from: f */
    public InterfaceC11485c f43509f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView$a */
    public class C11483a extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f43510a;

        public C11483a(Picture.ImageUri imageUri) {
            this.f43510a = imageUri;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView = PhotoAlbumPhotoPreviewView.this;
            fsb0.m127084o0(photoAlbumPhotoPreviewView.f43504a, photoAlbumPhotoPreviewView.f43505b, str, qimVar, animatable, this.f43510a, photoAlbumPhotoPreviewView.getImageContainerWidth(), PhotoAlbumPhotoPreviewView.this.getImageContainerHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView$b */
    public interface InterfaceC11484b {
        /* JADX INFO: renamed from: a */
        boolean mo66579a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView$c */
    public interface InterfaceC11485c {
        /* JADX INFO: renamed from: a */
        void mo63519a();
    }

    public PhotoAlbumPhotoPreviewView(@NonNull Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m66559K(View view, float f, float f2) {
        m66565S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ boolean m66560L(View view) {
        return m66564R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m66561M(View view) {
        m66565S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ boolean m66562N(View view) {
        return m66564R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m66563O(View view) {
        if (getContext() instanceof Act) {
            ((Act) getContext()).m51642n2();
        }
    }

    /* JADX INFO: renamed from: R */
    private boolean m66564R() {
        if (NullChecker.m82486a(this.f43508e)) {
            return this.f43508e.mo66579a();
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    private void m66565S() {
        if (NullChecker.m82486a(this.f43509f)) {
            this.f43509f.mo63519a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerHeight() {
        int i = f43503h;
        return i > 0 ? i : bnl0.m105588w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerWidth() {
        int i = f43502g;
        return i > 0 ? i : bnl0.m105592y0();
    }

    private void init() {
        m66572F(LayoutInflater.from(getContext()), this);
        this.f43504a.setOnViewTapListener(new fp50() { // from class: l.ii70
            @Override // p153l.fp50
            /* JADX INFO: renamed from: a */
            public final void mo99079a(View view, float f, float f2) {
                this.f115058a.m66559K(view, f, f2);
            }
        });
        this.f43504a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ji70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f121048a.m66560L(view);
            }
        });
        this.f43505b.setOnClickListener(new View.OnClickListener() { // from class: l.ki70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126972a.m66561M(view);
            }
        });
        this.f43505b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.li70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f132191a.m66562N(view);
            }
        });
        bnl0.m105509E0(this.f43507d, new View.OnClickListener() { // from class: l.mi70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136933a.m66563O(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public View m66572F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oi70.m167772b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public void m66573G(Picture picture) {
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
        FeedModule.m61406H().mo31690Ff((Act) getContext(), stickerInfoNew_);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m66574P(Picture picture, View view) {
        m66573G(picture);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m66575Q(StickerInfo stickerInfo, View view) {
        i4g0.m138520r("e_add_gif", "p_comment_picture_preview");
        FeedModule.m61406H().mo31690Ff((Act) getContext(), stickerInfo);
    }

    /* JADX INFO: renamed from: T */
    public void m66576T() {
        lde controller = this.f43504a.getController();
        if (NullChecker.m82486a(controller)) {
            controller.mo108238e();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m66577V(Picture picture, boolean z) {
        this.f43504a.setOriginalWidth(picture.size.width);
        this.f43504a.setOriginalHeight(picture.size.height);
        this.f43504a.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        this.f43505b.setVisibility(8);
        Picture.ImageUri imageUriAspectRatioBiggest = picture.aspectRatioBiggest();
        uqb0.f180374G.m127099D0(this.f43504a, imageUriAspectRatioBiggest, new C11483a(imageUriAspectRatioBiggest), this.f43505b, "");
    }

    /* JADX INFO: renamed from: W */
    public void m66578W() {
        if (bnl0.m105529O0(this.f43506c)) {
            i4g0.m138526x("e_add_gif", "p_comment_picture_preview");
        }
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: k */
    public String mo45129k() {
        return this.f43504a.mo45129k();
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo45130l(ViewGroup viewGroup) {
        return this.f43504a.mo45130l(viewGroup);
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo45131n(ViewGroup viewGroup) {
        return this.f43504a.getZoomAnimationAttacher().m224576H(viewGroup);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f43502g = getMeasuredWidth();
        f43503h = getMeasuredHeight();
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f43504a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongPressListener(InterfaceC11484b interfaceC11484b) {
        this.f43508e = interfaceC11484b;
    }

    public void setOnTapListener(InterfaceC11485c interfaceC11485c) {
        this.f43509f = interfaceC11485c;
    }

    public void setOriginalHeight(float f) {
        this.f43504a.setOriginalHeight(f);
    }

    public void setOriginalWidth(float f) {
        this.f43504a.setOriginalWidth(f);
    }

    public void setPicture(final Picture picture) {
        bnl0.m105524M(this.f43507d, true);
        bnl0.m105524M(this.f43506c, false);
        bnl0.m105509E0(this.f43506c, new View.OnClickListener() { // from class: l.hi70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109992a.m66574P(picture, view);
            }
        });
        m66577V(picture, false);
    }

    public void setStickerInfo(final StickerInfo stickerInfo) {
        ezq.m123397b(this.f43504a, 10.0f);
        if (stickerInfo == null || jyb.m147479J(stickerInfo.pictures)) {
            return;
        }
        m66577V(stickerInfo.pictures.get(0), false);
        bnl0.m105524M(this.f43506c, true);
        bnl0.m105524M(this.f43507d, true);
        bnl0.m105509E0(this.f43506c, new View.OnClickListener() { // from class: l.ni70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142097a.m66575Q(stickerInfo, view);
            }
        });
    }

    public void setZoomAnimationKey(String str) {
        this.f43504a.setZoomAnimationKey(str);
    }

    public void setZoomEnable(boolean z) {
        this.f43505b.setZoomEnabled(z);
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
