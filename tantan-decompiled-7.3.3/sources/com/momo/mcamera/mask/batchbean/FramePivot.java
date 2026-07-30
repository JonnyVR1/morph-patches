package com.momo.mcamera.mask.batchbean;

import com.google.gson.annotations.SerializedName;
import com.immomo.momomediaext.sei.BaseSei;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class FramePivot implements Serializable {

    @SerializedName(BaseSei.f14624X)
    private int pivotX;

    @SerializedName(BaseSei.f14625Y)
    private int pivotY;

    public int getPivotX() {
        return this.pivotX;
    }

    public int getPivotY() {
        return this.pivotY;
    }

    public void setPivotX(int i) {
        this.pivotX = i;
    }

    public void setPivotY(int i) {
        this.pivotY = i;
    }
}
