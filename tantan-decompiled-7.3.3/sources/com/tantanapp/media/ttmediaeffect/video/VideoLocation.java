package com.tantanapp.media.ttmediaeffect.video;

import com.immomo.velib.anim.model.Location;

/* JADX INFO: loaded from: classes12.dex */
public class VideoLocation {
    private String mAnchor;
    private float mWh;
    private float mWidth;

    /* JADX INFO: renamed from: mX */
    private float f57012mX;

    /* JADX INFO: renamed from: mY */
    private float f57013mY;

    public static Location toMomoLocation(VideoLocation videoLocation) {
        Location location = new Location();
        location.setAnchor(videoLocation.getAnchor());
        location.setWh(videoLocation.getWh());
        location.setWh(videoLocation.mWidth);
        location.setX(videoLocation.f57012mX);
        location.setY(videoLocation.f57013mY);
        return location;
    }

    public String getAnchor() {
        return this.mAnchor;
    }

    public float getWh() {
        return this.mWh;
    }

    public float getWidth() {
        return this.mWidth;
    }

    public float getX() {
        return this.f57012mX;
    }

    public float getY() {
        return this.f57013mY;
    }

    public void setAnchor(String str) {
        this.mAnchor = str;
    }

    public void setWh(float f) {
        this.mWh = f;
    }

    public void setWidth(float f) {
        this.mWidth = f;
    }

    public void setX(float f) {
        this.f57012mX = f;
    }

    public void setY(float f) {
        this.f57013mY = f;
    }
}
