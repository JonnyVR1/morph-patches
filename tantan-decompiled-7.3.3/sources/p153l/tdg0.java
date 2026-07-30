package p153l;

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
public final class tdg0 {

    /* JADX INFO: renamed from: A */
    public int f173329A;

    /* JADX INFO: renamed from: B */
    public int f173330B;

    /* JADX INFO: renamed from: C */
    public int f173331C;

    /* JADX INFO: renamed from: D */
    public int f173332D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f173333E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f173334F;

    /* JADX INFO: renamed from: G */
    public int f173335G;

    /* JADX INFO: renamed from: H */
    public int f173336H;

    /* JADX INFO: renamed from: I */
    public int f173337I;

    /* JADX INFO: renamed from: J */
    public Rect f173338J;

    /* JADX INFO: renamed from: a */
    public final float f173339a;

    /* JADX INFO: renamed from: b */
    public final float f173340b;

    /* JADX INFO: renamed from: c */
    public final float f173341c;

    /* JADX INFO: renamed from: d */
    public final float f173342d;

    /* JADX INFO: renamed from: e */
    public final float f173343e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f173344f;

    /* JADX INFO: renamed from: g */
    public final Paint f173345g;

    /* JADX INFO: renamed from: h */
    public final Paint f173346h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public CharSequence f173347i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Layout.Alignment f173348j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Bitmap f173349k;

    /* JADX INFO: renamed from: l */
    public float f173350l;

    /* JADX INFO: renamed from: m */
    public int f173351m;

    /* JADX INFO: renamed from: n */
    public int f173352n;

    /* JADX INFO: renamed from: o */
    public float f173353o;

    /* JADX INFO: renamed from: p */
    public int f173354p;

    /* JADX INFO: renamed from: q */
    public float f173355q;

    /* JADX INFO: renamed from: r */
    public float f173356r;

    /* JADX INFO: renamed from: s */
    public int f173357s;

    /* JADX INFO: renamed from: t */
    public int f173358t;

    /* JADX INFO: renamed from: u */
    public int f173359u;

    /* JADX INFO: renamed from: v */
    public int f173360v;

    /* JADX INFO: renamed from: w */
    public int f173361w;

    /* JADX INFO: renamed from: x */
    public float f173362x;

    /* JADX INFO: renamed from: y */
    public float f173363y;

    /* JADX INFO: renamed from: z */
    public float f173364z;

