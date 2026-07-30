package com.p051p1.mobile.putong.core.p058ui.home;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.p051p1.mobile.putong.core.p058ui.BounceView;
import com.p051p1.mobile.putong.core.p058ui.C8438a;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.jyb;
import p153l.l01;
import p153l.l9k;
import p153l.nhc0;
import p153l.pf60;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class BounceButton extends BounceView {

    /* JADX INFO: renamed from: A */
    public boolean f30476A;

    /* JADX INFO: renamed from: B */
    public boolean f30477B;

    /* JADX INFO: renamed from: C */
    public boolean f30478C;

    /* JADX INFO: renamed from: D */
    public float f30479D;

    /* JADX INFO: renamed from: E */
    public RectF f30480E;

    /* JADX INFO: renamed from: F */
    public RectF f30481F;

    /* JADX INFO: renamed from: G */
    public LinearGradient f30482G;

    /* JADX INFO: renamed from: H */
    public LinearGradient f30483H;

    /* JADX INFO: renamed from: b */
    public final String f30484b;

    /* JADX INFO: renamed from: c */
    public int f30485c;

    /* JADX INFO: renamed from: d */
    public final int f30486d;

    /* JADX INFO: renamed from: e */
    public final int f30487e;

    /* JADX INFO: renamed from: f */
    public final int f30488f;

    /* JADX INFO: renamed from: g */
    public final int f30489g;

    /* JADX INFO: renamed from: h */
    public final int f30490h;

    /* JADX INFO: renamed from: i */
    public final int f30491i;

    /* JADX INFO: renamed from: j */
    public final int f30492j;

    /* JADX INFO: renamed from: k */
    public float f30493k;

    /* JADX INFO: renamed from: l */
    public float f30494l;

    /* JADX INFO: renamed from: m */
    public float f30495m;

    /* JADX INFO: renamed from: n */
    public float f30496n;

    /* JADX INFO: renamed from: o */
    public float f30497o;

    /* JADX INFO: renamed from: p */
    public float f30498p;

    /* JADX INFO: renamed from: q */
    public Paint f30499q;

    /* JADX INFO: renamed from: r */
    public Paint f30500r;

    /* JADX INFO: renamed from: s */
    public Paint f30501s;

    /* JADX INFO: renamed from: t */
    public Paint f30502t;

    /* JADX INFO: renamed from: u */
    public Drawable f30503u;

    /* JADX INFO: renamed from: v */
    public Drawable f30504v;

    /* JADX INFO: renamed from: w */
    public Drawable f30505w;

    /* JADX INFO: renamed from: x */
    public float f30506x;

    /* JADX INFO: renamed from: y */
    public l01<Integer, pf60<Float, Bitmap>> f30507y;

    /* JADX INFO: renamed from: z */
    public float f30508z;

    public BounceButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30484b = getClass().getSimpleName();
        this.f30485c = Color.parseColor("#efede8");
        this.f30486d = Color.parseColor("#1f979797");
        this.f30487e = Color.parseColor("#00979797");
        this.f30488f = Color.parseColor("#00ffffff");
        this.f30489g = Color.parseColor("#85ffffff");
        this.f30490h = Color.parseColor("#ffffff");
        this.f30491i = Color.parseColor("#D8D8D8");
        this.f30492j = Color.parseColor("#ec553f");
        this.f30498p = qa00.m175859d(1.0f);
        this.f30503u = null;
        this.f30504v = null;
        this.f30505w = null;
        this.f30507y = new l01<>();
        this.f30476A = true;
        this.f30477B = true;
        m47252d(context, attributeSet);
        m47251c();
    }

    /* JADX INFO: renamed from: b */
    private void m47250b(Canvas canvas, float f) {
        float f2 = f / (this.f28819a.f29037c / 2.0f);
        this.f30501s.setStrokeWidth(this.f30498p);
        this.f30501s.setColor(this.f30491i);
        float f3 = this.f30506x;
        float f4 = this.f30498p;
        canvas.drawCircle(f3, f3 + f4, f - (f4 / 2.0f), this.f30501s);
        this.f30499q.setColor(this.f30490h);
        float f5 = this.f30506x;
        canvas.drawCircle(f5, f5, f, this.f30499q);
        if (NullChecker.m82486a(this.f30503u)) {
            Bitmap bitmap = ((BitmapDrawable) this.f30503u).getBitmap();
            float f6 = this.f30506x;
            float f7 = this.f30495m;
            float f8 = f6 - ((f7 / 2.0f) * f2);
            if (f8 > 0.0f) {
                boolean z = this.f30476A;
                int i = (int) ((z ? 1 : -1) * f8);
                if (!z) {
                    canvas.drawBitmap(l9k.m153435a(bitmap, f7 * f2, f7 * f2), f8, f8, this.f30499q);
                    return;
                }
                if (this.f30507y.containsKey(Integer.valueOf(i))) {
                    canvas.drawBitmap(this.f30507y.get(Integer.valueOf(i)).f152157b, this.f30507y.get(Integer.valueOf(i)).f152156a.floatValue(), this.f30507y.get(Integer.valueOf(i)).f152156a.floatValue(), this.f30499q);
                    return;
                }
                float f9 = this.f30495m;
                Bitmap bitmapM153435a = l9k.m153435a(bitmap, f9 * f2, f9 * f2);
                canvas.drawBitmap(bitmapM153435a, f8, f8, this.f30499q);
                if (this.f30476A) {
                    this.f30507y.put(Integer.valueOf(i), jyb.m147494Y(Float.valueOf(f8), bitmapM153435a));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m47251c() {
        Paint paint = new Paint();
        this.f30499q = paint;
        paint.setAntiAlias(true);
        this.f30499q.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f30500r = paint2;
        paint2.setAntiAlias(true);
        this.f30500r.setStrokeWidth(this.f30498p);
        Paint paint3 = this.f30500r;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f30501s = paint4;
        paint4.setAntiAlias(true);
        this.f30501s.setStyle(style);
        Paint paint5 = new Paint();
        this.f30502t = paint5;
        paint5.setAntiAlias(true);
        this.f30502t.setStyle(style);
        this.f30502t.setStrokeCap(Paint.Cap.ROUND);
        this.f30480E = new RectF();
        this.f30481F = new RectF();
    }

    /* JADX INFO: renamed from: d */
    private void m47252d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nhc0.f141964d);
        this.f30497o = typedArrayObtainStyledAttributes.getDimension(nhc0.f141969i, 0.0f);
        float dimension = typedArrayObtainStyledAttributes.getDimension(nhc0.f141968h, qa00.m175859d(26.0f));
        this.f30496n = dimension;
        this.f30495m = dimension;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(nhc0.f141966f);
        this.f30505w = drawable;
        this.f30503u = drawable;
        this.f30504v = typedArrayObtainStyledAttributes.getDrawable(nhc0.f141967g);
        this.f30477B = typedArrayObtainStyledAttributes.getBoolean(nhc0.f141965e, true);
        this.f30478C = typedArrayObtainStyledAttributes.getBoolean(nhc0.f141970j, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    private int m47253f(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m47254a(Canvas canvas, float f) {
        float f2 = this.f30494l / 2.0f;
        float f3 = f2 - f;
        this.f30501s.setStrokeWidth(f3);
        this.f30501s.setColor(this.f30485c);
        float f4 = this.f30506x;
        canvas.drawCircle(f4, f4, (f3 / 2.0f) + f, this.f30501s);
        if (this.f30479D <= 0.0f) {
            this.f30479D = f;
        }
        if (this.f30478C) {
            float f5 = this.f30508z;
            if (f5 > 0.0f && f5 <= 1.0f) {
                float f6 = this.f30506x;
                float f7 = this.f30479D;
                RectF rectF = new RectF(f6 - (((f2 - f7) / 2.0f) + f7), f6 - (((f2 - f7) / 2.0f) + f7), ((f2 - f7) / 2.0f) + f7 + f6, f6 + f7 + ((f2 - f7) / 2.0f));
                this.f30502t.setStrokeWidth(f2 - this.f30479D);
                this.f30502t.setColor(this.f30492j);
                canvas.drawArc(rectF, -90.0f, this.f30508z * 360.0f, false, this.f30502t);
            }
        }
        RectF rectF2 = this.f30481F;
        float f8 = this.f30506x;
        rectF2.set(f8 - f2, f8 - f2, f8 + f2, f8 + f2);
        this.f30500r.setShader(this.f30482G);
        canvas.drawArc(this.f30481F, 0.0f, 360.0f, false, this.f30500r);
        if (this.f30477B) {
            RectF rectF3 = this.f30480E;
            float f9 = this.f30506x;
            float f10 = this.f30498p;
            rectF3.set((f9 - f2) - f10, (f9 - f2) - f10, f9 + f2 + f10, f9 + f2 + f10);
            this.f30500r.setShader(this.f30483H);
            canvas.drawArc(this.f30480E, 0.0f, 360.0f, false, this.f30500r);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m47255e() {
        float f = this.f30494l;
        int i = this.f30486d;
        int i2 = this.f30487e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f30482G = new LinearGradient(0.0f, 0.0f, 0.0f, f, i, i2, tileMode);
        this.f30483H = new LinearGradient(0.0f, 0.0f, 0.0f, this.f30494l + (this.f30498p * 2.0f), this.f30488f, this.f30489g, tileMode);
    }

    public bnl0.C16067g getInnerButtonPos() {
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(this);
        bnl0.C16067g c16067g = new bnl0.C16067g();
        c16067g.f77559a = (int) (c16067gM105560i0.f77559a + ((getWidth() - this.f28819a.f29037c) / 2.0f));
        float f = c16067gM105560i0.f77560b;
        float height = getHeight();
        float f2 = this.f28819a.f29037c;
        c16067g.f77560b = (int) (f + ((height - f2) / 2.0f));
        int i = (int) f2;
        c16067g.f77562d = i;
        c16067g.f77561c = i;
        return c16067g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fM45277j = this.f28819a.m45277j();
        m47254a(canvas, fM45277j);
        m47250b(canvas, fM45277j);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width = getWidth();
        this.f30493k = width;
        float f = this.f30497o;
        if (f != 0.0f) {
            this.f30495m = (width / f) * this.f30496n;
        }
        float fM175859d = width - qa00.m175859d(4.0f);
        this.f30494l = fM175859d;
        this.f30506x = this.f30493k / 2.0f;
        this.f28819a.m45278k(fM175859d - (fM175859d / 9.0f));
        m47255e();
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(m47253f(i), m47253f(i));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f30507y.clear();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f28819a.m45276i(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBorderOuterCircle(boolean z) {
        if (this.f30477B == z) {
            return;
        }
        this.f30477B = z;
        invalidate();
    }

    public void setCenterIconWidth(int i) {
        float f = i;
        this.f30496n = f;
        this.f30495m = f;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f30503u) {
            return;
        }
        this.f30503u = drawable;
        this.f30507y.clear();
        invalidate();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.BounceView
    public void setLongPressingListener(C8438a.d dVar) {
        this.f28819a.f29046l = dVar;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.BounceView
    public void setProgress(float f) {
        if (this.f30508z == f) {
            return;
        }
        this.f30508z = f;
        invalidate();
    }

    public BounceButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30484b = getClass().getSimpleName();
        this.f30485c = Color.parseColor("#efede8");
        this.f30486d = Color.parseColor("#1f979797");
        this.f30487e = Color.parseColor("#00979797");
        this.f30488f = Color.parseColor("#00ffffff");
        this.f30489g = Color.parseColor("#85ffffff");
        this.f30490h = Color.parseColor("#ffffff");
        this.f30491i = Color.parseColor("#D8D8D8");
        this.f30492j = Color.parseColor("#ec553f");
        this.f30498p = qa00.m175859d(1.0f);
        this.f30503u = null;
        this.f30504v = null;
        this.f30505w = null;
        this.f30507y = new l01<>();
        this.f30476A = true;
        this.f30477B = true;
        m47252d(context, attributeSet);
        m47251c();
    }
}
