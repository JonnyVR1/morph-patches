package com.idv.identity.face.p043ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.idv.identity.platform.log.RecordService;
import p153l.dhc0;
import p153l.rfc0;
import p153l.wmd0;

/* JADX INFO: loaded from: classes7.dex */
public class RoundProgressBar extends View {

    /* JADX INFO: renamed from: A */
    private int f12991A;

    /* JADX INFO: renamed from: B */
    private Runnable f12992B;

    /* JADX INFO: renamed from: C */
    int f12993C;

    /* JADX INFO: renamed from: a */
    private boolean f12994a;

    /* JADX INFO: renamed from: b */
    private Context f12995b;

    /* JADX INFO: renamed from: c */
    protected Paint f12996c;

    /* JADX INFO: renamed from: d */
    protected int f12997d;

    /* JADX INFO: renamed from: e */
    private float f12998e;

    /* JADX INFO: renamed from: f */
    protected int f12999f;

    /* JADX INFO: renamed from: g */
    private int f13000g;

    /* JADX INFO: renamed from: h */
    private boolean f13001h;

    /* JADX INFO: renamed from: i */
    private int f13002i;

    /* JADX INFO: renamed from: j */
    private int f13003j;

    /* JADX INFO: renamed from: k */
    private int f13004k;

    /* JADX INFO: renamed from: l */
    protected int f13005l;

    /* JADX INFO: renamed from: m */
    private int f13006m;

    /* JADX INFO: renamed from: n */
    private float f13007n;

    /* JADX INFO: renamed from: o */
    private float f13008o;

    /* JADX INFO: renamed from: p */
    private int f13009p;

    /* JADX INFO: renamed from: q */
    private int f13010q;

    /* JADX INFO: renamed from: r */
    private boolean f13011r;

    /* JADX INFO: renamed from: s */
    private int f13012s;

    /* JADX INFO: renamed from: t */
    private int f13013t;

    /* JADX INFO: renamed from: u */
    public BitmapShader f13014u;

    /* JADX INFO: renamed from: v */
    private SweepGradient f13015v;

    /* JADX INFO: renamed from: w */
    private Matrix f13016w;

    /* JADX INFO: renamed from: x */
    private int f13017x;

    /* JADX INFO: renamed from: y */
    private int f13018y;

    /* JADX INFO: renamed from: z */
    private Handler f13019z;

