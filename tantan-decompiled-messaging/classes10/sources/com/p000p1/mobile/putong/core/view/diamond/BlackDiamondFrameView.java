package com.p000p1.mobile.putong.core.view.diamond;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.newui.main.base.TabName;
import l.t100;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class BlackDiamondFrameView extends View implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public Drawable f2612a;

    /* JADX INFO: renamed from: b */
    public Bitmap f2613b;

    /* JADX INFO: renamed from: c */
    public Paint f2614c;

    /* JADX INFO: renamed from: d */
    public Rect f2615d;

    /* JADX INFO: renamed from: e */
    public int f2616e;

    /* JADX INFO: renamed from: f */
    public int f2617f;

    /* JADX INFO: renamed from: g */
    public int f2618g;

    /* JADX INFO: renamed from: h */
    public int f2619h;

    /* JADX INFO: renamed from: i */
    public SensorManager f2620i;

    /* JADX INFO: renamed from: j */
    public Sensor f2621j;

    /* JADX INFO: renamed from: k */
    public boolean f2622k;

    public BlackDiamondFrameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2612a = null;
        this.f2613b = null;
        this.f2614c = new Paint(1);
        this.f2615d = null;
        this.f2616e = 0;
        this.f2617f = 0;
        this.f2618g = 0;
        this.f2619h = t100.d(200.0f);
        this.f2620i = null;
        this.f2621j = null;
        this.f2622k = false;
    }

    /* JADX INFO: renamed from: a */
    public Act m5042a() {
        if (getContext() instanceof Act) {
            return getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m5043b(float f) {
        if (m5042a() == null || this.f2615d == null || m5042a().lifecycle_() != c.i) {
            return;
        }
        if ((!(m5042a() instanceof NewMainAct) || m5042a().j7() == TabName.Card) && Math.abs(f) >= 3.0f) {
            int iRound = Math.round(f);
            int i = iRound > 0 ? iRound + 35 : iRound - 35;
            Rect rect = this.f2615d;
            int i2 = rect.top + i;
            rect.top = i2;
            if (i2 < 0) {
                rect.top = 0;
            }
            int i3 = rect.top;
            int i4 = this.f2619h;
            int i5 = i3 + i4;
            rect.bottom = i5;
            int i6 = this.f2617f;
            if (i5 > i6) {
                rect.bottom = i6;
                rect.top = i6 - i4;
            }
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public Bitmap m5044c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = (this.f2616e * 1.0f) / width;
        matrix.postScale(f, f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (!bitmap.equals(bitmapCreateBitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: d */
    public void m5045d() {
        SensorManager sensorManager = this.f2620i;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
        this.f2620i = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5045d();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2622k) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f2616e, this.f2617f, this.f2614c, 31);
            this.f2612a.setBounds(0, 0, this.f2616e, this.f2617f);
            this.f2612a.draw(canvas);
            this.f2614c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            canvas.drawBitmap(this.f2613b, (Rect) null, this.f2615d, this.f2614c);
            this.f2614c.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        m5043b(sensorEvent.values[1]);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f2622k) {
            this.f2616e = i;
            this.f2617f = i2;
            if (this.f2612a == null) {
                this.f2612a = CoreModule.b.getDrawable(x2c0.J1);
            }
            if (this.f2613b == null) {
                this.f2613b = m5044c(BitmapFactory.decodeResource(getResources(), x2c0.K1));
            }
            this.f2618g = (this.f2617f - this.f2619h) / 2;
            int i5 = this.f2618g;
            this.f2615d = new Rect(0, i5, this.f2616e, this.f2619h + i5);
        }
    }

    public void setIsBlackDiamond(boolean z) {
        this.f2622k = z;
    }

    public BlackDiamondFrameView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public BlackDiamondFrameView(Context context) {
        this(context, null);
    }
}
