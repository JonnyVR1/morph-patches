package com.p046p1.mobile.android.p048ui.cropiwa;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.p048ui.cropiwa.image.CropIwaResultReceiver;
import com.tantanapp.common.utils.CrashHelper;
import p149l.cub;
import p149l.d30;
import p149l.fub;
import p149l.iub;
import p149l.jrv;
import p149l.jub;
import p149l.nub;
import p149l.pe50;
import p149l.qkq0;
import p149l.qub;
import p149l.zu5;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CropIwaImageView f15810a;

    /* JADX INFO: renamed from: b */
    public CropIwaOverlayView f15811b;

    /* JADX INFO: renamed from: c */
    public nub f15812c;

    /* JADX INFO: renamed from: d */
    public iub f15813d;

    /* JADX INFO: renamed from: e */
    public CropIwaImageView.C4355b f15814e;

    /* JADX INFO: renamed from: f */
    public Uri f15815f;

    /* JADX INFO: renamed from: g */
    public jrv f15816g;

    /* JADX INFO: renamed from: h */
    public InterfaceC4362d f15817h;

    /* JADX INFO: renamed from: i */
    public InterfaceC4363e f15818i;

    /* JADX INFO: renamed from: j */
    public InterfaceC4361c f15819j;

    /* JADX INFO: renamed from: k */
    public CropIwaResultReceiver f15820k;

    /* JADX INFO: renamed from: l */
    public fub.InterfaceC16922a f15821l;

    /* JADX INFO: renamed from: m */
    public boolean f15822m;

    /* JADX INFO: renamed from: n */
    public int f15823n;

    /* JADX INFO: renamed from: o */
    public d30 f15824o;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$a */
    public class C4359a implements fub.InterfaceC16922a {
        public C4359a() {
        }

        @Override // p149l.fub.InterfaceC16922a
        /* JADX INFO: renamed from: a */
        public void mo21044a(Uri uri, Bitmap bitmap) {
            CropIwaView.this.setImage(bitmap);
            CropIwaView.this.f15821l.mo21044a(uri, bitmap);
        }

        @Override // p149l.fub.InterfaceC16922a
        /* JADX INFO: renamed from: b */
        public void mo21045b(Throwable th) {
            jub.m143263b("CropIwa Image loading from [" + CropIwaView.this.f15815f + "] failed", th);
            CropIwaView.this.f15811b.setDrawOverlay(false);
            CropIwaView.this.f15821l.mo21045b(th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$b */
    public class C4360b implements CropIwaResultReceiver.InterfaceC4368a {
        public C4360b() {
        }

        @Override // com.p046p1.mobile.android.p048ui.cropiwa.image.CropIwaResultReceiver.InterfaceC4368a
        /* JADX INFO: renamed from: a */
        public void mo21046a() {
            CrashHelper.m81296c(new Exception("pic crop error"));
            if (CropIwaView.this.f15818i != null) {
                CropIwaView.this.f15818i.mo21050a();
            }
        }

        @Override // com.p046p1.mobile.android.p048ui.cropiwa.image.CropIwaResultReceiver.InterfaceC4368a
        /* JADX INFO: renamed from: b */
        public void mo21047b(Uri uri) {
            if (CropIwaView.this.f15819j != null) {
                CropIwaView.this.f15819j.mo21049a(uri);
            }
        }

        @Override // com.p046p1.mobile.android.p048ui.cropiwa.image.CropIwaResultReceiver.InterfaceC4368a
        /* JADX INFO: renamed from: c */
        public void mo21048c(Throwable th) {
            if (CropIwaView.this.f15817h != null) {
                CropIwaView.this.f15817h.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$c */
    public interface InterfaceC4361c {
        /* JADX INFO: renamed from: a */
        void mo21049a(Uri uri);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$d */
    public interface InterfaceC4362d {
        void onError(Throwable th);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$e */
    public interface InterfaceC4363e {
        /* JADX INFO: renamed from: a */
        void mo21050a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$f */
    public class C4364f implements zu5 {
        public C4364f() {
        }

        @Override // p149l.zu5
        /* JADX INFO: renamed from: a */
        public void mo20918a() {
            if (m21051b()) {
                CropIwaView.this.f15812c.m161479w(CropIwaView.this.f15811b);
                boolean zM21011f = CropIwaView.this.f15811b.m21011f();
                CropIwaView cropIwaView = CropIwaView.this;
                cropIwaView.removeView(cropIwaView.f15811b);
                CropIwaView.this.m21035q();
                CropIwaView.this.f15811b.setDrawOverlay(zM21011f);
                CropIwaView.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m21051b() {
            return CropIwaView.this.f15812c.m161473q() != (CropIwaView.this.f15811b instanceof CropIwaDynamicOverlayView);
        }
    }

    public CropIwaView(Context context) {
        super(context);
        m21033o(null);
    }

    public RectF getCropRect() {
        return this.f15811b.getCropRect();
    }

    public RectF getImageRect() {
        return this.f15810a.m20981u();
    }

    public int getImageViewRotation() {
        return this.f15823n;
    }

    public Matrix getIwaImageMatrix() {
        return this.f15810a.getImageMatrix();
    }

    @Override // android.view.View
    public void invalidate() {
        this.f15810a.invalidate();
        this.f15811b.invalidate();
    }

    /* JADX INFO: renamed from: l */
    public iub m21030l() {
        return this.f15813d;
    }

    /* JADX INFO: renamed from: m */
    public nub m21031m() {
        return this.f15812c;
    }

    /* JADX INFO: renamed from: n */
    public void m21032n(qub qubVar) {
        if (this.f15822m) {
            return;
        }
        fub.m123168h().m123173b(getContext(), cub.m108741b(this.f15810a.m20981u(), this.f15810a.m20981u(), this.f15811b.getCropRect()), this.f15812c.m161466j().mo21076g(), this.f15815f, qubVar, this);
    }

    /* JADX INFO: renamed from: o */
    public final void m21033o(AttributeSet attributeSet) {
        this.f15813d = iub.m138366d(getContext(), attributeSet);
        m21034p();
        nub nubVarM161441d = nub.m161441d(getContext(), attributeSet);
        this.f15812c = nubVarM161441d;
        nubVarM161441d.m161459a(new C4364f());
        m21035q();
        this.f15813d.m138367a(new zu5() { // from class: l.tub
            @Override // p149l.zu5
            /* JADX INFO: renamed from: a */
            public final void mo20918a() {
                this.f172161a.m21037s();
            }
        });
        CropIwaResultReceiver cropIwaResultReceiver = new CropIwaResultReceiver();
        this.f15820k = cropIwaResultReceiver;
        cropIwaResultReceiver.register(getContext());
        this.f15820k.setListener(new C4360b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m21043y();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return (this.f15811b.mo20922g() || this.f15811b.mo20921e() || this.f15811b.m21013i()) ? false : true;
        }
        this.f15814e.m20987a(motionEvent);
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.f15810a.measure(i, i2);
        this.f15811b.setImageWidth(this.f15810a.m20985y());
        this.f15811b.setImageHeight(this.f15810a.m20984x());
        this.f15811b.measure(this.f15810a.getMeasuredWidthAndState(), this.f15810a.getMeasuredHeightAndState());
        this.f15810a.m20962G();
        setMeasuredDimension(this.f15810a.getMeasuredWidthAndState(), this.f15810a.getMeasuredHeightAndState());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f15816g != null) {
            if (this.f15813d.m138370f() * this.f15813d.m138371g() == 0 || this.f15813d.m138371g() > i || this.f15813d.m138370f() > i2 || this.f15813d.m138370f() * this.f15813d.m138371g() > i * i2) {
                this.f15816g.m142975a(i, i2);
            } else {
                this.f15816g.m142975a(this.f15813d.m138371g(), this.f15813d.m138370f());
            }
            this.f15816g.m142976b(getContext());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        d30 d30Var = this.f15824o;
        if (d30Var != null) {
            d30Var.call();
        }
        this.f15814e.m20988b(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m21034p() {
        if (this.f15813d == null) {
            qkq0.m175383a("imageConfig must be initialized before calling this method");
            return;
        }
        CropIwaImageView cropIwaImageView = new CropIwaImageView(getContext(), this.f15813d);
        this.f15810a = cropIwaImageView;
        cropIwaImageView.setBackgroundColor(this.f15813d.m138369e());
        this.f15814e = this.f15810a.m20982v();
        addView(this.f15810a);
    }

    /* JADX INFO: renamed from: q */
    public final void m21035q() {
        nub nubVar;
        if (this.f15810a == null || (nubVar = this.f15812c) == null) {
            qkq0.m175383a("imageView and overlayConfig must be initialized before calling this method");
            return;
        }
        if (nubVar.m161473q()) {
            this.f15811b = new CropIwaDynamicOverlayView(getContext(), this.f15812c);
        } else if (this.f15812c.m161478v()) {
            this.f15811b = new CropIwa43OverlayView(getContext(), this.f15812c);
        } else if (this.f15812c.m161474r()) {
            this.f15811b = new CropIwaNewProfileOverlayView(getContext(), this.f15812c);
        } else if (this.f15812c.m161476t()) {
            this.f15811b = new CropIwaDynamicRatioOverlayView(getContext(), this.f15812c);
        } else if (this.f15812c.m161475s()) {
            this.f15811b = new CropIwaNewUIDynamicOverlayView(getContext(), this.f15812c);
        } else if (this.f15812c.m161477u()) {
            this.f15811b = new CropIwaKanKanOverlayView(getContext(), this.f15812c);
        } else {
            this.f15811b = new CropIwaOverlayView(getContext(), this.f15812c);
        }
        this.f15811b.setNewBoundsListener(this.f15810a);
        this.f15811b.setOnTouchActionListener(new d30() { // from class: l.uub
            @Override // p149l.d30
            public final void call() {
                this.f178335a.m21038t();
            }
        });
        this.f15811b.setOnMovePartImageCenterListener(new pe50() { // from class: l.vub
            @Override // p149l.pe50
            /* JADX INFO: renamed from: a */
            public final void mo168503a(RectF rectF) {
                this.f183053a.m21039u(rectF);
            }
        });
        this.f15810a.m20969N(this.f15811b);
        this.f15810a.m20971P(this.f15812c.m161476t());
        addView(this.f15811b);
    }

    /* JADX INFO: renamed from: r */
    public boolean m21036r() {
        return !this.f15810a.m20957B();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m21037s() {
        this.f15811b.setMaxScale(this.f15813d.m138373i());
    }

    public void setCropSaveCompleteListener(InterfaceC4361c interfaceC4361c) {
        this.f15819j = interfaceC4361c;
    }

    public void setErrorListener(InterfaceC4362d interfaceC4362d) {
        this.f15817h = interfaceC4362d;
    }

    public void setImage(Bitmap bitmap) {
        if (bitmap.getWidth() >= 4096 || bitmap.getHeight() >= 4096) {
            setLayerType(1, null);
        }
        this.f15810a.setImageBitmap(bitmap);
        this.f15811b.setDrawOverlay(true);
    }

    public void setImageLoadListener(fub.InterfaceC16922a interfaceC16922a) {
        this.f15821l = interfaceC16922a;
    }

    public void setImageMatrix1(Matrix matrix) {
        this.f15810a.m20970O(matrix);
    }

    public void setImageUri(Uri uri) {
        this.f15815f = uri;
        jrv jrvVar = new jrv(uri, new C4359a());
        this.f15816g = jrvVar;
        jrvVar.m142975a(this.f15813d.m138371g(), this.f15813d.m138370f());
        this.f15816g.m142976b(getContext());
    }

    public void setInvalidCroppingListener(InterfaceC4363e interfaceC4363e) {
        this.f15818i = interfaceC4363e;
    }

    public void setTouchAction(d30 d30Var) {
        this.f15824o = d30Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m21038t() {
        d30 d30Var = this.f15824o;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m21039u(RectF rectF) {
        this.f15810a.m20961F(rectF);
        d30 d30Var = this.f15824o;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m21040v() {
        this.f15810a.m20960E();
    }

    /* JADX INFO: renamed from: w */
    public void m21041w() {
        this.f15810a.getImageMatrix().reset();
        this.f15823n = 0;
    }

    /* JADX INFO: renamed from: x */
    public void m21042x() {
        this.f15823n -= 90;
        this.f15810a.m20966K(-90.0f);
    }

    /* JADX INFO: renamed from: y */
    public void m21043y() {
        if (this.f15815f != null) {
            fub fubVarM123168h = fub.m123168h();
            fubVarM123168h.m123183t(this.f15815f);
            fubVarM123168h.m123180p(this.f15815f);
            this.f15815f = null;
        }
        CropIwaResultReceiver cropIwaResultReceiver = this.f15820k;
        if (cropIwaResultReceiver != null) {
            cropIwaResultReceiver.unregister(getContext());
            this.f15820k = null;
        }
        this.f15822m = true;
    }

    public CropIwaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m21033o(attributeSet);
    }

    public CropIwaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m21033o(attributeSet);
    }

    @TargetApi(21)
    public CropIwaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m21033o(attributeSet);
    }
}
