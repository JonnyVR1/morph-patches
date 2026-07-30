package p028v.image;

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
import l.b9c0;
import l.ig3;
import p003l.dqi0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    public final RectF f13331a;

    /* JADX INFO: renamed from: b */
    public final RectF f13332b;

    /* JADX INFO: renamed from: c */
    public final RectF f13333c;

    /* JADX INFO: renamed from: d */
    public final Matrix f13334d;

    /* JADX INFO: renamed from: e */
    public final Paint f13335e;

    /* JADX INFO: renamed from: f */
    public final Paint f13336f;

    /* JADX INFO: renamed from: g */
    public final Paint f13337g;

    /* JADX INFO: renamed from: h */
    public final Paint f13338h;

    /* JADX INFO: renamed from: i */
    public int f13339i;

    /* JADX INFO: renamed from: j */
    public int f13340j;

    /* JADX INFO: renamed from: k */
    public int f13341k;

    /* JADX INFO: renamed from: l */
    public int f13342l;

    /* JADX INFO: renamed from: m */
    public int f13343m;

    /* JADX INFO: renamed from: n */
    public Bitmap f13344n;

    /* JADX INFO: renamed from: o */
    public BitmapShader f13345o;

    /* JADX INFO: renamed from: p */
    public int f13346p;

    /* JADX INFO: renamed from: q */
    public int f13347q;

    /* JADX INFO: renamed from: r */
    public float f13348r;

    /* JADX INFO: renamed from: s */
    public float f13349s;

    /* JADX INFO: renamed from: t */
    public float f13350t;

    /* JADX INFO: renamed from: u */
    public ColorFilter f13351u;

    /* JADX INFO: renamed from: v */
    public boolean f13352v;

    /* JADX INFO: renamed from: w */
    public boolean f13353w;

    /* JADX INFO: renamed from: x */
    public boolean f13354x;

    /* JADX INFO: renamed from: y */
    public boolean f13355y;

    /* JADX INFO: renamed from: z */
    public static final ImageView.ScaleType f13330z = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: A */
    public static final Bitmap.Config f13329A = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: v.image.CircleImageView$a */
    @RequiresApi(api = 21)
    public class C1401a extends ViewOutlineProvider {
        public C1401a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            CircleImageView.this.f13332b.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13331a = new RectF();
        this.f13332b = new RectF();
        this.f13333c = new RectF();
        this.f13334d = new Matrix();
        this.f13335e = new Paint();
        this.f13336f = new Paint();
        this.f13337g = new Paint();
        this.f13338h = new Paint();
        this.f13339i = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f13340j = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f13341k = 0;
        this.f13342l = 0;
        this.f13343m = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.C5, i, 0);
        this.f13341k = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.F5, 0);
        this.f13342l = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.J5, 0);
        this.f13339i = typedArrayObtainStyledAttributes.getColor(b9c0.D5, RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f13340j = typedArrayObtainStyledAttributes.getColor(b9c0.I5, RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f13354x = typedArrayObtainStyledAttributes.getBoolean(b9c0.E5, false);
        if (typedArrayObtainStyledAttributes.hasValue(b9c0.G5)) {
            this.f13343m = typedArrayObtainStyledAttributes.getColor(b9c0.G5, 0);
        } else if (typedArrayObtainStyledAttributes.hasValue(b9c0.H5)) {
            this.f13343m = typedArrayObtainStyledAttributes.getColor(b9c0.H5, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        m12065f();
    }

    /* JADX INFO: renamed from: b */
    public final void m12061b() {
        this.f13335e.setColorFilter(this.f13351u);
    }

    /* JADX INFO: renamed from: c */
    public final RectF m12062c() {
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingStart = getPaddingStart() + ((width - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((height - iMin) / 2.0f);
        float f = iMin;
        return new RectF(paddingStart, paddingTop, paddingStart + f, f + paddingTop);
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap m12063d(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f13329A) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f13329A);
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
    public final boolean m12064e(float f, float f2) {
        return Math.pow((double) (f - this.f13332b.centerX()), 2.0d) + Math.pow((double) (f2 - this.f13332b.centerY()), 2.0d) <= Math.pow((double) this.f13349s, 2.0d);
    }

    /* JADX INFO: renamed from: f */
    public final void m12065f() {
        super.setScaleType(f13330z);
        this.f13352v = true;
        setOutlineProvider(new C1401a());
        if (this.f13353w) {
            m12067h();
            this.f13353w = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12066g() {
        if (this.f13355y) {
            this.f13344n = null;
        } else {
            this.f13344n = m12063d(getDrawable());
        }
        m12067h();
    }

    public int getBorderColor() {
        return this.f13339i;
    }

    public int getBorderWidth() {
        return this.f13341k;
    }

    public int getCircleBackgroundColor() {
        return this.f13343m;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.f13351u;
    }

    @Deprecated
    public int getFillColor() {
        return getCircleBackgroundColor();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f13330z;
    }

    /* JADX INFO: renamed from: h */
    public final void m12067h() {
        int i;
        if (!this.f13352v) {
            this.f13353w = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.f13344n == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.f13344n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f13345o = new BitmapShader(bitmap, tileMode, tileMode);
        this.f13335e.setAntiAlias(true);
        this.f13335e.setShader(this.f13345o);
        Paint paint = this.f13336f;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f13336f.setAntiAlias(true);
        this.f13336f.setColor(this.f13339i);
        this.f13336f.setStrokeWidth(this.f13341k);
        this.f13337g.setStyle(style);
        this.f13337g.setAntiAlias(true);
        this.f13337g.setColor(this.f13340j);
        this.f13337g.setStrokeWidth(this.f13342l);
        this.f13338h.setStyle(Paint.Style.FILL);
        this.f13338h.setAntiAlias(true);
        this.f13338h.setColor(this.f13343m);
        this.f13347q = this.f13344n.getHeight();
        this.f13346p = this.f13344n.getWidth();
        this.f13333c.set(m12062c());
        RectF rectF = this.f13332b;
        RectF rectF2 = this.f13333c;
        float f = rectF2.left;
        int i2 = this.f13342l;
        rectF.left = f + i2;
        rectF.right = rectF2.right - i2;
        rectF.top = rectF2.top + i2;
        rectF.bottom = rectF2.bottom - i2;
        this.f13349s = Math.min((rectF.height() - this.f13341k) / 2.0f, (this.f13332b.width() - this.f13341k) / 2.0f);
        this.f13350t = Math.min((this.f13333c.height() - this.f13342l) / 2.0f, (this.f13333c.width() - this.f13342l) / 2.0f);
        this.f13331a.set(this.f13332b);
        if (!this.f13354x && (i = this.f13341k) > 0) {
            this.f13331a.inset(i - 1.0f, i - 1.0f);
        }
        this.f13348r = Math.min(this.f13331a.height() / 2.0f, this.f13331a.width() / 2.0f);
        m12061b();
        m12068i();
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public final void m12068i() {
        float fWidth;
        float fHeight;
        this.f13334d.set(null);
        float fHeight2 = this.f13346p * this.f13331a.height();
        float fWidth2 = this.f13331a.width() * this.f13347q;
        RectF rectF = this.f13331a;
        float fWidth3 = 0.0f;
        if (fHeight2 > fWidth2) {
            fWidth = rectF.height() / this.f13347q;
            fWidth3 = (this.f13331a.width() - (this.f13346p * fWidth)) * 0.5f;
            fHeight = 0.0f;
        } else {
            fWidth = rectF.width() / this.f13346p;
            fHeight = (this.f13331a.height() - (this.f13347q * fWidth)) * 0.5f;
        }
        this.f13334d.setScale(fWidth, fWidth);
        Matrix matrix = this.f13334d;
        RectF rectF2 = this.f13331a;
        matrix.postTranslate(((int) (fWidth3 + 0.5f)) + rectF2.left, ((int) (fHeight + 0.5f)) + rectF2.top);
        this.f13345o.setLocalMatrix(this.f13334d);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f13355y) {
            super.onDraw(canvas);
            return;
        }
        if (this.f13344n == null) {
            return;
        }
        if (this.f13343m != 0) {
            canvas.drawCircle(this.f13331a.centerX(), this.f13331a.centerY(), this.f13348r, this.f13338h);
        }
        canvas.drawCircle(this.f13331a.centerX(), this.f13331a.centerY(), this.f13348r, this.f13335e);
        if (this.f13341k > 0) {
            canvas.drawCircle(this.f13332b.centerX(), this.f13332b.centerY(), this.f13349s, this.f13336f);
        }
        if (this.f13342l > 0) {
            canvas.drawCircle(this.f13333c.centerX(), this.f13333c.centerY(), this.f13350t, this.f13337g);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m12067h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return m12064e(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            ig3.a("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(@ColorInt int i) {
        if (i == this.f13339i) {
            return;
        }
        this.f13339i = i;
        this.f13336f.setShader(null);
        this.f13336f.setColor(this.f13339i);
        invalidate();
    }

    @Deprecated
    public void setBorderColorResource(@ColorRes int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.f13354x) {
            return;
        }
        this.f13354x = z;
        m12067h();
    }

    public void setBorderWidth(int i) {
        if (i == this.f13341k) {
            return;
        }
        this.f13341k = i;
        m12067h();
    }

    public void setCircleBackgroundColor(@ColorInt int i) {
        if (i == this.f13343m) {
            return;
        }
        this.f13343m = i;
        this.f13338h.setColor(i);
        invalidate();
    }

    public void setCircleBackgroundColorResource(@ColorRes int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f13351u) {
            return;
        }
        this.f13351u = colorFilter;
        m12061b();
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.f13355y == z) {
            return;
        }
        this.f13355y = z;
        m12066g();
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
        m12066g();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m12066g();
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        super.setImageResource(i);
        m12066g();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m12066g();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m12067h();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m12067h();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == f13330z) {
            return;
        }
        dqi0.m3632a("ScaleType %s not supported.", new Object[]{scaleType});
    }

    public void setSecondaryBorderColor(@ColorInt int i) {
        if (i == this.f13340j) {
            return;
        }
        this.f13340j = i;
        this.f13337g.setColor(i);
        invalidate();
    }

    public void setSecondaryBorderWidth(int i) {
        if (i == this.f13342l) {
            return;
        }
        this.f13342l = i;
        m12067h();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context) {
        super(context);
        this.f13331a = new RectF();
        this.f13332b = new RectF();
        this.f13333c = new RectF();
        this.f13334d = new Matrix();
        this.f13335e = new Paint();
        this.f13336f = new Paint();
        this.f13337g = new Paint();
        this.f13338h = new Paint();
        this.f13339i = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f13340j = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f13341k = 0;
        this.f13342l = 0;
        this.f13343m = 0;
        m12065f();
    }
}
