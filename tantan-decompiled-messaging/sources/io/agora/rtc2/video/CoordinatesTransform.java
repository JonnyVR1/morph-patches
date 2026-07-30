package io.agora.rtc2.video;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class CoordinatesTransform {
    public static Rect calculateFocusArea(float f, float f2, float f3) {
        int i = (int) ((f * 2000.0f) - 1000.0f);
        int i2 = (int) ((f2 * 2000.0f) - 1000.0f);
        int iIntValue = Float.valueOf(f3 * 300.0f).intValue() / 2;
        RectF rectF = new RectF(clamp(i - iIntValue, -1000, 1000), clamp(i2 - iIntValue, -1000, 1000), clamp(i + iIntValue, -1000, 1000), clamp(i2 + iIntValue, -1000, 1000));
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static Rect calculateMeteringArea(float f, float f2, int i, int i2, float f3) {
        int i3 = (int) ((f * i) - (i / 2));
        int i4 = (int) ((f2 * i2) - (i2 / 2));
        int iIntValue = Float.valueOf(f3 * 300.0f).intValue() / 2;
        RectF rectF = new RectF(clamp(i3 - iIntValue, 0, i), clamp(i4 - iIntValue, 0, i2), clamp(i3 + iIntValue, 0, i), clamp(i4 + iIntValue, 0, i2));
        Rect rect = new Rect();
        rectF.round(rect);
        return (rect.width() == 0 || rect.height() == 0) ? new Rect(0, 0, 0, 0) : rect;
    }

    public static RectF cameraToNormalized(@NonNull RectF rectF) {
        if (rectF == null || rectF.left < -1000.0f || rectF.top < -1000.0f || rectF.right > 1000.0f || rectF.bottom > 1000.0f) {
            return null;
        }
        RectF rectF2 = new RectF(rectF);
        Matrix matrix = new Matrix();
        matrix.postScale(5.0E-4f, 5.0E-4f);
        matrix.postTranslate(0.5f, 0.5f);
        matrix.mapRect(rectF2);
        return rectF2;
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static RectF normalizedFaceRect(Rect rect, int i, boolean z) {
        Matrix matrix = new Matrix();
        prepareMatrix(matrix, z, i);
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        return rectF;
    }

    public static RectF normalizedToCamera(@NonNull RectF rectF) {
        if (rectF == null || rectF.left < 0.0f || rectF.top < 0.0f || rectF.width() > 1.0f || rectF.height() > 1.0f) {
            return null;
        }
        RectF rectF2 = new RectF(rectF);
        Matrix matrix = new Matrix();
        matrix.postScale(2000.0f, 2000.0f);
        matrix.postTranslate(-1000.0f, -1000.0f);
        matrix.mapRect(rectF2);
        return rectF2;
    }

    public static RectF normalizedToSensor(@NonNull RectF rectF, int i, int i2, int i3, int i4, int i5, boolean z) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (rectF.left >= 0.0f && rectF.top >= 0.0f && rectF.width() <= 1.0f && rectF.height() <= 1.0f) {
            rectF2 = new RectF(rectF);
            Matrix matrix = new Matrix();
            if (z) {
                float f = i3;
                float f2 = f / i;
                float f3 = i4;
                float f4 = f3 / i2;
                float f5 = f2 / f4;
                if (f5 > 1.0f) {
                    matrix.postTranslate((f5 - 1.0f) / 2.0f, 0.0f);
                    i3 = (int) ((f * f4) / f2);
                } else if (f5 < 1.0f) {
                    matrix.postTranslate(0.0f, ((f4 / f2) - 1.0f) / 2.0f);
                    i4 = (int) ((f3 * f2) / f4);
                }
                matrix.mapRect(rectF2);
            }
            matrix.setScale(i3, i4);
            matrix.mapRect(rectF2);
        }
        return rectF2;
    }

    public static RectF normalizedToView(@NonNull RectF rectF, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (rectF.left >= 0.0f && rectF.top >= 0.0f && rectF.right <= 1.0f && rectF.bottom <= 1.0f && i5 % 90 == 0) {
            int i7 = i5 > 0 ? i5 % 360 : (i5 % 360) + 360;
            rectF2 = new RectF(rectF);
            Matrix matrix = new Matrix();
            if (z) {
                float f = rectF2.left;
                rectF2.left = 1.0f - rectF2.right;
                rectF2.right = 1.0f - f;
            }
            matrix.setRotate(-i7);
            if (i7 == 90) {
                matrix.postTranslate(0.0f, 1.0f);
            } else if (i7 == 180) {
                matrix.postTranslate(1.0f, 1.0f);
            } else if (i7 == 270) {
                matrix.postTranslate(1.0f, 0.0f);
            }
            float f2 = i;
            float f3 = i2;
            matrix.postScale(f2, f3);
            matrix.mapRect(rectF2);
            float f4 = (i7 == 90 || i7 == 270) ? i4 : i3;
            float f5 = (i7 == 90 || i7 == 270) ? i3 : i4;
            float f6 = f2 / f4;
            float f7 = f3 / f5;
            if (i6 != 1) {
                if (i6 != 2) {
                    return rectF2;
                }
                if (f6 > f7) {
                    matrix.setScale(f7 / f6, 1.0f, i / 2, i2 / 2);
                    matrix.mapRect(rectF2);
                    rectF2.right = clamp(rectF2.right, 0.0f, f2);
                    rectF2.left = clamp(rectF2.left, 0.0f, f2);
                    return rectF2;
                }
                matrix.setScale(1.0f, f6 / f7, i / 2, i2 / 2);
                matrix.mapRect(rectF2);
                rectF2.top = clamp(rectF2.top, 0.0f, f3);
                rectF2.bottom = clamp(rectF2.bottom, 0.0f, f3);
                return rectF2;
            }
            if (f6 > f7) {
                matrix.setScale(1.0f, f6 / f7, i / 2, i2 / 2);
                matrix.mapRect(rectF2);
                rectF2.top = clamp(rectF2.top, 0.0f, f3);
                rectF2.bottom = clamp(rectF2.bottom, 0.0f, f3);
                return rectF2;
            }
            matrix.setScale(f7 / f6, 1.0f, i / 2, i2 / 2);
            matrix.mapRect(rectF2);
            rectF2.right = clamp(rectF2.right, 0.0f, f2);
            rectF2.left = clamp(rectF2.left, 0.0f, f2);
        }
        return rectF2;
    }

    private static void prepareMatrix(Matrix matrix, boolean z, int i) {
        matrix.setScale(z ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate(i);
        matrix.postScale(5.0E-4f, 5.0E-4f);
        matrix.postTranslate(0.5f, 0.5f);
    }

    public static RectF sensorToNormalized(@NonNull RectF rectF, int i, int i2, int i3, int i4, boolean z) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (rectF.left >= 0.0f && rectF.top >= 0.0f) {
            float f = i;
            if (rectF.width() <= f) {
                float f2 = i2;
                if (rectF.height() <= f2) {
                    rectF2 = new RectF(rectF);
                    Matrix matrix = new Matrix();
                    if (z) {
                        float f3 = f / i3;
                        float f4 = f2 / i4;
                        float f5 = f3 / f4;
                        if (f5 > 1.0f) {
                            matrix.postTranslate((((f4 / f3) - 1.0f) * f) / 2.0f, 0.0f);
                            i = (int) ((f * f4) / f3);
                        } else if (f5 < 1.0f) {
                            matrix.postTranslate(0.0f, ((f5 - 1.0f) * f2) / 2.0f);
                            i2 = (int) ((f2 * f3) / f4);
                        }
                        matrix.mapRect(rectF2);
                    }
                    matrix.setScale(1.0f / i, 1.0f / i2);
                    matrix.mapRect(rectF2);
                    rectF2.left = clamp(rectF2.left, 0.0f, 1.0f);
                    rectF2.right = clamp(rectF2.right, 0.0f, 1.0f);
                    rectF2.top = clamp(rectF2.top, 0.0f, 1.0f);
                    rectF2.bottom = clamp(rectF2.bottom, 0.0f, 1.0f);
                }
            }
        }
        return rectF2;
    }

    public static Rect sensorToNormalizedPreview(Rect rect, int i, int i2, Rect rect2) {
        double d;
        double d2;
        if (i > i2) {
            d = i;
            d2 = i2;
        } else {
            d = i2;
            d2 = i;
        }
        double d3 = d / d2;
        double dWidth = ((double) rect2.width()) / ((double) rect2.height());
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        if (d3 > dWidth) {
            iHeight = (int) (((double) iWidth) / d3);
        } else {
            iWidth = (int) (((double) iHeight) * d3);
        }
        int iAbs = Math.abs(iWidth - rect2.width());
        int iAbs2 = Math.abs(iHeight - rect2.height());
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.postTranslate((-rect2.left) - (iAbs / 2), (-rect2.top) - (iAbs2 / 2));
        matrix.postTranslate((-iWidth) / 2, (-iHeight) / 2);
        matrix.postScale(2000.0f / iWidth, 2000.0f / iHeight);
        matrix.mapRect(rectF);
        Rect rect3 = new Rect();
        rectF.round(rect3);
        return rect3;
    }

    public static RectF viewToNormalized(@NonNull RectF rectF, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (i > 0 && i2 > 0 && rectF.left >= 0.0f && rectF.top >= 0.0f) {
            float f = i;
            if (rectF.right <= f) {
                float f2 = i2;
                if (rectF.bottom <= f2 && i5 % 90 == 0) {
                    int i7 = i5 > 0 ? i5 % 360 : (i5 % 360) + 360;
                    rectF2 = new RectF(rectF);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i7);
                    float f3 = (i7 == 90 || i7 == 270) ? f2 : f;
                    if (i7 != 90 && i7 != 270) {
                        f = f2;
                    }
                    float f4 = f3 / i3;
                    float f5 = f / i4;
                    matrix.postScale(1.0f / f3, 1.0f / f);
                    if (i7 == 90) {
                        matrix.postTranslate(1.0f, 0.0f);
                    } else if (i7 == 180) {
                        matrix.postTranslate(1.0f, 1.0f);
                    } else if (i7 == 270) {
                        matrix.postTranslate(0.0f, 1.0f);
                    }
                    if (i6 != 1) {
                        if (i6 == 2) {
                            if (f4 > f5) {
                                matrix.postScale(f4 / f5, 1.0f, 0.5f, 0.0f);
                                matrix.mapRect(rectF2);
                                rectF2.right = clamp(rectF2.right, 0.0f, 1.0f);
                                rectF2.left = clamp(rectF2.left, 0.0f, 1.0f);
                            } else {
                                matrix.postScale(1.0f, f5 / f4);
                                matrix.mapRect(rectF2);
                                rectF2.top = clamp(rectF2.top, 0.0f, 1.0f);
                                rectF2.bottom = clamp(rectF2.bottom, 0.0f, 1.0f);
                            }
                        }
                    } else if (f4 > f5) {
                        matrix.postScale(1.0f, f5 / f4, 0.0f, 0.5f);
                        matrix.mapRect(rectF2);
                        rectF2.top = clamp(rectF2.top, 0.0f, 1.0f);
                        rectF2.bottom = clamp(rectF2.bottom, 0.0f, 1.0f);
                    } else {
                        matrix.postScale(f4 / f5, 1.0f, 0.5f, 0.0f);
                        matrix.mapRect(rectF2);
                        rectF2.right = clamp(rectF2.right, 0.0f, 1.0f);
                        rectF2.left = clamp(rectF2.left, 0.0f, 1.0f);
                    }
                    if (z) {
                        float f6 = rectF2.left;
                        rectF2.left = 1.0f - rectF2.right;
                        rectF2.right = 1.0f - f6;
                    }
                }
            }
        }
        return rectF2;
    }

    public static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }
}
