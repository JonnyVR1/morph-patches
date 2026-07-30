package com.core.glcore.util;

import android.app.Activity;
import android.graphics.Rect;
import android.hardware.Camera;
import p153l.erf0;
import p153l.tow;

/* JADX INFO: loaded from: classes.dex */
public class CameraUtil {
    public static Rect calculateTapAreaForFocus(float f, float f2, float f3, float f4, float f5, boolean z) {
        int iIntValue = Float.valueOf(f5 * 100.0f).intValue();
        if (z) {
            f4 = f2 - f4;
        }
        int i = (int) ((((f - f3) / f) * 2000.0f) - 1000.0f);
        int i2 = iIntValue / 2;
        int iClamp = MathUtil.clamp(((int) (((f4 / f2) * 2000.0f) - 1000.0f)) - i2, -1000, 1000);
        int iClamp2 = MathUtil.clamp(iClamp + iIntValue, -1000, 1000);
        int iClamp3 = MathUtil.clamp(i - i2, -1000, 1000);
        return new Rect(iClamp, iClamp3, iClamp2, MathUtil.clamp(iIntValue + iClamp3, -1000, 1000));
    }

    public static Rect calculateTapAreaForMetering(float f, float f2, float f3, float f4, float f5, boolean z) {
        float f6;
        float f7;
        int iIntValue = Float.valueOf(f5 * 800.0f).intValue();
        if (f > f2) {
            f7 = iIntValue;
            f6 = (f2 / f) * f7;
        } else {
            f6 = iIntValue;
            f7 = (f / f2) * f6;
        }
        if (z) {
            f4 = f2 - f4;
        }
        int iClamp = MathUtil.clamp((int) (((int) (((f4 / f2) * 2000.0f) - 1000.0f)) - (f7 / 2.0f)), -1000, 1000);
        int iClamp2 = MathUtil.clamp((int) (iClamp + f7), -1000, 1000);
        int iClamp3 = MathUtil.clamp((int) (((int) ((((f - f3) / f) * 2000.0f) - 1000.0f)) - (f6 / 2.0f)), -1000, 1000);
        return new Rect(iClamp, iClamp3, iClamp2, MathUtil.clamp((int) (iClamp3 + f6), -1000, 1000));
    }

    public static Rect calculateTargetAreaOnFlipData(float f, float f2, Rect rect, boolean z) {
        int i;
        int i2;
        int i3;
        float f3 = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        if (z) {
            i = (int) ((f2 - ((f4 * 2000.0f) / f2)) - 1000.0f);
            i2 = (int) (((f - (f5 * 2000.0f)) / f) - 1000.0f);
            i3 = (int) ((f2 - ((f6 * 2000.0f) / f2)) - 1000.0f);
        } else {
            i = (int) (((f4 * 2000.0f) / f2) - 1000.0f);
            i2 = (int) (((f - (f5 * 2000.0f)) / f) - 1000.0f);
            i3 = (int) (((f6 * 2000.0f) / f2) - 1000.0f);
        }
        return new Rect(MathUtil.clamp(i, -1000, 1000), MathUtil.clamp(i2, -1000, 1000), MathUtil.clamp(i3, -1000, 1000), MathUtil.clamp((int) ((((f - f3) * 2000.0f) / f) - 1000.0f), -1000, 1000));
    }

    public static Rect calculateTargetAreaOnSourceData(float f, float f2, Rect rect) {
        float f3 = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        if (f3 <= 0.0f) {
            f3 = 0.0f;
        }
        if (f4 <= 0.0f) {
            f4 = 0.0f;
        }
        if (f5 > f) {
            f5 = f;
        }
        if (f6 > f2) {
            f6 = f2;
        }
        return new Rect((int) (((f3 * 2000.0f) / f) - 1000.0f), (int) (((f4 * 2000.0f) / f2) - 1000.0f), (int) (((f5 * 2000.0f) / f) - 1000.0f), (int) (((f6 * 2000.0f) / f2) - 1000.0f));
    }

    public static int determineDisplayOrientation(Activity activity, int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotationAngle = getRotationAngle(activity);
        int i2 = cameraInfo.facing;
        int i3 = cameraInfo.orientation;
        return i2 == 1 ? (360 - ((i3 + rotationAngle) % 360)) % 360 : ((i3 - rotationAngle) + 360) % 360;
    }

