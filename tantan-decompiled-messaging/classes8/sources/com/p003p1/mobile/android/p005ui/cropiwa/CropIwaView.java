package com.p003p1.mobile.android.p005ui.cropiwa;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.p003p1.mobile.android.p005ui.cropiwa.image.CropIwaResultReceiver;
import com.tantanapp.common.utils.CrashHelper;
import l.d30;
import l.qkq0;
import p007l.cub;
import p007l.fub;
import p007l.iub;
import p007l.jrv;
import p007l.jub;
import p007l.nub;
import p007l.pe50;
import p007l.qub;
import p007l.zu5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CropIwaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CropIwaImageView f1509a;

    /* JADX INFO: renamed from: b */
    public CropIwaOverlayView f1510b;

    /* JADX INFO: renamed from: c */
    public nub f1511c;

    /* JADX INFO: renamed from: d */
    public iub f1512d;

    /* JADX INFO: renamed from: e */
    public CropIwaImageView.C0267b f1513e;

    /* JADX INFO: renamed from: f */
    public Uri f1514f;

    /* JADX INFO: renamed from: g */
    public jrv f1515g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0274d f1516h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0275e f1517i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0273c f1518j;

    /* JADX INFO: renamed from: k */
    public CropIwaResultReceiver f1519k;

    /* JADX INFO: renamed from: l */
    public fub.InterfaceC0547a f1520l;

    /* JADX INFO: renamed from: m */
    public boolean f1521m;

    /* JADX INFO: renamed from: n */
    public int f1522n;

    /* JADX INFO: renamed from: o */
    public d30 f1523o;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$a */
    public class C0271a implements fub.InterfaceC0547a {
        public C0271a() {
        }

        @Override // p007l.fub.InterfaceC0547a
        /* JADX INFO: renamed from: a */
        public void mo1316a(Uri uri, Bitmap bitmap) {
            CropIwaView.this.setImage(bitmap);
            CropIwaView.this.f1520l.mo1316a(uri, bitmap);
        }

        @Override // p007l.fub.InterfaceC0547a
        /* JADX INFO: renamed from: b */
        public void mo1317b(Throwable th) {
            jub.m9558b("CropIwa Image loading from [" + CropIwaView.this.f1514f + "] failed", th);
            CropIwaView.this.f1510b.setDrawOverlay(false);
            CropIwaView.this.f1520l.mo1317b(th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$b */
    public class C0272b implements CropIwaResultReceiver.InterfaceC0280a {
        public C0272b() {
        }

        @Override // com.p003p1.mobile.android.p005ui.cropiwa.image.CropIwaResultReceiver.InterfaceC0280a
        /* JADX INFO: renamed from: a */
        public void mo1318a() {
            CrashHelper.c(new Exception("pic crop error"));
            if (CropIwaView.this.f1517i != null) {
                CropIwaView.this.f1517i.mo1322a();
            }
        }

        @Override // com.p003p1.mobile.android.p005ui.cropiwa.image.CropIwaResultReceiver.InterfaceC0280a
        /* JADX INFO: renamed from: b */
        public void mo1319b(Uri uri) {
            if (CropIwaView.this.f1518j != null) {
                CropIwaView.this.f1518j.mo1321a(uri);
            }
        }

        @Override // com.p003p1.mobile.android.p005ui.cropiwa.image.CropIwaResultReceiver.InterfaceC0280a
        /* JADX INFO: renamed from: c */
        public void mo1320c(Throwable th) {
            if (CropIwaView.this.f1516h != null) {
                CropIwaView.this.f1516h.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$c */
    public interface InterfaceC0273c {
        /* JADX INFO: renamed from: a */
        void mo1321a(Uri uri);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$d */
    public interface InterfaceC0274d {
        void onError(Throwable th);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$e */
    public interface InterfaceC0275e {
        /* JADX INFO: renamed from: a */
        void mo1322a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaView$f */
    public class C0276f implements zu5 {
        public C0276f() {
        }

        @Override // p007l.zu5
        /* JADX INFO: renamed from: a */
        public void mo1190a() {
            if (m1323b()) {
                CropIwaView.this.f1511c.m10134w(CropIwaView.this.f1510b);
                boolean zM1283f = CropIwaView.this.f1510b.m1283f();
                CropIwaView cropIwaView = CropIwaView.this;
                cropIwaView.removeView(cropIwaView.f1510b);
                CropIwaView.this.m1307q();
                CropIwaView.this.f1510b.setDrawOverlay(zM1283f);
                CropIwaView.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m1323b() {
            return CropIwaView.this.f1511c.m10128q() != (CropIwaView.this.f1510b instanceof CropIwaDynamicOverlayView);
        }
    }

    public CropIwaView(Context context) {
        super(context);
        m1305o(null);
    }

    public RectF getCropRect() {
        return this.f1510b.getCropRect();
    }

    public RectF getImageRect() {
        return this.f1509a.m1253u();
    }

    public int getImageViewRotation() {
        return this.f1522n;
    }

    public Matrix getIwaImageMatrix() {
        return this.f1509a.getImageMatrix();
    }

    @Override // android.view.View
    public void invalidate() {
        this.f1509a.invalidate();
        this.f1510b.invalidate();
    }

    /* JADX INFO: renamed from: l */
    public iub m1302l() {
        return this.f1512d;
    }

    /* JADX INFO: renamed from: m */
    public nub m1303m() {
        return this.f1511c;
    }

    /* JADX INFO: renamed from: n */
    public void m1304n(qub qubVar) {
        if (this.f1521m) {
            return;
        }
        fub.m9148h().m9153b(getContext(), cub.m8802b(this.f1509a.m1253u(), this.f1509a.m1253u(), this.f1510b.getCropRect()), this.f1511c.m10121j().mo1348g(), this.f1514f, qubVar, this);
    }

    /* JADX INFO: renamed from: o */
    public final void m1305o(AttributeSet attributeSet) {
        this.f1512d = iub.m9427d(getContext(), attributeSet);
        m1306p();
        nub nubVarM10096d = nub.m10096d(getContext(), attributeSet);
        this.f1511c = nubVarM10096d;
        nubVarM10096d.m10114a(new C0276f());
        m1307q();
        this.f1512d.m9428a(new zu5() { // from class: l.tub
            @Override // p007l.zu5
            /* JADX INFO: renamed from: a */
            public final void mo1190a() {
                this.f4445a.m1309s();
            }
        });
        CropIwaResultReceiver cropIwaResultReceiver = new CropIwaResultReceiver();
        this.f1519k = cropIwaResultReceiver;
        cropIwaResultReceiver.register(getContext());
        this.f1519k.setListener(new C0272b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1315y();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return (this.f1510b.mo1194g() || this.f1510b.mo1193e() || this.f1510b.m1285i()) ? false : true;
        }
        this.f1513e.m1259a(motionEvent);
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.f1509a.measure(i, i2);
        this.f1510b.setImageWidth(this.f1509a.m1257y());
        this.f1510b.setImageHeight(this.f1509a.m1256x());
        this.f1510b.measure(this.f1509a.getMeasuredWidthAndState(), this.f1509a.getMeasuredHeightAndState());
        this.f1509a.m1234G();
        setMeasuredDimension(this.f1509a.getMeasuredWidthAndState(), this.f1509a.getMeasuredHeightAndState());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f1515g != null) {
            if (this.f1512d.m9431f() * this.f1512d.m9432g() == 0 || this.f1512d.m9432g() > i || this.f1512d.m9431f() > i2 || this.f1512d.m9431f() * this.f1512d.m9432g() > i * i2) {
                this.f1515g.m9555a(i, i2);
            } else {
                this.f1515g.m9555a(this.f1512d.m9432g(), this.f1512d.m9431f());
            }
            this.f1515g.m9556b(getContext());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        d30 d30Var = this.f1523o;
        if (d30Var != null) {
            d30Var.call();
        }
        this.f1513e.m1260b(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m1306p() {
        if (this.f1512d == null) {
            qkq0.a("imageConfig must be initialized before calling this method");
            return;
        }
        CropIwaImageView cropIwaImageView = new CropIwaImageView(getContext(), this.f1512d);
        this.f1509a = cropIwaImageView;
        cropIwaImageView.setBackgroundColor(this.f1512d.m9430e());
        this.f1513e = this.f1509a.m1254v();
        addView(this.f1509a);
    }

    /* JADX INFO: renamed from: q */
    public final void m1307q() {
        nub nubVar;
        if (this.f1509a == null || (nubVar = this.f1511c) == null) {
            qkq0.a("imageView and overlayConfig must be initialized before calling this method");
            return;
        }
        if (nubVar.m10128q()) {
            this.f1510b = new CropIwaDynamicOverlayView(getContext(), this.f1511c);
        } else if (this.f1511c.m10133v()) {
            this.f1510b = new CropIwa43OverlayView(getContext(), this.f1511c);
        } else if (this.f1511c.m10129r()) {
            this.f1510b = new CropIwaNewProfileOverlayView(getContext(), this.f1511c);
        } else if (this.f1511c.m10131t()) {
            this.f1510b = new CropIwaDynamicRatioOverlayView(getContext(), this.f1511c);
        } else if (this.f1511c.m10130s()) {
            this.f1510b = new CropIwaNewUIDynamicOverlayView(getContext(), this.f1511c);
        } else if (this.f1511c.m10132u()) {
            this.f1510b = new CropIwaKanKanOverlayView(getContext(), this.f1511c);
        } else {
            this.f1510b = new CropIwaOverlayView(getContext(), this.f1511c);
        }
        this.f1510b.setNewBoundsListener(this.f1509a);
        this.f1510b.setOnTouchActionListener(new d30() { // from class: l.uub
            public final void call() {
                this.f4935a.m1310t();
            }
        });
        this.f1510b.setOnMovePartImageCenterListener(new pe50() { // from class: l.vub
            @Override // p007l.pe50
            /* JADX INFO: renamed from: a */
            public final void mo10252a(RectF rectF) {
                this.f4993a.m1311u(rectF);
            }
        });
        this.f1509a.m1241N(this.f1510b);
        this.f1509a.m1243P(this.f1511c.m10131t());
        addView(this.f1510b);
    }

    /* JADX INFO: renamed from: r */
    public boolean m1308r() {
        return !this.f1509a.m1229B();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m1309s() {
        this.f1510b.setMaxScale(this.f1512d.m9434i());
    }

    public void setCropSaveCompleteListener(InterfaceC0273c interfaceC0273c) {
        this.f1518j = interfaceC0273c;
    }

    public void setErrorListener(InterfaceC0274d interfaceC0274d) {
        this.f1516h = interfaceC0274d;
    }

    public void setImage(Bitmap bitmap) {
        if (bitmap.getWidth() >= 4096 || bitmap.getHeight() >= 4096) {
            setLayerType(1, null);
        }
        this.f1509a.setImageBitmap(bitmap);
        this.f1510b.setDrawOverlay(true);
    }

    public void setImageLoadListener(fub.InterfaceC0547a interfaceC0547a) {
        this.f1520l = interfaceC0547a;
    }

    public void setImageMatrix1(Matrix matrix) {
        this.f1509a.m1242O(matrix);
    }

    public void setImageUri(Uri uri) {
        this.f1514f = uri;
        jrv jrvVar = new jrv(uri, new C0271a());
        this.f1515g = jrvVar;
        jrvVar.m9555a(this.f1512d.m9432g(), this.f1512d.m9431f());
        this.f1515g.m9556b(getContext());
    }

    public void setInvalidCroppingListener(InterfaceC0275e interfaceC0275e) {
        this.f1517i = interfaceC0275e;
    }

    public void setTouchAction(d30 d30Var) {
        this.f1523o = d30Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m1310t() {
        d30 d30Var = this.f1523o;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m1311u(RectF rectF) {
        this.f1509a.m1233F(rectF);
        d30 d30Var = this.f1523o;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m1312v() {
        this.f1509a.m1232E();
    }

    /* JADX INFO: renamed from: w */
    public void m1313w() {
        this.f1509a.getImageMatrix().reset();
        this.f1522n = 0;
    }

    /* JADX INFO: renamed from: x */
    public void m1314x() {
        this.f1522n -= 90;
        this.f1509a.m1238K(-90.0f);
    }

    /* JADX INFO: renamed from: y */
    public void m1315y() {
        if (this.f1514f != null) {
            fub fubVarM9148h = fub.m9148h();
            fubVarM9148h.m9163t(this.f1514f);
            fubVarM9148h.m9160p(this.f1514f);
            this.f1514f = null;
        }
        CropIwaResultReceiver cropIwaResultReceiver = this.f1519k;
        if (cropIwaResultReceiver != null) {
            cropIwaResultReceiver.unregister(getContext());
            this.f1519k = null;
        }
        this.f1521m = true;
    }

    public CropIwaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1305o(attributeSet);
    }

    public CropIwaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1305o(attributeSet);
    }

    @TargetApi(21)
    public CropIwaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1305o(attributeSet);
    }
}
