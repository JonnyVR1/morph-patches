package com.amazing.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.Xml;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.amazing.annotation.EffectKeep;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class TextMeshUtils {
    @EffectKeep
    private static Bitmap callIStaticGenerateBitmapForEmoji(byte[] bArr, int i) {
        String str = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(i);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawText(str, -rect.left, -rect.top, textPaint);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    @EffectKeep
    private static Bitmap callIStaticGenerateBitmapFromTextMesh(byte[] bArr, String str, int i, int i2, int i3, float f, int i4, float f2, int i5, float f3, float f4, float f5, int i6, int i7, int i8, int i9) {
        double d;
        String[] strArr;
        String str2 = new String(bArr);
        Rect rect = new Rect(0, 0, i8, i9);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColor(0);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i2);
        float f6 = i;
        textPaint.setTextSize(f6);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(style);
        if (i7 == 0) {
            textPaint.setTextAlign(Paint.Align.LEFT);
        } else if (i7 == 1) {
            textPaint.setTextAlign(Paint.Align.CENTER);
        } else {
            textPaint.setTextAlign(Paint.Align.RIGHT);
        }
        if ((i4 & 16) == 16) {
            textPaint.setUnderlineText(true);
        }
        if ((i4 & 32) == 32) {
            textPaint.setStrikeThruText(true);
        }
        if ((i4 & 4) == 4) {
            textPaint.setTextSkewX((-f) / 90.0f);
        }
        if ((i4 & 8) == 8) {
            textPaint.setFakeBoldText(true);
        }
        if ((i4 & 2) == 2) {
            textPaint.setShadowLayer(f3, f4, f5, i6);
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f7 = fontMetrics.top;
        float f8 = fontMetrics.bottom;
        String[] strArrSplit = str2.split(SignParameters.NEW_LINE);
        int length = strArrSplit.length;
        if ((i4 & 1) == 1) {
            TextPaint textPaint2 = new TextPaint();
            d = 0.5d;
            textPaint2.setColor(i5);
            textPaint2.setTextSize(textPaint.getTextSize());
            textPaint2.setAntiAlias(textPaint.isAntiAlias());
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setStrokeWidth((5.0f * f2) / f6);
            textPaint2.setTextAlign(textPaint.getTextAlign());
            textPaint2.setTextSkewX(textPaint.getTextSkewX());
            textPaint.setFakeBoldText(false);
            textPaint2.setFakeBoldText(true);
            float f9 = i3 / f6;
            float f10 = (-fontMetrics.ascent) + fontMetrics.descent;
            float f11 = f10 * 0.1f;
            int i10 = 0;
            while (true) {
                strArr = strArrSplit;
                if (i10 >= length) {
                    break;
                }
                float f12 = f6;
                float f13 = f11;
                int iCenterY = (int) (((double) ((int) ((rect.centerY() - (f7 / 2.0f)) - (f8 / 2.0f)))) - (((double) (f13 + f10)) * ((((double) (length - 1)) * 0.5d) - ((double) i10))));
                textPaint2.setLetterSpacing(f9);
                if (i7 == 0) {
                    canvas.drawText(strArr[i10], rect.left, iCenterY, textPaint2);
                } else if (i7 == 1) {
                    canvas.drawText(strArr[i10], rect.centerX(), iCenterY, textPaint2);
                } else {
                    canvas.drawText(strArr[i10], rect.right, iCenterY, textPaint2);
                }
                i10++;
                strArrSplit = strArr;
                f11 = f13;
                f6 = f12;
            }
        } else {
            d = 0.5d;
            strArr = strArrSplit;
        }
        float f14 = i3 / f6;
        float f15 = (-fontMetrics.ascent) + fontMetrics.descent;
        float f16 = 0.1f * f15;
        for (int i11 = 0; i11 < length; i11++) {
            int iCenterY2 = (int) (((double) ((int) ((rect.centerY() - (f7 / 2.0f)) - (f8 / 2.0f)))) - (((((double) (length - 1)) * d) - ((double) i11)) * ((double) (f16 + f15))));
            textPaint.setLetterSpacing(f14);
            if (i7 == 0) {
                canvas.drawText(strArr[i11], rect.left, iCenterY2, textPaint);
            } else if (i7 == 1) {
                canvas.drawText(strArr[i11], rect.centerX(), iCenterY2, textPaint);
            } else {
                canvas.drawText(strArr[i11], rect.right, iCenterY2, textPaint);
            }
        }
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    private static int drawKernedText(Canvas canvas, String str, float f, float f2, Paint paint, int i) {
        int iWidth;
        int iWidth2;
        Rect rect = new Rect();
        System.out.printf("the text space is: %d\n", Integer.valueOf(i));
        System.out.printf("the text length is: %d\n", Integer.valueOf(str.length()));
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            String strValueOf = String.valueOf(cCharAt);
            Math.round(paint.measureText(String.valueOf(cCharAt)));
            if (cCharAt > 55296) {
                int i4 = i2 + 1;
                String str2 = String.valueOf(cCharAt) + str.charAt(i4);
                if (i4 != 1) {
                    paint.getTextBounds(str, i4, i2 + 2, rect);
                    rect.width();
                }
                int iWidth3 = rect.width() + (i / 2);
                f += iWidth3;
                i3 += iWidth3;
                if (canvas != null) {
                    canvas.drawText(str2, f, f2, paint);
                }
                i2 = i4;
            } else {
                if (cCharAt == ' ') {
                    iWidth2 = Math.round(paint.measureText(String.valueOf(str.charAt(i2)))) + i;
                } else {
                    paint.getTextBounds(str, i2, i2 + 1, rect);
                    if (cCharAt < 128) {
                        if (isNumOrLetters(strValueOf)) {
                            iWidth = rect.width() + i;
                            System.out.printf("%s is NumOrLetters\n", Character.valueOf(cCharAt));
                        } else {
                            iWidth2 = rect.width() + (i * 2);
                        }
                        System.out.printf("%s is: %d, space is: %d, text is %d\n", Character.valueOf(str.charAt(i2)), Integer.valueOf(iWidth2), Integer.valueOf(i), Integer.valueOf(rect.width()));
                    } else {
                        iWidth = rect.width() + (i / 2);
                        System.out.printf("%s is not NumOrLetters\n", Character.valueOf(cCharAt));
                    }
                    iWidth2 = iWidth;
                    System.out.printf("%s is: %d, space is: %d, text is %d\n", Character.valueOf(str.charAt(i2)), Integer.valueOf(iWidth2), Integer.valueOf(i), Integer.valueOf(rect.width()));
                }
                f += iWidth2;
                i3 += iWidth2;
                if (canvas != null) {
                    canvas.drawText(String.valueOf(str.charAt(i2)), f, f2, paint);
                }
            }
            i2++;
        }
        return i3;
    }

    @EffectKeep
    private static Bitmap generateImage(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        float f6;
        float f7;
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        Paint.Align align = Paint.Align.LEFT;
        textPaint.setTextAlign(align);
        textPaint.setColor(i);
        Rect rect = new Rect();
        float[] fArr = new float[str2.length()];
        textPaint.getTextWidths(str2, fArr);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        float f8 = fArr[0];
        float f9 = 0.0f;
        float f10 = !z ? 0.0f : f2;
        if (z2) {
            f9 = f3;
            f6 = f4;
            f7 = f5;
        } else {
            f6 = 0.0f;
            f7 = 0.0f;
        }
        float fMax = Math.max(Math.abs(f9), Math.abs(f6)) + f10;
        TextPaint textPaint2 = new TextPaint();
        if (z || z2) {
            textPaint2.setTextSize(f);
            textPaint2.setAntiAlias(true);
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setTextAlign(align);
            textPaint2.setStrokeWidth(f10 * 2.0f * f);
            textPaint2.setColor(i2);
            if (z2) {
                textPaint2.setShadowLayer(f7 * f, f9 * f, f6 * f, i3);
            }
        }
        float f11 = 2.0f * fMax * f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (rect.width() + f11), (int) (rect.height() + f11), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (z || z2) {
            float f12 = fMax * f;
            canvas.drawText(str2, (-rect.left) + f12, (-rect.top) + f12, textPaint2);
        }
        float f13 = fMax * f;
        canvas.drawText(str2, (-rect.left) + f13, (-rect.top) + f13, textPaint);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    @EffectKeep
    private static float[] generateImageSize(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        float[] fArr = new float[str2.length()];
        textPaint.getTextWidths(str2, fArr);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        if (!z) {
            f2 = 0.0f;
        }
        if (!z2) {
            f3 = 0.0f;
            f4 = 0.0f;
        }
        return new float[]{rect.left, rect.right, -rect.bottom, -rect.top, fArr[0], (f2 + Math.max(Math.abs(f3), Math.abs(f4))) * f, textPaint.ascent(), textPaint.descent()};
    }

    @EffectKeep
    private static String[] getAndroidSystemFontPaths() throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            fileInputStream = new FileInputStream(new File("/system/etc/fonts.xml"));
            try {
                xmlPullParserNewPullParser.setInput(fileInputStream, "utf-8");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String text = null;
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                    if (eventType != 2) {
                        if (eventType != 3) {
                            if (eventType == 4) {
                                text = xmlPullParserNewPullParser.getText();
                            }
                        } else if (IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY.equals(xmlPullParserNewPullParser.getName())) {
                            int i = 0;
                            while (true) {
                                if (i >= arrayList2.size()) {
                                    i = -1;
                                    break;
                                }
                                if (((String) arrayList2.get(i)).contains("Regular")) {
                                    break;
                                }
                                i++;
                            }
                            String str = new String("/system/fonts/");
                            if (i >= 0) {
                                arrayList.add(str.concat((String) arrayList2.get(i)));
                            } else {
                                arrayList.add(str.concat((String) arrayList2.get(0)));
                            }
                        } else if ("font".equals(xmlPullParserNewPullParser.getName())) {
                            arrayList2.add(text);
                        } else if ("familyset".equals(xmlPullParserNewPullParser.getName())) {
                            text = "ending";
                        }
                    } else if (IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY.equals(xmlPullParserNewPullParser.getName())) {
                        arrayList2.clear();
                    }
                }
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return strArr;
            } catch (Exception unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    @EffectKeep
    private static float getDeviceDpi() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public static boolean isNumOrLetters(String str) {
        return Pattern.compile("^[A-Za-z0-9_]+$").matcher(str).matches();
    }
}
