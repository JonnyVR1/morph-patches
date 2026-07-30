package com.idv.identity.base.algorithm.doc;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class Config {
    public String docType;
    public RectF faceROI;
    public float faceThreshold;
    public int flash;
    public int logLevel;
    public int pageNo;
    public float[] points;
    public String subType;
    public float docThreshold = 0.7f;
    public int stackTime = 500;
    public int thickness = 8;

    public float[] getPoints() {
        return this.points;
    }

    public void setPoints(float[] fArr) {
        this.points = fArr;
    }

    public String toString() {
        return "Config{docType='" + this.docType + "', subType='" + this.subType + "', pageNo=" + this.pageNo + ", docThreshold=" + this.docThreshold + ", faceThreshold=" + this.faceThreshold + ", logLevel=" + this.logLevel + ", thickness=" + this.thickness + ", flash=" + this.flash + ", stackTime=" + this.stackTime + ", points=" + Arrays.toString(this.points) + ", faceROI=" + this.faceROI + '}';
    }
}
