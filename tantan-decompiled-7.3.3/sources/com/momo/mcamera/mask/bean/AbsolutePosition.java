package com.momo.mcamera.mask.bean;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class AbsolutePosition {

    @SerializedName("center")
    private ObjectRegion center;

    @SerializedName("viewport")
    private ViewPortProportion viewport;

    public ObjectRegion getCenter() {
        return this.center;
    }

    public ViewPortProportion getViewport() {
        return this.viewport;
    }

    public void setCenter(ObjectRegion objectRegion) {
        this.center = objectRegion;
    }

    public void setViewport(ViewPortProportion viewPortProportion) {
        this.viewport = viewPortProportion;
    }
}
