package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.momo.momortc.MMConstants;
import p153l.jhx;
import p153l.kkl0;
import p153l.m9k;
import p153l.ori0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;

    @NonNull
    private static final Paint DEBUG_DRAW_PAINT = null;
    private static final boolean USE_SCALING_TEXTURE = false;
    private boolean boundsChanged;

    @NonNull
    private final Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private CancelableFontCallback collapsedFontCallback;
    private ColorStateList collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private ColorStateList collapsedTextColor;
    private Typeface collapsedTypeface;

    @NonNull
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentTextSize;
    private Typeface currentTypeface;
    private boolean drawTitle;

    @NonNull
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private CancelableFontCallback expandedFontCallback;
    private float expandedFraction;
    private ColorStateList expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private ColorStateList expandedTextColor;

    @Nullable
    private Bitmap expandedTitleTexture;
    private Typeface expandedTypeface;
    private boolean isRtl;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;

    @Nullable
    private CharSequence text;

    @NonNull
    private final TextPaint textPaint;
    private TimeInterpolator textSizeInterpolator;

    @Nullable
    private CharSequence textToDraw;
    private float textureAscent;
    private float textureDescent;
    private Paint texturePaint;

    @NonNull
    private final TextPaint tmpPaint;
    private boolean useTexture;
    private final View view;
    private int expandedTextGravity = 16;
    private int collapsedTextGravity = 16;
    private float expandedTextSize = 15.0f;
    private float collapsedTextSize = 15.0f;

    public CollapsingTextHelper(View view) {
        this.view = view;
        TextPaint textPaint = new TextPaint(MMConstants.ERR_WATERMARK_READ);
        this.textPaint = textPaint;
        this.tmpPaint = new TextPaint(textPaint);
        this.collapsedBounds = new Rect();
        this.expandedBounds = new Rect();
        this.currentBounds = new RectF();
    }

    private static int blendColors(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private void calculateBaseOffsets() {
        float f = this.currentTextSize;
        calculateUsingTextSize(this.collapsedTextSize);
        CharSequence charSequence = this.textToDraw;
        float fMeasureText = charSequence != null ? this.textPaint.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int iM157578b = m9k.m157578b(this.collapsedTextGravity, this.isRtl ? 1 : 0);
        int i = iM157578b & 112;
        if (i == 48) {
            this.collapsedDrawY = this.collapsedBounds.top - this.textPaint.ascent();
        } else if (i != 80) {
            this.collapsedDrawY = this.collapsedBounds.centerY() + (((this.textPaint.descent() - this.textPaint.ascent()) / 2.0f) - this.textPaint.descent());
        } else {
            this.collapsedDrawY = this.collapsedBounds.bottom;
        }
        int i2 = iM157578b & 8388615;
        if (i2 != 1) {
            Rect rect = this.collapsedBounds;
            if (i2 != 5) {
                this.collapsedDrawX = rect.left;
            } else {
                this.collapsedDrawX = rect.right - fMeasureText;
            }
        } else {
            this.collapsedDrawX = this.collapsedBounds.centerX() - (fMeasureText / 2.0f);
        }
        calculateUsingTextSize(this.expandedTextSize);
        CharSequence charSequence2 = this.textToDraw;
        float fMeasureText2 = charSequence2 != null ? this.textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int iM157578b2 = m9k.m157578b(this.expandedTextGravity, this.isRtl ? 1 : 0);
        int i3 = iM157578b2 & 112;
        if (i3 == 48) {
            this.expandedDrawY = this.expandedBounds.top - this.textPaint.ascent();
        } else if (i3 != 80) {
            this.expandedDrawY = this.expandedBounds.centerY() + (((this.textPaint.descent() - this.textPaint.ascent()) / 2.0f) - this.textPaint.descent());
        } else {
            this.expandedDrawY = this.expandedBounds.bottom;
        }
        int i4 = iM157578b2 & 8388615;
        if (i4 != 1) {
            Rect rect2 = this.expandedBounds;
            if (i4 != 5) {
                this.expandedDrawX = rect2.left;
            } else {
                this.expandedDrawX = rect2.right - fMeasureText2;
            }
        } else {
            this.expandedDrawX = this.expandedBounds.centerX() - (fMeasureText2 / 2.0f);
        }
        clearTexture();
        setInterpolatedTextSize(f);
    }

    private void calculateCurrentOffsets() {
        calculateOffsets(this.expandedFraction);
    }

    private boolean calculateIsRtl(@NonNull CharSequence charSequence) {
        return (kkl0.m150191x(this.view) == 1 ? ori0.f148711d : ori0.f148710c).isRtl(charSequence, 0, charSequence.length());
    }

    private void calculateOffsets(float f) {
        interpolateBounds(f);
        this.currentDrawX = lerp(this.expandedDrawX, this.collapsedDrawX, f, this.positionInterpolator);
        this.currentDrawY = lerp(this.expandedDrawY, this.collapsedDrawY, f, this.positionInterpolator);
        setInterpolatedTextSize(lerp(this.expandedTextSize, this.collapsedTextSize, f, this.textSizeInterpolator));
        ColorStateList colorStateList = this.collapsedTextColor;
        ColorStateList colorStateList2 = this.expandedTextColor;
        TextPaint textPaint = this.textPaint;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(blendColors(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f));
        } else {
            textPaint.setColor(getCurrentCollapsedTextColor());
        }
        this.textPaint.setShadowLayer(lerp(this.expandedShadowRadius, this.collapsedShadowRadius, f, null), lerp(this.expandedShadowDx, this.collapsedShadowDx, f, null), lerp(this.expandedShadowDy, this.collapsedShadowDy, f, null), blendColors(getCurrentColor(this.expandedShadowColor), getCurrentColor(this.collapsedShadowColor), f));
        kkl0.m150146a0(this.view);
    }

    private void calculateUsingTextSize(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.text == null) {
            return;
        }
        float fWidth = this.collapsedBounds.width();
        float fWidth2 = this.expandedBounds.width();
        if (isClose(f, this.collapsedTextSize)) {
            f2 = this.collapsedTextSize;
            this.scale = 1.0f;
            Typeface typeface = this.currentTypeface;
            Typeface typeface2 = this.collapsedTypeface;
            if (typeface != typeface2) {
                this.currentTypeface = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f3 = this.expandedTextSize;
            Typeface typeface3 = this.currentTypeface;
            Typeface typeface4 = this.expandedTypeface;
            if (typeface3 != typeface4) {
                this.currentTypeface = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (isClose(f, f3)) {
                this.scale = 1.0f;
            } else {
                this.scale = f / this.expandedTextSize;
            }
            float f4 = this.collapsedTextSize / this.expandedTextSize;
            fWidth = fWidth2 * f4 > fWidth ? Math.min(fWidth / f4, fWidth2) : fWidth2;
            f2 = f3;
            z2 = z;
        }
        if (fWidth > 0.0f) {
            z2 = this.currentTextSize != f2 || this.boundsChanged || z2;
            this.currentTextSize = f2;
            this.boundsChanged = false;
        }
        if (this.textToDraw == null || z2) {
            this.textPaint.setTextSize(this.currentTextSize);
            this.textPaint.setTypeface(this.currentTypeface);
            this.textPaint.setLinearText(this.scale != 1.0f);
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.text, this.textPaint, fWidth, TextUtils.TruncateAt.END);
            if (TextUtils.equals(charSequenceEllipsize, this.textToDraw)) {
                return;
            }
            this.textToDraw = charSequenceEllipsize;
            this.isRtl = calculateIsRtl(charSequenceEllipsize);
        }
    }

    private void clearTexture() {
        Bitmap bitmap = this.expandedTitleTexture;
        if (bitmap != null) {
            bitmap.recycle();
            this.expandedTitleTexture = null;
        }
    }

    private void ensureExpandedTexture() {
        if (this.expandedTitleTexture != null || this.expandedBounds.isEmpty() || TextUtils.isEmpty(this.textToDraw)) {
            return;
        }
        calculateOffsets(0.0f);
        this.textureAscent = this.textPaint.ascent();
        this.textureDescent = this.textPaint.descent();
        TextPaint textPaint = this.textPaint;
        CharSequence charSequence = this.textToDraw;
        int iRound = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
        int iRound2 = Math.round(this.textureDescent - this.textureAscent);
        if (iRound <= 0 || iRound2 <= 0) {
            return;
        }
        this.expandedTitleTexture = Bitmap.createBitmap(iRound, iRound2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.expandedTitleTexture);
        CharSequence charSequence2 = this.textToDraw;
        canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, iRound2 - this.textPaint.descent(), this.textPaint);
        if (this.texturePaint == null) {
            this.texturePaint = new Paint(3);
        }
    }

    @ColorInt
    private int getCurrentColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.state;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    @ColorInt
    private int getCurrentExpandedTextColor() {
        return getCurrentColor(this.expandedTextColor);
    }

    private void getTextPaintCollapsed(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.collapsedTextSize);
        textPaint.setTypeface(this.collapsedTypeface);
    }

    private void getTextPaintExpanded(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.expandedTextSize);
        textPaint.setTypeface(this.expandedTypeface);
    }

    private void interpolateBounds(float f) {
        this.currentBounds.left = lerp(this.expandedBounds.left, this.collapsedBounds.left, f, this.positionInterpolator);
        this.currentBounds.top = lerp(this.expandedDrawY, this.collapsedDrawY, f, this.positionInterpolator);
        this.currentBounds.right = lerp(this.expandedBounds.right, this.collapsedBounds.right, f, this.positionInterpolator);
        this.currentBounds.bottom = lerp(this.expandedBounds.bottom, this.collapsedBounds.bottom, f, this.positionInterpolator);
    }

    private static boolean isClose(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static float lerp(float f, float f2, float f3, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AnimationUtils.lerp(f, f2, f3);
    }

    private static boolean rectEquals(@NonNull Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private boolean setCollapsedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.collapsedTypeface == typeface) {
            return false;
        }
        this.collapsedTypeface = typeface;
        return true;
    }

    private boolean setExpandedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.expandedTypeface == typeface) {
            return false;
        }
        this.expandedTypeface = typeface;
        return true;
    }

    private void setInterpolatedTextSize(float f) {
        calculateUsingTextSize(f);
        boolean z = USE_SCALING_TEXTURE && this.scale != 1.0f;
        this.useTexture = z;
        if (z) {
            ensureExpandedTexture();
        }
        kkl0.m150146a0(this.view);
    }

    public float calculateCollapsedTextWidth() {
        if (this.text == null) {
            return 0.0f;
        }
        getTextPaintCollapsed(this.tmpPaint);
        TextPaint textPaint = this.tmpPaint;
        CharSequence charSequence = this.text;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        float fAscent;
        int iSave = canvas.save();
        if (this.textToDraw == null || !this.drawTitle) {
            canvas2 = canvas;
        } else {
            float f = this.currentDrawX;
            float f2 = this.currentDrawY;
            boolean z = this.useTexture && this.expandedTitleTexture != null;
            if (z) {
                fAscent = this.textureAscent * this.scale;
            } else {
                fAscent = this.textPaint.ascent() * this.scale;
                this.textPaint.descent();
            }
            if (z) {
                f2 += fAscent;
            }
            float f3 = f2;
            float f4 = this.scale;
            if (f4 != 1.0f) {
                canvas.scale(f4, f4, f, f3);
            }
            if (z) {
                canvas.drawBitmap(this.expandedTitleTexture, f, f3, this.texturePaint);
                canvas2 = canvas;
            } else {
                CharSequence charSequence = this.textToDraw;
                canvas2 = canvas;
                canvas2.drawText(charSequence, 0, charSequence.length(), f, f3, this.textPaint);
            }
        }
        canvas2.restoreToCount(iSave);
    }

    public void getCollapsedTextActualBounds(@NonNull RectF rectF) {
        boolean zCalculateIsRtl = calculateIsRtl(this.text);
        Rect rect = this.collapsedBounds;
        float fCalculateCollapsedTextWidth = !zCalculateIsRtl ? rect.left : rect.right - calculateCollapsedTextWidth();
        rectF.left = fCalculateCollapsedTextWidth;
        Rect rect2 = this.collapsedBounds;
        rectF.top = rect2.top;
        rectF.right = !zCalculateIsRtl ? fCalculateCollapsedTextWidth + calculateCollapsedTextWidth() : rect2.right;
        rectF.bottom = this.collapsedBounds.top + getCollapsedTextHeight();
    }

    public ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    public int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public float getCollapsedTextHeight() {
        getTextPaintCollapsed(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.collapsedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @ColorInt
    public int getCurrentCollapsedTextColor() {
        return getCurrentColor(this.collapsedTextColor);
    }

    public ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public float getExpandedTextHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.expandedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float getExpansionFraction() {
        return this.expandedFraction;
    }

    @Nullable
    public CharSequence getText() {
        return this.text;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.collapsedTextColor;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.expandedTextColor;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void onBoundsChanged() {
        this.drawTitle = this.collapsedBounds.width() > 0 && this.collapsedBounds.height() > 0 && this.expandedBounds.width() > 0 && this.expandedBounds.height() > 0;
    }

    public void recalculate() {
        if (this.view.getHeight() <= 0 || this.view.getWidth() <= 0) {
            return;
        }
        calculateBaseOffsets();
        calculateCurrentOffsets();
    }

    public void setCollapsedBounds(int i, int i2, int i3, int i4) {
        if (rectEquals(this.collapsedBounds, i, i2, i3, i4)) {
            return;
        }
        this.collapsedBounds.set(i, i2, i3, i4);
        this.boundsChanged = true;
        onBoundsChanged();
    }

    public void setCollapsedTextAppearance(int i) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), i);
        ColorStateList colorStateList = textAppearance.textColor;
        if (colorStateList != null) {
            this.collapsedTextColor = colorStateList;
        }
        float f = textAppearance.textSize;
        if (f != 0.0f) {
            this.collapsedTextSize = f;
        }
        ColorStateList colorStateList2 = textAppearance.shadowColor;
        if (colorStateList2 != null) {
            this.collapsedShadowColor = colorStateList2;
        }
        this.collapsedShadowDx = textAppearance.shadowDx;
        this.collapsedShadowDy = textAppearance.shadowDy;
        this.collapsedShadowRadius = textAppearance.shadowRadius;
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.collapsedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.1
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setCollapsedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.collapsedFontCallback);
        recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.collapsedTextColor != colorStateList) {
            this.collapsedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedTextGravity(int i) {
        if (this.collapsedTextGravity != i) {
            this.collapsedTextGravity = i;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f) {
        if (this.collapsedTextSize != f) {
            this.collapsedTextSize = f;
            recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (setCollapsedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setExpandedBounds(int i, int i2, int i3, int i4) {
        if (rectEquals(this.expandedBounds, i, i2, i3, i4)) {
            return;
        }
        this.expandedBounds.set(i, i2, i3, i4);
        this.boundsChanged = true;
        onBoundsChanged();
    }

    public void setExpandedTextAppearance(int i) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), i);
        ColorStateList colorStateList = textAppearance.textColor;
        if (colorStateList != null) {
            this.expandedTextColor = colorStateList;
        }
        float f = textAppearance.textSize;
        if (f != 0.0f) {
            this.expandedTextSize = f;
        }
        ColorStateList colorStateList2 = textAppearance.shadowColor;
        if (colorStateList2 != null) {
            this.expandedShadowColor = colorStateList2;
        }
        this.expandedShadowDx = textAppearance.shadowDx;
        this.expandedShadowDy = textAppearance.shadowDy;
        this.expandedShadowRadius = textAppearance.shadowRadius;
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.expandedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.2
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setExpandedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.expandedFontCallback);
        recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.expandedTextColor != colorStateList) {
            this.expandedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextGravity(int i) {
        if (this.expandedTextGravity != i) {
            this.expandedTextGravity = i;
            recalculate();
        }
    }

    public void setExpandedTextSize(float f) {
        if (this.expandedTextSize != f) {
            this.expandedTextSize = f;
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (setExpandedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setExpansionFraction(float f) {
        float fM144941a = jhx.m144941a(f, 0.0f, 1.0f);
        if (fM144941a != this.expandedFraction) {
            this.expandedFraction = fM144941a;
            calculateCurrentOffsets();
        }
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.positionInterpolator = timeInterpolator;
        recalculate();
    }

    public final boolean setState(int[] iArr) {
        this.state = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.text, charSequence)) {
            this.text = charSequence;
            this.textToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.textSizeInterpolator = timeInterpolator;
        recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        boolean collapsedTypefaceInternal = setCollapsedTypefaceInternal(typeface);
        boolean expandedTypefaceInternal = setExpandedTypefaceInternal(typeface);
        if (collapsedTypefaceInternal || expandedTypefaceInternal) {
            recalculate();
        }
    }

    public void setCollapsedBounds(@NonNull Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setExpandedBounds(@NonNull Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }
}
