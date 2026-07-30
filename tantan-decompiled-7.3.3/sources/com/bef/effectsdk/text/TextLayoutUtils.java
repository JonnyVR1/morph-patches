package com.bef.effectsdk.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.amazing.annotation.EffectKeep;
import com.bef.effectsdk.text.data.BitmapType;
import com.bef.effectsdk.text.data.CharLayout;
import com.bef.effectsdk.text.data.TextBitmapResult;
import com.bef.effectsdk.text.data.TextLayoutParam;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class TextLayoutUtils {
    private static final int FONT_SIZE_INCREMENT = 2;
    private static final int FONT_SIZE_INIT = 10;
    private static final int MAX_BITMAP_HEIGHT = 2048;
    private static final int MAX_BITMAP_WIDTH = 2048;

    /* JADX INFO: renamed from: com.bef.effectsdk.text.TextLayoutUtils$1 */
    public static /* synthetic */ class C10441 {
        static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE;
        static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$data$BitmapType;

        static {
            int[] iArr = new int[COLOR_TYPE.values().length];
            $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE = iArr;
            try {
                iArr[COLOR_TYPE.COLOR_TYPE_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[COLOR_TYPE.COLOR_TYPE_RGBA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[BitmapType.values().length];
            $SwitchMap$com$bef$effectsdk$text$data$BitmapType = iArr2;
            try {
                iArr2[BitmapType.TEXT_BITMAP_SHAKE_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.TEXT_BITMAP_NEON_ALPHA.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum COLOR_TYPE {
        COLOR_TYPE_RGBA,
        COLOR_TYPE_ALPHA
    }

    @EffectKeep
    public static TextBitmapResult generateBitmapAtlasAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    @EffectKeep
    public static TextBitmapResult generateBitmapAtlasAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    @EffectKeep
    public static TextBitmapResult generateBitmapAtlasRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    @EffectKeep
    public static TextBitmapResult generateBitmapAtlasRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Multi-variable type inference failed */
    private static TextBitmapResult generateBitmapAtlasUTF8(String str, TextLayoutParam textLayoutParam, COLOR_TYPE color_type) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        TextBitmapResult textBitmapResult;
        ArrayList arrayList;
        ArrayList<Rect> arrayList2;
        Bitmap bitmapCreateBitmap;
        short s;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        if (str.isEmpty()) {
            return null;
        }
        Typeface fromSystem = Typeface.DEFAULT;
        String str2 = textLayoutParam.familyName;
        if (str2 != null && !str2.isEmpty()) {
            String str3 = textLayoutParam.fontPath;
            fromSystem = (str3 == null || str3.isEmpty()) ? FontCache.getFromSystem(textLayoutParam.familyName, textLayoutParam.fontStyle) : FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName);
        }
        int i5 = textLayoutParam.textColor;
        int i6 = textLayoutParam.backColor;
        int i7 = textLayoutParam.shadowColor;
        if (C10441.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[color_type.ordinal()] != 1) {
            i = ((i5 & 255) << 24) + ((i5 >> 8) & 16777215);
            i2 = ((i6 & 255) << 24) + ((i6 >> 8) & 16777215);
            i3 = ((i7 & 255) << 24) + ((i7 >> 8) & 16777215);
        } else {
            i = (i5 & 255) << 24;
            i2 = (i6 & 255) << 24;
            i3 = (i7 & 255) << 24;
        }
        Paint.Style style = Paint.Style.FILL;
        int i8 = textLayoutParam.paintStyle;
        if (i8 == 0) {
            f = 0.0f;
        } else if (i8 == 1) {
            style = Paint.Style.STROKE;
            f = textLayoutParam.strokeWidth;
        } else if (i8 != 2) {
            f = 0.0f;
        } else {
            style = Paint.Style.FILL_AND_STROKE;
            f = textLayoutParam.strokeWidth;
        }
        TextPaint textPaint = new TextPaint(1);
        if (fromSystem != null) {
            textPaint.setTypeface(fromSystem);
        }
        textPaint.setColor(i);
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(f);
        textPaint.setTextSize(textLayoutParam.fontSize);
        textPaint.setShadowLayer(textLayoutParam.shadowRadius, textLayoutParam.shadowDx, textLayoutParam.shadowDy, i3);
        int i9 = textLayoutParam.lineWidth;
        if (i9 > 2048 || i9 == 0) {
            i9 = 2048;
        }
        TextBitmapResult textBitmapResult2 = new TextBitmapResult();
        textBitmapResult2.channel = 4;
        textBitmapResult2.lineCount = 0;
        textBitmapResult2.type = 1;
        ArrayList arrayList6 = new ArrayList();
        HashMap map = new HashMap();
        ArrayList arrayList7 = new ArrayList();
        float fAbs = Math.abs(textLayoutParam.shadowDx) + (textLayoutParam.shadowRadius / 2.0f);
        float fAbs2 = Math.abs(textLayoutParam.shadowDy);
        float f2 = textLayoutParam.shadowRadius;
        float f3 = fAbs2 + (f2 / 2.0f);
        float f4 = textLayoutParam.letterSpacing;
        if (f4 <= 0.0f) {
            f4 = 0.0f;
        }
        int i10 = (int) f4;
        short s2 = 1;
        float f5 = textLayoutParam.lineSpacingAdd;
        if (f5 <= 0.0f) {
            f5 = 0.0f;
        }
        int i11 = (int) f5;
        int iMax = ((int) Math.max((-textLayoutParam.shadowDx) + (f2 / 2.0f), 0.0f)) + i10 + 1;
        int iMax2 = ((int) (Math.max((-textLayoutParam.shadowDy) + (textLayoutParam.shadowRadius / 2.0f), 0.0f) + textLayoutParam.fontSize)) + i11 + 1;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= str.length()) {
                i4 = i2;
                textBitmapResult = textBitmapResult2;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                break;
            }
            CharLayout charLayout = new CharLayout();
            i4 = i2;
            charLayout.charCode = 0;
            charLayout.isEmoji = false;
            int i14 = i12 + 1;
            charLayout.charId = i12;
            short s3 = s2;
            while (true) {
                s = s3;
                int i15 = s + i13;
                textBitmapResult = textBitmapResult2;
                int i16 = i15 + 1;
                if (str.length() > i16) {
                    String strSubstring = str.substring(i15 - 1, i15);
                    String strSubstring2 = str.substring(i15, i16);
                    arrayList3 = arrayList6;
                    if (strSubstring.compareTo("\ud800") >= 0 && strSubstring.compareTo("\udbff") <= 0 && strSubstring2.compareTo("\udc00") >= 0 && strSubstring2.compareTo("\udfff") <= 0) {
                        charLayout.isEmoji = s2;
                        s = (short) (s + 1);
                        if (str.length() < i13 + 3) {
                        }
                    }
                    int i17 = i13 + s;
                    int i18 = i17 + 1;
                    arrayList4 = arrayList7;
                    String strSubstring3 = str.substring(i17, i18);
                    String strSubstring4 = str.substring(i18, i17 + 2);
                    if (strSubstring3.compareTo("\u200d") != 0 || strSubstring4.compareTo("\ud800") < 0 || strSubstring4.compareTo("\udbff") > 0) {
                        break;
                    }
                    s3 = (short) (s + 2);
                    textBitmapResult2 = textBitmapResult;
                    arrayList7 = arrayList4;
                    arrayList6 = arrayList3;
                    s2 = 1;
                } else {
                    arrayList3 = arrayList6;
                }
                arrayList4 = arrayList7;
                break;
            }
            short s4 = s;
            if (!charLayout.isEmoji) {
                byte[] bytes = str.substring(i13, i13 + s4).getBytes();
                charLayout.charCode = 0;
                int i19 = 0;
                while (i19 < bytes.length) {
                    int i20 = i19;
                    charLayout.charCode += (bytes[i19] & 255) << (((bytes.length - i20) - 1) * 8);
                    i19 = i20 + 1;
                }
            }
            CharLayout charLayout2 = (CharLayout) map.get(Integer.valueOf(charLayout.charCode));
            if (charLayout2 == null || charLayout.isEmoji) {
                Rect rect = new Rect();
                int i21 = i13 + s4;
                textPaint.getTextBounds(str, i13, i21, rect);
                rect.left = (int) (rect.left + Math.min(textLayoutParam.shadowDx - (textLayoutParam.shadowRadius / 2.0f), 0.0f));
                rect.right = (int) (rect.right + Math.max(textLayoutParam.shadowDx + (textLayoutParam.shadowRadius / 2.0f), 0.0f));
                rect.bottom = (int) (rect.bottom + Math.max(textLayoutParam.shadowDy + (textLayoutParam.shadowRadius / 2.0f), 0.0f));
                rect.top = (int) (rect.top + Math.min(textLayoutParam.shadowDy - (textLayoutParam.shadowRadius / 2.0f), 0.0f));
                float fMeasureText = textPaint.measureText(str, i13, i21);
                charLayout.advance = fMeasureText;
                float f6 = i10;
                int iMax3 = iMax;
                if (iMax + fMeasureText + fAbs + f6 + 1.0f >= i9) {
                    iMax3 = ((int) Math.max((-textLayoutParam.shadowDx) + (textLayoutParam.shadowRadius / 2.0f), 0.0f)) + i10 + 1;
                    iMax2 = (int) (iMax2 + textLayoutParam.fontSize + f3 + i11 + 1.0f);
                    if (iMax2 >= 4194304 / i9) {
                        arrayList2 = arrayList4;
                        arrayList = arrayList3;
                        break;
                    }
                }
                int i22 = iMax3;
                Rect rect2 = new Rect(i13, i21, i22, iMax2);
                ArrayList arrayList8 = arrayList4;
                arrayList8.add(rect2);
                charLayout.baseline = iMax2;
                float f7 = i22;
                charLayout.origin = f7;
                int i23 = rect.left;
                arrayList5 = arrayList8;
                charLayout.pos_left = i23;
                int i24 = rect.top;
                charLayout.pos_top = i24;
                int i25 = rect.right;
                charLayout.pos_right = i25;
                int i26 = rect.bottom;
                charLayout.pos_bottom = i26;
                charLayout.left = i23 + i22;
                charLayout.top = i24 + iMax2;
                charLayout.right = i25 + i22;
                charLayout.bottom = i26 + iMax2;
                map.put(Integer.valueOf(charLayout.charCode), charLayout);
                iMax = (int) (f7 + fMeasureText + fAbs + f6 + 1.0f);
            } else {
                charLayout.pos_left = charLayout2.pos_left;
                charLayout.pos_top = charLayout2.pos_top;
                charLayout.pos_right = charLayout2.pos_right;
                charLayout.pos_bottom = charLayout2.pos_bottom;
                charLayout.left = charLayout2.left;
                charLayout.top = charLayout2.top;
                charLayout.right = charLayout2.right;
                charLayout.bottom = charLayout2.bottom;
                charLayout.baseline = charLayout2.baseline;
                charLayout.origin = charLayout2.origin;
                charLayout.advance = charLayout2.advance;
                arrayList5 = arrayList4;
            }
            ArrayList arrayList9 = arrayList3;
            arrayList9.add(charLayout);
            i13 += s4;
            arrayList6 = arrayList9;
            i2 = i4;
            i12 = i14;
            textBitmapResult2 = textBitmapResult;
            arrayList7 = arrayList5;
            s2 = 1;
        }
        CharLayout[] charLayoutArr = (CharLayout[]) arrayList.toArray(new CharLayout[0]);
        TextBitmapResult textBitmapResult3 = textBitmapResult;
        textBitmapResult3.charLayouts = charLayoutArr;
        int i27 = iMax2 + ((int) textLayoutParam.fontSize);
        if (C10441.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[color_type.ordinal()] != 1) {
            bitmapCreateBitmap = Bitmap.createBitmap(i9, i27, Bitmap.Config.ARGB_8888);
            textBitmapResult3.channel = 4;
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(i9, i27, Bitmap.Config.ALPHA_8);
            textBitmapResult3.channel = 1;
        }
        if (bitmapCreateBitmap == null) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i4);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i28 = 0;
        canvas.drawRect(new Rect(0, 0, i9, i27), paint);
        for (Rect rect3 : arrayList2) {
            canvas.drawText(str.substring(rect3.left, rect3.top), rect3.right, rect3.bottom, textPaint);
        }
        textBitmapResult3.bitmap = bitmapCreateBitmap;
        while (true) {
            CharLayout[] charLayoutArr2 = textBitmapResult3.charLayouts;
            if (i28 >= charLayoutArr2.length) {
                canvas.setBitmap(null);
                return textBitmapResult3;
            }
            CharLayout charLayout3 = charLayoutArr2[i28];
            float f8 = i27;
            charLayout3.bottom /= f8;
            charLayout3.top /= f8;
            float f9 = i9;
            charLayout3.left /= f9;
            charLayout3.right /= f9;
            i28++;
        }
    }

    @EffectKeep
    public static TextBitmapResult generateBitmapNeonAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return generateBitmapNeonAlphaUTF8(new String(iArr, 0, iArr.length), textLayoutParam);
    }

    @EffectKeep
    public static TextBitmapResult generateBitmapNeonAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        int i = C10441.$SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.valueOf(textLayoutParam.bitmapType).ordinal()];
        if (i == 1) {
            return generateTextAutoSizedShakeBitmap(str, textLayoutParam);
        }
        if (i != 2) {
            return null;
        }
        return generateTextAutoSizedNeonBitmap(str, textLayoutParam);
    }

    @EffectKeep
    public static TextBitmapResult generateBitmapNormalAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    @EffectKeep
    public static TextBitmapResult generateBitmapNormalAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    @EffectKeep
    public static TextBitmapResult generateBitmapNormalRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    @EffectKeep
    public static TextBitmapResult generateBitmapNormalRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    private static TextBitmapResult generateBitmapNormalUTF8(String str, TextLayoutParam textLayoutParam, COLOR_TYPE color_type) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        boolean z;
        TextUtils.TruncateAt truncateAt;
        int i5;
        TextPaint textPaint;
        int i6;
        int i7;
        Layout layoutBuild;
        int i8;
        Bitmap bitmapCreateBitmap;
        if (str.isEmpty()) {
            return null;
        }
        Typeface fromSystem = Typeface.DEFAULT;
        String str2 = textLayoutParam.familyName;
        if (str2 != null && !str2.isEmpty()) {
            String str3 = textLayoutParam.fontPath;
            fromSystem = (str3 == null || str3.isEmpty()) ? FontCache.getFromSystem(textLayoutParam.familyName, textLayoutParam.fontStyle) : FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName);
        }
        int i9 = textLayoutParam.textColor;
        int i10 = textLayoutParam.backColor;
        int i11 = textLayoutParam.shadowColor;
        if (C10441.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[color_type.ordinal()] != 1) {
            i = ((i9 & 255) << 24) + ((i9 >> 8) & 16777215);
            i2 = ((i10 & 255) << 24) + ((i10 >> 8) & 16777215);
            i3 = ((i11 & 255) << 24) + ((i11 >> 8) & 16777215);
        } else {
            i = (i9 & 255) << 24;
            i2 = (i10 & 255) << 24;
            i3 = (i11 & 255) << 24;
        }
        int i12 = i2;
        Paint.Style style = Paint.Style.FILL;
        int i13 = textLayoutParam.paintStyle;
        if (i13 == 0) {
            f = 0.0f;
        } else if (i13 == 1) {
            style = Paint.Style.STROKE;
            f = textLayoutParam.strokeWidth;
        } else if (i13 != 2) {
            f = 0.0f;
        } else {
            style = Paint.Style.FILL_AND_STROKE;
            f = textLayoutParam.strokeWidth;
        }
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int i14 = textLayoutParam.textAlign;
        if (i14 != 0) {
            if (i14 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i14 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
        }
        int i15 = textLayoutParam.maxLine;
        int i16 = textLayoutParam.lineWidth;
        float f2 = 0.0f;
        if (i16 == 0) {
            i15 = 1;
            i16 = 2048;
            i4 = 2048;
            z = false;
        } else {
            i4 = i16;
            z = true;
        }
        if (i15 == 1) {
            int i17 = textLayoutParam.lineBreakMode;
            if (i17 == 0 || i17 == 1) {
                truncateAt = TextUtils.TruncateAt.MARQUEE;
            } else if (i17 == 2) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i17 != 3) {
                truncateAt = i17 != 4 ? null : TextUtils.TruncateAt.END;
            } else {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            }
            i5 = 2048;
            z = false;
        } else {
            truncateAt = null;
            i5 = 2048;
        }
        if (i4 > i5) {
            i4 = i5;
        }
        if (i16 > i5) {
            i16 = 2048;
        }
        if (i15 == 0) {
            i15 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        int i18 = i15;
        TextPaint textPaint2 = new TextPaint(1);
        if (fromSystem != null) {
            textPaint2.setTypeface(fromSystem);
        }
        textPaint2.setColor(i);
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(f);
        textPaint2.setTextSize(textLayoutParam.fontSize);
        textPaint2.setShadowLayer(textLayoutParam.shadowRadius, textLayoutParam.shadowDx, textLayoutParam.shadowDy, i3);
        textPaint2.setLetterSpacing(textLayoutParam.letterSpacing);
        Layout.Alignment alignment2 = alignment;
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(str, textPaint2);
        if (i18 != 1 || metricsIsBoring == null || truncateAt == TextUtils.TruncateAt.MARQUEE) {
            textPaint = textPaint2;
            i6 = i16;
            i7 = 0;
            layoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i6).setAlignment(alignment2).setLineSpacing(textLayoutParam.lineSpacingAdd, textLayoutParam.lineSpacingMult).setIncludePad(true).setEllipsize(truncateAt).setEllipsizedWidth(i4).build();
        } else {
            i6 = i16;
            textPaint = textPaint2;
            i7 = 0;
            layoutBuild = new BoringLayout(str, textPaint, i6, alignment2, textLayoutParam.lineSpacingMult, textLayoutParam.lineSpacingAdd, metricsIsBoring, true, truncateAt, i4);
        }
        int iMin = Math.min(layoutBuild.getLineCount(), i18);
        if (iMin == 0) {
            return null;
        }
        if (z) {
            i4 = i6;
        }
        int iMax = i4;
        int iMax2 = i7;
        int i19 = iMax2;
        int i20 = i19;
        while (true) {
            if (i20 >= iMin) {
                i8 = 2048;
                break;
            }
            i8 = 2048;
            if (Math.max(layoutBuild.getLineBottom(i20), iMax2) > 2048) {
                break;
            }
            iMax = Math.max((int) (layoutBuild.getLineRight(i20) - layoutBuild.getLineLeft(i20)), iMax);
            iMax2 = Math.max(layoutBuild.getLineBottom(i20), iMax2);
            i19++;
            i20++;
        }
        if (iMax > i8) {
            iMax = i8;
        }
        if (layoutBuild.getLineBottom(i7) == 0) {
            return null;
        }
        if (i19 == 0) {
            iMax2 = i8;
            i19 = 1;
        }
        if (i19 == layoutBuild.getLineCount()) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float fAbs = textLayoutParam.lineSpacingAdd + (textLayoutParam.lineSpacingMult * (fontMetrics.descent + Math.abs(fontMetrics.ascent) + fontMetrics.leading));
            int i21 = i19 - 1;
            float lineBottom = fAbs - (layoutBuild.getLineBottom(i21) - layoutBuild.getLineTop(i21));
            if (lineBottom > 0.0f) {
                float f3 = 0.5f + lineBottom;
                iMax2 = (int) (iMax2 + f3);
                f2 = f3;
            }
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 4;
        textBitmapResult.lineCount = i19;
        textBitmapResult.type = 1;
        textBitmapResult.charLayouts = new CharLayout[i19];
        for (int i22 = i7; i22 < i19; i22++) {
            textBitmapResult.charLayouts[i22] = new CharLayout();
            float f4 = iMax2;
            textBitmapResult.charLayouts[i22].baseline = layoutBuild.getLineBaseline(i22) / f4;
            CharLayout charLayout = textBitmapResult.charLayouts[i22];
            float f5 = iMax;
            float lineLeft = layoutBuild.getLineLeft(i22) / f5;
            charLayout.left = lineLeft;
            charLayout.pos_left = lineLeft;
            CharLayout charLayout2 = textBitmapResult.charLayouts[i22];
            float lineTop = layoutBuild.getLineTop(i22) / f4;
            charLayout2.top = lineTop;
            charLayout2.pos_top = lineTop;
            CharLayout charLayout3 = textBitmapResult.charLayouts[i22];
            float lineRight = layoutBuild.getLineRight(i22) / f5;
            charLayout3.right = lineRight;
            charLayout3.pos_right = lineRight;
            int i23 = i19 - 1;
            CharLayout[] charLayoutArr = textBitmapResult.charLayouts;
            if (i22 == i23) {
                CharLayout charLayout4 = charLayoutArr[i22];
                float lineBottom2 = (layoutBuild.getLineBottom(i22) + f2) / f4;
                charLayout4.bottom = lineBottom2;
                charLayout4.pos_bottom = lineBottom2;
            } else {
                CharLayout charLayout5 = charLayoutArr[i22];
                float lineBottom3 = layoutBuild.getLineBottom(i22) / f4;
                charLayout5.bottom = lineBottom3;
                charLayout5.pos_bottom = lineBottom3;
            }
            textBitmapResult.charLayouts[i22].charCode = -2;
        }
        if (C10441.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[color_type.ordinal()] != 1) {
            bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            textBitmapResult.channel = 4;
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ALPHA_8);
            textBitmapResult.channel = 1;
        }
        bitmapCreateBitmap.setPremultiplied(true);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(i12);
        canvas.drawRect(new Rect(i7, i7, iMax, iMax2), paint);
        layoutBuild.draw(canvas);
        textBitmapResult.bitmap = bitmapCreateBitmap;
        canvas.setBitmap(null);
        return textBitmapResult;
    }

    @EffectKeep
    public static TextBitmapResult generateTextAutoSizedNeonBitmap(String str, TextLayoutParam textLayoutParam) {
        float f;
        float f2;
        float f3;
        String[] strArrSplitLyric = splitLyric(str);
        if (TextUtils.isEmpty(str) || textLayoutParam == null) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        boolean z = textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent;
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = strArrSplitLyric.length;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[strArrSplitLyric.length];
        int[] iArr = new int[strArrSplitLyric.length];
        float f4 = 0.0f;
        for (int i = 0; i < strArrSplitLyric.length; i++) {
            String str2 = strArrSplitLyric[i];
            textPaint.setTextSize(10.0f);
            int i2 = 10;
            for (float fMeasureText = textPaint.measureText(str2, 0, str2.length()); fMeasureText <= textLayoutParam.lineWidth; fMeasureText = textPaint.measureText(str2, 0, str2.length())) {
                i2 += 2;
                textPaint.setTextSize(i2);
            }
            int i3 = i2 - 2;
            iArr[i] = i3;
            textPaint.setTextSize(i3);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            if (z) {
                f2 = fontMetrics.bottom;
                f3 = fontMetrics.top;
            } else {
                f2 = fontMetrics.descent;
                f3 = fontMetrics.ascent;
            }
            f4 += f2 - f3;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) f4, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        textBitmapResult.bitmap = bitmapCreateBitmap;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < strArrSplitLyric.length; i4++) {
            String str3 = strArrSplitLyric[i4];
            textPaint.setTextSize(iArr[i4]);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            StaticLayout.Builder.obtain(str3, 0, str3.length(), textPaint, canvas.getWidth()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build().draw(canvas);
            CharLayout charLayout = new CharLayout();
            if (z) {
                float f6 = fontMetrics2.bottom;
                float f7 = fontMetrics2.top;
                f = f6 - f7;
                charLayout.baseline = (f5 - f7) / f4;
            } else {
                float f8 = fontMetrics2.descent;
                float f9 = fontMetrics2.ascent;
                f = f8 - f9;
                charLayout.baseline = (f5 - f9) / f4;
            }
            charLayout.top = f5 / f4;
            f5 += f;
            charLayout.bottom = f5 / f4;
            charLayout.left = 0.0f;
            charLayout.right = 1.0f;
            textBitmapResult.charLayouts[i4] = charLayout;
            canvas.translate(0.0f, f);
        }
        return textBitmapResult;
    }

    @EffectKeep
    public static TextBitmapResult generateTextAutoSizedShakeBitmap(String str, TextLayoutParam textLayoutParam) {
        String[] strArrLyricShakeSplit = lyricShakeSplit(str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        textPaint.setTextSize(textLayoutParam.fontSize);
        boolean z = textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        ArrayList arrayList = new ArrayList();
        float f = textLayoutParam.lineWidth;
        int lineCount = 0;
        float height = 0.0f;
        for (String str2 : strArrLyricShakeSplit) {
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str2, 0, str2.length(), textPaint, (int) f).setAlignment(Layout.Alignment.ALIGN_OPPOSITE).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
            lineCount += staticLayoutBuild.getLineCount();
            arrayList.add(staticLayoutBuild);
            height += staticLayoutBuild.getHeight();
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = lineCount;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[lineCount];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) height, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        textBitmapResult.bitmap = bitmapCreateBitmap;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        while (i < strArrLyricShakeSplit.length) {
            float height2 = ((StaticLayout) arrayList.get(i)).getHeight();
            float lineCount2 = height2 / ((StaticLayout) arrayList.get(i)).getLineCount();
            int i3 = 0;
            while (i3 < ((StaticLayout) arrayList.get(i)).getLineCount()) {
                CharLayout charLayout = new CharLayout();
                String[] strArr = strArrLyricShakeSplit;
                float lineWidth = ((StaticLayout) arrayList.get(i)).getLineWidth(i3);
                if (z) {
                    charLayout.baseline = (f2 - fontMetrics.top) / height;
                } else {
                    charLayout.baseline = (f2 - fontMetrics.ascent) / height;
                }
                charLayout.top = f2 / height;
                f2 += lineCount2;
                charLayout.bottom = (f2 - (Math.abs(fontMetrics.bottom - fontMetrics.descent) / 2.0f)) / height;
                if (textLayoutParam.textAlign == 0) {
                    charLayout.left = 0.0f;
                    charLayout.right = (f - lineWidth) / f;
                } else {
                    charLayout.left = (f - lineWidth) / f;
                    charLayout.right = 1.0f;
                }
                textBitmapResult.charLayouts[i2] = charLayout;
                i2++;
                i3++;
                strArrLyricShakeSplit = strArr;
            }
            ((StaticLayout) arrayList.get(i)).draw(canvas);
            canvas.translate(0.0f, height2 * ((StaticLayout) arrayList.get(i)).getLineCount());
            i++;
            strArrLyricShakeSplit = strArrLyricShakeSplit;
        }
        return textBitmapResult;
    }

    @EffectKeep
    public static String[] lyricShakeSplit(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.replace(SignParameters.NEW_LINE, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).replace(Constants.SEPARATOR_COMMA, "").replace("\r", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < strArrSplit.length) {
            if (!strArrSplit[i].isEmpty()) {
                int length = sb.toString().length();
                if (length == 0) {
                    if (strArrSplit[i].length() < 10) {
                        sb.append(strArrSplit[i]);
                    } else if (strArrSplit[i].length() == 10) {
                        arrayList.add(strArrSplit[i]);
                    } else {
                        arrayList.add(strArrSplit[i].substring(0, 10));
                        boolean z = (strArrSplit[i].length() - 10) % 9 == 0;
                        int length2 = z ? (strArrSplit[i].length() - 10) / 9 : ((strArrSplit[i].length() - 10) / 9) + 1;
                        for (int i2 = 0; i2 < length2; i2++) {
                            if (i2 != 0) {
                                int i3 = ((i2 - 1) * 9) + 19;
                                if (i2 < length2 - 1) {
                                    sb.append("-");
                                    sb.append(strArrSplit[i].substring(i3, (i2 * 9) + 19));
                                    String string = sb.toString();
                                    arrayList.add(string);
                                    sb.delete(0, string.length());
                                } else if (z) {
                                    sb.append("-");
                                    sb.append(strArrSplit[i].substring(i3, (i2 * 9) + 19));
                                    String string2 = sb.toString();
                                    arrayList.add(string2);
                                    sb.delete(0, string2.length());
                                } else {
                                    int length3 = strArrSplit[i].length();
                                    sb.append("-");
                                    sb.append(strArrSplit[i].substring(i3, length3));
                                }
                            } else if (z) {
                                sb.append("-");
                                sb.append(strArrSplit[i].substring(10, 19));
                                String string3 = sb.toString();
                                arrayList.add(string3);
                                sb.delete(0, string3.length());
                            } else if (length2 == 1) {
                                int length4 = strArrSplit[i].length();
                                sb.append("-");
                                sb.append(strArrSplit[i].substring(10, length4));
                            } else {
                                sb.append("-");
                                sb.append(strArrSplit[i].substring(10, 19));
                                String string4 = sb.toString();
                                arrayList.add(string4);
                                sb.delete(0, string4.length());
                            }
                        }
                    }
                } else if (sb.toString().length() + strArrSplit[i].length() + 1 <= 10) {
                    sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb.append(strArrSplit[i]);
                } else {
                    arrayList.add(sb.toString());
                    sb.delete(0, length);
                    i--;
                }
            }
            i++;
        }
        if (sb.toString().length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @EffectKeep
    public static String[] splitLyric(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.replace(SignParameters.NEW_LINE, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).replace("\r", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            StringBuilder sb = new StringBuilder();
            int i3 = (i2 % 5) % 3 == 0 ? 6 : 10;
            int length = 0;
            while (i < strArrSplit.length && (strArrSplit[i].length() + length + 1 <= i3 || length <= 3)) {
                length += strArrSplit[i].length() + 1;
                int i4 = i + 1;
                sb.append(strArrSplit[i]);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                if (i4 == strArrSplit.length - 1 && strArrSplit[i4].length() < 3) {
                    sb.append(strArrSplit[i4]);
                }
                i = i4;
            }
            i2++;
            arrayList.add(sb.substring(0, sb.length() - 1));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
