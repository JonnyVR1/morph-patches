package com.core.glcore.util;

import android.app.Activity;
import android.graphics.Rect;
import android.hardware.Camera;
import p149l.ulw;
import p149l.vif0;

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

    public static vif0 getDisplaySize(vif0 vif0Var, vif0 vif0Var2, int i) {
        int iM198561a;
        int iM198561a2;
        if (i == 90 || i == 270) {
            int iM198562b = vif0Var.m198562b();
            iM198561a = vif0Var.m198561a();
            iM198561a2 = iM198562b;
        } else {
            iM198561a = vif0Var.m198562b();
            iM198561a2 = vif0Var.m198561a();
        }
        float fM198562b = vif0Var2.m198562b();
        float f = (iM198561a * 1.0f) / fM198562b;
        float fM198561a = vif0Var2.m198561a();
        float f2 = (iM198561a2 * 1.0f) / fM198561a;
        if (f >= f2) {
            f = f2;
        }
        return new vif0((int) (fM198562b * f), (int) (fM198561a * f));
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

    public static vif0 reScaleSize(vif0 vif0Var, vif0 vif0Var2, int i) {
        if (i == 90 || i == 270) {
            vif0Var = new vif0(vif0Var.m198561a(), vif0Var.m198562b());
        }
        vif0 displaySize = getDisplaySize(vif0Var, vif0Var2, 0);
        return new vif0((displaySize.m198562b() >> 4) << 4, (displaySize.m198561a() >> 4) << 4);
    }

    public static vif0 rescalAspectRatio(vif0 vif0Var, int i, vif0 vif0Var2, boolean z) {
        if (i == 90 || i == 270) {
            vif0Var = new vif0(vif0Var.m198561a(), vif0Var.m198562b());
        }
        if (!z) {
            return getDisplaySize(vif0Var, vif0Var2, 0);
        }
        vif0 displaySize = getDisplaySize(vif0Var, vif0Var2, 0);
        return new vif0((displaySize.m198562b() >> 4) << 4, (displaySize.m198561a() >> 4) << 4);
    }

    public static vif0 rescalAspectRatioBoth(vif0 vif0Var, int i, vif0 vif0Var2, boolean z) {
        if (i == 90 || i == 270) {
            vif0 vif0Var3 = new vif0(vif0Var.m198561a(), vif0Var.m198562b());
            vif0Var2 = new vif0(vif0Var2.m198561a(), vif0Var2.m198562b());
            vif0Var = vif0Var3;
        }
        if (!z) {
            return getDisplaySize(vif0Var, vif0Var2, 0);
        }
        vif0 displaySize = getDisplaySize(vif0Var, vif0Var2, 0);
        return new vif0((displaySize.m198562b() >> 4) << 4, (displaySize.m198561a() >> 4) << 4);
    }

    public static vif0 rescalAspectRatio(vif0 vif0Var, int i, vif0 vif0Var2) {
        return rescalAspectRatio(vif0Var, i, vif0Var2, true);
    }

    public static vif0 getDisplaySize(ulw ulwVar, int i) {
        int i2;
        int i3;
        if (i != 90 && i != 270) {
            i3 = ulwVar.f177136e;
            i2 = ulwVar.f177138f;
        } else {
            i2 = ulwVar.f177136e;
            i3 = ulwVar.f177138f;
        }
        float f = ulwVar.f177168u;
        float f2 = (i3 * 1.0f) / f;
        float f3 = ulwVar.f177169v;
        float f4 = (i2 * 1.0f) / f3;
        if (f2 >= f4) {
            f2 = f4;
        }
        return new vif0((int) (f * f2), (int) (f3 * f2));
    }
}
