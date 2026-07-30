package com.idv.identity.face.p036ui.widget;

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
import p149l.n7c0;
import p149l.ued0;
import p149l.x8c0;

/* JADX INFO: loaded from: classes7.dex */
public class RoundProgressBar extends View {

    /* JADX INFO: renamed from: A */
    private int f12250A;

    /* JADX INFO: renamed from: B */
    private Runnable f12251B;

    /* JADX INFO: renamed from: C */
    int f12252C;

    /* JADX INFO: renamed from: a */
    private boolean f12253a;

    /* JADX INFO: renamed from: b */
    private Context f12254b;

    /* JADX INFO: renamed from: c */
    protected Paint f12255c;

    /* JADX INFO: renamed from: d */
    protected int f12256d;

    /* JADX INFO: renamed from: e */
    private float f12257e;

    /* JADX INFO: renamed from: f */
    protected int f12258f;

    /* JADX INFO: renamed from: g */
    private int f12259g;

    /* JADX INFO: renamed from: h */
    private boolean f12260h;

    /* JADX INFO: renamed from: i */
    private int f12261i;

    /* JADX INFO: renamed from: j */
    private int f12262j;

    /* JADX INFO: renamed from: k */
    private int f12263k;

    /* JADX INFO: renamed from: l */
    protected int f12264l;

    /* JADX INFO: renamed from: m */
    private int f12265m;

    /* JADX INFO: renamed from: n */
    private float f12266n;

    /* JADX INFO: renamed from: o */
    private float f12267o;

    /* JADX INFO: renamed from: p */
    private int f12268p;

    /* JADX INFO: renamed from: q */
    private int f12269q;

    /* JADX INFO: renamed from: r */
    private boolean f12270r;

    /* JADX INFO: renamed from: s */
    private int f12271s;

    /* JADX INFO: renamed from: t */
    private int f12272t;

    /* JADX INFO: renamed from: u */
    public BitmapShader f12273u;

    /* JADX INFO: renamed from: v */
    private SweepGradient f12274v;

    /* JADX INFO: renamed from: w */
    private Matrix f12275w;

    /* JADX INFO: renamed from: x */
    private int f12276x;

    /* JADX INFO: renamed from: y */
    private int f12277y;

    /* JADX INFO: renamed from: z */
    private Handler f12278z;

