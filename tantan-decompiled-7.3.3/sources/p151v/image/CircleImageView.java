package p151v.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;
import p153l.gzi0;
import p153l.hhc0;
import p153l.wg3;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    public final RectF f210628a;

    /* JADX INFO: renamed from: b */
    public final RectF f210629b;

    /* JADX INFO: renamed from: c */
    public final RectF f210630c;

    /* JADX INFO: renamed from: d */
    public final Matrix f210631d;

    /* JADX INFO: renamed from: e */
    public final Paint f210632e;

    /* JADX INFO: renamed from: f */
    public final Paint f210633f;

    /* JADX INFO: renamed from: g */
    public final Paint f210634g;

    /* JADX INFO: renamed from: h */
    public final Paint f210635h;

    /* JADX INFO: renamed from: i */
    public int f210636i;

    /* JADX INFO: renamed from: j */
    public int f210637j;

    /* JADX INFO: renamed from: k */
    public int f210638k;

    /* JADX INFO: renamed from: l */
    public int f210639l;

    /* JADX INFO: renamed from: m */
    public int f210640m;

    /* JADX INFO: renamed from: n */
    public Bitmap f210641n;

    /* JADX INFO: renamed from: o */
    public BitmapShader f210642o;

    /* JADX INFO: renamed from: p */
    public int f210643p;

    /* JADX INFO: renamed from: q */
    public int f210644q;

    /* JADX INFO: renamed from: r */
    public float f210645r;

    /* JADX INFO: renamed from: s */
    public float f210646s;

    /* JADX INFO: renamed from: t */
    public float f210647t;

    /* JADX INFO: renamed from: u */
    public ColorFilter f210648u;

    /* JADX INFO: renamed from: v */
    public boolean f210649v;

    /* JADX INFO: renamed from: w */
    public boolean f210650w;

    /* JADX INFO: renamed from: x */
    public boolean f210651x;

    /* JADX INFO: renamed from: y */
    public boolean f210652y;

    /* JADX INFO: renamed from: z */
    public static final ImageView.ScaleType f210627z = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: A */
    public static final Bitmap.Config f210626A = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: v.image.CircleImageView$a */
    @RequiresApi(api = 21)
    public class C22723a extends ViewOutlineProvider {
        public C22723a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            CircleImageView.this.f210629b.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210628a = new RectF();
        this.f210629b = new RectF();
        this.f210630c = new RectF();
        this.f210631d = new Matrix();
        this.f210632e = new Paint();
        this.f210633f = new Paint();
        this.f210634g = new Paint();
        this.f210635h = new Paint();
        this.f210636i = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f210637j = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f210638k = 0;
        this.f210639l = 0;
        this.f210640m = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109548C5, i, 0);
        this.f210638k = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109569F5, 0);
        this.f210639l = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109597J5, 0);
        this.f210636i = typedArrayObtainStyledAttributes.getColor(hhc0.f109555D5, RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f210637j = typedArrayObtainStyledAttributes.getColor(hhc0.f109590I5, RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f210651x = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109562E5, false);
        if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109576G5)) {
            this.f210640m = typedArrayObtainStyledAttributes.getColor(hhc0.f109576G5, 0);
        } else if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109583H5)) {
            this.f210640m = typedArrayObtainStyledAttributes.getColor(hhc0.f109583H5, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        m224808f();
    }

    /* JADX INFO: renamed from: b */
    public final void m224804b() {
        this.f210632e.setColorFilter(this.f210648u);
    }

    /* JADX INFO: renamed from: c */
    public final RectF m224805c() {
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingStart = getPaddingStart() + ((width - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((height - iMin) / 2.0f);
        float f = iMin;
        return new RectF(paddingStart, paddingTop, paddingStart + f, f + paddingTop);
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap m224806d(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f210626A) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f210626A);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m224807e(float f, float f2) {
        return Math.pow((double) (f - this.f210629b.centerX()), 2.0d) + Math.pow((double) (f2 - this.f210629b.centerY()), 2.0d) <= Math.pow((double) this.f210646s, 2.0d);
    }

    /* JADX INFO: renamed from: f */
    public final void m224808f() {
        super.setScaleType(f210627z);
        this.f210649v = true;
        setOutlineProvider(new C22723a());
        if (this.f210650w) {
            m224810h();
            this.f210650w = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m224809g() {
        if (this.f210652y) {
            this.f210641n = null;
        } else {
            this.f210641n = m224806d(getDrawable());
        }
        m224810h();
    }

    public int getBorderColor() {
        return this.f210636i;
    }

    public int getBorderWidth() {
        return this.f210638k;
    }

    public int getCircleBackgroundColor() {
        return this.f210640m;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.f210648u;
    }

    @Deprecated
    public int getFillColor() {
        return getCircleBackgroundColor();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f210627z;
    }

    /* JADX INFO: renamed from: h */
    public final void m224810h() {
        int i;
        if (!this.f210649v) {
            this.f210650w = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.f210641n == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.f210641n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f210642o = new BitmapShader(bitmap, tileMode, tileMode);
        this.f210632e.setAntiAlias(true);
        this.f210632e.setShader(this.f210642o);
        Paint paint = this.f210633f;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f210633f.setAntiAlias(true);
        this.f210633f.setColor(this.f210636i);
        this.f210633f.setStrokeWidth(this.f210638k);
        this.f210634g.setStyle(style);
        this.f210634g.setAntiAlias(true);
        this.f210634g.setColor(this.f210637j);
        this.f210634g.setStrokeWidth(this.f210639l);
        this.f210635h.setStyle(Paint.Style.FILL);
        this.f210635h.setAntiAlias(true);
        this.f210635h.setColor(this.f210640m);
        this.f210644q = this.f210641n.getHeight();
        this.f210643p = this.f210641n.getWidth();
        this.f210630c.set(m224805c());
        RectF rectF = this.f210629b;
        RectF rectF2 = this.f210630c;
        float f = rectF2.left;
        int i2 = this.f210639l;
        rectF.left = f + i2;
        rectF.right = rectF2.right - i2;
        rectF.top = rectF2.top + i2;
        rectF.bottom = rectF2.bottom - i2;
        this.f210646s = Math.min((rectF.height() - this.f210638k) / 2.0f, (this.f210629b.width() - this.f210638k) / 2.0f);
        this.f210647t = Math.min((this.f210630c.height() - this.f210639l) / 2.0f, (this.f210630c.width() - this.f210639l) / 2.0f);
        this.f210628a.set(this.f210629b);
        if (!this.f210651x && (i = this.f210638k) > 0) {
            this.f210628a.inset(i - 1.0f, i - 1.0f);
        }
        this.f210645r = Math.min(this.f210628a.height() / 2.0f, this.f210628a.width() / 2.0f);
        m224804b();
        m224811i();
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public final void m224811i() {
        float fWidth;
        float fHeight;
        this.f210631d.set(null);
        float fHeight2 = this.f210643p * this.f210628a.height();
        float fWidth2 = this.f210628a.width() * this.f210644q;
        RectF rectF = this.f210628a;
        float fWidth3 = 0.0f;
        if (fHeight2 > fWidth2) {
            fWidth = rectF.height() / this.f210644q;
            fWidth3 = (this.f210628a.width() - (this.f210643p * fWidth)) * 0.5f;
            fHeight = 0.0f;
        } else {
            fWidth = rectF.width() / this.f210643p;
            fHeight = (this.f210628a.height() - (this.f210644q * fWidth)) * 0.5f;
        }
        this.f210631d.setScale(fWidth, fWidth);
        Matrix matrix = this.f210631d;
        RectF rectF2 = this.f210628a;
        matrix.postTranslate(((int) (fWidth3 + 0.5f)) + rectF2.left, ((int) (fHeight + 0.5f)) + rectF2.top);
        this.f210642o.setLocalMatrix(this.f210631d);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f210652y) {
            super.onDraw(canvas);
            return;
        }
        if (this.f210641n == null) {
            return;
        }
        if (this.f210640m != 0) {
            canvas.drawCircle(this.f210628a.centerX(), this.f210628a.centerY(), this.f210645r, this.f210635h);
        }
        canvas.drawCircle(this.f210628a.centerX(), this.f210628a.centerY(), this.f210645r, this.f210632e);
        if (this.f210638k > 0) {
            canvas.drawCircle(this.f210629b.centerX(), this.f210629b.centerY(), this.f210646s, this.f210633f);
        }
        if (this.f210639l > 0) {
            canvas.drawCircle(this.f210630c.centerX(), this.f210630c.centerY(), this.f210647t, this.f210634g);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m224810h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return m224807e(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            wg3.m206174a("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(@ColorInt int i) {
        if (i == this.f210636i) {
            return;
        }
        this.f210636i = i;
        this.f210633f.setShader(null);
        this.f210633f.setColor(this.f210636i);
        invalidate();
    }

    @Deprecated
    public void setBorderColorResource(@ColorRes int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.f210651x) {
            return;
        }
        this.f210651x = z;
        m224810h();
    }

    public void setBorderWidth(int i) {
        if (i == this.f210638k) {
            return;
        }
        this.f210638k = i;
        m224810h();
    }

    public void setCircleBackgroundColor(@ColorInt int i) {
        if (i == this.f210640m) {
            return;
        }
        this.f210640m = i;
        this.f210635h.setColor(i);
        invalidate();
    }

    public void setCircleBackgroundColorResource(@ColorRes int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f210648u) {
            return;
        }
        this.f210648u = colorFilter;
        m224804b();
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.f210652y == z) {
            return;
        }
        this.f210652y = z;
        m224809g();
    }

    @Deprecated
    public void setFillColor(@ColorInt int i) {
        setCircleBackgroundColor(i);
    }

    @Deprecated
    public void setFillColorResource(@ColorRes int i) {
        setCircleBackgroundColorResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m224809g();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m224809g();
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        super.setImageResource(i);
        m224809g();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m224809g();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m224810h();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m224810h();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == f210627z) {
            return;
        }
        gzi0.m133102a("ScaleType %s not supported.", new Object[]{scaleType});
    }

    public void setSecondaryBorderColor(@ColorInt int i) {
        if (i == this.f210637j) {
            return;
        }
        this.f210637j = i;
        this.f210634g.setColor(i);
        invalidate();
    }

    public void setSecondaryBorderWidth(int i) {
        if (i == this.f210639l) {
            return;
        }
        this.f210639l = i;
        m224810h();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context) {
        super(context);
        this.f210628a = new RectF();
        this.f210629b = new RectF();
        this.f210630c = new RectF();
        this.f210631d = new Matrix();
        this.f210632e = new Paint();
        this.f210633f = new Paint();
        this.f210634g = new Paint();
        this.f210635h = new Paint();
        this.f210636i = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f210637j = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f210638k = 0;
        this.f210639l = 0;
        this.f210640m = 0;
        m224808f();
    }
}
