package org.seamless.util.math;

/* JADX INFO: loaded from: classes3.dex */
public class Point {

    /* JADX INFO: renamed from: x */
    private int f207131x;

    /* JADX INFO: renamed from: y */
    private int f207132y;

    public Point(int i, int i2) {
        this.f207131x = i;
        this.f207132y = i2;
    }

    public Point divide(double d) {
        int i = this.f207131x;
        int i2 = i != 0 ? (int) (((double) i) / d) : 0;
        int i3 = this.f207132y;
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
        return this.f207131x == point.f207131x && this.f207132y == point.f207132y;
    }

    public int getX() {
        return this.f207131x;
    }

    public int getY() {
        return this.f207132y;
    }

    public int hashCode() {
        return (this.f207131x * 31) + this.f207132y;
    }

    public Point multiply(double d) {
        int i = this.f207131x;
        int i2 = i != 0 ? (int) (((double) i) * d) : 0;
        int i3 = this.f207132y;
        return new Point(i2, i3 != 0 ? (int) (((double) i3) * d) : 0);
    }

    public String toString() {
        return "Point(" + this.f207131x + "/" + this.f207132y + ")";
    }
}
