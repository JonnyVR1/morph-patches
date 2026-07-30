package com.p051p1.mobile.android.p053ui.cropiwa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p153l.bwb;
import p153l.dw5;
import p153l.fwb;
import p153l.km50;
import p153l.phx;
import p153l.q11;
import p153l.wm50;
import p153l.x20;
import p153l.y20;
import p153l.zm50;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
public class CropIwaOverlayView extends View implements dw5, km50 {

    /* JADX INFO: renamed from: a */
    public Paint f16515a;

    /* JADX INFO: renamed from: b */
    public zm50 f16516b;

    /* JADX INFO: renamed from: c */
    public fwb f16517c;

    /* JADX INFO: renamed from: d */
    public RectF f16518d;

    /* JADX INFO: renamed from: e */
    public RectF f16519e;

    /* JADX INFO: renamed from: f */
    public RectF f16520f;

    /* JADX INFO: renamed from: g */
    public bwb f16521g;

    /* JADX INFO: renamed from: h */
    public boolean f16522h;

    /* JADX INFO: renamed from: i */
    public wm50 f16523i;

    /* JADX INFO: renamed from: j */
    public int f16524j;

    /* JADX INFO: renamed from: k */
    public int f16525k;

    /* JADX INFO: renamed from: l */
    public x20 f16526l;

    /* JADX INFO: renamed from: m */
    public float f16527m;

    /* JADX INFO: renamed from: n */
    public float f16528n;

    public CropIwaOverlayView(Context context, bwb bwbVar) {
        super(context);
        mo21919d(bwbVar);
    }

    /* JADX INFO: renamed from: a */
    public void mo21917a() {
        this.f16515a.setColor(this.f16521g.m106679o());
        fwb fwbVarM106674j = this.f16521g.m106674j();
        this.f16517c = fwbVarM106674j;
        fwbVarM106674j.mo21917a();
        mo21912o();
        m22015l();
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public void mo21918b(RectF rectF) {
        this.f16518d.set(rectF);
        mo21912o();
        m22015l();
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public void mo21919d(bwb bwbVar) {
        this.f16521g = bwbVar;
        bwbVar.m106667a(this);
        this.f16518d = new RectF();
        this.f16517c = bwbVar.m106674j();
        this.f16519e = new RectF();
        this.f16520f = new RectF();
        Paint paint = new Paint();
        this.f16515a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f16515a.setColor(bwbVar.m106679o());
        setLayerType(1, null);
        if (getContext() instanceof Act) {
            ((Act) getContext()).duringCreated(phx.f152493b).subscribe(new y20() { // from class: l.cwb
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84109a.m22014k((Float) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean mo21920e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m22010f() {
        return this.f16522h;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo21921g() {
        return false;
    }

    @Nullable
    public q11 getAspectRatio() {
        q11 q11VarM106669e = this.f16521g.m106669e();
        if (q11VarM106669e != q11.f155139c) {
            return q11VarM106669e;
        }
        if (this.f16518d.width() == 0.0f || this.f16518d.height() == 0.0f) {
            return null;
        }
        return new q11(Math.round(this.f16518d.width()), Math.round(this.f16518d.height()));
    }

    public RectF getCropRect() {
        return new RectF(this.f16519e);
    }

    public float getRemainScale() {
        return this.f16527m / Math.max(1.0f, this.f16528n);
    }

    /* JADX INFO: renamed from: h */
    public boolean m22011h() {
        return this.f16528n < this.f16527m;
    }

    /* JADX INFO: renamed from: i */
    public boolean m22012i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m22013j() {
        return this.f16519e.width() >= ((float) this.f16521g.m106678n()) && this.f16519e.height() >= ((float) this.f16521g.m106677m());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m22014k(Float f) {
        this.f16528n = f.floatValue();
    }

    /* JADX INFO: renamed from: l */
    public void m22015l() {
        m22016m(false);
    }

    /* JADX INFO: renamed from: m */
    public void m22016m(boolean z) {
        if (this.f16516b != null) {
            this.f16516b.mo21974b(new RectF(this.f16519e), z);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m22017n() {
        if (NullChecker.m82486a(this.f16516b)) {
            this.f16516b.mo21975c(Math.min(Math.min(this.f16520f.height() / this.f16519e.height(), this.f16520f.width() / this.f16519e.width()), getRemainScale()), this.f16519e.centerX(), this.f16519e.centerY());
            if (NullChecker.m82486a(this.f16526l)) {
                this.f16526l.call();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo21912o() {
        q11 aspectRatio;
        float fM174804b;
        float fM174804b2;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null) {
            return;
        }
        if (this.f16519e.width() == 0.0f || this.f16519e.height() == 0.0f || Math.abs((this.f16519e.width() / this.f16519e.height()) - aspectRatio.m174804b()) >= 0.001d) {
            float f = measuredWidth * 0.5f;
            float f2 = measuredHeight * 0.5f;
            if (aspectRatio.m174803a() < aspectRatio.m174805c() || (aspectRatio.m174806d() && measuredWidth < measuredHeight)) {
                fM174804b = measuredWidth * 0.9f * 0.5f;
                fM174804b2 = fM174804b / aspectRatio.m174804b();
            } else {
                fM174804b2 = measuredHeight * 0.9f * 0.5f;
                fM174804b = aspectRatio.m174804b() * fM174804b2;
            }
            this.f16519e.set(f - fM174804b, f2 - fM174804b2, f + fM174804b, f2 + fM174804b2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f16522h) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f16515a);
            if (m22013j()) {
                this.f16517c.m127753c(canvas, this.f16519e);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setDrawOverlay(boolean z) {
        this.f16522h = z;
        invalidate();
    }

    public void setImageHeight(int i) {
        this.f16525k = i;
    }

    public void setImageWidth(int i) {
        this.f16524j = i;
    }

    public void setMaxScale(float f) {
        this.f16527m = f;
    }

    public void setNewBoundsListener(zm50 zm50Var) {
        this.f16516b = zm50Var;
    }

    public void setOnMovePartImageCenterListener(wm50 wm50Var) {
        this.f16523i = wm50Var;
    }

    public void setOnTouchActionListener(x20 x20Var) {
        this.f16526l = x20Var;
    }
}