    /* JADX INFO: renamed from: com.idv.identity.face.ui.widget.RoundProgressBar$a */
    public class RunnableC3576a implements Runnable {
        public RunnableC3576a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = RoundProgressBar.this.f12253a;
            RoundProgressBar roundProgressBar = RoundProgressBar.this;
            if (z) {
                roundProgressBar.f12278z.postDelayed(this, RoundProgressBar.this.f12250A / RoundProgressBar.this.getMax());
                return;
            }
            int progress = roundProgressBar.getProgress() + 1;
            RoundProgressBar.m17726d(RoundProgressBar.this);
            if (progress >= RoundProgressBar.this.getMax()) {
                progress = RoundProgressBar.this.getMax();
            }
            RoundProgressBar.this.setProgress(progress);
            int max = RoundProgressBar.this.getMax();
            RoundProgressBar roundProgressBar2 = RoundProgressBar.this;
            if (progress >= max) {
                RoundProgressBar.m17726d(roundProgressBar2);
            } else {
                roundProgressBar2.f12278z.postDelayed(this, RoundProgressBar.this.f12250A / RoundProgressBar.this.getMax());
            }
        }
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12253a = false;
        this.f12271s = 0;
        this.f12272t = 0;
        this.f12250A = -1;
        this.f12251B = new RunnableC3576a();
        this.f12252C = 0;
        this.f12255c = new Paint();
        this.f12278z = new Handler(Looper.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x8c0.f191463G);
        this.f12256d = typedArrayObtainStyledAttributes.getColor(x8c0.f191471O, -65536);
        this.f12258f = typedArrayObtainStyledAttributes.getColor(x8c0.f191472P, -16711936);
        this.f12259g = typedArrayObtainStyledAttributes.getColor(x8c0.f191472P, -16711936);
        this.f12263k = typedArrayObtainStyledAttributes.getColor(x8c0.f191476T, -16711936);
        this.f12266n = typedArrayObtainStyledAttributes.getDimension(x8c0.f191478V, 15.0f);
        this.f12267o = typedArrayObtainStyledAttributes.getDimension(x8c0.f191473Q, 5.0f);
        this.f12268p = typedArrayObtainStyledAttributes.getInteger(x8c0.f191469M, 100);
        this.f12270r = typedArrayObtainStyledAttributes.getBoolean(x8c0.f191477U, true);
        this.f12271s = typedArrayObtainStyledAttributes.getInt(x8c0.f191475S, 0);
        this.f12260h = typedArrayObtainStyledAttributes.getBoolean(x8c0.f191470N, false);
        this.f12257e = typedArrayObtainStyledAttributes.getDimension(x8c0.f191465I, 0.0f);
        this.f12261i = typedArrayObtainStyledAttributes.getColor(x8c0.f191468L, 0);
        this.f12262j = typedArrayObtainStyledAttributes.getColor(x8c0.f191467K, 0);
        this.f12264l = typedArrayObtainStyledAttributes.getInt(x8c0.f191474R, 0);
        this.f12265m = typedArrayObtainStyledAttributes.getInt(x8c0.f191466J, 360);
        this.f12277y = typedArrayObtainStyledAttributes.getColor(x8c0.f191464H, -1);
        if (this.f12257e > 0.0f && this.f12260h) {
            this.f12275w = new Matrix();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), n7c0.f137498a);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f12273u = new BitmapShader(bitmapDecodeResource, tileMode, tileMode);
            this.f12276x = (int) this.f12257e;
            float fMin = (this.f12276x * 1.0f) / Math.min(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
            this.f12275w.setScale(fMin, fMin);
            this.f12273u.setLocalMatrix(this.f12275w);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ued0 m17726d(RoundProgressBar roundProgressBar) {
        roundProgressBar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    private void m17727e(Canvas canvas, RectF rectF) {
        this.f12255c.setStyle(Paint.Style.STROKE);
        this.f12255c.setColor(this.f12256d);
        int i = this.f12264l;
        canvas.drawArc(rectF, i, this.f12265m - i, false, this.f12255c);
        BitmapShader bitmapShader = this.f12273u;
        if (bitmapShader != null) {
            this.f12255c.setShader(bitmapShader);
        }
        if (this.f12260h && this.f12261i != 0 && this.f12262j != 0 && this.f12274v == null) {
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            this.f12274v = new SweepGradient(fCenterX, fCenterY, new int[]{this.f12261i, this.f12262j}, (float[]) null);
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f, fCenterX, fCenterY);
            this.f12274v.setLocalMatrix(matrix);
        }
        SweepGradient sweepGradient = this.f12274v;
        if (sweepGradient != null) {
            this.f12255c.setShader(sweepGradient);
        }
        this.f12255c.setColor(this.f12258f);
        canvas.drawArc(rectF, this.f12264l, (this.f12269q * (this.f12265m - this.f12264l)) / getMax(), false, this.f12255c);
        this.f12255c.setShader(null);
    }

    /* JADX INFO: renamed from: f */
    public void m17728f() {
        this.f12278z.removeCallbacks(this.f12251B);
    }

    public int getCricleColor() {
        return this.f12256d;
    }

    public int getCricleProgressColor() {
        return this.f12258f;
    }

    public synchronized int getMax() {
        return this.f12268p;
    }

    public synchronized int getProgress() {
        return this.f12269q;
    }

    public int getRadius() {
        return this.f12272t;
    }

    public float getRoundWidth() {
        return this.f12267o;
    }

    public int getTextColor() {
        return this.f12263k;
    }

    public float getTextSize() {
        return this.f12266n;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float f = width;
        this.f12272t = (int) (f - (this.f12267o / 2.0f));
        this.f12255c.setColor(this.f12256d);
        this.f12255c.setStyle(Paint.Style.STROKE);
        this.f12255c.setStrokeWidth(this.f12267o);
        this.f12255c.setAntiAlias(true);
        this.f12255c.setStrokeCap(Paint.Cap.ROUND);
        this.f12255c.setColor(this.f12277y);
        this.f12255c.setStrokeWidth(0.0f);
        this.f12255c.setColor(this.f12263k);
        this.f12255c.setTextSize(this.f12266n);
        this.f12255c.setTypeface(Typeface.DEFAULT_BOLD);
        int i = (int) ((this.f12269q / this.f12268p) * 100.0f);
        float fMeasureText = this.f12255c.measureText(i + "%");
        this.f12255c.setShader(null);
        if (this.f12270r && i != 0 && this.f12271s == 0) {
            canvas.drawText(i + "%", f - (fMeasureText / 2.0f), f + (this.f12266n / 2.0f), this.f12255c);
        }
        this.f12255c.setStrokeWidth(this.f12267o);
        int i2 = this.f12272t;
        RectF rectF = new RectF(width - i2, width - i2, width + i2, width + i2);
        this.f12255c.setColor(this.f12256d);
        int i3 = this.f12271s;
        if (i3 == 0) {
            m17727e(canvas, rectF);
            return;
        }
        if (i3 != 1) {
            return;
        }
        this.f12255c.setStyle(Paint.Style.FILL_AND_STROKE);
        int i4 = this.f12269q;
        if (i4 != 0) {
            int i5 = this.f12264l;
            canvas.drawArc(rectF, i5 + 90, ((this.f12265m - i5) * i4) / this.f12268p, true, this.f12255c);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f12277y = i;
        postInvalidate();
    }

    public void setCricleColor(int i) {
        this.f12256d = i;
    }

    public void setCricleProgressColor(int i) {
        this.f12258f = i;
    }

    public void setGradientColor(int i) {
        this.f12262j = i;
    }

    public synchronized void setMax(int i) {
        try {
            if (i < 0) {
                throw new IllegalArgumentException("max not less than 0");
            }
            this.f12268p = i;
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
            int i2 = this.f12268p;
            if (i > i2) {
                i = i2;
            }
            if (i <= i2) {
                this.f12269q = i;
                postInvalidate();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setProgressAngle(int i) {
        this.f12252C = i;
        postInvalidate();
    }

    public void setRoundColor(int i) {
        this.f12256d = i;
        postInvalidate();
    }

    public void setRoundProgressColor(int i) {
        this.f12258f = i;
    }

    public void setRoundWidth(float f) {
        this.f12267o = f;
    }

    public void setStartColor(int i) {
        this.f12261i = i;
    }

    public void setTextColor(int i) {
        this.f12263k = i;
    }

    public void setTextSize(float f) {
        this.f12266n = f;
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f12254b = context;
    }

    public RoundProgressBar(Context context) {
        this(context, null);
        this.f12254b = context;
    }
}