    public static erf0 getDisplaySize(erf0 erf0Var, erf0 erf0Var2, int i) {
        int iM122179a;
        int iM122179a2;
        if (i == 90 || i == 270) {
            int iM122180b = erf0Var.m122180b();
            iM122179a = erf0Var.m122179a();
            iM122179a2 = iM122180b;
        } else {
            iM122179a = erf0Var.m122180b();
            iM122179a2 = erf0Var.m122179a();
        }
        float fM122180b = erf0Var2.m122180b();
        float f = (iM122179a * 1.0f) / fM122180b;
        float fM122179a = erf0Var2.m122179a();
        float f2 = (iM122179a2 * 1.0f) / fM122179a;
        if (f >= f2) {
            f = f2;
        }
        return new erf0((int) (fM122180b * f), (int) (fM122179a * f));
    }

    public static int getRotationAngle(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public static boolean needUpdateFocus(Rect rect, Rect rect2, int i) {
        float fWidth = rect.width();
        float fHeight = rect.height();
        float fWidth2 = rect2.width();
        float fHeight2 = rect2.height();
        float fAbs = Math.abs(fWidth2 - fWidth);
        float f = i;
        return fAbs > f || Math.abs(fHeight2 - fHeight) > f || Math.abs(rect.left - rect2.left) > i || Math.abs(rect.right - rect2.right) > i || Math.abs(rect.top - rect2.top) > i || Math.abs(rect.bottom - rect2.bottom) > i;
    }

    public static erf0 reScaleSize(erf0 erf0Var, erf0 erf0Var2, int i) {
        if (i == 90 || i == 270) {
            erf0Var = new erf0(erf0Var.m122179a(), erf0Var.m122180b());
        }
        erf0 displaySize = getDisplaySize(erf0Var, erf0Var2, 0);
        return new erf0((displaySize.m122180b() >> 4) << 4, (displaySize.m122179a() >> 4) << 4);
    }

    public static erf0 rescalAspectRatio(erf0 erf0Var, int i, erf0 erf0Var2, boolean z) {
        if (i == 90 || i == 270) {
            erf0Var = new erf0(erf0Var.m122179a(), erf0Var.m122180b());
        }
        if (!z) {
            return getDisplaySize(erf0Var, erf0Var2, 0);
        }
        erf0 displaySize = getDisplaySize(erf0Var, erf0Var2, 0);
        return new erf0((displaySize.m122180b() >> 4) << 4, (displaySize.m122179a() >> 4) << 4);
    }

    public static erf0 rescalAspectRatioBoth(erf0 erf0Var, int i, erf0 erf0Var2, boolean z) {
        if (i == 90 || i == 270) {
            erf0 erf0Var3 = new erf0(erf0Var.m122179a(), erf0Var.m122180b());
            erf0Var2 = new erf0(erf0Var2.m122179a(), erf0Var2.m122180b());
            erf0Var = erf0Var3;
        }
        if (!z) {
            return getDisplaySize(erf0Var, erf0Var2, 0);
        }
        erf0 displaySize = getDisplaySize(erf0Var, erf0Var2, 0);
        return new erf0((displaySize.m122180b() >> 4) << 4, (displaySize.m122179a() >> 4) << 4);
    }

    public static erf0 rescalAspectRatio(erf0 erf0Var, int i, erf0 erf0Var2) {
        return rescalAspectRatio(erf0Var, i, erf0Var2, true);
    }

    public static erf0 getDisplaySize(tow towVar, int i) {
        int i2;
        int i3;
        if (i != 90 && i != 270) {
            i3 = towVar.f175478e;
            i2 = towVar.f175480f;
        } else {
            i2 = towVar.f175478e;
            i3 = towVar.f175480f;
        }
        float f = towVar.f175510u;
        float f2 = (i3 * 1.0f) / f;
        float f3 = towVar.f175511v;
        float f4 = (i2 * 1.0f) / f3;
        if (f2 >= f4) {
            f2 = f4;
        }
        return new erf0((int) (f * f2), (int) (f3 * f2));
    }
}
