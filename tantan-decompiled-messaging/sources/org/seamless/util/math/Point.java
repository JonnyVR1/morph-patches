package org.seamless.util.math;

/* JADX INFO: loaded from: classes3.dex */
public class Point {

    /* JADX INFO: renamed from: x */
    private int f206209x;

    /* JADX INFO: renamed from: y */
    private int f206210y;

    public Point(int i, int i2) {
        this.f206209x = i;
        this.f206210y = i2;
    }

    public Point divide(double d) {
        int i = this.f206209x;
        int i2 = i != 0 ? (int) (((double) i) / d) : 0;
        int i3 = this.f206210y;
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
        return this.f206209x == point.f206209x && this.f206210y == point.f206210y;
    }

    public int getX() {
        return this.f206209x;
    }

    public int getY() {
        return this.f206210y;
    }

    public int hashCode() {
        return (this.f206209x * 31) + this.f206210y;
    }

    public Point multiply(double d) {
        int i = this.f206209x;
        int i2 = i != 0 ? (int) (((double) i) * d) : 0;
        int i3 = this.f206210y;
        return new Point(i2, i3 != 0 ? (int) (((double) i3) * d) : 0);
    }

    public String toString() {
        return "Point(" + this.f206209x + "/" + this.f206210y + ")";
    }
}
