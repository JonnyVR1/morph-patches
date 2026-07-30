package com.p051p1.mobile.putong.core.p058ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.gesture.CorePhotoDraweeView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import p151v.C22700a;
import p151v.VFrame;
import p151v.VText;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;
import p153l.bnl0;
import p153l.fn2;
import p153l.fp50;
import p153l.fsb0;
import p153l.lde;
import p153l.p9r;
import p153l.qim;
import p153l.sj70;
import p153l.uqb0;

/* JADX INFO: loaded from: classes6.dex */
public class PhotoPreviewView extends VFrame implements C22700a.b {

    /* JADX INFO: renamed from: h */
    public static int f28868h;

    /* JADX INFO: renamed from: i */
    public static int f28869i;

    /* JADX INFO: renamed from: a */
    public CorePhotoDraweeView f28870a;

    /* JADX INFO: renamed from: b */
    public SubsamplingScaleImageView f28871b;

    /* JADX INFO: renamed from: c */
    public View f28872c;

    /* JADX INFO: renamed from: d */
    public VText f28873d;

    /* JADX INFO: renamed from: e */
    public TextView f28874e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8425b f28875f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8426c f28876g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PhotoPreviewView$a */
    public class C8424a extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f28877a;

        public C8424a(Picture.ImageUri imageUri) {
            this.f28877a = imageUri;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            PhotoPreviewView photoPreviewView = PhotoPreviewView.this;
            fsb0.m127084o0(photoPreviewView.f28870a, photoPreviewView.f28871b, str, qimVar, animatable, this.f28877a, photoPreviewView.getImageContainerWidth(), PhotoPreviewView.this.getImageContainerHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PhotoPreviewView$b */
    public interface InterfaceC8425b {
        /* JADX INFO: renamed from: a */
        boolean mo45132a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PhotoPreviewView$c */
    public interface InterfaceC8426c {
        /* JADX INFO: renamed from: a */
        void mo45133a();
    }

    public PhotoPreviewView(@NonNull Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m45113F(View view) {
        m45125L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerHeight() {
        int i = f28869i;
        return i > 0 ? i : bnl0.m105588w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerWidth() {
        int i = f28868h;
        return i > 0 ? i : bnl0.m105592y0();
    }

    private void init() {
        m45120B(p9r.m171370a(getContext()), this);
        this.f28870a.setOnViewTapListener(new fp50() { // from class: l.jj70
            @Override // p153l.fp50
            /* JADX INFO: renamed from: a */
            public final void mo99079a(View view, float f, float f2) {
                this.f121150a.m45121C(view, f, f2);
            }
        });
        this.f28870a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.lj70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f132312a.m45122E(view);
            }
        });
        this.f28871b.setOnClickListener(new View.OnClickListener() { // from class: l.nj70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142279a.m45113F(view);
            }
        });
        this.f28871b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.pj70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f152672a.m45123G(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public View m45120B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sj70.m186063b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m45121C(View view, float f, float f2) {
        m45125L();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean m45122E(View view) {
        return m45124K();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean m45123G(View view) {
        return m45124K();
    }

    /* JADX INFO: renamed from: K */
    public final boolean m45124K() {
        if (NullChecker.m82486a(this.f28875f)) {
            return this.f28875f.mo45132a();
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final void m45125L() {
        if (NullChecker.m82486a(this.f28876g)) {
            this.f28876g.mo45133a();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m45126M() {
        lde controller = this.f28870a.getController();
        if (NullChecker.m82486a(controller)) {
            controller.mo108238e();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m45127N(Picture picture, boolean z) {
        this.f28870a.setOriginalWidth(picture.size.width);
        this.f28870a.setOriginalHeight(picture.size.height);
        this.f28870a.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        this.f28871b.setVisibility(8);
        Picture.ImageUri imageUriAspectRatioBiggest = picture.aspectRatioBiggest();
        if (z) {
            uqb0.f180374G.m127115L0(this.f28870a, picture.url);
        } else {
            uqb0.f180374G.m127099D0(this.f28870a, imageUriAspectRatioBiggest, new C8424a(imageUriAspectRatioBiggest), this.f28871b, "");
        }
    }

    /* JADX INFO: renamed from: O */
    public void m45128O(boolean z, boolean z2) {
        bnl0.m105524M(this.f28873d, z);
        if (z2) {
            bnl0.m105524M(this.f28874e, z);
        }
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: k */
    public String mo45129k() {
        return this.f28870a.mo45129k();
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo45130l(ViewGroup viewGroup) {
        return this.f28870a.mo45130l(viewGroup);
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo45131n(ViewGroup viewGroup) {
        return this.f28870a.mo45131n(viewGroup);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f28868h = getMeasuredWidth();
        f28869i = getMeasuredHeight();
    }

    public void reset() {
        if (this.f28870a.getOriginalHeight() <= this.f28870a.getOriginalWidth() || this.f28870a.getOriginalHeight() / this.f28870a.getOriginalWidth() <= bnl0.m105588w0() / bnl0.m105592y0()) {
            this.f28870a.setScale(1.0f);
        } else {
            float fM105592y0 = bnl0.m105592y0() / ((this.f28870a.getOriginalWidth() * bnl0.m105588w0()) / this.f28870a.getOriginalHeight());
            CorePhotoDraweeView corePhotoDraweeView = this.f28870a;
            if (fM105592y0 > corePhotoDraweeView.getMaximumScale()) {
                fM105592y0 = this.f28870a.getMaximumScale();
            }
            corePhotoDraweeView.m224646v(fM105592y0, 0.0f, 0.0f, true);
        }
        if (fsb0.m127083d0(this.f28870a)) {
            this.f28871b.m224692D0(bnl0.m105592y0() / (this.f28870a.getOriginalWidth() <= 960.0f ? this.f28870a.getOriginalWidth() : 960.0f), new PointF(0.0f, 0.0f));
            this.f28871b.setVisibility(0);
        }
    }

    public void setOnLongPressListener(InterfaceC8425b interfaceC8425b) {
        this.f28875f = interfaceC8425b;
    }

    public void setOnTapListener(InterfaceC8426c interfaceC8426c) {
        this.f28876g = interfaceC8426c;
    }

    public void setOriginalHeight(float f) {
        this.f28870a.setOriginalHeight(f);
    }

    public void setOriginalWidth(float f) {
        this.f28870a.setOriginalWidth(f);
    }

    public void setPictureZoomAnimationKey(String str) {
        this.f28870a.setZoomAnimationKey(str);
    }

    public void setReplayClick(View.OnClickListener onClickListener) {
        this.f28874e.setOnClickListener(onClickListener);
    }

    public void setReplayVisibility(int i) {
        this.f28874e.setVisibility(i);
    }

    public void setText(String str) {
        this.f28873d.setText(str);
    }

    public void setZoomAnimationKey(String str) {
        this.f28870a.setZoomAnimationKey(str);
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
