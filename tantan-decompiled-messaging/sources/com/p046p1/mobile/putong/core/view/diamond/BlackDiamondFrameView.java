package com.p046p1.mobile.putong.core.view.diamond;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p149l.t100;
import p149l.x2c0;

/* JADX INFO: loaded from: classes10.dex */
public class BlackDiamondFrameView extends View implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public Drawable f38670a;

    /* JADX INFO: renamed from: b */
    public Bitmap f38671b;

    /* JADX INFO: renamed from: c */
    public Paint f38672c;

    /* JADX INFO: renamed from: d */
    public Rect f38673d;

    /* JADX INFO: renamed from: e */
    public int f38674e;

    /* JADX INFO: renamed from: f */
    public int f38675f;

    /* JADX INFO: renamed from: g */
    public int f38676g;

    /* JADX INFO: renamed from: h */
    public int f38677h;

    /* JADX INFO: renamed from: i */
    public SensorManager f38678i;

    /* JADX INFO: renamed from: j */
    public Sensor f38679j;

    /* JADX INFO: renamed from: k */
    public boolean f38680k;

    public BlackDiamondFrameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38670a = null;
        this.f38671b = null;
        this.f38672c = new Paint(1);
        this.f38673d = null;
        this.f38674e = 0;
        this.f38675f = 0;
        this.f38676g = 0;
        this.f38677h = t100.m186890d(200.0f);
        this.f38678i = null;
        this.f38679j = null;
        this.f38680k = false;
    }

    /* JADX INFO: renamed from: a */
    public Act m59633a() {
        if (getContext() instanceof Act) {
            return (Act) getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m59634b(float f) {
        if (m59633a() == null || this.f38673d == null || m59633a().lifecycle_() != C4319c.f15548i) {
            return;
        }
        if ((!(m59633a() instanceof NewMainAct) || ((NewMainAct) m59633a()).m39820j7() == TabName.Card) && Math.abs(f) >= 3.0f) {
            int iRound = Math.round(f);
            int i = iRound > 0 ? iRound + 35 : iRound - 35;
            Rect rect = this.f38673d;
            int i2 = rect.top + i;
            rect.top = i2;
            if (i2 < 0) {
                rect.top = 0;
            }
            int i3 = rect.top;
            int i4 = this.f38677h;
            int i5 = i3 + i4;
            rect.bottom = i5;
            int i6 = this.f38675f;
            if (i5 > i6) {
                rect.bottom = i6;
                rect.top = i6 - i4;
            }
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public Bitmap m59635c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = (this.f38674e * 1.0f) / width;
        matrix.postScale(f, f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (!bitmap.equals(bitmapCreateBitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: d */
    public void m59636d() {
        SensorManager sensorManager = this.f38678i;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
        this.f38678i = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m59636d();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f38680k) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f38674e, this.f38675f, this.f38672c, 31);
            this.f38670a.setBounds(0, 0, this.f38674e, this.f38675f);
            this.f38670a.draw(canvas);
            this.f38672c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            canvas.drawBitmap(this.f38671b, (Rect) null, this.f38673d, this.f38672c);
            this.f38672c.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        m59634b(sensorEvent.values[1]);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f38680k) {
            this.f38674e = i;
            this.f38675f = i2;
            if (this.f38670a == null) {
                this.f38670a = CoreModule.f17544b.getDrawable(x2c0.f189440J1);
            }
            if (this.f38671b == null) {
                this.f38671b = m59635c(BitmapFactory.decodeResource(getResources(), x2c0.f189471K1));
            }
            this.f38676g = (this.f38675f - this.f38677h) / 2;
            int i5 = this.f38676g;
            this.f38673d = new Rect(0, i5, this.f38674e, this.f38677h + i5);
        }
    }

    public void setIsBlackDiamond(boolean z) {
        this.f38680k = z;
    }

    public BlackDiamondFrameView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public BlackDiamondFrameView(Context context) {
        this(context, null);
    }
}
