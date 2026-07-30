package com.p074ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes11.dex */
public class Rectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x */
    public int f56491x;

    /* JADX INFO: renamed from: y */
    public int f56492y;

    public Rectangle(int i, int i2, int i3, int i4) {
        this.f56491x = i;
        this.f56492y = i2;
        this.width = i3;
        this.height = i4;
    }

    public String toString() {
        return "Rectangle{x=" + this.f56491x + ", y=" + this.f56492y + ", width=" + this.width + ", height=" + this.height + '}';
    }
}
