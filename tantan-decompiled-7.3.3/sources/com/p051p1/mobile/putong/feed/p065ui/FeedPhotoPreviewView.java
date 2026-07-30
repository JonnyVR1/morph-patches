package com.p051p1.mobile.putong.feed.p065ui;

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
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.tantanapp.common.utils.NullChecker;
import p151v.C22700a;
import p151v.VFrame;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;
import p153l.bnl0;
import p153l.eoh;
import p153l.fn2;
import p153l.fp50;
import p153l.fsb0;
import p153l.ksg;
import p153l.qim;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPhotoPreviewView extends VFrame implements C22700a.b {

    /* JADX INFO: renamed from: e */
    public static int f44402e;

    /* JADX INFO: renamed from: f */
    public static int f44403f;

    /* JADX INFO: renamed from: a */
    public FeedPhotoDraweeView f44404a;

    /* JADX INFO: renamed from: b */
    public SubsamplingScaleImageView f44405b;

    /* JADX INFO: renamed from: c */
    public InterfaceC11559b f44406c;

    /* JADX INFO: renamed from: d */
    public InterfaceC11560c f44407d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.FeedPhotoPreviewView$a */
    public class C11558a extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f44408a;

        public C11558a(Picture.ImageUri imageUri) {
            this.f44408a = imageUri;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            FeedPhotoPreviewView feedPhotoPreviewView = FeedPhotoPreviewView.this;
            fsb0.m127084o0(feedPhotoPreviewView.f44404a, feedPhotoPreviewView.f44405b, str, qimVar, animatable, this.f44408a, feedPhotoPreviewView.getImageContainerWidth(), FeedPhotoPreviewView.this.getImageContainerHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.FeedPhotoPreviewView$b */
    public interface InterfaceC11559b {
        /* JADX INFO: renamed from: a */
        boolean mo67692a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.FeedPhotoPreviewView$c */
    public interface InterfaceC11560c {
        /* JADX INFO: renamed from: a */
        void mo67693a();
    }

    public FeedPhotoPreviewView(@NonNull Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m67678C(View view, float f, float f2) {
        m67683L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ boolean m67679E(View view) {
        return m67682K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m67680F(View view) {
        m67683L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ boolean m67681G(View view) {
        return m67682K();
    }

    /* JADX INFO: renamed from: K */
    private boolean m67682K() {
        if (NullChecker.m82486a(this.f44406c)) {
            return this.f44406c.mo67692a();
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    private void m67683L() {
        if (NullChecker.m82486a(this.f44407d)) {
            this.f44407d.mo67693a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerHeight() {
        int i = f44403f;
        return i > 0 ? i : bnl0.m105588w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerWidth() {
        int i = f44402e;
        return i > 0 ? i : bnl0.m105592y0();
    }

    private void init() {
        m67690B(LayoutInflater.from(getContext()), this);
        this.f44404a.setOnViewTapListener(new fp50() { // from class: l.aoh
            @Override // p153l.fp50
            /* JADX INFO: renamed from: a */
            public final void mo99079a(View view, float f, float f2) {
                this.f72453a.m67678C(view, f, f2);
            }
        });
        this.f44404a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.boh
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f77683a.m67679E(view);
            }
        });
        this.f44405b.setOnClickListener(new View.OnClickListener() { // from class: l.coh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82870a.m67680F(view);
            }
        });
        this.f44405b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.doh
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f89956a.m67681G(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public View m67690B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eoh.m121749b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M */
    public void m67691M(Picture picture, boolean z) {
        this.f44404a.setOriginalWidth(picture.size.width);
        this.f44404a.setOriginalHeight(picture.size.height);
        this.f44404a.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        this.f44405b.setVisibility(8);
        Picture.ImageUri imageUriAspectRatioBiggest = picture.aspectRatioBiggest();
        uqb0.f180374G.m127099D0(this.f44404a, imageUriAspectRatioBiggest, new C11558a(imageUriAspectRatioBiggest), this.f44405b, "");
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: k */
    public String mo45129k() {
        return this.f44404a.mo45129k();
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo45130l(ViewGroup viewGroup) {
        return this.f44404a.mo45130l(viewGroup);
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo45131n(ViewGroup viewGroup) {
        return this.f44404a.getZoomAnimationAttacher().m224576H(viewGroup);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f44402e = getMeasuredWidth();
        f44403f = getMeasuredHeight();
    }

    public void reset() {
        if (this.f44404a.getOriginalHeight() <= this.f44404a.getOriginalWidth() || this.f44404a.getOriginalHeight() / this.f44404a.getOriginalWidth() <= getImageContainerHeight() / getImageContainerWidth() || fsb0.m127082b0(getImageContainerWidth(), getImageContainerHeight())) {
            this.f44404a.setScale(1.0f);
        } else {
            float imageContainerWidth = getImageContainerWidth() / ((this.f44404a.getOriginalWidth() * getImageContainerHeight()) / this.f44404a.getOriginalHeight());
            FeedPhotoDraweeView feedPhotoDraweeView = this.f44404a;
            if (imageContainerWidth > feedPhotoDraweeView.getMaximumScale()) {
                imageContainerWidth = this.f44404a.getMaximumScale();
            }
            feedPhotoDraweeView.m224646v(imageContainerWidth, 0.0f, 0.0f, true);
        }
        if (ksg.m151223p0(this.f44404a.getOriginalWidth(), this.f44404a.getOriginalHeight())) {
            this.f44405b.m224692D0(getImageContainerWidth() / (this.f44404a.getOriginalWidth() <= 960.0f ? this.f44404a.getOriginalWidth() : 960.0f), new PointF(0.0f, 0.0f));
            this.f44405b.setVisibility(0);
        }
    }

    public void setOnLongPressListener(InterfaceC11559b interfaceC11559b) {
        this.f44406c = interfaceC11559b;
    }

    public void setOnTapListener(InterfaceC11560c interfaceC11560c) {
        this.f44407d = interfaceC11560c;
    }

    public void setOriginalHeight(float f) {
        this.f44404a.setOriginalHeight(f);
    }

    public void setOriginalWidth(float f) {
        this.f44404a.setOriginalWidth(f);
    }

    public void setPicture(Picture picture) {
        m67691M(picture, false);
    }

    public void setZoomAnimationKey(String str) {
        this.f44404a.setZoomAnimationKey(str);
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
