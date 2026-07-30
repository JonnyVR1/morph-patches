package com.p051p1.mobile.putong.core.view.diamond;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p153l.dbc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class BlackDiamondFrameView extends View implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public Drawable f39518a;

    /* JADX INFO: renamed from: b */
    public Bitmap f39519b;

    /* JADX INFO: renamed from: c */
    public Paint f39520c;

    /* JADX INFO: renamed from: d */
    public Rect f39521d;

    /* JADX INFO: renamed from: e */
    public int f39522e;

    /* JADX INFO: renamed from: f */
    public int f39523f;

    /* JADX INFO: renamed from: g */
    public int f39524g;

    /* JADX INFO: renamed from: h */
    public int f39525h;

    /* JADX INFO: renamed from: i */
    public SensorManager f39526i;

    /* JADX INFO: renamed from: j */
    public Sensor f39527j;

    /* JADX INFO: renamed from: k */
    public boolean f39528k;

    public BlackDiamondFrameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39518a = null;
        this.f39519b = null;
        this.f39520c = new Paint(1);
        this.f39521d = null;
        this.f39522e = 0;
        this.f39523f = 0;
        this.f39524g = 0;
        this.f39525h = qa00.m175859d(200.0f);
        this.f39526i = null;
        this.f39527j = null;
        this.f39528k = false;
    }

    /* JADX INFO: renamed from: a */
    public Act m60817a() {
        if (getContext() instanceof Act) {
            return (Act) getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m60818b(float f) {
        if (m60817a() == null || this.f39521d == null || m60817a().lifecycle_() != C4470c.f16267i) {
            return;
        }
        if ((!(m60817a() instanceof NewMainAct) || ((NewMainAct) m60817a()).m40830p7() == TabName.Card) && Math.abs(f) >= 3.0f) {
            int iRound = Math.round(f);
            int i = iRound > 0 ? iRound + 35 : iRound - 35;
            Rect rect = this.f39521d;
            int i2 = rect.top + i;
            rect.top = i2;
            if (i2 < 0) {
                rect.top = 0;
            }
            int i3 = rect.top;
            int i4 = this.f39525h;
            int i5 = i3 + i4;
            rect.bottom = i5;
            int i6 = this.f39523f;
            if (i5 > i6) {
                rect.bottom = i6;
                rect.top = i6 - i4;
            }
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public Bitmap m60819c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = (this.f39522e * 1.0f) / width;
        matrix.postScale(f, f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (!bitmap.equals(bitmapCreateBitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: d */
    public void m60820d() {
        SensorManager sensorManager = this.f39526i;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
        this.f39526i = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m60820d();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f39528k) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f39522e, this.f39523f, this.f39520c, 31);
            this.f39518a.setBounds(0, 0, this.f39522e, this.f39523f);
            this.f39518a.draw(canvas);
            this.f39520c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            canvas.drawBitmap(this.f39519b, (Rect) null, this.f39521d, this.f39520c);
            this.f39520c.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        m60818b(sensorEvent.values[1]);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f39528k) {
            this.f39522e = i;
            this.f39523f = i2;
            if (this.f39518a == null) {
                this.f39518a = CoreModule.f18263b.getDrawable(dbc0.f86298K1);
            }
            if (this.f39519b == null) {
                this.f39519b = m60819c(BitmapFactory.decodeResource(getResources(), dbc0.f86330L1));
            }
            this.f39524g = (this.f39523f - this.f39525h) / 2;
            int i5 = this.f39524g;
            this.f39521d = new Rect(0, i5, this.f39522e, this.f39525h + i5);
        }
    }

    public void setIsBlackDiamond(boolean z) {
        this.f39528k = z;
    }

    public BlackDiamondFrameView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public BlackDiamondFrameView(Context context) {
        this(context, null);
    }
}
