package p147v.image;

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
import p149l.b9c0;
import p149l.dqi0;
import p149l.ig3;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    public final RectF f209706a;

    /* JADX INFO: renamed from: b */
    public final RectF f209707b;

    /* JADX INFO: renamed from: c */
    public final RectF f209708c;

    /* JADX INFO: renamed from: d */
    public final Matrix f209709d;

    /* JADX INFO: renamed from: e */
    public final Paint f209710e;

    /* JADX INFO: renamed from: f */
    public final Paint f209711f;

    /* JADX INFO: renamed from: g */
    public final Paint f209712g;

    /* JADX INFO: renamed from: h */
    public final Paint f209713h;

    /* JADX INFO: renamed from: i */
    public int f209714i;

    /* JADX INFO: renamed from: j */
    public int f209715j;

    /* JADX INFO: renamed from: k */
    public int f209716k;

    /* JADX INFO: renamed from: l */
    public int f209717l;

    /* JADX INFO: renamed from: m */
    public int f209718m;

    /* JADX INFO: renamed from: n */
    public Bitmap f209719n;

    /* JADX INFO: renamed from: o */
    public BitmapShader f209720o;

    /* JADX INFO: renamed from: p */
    public int f209721p;

    /* JADX INFO: renamed from: q */
    public int f209722q;

    /* JADX INFO: renamed from: r */
    public float f209723r;

    /* JADX INFO: renamed from: s */
    public float f209724s;

    /* JADX INFO: renamed from: t */
    public float f209725t;

    /* JADX INFO: renamed from: u */
    public ColorFilter f209726u;

    /* JADX INFO: renamed from: v */
    public boolean f209727v;

    /* JADX INFO: renamed from: w */
    public boolean f209728w;

    /* JADX INFO: renamed from: x */
    public boolean f209729x;

    /* JADX INFO: renamed from: y */
    public boolean f209730y;

    /* JADX INFO: renamed from: z */
    public static final ImageView.ScaleType f209705z = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: A */
    public static final Bitmap.Config f209704A = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: v.image.CircleImageView$a */
    @RequiresApi(api = 21)
    public class C22608a extends ViewOutlineProvider {
        public C22608a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            CircleImageView.this.f209707b.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209706a = new RectF();
        this.f209707b = new RectF();
        this.f209708c = new RectF();
        this.f209709d = new Matrix();
        this.f209710e = new Paint();
        this.f209711f = new Paint();
        this.f209712g = new Paint();
        this.f209713h = new Paint();
        this.f209714i = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f209715j = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f209716k = 0;
        this.f209717l = 0;
        this.f209718m = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74239C5, i, 0);
        this.f209716k = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74260F5, 0);
        this.f209717l = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74288J5, 0);
        this.f209714i = typedArrayObtainStyledAttributes.getColor(b9c0.f74246D5, RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f209715j = typedArrayObtainStyledAttributes.getColor(b9c0.f74281I5, RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f209729x = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74253E5, false);
        if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74267G5)) {
            this.f209718m = typedArrayObtainStyledAttributes.getColor(b9c0.f74267G5, 0);
        } else if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74274H5)) {
            this.f209718m = typedArrayObtainStyledAttributes.getColor(b9c0.f74274H5, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        m223562f();
    }

    /* JADX INFO: renamed from: b */
    public final void m223558b() {
        this.f209710e.setColorFilter(this.f209726u);
    }

    /* JADX INFO: renamed from: c */
    public final RectF m223559c() {
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingStart = getPaddingStart() + ((width - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((height - iMin) / 2.0f);
        float f = iMin;
        return new RectF(paddingStart, paddingTop, paddingStart + f, f + paddingTop);
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap m223560d(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f209704A) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f209704A);
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
    public final boolean m223561e(float f, float f2) {
        return Math.pow((double) (f - this.f209707b.centerX()), 2.0d) + Math.pow((double) (f2 - this.f209707b.centerY()), 2.0d) <= Math.pow((double) this.f209724s, 2.0d);
    }

    /* JADX INFO: renamed from: f */
    public final void m223562f() {
        super.setScaleType(f209705z);
        this.f209727v = true;
        setOutlineProvider(new C22608a());
        if (this.f209728w) {
            m223564h();
            this.f209728w = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m223563g() {
        if (this.f209730y) {
            this.f209719n = null;
        } else {
            this.f209719n = m223560d(getDrawable());
        }
        m223564h();
    }

    public int getBorderColor() {
        return this.f209714i;
    }

    public int getBorderWidth() {
        return this.f209716k;
    }

    public int getCircleBackgroundColor() {
        return this.f209718m;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.f209726u;
    }

    @Deprecated
    public int getFillColor() {
        return getCircleBackgroundColor();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f209705z;
    }

    /* JADX INFO: renamed from: h */
    public final void m223564h() {
        int i;
        if (!this.f209727v) {
            this.f209728w = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.f209719n == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.f209719n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f209720o = new BitmapShader(bitmap, tileMode, tileMode);
        this.f209710e.setAntiAlias(true);
        this.f209710e.setShader(this.f209720o);
        Paint paint = this.f209711f;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f209711f.setAntiAlias(true);
        this.f209711f.setColor(this.f209714i);
        this.f209711f.setStrokeWidth(this.f209716k);
        this.f209712g.setStyle(style);
        this.f209712g.setAntiAlias(true);
        this.f209712g.setColor(this.f209715j);
        this.f209712g.setStrokeWidth(this.f209717l);
        this.f209713h.setStyle(Paint.Style.FILL);
        this.f209713h.setAntiAlias(true);
        this.f209713h.setColor(this.f209718m);
        this.f209722q = this.f209719n.getHeight();
        this.f209721p = this.f209719n.getWidth();
        this.f209708c.set(m223559c());
        RectF rectF = this.f209707b;
        RectF rectF2 = this.f209708c;
        float f = rectF2.left;
        int i2 = this.f209717l;
        rectF.left = f + i2;
        rectF.right = rectF2.right - i2;
        rectF.top = rectF2.top + i2;
        rectF.bottom = rectF2.bottom - i2;
        this.f209724s = Math.min((rectF.height() - this.f209716k) / 2.0f, (this.f209707b.width() - this.f209716k) / 2.0f);
        this.f209725t = Math.min((this.f209708c.height() - this.f209717l) / 2.0f, (this.f209708c.width() - this.f209717l) / 2.0f);
        this.f209706a.set(this.f209707b);
        if (!this.f209729x && (i = this.f209716k) > 0) {
            this.f209706a.inset(i - 1.0f, i - 1.0f);
        }
        this.f209723r = Math.min(this.f209706a.height() / 2.0f, this.f209706a.width() / 2.0f);
        m223558b();
        m223565i();
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public final void m223565i() {
        float fWidth;
        float fHeight;
        this.f209709d.set(null);
        float fHeight2 = this.f209721p * this.f209706a.height();
        float fWidth2 = this.f209706a.width() * this.f209722q;
        RectF rectF = this.f209706a;
        float fWidth3 = 0.0f;
        if (fHeight2 > fWidth2) {
            fWidth = rectF.height() / this.f209722q;
            fWidth3 = (this.f209706a.width() - (this.f209721p * fWidth)) * 0.5f;
            fHeight = 0.0f;
        } else {
            fWidth = rectF.width() / this.f209721p;
            fHeight = (this.f209706a.height() - (this.f209722q * fWidth)) * 0.5f;
        }
        this.f209709d.setScale(fWidth, fWidth);
        Matrix matrix = this.f209709d;
        RectF rectF2 = this.f209706a;
        matrix.postTranslate(((int) (fWidth3 + 0.5f)) + rectF2.left, ((int) (fHeight + 0.5f)) + rectF2.top);
        this.f209720o.setLocalMatrix(this.f209709d);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f209730y) {
            super.onDraw(canvas);
            return;
        }
        if (this.f209719n == null) {
            return;
        }
        if (this.f209718m != 0) {
            canvas.drawCircle(this.f209706a.centerX(), this.f209706a.centerY(), this.f209723r, this.f209713h);
        }
        canvas.drawCircle(this.f209706a.centerX(), this.f209706a.centerY(), this.f209723r, this.f209710e);
        if (this.f209716k > 0) {
            canvas.drawCircle(this.f209707b.centerX(), this.f209707b.centerY(), this.f209724s, this.f209711f);
        }
        if (this.f209717l > 0) {
            canvas.drawCircle(this.f209708c.centerX(), this.f209708c.centerY(), this.f209725t, this.f209712g);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m223564h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return m223561e(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            ig3.m135964a("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(@ColorInt int i) {
        if (i == this.f209714i) {
            return;
        }
        this.f209714i = i;
        this.f209711f.setShader(null);
        this.f209711f.setColor(this.f209714i);
        invalidate();
    }

    @Deprecated
    public void setBorderColorResource(@ColorRes int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.f209729x) {
            return;
        }
        this.f209729x = z;
        m223564h();
    }

    public void setBorderWidth(int i) {
        if (i == this.f209716k) {
            return;
        }
        this.f209716k = i;
        m223564h();
    }

    public void setCircleBackgroundColor(@ColorInt int i) {
        if (i == this.f209718m) {
            return;
        }
        this.f209718m = i;
        this.f209713h.setColor(i);
        invalidate();
    }

    public void setCircleBackgroundColorResource(@ColorRes int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f209726u) {
            return;
        }
        this.f209726u = colorFilter;
        m223558b();
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.f209730y == z) {
            return;
        }
        this.f209730y = z;
        m223563g();
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
        m223563g();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m223563g();
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        super.setImageResource(i);
        m223563g();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m223563g();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m223564h();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m223564h();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == f209705z) {
            return;
        }
        dqi0.m113073a("ScaleType %s not supported.", new Object[]{scaleType});
    }

    public void setSecondaryBorderColor(@ColorInt int i) {
        if (i == this.f209715j) {
            return;
        }
        this.f209715j = i;
        this.f209712g.setColor(i);
        invalidate();
    }

    public void setSecondaryBorderWidth(int i) {
        if (i == this.f209717l) {
            return;
        }
        this.f209717l = i;
        m223564h();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context) {
        super(context);
        this.f209706a = new RectF();
        this.f209707b = new RectF();
        this.f209708c = new RectF();
        this.f209709d = new Matrix();
        this.f209710e = new Paint();
        this.f209711f = new Paint();
        this.f209712g = new Paint();
        this.f209713h = new Paint();
        this.f209714i = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f209715j = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f209716k = 0;
        this.f209717l = 0;
        this.f209718m = 0;
        m223562f();
    }
}
