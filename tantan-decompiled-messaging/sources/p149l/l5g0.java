package p149l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class l5g0 {

    /* JADX INFO: renamed from: A */
    public int f126134A;

    /* JADX INFO: renamed from: B */
    public int f126135B;

    /* JADX INFO: renamed from: C */
    public int f126136C;

    /* JADX INFO: renamed from: D */
    public int f126137D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f126138E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f126139F;

    /* JADX INFO: renamed from: G */
    public int f126140G;

    /* JADX INFO: renamed from: H */
    public int f126141H;

    /* JADX INFO: renamed from: I */
    public int f126142I;

    /* JADX INFO: renamed from: J */
    public Rect f126143J;

    /* JADX INFO: renamed from: a */
    public final float f126144a;

    /* JADX INFO: renamed from: b */
    public final float f126145b;

    /* JADX INFO: renamed from: c */
    public final float f126146c;

    /* JADX INFO: renamed from: d */
    public final float f126147d;

    /* JADX INFO: renamed from: e */
    public final float f126148e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f126149f;

    /* JADX INFO: renamed from: g */
    public final Paint f126150g;

    /* JADX INFO: renamed from: h */
    public final Paint f126151h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public CharSequence f126152i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Layout.Alignment f126153j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Bitmap f126154k;

    /* JADX INFO: renamed from: l */
    public float f126155l;

    /* JADX INFO: renamed from: m */
    public int f126156m;

    /* JADX INFO: renamed from: n */
    public int f126157n;

    /* JADX INFO: renamed from: o */
    public float f126158o;

    /* JADX INFO: renamed from: p */
    public int f126159p;

    /* JADX INFO: renamed from: q */
    public float f126160q;

    /* JADX INFO: renamed from: r */
    public float f126161r;

    /* JADX INFO: renamed from: s */
    public int f126162s;

    /* JADX INFO: renamed from: t */
    public int f126163t;

    /* JADX INFO: renamed from: u */
    public int f126164u;

    /* JADX INFO: renamed from: v */
    public int f126165v;

    /* JADX INFO: renamed from: w */
    public int f126166w;

    /* JADX INFO: renamed from: x */
    public float f126167x;

    /* JADX INFO: renamed from: y */
    public float f126168y;

    /* JADX INFO: renamed from: z */
    public float f126169z;

    public l5g0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f126148e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f126147d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f126144a = fRound;
        this.f126145b = fRound;
        this.f126146c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f126149f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f126150g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f126151h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m148636a(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m148637b(ywb ywbVar, tf4 tf4Var, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = ywbVar.f200434d == null;
        if (!z) {
            i5 = RoundedDrawable.DEFAULT_BORDER_COLOR;
        } else if (TextUtils.isEmpty(ywbVar.f200431a)) {
            return;
        } else {
            i5 = ywbVar.f200442l ? ywbVar.f200443m : tf4Var.f169941c;
        }
        if (m148636a(this.f126152i, ywbVar.f200431a) && vck0.m197845c(this.f126153j, ywbVar.f200432b) && this.f126154k == ywbVar.f200434d && this.f126155l == ywbVar.f200435e && this.f126156m == ywbVar.f200436f && vck0.m197845c(Integer.valueOf(this.f126157n), Integer.valueOf(ywbVar.f200437g)) && this.f126158o == ywbVar.f200438h && vck0.m197845c(Integer.valueOf(this.f126159p), Integer.valueOf(ywbVar.f200439i)) && this.f126160q == ywbVar.f200440j && this.f126161r == ywbVar.f200441k && this.f126162s == tf4Var.f169939a && this.f126163t == tf4Var.f169940b && this.f126164u == i5 && this.f126166w == tf4Var.f169942d && this.f126165v == tf4Var.f169943e && vck0.m197845c(this.f126149f.getTypeface(), tf4Var.f169944f) && this.f126167x == f && this.f126168y == f2 && this.f126169z == f3 && this.f126134A == i && this.f126135B == i2 && this.f126136C == i3 && this.f126137D == i4) {
            m148639d(canvas, z);
            return;
        }
        this.f126152i = ywbVar.f200431a;
        this.f126153j = ywbVar.f200432b;
        this.f126154k = ywbVar.f200434d;
        this.f126155l = ywbVar.f200435e;
        this.f126156m = ywbVar.f200436f;
        this.f126157n = ywbVar.f200437g;
        this.f126158o = ywbVar.f200438h;
        this.f126159p = ywbVar.f200439i;
        this.f126160q = ywbVar.f200440j;
        this.f126161r = ywbVar.f200441k;
        this.f126162s = tf4Var.f169939a;
        this.f126163t = tf4Var.f169940b;
        this.f126164u = i5;
        this.f126166w = tf4Var.f169942d;
        this.f126165v = tf4Var.f169943e;
        this.f126149f.setTypeface(tf4Var.f169944f);
        this.f126167x = f;
        this.f126168y = f2;
        this.f126169z = f3;
        this.f126134A = i;
        this.f126135B = i2;
        this.f126136C = i3;
        this.f126137D = i4;
        if (z) {
            p11.m167011e(this.f126152i);
            m148642g();
        } else {
            p11.m167011e(this.f126154k);
            m148641f();
        }
        m148639d(canvas, z);
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    /* JADX INFO: renamed from: c */
    public final void m148638c(Canvas canvas) {
        canvas.drawBitmap(this.f126154k, (Rect) null, this.f126143J, this.f126151h);
    }

    /* JADX INFO: renamed from: d */
    public final void m148639d(Canvas canvas, boolean z) {
        if (z) {
            m148640e(canvas);
            return;
        }
        p11.m167011e(this.f126143J);
        p11.m167011e(this.f126154k);
        m148638c(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m148640e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.f126138E;
        StaticLayout staticLayout2 = this.f126139F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f126140G, this.f126141H);
        if (Color.alpha(this.f126164u) > 0) {
            this.f126150g.setColor(this.f126164u);
            canvas2 = canvas;
            canvas2.drawRect(-this.f126142I, 0.0f, staticLayout.getWidth() + this.f126142I, staticLayout.getHeight(), this.f126150g);
        } else {
            canvas2 = canvas;
        }
        int i = this.f126166w;
        if (i == 1) {
            this.f126149f.setStrokeJoin(Paint.Join.ROUND);
            this.f126149f.setStrokeWidth(this.f126144a);
            this.f126149f.setColor(this.f126165v);
            this.f126149f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i == 2) {
            TextPaint textPaint = this.f126149f;
            float f = this.f126145b;
            float f2 = this.f126146c;
            textPaint.setShadowLayer(f, f2, f2, this.f126165v);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.f126165v;
            int i3 = z ? this.f126165v : -1;
            float f3 = this.f126145b / 2.0f;
            this.f126149f.setColor(this.f126162s);
            this.f126149f.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.f126149f.setShadowLayer(this.f126145b, f4, f4, i2);
            staticLayout2.draw(canvas2);
            this.f126149f.setShadowLayer(this.f126145b, f3, f3, i3);
        }
        this.f126149f.setColor(this.f126162s);
        this.f126149f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f126149f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    @RequiresNonNull({"cueBitmap"})
    /* JADX INFO: renamed from: f */
    public final void m148641f() {
        float f;
        int i;
        float f2;
        Bitmap bitmap = this.f126154k;
        int i2 = this.f126136C;
        int i3 = this.f126134A;
        int i4 = this.f126137D;
        int i5 = this.f126135B;
        float f3 = i2 - i3;
        float f4 = i3 + (this.f126158o * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.f126155l * f5);
        int iRound = Math.round(f3 * this.f126160q);
        float f7 = this.f126161r;
        int iRound2 = f7 != -3.4028235E38f ? Math.round(f5 * f7) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i6 = this.f126159p;
        if (i6 != 2) {
            if (i6 == 1) {
                f = iRound / 2;
            }
            int iRound3 = Math.round(f4);
            i = this.f126157n;
            if (i == 2) {
                if (i == 1) {
                    f2 = iRound2 / 2;
                }
                int iRound4 = Math.round(f6);
                this.f126143J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f2 = iRound2;
            f6 -= f2;
            int iRound5 = Math.round(f6);
            this.f126143J = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f = iRound;
        f4 -= f;
        int iRound6 = Math.round(f4);
        i = this.f126157n;
        if (i == 2) {
            if (i == 1) {
                f2 = iRound2 / 2;
            }
            int iRound7 = Math.round(f6);
            this.f126143J = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f2 = iRound2;
        f6 -= f2;
        int iRound8 = Math.round(f6);
        this.f126143J = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    @RequiresNonNull({"cueText"})
    /* JADX INFO: renamed from: g */
    public final void m148642g() {
        int iMax;
        int iMin;
        int iRound;
        CharSequence charSequence = this.f126152i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f126152i);
        int i = this.f126136C - this.f126134A;
        int i2 = this.f126137D - this.f126135B;
        this.f126149f.setTextSize(this.f126167x);
        int i3 = (int) ((this.f126167x * 0.125f) + 0.5f);
        int i4 = i3 * 2;
        int i5 = i - i4;
        float f = this.f126160q;
        float f2 = -3.4028235E38f;
        if (f != -3.4028235E38f) {
            i5 = (int) (i5 * f);
        }
        int i6 = i5;
        String str = "SubtitlePainter";
        if (i6 <= 0) {
            jwv.m143689i("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f126168y > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f126168y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f126166w == 1) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i7 = 0;
            while (i7 < length) {
                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i7]);
                i7++;
                f2 = f2;
            }
        }
        float f3 = f2;
        if (Color.alpha(this.f126163t) > 0) {
            int i8 = this.f126166w;
            if (i8 == 0 || i8 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f126163t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f126163t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f126153j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f126149f, i6, alignment2, this.f126147d, this.f126148e, true);
        this.f126138E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.f126138E.getLineCount();
        int iMax2 = 0;
        int i9 = 0;
        while (i9 < lineCount) {
            iMax2 = Math.max((int) Math.ceil(this.f126138E.getLineWidth(i9)), iMax2);
            i9++;
            str = str;
        }
        String str2 = str;
        if (this.f126160q == f3 || iMax2 >= i6) {
            i6 = iMax2;
        }
        int i10 = i6 + i4;
        float f4 = this.f126158o;
        if (f4 != f3) {
            int iRound2 = Math.round(i * f4);
            int i11 = this.f126134A;
            int i12 = iRound2 + i11;
            int i13 = this.f126159p;
            if (i13 == 1) {
                i12 = ((i12 * 2) - i10) / 2;
            } else if (i13 == 2) {
                i12 -= i10;
            }
            iMax = Math.max(i12, i11);
            iMin = Math.min(i10 + iMax, this.f126136C);
        } else {
            iMax = ((i - i10) / 2) + this.f126134A;
            iMin = iMax + i10;
        }
        int i14 = iMin - iMax;
        if (i14 <= 0) {
            jwv.m143689i(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f5 = this.f126155l;
        if (f5 != f3) {
            if (this.f126156m == 0) {
                iRound = Math.round(i2 * f5) + this.f126135B;
                int i15 = this.f126157n;
                if (i15 == 2) {
                    iRound -= height;
                } else if (i15 == 1) {
                    iRound = ((iRound * 2) - height) / 2;
                }
            } else {
                int lineBottom = this.f126138E.getLineBottom(0) - this.f126138E.getLineTop(0);
                float f6 = this.f126155l;
                if (f6 >= 0.0f) {
                    iRound = Math.round(f6 * lineBottom) + this.f126135B;
                } else {
                    iRound = Math.round((f6 + 1.0f) * lineBottom) + this.f126137D;
                    iRound -= height;
                }
            }
            int i16 = iRound + height;
            int i17 = this.f126137D;
            if (i16 > i17) {
                iRound = i17 - height;
            } else {
                int i18 = this.f126135B;
                if (iRound < i18) {
                    iRound = i18;
                }
            }
        } else {
            iRound = (this.f126137D - height) - ((int) (i2 * this.f126169z));
        }
        this.f126138E = new StaticLayout(spannableStringBuilder, this.f126149f, i14, alignment2, this.f126147d, this.f126148e, true);
        this.f126139F = new StaticLayout(spannableStringBuilder2, this.f126149f, i14, alignment2, this.f126147d, this.f126148e, true);
        this.f126140G = iMax;
        this.f126141H = iRound;
        this.f126142I = i3;
    }
}
