package com.p051p1.mobile.android.p053ui.cropiwa;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.p053ui.cropiwa.image.CropIwaResultReceiver;
import com.tantanapp.common.utils.CrashHelper;
import p153l.bwb;
import p153l.dw5;
import p153l.ewb;
import p153l.ktv;
import p153l.qvb;
import p153l.tvb;
import p153l.wm50;
import p153l.wtq0;
import p153l.wvb;
import p153l.x20;
import p153l.xvb;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CropIwaImageView f16529a;

    /* JADX INFO: renamed from: b */
    public CropIwaOverlayView f16530b;

    /* JADX INFO: renamed from: c */
    public bwb f16531c;

    /* JADX INFO: renamed from: d */
    public wvb f16532d;

    /* JADX INFO: renamed from: e */
    public CropIwaImageView.C4506b f16533e;

    /* JADX INFO: renamed from: f */
    public Uri f16534f;

    /* JADX INFO: renamed from: g */
    public ktv f16535g;

    /* JADX INFO: renamed from: h */
    public InterfaceC4513d f16536h;

    /* JADX INFO: renamed from: i */
    public InterfaceC4514e f16537i;

    /* JADX INFO: renamed from: j */
    public InterfaceC4512c f16538j;

    /* JADX INFO: renamed from: k */
    public CropIwaResultReceiver f16539k;

    /* JADX INFO: renamed from: l */
    public tvb.InterfaceC20409a f16540l;

    /* JADX INFO: renamed from: m */
    public boolean f16541m;

    /* JADX INFO: renamed from: n */
    public int f16542n;

    /* JADX INFO: renamed from: o */
    public x20 f16543o;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$a */
    public class C4510a implements tvb.InterfaceC20409a {
        public C4510a() {
        }

        @Override // p153l.tvb.InterfaceC20409a
        /* JADX INFO: renamed from: a */
        public void mo22043a(Uri uri, Bitmap bitmap) {
            CropIwaView.this.setImage(bitmap);
            CropIwaView.this.f16540l.mo22043a(uri, bitmap);
        }

        @Override // p153l.tvb.InterfaceC20409a
        /* JADX INFO: renamed from: b */
        public void mo22044b(Throwable th) {
            xvb.m213212b("CropIwa Image loading from [" + CropIwaView.this.f16534f + "] failed", th);
            CropIwaView.this.f16530b.setDrawOverlay(false);
            CropIwaView.this.f16540l.mo22044b(th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$b */
    public class C4511b implements CropIwaResultReceiver.InterfaceC4519a {
        public C4511b() {
        }

        @Override // com.p051p1.mobile.android.p053ui.cropiwa.image.CropIwaResultReceiver.InterfaceC4519a
        /* JADX INFO: renamed from: a */
        public void mo22045a() {
            CrashHelper.m82479c(new Exception("pic crop error"));
            if (CropIwaView.this.f16537i != null) {
                CropIwaView.this.f16537i.mo22049a();
            }
        }

        @Override // com.p051p1.mobile.android.p053ui.cropiwa.image.CropIwaResultReceiver.InterfaceC4519a
        /* JADX INFO: renamed from: b */
        public void mo22046b(Uri uri) {
            if (CropIwaView.this.f16538j != null) {
                CropIwaView.this.f16538j.mo22048a(uri);
            }
        }

        @Override // com.p051p1.mobile.android.p053ui.cropiwa.image.CropIwaResultReceiver.InterfaceC4519a
        /* JADX INFO: renamed from: c */
        public void mo22047c(Throwable th) {
            if (CropIwaView.this.f16536h != null) {
                CropIwaView.this.f16536h.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$c */
    public interface InterfaceC4512c {
        /* JADX INFO: renamed from: a */
        void mo22048a(Uri uri);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$d */
    public interface InterfaceC4513d {
        void onError(Throwable th);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$e */
    public interface InterfaceC4514e {
        /* JADX INFO: renamed from: a */
        void mo22049a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$f */
    public class C4515f implements dw5 {
        public C4515f() {
        }

        @Override // p153l.dw5
        /* JADX INFO: renamed from: a */
        public void mo21917a() {
            if (m22050b()) {
                CropIwaView.this.f16531c.m106687w(CropIwaView.this.f16530b);
                boolean zM22010f = CropIwaView.this.f16530b.m22010f();
                CropIwaView cropIwaView = CropIwaView.this;
                cropIwaView.removeView(cropIwaView.f16530b);
                CropIwaView.this.m22034q();
                CropIwaView.this.f16530b.setDrawOverlay(zM22010f);
                CropIwaView.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m22050b() {
            return CropIwaView.this.f16531c.m106681q() != (CropIwaView.this.f16530b instanceof CropIwaDynamicOverlayView);
        }
    }

    public CropIwaView(Context context) {
        super(context);
        m22032o(null);
    }

    public RectF getCropRect() {
        return this.f16530b.getCropRect();
    }

    public RectF getImageRect() {
        return this.f16529a.m21980u();
    }

    public int getImageViewRotation() {
        return this.f16542n;
    }

    public Matrix getIwaImageMatrix() {
        return this.f16529a.getImageMatrix();
    }

    @Override // android.view.View
    public void invalidate() {
        this.f16529a.invalidate();
        this.f16530b.invalidate();
    }

    /* JADX INFO: renamed from: l */
    public wvb m22029l() {
        return this.f16532d;
    }

    /* JADX INFO: renamed from: m */
    public bwb m22030m() {
        return this.f16531c;
    }

    /* JADX INFO: renamed from: n */
    public void m22031n(ewb ewbVar) {
        if (this.f16541m) {
            return;
        }
        tvb.m192787h().m192792b(getContext(), qvb.m178254b(this.f16529a.m21980u(), this.f16529a.m21980u(), this.f16530b.getCropRect()), this.f16531c.m106674j().mo22075g(), this.f16534f, ewbVar, this);
    }

    /* JADX INFO: renamed from: o */
    public final void m22032o(AttributeSet attributeSet) {
        this.f16532d = wvb.m208034d(getContext(), attributeSet);
        m22033p();
        bwb bwbVarM106649d = bwb.m106649d(getContext(), attributeSet);
        this.f16531c = bwbVarM106649d;
        bwbVarM106649d.m106667a(new C4515f());
        m22034q();
        this.f16532d.m208035a(new dw5() { // from class: l.hwb
            @Override // p153l.dw5
            /* JADX INFO: renamed from: a */
            public final void mo21917a() {
                this.f111887a.m22036s();
            }
        });
        CropIwaResultReceiver cropIwaResultReceiver = new CropIwaResultReceiver();
        this.f16539k = cropIwaResultReceiver;
        cropIwaResultReceiver.register(getContext());
        this.f16539k.setListener(new C4511b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m22042y();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return (this.f16530b.mo21921g() || this.f16530b.mo21920e() || this.f16530b.m22012i()) ? false : true;
        }
        this.f16533e.m21986a(motionEvent);
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.f16529a.measure(i, i2);
        this.f16530b.setImageWidth(this.f16529a.m21984y());
        this.f16530b.setImageHeight(this.f16529a.m21983x());
        this.f16530b.measure(this.f16529a.getMeasuredWidthAndState(), this.f16529a.getMeasuredHeightAndState());
        this.f16529a.m21961G();
        setMeasuredDimension(this.f16529a.getMeasuredWidthAndState(), this.f16529a.getMeasuredHeightAndState());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f16535g != null) {
            if (this.f16532d.m208038f() * this.f16532d.m208039g() == 0 || this.f16532d.m208039g() > i || this.f16532d.m208038f() > i2 || this.f16532d.m208038f() * this.f16532d.m208039g() > i * i2) {
                this.f16535g.m151409a(i, i2);
            } else {
                this.f16535g.m151409a(this.f16532d.m208039g(), this.f16532d.m208038f());
            }
            this.f16535g.m151410b(getContext());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        x20 x20Var = this.f16543o;
        if (x20Var != null) {
            x20Var.call();
        }
        this.f16533e.m21987b(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m22033p() {
        if (this.f16532d == null) {
            wtq0.m207906a("imageConfig must be initialized before calling this method");
            return;
        }
        CropIwaImageView cropIwaImageView = new CropIwaImageView(getContext(), this.f16532d);
        this.f16529a = cropIwaImageView;
        cropIwaImageView.setBackgroundColor(this.f16532d.m208037e());
        this.f16533e = this.f16529a.m21981v();
        addView(this.f16529a);
    }

    /* JADX INFO: renamed from: q */
    public final void m22034q() {
        bwb bwbVar;
        if (this.f16529a == null || (bwbVar = this.f16531c) == null) {
            wtq0.m207906a("imageView and overlayConfig must be initialized before calling this method");
            return;
        }
        if (bwbVar.m106681q()) {
            this.f16530b = new CropIwaDynamicOverlayView(getContext(), this.f16531c);
        } else if (this.f16531c.m106686v()) {
            this.f16530b = new CropIwa43OverlayView(getContext(), this.f16531c);
        } else if (this.f16531c.m106682r()) {
            this.f16530b = new CropIwaNewProfileOverlayView(getContext(), this.f16531c);
        } else if (this.f16531c.m106684t()) {
            this.f16530b = new CropIwaDynamicRatioOverlayView(getContext(), this.f16531c);
        } else if (this.f16531c.m106683s()) {
            this.f16530b = new CropIwaNewUIDynamicOverlayView(getContext(), this.f16531c);
        } else if (this.f16531c.m106685u()) {
            this.f16530b = new CropIwaKanKanOverlayView(getContext(), this.f16531c);
        } else {
            this.f16530b = new CropIwaOverlayView(getContext(), this.f16531c);
        }
        this.f16530b.setNewBoundsListener(this.f16529a);
        this.f16530b.setOnTouchActionListener(new x20() { // from class: l.iwb
            @Override // p153l.x20
            public final void call() {
                this.f117261a.m22037t();
            }
        });
        this.f16530b.setOnMovePartImageCenterListener(new wm50() { // from class: l.jwb
            @Override // p153l.wm50
            /* JADX INFO: renamed from: a */
            public final void mo147160a(RectF rectF) {
                this.f122906a.m22038u(rectF);
            }
        });
        this.f16529a.m21968N(this.f16530b);
        this.f16529a.m21970P(this.f16531c.m106684t());
        addView(this.f16530b);
    }

    /* JADX INFO: renamed from: r */
    public boolean m22035r() {
        return !this.f16529a.m21956B();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m22036s() {
        this.f16530b.setMaxScale(this.f16532d.m208041i());
    }

    public void setCropSaveCompleteListener(InterfaceC4512c interfaceC4512c) {
        this.f16538j = interfaceC4512c;
    }

    public void setErrorListener(InterfaceC4513d interfaceC4513d) {
        this.f16536h = interfaceC4513d;
    }

    public void setImage(Bitmap bitmap) {
        if (bitmap.getWidth() >= 4096 || bitmap.getHeight() >= 4096) {
            setLayerType(1, null);
        }
        this.f16529a.setImageBitmap(bitmap);
        this.f16530b.setDrawOverlay(true);
    }

    public void setImageLoadListener(tvb.InterfaceC20409a interfaceC20409a) {
        this.f16540l = interfaceC20409a;
    }

    public void setImageMatrix1(Matrix matrix) {
        this.f16529a.m21969O(matrix);
    }

    public void setImageUri(Uri uri) {
        this.f16534f = uri;
        ktv ktvVar = new ktv(uri, new C4510a());
        this.f16535g = ktvVar;
        ktvVar.m151409a(this.f16532d.m208039g(), this.f16532d.m208038f());
        this.f16535g.m151410b(getContext());
    }

    public void setInvalidCroppingListener(InterfaceC4514e interfaceC4514e) {
        this.f16537i = interfaceC4514e;
    }

    public void setTouchAction(x20 x20Var) {
        this.f16543o = x20Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m22037t() {
        x20 x20Var = this.f16543o;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m22038u(RectF rectF) {
        this.f16529a.m21960F(rectF);
        x20 x20Var = this.f16543o;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m22039v() {
        this.f16529a.m21959E();
    }

    /* JADX INFO: renamed from: w */
    public void m22040w() {
        this.f16529a.getImageMatrix().reset();
        this.f16542n = 0;
    }

    /* JADX INFO: renamed from: x */
    public void m22041x() {
        this.f16542n -= 90;
        this.f16529a.m21965K(-90.0f);
    }

    /* JADX INFO: renamed from: y */
    public void m22042y() {
        if (this.f16534f != null) {
            tvb tvbVarM192787h = tvb.m192787h();
            tvbVarM192787h.m192802t(this.f16534f);
            tvbVarM192787h.m192799p(this.f16534f);
            this.f16534f = null;
        }
        CropIwaResultReceiver cropIwaResultReceiver = this.f16539k;
        if (cropIwaResultReceiver != null) {
            cropIwaResultReceiver.unregister(getContext());
            this.f16539k = null;
        }
        this.f16541m = true;
    }

    public CropIwaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22032o(attributeSet);
    }

    public CropIwaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22032o(attributeSet);
    }

    @TargetApi(21)
    public CropIwaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m22032o(attributeSet);
    }
}
