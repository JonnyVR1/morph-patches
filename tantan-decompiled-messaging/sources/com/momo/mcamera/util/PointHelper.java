package com.momo.mcamera.util;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes7.dex */
public class PointHelper {
    public static PointF getCenterPoint(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        float f2 = f + ((pointF2.x - f) / 2.0f);
        float f3 = pointF.y;
        return new PointF(f2, f3 + ((pointF2.y - f3) / 2.0f));
    }

    public static double getmDistancePoint(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return Math.sqrt((f * f) + (f2 * f2));
    }

    public static void rotatePoint(PointF pointF, float f) {
        double d = (float) (((double) f) * 0.017453292519943295d);
        double dCos = Math.cos(d);
        double dSin = Math.sin(d);
        double d2 = pointF.x;
        double d3 = pointF.y;
        pointF.x = (float) ((d2 * dCos) - (d3 * dSin));
        pointF.y = (float) ((d2 * dSin) + (d3 * dCos));
    }
}
