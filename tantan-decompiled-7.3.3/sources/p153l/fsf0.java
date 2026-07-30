package p153l;

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
public class fsf0 extends Drawable {

    /* JADX INFO: renamed from: c */
    public float f100605c;

    /* JADX INFO: renamed from: d */
    public float f100606d;

    /* JADX INFO: renamed from: e */
    public float f100607e;

    /* JADX INFO: renamed from: f */
    public float f100608f;

    /* JADX INFO: renamed from: g */
    public float f100609g;

    /* JADX INFO: renamed from: h */
    public float f100610h;

    /* JADX INFO: renamed from: k */
    public float f100613k;

    /* JADX INFO: renamed from: l */
    public boolean f100614l;

    /* JADX INFO: renamed from: n */
    public float f100616n;

    /* JADX INFO: renamed from: o */
    public DisplayMetrics f100617o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public CharSequence f100618p;

    /* JADX INFO: renamed from: a */
    public final Paint f100603a = new Paint(1);

    /* JADX INFO: renamed from: b */
    public final TextPaint f100604b = new TextPaint(1);

    /* JADX INFO: renamed from: i */
    public final Path f100611i = new Path();

    /* JADX INFO: renamed from: j */
    public final Paint.FontMetrics f100612j = new Paint.FontMetrics();

    /* JADX INFO: renamed from: m */
    public float f100615m = 1.0f;

    public fsf0(@NonNull Context context) {
        mo115839f(context);
        m127174g();
        m127173e();
    }

    /* JADX INFO: renamed from: a */
    public final float m127169a() {
        this.f100604b.getFontMetrics(this.f100612j);
        Paint.FontMetrics fontMetrics = this.f100612j;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX INFO: renamed from: b */
    public final float m127170b(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f100604b.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: c */
    public final void m127171c(@NonNull Canvas canvas) {
        if (this.f100618p == null) {
            return;
        }
        int iM127169a = (int) ((this.f100608f / 2.0f) - m127169a());
        CharSequence charSequence = this.f100618p;
        canvas.drawText(charSequence, 0, charSequence.length(), getIntrinsicWidth() >> 1, iM127169a, this.f100604b);
    }

    /* JADX INFO: renamed from: d */
    public float m127172d() {
        CharSequence charSequence = this.f100618p;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!this.f100614l) {
            return this.f100616n;
        }
        float fM127170b = m127170b(charSequence);
        this.f100616n = fM127170b;
        this.f100614l = false;
        return fM127170b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        Rect bounds = getBounds();
        float fCenterX = bounds.centerX() - (getIntrinsicWidth() >> 1);
        float fCenterY = bounds.centerY() - (getIntrinsicHeight() * 0.8f);
        float f = this.f100615m;
        canvas.scale(f, f, bounds.left + (bounds.width() * 0.5f), bounds.top + (bounds.height() * 1.0f));
        canvas.translate(fCenterX, fCenterY);
        canvas.drawPath(this.f100611i, this.f100603a);
        m127171c(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public final void m127173e() {
        float intrinsicWidth = getIntrinsicWidth();
        float intrinsicHeight = getIntrinsicHeight();
        this.f100611i.reset();
        this.f100611i.moveTo(this.f100609g, 0.0f);
        this.f100611i.lineTo(intrinsicWidth - (this.f100609g * 2.0f), 0.0f);
        Path path = this.f100611i;
        float f = this.f100609g;
        path.arcTo(intrinsicWidth - (f * 2.0f), 0.0f, intrinsicWidth, f * 2.0f, -90.0f, 90.0f, false);
        this.f100611i.lineTo(intrinsicWidth, this.f100608f - (this.f100609g * 2.0f));
        Path path2 = this.f100611i;
        float f2 = this.f100609g;
        float f3 = this.f100608f;
        path2.arcTo(intrinsicWidth - (f2 * 2.0f), f3 - (f2 * 2.0f), intrinsicWidth, f3, 0.0f, 90.0f, false);
        float f4 = intrinsicWidth / 2.0f;
        this.f100611i.lineTo(this.f100607e + f4, this.f100608f);
        double dSqrt = Math.sqrt(0.5d);
        float f5 = this.f100610h;
        float f6 = (float) (dSqrt * ((double) f5));
        double d = intrinsicHeight;
        double dSqrt2 = Math.sqrt(2.0d) - 1.0d;
        float f7 = this.f100610h;
        float fSqrt = (float) (d - ((Math.sqrt(2.0d) - 1.0d) * ((double) this.f100610h)));
        this.f100611i.lineTo(f4 + f6, intrinsicHeight - f6);
        this.f100611i.arcTo(f4 - f5, (float) ((d - (dSqrt2 * ((double) f7))) - ((double) (f7 * 2.0f))), f7 + f4, fSqrt, 45.0f, 90.0f, false);
        this.f100611i.lineTo(f4 - this.f100607e, this.f100608f);
        this.f100611i.lineTo(this.f100609g, this.f100608f);
        Path path3 = this.f100611i;
        float f8 = this.f100608f;
        float f9 = this.f100609g;
        path3.arcTo(0.0f, f8 - (f9 * 2.0f), f9 * 2.0f, f8, 90.0f, 90.0f, false);
        this.f100611i.lineTo(0.0f, this.f100609g);
        Path path4 = this.f100611i;
        float f10 = this.f100609g;
        path4.arcTo(0.0f, 0.0f, f10 * 2.0f, f10 * 2.0f, 180.0f, 90.0f, false);
        this.f100611i.close();
    }

    /* JADX INFO: renamed from: f */
    public void mo115839f(@NonNull Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f100617o = displayMetrics;
        float f = displayMetrics.density;
        float f2 = 32.0f * f;
        this.f100605c = f2;
        this.f100606d = f2;
        this.f100609g = 8.0f * f;
        this.f100610h = 2.0f * f;
        float f3 = 5.0f * f;
        this.f100607e = f3;
        this.f100613k = f * 10.0f;
        this.f100608f = f2 - f3;
        this.f100603a.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: g */
    public final void m127174g() {
        TextPaint textPaint = this.f100604b;
        textPaint.density = this.f100617o.density;
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f100604b.setColor(-1);
        this.f100604b.setStyle(Paint.Style.FILL);
        this.f100604b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f100604b.setTextSize(TypedValue.applyDimension(2, 16.0f, this.f100617o));
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f100604b.getTextSize(), this.f100606d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f100613k * 2.0f) + m127172d(), this.f100605c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public void m127175h(@ColorInt int i) {
        this.f100603a.setColor(i);
    }

    /* JADX INFO: renamed from: i */
    public void m127176i(float f) {
        this.f100615m = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: j */
    public void m127177j(@Nullable CharSequence charSequence) {
        if (TextUtils.equals(this.f100618p, charSequence)) {
            return;
        }
        this.f100618p = charSequence;
        this.f100614l = true;
        m127173e();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
