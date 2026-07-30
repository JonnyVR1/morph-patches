package com.p046p1.mobile.putong.feed.p060ui;

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
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.tantanapp.common.utils.NullChecker;
import p147v.C22585a;
import p147v.VFrame;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;
import p149l.bkb0;
import p149l.ngm;
import p149l.pmh;
import p149l.qib0;
import p149l.vqg;
import p149l.xdl0;
import p149l.ym2;
import p149l.zg50;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPhotoPreviewView extends VFrame implements C22585a.b {

    /* JADX INFO: renamed from: e */
    public static int f43554e;

    /* JADX INFO: renamed from: f */
    public static int f43555f;

    /* JADX INFO: renamed from: a */
    public FeedPhotoDraweeView f43556a;

    /* JADX INFO: renamed from: b */
    public SubsamplingScaleImageView f43557b;

    /* JADX INFO: renamed from: c */
    public InterfaceC11396b f43558c;

    /* JADX INFO: renamed from: d */
    public InterfaceC11397c f43559d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.FeedPhotoPreviewView$a */
    public class C11395a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f43560a;

        public C11395a(Picture.ImageUri imageUri) {
            this.f43560a = imageUri;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            FeedPhotoPreviewView feedPhotoPreviewView = FeedPhotoPreviewView.this;
            bkb0.m102300o0(feedPhotoPreviewView.f43556a, feedPhotoPreviewView.f43557b, str, ngmVar, animatable, this.f43560a, feedPhotoPreviewView.getImageContainerWidth(), FeedPhotoPreviewView.this.getImageContainerHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.FeedPhotoPreviewView$b */
    public interface InterfaceC11396b {
        /* JADX INFO: renamed from: a */
        boolean mo66509a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.FeedPhotoPreviewView$c */
    public interface InterfaceC11397c {
        /* JADX INFO: renamed from: a */
        void mo66510a();
    }

    public FeedPhotoPreviewView(@NonNull Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m66495C(View view, float f, float f2) {
        m66500L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ boolean m66496E(View view) {
        return m66499K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m66497F(View view) {
        m66500L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ boolean m66498G(View view) {
        return m66499K();
    }

    /* JADX INFO: renamed from: K */
    private boolean m66499K() {
        if (NullChecker.m81303a(this.f43558c)) {
            return this.f43558c.mo66509a();
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    private void m66500L() {
        if (NullChecker.m81303a(this.f43559d)) {
            this.f43559d.mo66510a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerHeight() {
        int i = f43555f;
        return i > 0 ? i : xdl0.m208408w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerWidth() {
        int i = f43554e;
        return i > 0 ? i : xdl0.m208412y0();
    }

    private void init() {
        m66507B(LayoutInflater.from(getContext()), this);
        this.f43556a.setOnViewTapListener(new zg50() { // from class: l.lmh
            @Override // p149l.zg50
            /* JADX INFO: renamed from: a */
            public final void mo105925a(View view, float f, float f2) {
                this.f128796a.m66495C(view, f, f2);
            }
        });
        this.f43556a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.mmh
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f134669a.m66496E(view);
            }
        });
        this.f43557b.setOnClickListener(new View.OnClickListener() { // from class: l.nmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139628a.m66497F(view);
            }
        });
        this.f43557b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.omh
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f144650a.m66498G(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public View m66507B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pmh.m170333b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M */
    public void m66508M(Picture picture, boolean z) {
        this.f43556a.setOriginalWidth(picture.size.width);
        this.f43556a.setOriginalHeight(picture.size.height);
        this.f43556a.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        this.f43557b.setVisibility(8);
        Picture.ImageUri imageUriAspectRatioBiggest = picture.aspectRatioBiggest();
        qib0.f154691G.m102315D0(this.f43556a, imageUriAspectRatioBiggest, new C11395a(imageUriAspectRatioBiggest), this.f43557b, "");
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: k */
    public String mo43946k() {
        return this.f43556a.mo43946k();
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo43947l(ViewGroup viewGroup) {
        return this.f43556a.mo43947l(viewGroup);
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo43948n(ViewGroup viewGroup) {
        return this.f43556a.getZoomAnimationAttacher().m223330H(viewGroup);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f43554e = getMeasuredWidth();
        f43555f = getMeasuredHeight();
    }

    public void reset() {
        if (this.f43556a.getOriginalHeight() <= this.f43556a.getOriginalWidth() || this.f43556a.getOriginalHeight() / this.f43556a.getOriginalWidth() <= getImageContainerHeight() / getImageContainerWidth() || bkb0.m102298b0(getImageContainerWidth(), getImageContainerHeight())) {
            this.f43556a.setScale(1.0f);
        } else {
            float imageContainerWidth = getImageContainerWidth() / ((this.f43556a.getOriginalWidth() * getImageContainerHeight()) / this.f43556a.getOriginalHeight());
            FeedPhotoDraweeView feedPhotoDraweeView = this.f43556a;
            if (imageContainerWidth > feedPhotoDraweeView.getMaximumScale()) {
                imageContainerWidth = this.f43556a.getMaximumScale();
            }
            feedPhotoDraweeView.m223400v(imageContainerWidth, 0.0f, 0.0f, true);
        }
        if (vqg.m199564p0(this.f43556a.getOriginalWidth(), this.f43556a.getOriginalHeight())) {
            this.f43557b.m223446D0(getImageContainerWidth() / (this.f43556a.getOriginalWidth() <= 960.0f ? this.f43556a.getOriginalWidth() : 960.0f), new PointF(0.0f, 0.0f));
            this.f43557b.setVisibility(0);
        }
    }

    public void setOnLongPressListener(InterfaceC11396b interfaceC11396b) {
        this.f43558c = interfaceC11396b;
    }

    public void setOnTapListener(InterfaceC11397c interfaceC11397c) {
        this.f43559d = interfaceC11397c;
    }

    public void setOriginalHeight(float f) {
        this.f43556a.setOriginalHeight(f);
    }

    public void setOriginalWidth(float f) {
        this.f43556a.setOriginalWidth(f);
    }

    public void setPicture(Picture picture) {
        m66508M(picture, false);
    }

    public void setZoomAnimationKey(String str) {
        this.f43556a.setZoomAnimationKey(str);
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
