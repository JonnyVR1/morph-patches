package org.seamless.util.math;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Point {

    /* JADX INFO: renamed from: x */
    private int f9834x;

    /* JADX INFO: renamed from: y */
    private int f9835y;

    public Point(int i, int i2) {
        this.f9834x = i;
        this.f9835y = i2;
    }

    public Point divide(double d) {
        int i = this.f9834x;
        int i2 = i != 0 ? (int) (((double) i) / d) : 0;
        int i3 = this.f9835y;
        return new Point(i2, i3 != 0 ? (int) (((double) i3) / d) : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return this.f9834x == point.f9834x && this.f9835y == point.f9835y;
    }

    public int getX() {
        return this.f9834x;
    }

    public int getY() {
        return this.f9835y;
    }

    public int hashCode() {
        return (this.f9834x * 31) + this.f9835y;
    }

    public Point multiply(double d) {
        int i = this.f9834x;
        int i2 = i != 0 ? (int) (((double) i) * d) : 0;
        int i3 = this.f9835y;
        return new Point(i2, i3 != 0 ? (int) (((double) i3) * d) : 0);
    }

    public String toString() {
        return "Point(" + this.f9834x + "/" + this.f9835y + ")";
    }
}
