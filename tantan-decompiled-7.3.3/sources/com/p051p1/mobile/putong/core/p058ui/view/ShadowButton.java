package com.p051p1.mobile.putong.core.p058ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;
import p153l.jyb;
import p153l.l01;
import p153l.l9k;
import p153l.ohc0;
import p153l.pf60;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class ShadowButton extends BounceView {

    /* JADX INFO: renamed from: b */
    public final String f37700b;

    /* JADX INFO: renamed from: c */
    public final int f37701c;

    /* JADX INFO: renamed from: d */
    public int f37702d;

    /* JADX INFO: renamed from: e */
    public int f37703e;

    /* JADX INFO: renamed from: f */
    public float f37704f;

    /* JADX INFO: renamed from: g */
    public float f37705g;

    /* JADX INFO: renamed from: h */
    public float f37706h;

    /* JADX INFO: renamed from: i */
    public float f37707i;

    /* JADX INFO: renamed from: j */
    public Paint f37708j;

    /* JADX INFO: renamed from: k */
    public Paint f37709k;

    /* JADX INFO: renamed from: l */
    public Drawable f37710l;

    /* JADX INFO: renamed from: m */
    public float f37711m;

    /* JADX INFO: renamed from: n */
    public boolean f37712n;

    /* JADX INFO: renamed from: o */
    public boolean f37713o;

    /* JADX INFO: renamed from: p */
    public boolean f37714p;

    /* JADX INFO: renamed from: q */
    public boolean f37715q;

    /* JADX INFO: renamed from: r */
    public Drawable f37716r;

    /* JADX INFO: renamed from: s */
    public Drawable f37717s;

    /* JADX INFO: renamed from: t */
    public float f37718t;

    /* JADX INFO: renamed from: u */
    public int f37719u;

    /* JADX INFO: renamed from: v */
    public l01<Integer, pf60<Float, Bitmap>> f37720v;

    public ShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37700b = getClass().getSimpleName();
        this.f37701c = Color.parseColor("#ffffff");
        this.f37710l = null;
        this.f37715q = true;
        this.f37716r = null;
        this.f37717s = null;
        this.f37720v = new l01<>();
        m57351d();
        m57348e(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    private void m57348e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ohc0.f147394f0);
        this.f37707i = typedArrayObtainStyledAttributes.getDimension(ohc0.f147430x0, isInEditMode() ? context.getResources().getDisplayMetrics().density * 4.0f : qa00.m175859d(4.0f));
        this.f37705g = typedArrayObtainStyledAttributes.getDimension(ohc0.f147422t0, 0.0f);
        this.f37706h = typedArrayObtainStyledAttributes.getDimension(ohc0.f147420s0, 0.0f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(ohc0.f147416q0);
        this.f37717s = drawable;
        this.f37710l = drawable;
        this.f37716r = typedArrayObtainStyledAttributes.getDrawable(ohc0.f147418r0);
        this.f37702d = typedArrayObtainStyledAttributes.getColor(ohc0.f147424u0, Color.parseColor("#3dec543d"));
        this.f37703e = typedArrayObtainStyledAttributes.getColor(ohc0.f147426v0, Color.parseColor("#1eec543d"));
        this.f37712n = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147396g0, false);
        this.f37713o = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147428w0, false);
        this.f37718t = typedArrayObtainStyledAttributes.getDimension(ohc0.f147400i0, 0.0f);
        this.f37719u = typedArrayObtainStyledAttributes.getColor(ohc0.f147398h0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public int m57349a(int i, float f) {
        float f2 = ((f - 1.0f) * 8.0f) + 1.0f;
        float f3 = f2 >= 1.0f ? f2 : 1.0f;
        int iAlpha = Color.alpha(i);
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (iAlpha < 200) {
            float f4 = f3 * iAlpha;
            iAlpha = f4 > 255.0f ? 255 : (int) f4;
        } else {
            float f5 = iRed * f3;
            iRed = f5 > 255.0f ? 255 : (int) f5;
            float f6 = iGreen * f3;
            iGreen = f6 > 255.0f ? 255 : (int) f6;
            float f7 = iBlue * f3;
            iBlue = f7 > 255.0f ? 255 : (int) f7;
        }
        return Color.argb(iAlpha, iRed, iGreen, iBlue);
    }

    /* JADX INFO: renamed from: b */
    public void m57350b(Canvas canvas) {
        this.f37709k.setColor(this.f37719u);
        float fM175859d = isInEditMode() ? getContext().getResources().getDisplayMetrics().density * 1.0f : qa00.m175859d(1.0f);
        float f = this.f37718t;
        if (f >= fM175859d) {
            fM175859d = f;
        }
        this.f37709k.setStrokeWidth(fM175859d);
        float f2 = this.f37711m;
        canvas.drawCircle(f2, f2, (this.f37573a.f37754d / 2.0f) - fM175859d, this.f37709k);
    }

    /* JADX INFO: renamed from: c */
    public void mo57293c(Canvas canvas, float f) {
        float f2 = f / (this.f37573a.f37753c / 2.0f);
        this.f37708j.setColor(this.f37701c);
        if (this.f37713o) {
            Paint paint = this.f37708j;
            float f3 = this.f37707i;
            paint.setShadowLayer(f3, 0.0f, f3, m57349a(this.f37702d, f2));
            float f4 = this.f37711m;
            canvas.drawCircle(f4, f4, f, this.f37708j);
            this.f37708j.setShadowLayer(this.f37707i, 0.0f, 0.0f, m57349a(this.f37703e, f2));
        }
        float f5 = this.f37711m;
        canvas.drawCircle(f5, f5, f, this.f37708j);
        this.f37708j.clearShadowLayer();
        if (NullChecker.m82486a(this.f37710l)) {
            Bitmap bitmap = ((BitmapDrawable) this.f37710l).getBitmap();
            float f6 = this.f37711m;
            float f7 = this.f37705g;
            float f8 = f6 - ((f7 / 2.0f) * f2);
            float f9 = f6 - ((this.f37706h / 2.0f) * f2);
            if (f8 <= 0.0f || f9 <= 0.0f) {
                return;
            }
            int i = (int) f8;
            if (!this.f37715q) {
                canvas.drawBitmap(l9k.m153435a(bitmap, f7 * f2, f7 * f2), f8, f8, this.f37708j);
                return;
            }
            if (this.f37720v.containsKey(Integer.valueOf(i))) {
                canvas.drawBitmap(this.f37720v.get(Integer.valueOf(i)).f152157b, this.f37720v.get(Integer.valueOf(i)).f152156a.floatValue(), this.f37720v.get(Integer.valueOf(i)).f152156a.floatValue(), this.f37708j);
                return;
            }
            float f10 = this.f37705g;
            Bitmap bitmapM153435a = l9k.m153435a(bitmap, f10 * f2, f10 * f2);
            canvas.drawBitmap(bitmapM153435a, f8, f8, this.f37708j);
            if (this.f37715q) {
                this.f37720v.put(Integer.valueOf(i), jyb.m147494Y(Float.valueOf(f8), bitmapM153435a));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m57351d() {
        Paint paint = new Paint();
        this.f37708j = paint;
        paint.setAntiAlias(true);
        this.f37708j.setStyle(Paint.Style.FILL);
        setLayerType(1, this.f37708j);
        Paint paint2 = new Paint();
        this.f37709k = paint2;
        paint2.setAntiAlias(true);
        this.f37709k.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: f */
    public final int m57352f(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo57293c(canvas, this.f37573a.m57376j());
        if (this.f37718t > 0.0f) {
            m57350b(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width = getWidth();
        this.f37704f = width;
        float f = this.f37713o ? this.f37707i : 0.0f;
        this.f37707i = f;
        this.f37573a.m57377k(width - (f * 4.0f));
        C9098a c9098a = this.f37573a;
        c9098a.f37759i = this.f37712n;
        this.f37711m = this.f37704f / 2.0f;
        float f2 = this.f37705g;
        if (f2 == 0.0f) {
            f2 = c9098a.f37754d / 4.0f;
        }
        this.f37705g = f2;
        float f3 = this.f37706h;
        if (f3 != 0.0f) {
            f2 = f3;
        }
        this.f37706h = f2;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f37714p) {
            return;
        }
        setMeasuredDimension(m57352f(i), m57352f(i));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f37573a.m57375i(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setBordersize(float f) {
        this.f37718t = f;
    }

    public void setIcon(Drawable drawable) {
        this.f37710l = drawable;
        invalidate();
    }

    public void setIconHeight(float f) {
        this.f37706h = f;
    }

    public void setIconWidth(float f) {
        this.f37705g = f;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.BounceView
    public void setLongPressingListener(C9098a.d dVar) {
        this.f37573a.getClass();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.BounceView
    public void setProgress(float f) {
    }

    public ShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37700b = getClass().getSimpleName();
        this.f37701c = Color.parseColor("#ffffff");
        this.f37710l = null;
        this.f37715q = true;
        this.f37716r = null;
        this.f37717s = null;
        this.f37720v = new l01<>();
        m57351d();
        m57348e(context, attributeSet);
    }
}
