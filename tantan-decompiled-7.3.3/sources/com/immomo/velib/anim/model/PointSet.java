package com.immomo.velib.anim.model;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class PointSet {
    private String interpolator;
    private List<Float> point;

    public String getInterpolator() {
        return this.interpolator;
    }

    public List<Float> getPoint() {
        return this.point;
    }

    public void setInterpolator(String str) {
        this.interpolator = str;
    }

    public void setPoint(List<Float> list) {
        this.point = list;
    }
}
