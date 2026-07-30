package com.momo.mcamera.mask.motioncamera;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes7.dex */
public class MotionCameraInterpolator implements Interpolator {
    private static final int ACCURACY = 4096;
    private final PointF mControlPoint1;
    private final PointF mControlPoint2;
    private int mLastI = 0;

    public MotionCameraInterpolator(float f, float f2, float f3, float f4) {
        PointF pointF = new PointF();
        this.mControlPoint1 = pointF;
        PointF pointF2 = new PointF();
        this.mControlPoint2 = pointF2;
        pointF.x = f;
        pointF.y = f2;
        pointF2.x = f3;
        pointF2.y = f4;
    }

    public static double cubicCurves(double d, double d2, double d3, double d4, double d5) {
        double d6 = 1.0d - d;
        double d7 = d * d;
        double d8 = d6 * d6;
        return (d8 * d6 * d2) + (d8 * 3.0d * d * d3) + (d6 * 3.0d * d7 * d4) + (d7 * d * d5);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f;
        for (int i = this.mLastI; i < 4096; i++) {
            f2 = (i * 1.0f) / 4096.0f;
            if (cubicCurves(f2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, this.mControlPoint1.x, this.mControlPoint2.x, 1.0d) >= f) {
                this.mLastI = i;
                break;
            }
        }
        double dCubicCurves = cubicCurves(f2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, this.mControlPoint1.y, this.mControlPoint2.y, 1.0d);
        if (dCubicCurves > 0.999d) {
            this.mLastI = 0;
            dCubicCurves = 1.0d;
        }
        return (float) dCubicCurves;
    }
}
