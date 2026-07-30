package p003l;

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
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class wjf0 extends Drawable {

    /* JADX INFO: renamed from: c */
    public float f8555c;

    /* JADX INFO: renamed from: d */
    public float f8556d;

    /* JADX INFO: renamed from: e */
    public float f8557e;

    /* JADX INFO: renamed from: f */
    public float f8558f;

    /* JADX INFO: renamed from: g */
    public float f8559g;

    /* JADX INFO: renamed from: h */
    public float f8560h;

    /* JADX INFO: renamed from: k */
    public float f8563k;

    /* JADX INFO: renamed from: l */
    public boolean f8564l;

    /* JADX INFO: renamed from: n */
    public float f8566n;

    /* JADX INFO: renamed from: o */
    public DisplayMetrics f8567o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public CharSequence f8568p;

    /* JADX INFO: renamed from: a */
    public final Paint f8553a = new Paint(1);

    /* JADX INFO: renamed from: b */
    public final TextPaint f8554b = new TextPaint(1);

    /* JADX INFO: renamed from: i */
    public final Path f8561i = new Path();

    /* JADX INFO: renamed from: j */
    public final Paint.FontMetrics f8562j = new Paint.FontMetrics();

    /* JADX INFO: renamed from: m */
    public float f8565m = 1.0f;

    public wjf0(@NonNull Context context) {
        mo6804f(context);
        m8568g();
        m8567e();
    }

    /* JADX INFO: renamed from: a */
    public final float m8563a() {
        this.f8554b.getFontMetrics(this.f8562j);
        Paint.FontMetrics fontMetrics = this.f8562j;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX INFO: renamed from: b */
    public final float m8564b(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f8554b.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: c */
    public final void m8565c(@NonNull Canvas canvas) {
        if (this.f8568p == null) {
            return;
        }
        int iM8563a = (int) ((this.f8558f / 2.0f) - m8563a());
        CharSequence charSequence = this.f8568p;
        canvas.drawText(charSequence, 0, charSequence.length(), getIntrinsicWidth() >> 1, iM8563a, this.f8554b);
    }

    /* JADX INFO: renamed from: d */
    public float m8566d() {
        CharSequence charSequence = this.f8568p;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!this.f8564l) {
            return this.f8566n;
        }
        float fM8564b = m8564b(charSequence);
        this.f8566n = fM8564b;
        this.f8564l = false;
        return fM8564b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        Rect bounds = getBounds();
        float fCenterX = bounds.centerX() - (getIntrinsicWidth() >> 1);
        float fCenterY = bounds.centerY() - (getIntrinsicHeight() * 0.8f);
        float f = this.f8565m;
        canvas.scale(f, f, bounds.left + (bounds.width() * 0.5f), bounds.top + (bounds.height() * 1.0f));
        canvas.translate(fCenterX, fCenterY);
        canvas.drawPath(this.f8561i, this.f8553a);
        m8565c(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public final void m8567e() {
        float intrinsicWidth = getIntrinsicWidth();
        float intrinsicHeight = getIntrinsicHeight();
        this.f8561i.reset();
        this.f8561i.moveTo(this.f8559g, 0.0f);
        this.f8561i.lineTo(intrinsicWidth - (this.f8559g * 2.0f), 0.0f);
        Path path = this.f8561i;
        float f = this.f8559g;
        path.arcTo(intrinsicWidth - (f * 2.0f), 0.0f, intrinsicWidth, f * 2.0f, -90.0f, 90.0f, false);
        this.f8561i.lineTo(intrinsicWidth, this.f8558f - (this.f8559g * 2.0f));
        Path path2 = this.f8561i;
        float f2 = this.f8559g;
        float f3 = this.f8558f;
        path2.arcTo(intrinsicWidth - (f2 * 2.0f), f3 - (f2 * 2.0f), intrinsicWidth, f3, 0.0f, 90.0f, false);
        float f4 = intrinsicWidth / 2.0f;
        this.f8561i.lineTo(this.f8557e + f4, this.f8558f);
        double dSqrt = Math.sqrt(0.5d);
        float f5 = this.f8560h;
        float f6 = (float) (dSqrt * ((double) f5));
        double d = intrinsicHeight;
        double dSqrt2 = Math.sqrt(2.0d) - 1.0d;
        float f7 = this.f8560h;
        float fSqrt = (float) (d - ((Math.sqrt(2.0d) - 1.0d) * ((double) this.f8560h)));
        this.f8561i.lineTo(f4 + f6, intrinsicHeight - f6);
        this.f8561i.arcTo(f4 - f5, (float) ((d - (dSqrt2 * ((double) f7))) - ((double) (f7 * 2.0f))), f7 + f4, fSqrt, 45.0f, 90.0f, false);
        this.f8561i.lineTo(f4 - this.f8557e, this.f8558f);
        this.f8561i.lineTo(this.f8559g, this.f8558f);
        Path path3 = this.f8561i;
        float f8 = this.f8558f;
        float f9 = this.f8559g;
        path3.arcTo(0.0f, f8 - (f9 * 2.0f), f9 * 2.0f, f8, 90.0f, 90.0f, false);
        this.f8561i.lineTo(0.0f, this.f8559g);
        Path path4 = this.f8561i;
        float f10 = this.f8559g;
        path4.arcTo(0.0f, 0.0f, f10 * 2.0f, f10 * 2.0f, 180.0f, 90.0f, false);
        this.f8561i.close();
    }

    /* JADX INFO: renamed from: f */
    public void mo6804f(@NonNull Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f8567o = displayMetrics;
        float f = displayMetrics.density;
        float f2 = 32.0f * f;
        this.f8555c = f2;
        this.f8556d = f2;
        this.f8559g = 8.0f * f;
        this.f8560h = 2.0f * f;
        float f3 = 5.0f * f;
        this.f8557e = f3;
        this.f8563k = f * 10.0f;
        this.f8558f = f2 - f3;
        this.f8553a.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: g */
    public final void m8568g() {
        TextPaint textPaint = this.f8554b;
        textPaint.density = this.f8567o.density;
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f8554b.setColor(-1);
        this.f8554b.setStyle(Paint.Style.FILL);
        this.f8554b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f8554b.setTextSize(TypedValue.applyDimension(2, 16.0f, this.f8567o));
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f8554b.getTextSize(), this.f8556d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f8563k * 2.0f) + m8566d(), this.f8555c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public void m8569h(@ColorInt int i) {
        this.f8553a.setColor(i);
    }

    /* JADX INFO: renamed from: i */
    public void m8570i(float f) {
        this.f8565m = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: j */
    public void m8571j(@Nullable CharSequence charSequence) {
        if (TextUtils.equals(this.f8568p, charSequence)) {
            return;
        }
        this.f8568p = charSequence;
        this.f8564l = true;
        m8567e();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = IjkMediaMeta.AV_CH_LAYOUT_7POINT1_WIDE_BACK) int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
