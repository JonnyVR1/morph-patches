package com.momo.xeengine.sensor;

/* JADX INFO: loaded from: classes8.dex */
public class Vector4f {
    protected float[] points;

    public Vector4f(Vector3f vector3f, float f) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.points = fArr;
        fArr[0] = vector3f.m20302x();
        this.points[1] = vector3f.m20304y();
        this.points[2] = vector3f.m20306z();
        this.points[3] = f;
    }

    public void add(Vector3f vector3f, float f) {
        float[] fArr = this.points;
        fArr[0] = fArr[0] + vector3f.m20302x();
        float[] fArr2 = this.points;
        fArr2[1] = fArr2[1] + vector3f.m20304y();
        float[] fArr3 = this.points;
        fArr3[2] = fArr3[2] + vector3f.m20306z();
        float[] fArr4 = this.points;
        fArr4[3] = fArr4[3] + f;
    }

    public float[] array() {
        return this.points;
    }

    public boolean compareTo(Vector4f vector4f) {
        float[] fArr = this.points;
        float f = fArr[0];
        float[] fArr2 = vector4f.points;
        return f == fArr2[0] && fArr[1] == fArr2[1] && fArr[2] == fArr2[2] && fArr[3] == fArr2[3];
    }

    public void copyFromV3f(Vector3f vector3f, float f) {
        this.points[0] = vector3f.m20302x();
        this.points[1] = vector3f.m20304y();
        this.points[2] = vector3f.m20306z();
        this.points[3] = f;
    }

    public void copyVec4(Vector4f vector4f) {
        float[] fArr = this.points;
        float[] fArr2 = vector4f.points;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[3];
    }

    public float dotProduct(Vector4f vector4f) {
        float[] fArr = this.points;
        float f = fArr[0];
        float[] fArr2 = vector4f.points;
        return (f * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]) + (fArr[3] * fArr2[3]);
    }

    public float getW() {
        return this.points[3];
    }

    public float getX() {
        return this.points[0];
    }

    public float getY() {
        return this.points[1];
    }

    public float getZ() {
        return this.points[2];
    }

    public void lerp(Vector4f vector4f, Vector4f vector4f2, float f) {
        float[] fArr = vector4f2.points;
        float[] fArr2 = this.points;
        float f2 = 1.0f * f;
        float f3 = fArr2[0] * f2;
        float[] fArr3 = vector4f.points;
        fArr[0] = f3 + (fArr3[0] * f);
        fArr[1] = (fArr2[1] * f2) + (fArr3[1] * f);
        fArr[2] = (fArr2[2] * f2) + (fArr3[2] * f);
        fArr[3] = (fArr2[3] * f2) + (fArr3[3] * f);
    }

    public void multiplyByScalar(float f) {
        float[] fArr = this.points;
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
    }

    public void normalize() {
        float[] fArr = this.points;
        float f = fArr[3];
        if (f == 0.0f) {
            return;
        }
        float f2 = fArr[0] / f;
        fArr[0] = f2;
        float f3 = fArr[1] / f;
        fArr[1] = f3;
        float f4 = fArr[2] / f;
        fArr[2] = f4;
        double dSqrt = Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
        float[] fArr2 = this.points;
        fArr2[0] = (float) (((double) fArr2[0]) / dSqrt);
        fArr2[1] = (float) (((double) fArr2[1]) / dSqrt);
        fArr2[2] = (float) (((double) fArr2[2]) / dSqrt);
    }

    public void setW(float f) {
        this.points[3] = f;
    }

    public void setX(float f) {
        this.points[0] = f;
    }

    public void setXYZW(float f, float f2, float f3, float f4) {
        float[] fArr = this.points;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    public void setY(float f) {
        this.points[1] = f;
    }

    public void setZ(float f) {
        this.points[2] = f;
    }

    public void subdivide(Vector4f vector4f) {
        float[] fArr = this.points;
        float f = fArr[0];
        float[] fArr2 = vector4f.points;
        fArr[0] = f / fArr2[0];
        fArr[1] = fArr[1] / fArr2[1];
        fArr[2] = fArr[2] / fArr2[2];
        fArr[3] = fArr[3] / fArr2[3];
    }

    public void subtract(Vector4f vector4f) {
        float[] fArr = this.points;
        float f = fArr[0];
        float[] fArr2 = vector4f.points;
        fArr[0] = f - fArr2[0];
        fArr[1] = fArr[1] - fArr2[1];
        fArr[2] = fArr[2] - fArr2[2];
        fArr[3] = fArr[3] - fArr2[3];
    }

    public String toString() {
        return "X:" + this.points[0] + " Y:" + this.points[1] + " Z:" + this.points[2] + " W:" + this.points[3];
    }

    /* JADX INFO: renamed from: w */
    public float m20308w() {
        return this.points[3];
    }

    /* JADX INFO: renamed from: x */
    public float m20310x() {
        return this.points[0];
    }

    /* JADX INFO: renamed from: y */
    public float m20312y() {
        return this.points[1];
    }

    /* JADX INFO: renamed from: z */
    public float m20314z() {
        return this.points[2];
    }

    /* JADX INFO: renamed from: w */
    public void m20309w(float f) {
        this.points[3] = f;
    }

    /* JADX INFO: renamed from: x */
    public void m20311x(float f) {
        this.points[0] = f;
    }

    /* JADX INFO: renamed from: y */
    public void m20313y(float f) {
        this.points[1] = f;
    }

    /* JADX INFO: renamed from: z */
    public void m20315z(float f) {
        this.points[2] = f;
    }

    public void subtract(Vector4f vector4f, Vector4f vector4f2) {
        float[] fArr = this.points;
        float f = fArr[0];
        float[] fArr2 = vector4f.points;
        vector4f2.setXYZW(f - fArr2[0], fArr[1] - fArr2[1], fArr[2] - fArr2[2], fArr[3] - fArr2[3]);
    }

    public Vector4f() {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.points = fArr;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
    }

    public void add(Vector4f vector4f) {
        float[] fArr = this.points;
        float f = fArr[0];
        float[] fArr2 = vector4f.points;
        fArr[0] = f + fArr2[0];
        fArr[1] = fArr[1] + fArr2[1];
        fArr[2] = fArr[2] + fArr2[2];
        fArr[3] = fArr[3] + fArr2[3];
    }

    public Vector4f(float f, float f2, float f3, float f4) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.points = fArr;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }
}
