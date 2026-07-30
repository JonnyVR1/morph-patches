package com.p000p1.mobile.putong.feed.p005ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.tantanapp.common.utils.NullChecker;
import l.bkb0;
import l.ngm;
import l.qib0;
import l.xdl0;
import l.ym2;
import l.zg50;
import p007l.pmh;
import p007l.vqg;
import v.VFrame;
import v.a;
import v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPhotoPreviewView extends VFrame implements a.b {

    /* JADX INFO: renamed from: e */
    public static int f5015e;

    /* JADX INFO: renamed from: f */
    public static int f5016f;

    /* JADX INFO: renamed from: a */
    public FeedPhotoDraweeView f5017a;

    /* JADX INFO: renamed from: b */
    public SubsamplingScaleImageView f5018b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2240b f5019c;

    /* JADX INFO: renamed from: d */
    public InterfaceC2241c f5020d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.FeedPhotoPreviewView$a */
    public class C2239a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f5021a;

        public C2239a(Picture.ImageUri imageUri) {
            this.f5021a = imageUri;
        }

        /* JADX INFO: renamed from: h */
        public void m7683h(String str, ngm ngmVar, Animatable animatable) {
            FeedPhotoPreviewView feedPhotoPreviewView = FeedPhotoPreviewView.this;
            bkb0.o0(feedPhotoPreviewView.f5017a, feedPhotoPreviewView.f5018b, str, ngmVar, animatable, this.f5021a, feedPhotoPreviewView.getImageContainerWidth(), FeedPhotoPreviewView.this.getImageContainerHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.FeedPhotoPreviewView$b */
    public interface InterfaceC2240b {
        /* JADX INFO: renamed from: a */
        boolean mo7684a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.FeedPhotoPreviewView$c */
    public interface InterfaceC2241c {
        /* JADX INFO: renamed from: a */
        void mo7685a();
    }

    public FeedPhotoPreviewView(@NonNull Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m7666C(View view, float f, float f2) {
        m7671L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ boolean m7667E(View view) {
        return m7670K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m7668F(View view) {
        m7671L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ boolean m7669G(View view) {
        return m7670K();
    }

    /* JADX INFO: renamed from: K */
    private boolean m7670K() {
        if (NullChecker.a(this.f5019c)) {
            return this.f5019c.mo7684a();
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    private void m7671L() {
        if (NullChecker.a(this.f5020d)) {
            this.f5020d.mo7685a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerHeight() {
        int i = f5016f;
        return i > 0 ? i : xdl0.w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerWidth() {
        int i = f5015e;
        return i > 0 ? i : xdl0.y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        m7678B(LayoutInflater.from(getContext()), this);
        this.f5017a.setOnViewTapListener(new zg50() { // from class: l.lmh
            /* JADX INFO: renamed from: a */
            public final void m11652a(View view, float f, float f2) {
                this.f10071a.m7666C(view, f, f2);
            }
        });
        this.f5017a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.mmh
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f10516a.m7667E(view);
            }
        });
        this.f5018b.setOnClickListener(new View.OnClickListener() { // from class: l.nmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10835a.m7668F(view);
            }
        });
        this.f5018b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.omh
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f11536a.m7669G(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public View m7678B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pmh.m13077b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M */
    public void m7679M(Picture picture, boolean z) {
        this.f5017a.setOriginalWidth(picture.size.width);
        this.f5017a.setOriginalHeight(picture.size.height);
        this.f5017a.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        this.f5018b.setVisibility(8);
        Picture.ImageUri imageUriAspectRatioBiggest = picture.aspectRatioBiggest();
        qib0.G.D0(this.f5017a, imageUriAspectRatioBiggest, new C2239a(imageUriAspectRatioBiggest), this.f5018b, "");
    }

    /* JADX INFO: renamed from: k */
    public String m7680k() {
        return this.f5017a.k();
    }

    /* JADX INFO: renamed from: l */
    public ValueAnimator m7681l(ViewGroup viewGroup) {
        return this.f5017a.l(viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public ValueAnimator m7682n(ViewGroup viewGroup) {
        return this.f5017a.getZoomAnimationAttacher().H(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        f5015e = getMeasuredWidth();
        f5016f = getMeasuredHeight();
    }

    public void reset() {
        if (this.f5017a.getOriginalHeight() <= this.f5017a.getOriginalWidth() || this.f5017a.getOriginalHeight() / this.f5017a.getOriginalWidth() <= getImageContainerHeight() / getImageContainerWidth() || bkb0.b0(getImageContainerWidth(), getImageContainerHeight())) {
            this.f5017a.setScale(1.0f);
        } else {
            float imageContainerWidth = getImageContainerWidth() / ((this.f5017a.getOriginalWidth() * getImageContainerHeight()) / this.f5017a.getOriginalHeight());
            FeedPhotoDraweeView feedPhotoDraweeView = this.f5017a;
            if (imageContainerWidth > feedPhotoDraweeView.getMaximumScale()) {
                imageContainerWidth = this.f5017a.getMaximumScale();
            }
            feedPhotoDraweeView.v(imageContainerWidth, 0.0f, 0.0f, true);
        }
        if (vqg.m15534p0(this.f5017a.getOriginalWidth(), this.f5017a.getOriginalHeight())) {
            this.f5018b.D0(getImageContainerWidth() / (this.f5017a.getOriginalWidth() <= 960.0f ? this.f5017a.getOriginalWidth() : 960.0f), new PointF(0.0f, 0.0f));
            this.f5018b.setVisibility(0);
        }
    }

    public void setOnLongPressListener(InterfaceC2240b interfaceC2240b) {
        this.f5019c = interfaceC2240b;
    }

    public void setOnTapListener(InterfaceC2241c interfaceC2241c) {
        this.f5020d = interfaceC2241c;
    }

    public void setOriginalHeight(float f) {
        this.f5017a.setOriginalHeight(f);
    }

    public void setOriginalWidth(float f) {
        this.f5017a.setOriginalWidth(f);
    }

    public void setPicture(Picture picture) {
        m7679M(picture, false);
    }

    public void setZoomAnimationKey(String str) {
        this.f5017a.setZoomAnimationKey(str);
    }

    public FeedPhotoPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public FeedPhotoPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
