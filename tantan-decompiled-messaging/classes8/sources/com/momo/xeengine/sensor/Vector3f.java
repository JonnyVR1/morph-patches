package com.momo.xeengine.sensor;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class Vector3f {
    protected float[] points;

    public Vector3f(Vector4f vector4f) {
        this.points = new float[3];
        float fM579w = vector4f.m579w();
        float[] fArr = this.points;
        if (fM579w != 0.0f) {
            fArr[0] = vector4f.m581x() / vector4f.m579w();
            this.points[1] = vector4f.m583y() / vector4f.m579w();
            this.points[2] = vector4f.m585z() / vector4f.m579w();
        } else {
            fArr[0] = vector4f.m581x();
            this.points[1] = vector4f.m583y();
            this.points[2] = vector4f.m585z();
        }
    }

    public void add(Vector3f vector3f) {
        float[] fArr = this.points;
        float f = fArr[0];
        float[] fArr2 = vector3f.points;
        fArr[0] = f + fArr2[0];
        fArr[1] = fArr[1] + fArr2[1];
        fArr[2] = fArr[2] + fArr2[2];
    }

    public void crossProduct(Vector3f vector3f, Vector3f vector3f2) {
        float[] fArr = this.points;
        float f = fArr[1];
        float[] fArr2 = vector3f.points;
        vector3f2.setX((f * fArr2[2]) - (fArr[2] * fArr2[1]));
        float[] fArr3 = this.points;
        float f2 = fArr3[2];
        float[] fArr4 = vector3f.points;
        vector3f2.setY((f2 * fArr4[0]) - (fArr3[0] * fArr4[2]));
        float[] fArr5 = this.points;
        float f3 = fArr5[0];
        float[] fArr6 = vector3f.points;
        vector3f2.setZ((f3 * fArr6[1]) - (fArr5[1] * fArr6[0]));
    }

    public float dotProduct(Vector3f vector3f) {
        float[] fArr = this.points;
        float f = fArr[0];
        float[] fArr2 = vector3f.points;
        return (f * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]);
    }

    public float getLength() {
        float[] fArr = this.points;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
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

    public void multiplyByScalar(float f) {
        float[] fArr = this.points;
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
    }

    public void normalize() {
        float[] fArr = this.points;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        double dSqrt = Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
        float[] fArr2 = this.points;
        fArr2[0] = (float) (((double) fArr2[0]) / dSqrt);
        fArr2[1] = (float) (((double) fArr2[1]) / dSqrt);
        fArr2[2] = (float) (((double) fArr2[2]) / dSqrt);
    }

    public void set(float[] fArr) {
        System.arraycopy(fArr, 0, this.points, 0, 3);
    }

    public void setX(float f) {
        this.points[0] = f;
    }

    public void setXYZ(float f, float f2, float f3) {
        float[] fArr = this.points;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    public void setY(float f) {
        this.points[1] = f;
    }

    public void setZ(float f) {
        this.points[2] = f;
    }

    public void subtract(Vector3f vector3f) {
        float[] fArr = this.points;
        float f = fArr[0];
        float[] fArr2 = vector3f.points;
        fArr[0] = f - fArr2[0];
        fArr[1] = fArr[1] - fArr2[1];
        fArr[2] = fArr[2] - fArr2[2];
    }

    public float[] toArray() {
        return this.points;
    }

    public String toString() {
        return "X:" + this.points[0] + " Y:" + this.points[1] + " Z:" + this.points[2];
    }

    /* JADX INFO: renamed from: x */
    public float m573x() {
        return this.points[0];
    }

    /* JADX INFO: renamed from: y */
    public float m575y() {
        return this.points[1];
    }

    /* JADX INFO: renamed from: z */
    public float m577z() {
        return this.points[2];
    }

    /* JADX INFO: renamed from: x */
    public void m574x(float f) {
        this.points[0] = f;
    }

    /* JADX INFO: renamed from: y */
    public void m576y(float f) {
        this.points[1] = f;
    }

    /* JADX INFO: renamed from: z */
    public void m578z(float f) {
        this.points[2] = f;
    }

    public void set(Vector3f vector3f) {
        set(vector3f.points);
    }

    public void add(float f) {
        float[] fArr = this.points;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + f;
        fArr[2] = fArr[2] + f;
    }

    public Vector3f(float f) {
        this.points = new float[]{f, f, f};
    }

    public Vector3f() {
        this.points = new float[3];
    }

    public Vector3f(Vector3f vector3f) {
        this.points = new float[]{fArr[0], fArr[1], fArr[2]};
        float[] fArr = vector3f.points;
    }

    public Vector3f(float f, float f2, float f3) {
        this.points = new float[]{f, f2, f3};
    }
}
