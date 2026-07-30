package com.p046p1.mobile.putong.core.p053ui;

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
import com.p046p1.mobile.putong.core.p053ui.mediapreview.gesture.CorePhotoDraweeView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import p147v.C22585a;
import p147v.VFrame;
import p147v.VText;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;
import p149l.bkb0;
import p149l.hce;
import p149l.mb70;
import p149l.ngm;
import p149l.o7r;
import p149l.qib0;
import p149l.xdl0;
import p149l.ym2;
import p149l.zg50;

/* JADX INFO: loaded from: classes6.dex */
public class PhotoPreviewView extends VFrame implements C22585a.b {

    /* JADX INFO: renamed from: h */
    public static int f28020h;

    /* JADX INFO: renamed from: i */
    public static int f28021i;

    /* JADX INFO: renamed from: a */
    public CorePhotoDraweeView f28022a;

    /* JADX INFO: renamed from: b */
    public SubsamplingScaleImageView f28023b;

    /* JADX INFO: renamed from: c */
    public View f28024c;

    /* JADX INFO: renamed from: d */
    public VText f28025d;

    /* JADX INFO: renamed from: e */
    public TextView f28026e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8262b f28027f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8263c f28028g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PhotoPreviewView$a */
    public class C8261a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Picture.ImageUri f28029a;

        public C8261a(Picture.ImageUri imageUri) {
            this.f28029a = imageUri;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            PhotoPreviewView photoPreviewView = PhotoPreviewView.this;
            bkb0.m102300o0(photoPreviewView.f28022a, photoPreviewView.f28023b, str, ngmVar, animatable, this.f28029a, photoPreviewView.getImageContainerWidth(), PhotoPreviewView.this.getImageContainerHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PhotoPreviewView$b */
    public interface InterfaceC8262b {
        /* JADX INFO: renamed from: a */
        boolean mo43949a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PhotoPreviewView$c */
    public interface InterfaceC8263c {
        /* JADX INFO: renamed from: a */
        void mo43950a();
    }

    public PhotoPreviewView(@NonNull Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m43930F(View view) {
        m43942L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerHeight() {
        int i = f28021i;
        return i > 0 ? i : xdl0.m208408w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageContainerWidth() {
        int i = f28020h;
        return i > 0 ? i : xdl0.m208412y0();
    }

    private void init() {
        m43937B(o7r.m163037a(getContext()), this);
        this.f28022a.setOnViewTapListener(new zg50() { // from class: l.db70
            @Override // p149l.zg50
            /* JADX INFO: renamed from: a */
            public final void mo105925a(View view, float f, float f2) {
                this.f85298a.m43938C(view, f, f2);
            }
        });
        this.f28022a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.fb70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f96699a.m43939E(view);
            }
        });
        this.f28023b.setOnClickListener(new View.OnClickListener() { // from class: l.hb70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106909a.m43930F(view);
            }
        });
        this.f28023b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jb70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f117163a.m43940G(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public View m43937B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mb70.m153864b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m43938C(View view, float f, float f2) {
        m43942L();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean m43939E(View view) {
        return m43941K();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean m43940G(View view) {
        return m43941K();
    }

    /* JADX INFO: renamed from: K */
    public final boolean m43941K() {
        if (NullChecker.m81303a(this.f28027f)) {
            return this.f28027f.mo43949a();
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final void m43942L() {
        if (NullChecker.m81303a(this.f28028g)) {
            this.f28028g.mo43950a();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m43943M() {
        hce controller = this.f28022a.getController();
        if (NullChecker.m81303a(controller)) {
            controller.mo129601e();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m43944N(Picture picture, boolean z) {
        this.f28022a.setOriginalWidth(picture.size.width);
        this.f28022a.setOriginalHeight(picture.size.height);
        this.f28022a.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        this.f28023b.setVisibility(8);
        Picture.ImageUri imageUriAspectRatioBiggest = picture.aspectRatioBiggest();
        if (z) {
            qib0.f154691G.m102331L0(this.f28022a, picture.url);
        } else {
            qib0.f154691G.m102315D0(this.f28022a, imageUriAspectRatioBiggest, new C8261a(imageUriAspectRatioBiggest), this.f28023b, "");
        }
    }

    /* JADX INFO: renamed from: O */
    public void m43945O(boolean z, boolean z2) {
        xdl0.m208344M(this.f28025d, z);
        if (z2) {
            xdl0.m208344M(this.f28026e, z);
        }
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: k */
    public String mo43946k() {
        return this.f28022a.mo43946k();
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo43947l(ViewGroup viewGroup) {
        return this.f28022a.mo43947l(viewGroup);
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo43948n(ViewGroup viewGroup) {
        return this.f28022a.mo43948n(viewGroup);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f28020h = getMeasuredWidth();
        f28021i = getMeasuredHeight();
    }

    public void reset() {
        if (this.f28022a.getOriginalHeight() <= this.f28022a.getOriginalWidth() || this.f28022a.getOriginalHeight() / this.f28022a.getOriginalWidth() <= xdl0.m208408w0() / xdl0.m208412y0()) {
            this.f28022a.setScale(1.0f);
        } else {
            float fM208412y0 = xdl0.m208412y0() / ((this.f28022a.getOriginalWidth() * xdl0.m208408w0()) / this.f28022a.getOriginalHeight());
            CorePhotoDraweeView corePhotoDraweeView = this.f28022a;
            if (fM208412y0 > corePhotoDraweeView.getMaximumScale()) {
                fM208412y0 = this.f28022a.getMaximumScale();
            }
            corePhotoDraweeView.m223400v(fM208412y0, 0.0f, 0.0f, true);
        }
        if (bkb0.m102299d0(this.f28022a)) {
            this.f28023b.m223446D0(xdl0.m208412y0() / (this.f28022a.getOriginalWidth() <= 960.0f ? this.f28022a.getOriginalWidth() : 960.0f), new PointF(0.0f, 0.0f));
            this.f28023b.setVisibility(0);
        }
    }

    public void setOnLongPressListener(InterfaceC8262b interfaceC8262b) {
        this.f28027f = interfaceC8262b;
    }

    public void setOnTapListener(InterfaceC8263c interfaceC8263c) {
        this.f28028g = interfaceC8263c;
    }

    public void setOriginalHeight(float f) {
        this.f28022a.setOriginalHeight(f);
    }

    public void setOriginalWidth(float f) {
        this.f28022a.setOriginalWidth(f);
    }

    public void setPictureZoomAnimationKey(String str) {
        this.f28022a.setZoomAnimationKey(str);
    }

    public void setReplayClick(View.OnClickListener onClickListener) {
        this.f28026e.setOnClickListener(onClickListener);
    }

    public void setReplayVisibility(int i) {
        this.f28026e.setVisibility(i);
    }

    public void setText(String str) {
        this.f28025d.setText(str);
    }

    public void setZoomAnimationKey(String str) {
        this.f28022a.setZoomAnimationKey(str);
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