    /* JADX INFO: renamed from: com.idv.identity.face.ui.widget.RoundProgressBar$a */
    public class RunnableC3735a implements Runnable {
        public RunnableC3735a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = RoundProgressBar.this.f12994a;
            RoundProgressBar roundProgressBar = RoundProgressBar.this;
            if (z) {
                roundProgressBar.f13019z.postDelayed(this, RoundProgressBar.this.f12991A / RoundProgressBar.this.getMax());
                return;
            }
            int progress = roundProgressBar.getProgress() + 1;
            RoundProgressBar.m18803d(RoundProgressBar.this);
            if (progress >= RoundProgressBar.this.getMax()) {
                progress = RoundProgressBar.this.getMax();
            }
            RoundProgressBar.this.setProgress(progress);
            int max = RoundProgressBar.this.getMax();
            RoundProgressBar roundProgressBar2 = RoundProgressBar.this;
            if (progress >= max) {
                RoundProgressBar.m18803d(roundProgressBar2);
            } else {
                roundProgressBar2.f13019z.postDelayed(this, RoundProgressBar.this.f12991A / RoundProgressBar.this.getMax());
            }
        }
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12994a = false;
        this.f13012s = 0;
        this.f13013t = 0;
        this.f12991A = -1;
        this.f12992B = new RunnableC3735a();
        this.f12993C = 0;
        this.f12996c = new Paint();
        this.f13019z = new Handler(Looper.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dhc0.f88439G);
        this.f12997d = typedArrayObtainStyledAttributes.getColor(dhc0.f88447O, -65536);
        this.f12999f = typedArrayObtainStyledAttributes.getColor(dhc0.f88448P, -16711936);
        this.f13000g = typedArrayObtainStyledAttributes.getColor(dhc0.f88448P, -16711936);
        this.f13004k = typedArrayObtainStyledAttributes.getColor(dhc0.f88452T, -16711936);
        this.f13007n = typedArrayObtainStyledAttributes.getDimension(dhc0.f88454V, 15.0f);
        this.f13008o = typedArrayObtainStyledAttributes.getDimension(dhc0.f88449Q, 5.0f);
        this.f13009p = typedArrayObtainStyledAttributes.getInteger(dhc0.f88445M, 100);
        this.f13011r = typedArrayObtainStyledAttributes.getBoolean(dhc0.f88453U, true);
        this.f13012s = typedArrayObtainStyledAttributes.getInt(dhc0.f88451S, 0);
        this.f13001h = typedArrayObtainStyledAttributes.getBoolean(dhc0.f88446N, false);
        this.f12998e = typedArrayObtainStyledAttributes.getDimension(dhc0.f88441I, 0.0f);
        this.f13002i = typedArrayObtainStyledAttributes.getColor(dhc0.f88444L, 0);
        this.f13003j = typedArrayObtainStyledAttributes.getColor(dhc0.f88443K, 0);
        this.f13005l = typedArrayObtainStyledAttributes.getInt(dhc0.f88450R, 0);
        this.f13006m = typedArrayObtainStyledAttributes.getInt(dhc0.f88442J, 360);
        this.f13018y = typedArrayObtainStyledAttributes.getColor(dhc0.f88440H, -1);
        if (this.f12998e > 0.0f && this.f13001h) {
            this.f13016w = new Matrix();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), rfc0.f162775a);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f13014u = new BitmapShader(bitmapDecodeResource, tileMode, tileMode);
            this.f13017x = (int) this.f12998e;
            float fMin = (this.f13017x * 1.0f) / Math.min(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
            this.f13016w.setScale(fMin, fMin);
            this.f13014u.setLocalMatrix(this.f13016w);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ wmd0 m18803d(RoundProgressBar roundProgressBar) {
        roundProgressBar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    private void m18804e(Canvas canvas, RectF rectF) {
        this.f12996c.setStyle(Paint.Style.STROKE);
        this.f12996c.setColor(this.f12997d);
        int i = this.f13005l;
        canvas.drawArc(rectF, i, this.f13006m - i, false, this.f12996c);
        BitmapShader bitmapShader = this.f13014u;
        if (bitmapShader != null) {
            this.f12996c.setShader(bitmapShader);
        }
        if (this.f13001h && this.f13002i != 0 && this.f13003j != 0 && this.f13015v == null) {
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            this.f13015v = new SweepGradient(fCenterX, fCenterY, new int[]{this.f13002i, this.f13003j}, (float[]) null);
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f, fCenterX, fCenterY);
            this.f13015v.setLocalMatrix(matrix);
        }
        SweepGradient sweepGradient = this.f13015v;
        if (sweepGradient != null) {
            this.f12996c.setShader(sweepGradient);
        }
        this.f12996c.setColor(this.f12999f);
        canvas.drawArc(rectF, this.f13005l, (this.f13010q * (this.f13006m - this.f13005l)) / getMax(), false, this.f12996c);
        this.f12996c.setShader(null);
    }

    /* JADX INFO: renamed from: f */
    public void m18805f() {
        this.f13019z.removeCallbacks(this.f12992B);
    }

    public int getCricleColor() {
        return this.f12997d;
    }

    public int getCricleProgressColor() {
        return this.f12999f;
    }

    public synchronized int getMax() {
        return this.f13009p;
    }

    public synchronized int getProgress() {
        return this.f13010q;
    }

    public int getRadius() {
        return this.f13013t;
    }

    public float getRoundWidth() {
        return this.f13008o;
    }

    public int getTextColor() {
        return this.f13004k;
    }

    public float getTextSize() {
        return this.f13007n;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float f = width;
        this.f13013t = (int) (f - (this.f13008o / 2.0f));
        this.f12996c.setColor(this.f12997d);
        this.f12996c.setStyle(Paint.Style.STROKE);
        this.f12996c.setStrokeWidth(this.f13008o);
        this.f12996c.setAntiAlias(true);
        this.f12996c.setStrokeCap(Paint.Cap.ROUND);
        this.f12996c.setColor(this.f13018y);
        this.f12996c.setStrokeWidth(0.0f);
        this.f12996c.setColor(this.f13004k);
        this.f12996c.setTextSize(this.f13007n);
        this.f12996c.setTypeface(Typeface.DEFAULT_BOLD);
        int i = (int) ((this.f13010q / this.f13009p) * 100.0f);
        float fMeasureText = this.f12996c.measureText(i + "%");
        this.f12996c.setShader(null);
        if (this.f13011r && i != 0 && this.f13012s == 0) {
            canvas.drawText(i + "%", f - (fMeasureText / 2.0f), f + (this.f13007n / 2.0f), this.f12996c);
        }
        this.f12996c.setStrokeWidth(this.f13008o);
        int i2 = this.f13013t;
        RectF rectF = new RectF(width - i2, width - i2, width + i2, width + i2);
        this.f12996c.setColor(this.f12997d);
        int i3 = this.f13012s;
        if (i3 == 0) {
            m18804e(canvas, rectF);
            return;
        }
        if (i3 != 1) {
            return;
        }
        this.f12996c.setStyle(Paint.Style.FILL_AND_STROKE);
        int i4 = this.f13010q;
        if (i4 != 0) {
            int i5 = this.f13005l;
            canvas.drawArc(rectF, i5 + 90, ((this.f13006m - i5) * i4) / this.f13009p, true, this.f12996c);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f13018y = i;
        postInvalidate();
    }

    public void setCricleColor(int i) {
        this.f12997d = i;
    }

    public void setCricleProgressColor(int i) {
        this.f12999f = i;
    }

    public void setGradientColor(int i) {
        this.f13003j = i;
    }

    public synchronized void setMax(int i) {
        try {
            if (i < 0) {
                throw new IllegalArgumentException("max not less than 0");
            }
            this.f13009p = i;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setProgress(int i) {
        try {
            if (i < 0) {
                RecordService.getInstance().recordException(new IllegalArgumentException("progress not less than 0 progress" + i));
                return;
            }
            int i2 = this.f13009p;
            if (i > i2) {
                i = i2;
            }
            if (i <= i2) {
                this.f13010q = i;
                postInvalidate();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setProgressAngle(int i) {
        this.f12993C = i;
        postInvalidate();
    }

    public void setRoundColor(int i) {
        this.f12997d = i;
        postInvalidate();
    }

    public void setRoundProgressColor(int i) {
        this.f12999f = i;
    }

    public void setRoundWidth(float f) {
        this.f13008o = f;
    }

    public void setStartColor(int i) {
        this.f13002i = i;
    }

    public void setTextColor(int i) {
        this.f13004k = i;
    }

    public void setTextSize(float f) {
        this.f13007n = f;
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f12995b = context;
    }

    public RoundProgressBar(Context context) {
        this(context, null);
        this.f12995b = context;
    }
}
