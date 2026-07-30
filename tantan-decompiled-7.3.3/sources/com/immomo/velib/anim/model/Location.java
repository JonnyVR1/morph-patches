package com.immomo.velib.anim.model;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class Location {
    private String anchor;

    /* JADX INFO: renamed from: wh */
    private float f14854wh;
    private float width;

    /* JADX INFO: renamed from: x */
    private float f14855x;

    /* JADX INFO: renamed from: y */
    private float f14856y;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Location location = (Location) obj;
            if (Float.compare(location.f14855x, this.f14855x) == 0 && Float.compare(location.f14856y, this.f14856y) == 0 && Float.compare(location.width, this.width) == 0 && Float.compare(location.f14854wh, this.f14854wh) == 0 && Objects.equals(this.anchor, location.anchor)) {
                return true;
            }
        }
        return false;
    }

    public String getAnchor() {
        return this.anchor;
    }

    public float getWh() {
        return this.f14854wh;
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.f14855x;
    }

    public float getY() {
        return this.f14856y;
    }

    public int hashCode() {
        return Objects.hash(this.anchor, Float.valueOf(this.f14855x), Float.valueOf(this.f14856y), Float.valueOf(this.width), Float.valueOf(this.f14854wh));
    }

    public void setAnchor(String str) {
        this.anchor = str;
    }

    public void setWh(float f) {
        this.f14854wh = f;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public void setX(float f) {
        this.f14855x = f;
    }

    public void setY(float f) {
        this.f14856y = f;
    }
}
