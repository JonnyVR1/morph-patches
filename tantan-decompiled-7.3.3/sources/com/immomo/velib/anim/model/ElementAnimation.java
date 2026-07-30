package com.immomo.velib.anim.model;

/* JADX INFO: loaded from: classes7.dex */
public class ElementAnimation {
    private float alpha;
    private String interpolator;
    private float scale;
    private int time;

    /* JADX INFO: renamed from: x */
    private float f14850x;

    /* JADX INFO: renamed from: y */
    private float f14851y;

    public float getAlpha() {
        return this.alpha;
    }

    public String getInterpolator() {
        return this.interpolator;
    }

    public float getScale() {
        return this.scale;
    }

    public int getTime() {
        return this.time;
    }

    public float getX() {
        return this.f14850x;
    }

    public float getY() {
        return this.f14851y;
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    public ElementAnimation setInterpolator(String str) {
        this.interpolator = str;
        return this;
    }

    public void setScale(float f) {
        this.scale = f;
    }

    public void setTime(int i) {
        this.time = i;
    }

    public void setX(float f) {
        this.f14850x = f;
    }

    public void setY(float f) {
        this.f14851y = f;
    }
}
