package p149l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class wjf0 extends Drawable {

    /* JADX INFO: renamed from: c */
    public float f186638c;

    /* JADX INFO: renamed from: d */
    public float f186639d;

    /* JADX INFO: renamed from: e */
    public float f186640e;

    /* JADX INFO: renamed from: f */
    public float f186641f;

    /* JADX INFO: renamed from: g */
    public float f186642g;

    /* JADX INFO: renamed from: h */
    public float f186643h;

    /* JADX INFO: renamed from: k */
    public float f186646k;

    /* JADX INFO: renamed from: l */
    public boolean f186647l;

    /* JADX INFO: renamed from: n */
    public float f186649n;

    /* JADX INFO: renamed from: o */
    public DisplayMetrics f186650o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public CharSequence f186651p;

    /* JADX INFO: renamed from: a */
    public final Paint f186636a = new Paint(1);

    /* JADX INFO: renamed from: b */
    public final TextPaint f186637b = new TextPaint(1);

    /* JADX INFO: renamed from: i */
    public final Path f186644i = new Path();

    /* JADX INFO: renamed from: j */
    public final Paint.FontMetrics f186645j = new Paint.FontMetrics();

    /* JADX INFO: renamed from: m */
    public float f186648m = 1.0f;

    public wjf0(@NonNull Context context) {
        mo167854f(context);
        m203441g();
        m203440e();
    }

    /* JADX INFO: renamed from: a */
    public final float m203436a() {
        this.f186637b.getFontMetrics(this.f186645j);
        Paint.FontMetrics fontMetrics = this.f186645j;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX INFO: renamed from: b */
    public final float m203437b(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f186637b.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: c */
    public final void m203438c(@NonNull Canvas canvas) {
        if (this.f186651p == null) {
            return;
        }
        int iM203436a = (int) ((this.f186641f / 2.0f) - m203436a());
        CharSequence charSequence = this.f186651p;
        canvas.drawText(charSequence, 0, charSequence.length(), getIntrinsicWidth() >> 1, iM203436a, this.f186637b);
    }

    /* JADX INFO: renamed from: d */
    public float m203439d() {
        CharSequence charSequence = this.f186651p;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!this.f186647l) {
            return this.f186649n;
        }
        float fM203437b = m203437b(charSequence);
        this.f186649n = fM203437b;
        this.f186647l = false;
        return fM203437b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        Rect bounds = getBounds();
        float fCenterX = bounds.centerX() - (getIntrinsicWidth() >> 1);
        float fCenterY = bounds.centerY() - (getIntrinsicHeight() * 0.8f);
        float f = this.f186648m;
        canvas.scale(f, f, bounds.left + (bounds.width() * 0.5f), bounds.top + (bounds.height() * 1.0f));
        canvas.translate(fCenterX, fCenterY);
        canvas.drawPath(this.f186644i, this.f186636a);
        m203438c(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public final void m203440e() {
        float intrinsicWidth = getIntrinsicWidth();
        float intrinsicHeight = getIntrinsicHeight();
        this.f186644i.reset();
        this.f186644i.moveTo(this.f186642g, 0.0f);
        this.f186644i.lineTo(intrinsicWidth - (this.f186642g * 2.0f), 0.0f);
        Path path = this.f186644i;
        float f = this.f186642g;
        path.arcTo(intrinsicWidth - (f * 2.0f), 0.0f, intrinsicWidth, f * 2.0f, -90.0f, 90.0f, false);
        this.f186644i.lineTo(intrinsicWidth, this.f186641f - (this.f186642g * 2.0f));
        Path path2 = this.f186644i;
        float f2 = this.f186642g;
        float f3 = this.f186641f;
        path2.arcTo(intrinsicWidth - (f2 * 2.0f), f3 - (f2 * 2.0f), intrinsicWidth, f3, 0.0f, 90.0f, false);
        float f4 = intrinsicWidth / 2.0f;
        this.f186644i.lineTo(this.f186640e + f4, this.f186641f);
        double dSqrt = Math.sqrt(0.5d);
        float f5 = this.f186643h;
        float f6 = (float) (dSqrt * ((double) f5));
        double d = intrinsicHeight;
        double dSqrt2 = Math.sqrt(2.0d) - 1.0d;
        float f7 = this.f186643h;
        float fSqrt = (float) (d - ((Math.sqrt(2.0d) - 1.0d) * ((double) this.f186643h)));
        this.f186644i.lineTo(f4 + f6, intrinsicHeight - f6);
        this.f186644i.arcTo(f4 - f5, (float) ((d - (dSqrt2 * ((double) f7))) - ((double) (f7 * 2.0f))), f7 + f4, fSqrt, 45.0f, 90.0f, false);
        this.f186644i.lineTo(f4 - this.f186640e, this.f186641f);
        this.f186644i.lineTo(this.f186642g, this.f186641f);
        Path path3 = this.f186644i;
        float f8 = this.f186641f;
        float f9 = this.f186642g;
        path3.arcTo(0.0f, f8 - (f9 * 2.0f), f9 * 2.0f, f8, 90.0f, 90.0f, false);
        this.f186644i.lineTo(0.0f, this.f186642g);
        Path path4 = this.f186644i;
        float f10 = this.f186642g;
        path4.arcTo(0.0f, 0.0f, f10 * 2.0f, f10 * 2.0f, 180.0f, 90.0f, false);
        this.f186644i.close();
    }

    /* JADX INFO: renamed from: f */
    public void mo167854f(@NonNull Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f186650o = displayMetrics;
        float f = displayMetrics.density;
        float f2 = 32.0f * f;
        this.f186638c = f2;
        this.f186639d = f2;
        this.f186642g = 8.0f * f;
        this.f186643h = 2.0f * f;
        float f3 = 5.0f * f;
        this.f186640e = f3;
        this.f186646k = f * 10.0f;
        this.f186641f = f2 - f3;
        this.f186636a.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: g */
    public final void m203441g() {
        TextPaint textPaint = this.f186637b;
        textPaint.density = this.f186650o.density;
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f186637b.setColor(-1);
        this.f186637b.setStyle(Paint.Style.FILL);
        this.f186637b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f186637b.setTextSize(TypedValue.applyDimension(2, 16.0f, this.f186650o));
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f186637b.getTextSize(), this.f186639d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f186646k * 2.0f) + m203439d(), this.f186638c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public void m203442h(@ColorInt int i) {
        this.f186636a.setColor(i);
    }

    /* JADX INFO: renamed from: i */
    public void m203443i(float f) {
        this.f186648m = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: j */
    public void m203444j(@Nullable CharSequence charSequence) {
        if (TextUtils.equals(this.f186651p, charSequence)) {
            return;
        }
        this.f186651p = charSequence;
        this.f186647l = true;
        m203440e();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
