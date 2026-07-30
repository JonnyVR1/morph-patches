package com.immomo.velib.anim.model;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ElementNewAnimation {
    private float alpha;
    private float degress;
    private long duration;
    private String interpolator;
    private List<PointSet> points;
    private float scale;
    private long startDelay;
    private float toAlpha;
    private float toDegress;
    private float toScale;
    private float toX;
    private float toY;
    private String type;

    /* JADX INFO: renamed from: x */
    private float f14133x;

    /* JADX INFO: renamed from: y */
    private float f14134y;

    public float getAlpha() {
        return this.alpha;
    }

    public float getDegress() {
        return this.degress;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getInterpolator() {
        return this.interpolator;
    }

    public List<PointSet> getPoints() {
        return this.points;
    }

    public float getScale() {
        return this.scale;
    }

    public long getStartDelay() {
        return this.startDelay;
    }

    public float getToAlpha() {
        return this.toAlpha;
    }

    public float getToDegress() {
        return this.toDegress;
    }

    public float getToScale() {
        return this.toScale;
    }

    public float getToX() {
        return this.toX;
    }

    public float getToY() {
        return this.toY;
    }

    public String getType() {
        return this.type;
    }

    public float getX() {
        return this.f14133x;
    }

    public float getY() {
        return this.f14134y;
    }

    public ElementNewAnimation setAlpha(float f) {
        this.alpha = f;
        return this;
    }

    public void setDegress(float f) {
        this.degress = f;
    }

    public ElementNewAnimation setDuration(long j) {
        this.duration = j;
        return this;
    }

    public void setInterpolator(String str) {
        this.interpolator = str;
    }

    public void setPoints(List<PointSet> list) {
        this.points = list;
    }

    public ElementNewAnimation setScale(float f) {
        this.scale = f;
        return this;
    }

    public ElementNewAnimation setStartDelay(long j) {
        this.startDelay = j;
        return this;
    }

    public ElementNewAnimation setToAlpha(float f) {
        this.toAlpha = f;
        return this;
    }

    public void setToDegress(float f) {
        this.toDegress = f;
    }

    public ElementNewAnimation setToScale(float f) {
        this.toScale = f;
        return this;
    }

    public ElementNewAnimation setToX(float f) {
        this.toX = f;
        return this;
    }

    public ElementNewAnimation setToY(float f) {
        this.toY = f;
        return this;
    }

    public ElementNewAnimation setType(String str) {
        this.type = str;
        return this;
    }

    public ElementNewAnimation setX(float f) {
        this.f14133x = f;
        return this;
    }

    public ElementNewAnimation setY(float f) {
        this.f14134y = f;
        return this;
    }
}
