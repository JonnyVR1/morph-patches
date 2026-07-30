package com.immomo.moment.mediautils.cmds;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class VideoCut implements Serializable {
    private float centerx;
    private float centery;
    private long end;
    private String media;
    private boolean reverse;
    private long rotation;
    private float scalex;
    private float scaley;
    private long start;

    public VideoCut(String str, long j, long j2) {
        this.media = str;
        this.start = j;
        this.end = j2;
        this.centerx = 0.5f;
        this.centery = 0.5f;
        this.scalex = 1.0f;
        this.scaley = 1.0f;
        this.rotation = 0L;
        this.reverse = false;
    }

    public float getCenterx() {
        return this.centerx;
    }

    public float getCentery() {
        return this.centery;
    }

    public long getEnd() {
        return this.end;
    }

    public String getMedia() {
        return this.media;
    }

    public long getRotation() {
        return this.rotation;
    }

    public float getScalex() {
        return this.scalex;
    }

    public float getScaley() {
        return this.scaley;
    }

    public long getStart() {
        return this.start;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setCenterx(float f) {
        this.centerx = f;
    }

    public void setCentery(float f) {
        this.centery = f;
    }

    public void setEnd(long j) {
        this.end = j;
    }

    public void setMedia(String str) {
        this.media = str;
    }

    public void setReverse(boolean z) {
        this.reverse = z;
    }

    public void setRotation(long j) {
        this.rotation = j;
    }

    public void setScalex(float f) {
        this.scalex = f;
    }

    public void setScaley(float f) {
        this.scaley = f;
    }

    public void setStart(long j) {
        this.start = j;
    }

    public VideoCut() {
    }

    public VideoCut(String str, long j, long j2, boolean z) {
        this.media = str;
        this.start = j;
        this.end = j2;
        this.centerx = 0.5f;
        this.centery = 0.5f;
        this.scalex = 1.0f;
        this.scaley = 1.0f;
        this.rotation = 0L;
        this.reverse = z;
    }

    public VideoCut(String str, long j, long j2, float f, float f2, float f3, float f4, long j3) {
        this.media = str;
        this.start = j;
        this.end = j2;
        this.centerx = f;
        this.centery = f2;
        this.scalex = f3;
        this.scaley = f4;
        this.rotation = j3;
        this.reverse = false;
    }
}