    public tdg0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f173343e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f173342d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f173339a = fRound;
        this.f173340b = fRound;
        this.f173341c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f173344f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f173345g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f173346h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m190623a(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m190624b(myb mybVar, sg4 sg4Var, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = mybVar.f139370d == null;
        if (!z) {
            i5 = RoundedDrawable.DEFAULT_BORDER_COLOR;
        } else if (TextUtils.isEmpty(mybVar.f139367a)) {
            return;
        } else {
            i5 = mybVar.f139378l ? mybVar.f139379m : sg4Var.f167791c;
        }
        if (m190623a(this.f173347i, mybVar.f139367a) && bmk0.m105123c(this.f173348j, mybVar.f139368b) && this.f173349k == mybVar.f139370d && this.f173350l == mybVar.f139371e && this.f173351m == mybVar.f139372f && bmk0.m105123c(Integer.valueOf(this.f173352n), Integer.valueOf(mybVar.f139373g)) && this.f173353o == mybVar.f139374h && bmk0.m105123c(Integer.valueOf(this.f173354p), Integer.valueOf(mybVar.f139375i)) && this.f173355q == mybVar.f139376j && this.f173356r == mybVar.f139377k && this.f173357s == sg4Var.f167789a && this.f173358t == sg4Var.f167790b && this.f173359u == i5 && this.f173361w == sg4Var.f167792d && this.f173360v == sg4Var.f167793e && bmk0.m105123c(this.f173344f.getTypeface(), sg4Var.f167794f) && this.f173362x == f && this.f173363y == f2 && this.f173364z == f3 && this.f173329A == i && this.f173330B == i2 && this.f173331C == i3 && this.f173332D == i4) {
            m190626d(canvas, z);
            return;
        }
        this.f173347i = mybVar.f139367a;
        this.f173348j = mybVar.f139368b;
        this.f173349k = mybVar.f139370d;
        this.f173350l = mybVar.f139371e;
        this.f173351m = mybVar.f139372f;
        this.f173352n = mybVar.f139373g;
        this.f173353o = mybVar.f139374h;
        this.f173354p = mybVar.f139375i;
        this.f173355q = mybVar.f139376j;
        this.f173356r = mybVar.f139377k;
        this.f173357s = sg4Var.f167789a;
        this.f173358t = sg4Var.f167790b;
        this.f173359u = i5;
        this.f173361w = sg4Var.f167792d;
        this.f173360v = sg4Var.f167793e;
        this.f173344f.setTypeface(sg4Var.f167794f);
        this.f173362x = f;
        this.f173363y = f2;
        this.f173364z = f3;
        this.f173329A = i;
        this.f173330B = i2;
        this.f173331C = i3;
        this.f173332D = i4;
        if (z) {
            w11.m204369e(this.f173347i);
            m190629g();
        } else {
            w11.m204369e(this.f173349k);
            m190628f();
        }
        m190626d(canvas, z);
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    /* JADX INFO: renamed from: c */
    public final void m190625c(Canvas canvas) {
        canvas.drawBitmap(this.f173349k, (Rect) null, this.f173338J, this.f173346h);
    }

    /* JADX INFO: renamed from: d */
    public final void m190626d(Canvas canvas, boolean z) {
        if (z) {
            m190627e(canvas);
            return;
        }
        w11.m204369e(this.f173338J);
        w11.m204369e(this.f173349k);
        m190625c(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m190627e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.f173333E;
        StaticLayout staticLayout2 = this.f173334F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f173335G, this.f173336H);
        if (Color.alpha(this.f173359u) > 0) {
            this.f173345g.setColor(this.f173359u);
            canvas2 = canvas;
            canvas2.drawRect(-this.f173337I, 0.0f, staticLayout.getWidth() + this.f173337I, staticLayout.getHeight(), this.f173345g);
        } else {
            canvas2 = canvas;
        }
        int i = this.f173361w;
        if (i == 1) {
            this.f173344f.setStrokeJoin(Paint.Join.ROUND);
            this.f173344f.setStrokeWidth(this.f173339a);
            this.f173344f.setColor(this.f173360v);
            this.f173344f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i == 2) {
            TextPaint textPaint = this.f173344f;
            float f = this.f173340b;
            float f2 = this.f173341c;
            textPaint.setShadowLayer(f, f2, f2, this.f173360v);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.f173360v;
            int i3 = z ? this.f173360v : -1;
            float f3 = this.f173340b / 2.0f;
            this.f173344f.setColor(this.f173357s);
            this.f173344f.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.f173344f.setShadowLayer(this.f173340b, f4, f4, i2);
            staticLayout2.draw(canvas2);
            this.f173344f.setShadowLayer(this.f173340b, f3, f3, i3);
        }
        this.f173344f.setColor(this.f173357s);
        this.f173344f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f173344f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    @RequiresNonNull({"cueBitmap"})
    /* JADX INFO: renamed from: f */
    public final void m190628f() {
        float f;
        int i;
        float f2;
        Bitmap bitmap = this.f173349k;
        int i2 = this.f173331C;
        int i3 = this.f173329A;
        int i4 = this.f173332D;
        int i5 = this.f173330B;
        float f3 = i2 - i3;
        float f4 = i3 + (this.f173353o * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.f173350l * f5);
        int iRound = Math.round(f3 * this.f173355q);
        float f7 = this.f173356r;
        int iRound2 = f7 != -3.4028235E38f ? Math.round(f5 * f7) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i6 = this.f173354p;
        if (i6 != 2) {
            if (i6 == 1) {
                f = iRound / 2;
            }
            int iRound3 = Math.round(f4);
            i = this.f173352n;
            if (i == 2) {
                if (i == 1) {
                    f2 = iRound2 / 2;
                }
                int iRound4 = Math.round(f6);
                this.f173338J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f2 = iRound2;
            f6 -= f2;
            int iRound5 = Math.round(f6);
            this.f173338J = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f = iRound;
        f4 -= f;
        int iRound6 = Math.round(f4);
        i = this.f173352n;
        if (i == 2) {
            if (i == 1) {
                f2 = iRound2 / 2;
            }
            int iRound7 = Math.round(f6);
            this.f173338J = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f2 = iRound2;
        f6 -= f2;
        int iRound8 = Math.round(f6);
        this.f173338J = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    @RequiresNonNull({"cueText"})
    /* JADX INFO: renamed from: g */
    public final void m190629g() {
        int iMax;
        int iMin;
        int iRound;
        CharSequence charSequence = this.f173347i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f173347i);
        int i = this.f173331C - this.f173329A;
        int i2 = this.f173332D - this.f173330B;
        this.f173344f.setTextSize(this.f173362x);
        int i3 = (int) ((this.f173362x * 0.125f) + 0.5f);
        int i4 = i3 * 2;
        int i5 = i - i4;
        float f = this.f173355q;
        float f2 = -3.4028235E38f;
        if (f != -3.4028235E38f) {
            i5 = (int) (i5 * f);
        }
        int i6 = i5;
        String str = "SubtitlePainter";
        if (i6 <= 0) {
            kyv.m152151i("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f173363y > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f173363y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f173361w == 1) {
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
        if (Color.alpha(this.f173358t) > 0) {
            int i8 = this.f173361w;
            if (i8 == 0 || i8 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f173358t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f173358t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f173348j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f173344f, i6, alignment2, this.f173342d, this.f173343e, true);
        this.f173333E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.f173333E.getLineCount();
        int iMax2 = 0;
        int i9 = 0;
        while (i9 < lineCount) {
            iMax2 = Math.max((int) Math.ceil(this.f173333E.getLineWidth(i9)), iMax2);
            i9++;
            str = str;
        }
        String str2 = str;
        if (this.f173355q == f3 || iMax2 >= i6) {
            i6 = iMax2;
        }
        int i10 = i6 + i4;
        float f4 = this.f173353o;
        if (f4 != f3) {
            int iRound2 = Math.round(i * f4);
            int i11 = this.f173329A;
            int i12 = iRound2 + i11;
            int i13 = this.f173354p;
            if (i13 == 1) {
                i12 = ((i12 * 2) - i10) / 2;
            } else if (i13 == 2) {
                i12 -= i10;
            }
            iMax = Math.max(i12, i11);
            iMin = Math.min(i10 + iMax, this.f173331C);
        } else {
            iMax = ((i - i10) / 2) + this.f173329A;
            iMin = iMax + i10;
        }
        int i14 = iMin - iMax;
        if (i14 <= 0) {
            kyv.m152151i(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f5 = this.f173350l;
        if (f5 != f3) {
            if (this.f173351m == 0) {
                iRound = Math.round(i2 * f5) + this.f173330B;
                int i15 = this.f173352n;
                if (i15 == 2) {
                    iRound -= height;
                } else if (i15 == 1) {
                    iRound = ((iRound * 2) - height) / 2;
                }
            } else {
                int lineBottom = this.f173333E.getLineBottom(0) - this.f173333E.getLineTop(0);
                float f6 = this.f173350l;
                if (f6 >= 0.0f) {
                    iRound = Math.round(f6 * lineBottom) + this.f173330B;
                } else {
                    iRound = Math.round((f6 + 1.0f) * lineBottom) + this.f173332D;
                    iRound -= height;
                }
            }
            int i16 = iRound + height;
            int i17 = this.f173332D;
            if (i16 > i17) {
                iRound = i17 - height;
            } else {
                int i18 = this.f173330B;
                if (iRound < i18) {
                    iRound = i18;
                }
            }
        } else {
            iRound = (this.f173332D - height) - ((int) (i2 * this.f173364z));
        }
        this.f173333E = new StaticLayout(spannableStringBuilder, this.f173344f, i14, alignment2, this.f173342d, this.f173343e, true);
        this.f173334F = new StaticLayout(spannableStringBuilder2, this.f173344f, i14, alignment2, this.f173342d, this.f173343e, true);
        this.f173335G = iMax;
        this.f173336H = iRound;
        this.f173337I = i3;
    }
}
